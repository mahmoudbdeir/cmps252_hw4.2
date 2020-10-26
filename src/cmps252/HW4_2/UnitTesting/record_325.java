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
class Record_325 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 325: FirstName is Ross")
	void FirstNameOfRecord325() {
		assertEquals("Ross", customers.get(324).getFirstName());
	}

	@Test
	@DisplayName("Record 325: LastName is Yaekel")
	void LastNameOfRecord325() {
		assertEquals("Yaekel", customers.get(324).getLastName());
	}

	@Test
	@DisplayName("Record 325: Company is Jdr Microdevices")
	void CompanyOfRecord325() {
		assertEquals("Jdr Microdevices", customers.get(324).getCompany());
	}

	@Test
	@DisplayName("Record 325: Address is 1311 Woodland Ave")
	void AddressOfRecord325() {
		assertEquals("1311 Woodland Ave", customers.get(324).getAddress());
	}

	@Test
	@DisplayName("Record 325: City is Modesto")
	void CityOfRecord325() {
		assertEquals("Modesto", customers.get(324).getCity());
	}

	@Test
	@DisplayName("Record 325: County is Stanislaus")
	void CountyOfRecord325() {
		assertEquals("Stanislaus", customers.get(324).getCounty());
	}

	@Test
	@DisplayName("Record 325: State is CA")
	void StateOfRecord325() {
		assertEquals("CA", customers.get(324).getState());
	}

	@Test
	@DisplayName("Record 325: ZIP is 95351")
	void ZIPOfRecord325() {
		assertEquals("95351", customers.get(324).getZIP());
	}

	@Test
	@DisplayName("Record 325: Phone is 209-529-2859")
	void PhoneOfRecord325() {
		assertEquals("209-529-2859", customers.get(324).getPhone());
	}

	@Test
	@DisplayName("Record 325: Fax is 209-529-1135")
	void FaxOfRecord325() {
		assertEquals("209-529-1135", customers.get(324).getFax());
	}

	@Test
	@DisplayName("Record 325: Email is ross@yaekel.com")
	void EmailOfRecord325() {
		assertEquals("ross@yaekel.com", customers.get(324).getEmail());
	}

	@Test
	@DisplayName("Record 325: Web is http://www.rossyaekel.com")
	void WebOfRecord325() {
		assertEquals("http://www.rossyaekel.com", customers.get(324).getWeb());
	}
}
