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
class Record_1491 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1491: FirstName is Connie")
	void FirstNameOfRecord1491() {
		assertEquals("Connie", customers.get(1490).getFirstName());
	}

	@Test
	@DisplayName("Record 1491: LastName is Salvetti")
	void LastNameOfRecord1491() {
		assertEquals("Salvetti", customers.get(1490).getLastName());
	}

	@Test
	@DisplayName("Record 1491: Company is Airco Industrial Gases")
	void CompanyOfRecord1491() {
		assertEquals("Airco Industrial Gases", customers.get(1490).getCompany());
	}

	@Test
	@DisplayName("Record 1491: Address is 1200 Bayhill Dr  #-111")
	void AddressOfRecord1491() {
		assertEquals("1200 Bayhill Dr  #-111", customers.get(1490).getAddress());
	}

	@Test
	@DisplayName("Record 1491: City is San Bruno")
	void CityOfRecord1491() {
		assertEquals("San Bruno", customers.get(1490).getCity());
	}

	@Test
	@DisplayName("Record 1491: County is San Mateo")
	void CountyOfRecord1491() {
		assertEquals("San Mateo", customers.get(1490).getCounty());
	}

	@Test
	@DisplayName("Record 1491: State is CA")
	void StateOfRecord1491() {
		assertEquals("CA", customers.get(1490).getState());
	}

	@Test
	@DisplayName("Record 1491: ZIP is 94066")
	void ZIPOfRecord1491() {
		assertEquals("94066", customers.get(1490).getZIP());
	}

	@Test
	@DisplayName("Record 1491: Phone is 650-873-8959")
	void PhoneOfRecord1491() {
		assertEquals("650-873-8959", customers.get(1490).getPhone());
	}

	@Test
	@DisplayName("Record 1491: Fax is 650-873-2242")
	void FaxOfRecord1491() {
		assertEquals("650-873-2242", customers.get(1490).getFax());
	}

	@Test
	@DisplayName("Record 1491: Email is connie@salvetti.com")
	void EmailOfRecord1491() {
		assertEquals("connie@salvetti.com", customers.get(1490).getEmail());
	}

	@Test
	@DisplayName("Record 1491: Web is http://www.conniesalvetti.com")
	void WebOfRecord1491() {
		assertEquals("http://www.conniesalvetti.com", customers.get(1490).getWeb());
	}
}
