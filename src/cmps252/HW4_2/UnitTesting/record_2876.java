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
class Record_2876 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2876: FirstName is Sam")
	void FirstNameOfRecord2876() {
		assertEquals("Sam", customers.get(2875).getFirstName());
	}

	@Test
	@DisplayName("Record 2876: LastName is Stergios")
	void LastNameOfRecord2876() {
		assertEquals("Stergios", customers.get(2875).getLastName());
	}

	@Test
	@DisplayName("Record 2876: Company is Oasis Pools")
	void CompanyOfRecord2876() {
		assertEquals("Oasis Pools", customers.get(2875).getCompany());
	}

	@Test
	@DisplayName("Record 2876: Address is 100 Grove St")
	void AddressOfRecord2876() {
		assertEquals("100 Grove St", customers.get(2875).getAddress());
	}

	@Test
	@DisplayName("Record 2876: City is Worcester")
	void CityOfRecord2876() {
		assertEquals("Worcester", customers.get(2875).getCity());
	}

	@Test
	@DisplayName("Record 2876: County is Worcester")
	void CountyOfRecord2876() {
		assertEquals("Worcester", customers.get(2875).getCounty());
	}

	@Test
	@DisplayName("Record 2876: State is MA")
	void StateOfRecord2876() {
		assertEquals("MA", customers.get(2875).getState());
	}

	@Test
	@DisplayName("Record 2876: ZIP is 1605")
	void ZIPOfRecord2876() {
		assertEquals("1605", customers.get(2875).getZIP());
	}

	@Test
	@DisplayName("Record 2876: Phone is 508-754-8267")
	void PhoneOfRecord2876() {
		assertEquals("508-754-8267", customers.get(2875).getPhone());
	}

	@Test
	@DisplayName("Record 2876: Fax is 508-754-6981")
	void FaxOfRecord2876() {
		assertEquals("508-754-6981", customers.get(2875).getFax());
	}

	@Test
	@DisplayName("Record 2876: Email is sam@stergios.com")
	void EmailOfRecord2876() {
		assertEquals("sam@stergios.com", customers.get(2875).getEmail());
	}

	@Test
	@DisplayName("Record 2876: Web is http://www.samstergios.com")
	void WebOfRecord2876() {
		assertEquals("http://www.samstergios.com", customers.get(2875).getWeb());
	}
}
