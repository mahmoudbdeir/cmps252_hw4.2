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

@Tag("43")
class Record_4582 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4582: FirstName is Leroy")
	void FirstNameOfRecord4582() {
		assertEquals("Leroy", customers.get(4581).getFirstName());
	}

	@Test
	@DisplayName("Record 4582: LastName is Glawe")
	void LastNameOfRecord4582() {
		assertEquals("Glawe", customers.get(4581).getLastName());
	}

	@Test
	@DisplayName("Record 4582: Company is Wdvr Fm")
	void CompanyOfRecord4582() {
		assertEquals("Wdvr Fm", customers.get(4581).getCompany());
	}

	@Test
	@DisplayName("Record 4582: Address is 271 Madison Ave")
	void AddressOfRecord4582() {
		assertEquals("271 Madison Ave", customers.get(4581).getAddress());
	}

	@Test
	@DisplayName("Record 4582: City is New York")
	void CityOfRecord4582() {
		assertEquals("New York", customers.get(4581).getCity());
	}

	@Test
	@DisplayName("Record 4582: County is New York")
	void CountyOfRecord4582() {
		assertEquals("New York", customers.get(4581).getCounty());
	}

	@Test
	@DisplayName("Record 4582: State is NY")
	void StateOfRecord4582() {
		assertEquals("NY", customers.get(4581).getState());
	}

	@Test
	@DisplayName("Record 4582: ZIP is 10016")
	void ZIPOfRecord4582() {
		assertEquals("10016", customers.get(4581).getZIP());
	}

	@Test
	@DisplayName("Record 4582: Phone is 212-867-7259")
	void PhoneOfRecord4582() {
		assertEquals("212-867-7259", customers.get(4581).getPhone());
	}

	@Test
	@DisplayName("Record 4582: Fax is 212-867-1919")
	void FaxOfRecord4582() {
		assertEquals("212-867-1919", customers.get(4581).getFax());
	}

	@Test
	@DisplayName("Record 4582: Email is leroy@glawe.com")
	void EmailOfRecord4582() {
		assertEquals("leroy@glawe.com", customers.get(4581).getEmail());
	}

	@Test
	@DisplayName("Record 4582: Web is http://www.leroyglawe.com")
	void WebOfRecord4582() {
		assertEquals("http://www.leroyglawe.com", customers.get(4581).getWeb());
	}
}
