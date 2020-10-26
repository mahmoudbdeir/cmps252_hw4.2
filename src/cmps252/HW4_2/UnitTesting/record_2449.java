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

@Tag("34")
class Record_2449 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2449: FirstName is Morton")
	void FirstNameOfRecord2449() {
		assertEquals("Morton", customers.get(2448).getFirstName());
	}

	@Test
	@DisplayName("Record 2449: LastName is Ogles")
	void LastNameOfRecord2449() {
		assertEquals("Ogles", customers.get(2448).getLastName());
	}

	@Test
	@DisplayName("Record 2449: Company is Charles Schwab & Co Inc")
	void CompanyOfRecord2449() {
		assertEquals("Charles Schwab & Co Inc", customers.get(2448).getCompany());
	}

	@Test
	@DisplayName("Record 2449: Address is 419 Eccles Ave")
	void AddressOfRecord2449() {
		assertEquals("419 Eccles Ave", customers.get(2448).getAddress());
	}

	@Test
	@DisplayName("Record 2449: City is South San Francisco")
	void CityOfRecord2449() {
		assertEquals("South San Francisco", customers.get(2448).getCity());
	}

	@Test
	@DisplayName("Record 2449: County is San Mateo")
	void CountyOfRecord2449() {
		assertEquals("San Mateo", customers.get(2448).getCounty());
	}

	@Test
	@DisplayName("Record 2449: State is CA")
	void StateOfRecord2449() {
		assertEquals("CA", customers.get(2448).getState());
	}

	@Test
	@DisplayName("Record 2449: ZIP is 94080")
	void ZIPOfRecord2449() {
		assertEquals("94080", customers.get(2448).getZIP());
	}

	@Test
	@DisplayName("Record 2449: Phone is 650-583-8167")
	void PhoneOfRecord2449() {
		assertEquals("650-583-8167", customers.get(2448).getPhone());
	}

	@Test
	@DisplayName("Record 2449: Fax is 650-583-4484")
	void FaxOfRecord2449() {
		assertEquals("650-583-4484", customers.get(2448).getFax());
	}

	@Test
	@DisplayName("Record 2449: Email is morton@ogles.com")
	void EmailOfRecord2449() {
		assertEquals("morton@ogles.com", customers.get(2448).getEmail());
	}

	@Test
	@DisplayName("Record 2449: Web is http://www.mortonogles.com")
	void WebOfRecord2449() {
		assertEquals("http://www.mortonogles.com", customers.get(2448).getWeb());
	}
}
