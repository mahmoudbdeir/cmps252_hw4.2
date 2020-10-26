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

@Tag("12")
class Record_3009 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3009: FirstName is Estelle")
	void FirstNameOfRecord3009() {
		assertEquals("Estelle", customers.get(3008).getFirstName());
	}

	@Test
	@DisplayName("Record 3009: LastName is Twellman")
	void LastNameOfRecord3009() {
		assertEquals("Twellman", customers.get(3008).getLastName());
	}

	@Test
	@DisplayName("Record 3009: Company is Shoults, Stephen W Esq")
	void CompanyOfRecord3009() {
		assertEquals("Shoults, Stephen W Esq", customers.get(3008).getCompany());
	}

	@Test
	@DisplayName("Record 3009: Address is 7 W Travelers Trl")
	void AddressOfRecord3009() {
		assertEquals("7 W Travelers Trl", customers.get(3008).getAddress());
	}

	@Test
	@DisplayName("Record 3009: City is Burnsville")
	void CityOfRecord3009() {
		assertEquals("Burnsville", customers.get(3008).getCity());
	}

	@Test
	@DisplayName("Record 3009: County is Dakota")
	void CountyOfRecord3009() {
		assertEquals("Dakota", customers.get(3008).getCounty());
	}

	@Test
	@DisplayName("Record 3009: State is MN")
	void StateOfRecord3009() {
		assertEquals("MN", customers.get(3008).getState());
	}

	@Test
	@DisplayName("Record 3009: ZIP is 55337")
	void ZIPOfRecord3009() {
		assertEquals("55337", customers.get(3008).getZIP());
	}

	@Test
	@DisplayName("Record 3009: Phone is 952-894-0719")
	void PhoneOfRecord3009() {
		assertEquals("952-894-0719", customers.get(3008).getPhone());
	}

	@Test
	@DisplayName("Record 3009: Fax is 952-894-8251")
	void FaxOfRecord3009() {
		assertEquals("952-894-8251", customers.get(3008).getFax());
	}

	@Test
	@DisplayName("Record 3009: Email is estelle@twellman.com")
	void EmailOfRecord3009() {
		assertEquals("estelle@twellman.com", customers.get(3008).getEmail());
	}

	@Test
	@DisplayName("Record 3009: Web is http://www.estelletwellman.com")
	void WebOfRecord3009() {
		assertEquals("http://www.estelletwellman.com", customers.get(3008).getWeb());
	}
}
