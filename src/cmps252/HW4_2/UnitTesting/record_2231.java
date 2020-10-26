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

@Tag("0")
class Record_2231 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2231: FirstName is Shon")
	void FirstNameOfRecord2231() {
		assertEquals("Shon", customers.get(2230).getFirstName());
	}

	@Test
	@DisplayName("Record 2231: LastName is Ossowski")
	void LastNameOfRecord2231() {
		assertEquals("Ossowski", customers.get(2230).getLastName());
	}

	@Test
	@DisplayName("Record 2231: Company is Strecker Title Agency Inc")
	void CompanyOfRecord2231() {
		assertEquals("Strecker Title Agency Inc", customers.get(2230).getCompany());
	}

	@Test
	@DisplayName("Record 2231: Address is 102 Versailles Blvd")
	void AddressOfRecord2231() {
		assertEquals("102 Versailles Blvd", customers.get(2230).getAddress());
	}

	@Test
	@DisplayName("Record 2231: City is Lafayette")
	void CityOfRecord2231() {
		assertEquals("Lafayette", customers.get(2230).getCity());
	}

	@Test
	@DisplayName("Record 2231: County is Lafayette")
	void CountyOfRecord2231() {
		assertEquals("Lafayette", customers.get(2230).getCounty());
	}

	@Test
	@DisplayName("Record 2231: State is LA")
	void StateOfRecord2231() {
		assertEquals("LA", customers.get(2230).getState());
	}

	@Test
	@DisplayName("Record 2231: ZIP is 70501")
	void ZIPOfRecord2231() {
		assertEquals("70501", customers.get(2230).getZIP());
	}

	@Test
	@DisplayName("Record 2231: Phone is 337-266-0887")
	void PhoneOfRecord2231() {
		assertEquals("337-266-0887", customers.get(2230).getPhone());
	}

	@Test
	@DisplayName("Record 2231: Fax is 337-266-8526")
	void FaxOfRecord2231() {
		assertEquals("337-266-8526", customers.get(2230).getFax());
	}

	@Test
	@DisplayName("Record 2231: Email is shon@ossowski.com")
	void EmailOfRecord2231() {
		assertEquals("shon@ossowski.com", customers.get(2230).getEmail());
	}

	@Test
	@DisplayName("Record 2231: Web is http://www.shonossowski.com")
	void WebOfRecord2231() {
		assertEquals("http://www.shonossowski.com", customers.get(2230).getWeb());
	}
}
