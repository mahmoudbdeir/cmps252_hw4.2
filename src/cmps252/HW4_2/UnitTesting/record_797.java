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

@Tag("1")
class Record_797 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 797: FirstName is Brad")
	void FirstNameOfRecord797() {
		assertEquals("Brad", customers.get(796).getFirstName());
	}

	@Test
	@DisplayName("Record 797: LastName is Buike")
	void LastNameOfRecord797() {
		assertEquals("Buike", customers.get(796).getLastName());
	}

	@Test
	@DisplayName("Record 797: Company is Dimensional Graph & Printery")
	void CompanyOfRecord797() {
		assertEquals("Dimensional Graph & Printery", customers.get(796).getCompany());
	}

	@Test
	@DisplayName("Record 797: Address is 7741 Alabama Ave")
	void AddressOfRecord797() {
		assertEquals("7741 Alabama Ave", customers.get(796).getAddress());
	}

	@Test
	@DisplayName("Record 797: City is Canoga Park")
	void CityOfRecord797() {
		assertEquals("Canoga Park", customers.get(796).getCity());
	}

	@Test
	@DisplayName("Record 797: County is Los Angeles")
	void CountyOfRecord797() {
		assertEquals("Los Angeles", customers.get(796).getCounty());
	}

	@Test
	@DisplayName("Record 797: State is CA")
	void StateOfRecord797() {
		assertEquals("CA", customers.get(796).getState());
	}

	@Test
	@DisplayName("Record 797: ZIP is 91304")
	void ZIPOfRecord797() {
		assertEquals("91304", customers.get(796).getZIP());
	}

	@Test
	@DisplayName("Record 797: Phone is 818-340-6210")
	void PhoneOfRecord797() {
		assertEquals("818-340-6210", customers.get(796).getPhone());
	}

	@Test
	@DisplayName("Record 797: Fax is 818-340-7717")
	void FaxOfRecord797() {
		assertEquals("818-340-7717", customers.get(796).getFax());
	}

	@Test
	@DisplayName("Record 797: Email is brad@buike.com")
	void EmailOfRecord797() {
		assertEquals("brad@buike.com", customers.get(796).getEmail());
	}

	@Test
	@DisplayName("Record 797: Web is http://www.bradbuike.com")
	void WebOfRecord797() {
		assertEquals("http://www.bradbuike.com", customers.get(796).getWeb());
	}
}
