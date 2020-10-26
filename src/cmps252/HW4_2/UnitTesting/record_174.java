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
class Record_174 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 174: FirstName is Dwain")
	void FirstNameOfRecord174() {
		assertEquals("Dwain", customers.get(173).getFirstName());
	}

	@Test
	@DisplayName("Record 174: LastName is Saturnio")
	void LastNameOfRecord174() {
		assertEquals("Saturnio", customers.get(173).getLastName());
	}

	@Test
	@DisplayName("Record 174: Company is Nordic Ware Industrial Oper")
	void CompanyOfRecord174() {
		assertEquals("Nordic Ware Industrial Oper", customers.get(173).getCompany());
	}

	@Test
	@DisplayName("Record 174: Address is 8931 J St")
	void AddressOfRecord174() {
		assertEquals("8931 J St", customers.get(173).getAddress());
	}

	@Test
	@DisplayName("Record 174: City is Omaha")
	void CityOfRecord174() {
		assertEquals("Omaha", customers.get(173).getCity());
	}

	@Test
	@DisplayName("Record 174: County is Douglas")
	void CountyOfRecord174() {
		assertEquals("Douglas", customers.get(173).getCounty());
	}

	@Test
	@DisplayName("Record 174: State is NE")
	void StateOfRecord174() {
		assertEquals("NE", customers.get(173).getState());
	}

	@Test
	@DisplayName("Record 174: ZIP is 68127")
	void ZIPOfRecord174() {
		assertEquals("68127", customers.get(173).getZIP());
	}

	@Test
	@DisplayName("Record 174: Phone is 402-592-8105")
	void PhoneOfRecord174() {
		assertEquals("402-592-8105", customers.get(173).getPhone());
	}

	@Test
	@DisplayName("Record 174: Fax is 402-592-2246")
	void FaxOfRecord174() {
		assertEquals("402-592-2246", customers.get(173).getFax());
	}

	@Test
	@DisplayName("Record 174: Email is dwain@saturnio.com")
	void EmailOfRecord174() {
		assertEquals("dwain@saturnio.com", customers.get(173).getEmail());
	}

	@Test
	@DisplayName("Record 174: Web is http://www.dwainsaturnio.com")
	void WebOfRecord174() {
		assertEquals("http://www.dwainsaturnio.com", customers.get(173).getWeb());
	}
}
