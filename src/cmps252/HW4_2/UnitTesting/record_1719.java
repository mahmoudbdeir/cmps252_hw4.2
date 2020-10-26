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

@Tag("12")
class Record_1719 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1719: FirstName is Juana")
	void FirstNameOfRecord1719() {
		assertEquals("Juana", customers.get(1718).getFirstName());
	}

	@Test
	@DisplayName("Record 1719: LastName is Risen")
	void LastNameOfRecord1719() {
		assertEquals("Risen", customers.get(1718).getLastName());
	}

	@Test
	@DisplayName("Record 1719: Company is Burton, G Sharff Pa")
	void CompanyOfRecord1719() {
		assertEquals("Burton, G Sharff Pa", customers.get(1718).getCompany());
	}

	@Test
	@DisplayName("Record 1719: Address is 2525 Irving Blvd")
	void AddressOfRecord1719() {
		assertEquals("2525 Irving Blvd", customers.get(1718).getAddress());
	}

	@Test
	@DisplayName("Record 1719: City is Dallas")
	void CityOfRecord1719() {
		assertEquals("Dallas", customers.get(1718).getCity());
	}

	@Test
	@DisplayName("Record 1719: County is Dallas")
	void CountyOfRecord1719() {
		assertEquals("Dallas", customers.get(1718).getCounty());
	}

	@Test
	@DisplayName("Record 1719: State is TX")
	void StateOfRecord1719() {
		assertEquals("TX", customers.get(1718).getState());
	}

	@Test
	@DisplayName("Record 1719: ZIP is 75207")
	void ZIPOfRecord1719() {
		assertEquals("75207", customers.get(1718).getZIP());
	}

	@Test
	@DisplayName("Record 1719: Phone is 214-638-5020")
	void PhoneOfRecord1719() {
		assertEquals("214-638-5020", customers.get(1718).getPhone());
	}

	@Test
	@DisplayName("Record 1719: Fax is 214-638-6648")
	void FaxOfRecord1719() {
		assertEquals("214-638-6648", customers.get(1718).getFax());
	}

	@Test
	@DisplayName("Record 1719: Email is juana@risen.com")
	void EmailOfRecord1719() {
		assertEquals("juana@risen.com", customers.get(1718).getEmail());
	}

	@Test
	@DisplayName("Record 1719: Web is http://www.juanarisen.com")
	void WebOfRecord1719() {
		assertEquals("http://www.juanarisen.com", customers.get(1718).getWeb());
	}
}
