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

@Tag("34")
class Record_824 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 824: FirstName is Hugh")
	void FirstNameOfRecord824() {
		assertEquals("Hugh", customers.get(823).getFirstName());
	}

	@Test
	@DisplayName("Record 824: LastName is Pernesky")
	void LastNameOfRecord824() {
		assertEquals("Pernesky", customers.get(823).getLastName());
	}

	@Test
	@DisplayName("Record 824: Company is Forest City Summit")
	void CompanyOfRecord824() {
		assertEquals("Forest City Summit", customers.get(823).getCompany());
	}

	@Test
	@DisplayName("Record 824: Address is 103 E Pine St")
	void AddressOfRecord824() {
		assertEquals("103 E Pine St", customers.get(823).getAddress());
	}

	@Test
	@DisplayName("Record 824: City is Cadillac")
	void CityOfRecord824() {
		assertEquals("Cadillac", customers.get(823).getCity());
	}

	@Test
	@DisplayName("Record 824: County is Wexford")
	void CountyOfRecord824() {
		assertEquals("Wexford", customers.get(823).getCounty());
	}

	@Test
	@DisplayName("Record 824: State is MI")
	void StateOfRecord824() {
		assertEquals("MI", customers.get(823).getState());
	}

	@Test
	@DisplayName("Record 824: ZIP is 49601")
	void ZIPOfRecord824() {
		assertEquals("49601", customers.get(823).getZIP());
	}

	@Test
	@DisplayName("Record 824: Phone is 231-775-1952")
	void PhoneOfRecord824() {
		assertEquals("231-775-1952", customers.get(823).getPhone());
	}

	@Test
	@DisplayName("Record 824: Fax is 231-775-9873")
	void FaxOfRecord824() {
		assertEquals("231-775-9873", customers.get(823).getFax());
	}

	@Test
	@DisplayName("Record 824: Email is hugh@pernesky.com")
	void EmailOfRecord824() {
		assertEquals("hugh@pernesky.com", customers.get(823).getEmail());
	}

	@Test
	@DisplayName("Record 824: Web is http://www.hughpernesky.com")
	void WebOfRecord824() {
		assertEquals("http://www.hughpernesky.com", customers.get(823).getWeb());
	}
}
