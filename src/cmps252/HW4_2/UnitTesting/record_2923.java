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
class Record_2923 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2923: FirstName is Richard")
	void FirstNameOfRecord2923() {
		assertEquals("Richard", customers.get(2922).getFirstName());
	}

	@Test
	@DisplayName("Record 2923: LastName is Vasilauskas")
	void LastNameOfRecord2923() {
		assertEquals("Vasilauskas", customers.get(2922).getLastName());
	}

	@Test
	@DisplayName("Record 2923: Company is American Precision Plas Corp")
	void CompanyOfRecord2923() {
		assertEquals("American Precision Plas Corp", customers.get(2922).getCompany());
	}

	@Test
	@DisplayName("Record 2923: Address is 72 Knowlton St")
	void AddressOfRecord2923() {
		assertEquals("72 Knowlton St", customers.get(2922).getAddress());
	}

	@Test
	@DisplayName("Record 2923: City is Bridgeport")
	void CityOfRecord2923() {
		assertEquals("Bridgeport", customers.get(2922).getCity());
	}

	@Test
	@DisplayName("Record 2923: County is Fairfield")
	void CountyOfRecord2923() {
		assertEquals("Fairfield", customers.get(2922).getCounty());
	}

	@Test
	@DisplayName("Record 2923: State is CT")
	void StateOfRecord2923() {
		assertEquals("CT", customers.get(2922).getState());
	}

	@Test
	@DisplayName("Record 2923: ZIP is 6608")
	void ZIPOfRecord2923() {
		assertEquals("6608", customers.get(2922).getZIP());
	}

	@Test
	@DisplayName("Record 2923: Phone is 203-367-7706")
	void PhoneOfRecord2923() {
		assertEquals("203-367-7706", customers.get(2922).getPhone());
	}

	@Test
	@DisplayName("Record 2923: Fax is 203-367-9046")
	void FaxOfRecord2923() {
		assertEquals("203-367-9046", customers.get(2922).getFax());
	}

	@Test
	@DisplayName("Record 2923: Email is richard@vasilauskas.com")
	void EmailOfRecord2923() {
		assertEquals("richard@vasilauskas.com", customers.get(2922).getEmail());
	}

	@Test
	@DisplayName("Record 2923: Web is http://www.richardvasilauskas.com")
	void WebOfRecord2923() {
		assertEquals("http://www.richardvasilauskas.com", customers.get(2922).getWeb());
	}
}
