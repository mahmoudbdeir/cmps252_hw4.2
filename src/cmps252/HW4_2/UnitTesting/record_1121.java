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

@Tag("48")
class Record_1121 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1121: FirstName is Archie")
	void FirstNameOfRecord1121() {
		assertEquals("Archie", customers.get(1120).getFirstName());
	}

	@Test
	@DisplayName("Record 1121: LastName is Pawelek")
	void LastNameOfRecord1121() {
		assertEquals("Pawelek", customers.get(1120).getLastName());
	}

	@Test
	@DisplayName("Record 1121: Company is Mcdonald, Geo J")
	void CompanyOfRecord1121() {
		assertEquals("Mcdonald, Geo J", customers.get(1120).getCompany());
	}

	@Test
	@DisplayName("Record 1121: Address is 101 Maiden Ln")
	void AddressOfRecord1121() {
		assertEquals("101 Maiden Ln", customers.get(1120).getAddress());
	}

	@Test
	@DisplayName("Record 1121: City is New York")
	void CityOfRecord1121() {
		assertEquals("New York", customers.get(1120).getCity());
	}

	@Test
	@DisplayName("Record 1121: County is New York")
	void CountyOfRecord1121() {
		assertEquals("New York", customers.get(1120).getCounty());
	}

	@Test
	@DisplayName("Record 1121: State is NY")
	void StateOfRecord1121() {
		assertEquals("NY", customers.get(1120).getState());
	}

	@Test
	@DisplayName("Record 1121: ZIP is 10038")
	void ZIPOfRecord1121() {
		assertEquals("10038", customers.get(1120).getZIP());
	}

	@Test
	@DisplayName("Record 1121: Phone is 212-968-8383")
	void PhoneOfRecord1121() {
		assertEquals("212-968-8383", customers.get(1120).getPhone());
	}

	@Test
	@DisplayName("Record 1121: Fax is 212-968-1802")
	void FaxOfRecord1121() {
		assertEquals("212-968-1802", customers.get(1120).getFax());
	}

	@Test
	@DisplayName("Record 1121: Email is archie@pawelek.com")
	void EmailOfRecord1121() {
		assertEquals("archie@pawelek.com", customers.get(1120).getEmail());
	}

	@Test
	@DisplayName("Record 1121: Web is http://www.archiepawelek.com")
	void WebOfRecord1121() {
		assertEquals("http://www.archiepawelek.com", customers.get(1120).getWeb());
	}
}
