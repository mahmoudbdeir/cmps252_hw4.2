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

@Tag("21")
class Record_2454 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2454: FirstName is Elise")
	void FirstNameOfRecord2454() {
		assertEquals("Elise", customers.get(2453).getFirstName());
	}

	@Test
	@DisplayName("Record 2454: LastName is Grennon")
	void LastNameOfRecord2454() {
		assertEquals("Grennon", customers.get(2453).getLastName());
	}

	@Test
	@DisplayName("Record 2454: Company is Mullanax, M Greg Esq")
	void CompanyOfRecord2454() {
		assertEquals("Mullanax, M Greg Esq", customers.get(2453).getCompany());
	}

	@Test
	@DisplayName("Record 2454: Address is 1554 Westbank Expy")
	void AddressOfRecord2454() {
		assertEquals("1554 Westbank Expy", customers.get(2453).getAddress());
	}

	@Test
	@DisplayName("Record 2454: City is Westwego")
	void CityOfRecord2454() {
		assertEquals("Westwego", customers.get(2453).getCity());
	}

	@Test
	@DisplayName("Record 2454: County is Jefferson")
	void CountyOfRecord2454() {
		assertEquals("Jefferson", customers.get(2453).getCounty());
	}

	@Test
	@DisplayName("Record 2454: State is LA")
	void StateOfRecord2454() {
		assertEquals("LA", customers.get(2453).getState());
	}

	@Test
	@DisplayName("Record 2454: ZIP is 70094")
	void ZIPOfRecord2454() {
		assertEquals("70094", customers.get(2453).getZIP());
	}

	@Test
	@DisplayName("Record 2454: Phone is 504-349-9916")
	void PhoneOfRecord2454() {
		assertEquals("504-349-9916", customers.get(2453).getPhone());
	}

	@Test
	@DisplayName("Record 2454: Fax is 504-349-5402")
	void FaxOfRecord2454() {
		assertEquals("504-349-5402", customers.get(2453).getFax());
	}

	@Test
	@DisplayName("Record 2454: Email is elise@grennon.com")
	void EmailOfRecord2454() {
		assertEquals("elise@grennon.com", customers.get(2453).getEmail());
	}

	@Test
	@DisplayName("Record 2454: Web is http://www.elisegrennon.com")
	void WebOfRecord2454() {
		assertEquals("http://www.elisegrennon.com", customers.get(2453).getWeb());
	}
}
