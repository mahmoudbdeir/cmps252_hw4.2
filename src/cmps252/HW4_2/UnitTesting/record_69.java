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

@Tag("4")
class Record_69 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 69: FirstName is Melissa")
	void FirstNameOfRecord69() {
		assertEquals("Melissa", customers.get(68).getFirstName());
	}

	@Test
	@DisplayName("Record 69: LastName is Mcconn")
	void LastNameOfRecord69() {
		assertEquals("Mcconn", customers.get(68).getLastName());
	}

	@Test
	@DisplayName("Record 69: Company is Lucas Industries")
	void CompanyOfRecord69() {
		assertEquals("Lucas Industries", customers.get(68).getCompany());
	}

	@Test
	@DisplayName("Record 69: Address is 210 Andover St  #-21")
	void AddressOfRecord69() {
		assertEquals("210 Andover St  #-21", customers.get(68).getAddress());
	}

	@Test
	@DisplayName("Record 69: City is Wilmington")
	void CityOfRecord69() {
		assertEquals("Wilmington", customers.get(68).getCity());
	}

	@Test
	@DisplayName("Record 69: County is Middlesex")
	void CountyOfRecord69() {
		assertEquals("Middlesex", customers.get(68).getCounty());
	}

	@Test
	@DisplayName("Record 69: State is MA")
	void StateOfRecord69() {
		assertEquals("MA", customers.get(68).getState());
	}

	@Test
	@DisplayName("Record 69: ZIP is 1887")
	void ZIPOfRecord69() {
		assertEquals("1887", customers.get(68).getZIP());
	}

	@Test
	@DisplayName("Record 69: Phone is 978-694-0600")
	void PhoneOfRecord69() {
		assertEquals("978-694-0600", customers.get(68).getPhone());
	}

	@Test
	@DisplayName("Record 69: Fax is 978-694-6248")
	void FaxOfRecord69() {
		assertEquals("978-694-6248", customers.get(68).getFax());
	}

	@Test
	@DisplayName("Record 69: Email is melissa@mcconn.com")
	void EmailOfRecord69() {
		assertEquals("melissa@mcconn.com", customers.get(68).getEmail());
	}

	@Test
	@DisplayName("Record 69: Web is http://www.melissamcconn.com")
	void WebOfRecord69() {
		assertEquals("http://www.melissamcconn.com", customers.get(68).getWeb());
	}
}
