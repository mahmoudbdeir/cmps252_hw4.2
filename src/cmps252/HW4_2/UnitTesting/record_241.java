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

@Tag("5")
class Record_241 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 241: FirstName is Raymond")
	void FirstNameOfRecord241() {
		assertEquals("Raymond", customers.get(240).getFirstName());
	}

	@Test
	@DisplayName("Record 241: LastName is Catanzaro")
	void LastNameOfRecord241() {
		assertEquals("Catanzaro", customers.get(240).getLastName());
	}

	@Test
	@DisplayName("Record 241: Company is Arthur Murray Intrntl Inc")
	void CompanyOfRecord241() {
		assertEquals("Arthur Murray Intrntl Inc", customers.get(240).getCompany());
	}

	@Test
	@DisplayName("Record 241: Address is 555 Abbott Dr")
	void AddressOfRecord241() {
		assertEquals("555 Abbott Dr", customers.get(240).getAddress());
	}

	@Test
	@DisplayName("Record 241: City is Broomall")
	void CityOfRecord241() {
		assertEquals("Broomall", customers.get(240).getCity());
	}

	@Test
	@DisplayName("Record 241: County is Delaware")
	void CountyOfRecord241() {
		assertEquals("Delaware", customers.get(240).getCounty());
	}

	@Test
	@DisplayName("Record 241: State is PA")
	void StateOfRecord241() {
		assertEquals("PA", customers.get(240).getState());
	}

	@Test
	@DisplayName("Record 241: ZIP is 19008")
	void ZIPOfRecord241() {
		assertEquals("19008", customers.get(240).getZIP());
	}

	@Test
	@DisplayName("Record 241: Phone is 610-544-8726")
	void PhoneOfRecord241() {
		assertEquals("610-544-8726", customers.get(240).getPhone());
	}

	@Test
	@DisplayName("Record 241: Fax is 610-544-6748")
	void FaxOfRecord241() {
		assertEquals("610-544-6748", customers.get(240).getFax());
	}

	@Test
	@DisplayName("Record 241: Email is raymond@catanzaro.com")
	void EmailOfRecord241() {
		assertEquals("raymond@catanzaro.com", customers.get(240).getEmail());
	}

	@Test
	@DisplayName("Record 241: Web is http://www.raymondcatanzaro.com")
	void WebOfRecord241() {
		assertEquals("http://www.raymondcatanzaro.com", customers.get(240).getWeb());
	}
}
