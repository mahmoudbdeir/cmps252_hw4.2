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

@Tag("40")
class Record_1650 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1650: FirstName is Dwayne")
	void FirstNameOfRecord1650() {
		assertEquals("Dwayne", customers.get(1649).getFirstName());
	}

	@Test
	@DisplayName("Record 1650: LastName is Szczepanski")
	void LastNameOfRecord1650() {
		assertEquals("Szczepanski", customers.get(1649).getLastName());
	}

	@Test
	@DisplayName("Record 1650: Company is Briar Patch")
	void CompanyOfRecord1650() {
		assertEquals("Briar Patch", customers.get(1649).getCompany());
	}

	@Test
	@DisplayName("Record 1650: Address is 3031 S Shannon St")
	void AddressOfRecord1650() {
		assertEquals("3031 S Shannon St", customers.get(1649).getAddress());
	}

	@Test
	@DisplayName("Record 1650: City is Santa Ana")
	void CityOfRecord1650() {
		assertEquals("Santa Ana", customers.get(1649).getCity());
	}

	@Test
	@DisplayName("Record 1650: County is Orange")
	void CountyOfRecord1650() {
		assertEquals("Orange", customers.get(1649).getCounty());
	}

	@Test
	@DisplayName("Record 1650: State is CA")
	void StateOfRecord1650() {
		assertEquals("CA", customers.get(1649).getState());
	}

	@Test
	@DisplayName("Record 1650: ZIP is 92704")
	void ZIPOfRecord1650() {
		assertEquals("92704", customers.get(1649).getZIP());
	}

	@Test
	@DisplayName("Record 1650: Phone is 714-540-0104")
	void PhoneOfRecord1650() {
		assertEquals("714-540-0104", customers.get(1649).getPhone());
	}

	@Test
	@DisplayName("Record 1650: Fax is 714-540-2432")
	void FaxOfRecord1650() {
		assertEquals("714-540-2432", customers.get(1649).getFax());
	}

	@Test
	@DisplayName("Record 1650: Email is dwayne@szczepanski.com")
	void EmailOfRecord1650() {
		assertEquals("dwayne@szczepanski.com", customers.get(1649).getEmail());
	}

	@Test
	@DisplayName("Record 1650: Web is http://www.dwayneszczepanski.com")
	void WebOfRecord1650() {
		assertEquals("http://www.dwayneszczepanski.com", customers.get(1649).getWeb());
	}
}
