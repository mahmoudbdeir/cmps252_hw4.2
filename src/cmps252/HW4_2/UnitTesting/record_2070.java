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

@Tag("32")
class Record_2070 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2070: FirstName is Cameron")
	void FirstNameOfRecord2070() {
		assertEquals("Cameron", customers.get(2069).getFirstName());
	}

	@Test
	@DisplayName("Record 2070: LastName is Merales")
	void LastNameOfRecord2070() {
		assertEquals("Merales", customers.get(2069).getLastName());
	}

	@Test
	@DisplayName("Record 2070: Company is Human Growth Foundation Inc")
	void CompanyOfRecord2070() {
		assertEquals("Human Growth Foundation Inc", customers.get(2069).getCompany());
	}

	@Test
	@DisplayName("Record 2070: Address is 7350 Us Highway 50")
	void AddressOfRecord2070() {
		assertEquals("7350 Us Highway 50", customers.get(2069).getAddress());
	}

	@Test
	@DisplayName("Record 2070: City is Lamar")
	void CityOfRecord2070() {
		assertEquals("Lamar", customers.get(2069).getCity());
	}

	@Test
	@DisplayName("Record 2070: County is Prowers")
	void CountyOfRecord2070() {
		assertEquals("Prowers", customers.get(2069).getCounty());
	}

	@Test
	@DisplayName("Record 2070: State is CO")
	void StateOfRecord2070() {
		assertEquals("CO", customers.get(2069).getState());
	}

	@Test
	@DisplayName("Record 2070: ZIP is 81052")
	void ZIPOfRecord2070() {
		assertEquals("81052", customers.get(2069).getZIP());
	}

	@Test
	@DisplayName("Record 2070: Phone is 719-336-8783")
	void PhoneOfRecord2070() {
		assertEquals("719-336-8783", customers.get(2069).getPhone());
	}

	@Test
	@DisplayName("Record 2070: Fax is 719-336-3428")
	void FaxOfRecord2070() {
		assertEquals("719-336-3428", customers.get(2069).getFax());
	}

	@Test
	@DisplayName("Record 2070: Email is cameron@merales.com")
	void EmailOfRecord2070() {
		assertEquals("cameron@merales.com", customers.get(2069).getEmail());
	}

	@Test
	@DisplayName("Record 2070: Web is http://www.cameronmerales.com")
	void WebOfRecord2070() {
		assertEquals("http://www.cameronmerales.com", customers.get(2069).getWeb());
	}
}
