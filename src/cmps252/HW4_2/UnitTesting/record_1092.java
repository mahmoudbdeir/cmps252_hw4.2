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

@Tag("16")
class Record_1092 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1092: FirstName is Michell")
	void FirstNameOfRecord1092() {
		assertEquals("Michell", customers.get(1091).getFirstName());
	}

	@Test
	@DisplayName("Record 1092: LastName is Kannenberg")
	void LastNameOfRecord1092() {
		assertEquals("Kannenberg", customers.get(1091).getLastName());
	}

	@Test
	@DisplayName("Record 1092: Company is Darin & Gerjel")
	void CompanyOfRecord1092() {
		assertEquals("Darin & Gerjel", customers.get(1091).getCompany());
	}

	@Test
	@DisplayName("Record 1092: Address is 711 W 17th St")
	void AddressOfRecord1092() {
		assertEquals("711 W 17th St", customers.get(1091).getAddress());
	}

	@Test
	@DisplayName("Record 1092: City is Costa Mesa")
	void CityOfRecord1092() {
		assertEquals("Costa Mesa", customers.get(1091).getCity());
	}

	@Test
	@DisplayName("Record 1092: County is Orange")
	void CountyOfRecord1092() {
		assertEquals("Orange", customers.get(1091).getCounty());
	}

	@Test
	@DisplayName("Record 1092: State is CA")
	void StateOfRecord1092() {
		assertEquals("CA", customers.get(1091).getState());
	}

	@Test
	@DisplayName("Record 1092: ZIP is 92627")
	void ZIPOfRecord1092() {
		assertEquals("92627", customers.get(1091).getZIP());
	}

	@Test
	@DisplayName("Record 1092: Phone is 949-642-0033")
	void PhoneOfRecord1092() {
		assertEquals("949-642-0033", customers.get(1091).getPhone());
	}

	@Test
	@DisplayName("Record 1092: Fax is 949-642-2703")
	void FaxOfRecord1092() {
		assertEquals("949-642-2703", customers.get(1091).getFax());
	}

	@Test
	@DisplayName("Record 1092: Email is michell@kannenberg.com")
	void EmailOfRecord1092() {
		assertEquals("michell@kannenberg.com", customers.get(1091).getEmail());
	}

	@Test
	@DisplayName("Record 1092: Web is http://www.michellkannenberg.com")
	void WebOfRecord1092() {
		assertEquals("http://www.michellkannenberg.com", customers.get(1091).getWeb());
	}
}
