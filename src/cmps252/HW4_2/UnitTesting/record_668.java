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

@Tag("29")
class Record_668 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 668: FirstName is Cassie")
	void FirstNameOfRecord668() {
		assertEquals("Cassie", customers.get(667).getFirstName());
	}

	@Test
	@DisplayName("Record 668: LastName is Tartar")
	void LastNameOfRecord668() {
		assertEquals("Tartar", customers.get(667).getLastName());
	}

	@Test
	@DisplayName("Record 668: Company is Us Corporation Systems Inc")
	void CompanyOfRecord668() {
		assertEquals("Us Corporation Systems Inc", customers.get(667).getCompany());
	}

	@Test
	@DisplayName("Record 668: Address is 3735 New Hope Rd")
	void AddressOfRecord668() {
		assertEquals("3735 New Hope Rd", customers.get(667).getAddress());
	}

	@Test
	@DisplayName("Record 668: City is Grants Pass")
	void CityOfRecord668() {
		assertEquals("Grants Pass", customers.get(667).getCity());
	}

	@Test
	@DisplayName("Record 668: County is Josephine")
	void CountyOfRecord668() {
		assertEquals("Josephine", customers.get(667).getCounty());
	}

	@Test
	@DisplayName("Record 668: State is OR")
	void StateOfRecord668() {
		assertEquals("OR", customers.get(667).getState());
	}

	@Test
	@DisplayName("Record 668: ZIP is 97527")
	void ZIPOfRecord668() {
		assertEquals("97527", customers.get(667).getZIP());
	}

	@Test
	@DisplayName("Record 668: Phone is 541-474-3056")
	void PhoneOfRecord668() {
		assertEquals("541-474-3056", customers.get(667).getPhone());
	}

	@Test
	@DisplayName("Record 668: Fax is 541-474-1169")
	void FaxOfRecord668() {
		assertEquals("541-474-1169", customers.get(667).getFax());
	}

	@Test
	@DisplayName("Record 668: Email is cassie@tartar.com")
	void EmailOfRecord668() {
		assertEquals("cassie@tartar.com", customers.get(667).getEmail());
	}

	@Test
	@DisplayName("Record 668: Web is http://www.cassietartar.com")
	void WebOfRecord668() {
		assertEquals("http://www.cassietartar.com", customers.get(667).getWeb());
	}
}
