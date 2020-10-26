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

@Tag("32")
class Record_481 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 481: FirstName is Melva")
	void FirstNameOfRecord481() {
		assertEquals("Melva", customers.get(480).getFirstName());
	}

	@Test
	@DisplayName("Record 481: LastName is Paugh")
	void LastNameOfRecord481() {
		assertEquals("Paugh", customers.get(480).getLastName());
	}

	@Test
	@DisplayName("Record 481: Company is Adamba Imports Intrntl Inc")
	void CompanyOfRecord481() {
		assertEquals("Adamba Imports Intrntl Inc", customers.get(480).getCompany());
	}

	@Test
	@DisplayName("Record 481: Address is 3403 Cavanaugh Rd")
	void AddressOfRecord481() {
		assertEquals("3403 Cavanaugh Rd", customers.get(480).getAddress());
	}

	@Test
	@DisplayName("Record 481: City is Fort Smith")
	void CityOfRecord481() {
		assertEquals("Fort Smith", customers.get(480).getCity());
	}

	@Test
	@DisplayName("Record 481: County is Sebastian")
	void CountyOfRecord481() {
		assertEquals("Sebastian", customers.get(480).getCounty());
	}

	@Test
	@DisplayName("Record 481: State is AR")
	void StateOfRecord481() {
		assertEquals("AR", customers.get(480).getState());
	}

	@Test
	@DisplayName("Record 481: ZIP is 72903")
	void ZIPOfRecord481() {
		assertEquals("72903", customers.get(480).getZIP());
	}

	@Test
	@DisplayName("Record 481: Phone is 479-646-1762")
	void PhoneOfRecord481() {
		assertEquals("479-646-1762", customers.get(480).getPhone());
	}

	@Test
	@DisplayName("Record 481: Fax is 479-646-4843")
	void FaxOfRecord481() {
		assertEquals("479-646-4843", customers.get(480).getFax());
	}

	@Test
	@DisplayName("Record 481: Email is melva@paugh.com")
	void EmailOfRecord481() {
		assertEquals("melva@paugh.com", customers.get(480).getEmail());
	}

	@Test
	@DisplayName("Record 481: Web is http://www.melvapaugh.com")
	void WebOfRecord481() {
		assertEquals("http://www.melvapaugh.com", customers.get(480).getWeb());
	}
}
