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

@Tag("6")
class Record_3263 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3263: FirstName is Hilton")
	void FirstNameOfRecord3263() {
		assertEquals("Hilton", customers.get(3262).getFirstName());
	}

	@Test
	@DisplayName("Record 3263: LastName is Lafon")
	void LastNameOfRecord3263() {
		assertEquals("Lafon", customers.get(3262).getLastName());
	}

	@Test
	@DisplayName("Record 3263: Company is Squire Corrugated Contnr Corp")
	void CompanyOfRecord3263() {
		assertEquals("Squire Corrugated Contnr Corp", customers.get(3262).getCompany());
	}

	@Test
	@DisplayName("Record 3263: Address is 19571 Progress Dr")
	void AddressOfRecord3263() {
		assertEquals("19571 Progress Dr", customers.get(3262).getAddress());
	}

	@Test
	@DisplayName("Record 3263: City is Strongsville")
	void CityOfRecord3263() {
		assertEquals("Strongsville", customers.get(3262).getCity());
	}

	@Test
	@DisplayName("Record 3263: County is Cuyahoga")
	void CountyOfRecord3263() {
		assertEquals("Cuyahoga", customers.get(3262).getCounty());
	}

	@Test
	@DisplayName("Record 3263: State is OH")
	void StateOfRecord3263() {
		assertEquals("OH", customers.get(3262).getState());
	}

	@Test
	@DisplayName("Record 3263: ZIP is 44136")
	void ZIPOfRecord3263() {
		assertEquals("44136", customers.get(3262).getZIP());
	}

	@Test
	@DisplayName("Record 3263: Phone is 440-572-3546")
	void PhoneOfRecord3263() {
		assertEquals("440-572-3546", customers.get(3262).getPhone());
	}

	@Test
	@DisplayName("Record 3263: Fax is 440-572-7627")
	void FaxOfRecord3263() {
		assertEquals("440-572-7627", customers.get(3262).getFax());
	}

	@Test
	@DisplayName("Record 3263: Email is hilton@lafon.com")
	void EmailOfRecord3263() {
		assertEquals("hilton@lafon.com", customers.get(3262).getEmail());
	}

	@Test
	@DisplayName("Record 3263: Web is http://www.hiltonlafon.com")
	void WebOfRecord3263() {
		assertEquals("http://www.hiltonlafon.com", customers.get(3262).getWeb());
	}
}
