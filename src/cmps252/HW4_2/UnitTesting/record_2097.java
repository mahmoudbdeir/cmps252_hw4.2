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

@Tag("42")
class Record_2097 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2097: FirstName is Nettie")
	void FirstNameOfRecord2097() {
		assertEquals("Nettie", customers.get(2096).getFirstName());
	}

	@Test
	@DisplayName("Record 2097: LastName is Kinniburgh")
	void LastNameOfRecord2097() {
		assertEquals("Kinniburgh", customers.get(2096).getLastName());
	}

	@Test
	@DisplayName("Record 2097: Company is Dr Seco")
	void CompanyOfRecord2097() {
		assertEquals("Dr Seco", customers.get(2096).getCompany());
	}

	@Test
	@DisplayName("Record 2097: Address is 7901 Westpark Dr")
	void AddressOfRecord2097() {
		assertEquals("7901 Westpark Dr", customers.get(2096).getAddress());
	}

	@Test
	@DisplayName("Record 2097: City is Mc Lean")
	void CityOfRecord2097() {
		assertEquals("Mc Lean", customers.get(2096).getCity());
	}

	@Test
	@DisplayName("Record 2097: County is Fairfax")
	void CountyOfRecord2097() {
		assertEquals("Fairfax", customers.get(2096).getCounty());
	}

	@Test
	@DisplayName("Record 2097: State is VA")
	void StateOfRecord2097() {
		assertEquals("VA", customers.get(2096).getState());
	}

	@Test
	@DisplayName("Record 2097: ZIP is 22102")
	void ZIPOfRecord2097() {
		assertEquals("22102", customers.get(2096).getZIP());
	}

	@Test
	@DisplayName("Record 2097: Phone is 703-893-1543")
	void PhoneOfRecord2097() {
		assertEquals("703-893-1543", customers.get(2096).getPhone());
	}

	@Test
	@DisplayName("Record 2097: Fax is 703-893-9514")
	void FaxOfRecord2097() {
		assertEquals("703-893-9514", customers.get(2096).getFax());
	}

	@Test
	@DisplayName("Record 2097: Email is nettie@kinniburgh.com")
	void EmailOfRecord2097() {
		assertEquals("nettie@kinniburgh.com", customers.get(2096).getEmail());
	}

	@Test
	@DisplayName("Record 2097: Web is http://www.nettiekinniburgh.com")
	void WebOfRecord2097() {
		assertEquals("http://www.nettiekinniburgh.com", customers.get(2096).getWeb());
	}
}
