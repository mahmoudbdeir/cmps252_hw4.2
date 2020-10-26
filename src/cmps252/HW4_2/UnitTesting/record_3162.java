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

@Tag("49")
class Record_3162 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3162: FirstName is Franklin")
	void FirstNameOfRecord3162() {
		assertEquals("Franklin", customers.get(3161).getFirstName());
	}

	@Test
	@DisplayName("Record 3162: LastName is Neveu")
	void LastNameOfRecord3162() {
		assertEquals("Neveu", customers.get(3161).getLastName());
	}

	@Test
	@DisplayName("Record 3162: Company is Butler, Arthur A Esq")
	void CompanyOfRecord3162() {
		assertEquals("Butler, Arthur A Esq", customers.get(3161).getCompany());
	}

	@Test
	@DisplayName("Record 3162: Address is 820 2nd Ave")
	void AddressOfRecord3162() {
		assertEquals("820 2nd Ave", customers.get(3161).getAddress());
	}

	@Test
	@DisplayName("Record 3162: City is New York")
	void CityOfRecord3162() {
		assertEquals("New York", customers.get(3161).getCity());
	}

	@Test
	@DisplayName("Record 3162: County is New York")
	void CountyOfRecord3162() {
		assertEquals("New York", customers.get(3161).getCounty());
	}

	@Test
	@DisplayName("Record 3162: State is NY")
	void StateOfRecord3162() {
		assertEquals("NY", customers.get(3161).getState());
	}

	@Test
	@DisplayName("Record 3162: ZIP is 10017")
	void ZIPOfRecord3162() {
		assertEquals("10017", customers.get(3161).getZIP());
	}

	@Test
	@DisplayName("Record 3162: Phone is 212-687-8494")
	void PhoneOfRecord3162() {
		assertEquals("212-687-8494", customers.get(3161).getPhone());
	}

	@Test
	@DisplayName("Record 3162: Fax is 212-687-0617")
	void FaxOfRecord3162() {
		assertEquals("212-687-0617", customers.get(3161).getFax());
	}

	@Test
	@DisplayName("Record 3162: Email is franklin@neveu.com")
	void EmailOfRecord3162() {
		assertEquals("franklin@neveu.com", customers.get(3161).getEmail());
	}

	@Test
	@DisplayName("Record 3162: Web is http://www.franklinneveu.com")
	void WebOfRecord3162() {
		assertEquals("http://www.franklinneveu.com", customers.get(3161).getWeb());
	}
}
