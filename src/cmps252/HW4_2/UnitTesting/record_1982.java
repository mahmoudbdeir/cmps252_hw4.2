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

@Tag("46")
class Record_1982 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1982: FirstName is Debra")
	void FirstNameOfRecord1982() {
		assertEquals("Debra", customers.get(1981).getFirstName());
	}

	@Test
	@DisplayName("Record 1982: LastName is Tavira")
	void LastNameOfRecord1982() {
		assertEquals("Tavira", customers.get(1981).getLastName());
	}

	@Test
	@DisplayName("Record 1982: Company is Patriot Travel Group")
	void CompanyOfRecord1982() {
		assertEquals("Patriot Travel Group", customers.get(1981).getCompany());
	}

	@Test
	@DisplayName("Record 1982: Address is 1622 Berrywood Ln")
	void AddressOfRecord1982() {
		assertEquals("1622 Berrywood Ln", customers.get(1981).getAddress());
	}

	@Test
	@DisplayName("Record 1982: City is Flint")
	void CityOfRecord1982() {
		assertEquals("Flint", customers.get(1981).getCity());
	}

	@Test
	@DisplayName("Record 1982: County is Genesee")
	void CountyOfRecord1982() {
		assertEquals("Genesee", customers.get(1981).getCounty());
	}

	@Test
	@DisplayName("Record 1982: State is MI")
	void StateOfRecord1982() {
		assertEquals("MI", customers.get(1981).getState());
	}

	@Test
	@DisplayName("Record 1982: ZIP is 48507")
	void ZIPOfRecord1982() {
		assertEquals("48507", customers.get(1981).getZIP());
	}

	@Test
	@DisplayName("Record 1982: Phone is 810-235-5434")
	void PhoneOfRecord1982() {
		assertEquals("810-235-5434", customers.get(1981).getPhone());
	}

	@Test
	@DisplayName("Record 1982: Fax is 810-235-6007")
	void FaxOfRecord1982() {
		assertEquals("810-235-6007", customers.get(1981).getFax());
	}

	@Test
	@DisplayName("Record 1982: Email is debra@tavira.com")
	void EmailOfRecord1982() {
		assertEquals("debra@tavira.com", customers.get(1981).getEmail());
	}

	@Test
	@DisplayName("Record 1982: Web is http://www.debratavira.com")
	void WebOfRecord1982() {
		assertEquals("http://www.debratavira.com", customers.get(1981).getWeb());
	}
}
