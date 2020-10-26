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
class Record_239 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 239: FirstName is Christie")
	void FirstNameOfRecord239() {
		assertEquals("Christie", customers.get(238).getFirstName());
	}

	@Test
	@DisplayName("Record 239: LastName is Hiske")
	void LastNameOfRecord239() {
		assertEquals("Hiske", customers.get(238).getLastName());
	}

	@Test
	@DisplayName("Record 239: Company is Regency Travel")
	void CompanyOfRecord239() {
		assertEquals("Regency Travel", customers.get(238).getCompany());
	}

	@Test
	@DisplayName("Record 239: Address is 404 E Evelyn Ave")
	void AddressOfRecord239() {
		assertEquals("404 E Evelyn Ave", customers.get(238).getAddress());
	}

	@Test
	@DisplayName("Record 239: City is Sunnyvale")
	void CityOfRecord239() {
		assertEquals("Sunnyvale", customers.get(238).getCity());
	}

	@Test
	@DisplayName("Record 239: County is Santa Clara")
	void CountyOfRecord239() {
		assertEquals("Santa Clara", customers.get(238).getCounty());
	}

	@Test
	@DisplayName("Record 239: State is CA")
	void StateOfRecord239() {
		assertEquals("CA", customers.get(238).getState());
	}

	@Test
	@DisplayName("Record 239: ZIP is 94086")
	void ZIPOfRecord239() {
		assertEquals("94086", customers.get(238).getZIP());
	}

	@Test
	@DisplayName("Record 239: Phone is 408-746-1336")
	void PhoneOfRecord239() {
		assertEquals("408-746-1336", customers.get(238).getPhone());
	}

	@Test
	@DisplayName("Record 239: Fax is 408-746-5202")
	void FaxOfRecord239() {
		assertEquals("408-746-5202", customers.get(238).getFax());
	}

	@Test
	@DisplayName("Record 239: Email is christie@hiske.com")
	void EmailOfRecord239() {
		assertEquals("christie@hiske.com", customers.get(238).getEmail());
	}

	@Test
	@DisplayName("Record 239: Web is http://www.christiehiske.com")
	void WebOfRecord239() {
		assertEquals("http://www.christiehiske.com", customers.get(238).getWeb());
	}
}
