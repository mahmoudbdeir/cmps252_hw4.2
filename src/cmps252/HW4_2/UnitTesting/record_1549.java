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

@Tag("29")
class Record_1549 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1549: FirstName is Dwain")
	void FirstNameOfRecord1549() {
		assertEquals("Dwain", customers.get(1548).getFirstName());
	}

	@Test
	@DisplayName("Record 1549: LastName is Klavuhn")
	void LastNameOfRecord1549() {
		assertEquals("Klavuhn", customers.get(1548).getLastName());
	}

	@Test
	@DisplayName("Record 1549: Company is Gilban Bldg Co")
	void CompanyOfRecord1549() {
		assertEquals("Gilban Bldg Co", customers.get(1548).getCompany());
	}

	@Test
	@DisplayName("Record 1549: Address is 586 Morrison St")
	void AddressOfRecord1549() {
		assertEquals("586 Morrison St", customers.get(1548).getAddress());
	}

	@Test
	@DisplayName("Record 1549: City is Watertown")
	void CityOfRecord1549() {
		assertEquals("Watertown", customers.get(1548).getCity());
	}

	@Test
	@DisplayName("Record 1549: County is Jefferson")
	void CountyOfRecord1549() {
		assertEquals("Jefferson", customers.get(1548).getCounty());
	}

	@Test
	@DisplayName("Record 1549: State is NY")
	void StateOfRecord1549() {
		assertEquals("NY", customers.get(1548).getState());
	}

	@Test
	@DisplayName("Record 1549: ZIP is 13601")
	void ZIPOfRecord1549() {
		assertEquals("13601", customers.get(1548).getZIP());
	}

	@Test
	@DisplayName("Record 1549: Phone is 315-785-6018")
	void PhoneOfRecord1549() {
		assertEquals("315-785-6018", customers.get(1548).getPhone());
	}

	@Test
	@DisplayName("Record 1549: Fax is 315-785-5877")
	void FaxOfRecord1549() {
		assertEquals("315-785-5877", customers.get(1548).getFax());
	}

	@Test
	@DisplayName("Record 1549: Email is dwain@klavuhn.com")
	void EmailOfRecord1549() {
		assertEquals("dwain@klavuhn.com", customers.get(1548).getEmail());
	}

	@Test
	@DisplayName("Record 1549: Web is http://www.dwainklavuhn.com")
	void WebOfRecord1549() {
		assertEquals("http://www.dwainklavuhn.com", customers.get(1548).getWeb());
	}
}
