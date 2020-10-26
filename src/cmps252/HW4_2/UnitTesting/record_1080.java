package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("46")
class Record_1080 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1080: FirstName is Lesa")
	void FirstNameOfRecord1080() {
		assertEquals("Lesa", customers.get(1079).getFirstName());
	}

	@Test
	@DisplayName("Record 1080: LastName is Mccaffrey")
	void LastNameOfRecord1080() {
		assertEquals("Mccaffrey", customers.get(1079).getLastName());
	}

	@Test
	@DisplayName("Record 1080: Company is Country Clubs Fms Desserts Inc")
	void CompanyOfRecord1080() {
		assertEquals("Country Clubs Fms Desserts Inc", customers.get(1079).getCompany());
	}

	@Test
	@DisplayName("Record 1080: Address is 30 5th St E  #-204")
	void AddressOfRecord1080() {
		assertEquals("30 5th St E  #-204", customers.get(1079).getAddress());
	}

	@Test
	@DisplayName("Record 1080: City is Kalispell")
	void CityOfRecord1080() {
		assertEquals("Kalispell", customers.get(1079).getCity());
	}

	@Test
	@DisplayName("Record 1080: County is Flathead")
	void CountyOfRecord1080() {
		assertEquals("Flathead", customers.get(1079).getCounty());
	}

	@Test
	@DisplayName("Record 1080: State is MT")
	void StateOfRecord1080() {
		assertEquals("MT", customers.get(1079).getState());
	}

	@Test
	@DisplayName("Record 1080: ZIP is 59901")
	void ZIPOfRecord1080() {
		assertEquals("59901", customers.get(1079).getZIP());
	}

	@Test
	@DisplayName("Record 1080: Phone is 406-752-7438")
	void PhoneOfRecord1080() {
		assertEquals("406-752-7438", customers.get(1079).getPhone());
	}

	@Test
	@DisplayName("Record 1080: Fax is 406-752-9695")
	void FaxOfRecord1080() {
		assertEquals("406-752-9695", customers.get(1079).getFax());
	}

	@Test
	@DisplayName("Record 1080: Email is lesa@mccaffrey.com")
	void EmailOfRecord1080() {
		assertEquals("lesa@mccaffrey.com", customers.get(1079).getEmail());
	}

	@Test
	@DisplayName("Record 1080: Web is http://www.lesamccaffrey.com")
	void WebOfRecord1080() {
		assertEquals("http://www.lesamccaffrey.com", customers.get(1079).getWeb());
	}
}
