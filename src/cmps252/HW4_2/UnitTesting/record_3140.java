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

@Tag("27")
class Record_3140 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3140: FirstName is Noah")
	void FirstNameOfRecord3140() {
		assertEquals("Noah", customers.get(3139).getFirstName());
	}

	@Test
	@DisplayName("Record 3140: LastName is Warr")
	void LastNameOfRecord3140() {
		assertEquals("Warr", customers.get(3139).getLastName());
	}

	@Test
	@DisplayName("Record 3140: Company is Brewster Miller & Associates")
	void CompanyOfRecord3140() {
		assertEquals("Brewster Miller & Associates", customers.get(3139).getCompany());
	}

	@Test
	@DisplayName("Record 3140: Address is 1104 Central Ave")
	void AddressOfRecord3140() {
		assertEquals("1104 Central Ave", customers.get(3139).getAddress());
	}

	@Test
	@DisplayName("Record 3140: City is Albany")
	void CityOfRecord3140() {
		assertEquals("Albany", customers.get(3139).getCity());
	}

	@Test
	@DisplayName("Record 3140: County is Albany")
	void CountyOfRecord3140() {
		assertEquals("Albany", customers.get(3139).getCounty());
	}

	@Test
	@DisplayName("Record 3140: State is NY")
	void StateOfRecord3140() {
		assertEquals("NY", customers.get(3139).getState());
	}

	@Test
	@DisplayName("Record 3140: ZIP is 12205")
	void ZIPOfRecord3140() {
		assertEquals("12205", customers.get(3139).getZIP());
	}

	@Test
	@DisplayName("Record 3140: Phone is 518-459-5331")
	void PhoneOfRecord3140() {
		assertEquals("518-459-5331", customers.get(3139).getPhone());
	}

	@Test
	@DisplayName("Record 3140: Fax is 518-459-5517")
	void FaxOfRecord3140() {
		assertEquals("518-459-5517", customers.get(3139).getFax());
	}

	@Test
	@DisplayName("Record 3140: Email is noah@warr.com")
	void EmailOfRecord3140() {
		assertEquals("noah@warr.com", customers.get(3139).getEmail());
	}

	@Test
	@DisplayName("Record 3140: Web is http://www.noahwarr.com")
	void WebOfRecord3140() {
		assertEquals("http://www.noahwarr.com", customers.get(3139).getWeb());
	}
}
