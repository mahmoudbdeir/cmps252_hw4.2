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
class Record_4410 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4410: FirstName is Charlie")
	void FirstNameOfRecord4410() {
		assertEquals("Charlie", customers.get(4409).getFirstName());
	}

	@Test
	@DisplayName("Record 4410: LastName is Semon")
	void LastNameOfRecord4410() {
		assertEquals("Semon", customers.get(4409).getLastName());
	}

	@Test
	@DisplayName("Record 4410: Company is Patton, Maxie O Cpa")
	void CompanyOfRecord4410() {
		assertEquals("Patton, Maxie O Cpa", customers.get(4409).getCompany());
	}

	@Test
	@DisplayName("Record 4410: Address is 6808 Bergenline Ave")
	void AddressOfRecord4410() {
		assertEquals("6808 Bergenline Ave", customers.get(4409).getAddress());
	}

	@Test
	@DisplayName("Record 4410: City is West New York")
	void CityOfRecord4410() {
		assertEquals("West New York", customers.get(4409).getCity());
	}

	@Test
	@DisplayName("Record 4410: County is Hudson")
	void CountyOfRecord4410() {
		assertEquals("Hudson", customers.get(4409).getCounty());
	}

	@Test
	@DisplayName("Record 4410: State is NJ")
	void StateOfRecord4410() {
		assertEquals("NJ", customers.get(4409).getState());
	}

	@Test
	@DisplayName("Record 4410: ZIP is 7093")
	void ZIPOfRecord4410() {
		assertEquals("7093", customers.get(4409).getZIP());
	}

	@Test
	@DisplayName("Record 4410: Phone is 201-868-5410")
	void PhoneOfRecord4410() {
		assertEquals("201-868-5410", customers.get(4409).getPhone());
	}

	@Test
	@DisplayName("Record 4410: Fax is 201-868-9119")
	void FaxOfRecord4410() {
		assertEquals("201-868-9119", customers.get(4409).getFax());
	}

	@Test
	@DisplayName("Record 4410: Email is charlie@semon.com")
	void EmailOfRecord4410() {
		assertEquals("charlie@semon.com", customers.get(4409).getEmail());
	}

	@Test
	@DisplayName("Record 4410: Web is http://www.charliesemon.com")
	void WebOfRecord4410() {
		assertEquals("http://www.charliesemon.com", customers.get(4409).getWeb());
	}
}
