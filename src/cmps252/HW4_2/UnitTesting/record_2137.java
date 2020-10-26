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

@Tag("31")
class Record_2137 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2137: FirstName is Malinda")
	void FirstNameOfRecord2137() {
		assertEquals("Malinda", customers.get(2136).getFirstName());
	}

	@Test
	@DisplayName("Record 2137: LastName is Zaragoza")
	void LastNameOfRecord2137() {
		assertEquals("Zaragoza", customers.get(2136).getLastName());
	}

	@Test
	@DisplayName("Record 2137: Company is Souris Basin Planning Council")
	void CompanyOfRecord2137() {
		assertEquals("Souris Basin Planning Council", customers.get(2136).getCompany());
	}

	@Test
	@DisplayName("Record 2137: Address is 2600 Taft Ave")
	void AddressOfRecord2137() {
		assertEquals("2600 Taft Ave", customers.get(2136).getAddress());
	}

	@Test
	@DisplayName("Record 2137: City is Orlando")
	void CityOfRecord2137() {
		assertEquals("Orlando", customers.get(2136).getCity());
	}

	@Test
	@DisplayName("Record 2137: County is Orange")
	void CountyOfRecord2137() {
		assertEquals("Orange", customers.get(2136).getCounty());
	}

	@Test
	@DisplayName("Record 2137: State is FL")
	void StateOfRecord2137() {
		assertEquals("FL", customers.get(2136).getState());
	}

	@Test
	@DisplayName("Record 2137: ZIP is 32804")
	void ZIPOfRecord2137() {
		assertEquals("32804", customers.get(2136).getZIP());
	}

	@Test
	@DisplayName("Record 2137: Phone is 407-841-9008")
	void PhoneOfRecord2137() {
		assertEquals("407-841-9008", customers.get(2136).getPhone());
	}

	@Test
	@DisplayName("Record 2137: Fax is 407-841-2555")
	void FaxOfRecord2137() {
		assertEquals("407-841-2555", customers.get(2136).getFax());
	}

	@Test
	@DisplayName("Record 2137: Email is malinda@zaragoza.com")
	void EmailOfRecord2137() {
		assertEquals("malinda@zaragoza.com", customers.get(2136).getEmail());
	}

	@Test
	@DisplayName("Record 2137: Web is http://www.malindazaragoza.com")
	void WebOfRecord2137() {
		assertEquals("http://www.malindazaragoza.com", customers.get(2136).getWeb());
	}
}
