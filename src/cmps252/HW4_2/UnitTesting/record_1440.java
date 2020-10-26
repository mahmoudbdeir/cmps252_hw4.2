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

@Tag("12")
class Record_1440 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1440: FirstName is Broderick")
	void FirstNameOfRecord1440() {
		assertEquals("Broderick", customers.get(1439).getFirstName());
	}

	@Test
	@DisplayName("Record 1440: LastName is Freese")
	void LastNameOfRecord1440() {
		assertEquals("Freese", customers.get(1439).getLastName());
	}

	@Test
	@DisplayName("Record 1440: Company is Blanton, Joseph C Jr")
	void CompanyOfRecord1440() {
		assertEquals("Blanton, Joseph C Jr", customers.get(1439).getCompany());
	}

	@Test
	@DisplayName("Record 1440: Address is 7954 Harwood Ave")
	void AddressOfRecord1440() {
		assertEquals("7954 Harwood Ave", customers.get(1439).getAddress());
	}

	@Test
	@DisplayName("Record 1440: City is Milwaukee")
	void CityOfRecord1440() {
		assertEquals("Milwaukee", customers.get(1439).getCity());
	}

	@Test
	@DisplayName("Record 1440: County is Milwaukee")
	void CountyOfRecord1440() {
		assertEquals("Milwaukee", customers.get(1439).getCounty());
	}

	@Test
	@DisplayName("Record 1440: State is WI")
	void StateOfRecord1440() {
		assertEquals("WI", customers.get(1439).getState());
	}

	@Test
	@DisplayName("Record 1440: ZIP is 53213")
	void ZIPOfRecord1440() {
		assertEquals("53213", customers.get(1439).getZIP());
	}

	@Test
	@DisplayName("Record 1440: Phone is 414-778-6681")
	void PhoneOfRecord1440() {
		assertEquals("414-778-6681", customers.get(1439).getPhone());
	}

	@Test
	@DisplayName("Record 1440: Fax is 414-778-4993")
	void FaxOfRecord1440() {
		assertEquals("414-778-4993", customers.get(1439).getFax());
	}

	@Test
	@DisplayName("Record 1440: Email is broderick@freese.com")
	void EmailOfRecord1440() {
		assertEquals("broderick@freese.com", customers.get(1439).getEmail());
	}

	@Test
	@DisplayName("Record 1440: Web is http://www.broderickfreese.com")
	void WebOfRecord1440() {
		assertEquals("http://www.broderickfreese.com", customers.get(1439).getWeb());
	}
}
