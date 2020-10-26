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

@Tag("49")
class Record_2799 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2799: FirstName is Eldon")
	void FirstNameOfRecord2799() {
		assertEquals("Eldon", customers.get(2798).getFirstName());
	}

	@Test
	@DisplayName("Record 2799: LastName is Samu")
	void LastNameOfRecord2799() {
		assertEquals("Samu", customers.get(2798).getLastName());
	}

	@Test
	@DisplayName("Record 2799: Company is Missouri River Basin Assn")
	void CompanyOfRecord2799() {
		assertEquals("Missouri River Basin Assn", customers.get(2798).getCompany());
	}

	@Test
	@DisplayName("Record 2799: Address is 3219 Johnston St")
	void AddressOfRecord2799() {
		assertEquals("3219 Johnston St", customers.get(2798).getAddress());
	}

	@Test
	@DisplayName("Record 2799: City is Lafayette")
	void CityOfRecord2799() {
		assertEquals("Lafayette", customers.get(2798).getCity());
	}

	@Test
	@DisplayName("Record 2799: County is Lafayette")
	void CountyOfRecord2799() {
		assertEquals("Lafayette", customers.get(2798).getCounty());
	}

	@Test
	@DisplayName("Record 2799: State is LA")
	void StateOfRecord2799() {
		assertEquals("LA", customers.get(2798).getState());
	}

	@Test
	@DisplayName("Record 2799: ZIP is 70503")
	void ZIPOfRecord2799() {
		assertEquals("70503", customers.get(2798).getZIP());
	}

	@Test
	@DisplayName("Record 2799: Phone is 337-984-1943")
	void PhoneOfRecord2799() {
		assertEquals("337-984-1943", customers.get(2798).getPhone());
	}

	@Test
	@DisplayName("Record 2799: Fax is 337-984-3056")
	void FaxOfRecord2799() {
		assertEquals("337-984-3056", customers.get(2798).getFax());
	}

	@Test
	@DisplayName("Record 2799: Email is eldon@samu.com")
	void EmailOfRecord2799() {
		assertEquals("eldon@samu.com", customers.get(2798).getEmail());
	}

	@Test
	@DisplayName("Record 2799: Web is http://www.eldonsamu.com")
	void WebOfRecord2799() {
		assertEquals("http://www.eldonsamu.com", customers.get(2798).getWeb());
	}
}
