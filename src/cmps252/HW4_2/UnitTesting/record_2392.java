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

@Tag("17")
class Record_2392 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2392: FirstName is Orval")
	void FirstNameOfRecord2392() {
		assertEquals("Orval", customers.get(2391).getFirstName());
	}

	@Test
	@DisplayName("Record 2392: LastName is Vetterick")
	void LastNameOfRecord2392() {
		assertEquals("Vetterick", customers.get(2391).getLastName());
	}

	@Test
	@DisplayName("Record 2392: Company is Ford Rent A Car System")
	void CompanyOfRecord2392() {
		assertEquals("Ford Rent A Car System", customers.get(2391).getCompany());
	}

	@Test
	@DisplayName("Record 2392: Address is 6669 Old Dominion Dr")
	void AddressOfRecord2392() {
		assertEquals("6669 Old Dominion Dr", customers.get(2391).getAddress());
	}

	@Test
	@DisplayName("Record 2392: City is Mc Lean")
	void CityOfRecord2392() {
		assertEquals("Mc Lean", customers.get(2391).getCity());
	}

	@Test
	@DisplayName("Record 2392: County is Fairfax")
	void CountyOfRecord2392() {
		assertEquals("Fairfax", customers.get(2391).getCounty());
	}

	@Test
	@DisplayName("Record 2392: State is VA")
	void StateOfRecord2392() {
		assertEquals("VA", customers.get(2391).getState());
	}

	@Test
	@DisplayName("Record 2392: ZIP is 22101")
	void ZIPOfRecord2392() {
		assertEquals("22101", customers.get(2391).getZIP());
	}

	@Test
	@DisplayName("Record 2392: Phone is 703-821-3069")
	void PhoneOfRecord2392() {
		assertEquals("703-821-3069", customers.get(2391).getPhone());
	}

	@Test
	@DisplayName("Record 2392: Fax is 703-821-1599")
	void FaxOfRecord2392() {
		assertEquals("703-821-1599", customers.get(2391).getFax());
	}

	@Test
	@DisplayName("Record 2392: Email is orval@vetterick.com")
	void EmailOfRecord2392() {
		assertEquals("orval@vetterick.com", customers.get(2391).getEmail());
	}

	@Test
	@DisplayName("Record 2392: Web is http://www.orvalvetterick.com")
	void WebOfRecord2392() {
		assertEquals("http://www.orvalvetterick.com", customers.get(2391).getWeb());
	}
}
