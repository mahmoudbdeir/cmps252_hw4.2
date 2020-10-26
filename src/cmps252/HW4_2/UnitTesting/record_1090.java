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

@Tag("11")
class Record_1090 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1090: FirstName is Zelma")
	void FirstNameOfRecord1090() {
		assertEquals("Zelma", customers.get(1089).getFirstName());
	}

	@Test
	@DisplayName("Record 1090: LastName is Bragas")
	void LastNameOfRecord1090() {
		assertEquals("Bragas", customers.get(1089).getLastName());
	}

	@Test
	@DisplayName("Record 1090: Company is Delphian Corporation")
	void CompanyOfRecord1090() {
		assertEquals("Delphian Corporation", customers.get(1089).getCompany());
	}

	@Test
	@DisplayName("Record 1090: Address is 824 Americas Aven")
	void AddressOfRecord1090() {
		assertEquals("824 Americas Aven", customers.get(1089).getAddress());
	}

	@Test
	@DisplayName("Record 1090: City is New York")
	void CityOfRecord1090() {
		assertEquals("New York", customers.get(1089).getCity());
	}

	@Test
	@DisplayName("Record 1090: County is New York")
	void CountyOfRecord1090() {
		assertEquals("New York", customers.get(1089).getCounty());
	}

	@Test
	@DisplayName("Record 1090: State is NY")
	void StateOfRecord1090() {
		assertEquals("NY", customers.get(1089).getState());
	}

	@Test
	@DisplayName("Record 1090: ZIP is 10001")
	void ZIPOfRecord1090() {
		assertEquals("10001", customers.get(1089).getZIP());
	}

	@Test
	@DisplayName("Record 1090: Phone is 212-779-7080")
	void PhoneOfRecord1090() {
		assertEquals("212-779-7080", customers.get(1089).getPhone());
	}

	@Test
	@DisplayName("Record 1090: Fax is 212-779-7555")
	void FaxOfRecord1090() {
		assertEquals("212-779-7555", customers.get(1089).getFax());
	}

	@Test
	@DisplayName("Record 1090: Email is zelma@bragas.com")
	void EmailOfRecord1090() {
		assertEquals("zelma@bragas.com", customers.get(1089).getEmail());
	}

	@Test
	@DisplayName("Record 1090: Web is http://www.zelmabragas.com")
	void WebOfRecord1090() {
		assertEquals("http://www.zelmabragas.com", customers.get(1089).getWeb());
	}
}
