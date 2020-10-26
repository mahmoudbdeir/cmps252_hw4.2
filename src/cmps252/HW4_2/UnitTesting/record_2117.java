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

@Tag("0")
class Record_2117 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2117: FirstName is Elda")
	void FirstNameOfRecord2117() {
		assertEquals("Elda", customers.get(2116).getFirstName());
	}

	@Test
	@DisplayName("Record 2117: LastName is Chretien")
	void LastNameOfRecord2117() {
		assertEquals("Chretien", customers.get(2116).getLastName());
	}

	@Test
	@DisplayName("Record 2117: Company is Alembic Computer Services Inc")
	void CompanyOfRecord2117() {
		assertEquals("Alembic Computer Services Inc", customers.get(2116).getCompany());
	}

	@Test
	@DisplayName("Record 2117: Address is 1504 Atlantic Ave")
	void AddressOfRecord2117() {
		assertEquals("1504 Atlantic Ave", customers.get(2116).getAddress());
	}

	@Test
	@DisplayName("Record 2117: City is Brooklyn")
	void CityOfRecord2117() {
		assertEquals("Brooklyn", customers.get(2116).getCity());
	}

	@Test
	@DisplayName("Record 2117: County is Kings")
	void CountyOfRecord2117() {
		assertEquals("Kings", customers.get(2116).getCounty());
	}

	@Test
	@DisplayName("Record 2117: State is NY")
	void StateOfRecord2117() {
		assertEquals("NY", customers.get(2116).getState());
	}

	@Test
	@DisplayName("Record 2117: ZIP is 11216")
	void ZIPOfRecord2117() {
		assertEquals("11216", customers.get(2116).getZIP());
	}

	@Test
	@DisplayName("Record 2117: Phone is 718-467-7605")
	void PhoneOfRecord2117() {
		assertEquals("718-467-7605", customers.get(2116).getPhone());
	}

	@Test
	@DisplayName("Record 2117: Fax is 718-467-5292")
	void FaxOfRecord2117() {
		assertEquals("718-467-5292", customers.get(2116).getFax());
	}

	@Test
	@DisplayName("Record 2117: Email is elda@chretien.com")
	void EmailOfRecord2117() {
		assertEquals("elda@chretien.com", customers.get(2116).getEmail());
	}

	@Test
	@DisplayName("Record 2117: Web is http://www.eldachretien.com")
	void WebOfRecord2117() {
		assertEquals("http://www.eldachretien.com", customers.get(2116).getWeb());
	}
}
