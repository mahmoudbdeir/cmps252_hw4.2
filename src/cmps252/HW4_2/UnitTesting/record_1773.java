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

@Tag("17")
class Record_1773 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1773: FirstName is Kaitlin")
	void FirstNameOfRecord1773() {
		assertEquals("Kaitlin", customers.get(1772).getFirstName());
	}

	@Test
	@DisplayName("Record 1773: LastName is Strysko")
	void LastNameOfRecord1773() {
		assertEquals("Strysko", customers.get(1772).getLastName());
	}

	@Test
	@DisplayName("Record 1773: Company is Manley, Jeffrey M Esq")
	void CompanyOfRecord1773() {
		assertEquals("Manley, Jeffrey M Esq", customers.get(1772).getCompany());
	}

	@Test
	@DisplayName("Record 1773: Address is 1710 Oak Tree Rd")
	void AddressOfRecord1773() {
		assertEquals("1710 Oak Tree Rd", customers.get(1772).getAddress());
	}

	@Test
	@DisplayName("Record 1773: City is Edison")
	void CityOfRecord1773() {
		assertEquals("Edison", customers.get(1772).getCity());
	}

	@Test
	@DisplayName("Record 1773: County is Middlesex")
	void CountyOfRecord1773() {
		assertEquals("Middlesex", customers.get(1772).getCounty());
	}

	@Test
	@DisplayName("Record 1773: State is NJ")
	void StateOfRecord1773() {
		assertEquals("NJ", customers.get(1772).getState());
	}

	@Test
	@DisplayName("Record 1773: ZIP is 8820")
	void ZIPOfRecord1773() {
		assertEquals("8820", customers.get(1772).getZIP());
	}

	@Test
	@DisplayName("Record 1773: Phone is 732-906-3196")
	void PhoneOfRecord1773() {
		assertEquals("732-906-3196", customers.get(1772).getPhone());
	}

	@Test
	@DisplayName("Record 1773: Fax is 732-906-7815")
	void FaxOfRecord1773() {
		assertEquals("732-906-7815", customers.get(1772).getFax());
	}

	@Test
	@DisplayName("Record 1773: Email is kaitlin@strysko.com")
	void EmailOfRecord1773() {
		assertEquals("kaitlin@strysko.com", customers.get(1772).getEmail());
	}

	@Test
	@DisplayName("Record 1773: Web is http://www.kaitlinstrysko.com")
	void WebOfRecord1773() {
		assertEquals("http://www.kaitlinstrysko.com", customers.get(1772).getWeb());
	}
}
