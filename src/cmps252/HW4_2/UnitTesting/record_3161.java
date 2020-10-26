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

@Tag("24")
class Record_3161 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3161: FirstName is Krystle")
	void FirstNameOfRecord3161() {
		assertEquals("Krystle", customers.get(3160).getFirstName());
	}

	@Test
	@DisplayName("Record 3161: LastName is Gorychka")
	void LastNameOfRecord3161() {
		assertEquals("Gorychka", customers.get(3160).getLastName());
	}

	@Test
	@DisplayName("Record 3161: Company is Mikalson, Barbara Esq")
	void CompanyOfRecord3161() {
		assertEquals("Mikalson, Barbara Esq", customers.get(3160).getCompany());
	}

	@Test
	@DisplayName("Record 3161: Address is 350 5th Ave")
	void AddressOfRecord3161() {
		assertEquals("350 5th Ave", customers.get(3160).getAddress());
	}

	@Test
	@DisplayName("Record 3161: City is New York")
	void CityOfRecord3161() {
		assertEquals("New York", customers.get(3160).getCity());
	}

	@Test
	@DisplayName("Record 3161: County is New York")
	void CountyOfRecord3161() {
		assertEquals("New York", customers.get(3160).getCounty());
	}

	@Test
	@DisplayName("Record 3161: State is NY")
	void StateOfRecord3161() {
		assertEquals("NY", customers.get(3160).getState());
	}

	@Test
	@DisplayName("Record 3161: ZIP is 10118")
	void ZIPOfRecord3161() {
		assertEquals("10118", customers.get(3160).getZIP());
	}

	@Test
	@DisplayName("Record 3161: Phone is 212-613-6047")
	void PhoneOfRecord3161() {
		assertEquals("212-613-6047", customers.get(3160).getPhone());
	}

	@Test
	@DisplayName("Record 3161: Fax is 212-613-2989")
	void FaxOfRecord3161() {
		assertEquals("212-613-2989", customers.get(3160).getFax());
	}

	@Test
	@DisplayName("Record 3161: Email is krystle@gorychka.com")
	void EmailOfRecord3161() {
		assertEquals("krystle@gorychka.com", customers.get(3160).getEmail());
	}

	@Test
	@DisplayName("Record 3161: Web is http://www.krystlegorychka.com")
	void WebOfRecord3161() {
		assertEquals("http://www.krystlegorychka.com", customers.get(3160).getWeb());
	}
}
