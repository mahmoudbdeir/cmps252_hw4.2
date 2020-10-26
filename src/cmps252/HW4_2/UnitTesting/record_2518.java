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

@Tag("26")
class Record_2518 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2518: FirstName is Retha")
	void FirstNameOfRecord2518() {
		assertEquals("Retha", customers.get(2517).getFirstName());
	}

	@Test
	@DisplayName("Record 2518: LastName is Soldano")
	void LastNameOfRecord2518() {
		assertEquals("Soldano", customers.get(2517).getLastName());
	}

	@Test
	@DisplayName("Record 2518: Company is Palmieri, Nancy")
	void CompanyOfRecord2518() {
		assertEquals("Palmieri, Nancy", customers.get(2517).getCompany());
	}

	@Test
	@DisplayName("Record 2518: Address is 215 Center")
	void AddressOfRecord2518() {
		assertEquals("215 Center", customers.get(2517).getAddress());
	}

	@Test
	@DisplayName("Record 2518: City is Manawa")
	void CityOfRecord2518() {
		assertEquals("Manawa", customers.get(2517).getCity());
	}

	@Test
	@DisplayName("Record 2518: County is Waupaca")
	void CountyOfRecord2518() {
		assertEquals("Waupaca", customers.get(2517).getCounty());
	}

	@Test
	@DisplayName("Record 2518: State is WI")
	void StateOfRecord2518() {
		assertEquals("WI", customers.get(2517).getState());
	}

	@Test
	@DisplayName("Record 2518: ZIP is 54949")
	void ZIPOfRecord2518() {
		assertEquals("54949", customers.get(2517).getZIP());
	}

	@Test
	@DisplayName("Record 2518: Phone is 920-596-4005")
	void PhoneOfRecord2518() {
		assertEquals("920-596-4005", customers.get(2517).getPhone());
	}

	@Test
	@DisplayName("Record 2518: Fax is 920-596-4219")
	void FaxOfRecord2518() {
		assertEquals("920-596-4219", customers.get(2517).getFax());
	}

	@Test
	@DisplayName("Record 2518: Email is retha@soldano.com")
	void EmailOfRecord2518() {
		assertEquals("retha@soldano.com", customers.get(2517).getEmail());
	}

	@Test
	@DisplayName("Record 2518: Web is http://www.rethasoldano.com")
	void WebOfRecord2518() {
		assertEquals("http://www.rethasoldano.com", customers.get(2517).getWeb());
	}
}
