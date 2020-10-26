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

@Tag("10")
class Record_2922 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2922: FirstName is Gussie")
	void FirstNameOfRecord2922() {
		assertEquals("Gussie", customers.get(2921).getFirstName());
	}

	@Test
	@DisplayName("Record 2922: LastName is Lachermyer")
	void LastNameOfRecord2922() {
		assertEquals("Lachermyer", customers.get(2921).getLastName());
	}

	@Test
	@DisplayName("Record 2922: Company is Schoenberg Fisher & Newman Ltd")
	void CompanyOfRecord2922() {
		assertEquals("Schoenberg Fisher & Newman Ltd", customers.get(2921).getCompany());
	}

	@Test
	@DisplayName("Record 2922: Address is 1001 N Monroe St")
	void AddressOfRecord2922() {
		assertEquals("1001 N Monroe St", customers.get(2921).getAddress());
	}

	@Test
	@DisplayName("Record 2922: City is Tallahassee")
	void CityOfRecord2922() {
		assertEquals("Tallahassee", customers.get(2921).getCity());
	}

	@Test
	@DisplayName("Record 2922: County is Leon")
	void CountyOfRecord2922() {
		assertEquals("Leon", customers.get(2921).getCounty());
	}

	@Test
	@DisplayName("Record 2922: State is FL")
	void StateOfRecord2922() {
		assertEquals("FL", customers.get(2921).getState());
	}

	@Test
	@DisplayName("Record 2922: ZIP is 32303")
	void ZIPOfRecord2922() {
		assertEquals("32303", customers.get(2921).getZIP());
	}

	@Test
	@DisplayName("Record 2922: Phone is 850-561-8120")
	void PhoneOfRecord2922() {
		assertEquals("850-561-8120", customers.get(2921).getPhone());
	}

	@Test
	@DisplayName("Record 2922: Fax is 850-561-9426")
	void FaxOfRecord2922() {
		assertEquals("850-561-9426", customers.get(2921).getFax());
	}

	@Test
	@DisplayName("Record 2922: Email is gussie@lachermyer.com")
	void EmailOfRecord2922() {
		assertEquals("gussie@lachermyer.com", customers.get(2921).getEmail());
	}

	@Test
	@DisplayName("Record 2922: Web is http://www.gussielachermyer.com")
	void WebOfRecord2922() {
		assertEquals("http://www.gussielachermyer.com", customers.get(2921).getWeb());
	}
}
