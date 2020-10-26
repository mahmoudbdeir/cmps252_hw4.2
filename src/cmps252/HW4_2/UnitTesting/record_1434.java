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

@Tag("47")
class Record_1434 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1434: FirstName is Alice")
	void FirstNameOfRecord1434() {
		assertEquals("Alice", customers.get(1433).getFirstName());
	}

	@Test
	@DisplayName("Record 1434: LastName is Fishbyn")
	void LastNameOfRecord1434() {
		assertEquals("Fishbyn", customers.get(1433).getLastName());
	}

	@Test
	@DisplayName("Record 1434: Company is Industrial Hydraulic Co Inc")
	void CompanyOfRecord1434() {
		assertEquals("Industrial Hydraulic Co Inc", customers.get(1433).getCompany());
	}

	@Test
	@DisplayName("Record 1434: Address is 2276 Pahounui Dr")
	void AddressOfRecord1434() {
		assertEquals("2276 Pahounui Dr", customers.get(1433).getAddress());
	}

	@Test
	@DisplayName("Record 1434: City is Honolulu")
	void CityOfRecord1434() {
		assertEquals("Honolulu", customers.get(1433).getCity());
	}

	@Test
	@DisplayName("Record 1434: County is Honolulu")
	void CountyOfRecord1434() {
		assertEquals("Honolulu", customers.get(1433).getCounty());
	}

	@Test
	@DisplayName("Record 1434: State is HI")
	void StateOfRecord1434() {
		assertEquals("HI", customers.get(1433).getState());
	}

	@Test
	@DisplayName("Record 1434: ZIP is 96819")
	void ZIPOfRecord1434() {
		assertEquals("96819", customers.get(1433).getZIP());
	}

	@Test
	@DisplayName("Record 1434: Phone is 808-842-4764")
	void PhoneOfRecord1434() {
		assertEquals("808-842-4764", customers.get(1433).getPhone());
	}

	@Test
	@DisplayName("Record 1434: Fax is 808-842-3787")
	void FaxOfRecord1434() {
		assertEquals("808-842-3787", customers.get(1433).getFax());
	}

	@Test
	@DisplayName("Record 1434: Email is alice@fishbyn.com")
	void EmailOfRecord1434() {
		assertEquals("alice@fishbyn.com", customers.get(1433).getEmail());
	}

	@Test
	@DisplayName("Record 1434: Web is http://www.alicefishbyn.com")
	void WebOfRecord1434() {
		assertEquals("http://www.alicefishbyn.com", customers.get(1433).getWeb());
	}
}
