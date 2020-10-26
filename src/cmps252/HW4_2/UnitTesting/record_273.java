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

@Tag("5")
class Record_273 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 273: FirstName is Charlie")
	void FirstNameOfRecord273() {
		assertEquals("Charlie", customers.get(272).getFirstName());
	}

	@Test
	@DisplayName("Record 273: LastName is Tarabokija")
	void LastNameOfRecord273() {
		assertEquals("Tarabokija", customers.get(272).getLastName());
	}

	@Test
	@DisplayName("Record 273: Company is Mega Type")
	void CompanyOfRecord273() {
		assertEquals("Mega Type", customers.get(272).getCompany());
	}

	@Test
	@DisplayName("Record 273: Address is 175 Lewis Rd  #-24")
	void AddressOfRecord273() {
		assertEquals("175 Lewis Rd  #-24", customers.get(272).getAddress());
	}

	@Test
	@DisplayName("Record 273: City is San Jose")
	void CityOfRecord273() {
		assertEquals("San Jose", customers.get(272).getCity());
	}

	@Test
	@DisplayName("Record 273: County is Santa Clara")
	void CountyOfRecord273() {
		assertEquals("Santa Clara", customers.get(272).getCounty());
	}

	@Test
	@DisplayName("Record 273: State is CA")
	void StateOfRecord273() {
		assertEquals("CA", customers.get(272).getState());
	}

	@Test
	@DisplayName("Record 273: ZIP is 95111")
	void ZIPOfRecord273() {
		assertEquals("95111", customers.get(272).getZIP());
	}

	@Test
	@DisplayName("Record 273: Phone is 408-281-8869")
	void PhoneOfRecord273() {
		assertEquals("408-281-8869", customers.get(272).getPhone());
	}

	@Test
	@DisplayName("Record 273: Fax is 408-281-7933")
	void FaxOfRecord273() {
		assertEquals("408-281-7933", customers.get(272).getFax());
	}

	@Test
	@DisplayName("Record 273: Email is charlie@tarabokija.com")
	void EmailOfRecord273() {
		assertEquals("charlie@tarabokija.com", customers.get(272).getEmail());
	}

	@Test
	@DisplayName("Record 273: Web is http://www.charlietarabokija.com")
	void WebOfRecord273() {
		assertEquals("http://www.charlietarabokija.com", customers.get(272).getWeb());
	}
}
