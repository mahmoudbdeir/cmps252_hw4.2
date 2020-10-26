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

@Tag("15")
class Record_3915 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3915: FirstName is Clark")
	void FirstNameOfRecord3915() {
		assertEquals("Clark", customers.get(3914).getFirstName());
	}

	@Test
	@DisplayName("Record 3915: LastName is Brunken")
	void LastNameOfRecord3915() {
		assertEquals("Brunken", customers.get(3914).getLastName());
	}

	@Test
	@DisplayName("Record 3915: Company is Lamb Wire Line Service")
	void CompanyOfRecord3915() {
		assertEquals("Lamb Wire Line Service", customers.get(3914).getCompany());
	}

	@Test
	@DisplayName("Record 3915: Address is 1020 Juarez Ave")
	void AddressOfRecord3915() {
		assertEquals("1020 Juarez Ave", customers.get(3914).getAddress());
	}

	@Test
	@DisplayName("Record 3915: City is Laredo")
	void CityOfRecord3915() {
		assertEquals("Laredo", customers.get(3914).getCity());
	}

	@Test
	@DisplayName("Record 3915: County is Webb")
	void CountyOfRecord3915() {
		assertEquals("Webb", customers.get(3914).getCounty());
	}

	@Test
	@DisplayName("Record 3915: State is TX")
	void StateOfRecord3915() {
		assertEquals("TX", customers.get(3914).getState());
	}

	@Test
	@DisplayName("Record 3915: ZIP is 78040")
	void ZIPOfRecord3915() {
		assertEquals("78040", customers.get(3914).getZIP());
	}

	@Test
	@DisplayName("Record 3915: Phone is 956-723-2097")
	void PhoneOfRecord3915() {
		assertEquals("956-723-2097", customers.get(3914).getPhone());
	}

	@Test
	@DisplayName("Record 3915: Fax is 956-723-1126")
	void FaxOfRecord3915() {
		assertEquals("956-723-1126", customers.get(3914).getFax());
	}

	@Test
	@DisplayName("Record 3915: Email is clark@brunken.com")
	void EmailOfRecord3915() {
		assertEquals("clark@brunken.com", customers.get(3914).getEmail());
	}

	@Test
	@DisplayName("Record 3915: Web is http://www.clarkbrunken.com")
	void WebOfRecord3915() {
		assertEquals("http://www.clarkbrunken.com", customers.get(3914).getWeb());
	}
}
