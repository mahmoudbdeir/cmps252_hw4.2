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

@Tag("32")
class Record_2834 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2834: FirstName is Neal")
	void FirstNameOfRecord2834() {
		assertEquals("Neal", customers.get(2833).getFirstName());
	}

	@Test
	@DisplayName("Record 2834: LastName is Nguy")
	void LastNameOfRecord2834() {
		assertEquals("Nguy", customers.get(2833).getLastName());
	}

	@Test
	@DisplayName("Record 2834: Company is Active Screw & Fastener")
	void CompanyOfRecord2834() {
		assertEquals("Active Screw & Fastener", customers.get(2833).getCompany());
	}

	@Test
	@DisplayName("Record 2834: Address is 3635 Rombouts Ave")
	void AddressOfRecord2834() {
		assertEquals("3635 Rombouts Ave", customers.get(2833).getAddress());
	}

	@Test
	@DisplayName("Record 2834: City is Bronx")
	void CityOfRecord2834() {
		assertEquals("Bronx", customers.get(2833).getCity());
	}

	@Test
	@DisplayName("Record 2834: County is Bronx")
	void CountyOfRecord2834() {
		assertEquals("Bronx", customers.get(2833).getCounty());
	}

	@Test
	@DisplayName("Record 2834: State is NY")
	void StateOfRecord2834() {
		assertEquals("NY", customers.get(2833).getState());
	}

	@Test
	@DisplayName("Record 2834: ZIP is 10466")
	void ZIPOfRecord2834() {
		assertEquals("10466", customers.get(2833).getZIP());
	}

	@Test
	@DisplayName("Record 2834: Phone is 718-994-5464")
	void PhoneOfRecord2834() {
		assertEquals("718-994-5464", customers.get(2833).getPhone());
	}

	@Test
	@DisplayName("Record 2834: Fax is 718-994-3468")
	void FaxOfRecord2834() {
		assertEquals("718-994-3468", customers.get(2833).getFax());
	}

	@Test
	@DisplayName("Record 2834: Email is neal@nguy.com")
	void EmailOfRecord2834() {
		assertEquals("neal@nguy.com", customers.get(2833).getEmail());
	}

	@Test
	@DisplayName("Record 2834: Web is http://www.nealnguy.com")
	void WebOfRecord2834() {
		assertEquals("http://www.nealnguy.com", customers.get(2833).getWeb());
	}
}
