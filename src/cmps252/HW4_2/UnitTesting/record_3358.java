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

@Tag("39")
class Record_3358 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3358: FirstName is Tracy")
	void FirstNameOfRecord3358() {
		assertEquals("Tracy", customers.get(3357).getFirstName());
	}

	@Test
	@DisplayName("Record 3358: LastName is Naab")
	void LastNameOfRecord3358() {
		assertEquals("Naab", customers.get(3357).getLastName());
	}

	@Test
	@DisplayName("Record 3358: Company is Northshore Mortgage Corp")
	void CompanyOfRecord3358() {
		assertEquals("Northshore Mortgage Corp", customers.get(3357).getCompany());
	}

	@Test
	@DisplayName("Record 3358: Address is 5503 Westfield Ave")
	void AddressOfRecord3358() {
		assertEquals("5503 Westfield Ave", customers.get(3357).getAddress());
	}

	@Test
	@DisplayName("Record 3358: City is Pennsauken")
	void CityOfRecord3358() {
		assertEquals("Pennsauken", customers.get(3357).getCity());
	}

	@Test
	@DisplayName("Record 3358: County is Camden")
	void CountyOfRecord3358() {
		assertEquals("Camden", customers.get(3357).getCounty());
	}

	@Test
	@DisplayName("Record 3358: State is NJ")
	void StateOfRecord3358() {
		assertEquals("NJ", customers.get(3357).getState());
	}

	@Test
	@DisplayName("Record 3358: ZIP is 8110")
	void ZIPOfRecord3358() {
		assertEquals("8110", customers.get(3357).getZIP());
	}

	@Test
	@DisplayName("Record 3358: Phone is 856-662-1408")
	void PhoneOfRecord3358() {
		assertEquals("856-662-1408", customers.get(3357).getPhone());
	}

	@Test
	@DisplayName("Record 3358: Fax is 856-662-0484")
	void FaxOfRecord3358() {
		assertEquals("856-662-0484", customers.get(3357).getFax());
	}

	@Test
	@DisplayName("Record 3358: Email is tracy@naab.com")
	void EmailOfRecord3358() {
		assertEquals("tracy@naab.com", customers.get(3357).getEmail());
	}

	@Test
	@DisplayName("Record 3358: Web is http://www.tracynaab.com")
	void WebOfRecord3358() {
		assertEquals("http://www.tracynaab.com", customers.get(3357).getWeb());
	}
}
