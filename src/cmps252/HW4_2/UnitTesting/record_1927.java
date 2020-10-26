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
class Record_1927 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1927: FirstName is Rafaela")
	void FirstNameOfRecord1927() {
		assertEquals("Rafaela", customers.get(1926).getFirstName());
	}

	@Test
	@DisplayName("Record 1927: LastName is Delash")
	void LastNameOfRecord1927() {
		assertEquals("Delash", customers.get(1926).getLastName());
	}

	@Test
	@DisplayName("Record 1927: Company is Lysure World")
	void CompanyOfRecord1927() {
		assertEquals("Lysure World", customers.get(1926).getCompany());
	}

	@Test
	@DisplayName("Record 1927: Address is 36 Charles St")
	void AddressOfRecord1927() {
		assertEquals("36 Charles St", customers.get(1926).getAddress());
	}

	@Test
	@DisplayName("Record 1927: City is Cambridge")
	void CityOfRecord1927() {
		assertEquals("Cambridge", customers.get(1926).getCity());
	}

	@Test
	@DisplayName("Record 1927: County is Middlesex")
	void CountyOfRecord1927() {
		assertEquals("Middlesex", customers.get(1926).getCounty());
	}

	@Test
	@DisplayName("Record 1927: State is MA")
	void StateOfRecord1927() {
		assertEquals("MA", customers.get(1926).getState());
	}

	@Test
	@DisplayName("Record 1927: ZIP is 2141")
	void ZIPOfRecord1927() {
		assertEquals("2141", customers.get(1926).getZIP());
	}

	@Test
	@DisplayName("Record 1927: Phone is 617-547-2607")
	void PhoneOfRecord1927() {
		assertEquals("617-547-2607", customers.get(1926).getPhone());
	}

	@Test
	@DisplayName("Record 1927: Fax is 617-547-9439")
	void FaxOfRecord1927() {
		assertEquals("617-547-9439", customers.get(1926).getFax());
	}

	@Test
	@DisplayName("Record 1927: Email is rafaela@delash.com")
	void EmailOfRecord1927() {
		assertEquals("rafaela@delash.com", customers.get(1926).getEmail());
	}

	@Test
	@DisplayName("Record 1927: Web is http://www.rafaeladelash.com")
	void WebOfRecord1927() {
		assertEquals("http://www.rafaeladelash.com", customers.get(1926).getWeb());
	}
}
