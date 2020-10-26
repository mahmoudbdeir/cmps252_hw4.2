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

@Tag("28")
class Record_1711 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1711: FirstName is Leonardo")
	void FirstNameOfRecord1711() {
		assertEquals("Leonardo", customers.get(1710).getFirstName());
	}

	@Test
	@DisplayName("Record 1711: LastName is Mariotti")
	void LastNameOfRecord1711() {
		assertEquals("Mariotti", customers.get(1710).getLastName());
	}

	@Test
	@DisplayName("Record 1711: Company is Bryan Rock Products Inc")
	void CompanyOfRecord1711() {
		assertEquals("Bryan Rock Products Inc", customers.get(1710).getCompany());
	}

	@Test
	@DisplayName("Record 1711: Address is 1395 Liberty St Se  #-100")
	void AddressOfRecord1711() {
		assertEquals("1395 Liberty St Se  #-100", customers.get(1710).getAddress());
	}

	@Test
	@DisplayName("Record 1711: City is Salem")
	void CityOfRecord1711() {
		assertEquals("Salem", customers.get(1710).getCity());
	}

	@Test
	@DisplayName("Record 1711: County is Marion")
	void CountyOfRecord1711() {
		assertEquals("Marion", customers.get(1710).getCounty());
	}

	@Test
	@DisplayName("Record 1711: State is OR")
	void StateOfRecord1711() {
		assertEquals("OR", customers.get(1710).getState());
	}

	@Test
	@DisplayName("Record 1711: ZIP is 97302")
	void ZIPOfRecord1711() {
		assertEquals("97302", customers.get(1710).getZIP());
	}

	@Test
	@DisplayName("Record 1711: Phone is 503-362-7332")
	void PhoneOfRecord1711() {
		assertEquals("503-362-7332", customers.get(1710).getPhone());
	}

	@Test
	@DisplayName("Record 1711: Fax is 503-362-1772")
	void FaxOfRecord1711() {
		assertEquals("503-362-1772", customers.get(1710).getFax());
	}

	@Test
	@DisplayName("Record 1711: Email is leonardo@mariotti.com")
	void EmailOfRecord1711() {
		assertEquals("leonardo@mariotti.com", customers.get(1710).getEmail());
	}

	@Test
	@DisplayName("Record 1711: Web is http://www.leonardomariotti.com")
	void WebOfRecord1711() {
		assertEquals("http://www.leonardomariotti.com", customers.get(1710).getWeb());
	}
}
