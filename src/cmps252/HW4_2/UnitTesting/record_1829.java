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

@Tag("25")
class Record_1829 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1829: FirstName is Reynaldo")
	void FirstNameOfRecord1829() {
		assertEquals("Reynaldo", customers.get(1828).getFirstName());
	}

	@Test
	@DisplayName("Record 1829: LastName is Farrier")
	void LastNameOfRecord1829() {
		assertEquals("Farrier", customers.get(1828).getLastName());
	}

	@Test
	@DisplayName("Record 1829: Company is Tonis Flower Shop")
	void CompanyOfRecord1829() {
		assertEquals("Tonis Flower Shop", customers.get(1828).getCompany());
	}

	@Test
	@DisplayName("Record 1829: Address is 295 N Blosser Rd")
	void AddressOfRecord1829() {
		assertEquals("295 N Blosser Rd", customers.get(1828).getAddress());
	}

	@Test
	@DisplayName("Record 1829: City is Santa Maria")
	void CityOfRecord1829() {
		assertEquals("Santa Maria", customers.get(1828).getCity());
	}

	@Test
	@DisplayName("Record 1829: County is Santa Barbara")
	void CountyOfRecord1829() {
		assertEquals("Santa Barbara", customers.get(1828).getCounty());
	}

	@Test
	@DisplayName("Record 1829: State is CA")
	void StateOfRecord1829() {
		assertEquals("CA", customers.get(1828).getState());
	}

	@Test
	@DisplayName("Record 1829: ZIP is 93454")
	void ZIPOfRecord1829() {
		assertEquals("93454", customers.get(1828).getZIP());
	}

	@Test
	@DisplayName("Record 1829: Phone is 805-922-3166")
	void PhoneOfRecord1829() {
		assertEquals("805-922-3166", customers.get(1828).getPhone());
	}

	@Test
	@DisplayName("Record 1829: Fax is 805-922-3056")
	void FaxOfRecord1829() {
		assertEquals("805-922-3056", customers.get(1828).getFax());
	}

	@Test
	@DisplayName("Record 1829: Email is reynaldo@farrier.com")
	void EmailOfRecord1829() {
		assertEquals("reynaldo@farrier.com", customers.get(1828).getEmail());
	}

	@Test
	@DisplayName("Record 1829: Web is http://www.reynaldofarrier.com")
	void WebOfRecord1829() {
		assertEquals("http://www.reynaldofarrier.com", customers.get(1828).getWeb());
	}
}
