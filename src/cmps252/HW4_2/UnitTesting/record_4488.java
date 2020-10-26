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

@Tag("33")
class Record_4488 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4488: FirstName is Bradly")
	void FirstNameOfRecord4488() {
		assertEquals("Bradly", customers.get(4487).getFirstName());
	}

	@Test
	@DisplayName("Record 4488: LastName is Sovern")
	void LastNameOfRecord4488() {
		assertEquals("Sovern", customers.get(4487).getLastName());
	}

	@Test
	@DisplayName("Record 4488: Company is Associated Research Inc")
	void CompanyOfRecord4488() {
		assertEquals("Associated Research Inc", customers.get(4487).getCompany());
	}

	@Test
	@DisplayName("Record 4488: Address is 1960 S 4th St")
	void AddressOfRecord4488() {
		assertEquals("1960 S 4th St", customers.get(4487).getAddress());
	}

	@Test
	@DisplayName("Record 4488: City is Columbus")
	void CityOfRecord4488() {
		assertEquals("Columbus", customers.get(4487).getCity());
	}

	@Test
	@DisplayName("Record 4488: County is Franklin")
	void CountyOfRecord4488() {
		assertEquals("Franklin", customers.get(4487).getCounty());
	}

	@Test
	@DisplayName("Record 4488: State is OH")
	void StateOfRecord4488() {
		assertEquals("OH", customers.get(4487).getState());
	}

	@Test
	@DisplayName("Record 4488: ZIP is 43207")
	void ZIPOfRecord4488() {
		assertEquals("43207", customers.get(4487).getZIP());
	}

	@Test
	@DisplayName("Record 4488: Phone is 614-445-4716")
	void PhoneOfRecord4488() {
		assertEquals("614-445-4716", customers.get(4487).getPhone());
	}

	@Test
	@DisplayName("Record 4488: Fax is 614-445-6201")
	void FaxOfRecord4488() {
		assertEquals("614-445-6201", customers.get(4487).getFax());
	}

	@Test
	@DisplayName("Record 4488: Email is bradly@sovern.com")
	void EmailOfRecord4488() {
		assertEquals("bradly@sovern.com", customers.get(4487).getEmail());
	}

	@Test
	@DisplayName("Record 4488: Web is http://www.bradlysovern.com")
	void WebOfRecord4488() {
		assertEquals("http://www.bradlysovern.com", customers.get(4487).getWeb());
	}
}
