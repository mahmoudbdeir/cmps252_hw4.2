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
class Record_2950 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2950: FirstName is Mike")
	void FirstNameOfRecord2950() {
		assertEquals("Mike", customers.get(2949).getFirstName());
	}

	@Test
	@DisplayName("Record 2950: LastName is Sandridge")
	void LastNameOfRecord2950() {
		assertEquals("Sandridge", customers.get(2949).getLastName());
	}

	@Test
	@DisplayName("Record 2950: Company is Wine Company")
	void CompanyOfRecord2950() {
		assertEquals("Wine Company", customers.get(2949).getCompany());
	}

	@Test
	@DisplayName("Record 2950: Address is 42400 Christy St")
	void AddressOfRecord2950() {
		assertEquals("42400 Christy St", customers.get(2949).getAddress());
	}

	@Test
	@DisplayName("Record 2950: City is Fremont")
	void CityOfRecord2950() {
		assertEquals("Fremont", customers.get(2949).getCity());
	}

	@Test
	@DisplayName("Record 2950: County is Alameda")
	void CountyOfRecord2950() {
		assertEquals("Alameda", customers.get(2949).getCounty());
	}

	@Test
	@DisplayName("Record 2950: State is CA")
	void StateOfRecord2950() {
		assertEquals("CA", customers.get(2949).getState());
	}

	@Test
	@DisplayName("Record 2950: ZIP is 94538")
	void ZIPOfRecord2950() {
		assertEquals("94538", customers.get(2949).getZIP());
	}

	@Test
	@DisplayName("Record 2950: Phone is 510-490-8755")
	void PhoneOfRecord2950() {
		assertEquals("510-490-8755", customers.get(2949).getPhone());
	}

	@Test
	@DisplayName("Record 2950: Fax is 510-490-5832")
	void FaxOfRecord2950() {
		assertEquals("510-490-5832", customers.get(2949).getFax());
	}

	@Test
	@DisplayName("Record 2950: Email is mike@sandridge.com")
	void EmailOfRecord2950() {
		assertEquals("mike@sandridge.com", customers.get(2949).getEmail());
	}

	@Test
	@DisplayName("Record 2950: Web is http://www.mikesandridge.com")
	void WebOfRecord2950() {
		assertEquals("http://www.mikesandridge.com", customers.get(2949).getWeb());
	}
}
