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
class Record_1981 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1981: FirstName is Eula")
	void FirstNameOfRecord1981() {
		assertEquals("Eula", customers.get(1980).getFirstName());
	}

	@Test
	@DisplayName("Record 1981: LastName is Baltrip")
	void LastNameOfRecord1981() {
		assertEquals("Baltrip", customers.get(1980).getLastName());
	}

	@Test
	@DisplayName("Record 1981: Company is North Ridge Glass & Mir Co Inc")
	void CompanyOfRecord1981() {
		assertEquals("North Ridge Glass & Mir Co Inc", customers.get(1980).getCompany());
	}

	@Test
	@DisplayName("Record 1981: Address is 2720 N Stemmons Fwy")
	void AddressOfRecord1981() {
		assertEquals("2720 N Stemmons Fwy", customers.get(1980).getAddress());
	}

	@Test
	@DisplayName("Record 1981: City is Dallas")
	void CityOfRecord1981() {
		assertEquals("Dallas", customers.get(1980).getCity());
	}

	@Test
	@DisplayName("Record 1981: County is Dallas")
	void CountyOfRecord1981() {
		assertEquals("Dallas", customers.get(1980).getCounty());
	}

	@Test
	@DisplayName("Record 1981: State is TX")
	void StateOfRecord1981() {
		assertEquals("TX", customers.get(1980).getState());
	}

	@Test
	@DisplayName("Record 1981: ZIP is 75207")
	void ZIPOfRecord1981() {
		assertEquals("75207", customers.get(1980).getZIP());
	}

	@Test
	@DisplayName("Record 1981: Phone is 214-637-4408")
	void PhoneOfRecord1981() {
		assertEquals("214-637-4408", customers.get(1980).getPhone());
	}

	@Test
	@DisplayName("Record 1981: Fax is 214-637-8966")
	void FaxOfRecord1981() {
		assertEquals("214-637-8966", customers.get(1980).getFax());
	}

	@Test
	@DisplayName("Record 1981: Email is eula@baltrip.com")
	void EmailOfRecord1981() {
		assertEquals("eula@baltrip.com", customers.get(1980).getEmail());
	}

	@Test
	@DisplayName("Record 1981: Web is http://www.eulabaltrip.com")
	void WebOfRecord1981() {
		assertEquals("http://www.eulabaltrip.com", customers.get(1980).getWeb());
	}
}
