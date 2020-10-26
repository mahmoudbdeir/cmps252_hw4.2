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

@Tag("14")
class Record_1790 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1790: FirstName is Johnie")
	void FirstNameOfRecord1790() {
		assertEquals("Johnie", customers.get(1789).getFirstName());
	}

	@Test
	@DisplayName("Record 1790: LastName is Tarrence")
	void LastNameOfRecord1790() {
		assertEquals("Tarrence", customers.get(1789).getLastName());
	}

	@Test
	@DisplayName("Record 1790: Company is Patterson Tax Service")
	void CompanyOfRecord1790() {
		assertEquals("Patterson Tax Service", customers.get(1789).getCompany());
	}

	@Test
	@DisplayName("Record 1790: Address is 44 W 18th St")
	void AddressOfRecord1790() {
		assertEquals("44 W 18th St", customers.get(1789).getAddress());
	}

	@Test
	@DisplayName("Record 1790: City is New York")
	void CityOfRecord1790() {
		assertEquals("New York", customers.get(1789).getCity());
	}

	@Test
	@DisplayName("Record 1790: County is New York")
	void CountyOfRecord1790() {
		assertEquals("New York", customers.get(1789).getCounty());
	}

	@Test
	@DisplayName("Record 1790: State is NY")
	void StateOfRecord1790() {
		assertEquals("NY", customers.get(1789).getState());
	}

	@Test
	@DisplayName("Record 1790: ZIP is 10011")
	void ZIPOfRecord1790() {
		assertEquals("10011", customers.get(1789).getZIP());
	}

	@Test
	@DisplayName("Record 1790: Phone is 212-929-4688")
	void PhoneOfRecord1790() {
		assertEquals("212-929-4688", customers.get(1789).getPhone());
	}

	@Test
	@DisplayName("Record 1790: Fax is 212-929-5422")
	void FaxOfRecord1790() {
		assertEquals("212-929-5422", customers.get(1789).getFax());
	}

	@Test
	@DisplayName("Record 1790: Email is johnie@tarrence.com")
	void EmailOfRecord1790() {
		assertEquals("johnie@tarrence.com", customers.get(1789).getEmail());
	}

	@Test
	@DisplayName("Record 1790: Web is http://www.johnietarrence.com")
	void WebOfRecord1790() {
		assertEquals("http://www.johnietarrence.com", customers.get(1789).getWeb());
	}
}
