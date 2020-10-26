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

@Tag("13")
class Record_4297 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4297: FirstName is Treva")
	void FirstNameOfRecord4297() {
		assertEquals("Treva", customers.get(4296).getFirstName());
	}

	@Test
	@DisplayName("Record 4297: LastName is Goike")
	void LastNameOfRecord4297() {
		assertEquals("Goike", customers.get(4296).getLastName());
	}

	@Test
	@DisplayName("Record 4297: Company is Eco Rok Inc")
	void CompanyOfRecord4297() {
		assertEquals("Eco Rok Inc", customers.get(4296).getCompany());
	}

	@Test
	@DisplayName("Record 4297: Address is 311 Main St")
	void AddressOfRecord4297() {
		assertEquals("311 Main St", customers.get(4296).getAddress());
	}

	@Test
	@DisplayName("Record 4297: City is Harleysville")
	void CityOfRecord4297() {
		assertEquals("Harleysville", customers.get(4296).getCity());
	}

	@Test
	@DisplayName("Record 4297: County is Montgomery")
	void CountyOfRecord4297() {
		assertEquals("Montgomery", customers.get(4296).getCounty());
	}

	@Test
	@DisplayName("Record 4297: State is PA")
	void StateOfRecord4297() {
		assertEquals("PA", customers.get(4296).getState());
	}

	@Test
	@DisplayName("Record 4297: ZIP is 19438")
	void ZIPOfRecord4297() {
		assertEquals("19438", customers.get(4296).getZIP());
	}

	@Test
	@DisplayName("Record 4297: Phone is 215-256-4438")
	void PhoneOfRecord4297() {
		assertEquals("215-256-4438", customers.get(4296).getPhone());
	}

	@Test
	@DisplayName("Record 4297: Fax is 215-256-7711")
	void FaxOfRecord4297() {
		assertEquals("215-256-7711", customers.get(4296).getFax());
	}

	@Test
	@DisplayName("Record 4297: Email is treva@goike.com")
	void EmailOfRecord4297() {
		assertEquals("treva@goike.com", customers.get(4296).getEmail());
	}

	@Test
	@DisplayName("Record 4297: Web is http://www.trevagoike.com")
	void WebOfRecord4297() {
		assertEquals("http://www.trevagoike.com", customers.get(4296).getWeb());
	}
}
