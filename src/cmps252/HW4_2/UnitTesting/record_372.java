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

@Tag("31")
class Record_372 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 372: FirstName is Alta")
	void FirstNameOfRecord372() {
		assertEquals("Alta", customers.get(371).getFirstName());
	}

	@Test
	@DisplayName("Record 372: LastName is Hanible")
	void LastNameOfRecord372() {
		assertEquals("Hanible", customers.get(371).getLastName());
	}

	@Test
	@DisplayName("Record 372: Company is Dutton, Janet B Esq")
	void CompanyOfRecord372() {
		assertEquals("Dutton, Janet B Esq", customers.get(371).getCompany());
	}

	@Test
	@DisplayName("Record 372: Address is 15252 Valley Blvd")
	void AddressOfRecord372() {
		assertEquals("15252 Valley Blvd", customers.get(371).getAddress());
	}

	@Test
	@DisplayName("Record 372: City is La Puente")
	void CityOfRecord372() {
		assertEquals("La Puente", customers.get(371).getCity());
	}

	@Test
	@DisplayName("Record 372: County is Los Angeles")
	void CountyOfRecord372() {
		assertEquals("Los Angeles", customers.get(371).getCounty());
	}

	@Test
	@DisplayName("Record 372: State is CA")
	void StateOfRecord372() {
		assertEquals("CA", customers.get(371).getState());
	}

	@Test
	@DisplayName("Record 372: ZIP is 91746")
	void ZIPOfRecord372() {
		assertEquals("91746", customers.get(371).getZIP());
	}

	@Test
	@DisplayName("Record 372: Phone is 626-336-2780")
	void PhoneOfRecord372() {
		assertEquals("626-336-2780", customers.get(371).getPhone());
	}

	@Test
	@DisplayName("Record 372: Fax is 626-336-8547")
	void FaxOfRecord372() {
		assertEquals("626-336-8547", customers.get(371).getFax());
	}

	@Test
	@DisplayName("Record 372: Email is alta@hanible.com")
	void EmailOfRecord372() {
		assertEquals("alta@hanible.com", customers.get(371).getEmail());
	}

	@Test
	@DisplayName("Record 372: Web is http://www.altahanible.com")
	void WebOfRecord372() {
		assertEquals("http://www.altahanible.com", customers.get(371).getWeb());
	}
}
