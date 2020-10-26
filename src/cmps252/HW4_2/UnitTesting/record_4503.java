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

@Tag("25")
class Record_4503 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4503: FirstName is Rico")
	void FirstNameOfRecord4503() {
		assertEquals("Rico", customers.get(4502).getFirstName());
	}

	@Test
	@DisplayName("Record 4503: LastName is Fischman")
	void LastNameOfRecord4503() {
		assertEquals("Fischman", customers.get(4502).getLastName());
	}

	@Test
	@DisplayName("Record 4503: Company is Alice Southern Equip Svc Inc")
	void CompanyOfRecord4503() {
		assertEquals("Alice Southern Equip Svc Inc", customers.get(4502).getCompany());
	}

	@Test
	@DisplayName("Record 4503: Address is 301 S 4th St")
	void AddressOfRecord4503() {
		assertEquals("301 S 4th St", customers.get(4502).getAddress());
	}

	@Test
	@DisplayName("Record 4503: City is Richmond")
	void CityOfRecord4503() {
		assertEquals("Richmond", customers.get(4502).getCity());
	}

	@Test
	@DisplayName("Record 4503: County is Wayne")
	void CountyOfRecord4503() {
		assertEquals("Wayne", customers.get(4502).getCounty());
	}

	@Test
	@DisplayName("Record 4503: State is IN")
	void StateOfRecord4503() {
		assertEquals("IN", customers.get(4502).getState());
	}

	@Test
	@DisplayName("Record 4503: ZIP is 47374")
	void ZIPOfRecord4503() {
		assertEquals("47374", customers.get(4502).getZIP());
	}

	@Test
	@DisplayName("Record 4503: Phone is 765-935-6981")
	void PhoneOfRecord4503() {
		assertEquals("765-935-6981", customers.get(4502).getPhone());
	}

	@Test
	@DisplayName("Record 4503: Fax is 765-935-1589")
	void FaxOfRecord4503() {
		assertEquals("765-935-1589", customers.get(4502).getFax());
	}

	@Test
	@DisplayName("Record 4503: Email is rico@fischman.com")
	void EmailOfRecord4503() {
		assertEquals("rico@fischman.com", customers.get(4502).getEmail());
	}

	@Test
	@DisplayName("Record 4503: Web is http://www.ricofischman.com")
	void WebOfRecord4503() {
		assertEquals("http://www.ricofischman.com", customers.get(4502).getWeb());
	}
}
