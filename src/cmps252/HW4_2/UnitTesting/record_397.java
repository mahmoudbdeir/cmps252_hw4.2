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

@Tag("24")
class Record_397 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 397: FirstName is Phyllis")
	void FirstNameOfRecord397() {
		assertEquals("Phyllis", customers.get(396).getFirstName());
	}

	@Test
	@DisplayName("Record 397: LastName is Jeskie")
	void LastNameOfRecord397() {
		assertEquals("Jeskie", customers.get(396).getLastName());
	}

	@Test
	@DisplayName("Record 397: Company is Sand Mold Systems Inc")
	void CompanyOfRecord397() {
		assertEquals("Sand Mold Systems Inc", customers.get(396).getCompany());
	}

	@Test
	@DisplayName("Record 397: Address is 312 S Columbia Center Blvd")
	void AddressOfRecord397() {
		assertEquals("312 S Columbia Center Blvd", customers.get(396).getAddress());
	}

	@Test
	@DisplayName("Record 397: City is Kennewick")
	void CityOfRecord397() {
		assertEquals("Kennewick", customers.get(396).getCity());
	}

	@Test
	@DisplayName("Record 397: County is Benton")
	void CountyOfRecord397() {
		assertEquals("Benton", customers.get(396).getCounty());
	}

	@Test
	@DisplayName("Record 397: State is WA")
	void StateOfRecord397() {
		assertEquals("WA", customers.get(396).getState());
	}

	@Test
	@DisplayName("Record 397: ZIP is 99336")
	void ZIPOfRecord397() {
		assertEquals("99336", customers.get(396).getZIP());
	}

	@Test
	@DisplayName("Record 397: Phone is 509-783-9138")
	void PhoneOfRecord397() {
		assertEquals("509-783-9138", customers.get(396).getPhone());
	}

	@Test
	@DisplayName("Record 397: Fax is 509-783-5391")
	void FaxOfRecord397() {
		assertEquals("509-783-5391", customers.get(396).getFax());
	}

	@Test
	@DisplayName("Record 397: Email is phyllis@jeskie.com")
	void EmailOfRecord397() {
		assertEquals("phyllis@jeskie.com", customers.get(396).getEmail());
	}

	@Test
	@DisplayName("Record 397: Web is http://www.phyllisjeskie.com")
	void WebOfRecord397() {
		assertEquals("http://www.phyllisjeskie.com", customers.get(396).getWeb());
	}
}
