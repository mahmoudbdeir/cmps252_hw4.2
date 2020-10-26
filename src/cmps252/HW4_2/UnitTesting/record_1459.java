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

@Tag("36")
class Record_1459 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1459: FirstName is Raymundo")
	void FirstNameOfRecord1459() {
		assertEquals("Raymundo", customers.get(1458).getFirstName());
	}

	@Test
	@DisplayName("Record 1459: LastName is Petralia")
	void LastNameOfRecord1459() {
		assertEquals("Petralia", customers.get(1458).getLastName());
	}

	@Test
	@DisplayName("Record 1459: Company is Downs Electric Inc")
	void CompanyOfRecord1459() {
		assertEquals("Downs Electric Inc", customers.get(1458).getCompany());
	}

	@Test
	@DisplayName("Record 1459: Address is 4721 Market St")
	void AddressOfRecord1459() {
		assertEquals("4721 Market St", customers.get(1458).getAddress());
	}

	@Test
	@DisplayName("Record 1459: City is Ventura")
	void CityOfRecord1459() {
		assertEquals("Ventura", customers.get(1458).getCity());
	}

	@Test
	@DisplayName("Record 1459: County is Ventura")
	void CountyOfRecord1459() {
		assertEquals("Ventura", customers.get(1458).getCounty());
	}

	@Test
	@DisplayName("Record 1459: State is CA")
	void StateOfRecord1459() {
		assertEquals("CA", customers.get(1458).getState());
	}

	@Test
	@DisplayName("Record 1459: ZIP is 93003")
	void ZIPOfRecord1459() {
		assertEquals("93003", customers.get(1458).getZIP());
	}

	@Test
	@DisplayName("Record 1459: Phone is 805-658-0883")
	void PhoneOfRecord1459() {
		assertEquals("805-658-0883", customers.get(1458).getPhone());
	}

	@Test
	@DisplayName("Record 1459: Fax is 805-658-7796")
	void FaxOfRecord1459() {
		assertEquals("805-658-7796", customers.get(1458).getFax());
	}

	@Test
	@DisplayName("Record 1459: Email is raymundo@petralia.com")
	void EmailOfRecord1459() {
		assertEquals("raymundo@petralia.com", customers.get(1458).getEmail());
	}

	@Test
	@DisplayName("Record 1459: Web is http://www.raymundopetralia.com")
	void WebOfRecord1459() {
		assertEquals("http://www.raymundopetralia.com", customers.get(1458).getWeb());
	}
}
