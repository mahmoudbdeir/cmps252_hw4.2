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

@Tag("4")
class Record_1521 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1521: FirstName is Terrence")
	void FirstNameOfRecord1521() {
		assertEquals("Terrence", customers.get(1520).getFirstName());
	}

	@Test
	@DisplayName("Record 1521: LastName is Switalski")
	void LastNameOfRecord1521() {
		assertEquals("Switalski", customers.get(1520).getLastName());
	}

	@Test
	@DisplayName("Record 1521: Company is James A Power")
	void CompanyOfRecord1521() {
		assertEquals("James A Power", customers.get(1520).getCompany());
	}

	@Test
	@DisplayName("Record 1521: Address is 2744 Atlantic Ave")
	void AddressOfRecord1521() {
		assertEquals("2744 Atlantic Ave", customers.get(1520).getAddress());
	}

	@Test
	@DisplayName("Record 1521: City is Brooklyn")
	void CityOfRecord1521() {
		assertEquals("Brooklyn", customers.get(1520).getCity());
	}

	@Test
	@DisplayName("Record 1521: County is Kings")
	void CountyOfRecord1521() {
		assertEquals("Kings", customers.get(1520).getCounty());
	}

	@Test
	@DisplayName("Record 1521: State is NY")
	void StateOfRecord1521() {
		assertEquals("NY", customers.get(1520).getState());
	}

	@Test
	@DisplayName("Record 1521: ZIP is 11207")
	void ZIPOfRecord1521() {
		assertEquals("11207", customers.get(1520).getZIP());
	}

	@Test
	@DisplayName("Record 1521: Phone is 718-647-3933")
	void PhoneOfRecord1521() {
		assertEquals("718-647-3933", customers.get(1520).getPhone());
	}

	@Test
	@DisplayName("Record 1521: Fax is 718-647-5847")
	void FaxOfRecord1521() {
		assertEquals("718-647-5847", customers.get(1520).getFax());
	}

	@Test
	@DisplayName("Record 1521: Email is terrence@switalski.com")
	void EmailOfRecord1521() {
		assertEquals("terrence@switalski.com", customers.get(1520).getEmail());
	}

	@Test
	@DisplayName("Record 1521: Web is http://www.terrenceswitalski.com")
	void WebOfRecord1521() {
		assertEquals("http://www.terrenceswitalski.com", customers.get(1520).getWeb());
	}
}
