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

@Tag("18")
class Record_2095 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2095: FirstName is Myron")
	void FirstNameOfRecord2095() {
		assertEquals("Myron", customers.get(2094).getFirstName());
	}

	@Test
	@DisplayName("Record 2095: LastName is Jahosky")
	void LastNameOfRecord2095() {
		assertEquals("Jahosky", customers.get(2094).getLastName());
	}

	@Test
	@DisplayName("Record 2095: Company is Stainless Equipment Inc")
	void CompanyOfRecord2095() {
		assertEquals("Stainless Equipment Inc", customers.get(2094).getCompany());
	}

	@Test
	@DisplayName("Record 2095: Address is 814 Main St")
	void AddressOfRecord2095() {
		assertEquals("814 Main St", customers.get(2094).getAddress());
	}

	@Test
	@DisplayName("Record 2095: City is Evanston")
	void CityOfRecord2095() {
		assertEquals("Evanston", customers.get(2094).getCity());
	}

	@Test
	@DisplayName("Record 2095: County is Cook")
	void CountyOfRecord2095() {
		assertEquals("Cook", customers.get(2094).getCounty());
	}

	@Test
	@DisplayName("Record 2095: State is IL")
	void StateOfRecord2095() {
		assertEquals("IL", customers.get(2094).getState());
	}

	@Test
	@DisplayName("Record 2095: ZIP is 60202")
	void ZIPOfRecord2095() {
		assertEquals("60202", customers.get(2094).getZIP());
	}

	@Test
	@DisplayName("Record 2095: Phone is 847-869-0597")
	void PhoneOfRecord2095() {
		assertEquals("847-869-0597", customers.get(2094).getPhone());
	}

	@Test
	@DisplayName("Record 2095: Fax is 847-869-1919")
	void FaxOfRecord2095() {
		assertEquals("847-869-1919", customers.get(2094).getFax());
	}

	@Test
	@DisplayName("Record 2095: Email is myron@jahosky.com")
	void EmailOfRecord2095() {
		assertEquals("myron@jahosky.com", customers.get(2094).getEmail());
	}

	@Test
	@DisplayName("Record 2095: Web is http://www.myronjahosky.com")
	void WebOfRecord2095() {
		assertEquals("http://www.myronjahosky.com", customers.get(2094).getWeb());
	}
}
