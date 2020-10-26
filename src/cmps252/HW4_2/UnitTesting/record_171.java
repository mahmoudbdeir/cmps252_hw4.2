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

@Tag("29")
class Record_171 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 171: FirstName is Sheldon")
	void FirstNameOfRecord171() {
		assertEquals("Sheldon", customers.get(170).getFirstName());
	}

	@Test
	@DisplayName("Record 171: LastName is Balchunas")
	void LastNameOfRecord171() {
		assertEquals("Balchunas", customers.get(170).getLastName());
	}

	@Test
	@DisplayName("Record 171: Company is Black Ram")
	void CompanyOfRecord171() {
		assertEquals("Black Ram", customers.get(170).getCompany());
	}

	@Test
	@DisplayName("Record 171: Address is 22632 Normandie Ave")
	void AddressOfRecord171() {
		assertEquals("22632 Normandie Ave", customers.get(170).getAddress());
	}

	@Test
	@DisplayName("Record 171: City is Torrance")
	void CityOfRecord171() {
		assertEquals("Torrance", customers.get(170).getCity());
	}

	@Test
	@DisplayName("Record 171: County is Los Angeles")
	void CountyOfRecord171() {
		assertEquals("Los Angeles", customers.get(170).getCounty());
	}

	@Test
	@DisplayName("Record 171: State is CA")
	void StateOfRecord171() {
		assertEquals("CA", customers.get(170).getState());
	}

	@Test
	@DisplayName("Record 171: ZIP is 90502")
	void ZIPOfRecord171() {
		assertEquals("90502", customers.get(170).getZIP());
	}

	@Test
	@DisplayName("Record 171: Phone is 310-212-9115")
	void PhoneOfRecord171() {
		assertEquals("310-212-9115", customers.get(170).getPhone());
	}

	@Test
	@DisplayName("Record 171: Fax is 310-212-4489")
	void FaxOfRecord171() {
		assertEquals("310-212-4489", customers.get(170).getFax());
	}

	@Test
	@DisplayName("Record 171: Email is sheldon@balchunas.com")
	void EmailOfRecord171() {
		assertEquals("sheldon@balchunas.com", customers.get(170).getEmail());
	}

	@Test
	@DisplayName("Record 171: Web is http://www.sheldonbalchunas.com")
	void WebOfRecord171() {
		assertEquals("http://www.sheldonbalchunas.com", customers.get(170).getWeb());
	}
}
