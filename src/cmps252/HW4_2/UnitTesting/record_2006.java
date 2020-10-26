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
class Record_2006 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2006: FirstName is Sue")
	void FirstNameOfRecord2006() {
		assertEquals("Sue", customers.get(2005).getFirstName());
	}

	@Test
	@DisplayName("Record 2006: LastName is Brechysen")
	void LastNameOfRecord2006() {
		assertEquals("Brechysen", customers.get(2005).getLastName());
	}

	@Test
	@DisplayName("Record 2006: Company is Cape Spring Iron Co")
	void CompanyOfRecord2006() {
		assertEquals("Cape Spring Iron Co", customers.get(2005).getCompany());
	}

	@Test
	@DisplayName("Record 2006: Address is 927 S 2nd St")
	void AddressOfRecord2006() {
		assertEquals("927 S 2nd St", customers.get(2005).getAddress());
	}

	@Test
	@DisplayName("Record 2006: City is Springfield")
	void CityOfRecord2006() {
		assertEquals("Springfield", customers.get(2005).getCity());
	}

	@Test
	@DisplayName("Record 2006: County is Sangamon")
	void CountyOfRecord2006() {
		assertEquals("Sangamon", customers.get(2005).getCounty());
	}

	@Test
	@DisplayName("Record 2006: State is IL")
	void StateOfRecord2006() {
		assertEquals("IL", customers.get(2005).getState());
	}

	@Test
	@DisplayName("Record 2006: ZIP is 62704")
	void ZIPOfRecord2006() {
		assertEquals("62704", customers.get(2005).getZIP());
	}

	@Test
	@DisplayName("Record 2006: Phone is 217-789-3775")
	void PhoneOfRecord2006() {
		assertEquals("217-789-3775", customers.get(2005).getPhone());
	}

	@Test
	@DisplayName("Record 2006: Fax is 217-789-7316")
	void FaxOfRecord2006() {
		assertEquals("217-789-7316", customers.get(2005).getFax());
	}

	@Test
	@DisplayName("Record 2006: Email is sue@brechysen.com")
	void EmailOfRecord2006() {
		assertEquals("sue@brechysen.com", customers.get(2005).getEmail());
	}

	@Test
	@DisplayName("Record 2006: Web is http://www.suebrechysen.com")
	void WebOfRecord2006() {
		assertEquals("http://www.suebrechysen.com", customers.get(2005).getWeb());
	}
}
