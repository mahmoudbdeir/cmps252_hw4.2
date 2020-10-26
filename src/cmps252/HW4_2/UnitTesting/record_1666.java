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

@Tag("6")
class Record_1666 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1666: FirstName is Alene")
	void FirstNameOfRecord1666() {
		assertEquals("Alene", customers.get(1665).getFirstName());
	}

	@Test
	@DisplayName("Record 1666: LastName is Moultry")
	void LastNameOfRecord1666() {
		assertEquals("Moultry", customers.get(1665).getLastName());
	}

	@Test
	@DisplayName("Record 1666: Company is Moss, Robyn F Esq")
	void CompanyOfRecord1666() {
		assertEquals("Moss, Robyn F Esq", customers.get(1665).getCompany());
	}

	@Test
	@DisplayName("Record 1666: Address is 41 Union Sq W")
	void AddressOfRecord1666() {
		assertEquals("41 Union Sq W", customers.get(1665).getAddress());
	}

	@Test
	@DisplayName("Record 1666: City is New York")
	void CityOfRecord1666() {
		assertEquals("New York", customers.get(1665).getCity());
	}

	@Test
	@DisplayName("Record 1666: County is New York")
	void CountyOfRecord1666() {
		assertEquals("New York", customers.get(1665).getCounty());
	}

	@Test
	@DisplayName("Record 1666: State is NY")
	void StateOfRecord1666() {
		assertEquals("NY", customers.get(1665).getState());
	}

	@Test
	@DisplayName("Record 1666: ZIP is 10003")
	void ZIPOfRecord1666() {
		assertEquals("10003", customers.get(1665).getZIP());
	}

	@Test
	@DisplayName("Record 1666: Phone is 212-924-9631")
	void PhoneOfRecord1666() {
		assertEquals("212-924-9631", customers.get(1665).getPhone());
	}

	@Test
	@DisplayName("Record 1666: Fax is 212-924-3436")
	void FaxOfRecord1666() {
		assertEquals("212-924-3436", customers.get(1665).getFax());
	}

	@Test
	@DisplayName("Record 1666: Email is alene@moultry.com")
	void EmailOfRecord1666() {
		assertEquals("alene@moultry.com", customers.get(1665).getEmail());
	}

	@Test
	@DisplayName("Record 1666: Web is http://www.alenemoultry.com")
	void WebOfRecord1666() {
		assertEquals("http://www.alenemoultry.com", customers.get(1665).getWeb());
	}
}
