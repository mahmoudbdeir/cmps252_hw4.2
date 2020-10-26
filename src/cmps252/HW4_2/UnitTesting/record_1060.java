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

@Tag("2")
class Record_1060 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1060: FirstName is Lucius")
	void FirstNameOfRecord1060() {
		assertEquals("Lucius", customers.get(1059).getFirstName());
	}

	@Test
	@DisplayName("Record 1060: LastName is Bullivant")
	void LastNameOfRecord1060() {
		assertEquals("Bullivant", customers.get(1059).getLastName());
	}

	@Test
	@DisplayName("Record 1060: Company is Tremont House Hotel")
	void CompanyOfRecord1060() {
		assertEquals("Tremont House Hotel", customers.get(1059).getCompany());
	}

	@Test
	@DisplayName("Record 1060: Address is 11605 Sw Beaverton Hillsdale H")
	void AddressOfRecord1060() {
		assertEquals("11605 Sw Beaverton Hillsdale H", customers.get(1059).getAddress());
	}

	@Test
	@DisplayName("Record 1060: City is Beaverton")
	void CityOfRecord1060() {
		assertEquals("Beaverton", customers.get(1059).getCity());
	}

	@Test
	@DisplayName("Record 1060: County is Washington")
	void CountyOfRecord1060() {
		assertEquals("Washington", customers.get(1059).getCounty());
	}

	@Test
	@DisplayName("Record 1060: State is OR")
	void StateOfRecord1060() {
		assertEquals("OR", customers.get(1059).getState());
	}

	@Test
	@DisplayName("Record 1060: ZIP is 97005")
	void ZIPOfRecord1060() {
		assertEquals("97005", customers.get(1059).getZIP());
	}

	@Test
	@DisplayName("Record 1060: Phone is 503-643-3853")
	void PhoneOfRecord1060() {
		assertEquals("503-643-3853", customers.get(1059).getPhone());
	}

	@Test
	@DisplayName("Record 1060: Fax is 503-643-1876")
	void FaxOfRecord1060() {
		assertEquals("503-643-1876", customers.get(1059).getFax());
	}

	@Test
	@DisplayName("Record 1060: Email is lucius@bullivant.com")
	void EmailOfRecord1060() {
		assertEquals("lucius@bullivant.com", customers.get(1059).getEmail());
	}

	@Test
	@DisplayName("Record 1060: Web is http://www.luciusbullivant.com")
	void WebOfRecord1060() {
		assertEquals("http://www.luciusbullivant.com", customers.get(1059).getWeb());
	}
}
