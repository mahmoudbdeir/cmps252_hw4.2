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

@Tag("17")
class Record_93 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 93: FirstName is Darnell")
	void FirstNameOfRecord93() {
		assertEquals("Darnell", customers.get(92).getFirstName());
	}

	@Test
	@DisplayName("Record 93: LastName is Keohane")
	void LastNameOfRecord93() {
		assertEquals("Keohane", customers.get(92).getLastName());
	}

	@Test
	@DisplayName("Record 93: Company is Los Angeles Diesel Parts Inc")
	void CompanyOfRecord93() {
		assertEquals("Los Angeles Diesel Parts Inc", customers.get(92).getCompany());
	}

	@Test
	@DisplayName("Record 93: Address is 132 2nd St")
	void AddressOfRecord93() {
		assertEquals("132 2nd St", customers.get(92).getAddress());
	}

	@Test
	@DisplayName("Record 93: City is San Francisco")
	void CityOfRecord93() {
		assertEquals("San Francisco", customers.get(92).getCity());
	}

	@Test
	@DisplayName("Record 93: County is San Francisco")
	void CountyOfRecord93() {
		assertEquals("San Francisco", customers.get(92).getCounty());
	}

	@Test
	@DisplayName("Record 93: State is CA")
	void StateOfRecord93() {
		assertEquals("CA", customers.get(92).getState());
	}

	@Test
	@DisplayName("Record 93: ZIP is 94105")
	void ZIPOfRecord93() {
		assertEquals("94105", customers.get(92).getZIP());
	}

	@Test
	@DisplayName("Record 93: Phone is 415-243-0877")
	void PhoneOfRecord93() {
		assertEquals("415-243-0877", customers.get(92).getPhone());
	}

	@Test
	@DisplayName("Record 93: Fax is 415-243-7757")
	void FaxOfRecord93() {
		assertEquals("415-243-7757", customers.get(92).getFax());
	}

	@Test
	@DisplayName("Record 93: Email is darnell@keohane.com")
	void EmailOfRecord93() {
		assertEquals("darnell@keohane.com", customers.get(92).getEmail());
	}

	@Test
	@DisplayName("Record 93: Web is http://www.darnellkeohane.com")
	void WebOfRecord93() {
		assertEquals("http://www.darnellkeohane.com", customers.get(92).getWeb());
	}
}
