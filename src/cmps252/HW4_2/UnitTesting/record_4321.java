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

@Tag("1")
class Record_4321 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4321: FirstName is Tracy")
	void FirstNameOfRecord4321() {
		assertEquals("Tracy", customers.get(4320).getFirstName());
	}

	@Test
	@DisplayName("Record 4321: LastName is Miyashiro")
	void LastNameOfRecord4321() {
		assertEquals("Miyashiro", customers.get(4320).getLastName());
	}

	@Test
	@DisplayName("Record 4321: Company is Magna Aire Products")
	void CompanyOfRecord4321() {
		assertEquals("Magna Aire Products", customers.get(4320).getCompany());
	}

	@Test
	@DisplayName("Record 4321: Address is 362 Jones Ave Nw")
	void AddressOfRecord4321() {
		assertEquals("362 Jones Ave Nw", customers.get(4320).getAddress());
	}

	@Test
	@DisplayName("Record 4321: City is Atlanta")
	void CityOfRecord4321() {
		assertEquals("Atlanta", customers.get(4320).getCity());
	}

	@Test
	@DisplayName("Record 4321: County is Fulton")
	void CountyOfRecord4321() {
		assertEquals("Fulton", customers.get(4320).getCounty());
	}

	@Test
	@DisplayName("Record 4321: State is GA")
	void StateOfRecord4321() {
		assertEquals("GA", customers.get(4320).getState());
	}

	@Test
	@DisplayName("Record 4321: ZIP is 30314")
	void ZIPOfRecord4321() {
		assertEquals("30314", customers.get(4320).getZIP());
	}

	@Test
	@DisplayName("Record 4321: Phone is 404-681-2797")
	void PhoneOfRecord4321() {
		assertEquals("404-681-2797", customers.get(4320).getPhone());
	}

	@Test
	@DisplayName("Record 4321: Fax is 404-681-2091")
	void FaxOfRecord4321() {
		assertEquals("404-681-2091", customers.get(4320).getFax());
	}

	@Test
	@DisplayName("Record 4321: Email is tracy@miyashiro.com")
	void EmailOfRecord4321() {
		assertEquals("tracy@miyashiro.com", customers.get(4320).getEmail());
	}

	@Test
	@DisplayName("Record 4321: Web is http://www.tracymiyashiro.com")
	void WebOfRecord4321() {
		assertEquals("http://www.tracymiyashiro.com", customers.get(4320).getWeb());
	}
}
