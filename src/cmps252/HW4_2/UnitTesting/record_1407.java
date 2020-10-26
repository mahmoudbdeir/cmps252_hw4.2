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

@Tag("38")
class Record_1407 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1407: FirstName is Kayla")
	void FirstNameOfRecord1407() {
		assertEquals("Kayla", customers.get(1406).getFirstName());
	}

	@Test
	@DisplayName("Record 1407: LastName is Gildore")
	void LastNameOfRecord1407() {
		assertEquals("Gildore", customers.get(1406).getLastName());
	}

	@Test
	@DisplayName("Record 1407: Company is Formica Corp")
	void CompanyOfRecord1407() {
		assertEquals("Formica Corp", customers.get(1406).getCompany());
	}

	@Test
	@DisplayName("Record 1407: Address is 1210 Cypress Ave")
	void AddressOfRecord1407() {
		assertEquals("1210 Cypress Ave", customers.get(1406).getAddress());
	}

	@Test
	@DisplayName("Record 1407: City is San Mateo")
	void CityOfRecord1407() {
		assertEquals("San Mateo", customers.get(1406).getCity());
	}

	@Test
	@DisplayName("Record 1407: County is San Mateo")
	void CountyOfRecord1407() {
		assertEquals("San Mateo", customers.get(1406).getCounty());
	}

	@Test
	@DisplayName("Record 1407: State is CA")
	void StateOfRecord1407() {
		assertEquals("CA", customers.get(1406).getState());
	}

	@Test
	@DisplayName("Record 1407: ZIP is 94401")
	void ZIPOfRecord1407() {
		assertEquals("94401", customers.get(1406).getZIP());
	}

	@Test
	@DisplayName("Record 1407: Phone is 650-344-3507")
	void PhoneOfRecord1407() {
		assertEquals("650-344-3507", customers.get(1406).getPhone());
	}

	@Test
	@DisplayName("Record 1407: Fax is 650-344-7478")
	void FaxOfRecord1407() {
		assertEquals("650-344-7478", customers.get(1406).getFax());
	}

	@Test
	@DisplayName("Record 1407: Email is kayla@gildore.com")
	void EmailOfRecord1407() {
		assertEquals("kayla@gildore.com", customers.get(1406).getEmail());
	}

	@Test
	@DisplayName("Record 1407: Web is http://www.kaylagildore.com")
	void WebOfRecord1407() {
		assertEquals("http://www.kaylagildore.com", customers.get(1406).getWeb());
	}
}
