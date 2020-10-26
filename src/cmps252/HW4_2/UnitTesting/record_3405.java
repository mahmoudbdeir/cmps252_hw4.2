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

@Tag("23")
class Record_3405 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3405: FirstName is Noelle")
	void FirstNameOfRecord3405() {
		assertEquals("Noelle", customers.get(3404).getFirstName());
	}

	@Test
	@DisplayName("Record 3405: LastName is Taney")
	void LastNameOfRecord3405() {
		assertEquals("Taney", customers.get(3404).getLastName());
	}

	@Test
	@DisplayName("Record 3405: Company is Creative Bath Prods Inc")
	void CompanyOfRecord3405() {
		assertEquals("Creative Bath Prods Inc", customers.get(3404).getCompany());
	}

	@Test
	@DisplayName("Record 3405: Address is 1507 1st Ave W  #-a")
	void AddressOfRecord3405() {
		assertEquals("1507 1st Ave W  #-a", customers.get(3404).getAddress());
	}

	@Test
	@DisplayName("Record 3405: City is Kalispell")
	void CityOfRecord3405() {
		assertEquals("Kalispell", customers.get(3404).getCity());
	}

	@Test
	@DisplayName("Record 3405: County is Flathead")
	void CountyOfRecord3405() {
		assertEquals("Flathead", customers.get(3404).getCounty());
	}

	@Test
	@DisplayName("Record 3405: State is MT")
	void StateOfRecord3405() {
		assertEquals("MT", customers.get(3404).getState());
	}

	@Test
	@DisplayName("Record 3405: ZIP is 59901")
	void ZIPOfRecord3405() {
		assertEquals("59901", customers.get(3404).getZIP());
	}

	@Test
	@DisplayName("Record 3405: Phone is 406-257-7484")
	void PhoneOfRecord3405() {
		assertEquals("406-257-7484", customers.get(3404).getPhone());
	}

	@Test
	@DisplayName("Record 3405: Fax is 406-257-8957")
	void FaxOfRecord3405() {
		assertEquals("406-257-8957", customers.get(3404).getFax());
	}

	@Test
	@DisplayName("Record 3405: Email is noelle@taney.com")
	void EmailOfRecord3405() {
		assertEquals("noelle@taney.com", customers.get(3404).getEmail());
	}

	@Test
	@DisplayName("Record 3405: Web is http://www.noelletaney.com")
	void WebOfRecord3405() {
		assertEquals("http://www.noelletaney.com", customers.get(3404).getWeb());
	}
}
