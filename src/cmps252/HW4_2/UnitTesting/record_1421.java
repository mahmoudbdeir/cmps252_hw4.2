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

@Tag("0")
class Record_1421 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1421: FirstName is Cheri")
	void FirstNameOfRecord1421() {
		assertEquals("Cheri", customers.get(1420).getFirstName());
	}

	@Test
	@DisplayName("Record 1421: LastName is Bordeau")
	void LastNameOfRecord1421() {
		assertEquals("Bordeau", customers.get(1420).getLastName());
	}

	@Test
	@DisplayName("Record 1421: Company is Mayfair Molded Products Corp")
	void CompanyOfRecord1421() {
		assertEquals("Mayfair Molded Products Corp", customers.get(1420).getCompany());
	}

	@Test
	@DisplayName("Record 1421: Address is 2221 34th St")
	void AddressOfRecord1421() {
		assertEquals("2221 34th St", customers.get(1420).getAddress());
	}

	@Test
	@DisplayName("Record 1421: City is Gulfport")
	void CityOfRecord1421() {
		assertEquals("Gulfport", customers.get(1420).getCity());
	}

	@Test
	@DisplayName("Record 1421: County is Harrison")
	void CountyOfRecord1421() {
		assertEquals("Harrison", customers.get(1420).getCounty());
	}

	@Test
	@DisplayName("Record 1421: State is MS")
	void StateOfRecord1421() {
		assertEquals("MS", customers.get(1420).getState());
	}

	@Test
	@DisplayName("Record 1421: ZIP is 39501")
	void ZIPOfRecord1421() {
		assertEquals("39501", customers.get(1420).getZIP());
	}

	@Test
	@DisplayName("Record 1421: Phone is 228-864-0565")
	void PhoneOfRecord1421() {
		assertEquals("228-864-0565", customers.get(1420).getPhone());
	}

	@Test
	@DisplayName("Record 1421: Fax is 228-864-9809")
	void FaxOfRecord1421() {
		assertEquals("228-864-9809", customers.get(1420).getFax());
	}

	@Test
	@DisplayName("Record 1421: Email is cheri@bordeau.com")
	void EmailOfRecord1421() {
		assertEquals("cheri@bordeau.com", customers.get(1420).getEmail());
	}

	@Test
	@DisplayName("Record 1421: Web is http://www.cheribordeau.com")
	void WebOfRecord1421() {
		assertEquals("http://www.cheribordeau.com", customers.get(1420).getWeb());
	}
}
