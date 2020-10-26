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

@Tag("41")
class Record_937 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 937: FirstName is Huey")
	void FirstNameOfRecord937() {
		assertEquals("Huey", customers.get(936).getFirstName());
	}

	@Test
	@DisplayName("Record 937: LastName is Lepre")
	void LastNameOfRecord937() {
		assertEquals("Lepre", customers.get(936).getLastName());
	}

	@Test
	@DisplayName("Record 937: Company is Custom Music Co")
	void CompanyOfRecord937() {
		assertEquals("Custom Music Co", customers.get(936).getCompany());
	}

	@Test
	@DisplayName("Record 937: Address is 9399 Sierra Ave")
	void AddressOfRecord937() {
		assertEquals("9399 Sierra Ave", customers.get(936).getAddress());
	}

	@Test
	@DisplayName("Record 937: City is Fontana")
	void CityOfRecord937() {
		assertEquals("Fontana", customers.get(936).getCity());
	}

	@Test
	@DisplayName("Record 937: County is San Bernardino")
	void CountyOfRecord937() {
		assertEquals("San Bernardino", customers.get(936).getCounty());
	}

	@Test
	@DisplayName("Record 937: State is CA")
	void StateOfRecord937() {
		assertEquals("CA", customers.get(936).getState());
	}

	@Test
	@DisplayName("Record 937: ZIP is 92335")
	void ZIPOfRecord937() {
		assertEquals("92335", customers.get(936).getZIP());
	}

	@Test
	@DisplayName("Record 937: Phone is 909-823-6002")
	void PhoneOfRecord937() {
		assertEquals("909-823-6002", customers.get(936).getPhone());
	}

	@Test
	@DisplayName("Record 937: Fax is 909-823-6613")
	void FaxOfRecord937() {
		assertEquals("909-823-6613", customers.get(936).getFax());
	}

	@Test
	@DisplayName("Record 937: Email is huey@lepre.com")
	void EmailOfRecord937() {
		assertEquals("huey@lepre.com", customers.get(936).getEmail());
	}

	@Test
	@DisplayName("Record 937: Web is http://www.hueylepre.com")
	void WebOfRecord937() {
		assertEquals("http://www.hueylepre.com", customers.get(936).getWeb());
	}
}
