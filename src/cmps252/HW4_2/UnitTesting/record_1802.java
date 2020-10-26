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

@Tag("22")
class Record_1802 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1802: FirstName is Sung")
	void FirstNameOfRecord1802() {
		assertEquals("Sung", customers.get(1801).getFirstName());
	}

	@Test
	@DisplayName("Record 1802: LastName is Lichtenfeld")
	void LastNameOfRecord1802() {
		assertEquals("Lichtenfeld", customers.get(1801).getLastName());
	}

	@Test
	@DisplayName("Record 1802: Company is Pruitt, Robert G Iii")
	void CompanyOfRecord1802() {
		assertEquals("Pruitt, Robert G Iii", customers.get(1801).getCompany());
	}

	@Test
	@DisplayName("Record 1802: Address is 2905 W Lincoln St")
	void AddressOfRecord1802() {
		assertEquals("2905 W Lincoln St", customers.get(1801).getAddress());
	}

	@Test
	@DisplayName("Record 1802: City is Phoenix")
	void CityOfRecord1802() {
		assertEquals("Phoenix", customers.get(1801).getCity());
	}

	@Test
	@DisplayName("Record 1802: County is Maricopa")
	void CountyOfRecord1802() {
		assertEquals("Maricopa", customers.get(1801).getCounty());
	}

	@Test
	@DisplayName("Record 1802: State is AZ")
	void StateOfRecord1802() {
		assertEquals("AZ", customers.get(1801).getState());
	}

	@Test
	@DisplayName("Record 1802: ZIP is 85009")
	void ZIPOfRecord1802() {
		assertEquals("85009", customers.get(1801).getZIP());
	}

	@Test
	@DisplayName("Record 1802: Phone is 602-269-5370")
	void PhoneOfRecord1802() {
		assertEquals("602-269-5370", customers.get(1801).getPhone());
	}

	@Test
	@DisplayName("Record 1802: Fax is 602-269-5695")
	void FaxOfRecord1802() {
		assertEquals("602-269-5695", customers.get(1801).getFax());
	}

	@Test
	@DisplayName("Record 1802: Email is sung@lichtenfeld.com")
	void EmailOfRecord1802() {
		assertEquals("sung@lichtenfeld.com", customers.get(1801).getEmail());
	}

	@Test
	@DisplayName("Record 1802: Web is http://www.sunglichtenfeld.com")
	void WebOfRecord1802() {
		assertEquals("http://www.sunglichtenfeld.com", customers.get(1801).getWeb());
	}
}
