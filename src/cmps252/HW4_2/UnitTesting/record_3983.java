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

@Tag("19")
class Record_3983 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3983: FirstName is Wallace")
	void FirstNameOfRecord3983() {
		assertEquals("Wallace", customers.get(3982).getFirstName());
	}

	@Test
	@DisplayName("Record 3983: LastName is Piurkowski")
	void LastNameOfRecord3983() {
		assertEquals("Piurkowski", customers.get(3982).getLastName());
	}

	@Test
	@DisplayName("Record 3983: Company is Robert W York")
	void CompanyOfRecord3983() {
		assertEquals("Robert W York", customers.get(3982).getCompany());
	}

	@Test
	@DisplayName("Record 3983: Address is 5155 Camino Ruiz")
	void AddressOfRecord3983() {
		assertEquals("5155 Camino Ruiz", customers.get(3982).getAddress());
	}

	@Test
	@DisplayName("Record 3983: City is Camarillo")
	void CityOfRecord3983() {
		assertEquals("Camarillo", customers.get(3982).getCity());
	}

	@Test
	@DisplayName("Record 3983: County is Ventura")
	void CountyOfRecord3983() {
		assertEquals("Ventura", customers.get(3982).getCounty());
	}

	@Test
	@DisplayName("Record 3983: State is CA")
	void StateOfRecord3983() {
		assertEquals("CA", customers.get(3982).getState());
	}

	@Test
	@DisplayName("Record 3983: ZIP is 93012")
	void ZIPOfRecord3983() {
		assertEquals("93012", customers.get(3982).getZIP());
	}

	@Test
	@DisplayName("Record 3983: Phone is 805-985-8803")
	void PhoneOfRecord3983() {
		assertEquals("805-985-8803", customers.get(3982).getPhone());
	}

	@Test
	@DisplayName("Record 3983: Fax is 805-985-5086")
	void FaxOfRecord3983() {
		assertEquals("805-985-5086", customers.get(3982).getFax());
	}

	@Test
	@DisplayName("Record 3983: Email is wallace@piurkowski.com")
	void EmailOfRecord3983() {
		assertEquals("wallace@piurkowski.com", customers.get(3982).getEmail());
	}

	@Test
	@DisplayName("Record 3983: Web is http://www.wallacepiurkowski.com")
	void WebOfRecord3983() {
		assertEquals("http://www.wallacepiurkowski.com", customers.get(3982).getWeb());
	}
}
