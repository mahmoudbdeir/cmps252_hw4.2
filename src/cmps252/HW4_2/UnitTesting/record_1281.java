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

@Tag("45")
class Record_1281 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1281: FirstName is Faith")
	void FirstNameOfRecord1281() {
		assertEquals("Faith", customers.get(1280).getFirstName());
	}

	@Test
	@DisplayName("Record 1281: LastName is Cervoni")
	void LastNameOfRecord1281() {
		assertEquals("Cervoni", customers.get(1280).getLastName());
	}

	@Test
	@DisplayName("Record 1281: Company is Carty, Michael A Esq")
	void CompanyOfRecord1281() {
		assertEquals("Carty, Michael A Esq", customers.get(1280).getCompany());
	}

	@Test
	@DisplayName("Record 1281: Address is 24 Everitt Rd")
	void AddressOfRecord1281() {
		assertEquals("24 Everitt Rd", customers.get(1280).getAddress());
	}

	@Test
	@DisplayName("Record 1281: City is Ringoes")
	void CityOfRecord1281() {
		assertEquals("Ringoes", customers.get(1280).getCity());
	}

	@Test
	@DisplayName("Record 1281: County is Hunterdon")
	void CountyOfRecord1281() {
		assertEquals("Hunterdon", customers.get(1280).getCounty());
	}

	@Test
	@DisplayName("Record 1281: State is NJ")
	void StateOfRecord1281() {
		assertEquals("NJ", customers.get(1280).getState());
	}

	@Test
	@DisplayName("Record 1281: ZIP is 8551")
	void ZIPOfRecord1281() {
		assertEquals("8551", customers.get(1280).getZIP());
	}

	@Test
	@DisplayName("Record 1281: Phone is 908-788-6352")
	void PhoneOfRecord1281() {
		assertEquals("908-788-6352", customers.get(1280).getPhone());
	}

	@Test
	@DisplayName("Record 1281: Fax is 908-788-6936")
	void FaxOfRecord1281() {
		assertEquals("908-788-6936", customers.get(1280).getFax());
	}

	@Test
	@DisplayName("Record 1281: Email is faith@cervoni.com")
	void EmailOfRecord1281() {
		assertEquals("faith@cervoni.com", customers.get(1280).getEmail());
	}

	@Test
	@DisplayName("Record 1281: Web is http://www.faithcervoni.com")
	void WebOfRecord1281() {
		assertEquals("http://www.faithcervoni.com", customers.get(1280).getWeb());
	}
}
