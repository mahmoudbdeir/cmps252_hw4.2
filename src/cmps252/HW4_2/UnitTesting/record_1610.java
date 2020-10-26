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

@Tag("44")
class Record_1610 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1610: FirstName is Brittney")
	void FirstNameOfRecord1610() {
		assertEquals("Brittney", customers.get(1609).getFirstName());
	}

	@Test
	@DisplayName("Record 1610: LastName is Wollmuth")
	void LastNameOfRecord1610() {
		assertEquals("Wollmuth", customers.get(1609).getLastName());
	}

	@Test
	@DisplayName("Record 1610: Company is Najarian & Associates Inc")
	void CompanyOfRecord1610() {
		assertEquals("Najarian & Associates Inc", customers.get(1609).getCompany());
	}

	@Test
	@DisplayName("Record 1610: Address is 1118 Fort Street Mall")
	void AddressOfRecord1610() {
		assertEquals("1118 Fort Street Mall", customers.get(1609).getAddress());
	}

	@Test
	@DisplayName("Record 1610: City is Honolulu")
	void CityOfRecord1610() {
		assertEquals("Honolulu", customers.get(1609).getCity());
	}

	@Test
	@DisplayName("Record 1610: County is Honolulu")
	void CountyOfRecord1610() {
		assertEquals("Honolulu", customers.get(1609).getCounty());
	}

	@Test
	@DisplayName("Record 1610: State is HI")
	void StateOfRecord1610() {
		assertEquals("HI", customers.get(1609).getState());
	}

	@Test
	@DisplayName("Record 1610: ZIP is 96813")
	void ZIPOfRecord1610() {
		assertEquals("96813", customers.get(1609).getZIP());
	}

	@Test
	@DisplayName("Record 1610: Phone is 808-531-0630")
	void PhoneOfRecord1610() {
		assertEquals("808-531-0630", customers.get(1609).getPhone());
	}

	@Test
	@DisplayName("Record 1610: Fax is 808-531-7802")
	void FaxOfRecord1610() {
		assertEquals("808-531-7802", customers.get(1609).getFax());
	}

	@Test
	@DisplayName("Record 1610: Email is brittney@wollmuth.com")
	void EmailOfRecord1610() {
		assertEquals("brittney@wollmuth.com", customers.get(1609).getEmail());
	}

	@Test
	@DisplayName("Record 1610: Web is http://www.brittneywollmuth.com")
	void WebOfRecord1610() {
		assertEquals("http://www.brittneywollmuth.com", customers.get(1609).getWeb());
	}
}
