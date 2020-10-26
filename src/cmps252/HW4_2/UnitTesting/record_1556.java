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

@Tag("9")
class Record_1556 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1556: FirstName is Alissa")
	void FirstNameOfRecord1556() {
		assertEquals("Alissa", customers.get(1555).getFirstName());
	}

	@Test
	@DisplayName("Record 1556: LastName is Beshore")
	void LastNameOfRecord1556() {
		assertEquals("Beshore", customers.get(1555).getLastName());
	}

	@Test
	@DisplayName("Record 1556: Company is Technical Registration Board A")
	void CompanyOfRecord1556() {
		assertEquals("Technical Registration Board A", customers.get(1555).getCompany());
	}

	@Test
	@DisplayName("Record 1556: Address is 11 E 36th St")
	void AddressOfRecord1556() {
		assertEquals("11 E 36th St", customers.get(1555).getAddress());
	}

	@Test
	@DisplayName("Record 1556: City is New York")
	void CityOfRecord1556() {
		assertEquals("New York", customers.get(1555).getCity());
	}

	@Test
	@DisplayName("Record 1556: County is New York")
	void CountyOfRecord1556() {
		assertEquals("New York", customers.get(1555).getCounty());
	}

	@Test
	@DisplayName("Record 1556: State is NY")
	void StateOfRecord1556() {
		assertEquals("NY", customers.get(1555).getState());
	}

	@Test
	@DisplayName("Record 1556: ZIP is 10016")
	void ZIPOfRecord1556() {
		assertEquals("10016", customers.get(1555).getZIP());
	}

	@Test
	@DisplayName("Record 1556: Phone is 212-532-4633")
	void PhoneOfRecord1556() {
		assertEquals("212-532-4633", customers.get(1555).getPhone());
	}

	@Test
	@DisplayName("Record 1556: Fax is 212-532-1472")
	void FaxOfRecord1556() {
		assertEquals("212-532-1472", customers.get(1555).getFax());
	}

	@Test
	@DisplayName("Record 1556: Email is alissa@beshore.com")
	void EmailOfRecord1556() {
		assertEquals("alissa@beshore.com", customers.get(1555).getEmail());
	}

	@Test
	@DisplayName("Record 1556: Web is http://www.alissabeshore.com")
	void WebOfRecord1556() {
		assertEquals("http://www.alissabeshore.com", customers.get(1555).getWeb());
	}
}
