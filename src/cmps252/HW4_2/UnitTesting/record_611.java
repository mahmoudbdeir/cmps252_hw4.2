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

@Tag("6")
class Record_611 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 611: FirstName is Dane")
	void FirstNameOfRecord611() {
		assertEquals("Dane", customers.get(610).getFirstName());
	}

	@Test
	@DisplayName("Record 611: LastName is Puhr")
	void LastNameOfRecord611() {
		assertEquals("Puhr", customers.get(610).getLastName());
	}

	@Test
	@DisplayName("Record 611: Company is Elmo Mfg Co Inc")
	void CompanyOfRecord611() {
		assertEquals("Elmo Mfg Co Inc", customers.get(610).getCompany());
	}

	@Test
	@DisplayName("Record 611: Address is 2630 S Virginia St")
	void AddressOfRecord611() {
		assertEquals("2630 S Virginia St", customers.get(610).getAddress());
	}

	@Test
	@DisplayName("Record 611: City is Reno")
	void CityOfRecord611() {
		assertEquals("Reno", customers.get(610).getCity());
	}

	@Test
	@DisplayName("Record 611: County is Washoe")
	void CountyOfRecord611() {
		assertEquals("Washoe", customers.get(610).getCounty());
	}

	@Test
	@DisplayName("Record 611: State is NV")
	void StateOfRecord611() {
		assertEquals("NV", customers.get(610).getState());
	}

	@Test
	@DisplayName("Record 611: ZIP is 89502")
	void ZIPOfRecord611() {
		assertEquals("89502", customers.get(610).getZIP());
	}

	@Test
	@DisplayName("Record 611: Phone is 775-828-3204")
	void PhoneOfRecord611() {
		assertEquals("775-828-3204", customers.get(610).getPhone());
	}

	@Test
	@DisplayName("Record 611: Fax is 775-828-6842")
	void FaxOfRecord611() {
		assertEquals("775-828-6842", customers.get(610).getFax());
	}

	@Test
	@DisplayName("Record 611: Email is dane@puhr.com")
	void EmailOfRecord611() {
		assertEquals("dane@puhr.com", customers.get(610).getEmail());
	}

	@Test
	@DisplayName("Record 611: Web is http://www.danepuhr.com")
	void WebOfRecord611() {
		assertEquals("http://www.danepuhr.com", customers.get(610).getWeb());
	}
}
