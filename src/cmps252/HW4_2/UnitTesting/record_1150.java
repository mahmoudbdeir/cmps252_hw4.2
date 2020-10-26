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

@Tag("31")
class Record_1150 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1150: FirstName is Abel")
	void FirstNameOfRecord1150() {
		assertEquals("Abel", customers.get(1149).getFirstName());
	}

	@Test
	@DisplayName("Record 1150: LastName is Denbow")
	void LastNameOfRecord1150() {
		assertEquals("Denbow", customers.get(1149).getLastName());
	}

	@Test
	@DisplayName("Record 1150: Company is Pro Direct Interviewing")
	void CompanyOfRecord1150() {
		assertEquals("Pro Direct Interviewing", customers.get(1149).getCompany());
	}

	@Test
	@DisplayName("Record 1150: Address is 7406 A Lockport Pl")
	void AddressOfRecord1150() {
		assertEquals("7406 A Lockport Pl", customers.get(1149).getAddress());
	}

	@Test
	@DisplayName("Record 1150: City is Lorton")
	void CityOfRecord1150() {
		assertEquals("Lorton", customers.get(1149).getCity());
	}

	@Test
	@DisplayName("Record 1150: County is Fairfax")
	void CountyOfRecord1150() {
		assertEquals("Fairfax", customers.get(1149).getCounty());
	}

	@Test
	@DisplayName("Record 1150: State is VA")
	void StateOfRecord1150() {
		assertEquals("VA", customers.get(1149).getState());
	}

	@Test
	@DisplayName("Record 1150: ZIP is 22079")
	void ZIPOfRecord1150() {
		assertEquals("22079", customers.get(1149).getZIP());
	}

	@Test
	@DisplayName("Record 1150: Phone is 703-550-5240")
	void PhoneOfRecord1150() {
		assertEquals("703-550-5240", customers.get(1149).getPhone());
	}

	@Test
	@DisplayName("Record 1150: Fax is 703-550-2469")
	void FaxOfRecord1150() {
		assertEquals("703-550-2469", customers.get(1149).getFax());
	}

	@Test
	@DisplayName("Record 1150: Email is abel@denbow.com")
	void EmailOfRecord1150() {
		assertEquals("abel@denbow.com", customers.get(1149).getEmail());
	}

	@Test
	@DisplayName("Record 1150: Web is http://www.abeldenbow.com")
	void WebOfRecord1150() {
		assertEquals("http://www.abeldenbow.com", customers.get(1149).getWeb());
	}
}
