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

@Tag("33")
class Record_1642 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1642: FirstName is Tracie")
	void FirstNameOfRecord1642() {
		assertEquals("Tracie", customers.get(1641).getFirstName());
	}

	@Test
	@DisplayName("Record 1642: LastName is Gruiger")
	void LastNameOfRecord1642() {
		assertEquals("Gruiger", customers.get(1641).getLastName());
	}

	@Test
	@DisplayName("Record 1642: Company is Comfort Inn")
	void CompanyOfRecord1642() {
		assertEquals("Comfort Inn", customers.get(1641).getCompany());
	}

	@Test
	@DisplayName("Record 1642: Address is 28644 S Dixie Hwy")
	void AddressOfRecord1642() {
		assertEquals("28644 S Dixie Hwy", customers.get(1641).getAddress());
	}

	@Test
	@DisplayName("Record 1642: City is Homestead")
	void CityOfRecord1642() {
		assertEquals("Homestead", customers.get(1641).getCity());
	}

	@Test
	@DisplayName("Record 1642: County is Miami-Dade")
	void CountyOfRecord1642() {
		assertEquals("Miami-Dade", customers.get(1641).getCounty());
	}

	@Test
	@DisplayName("Record 1642: State is FL")
	void StateOfRecord1642() {
		assertEquals("FL", customers.get(1641).getState());
	}

	@Test
	@DisplayName("Record 1642: ZIP is 33033")
	void ZIPOfRecord1642() {
		assertEquals("33033", customers.get(1641).getZIP());
	}

	@Test
	@DisplayName("Record 1642: Phone is 305-245-1819")
	void PhoneOfRecord1642() {
		assertEquals("305-245-1819", customers.get(1641).getPhone());
	}

	@Test
	@DisplayName("Record 1642: Fax is 305-245-6453")
	void FaxOfRecord1642() {
		assertEquals("305-245-6453", customers.get(1641).getFax());
	}

	@Test
	@DisplayName("Record 1642: Email is tracie@gruiger.com")
	void EmailOfRecord1642() {
		assertEquals("tracie@gruiger.com", customers.get(1641).getEmail());
	}

	@Test
	@DisplayName("Record 1642: Web is http://www.traciegruiger.com")
	void WebOfRecord1642() {
		assertEquals("http://www.traciegruiger.com", customers.get(1641).getWeb());
	}
}
