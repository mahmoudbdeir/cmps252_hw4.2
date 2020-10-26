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
class Record_1481 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1481: FirstName is Reba")
	void FirstNameOfRecord1481() {
		assertEquals("Reba", customers.get(1480).getFirstName());
	}

	@Test
	@DisplayName("Record 1481: LastName is Ingrassia")
	void LastNameOfRecord1481() {
		assertEquals("Ingrassia", customers.get(1480).getLastName());
	}

	@Test
	@DisplayName("Record 1481: Company is Winters, Dennis Esq")
	void CompanyOfRecord1481() {
		assertEquals("Winters, Dennis Esq", customers.get(1480).getCompany());
	}

	@Test
	@DisplayName("Record 1481: Address is 100 Lincoln Blvd")
	void AddressOfRecord1481() {
		assertEquals("100 Lincoln Blvd", customers.get(1480).getAddress());
	}

	@Test
	@DisplayName("Record 1481: City is Middlesex")
	void CityOfRecord1481() {
		assertEquals("Middlesex", customers.get(1480).getCity());
	}

	@Test
	@DisplayName("Record 1481: County is Middlesex")
	void CountyOfRecord1481() {
		assertEquals("Middlesex", customers.get(1480).getCounty());
	}

	@Test
	@DisplayName("Record 1481: State is NJ")
	void StateOfRecord1481() {
		assertEquals("NJ", customers.get(1480).getState());
	}

	@Test
	@DisplayName("Record 1481: ZIP is 8846")
	void ZIPOfRecord1481() {
		assertEquals("8846", customers.get(1480).getZIP());
	}

	@Test
	@DisplayName("Record 1481: Phone is 732-469-0507")
	void PhoneOfRecord1481() {
		assertEquals("732-469-0507", customers.get(1480).getPhone());
	}

	@Test
	@DisplayName("Record 1481: Fax is 732-469-2436")
	void FaxOfRecord1481() {
		assertEquals("732-469-2436", customers.get(1480).getFax());
	}

	@Test
	@DisplayName("Record 1481: Email is reba@ingrassia.com")
	void EmailOfRecord1481() {
		assertEquals("reba@ingrassia.com", customers.get(1480).getEmail());
	}

	@Test
	@DisplayName("Record 1481: Web is http://www.rebaingrassia.com")
	void WebOfRecord1481() {
		assertEquals("http://www.rebaingrassia.com", customers.get(1480).getWeb());
	}
}
