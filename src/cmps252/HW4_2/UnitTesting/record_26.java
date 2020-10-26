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

@Tag("14")
class Record_26 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 26: FirstName is Jeromy")
	void FirstNameOfRecord26() {
		assertEquals("Jeromy", customers.get(25).getFirstName());
	}

	@Test
	@DisplayName("Record 26: LastName is Dirksen")
	void LastNameOfRecord26() {
		assertEquals("Dirksen", customers.get(25).getLastName());
	}

	@Test
	@DisplayName("Record 26: Company is Automatic Mach Products Co")
	void CompanyOfRecord26() {
		assertEquals("Automatic Mach Products Co", customers.get(25).getCompany());
	}

	@Test
	@DisplayName("Record 26: Address is 12118 Bloomfield Ave")
	void AddressOfRecord26() {
		assertEquals("12118 Bloomfield Ave", customers.get(25).getAddress());
	}

	@Test
	@DisplayName("Record 26: City is Santa Fe Springs")
	void CityOfRecord26() {
		assertEquals("Santa Fe Springs", customers.get(25).getCity());
	}

	@Test
	@DisplayName("Record 26: County is Los Angeles")
	void CountyOfRecord26() {
		assertEquals("Los Angeles", customers.get(25).getCounty());
	}

	@Test
	@DisplayName("Record 26: State is CA")
	void StateOfRecord26() {
		assertEquals("CA", customers.get(25).getState());
	}

	@Test
	@DisplayName("Record 26: ZIP is 90670")
	void ZIPOfRecord26() {
		assertEquals("90670", customers.get(25).getZIP());
	}

	@Test
	@DisplayName("Record 26: Phone is 562-868-3418")
	void PhoneOfRecord26() {
		assertEquals("562-868-3418", customers.get(25).getPhone());
	}

	@Test
	@DisplayName("Record 26: Fax is 562-868-2811")
	void FaxOfRecord26() {
		assertEquals("562-868-2811", customers.get(25).getFax());
	}

	@Test
	@DisplayName("Record 26: Email is jeromy@dirksen.com")
	void EmailOfRecord26() {
		assertEquals("jeromy@dirksen.com", customers.get(25).getEmail());
	}

	@Test
	@DisplayName("Record 26: Web is http://www.jeromydirksen.com")
	void WebOfRecord26() {
		assertEquals("http://www.jeromydirksen.com", customers.get(25).getWeb());
	}
}
