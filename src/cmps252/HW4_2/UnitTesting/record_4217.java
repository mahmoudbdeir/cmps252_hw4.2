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

@Tag("26")
class Record_4217 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4217: FirstName is Chase")
	void FirstNameOfRecord4217() {
		assertEquals("Chase", customers.get(4216).getFirstName());
	}

	@Test
	@DisplayName("Record 4217: LastName is Hesse")
	void LastNameOfRecord4217() {
		assertEquals("Hesse", customers.get(4216).getLastName());
	}

	@Test
	@DisplayName("Record 4217: Company is Forster Kerr Pannell Pc")
	void CompanyOfRecord4217() {
		assertEquals("Forster Kerr Pannell Pc", customers.get(4216).getCompany());
	}

	@Test
	@DisplayName("Record 4217: Address is 1589 E 2nd St")
	void AddressOfRecord4217() {
		assertEquals("1589 E 2nd St", customers.get(4216).getAddress());
	}

	@Test
	@DisplayName("Record 4217: City is Scotch Plains")
	void CityOfRecord4217() {
		assertEquals("Scotch Plains", customers.get(4216).getCity());
	}

	@Test
	@DisplayName("Record 4217: County is Union")
	void CountyOfRecord4217() {
		assertEquals("Union", customers.get(4216).getCounty());
	}

	@Test
	@DisplayName("Record 4217: State is NJ")
	void StateOfRecord4217() {
		assertEquals("NJ", customers.get(4216).getState());
	}

	@Test
	@DisplayName("Record 4217: ZIP is 7076")
	void ZIPOfRecord4217() {
		assertEquals("7076", customers.get(4216).getZIP());
	}

	@Test
	@DisplayName("Record 4217: Phone is 908-322-5117")
	void PhoneOfRecord4217() {
		assertEquals("908-322-5117", customers.get(4216).getPhone());
	}

	@Test
	@DisplayName("Record 4217: Fax is 908-322-8799")
	void FaxOfRecord4217() {
		assertEquals("908-322-8799", customers.get(4216).getFax());
	}

	@Test
	@DisplayName("Record 4217: Email is chase@hesse.com")
	void EmailOfRecord4217() {
		assertEquals("chase@hesse.com", customers.get(4216).getEmail());
	}

	@Test
	@DisplayName("Record 4217: Web is http://www.chasehesse.com")
	void WebOfRecord4217() {
		assertEquals("http://www.chasehesse.com", customers.get(4216).getWeb());
	}
}
