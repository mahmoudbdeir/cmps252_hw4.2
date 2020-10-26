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

@Tag("49")
class Record_3515 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3515: FirstName is Rosemarie")
	void FirstNameOfRecord3515() {
		assertEquals("Rosemarie", customers.get(3514).getFirstName());
	}

	@Test
	@DisplayName("Record 3515: LastName is Steveson")
	void LastNameOfRecord3515() {
		assertEquals("Steveson", customers.get(3514).getLastName());
	}

	@Test
	@DisplayName("Record 3515: Company is Rainbow Book Store")
	void CompanyOfRecord3515() {
		assertEquals("Rainbow Book Store", customers.get(3514).getCompany());
	}

	@Test
	@DisplayName("Record 3515: Address is 2202 E University Dr")
	void AddressOfRecord3515() {
		assertEquals("2202 E University Dr", customers.get(3514).getAddress());
	}

	@Test
	@DisplayName("Record 3515: City is Phoenix")
	void CityOfRecord3515() {
		assertEquals("Phoenix", customers.get(3514).getCity());
	}

	@Test
	@DisplayName("Record 3515: County is Maricopa")
	void CountyOfRecord3515() {
		assertEquals("Maricopa", customers.get(3514).getCounty());
	}

	@Test
	@DisplayName("Record 3515: State is AZ")
	void StateOfRecord3515() {
		assertEquals("AZ", customers.get(3514).getState());
	}

	@Test
	@DisplayName("Record 3515: ZIP is 85034")
	void ZIPOfRecord3515() {
		assertEquals("85034", customers.get(3514).getZIP());
	}

	@Test
	@DisplayName("Record 3515: Phone is 602-437-3716")
	void PhoneOfRecord3515() {
		assertEquals("602-437-3716", customers.get(3514).getPhone());
	}

	@Test
	@DisplayName("Record 3515: Fax is 602-437-5218")
	void FaxOfRecord3515() {
		assertEquals("602-437-5218", customers.get(3514).getFax());
	}

	@Test
	@DisplayName("Record 3515: Email is rosemarie@steveson.com")
	void EmailOfRecord3515() {
		assertEquals("rosemarie@steveson.com", customers.get(3514).getEmail());
	}

	@Test
	@DisplayName("Record 3515: Web is http://www.rosemariesteveson.com")
	void WebOfRecord3515() {
		assertEquals("http://www.rosemariesteveson.com", customers.get(3514).getWeb());
	}
}
