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
class Record_3716 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3716: FirstName is Treva")
	void FirstNameOfRecord3716() {
		assertEquals("Treva", customers.get(3715).getFirstName());
	}

	@Test
	@DisplayName("Record 3716: LastName is Delucas")
	void LastNameOfRecord3716() {
		assertEquals("Delucas", customers.get(3715).getLastName());
	}

	@Test
	@DisplayName("Record 3716: Company is Midwest Hunter Inc")
	void CompanyOfRecord3716() {
		assertEquals("Midwest Hunter Inc", customers.get(3715).getCompany());
	}

	@Test
	@DisplayName("Record 3716: Address is 1 Lower Ragsdale Dr  #-600")
	void AddressOfRecord3716() {
		assertEquals("1 Lower Ragsdale Dr  #-600", customers.get(3715).getAddress());
	}

	@Test
	@DisplayName("Record 3716: City is Monterey")
	void CityOfRecord3716() {
		assertEquals("Monterey", customers.get(3715).getCity());
	}

	@Test
	@DisplayName("Record 3716: County is Monterey")
	void CountyOfRecord3716() {
		assertEquals("Monterey", customers.get(3715).getCounty());
	}

	@Test
	@DisplayName("Record 3716: State is CA")
	void StateOfRecord3716() {
		assertEquals("CA", customers.get(3715).getState());
	}

	@Test
	@DisplayName("Record 3716: ZIP is 93940")
	void ZIPOfRecord3716() {
		assertEquals("93940", customers.get(3715).getZIP());
	}

	@Test
	@DisplayName("Record 3716: Phone is 831-649-1941")
	void PhoneOfRecord3716() {
		assertEquals("831-649-1941", customers.get(3715).getPhone());
	}

	@Test
	@DisplayName("Record 3716: Fax is 831-649-9507")
	void FaxOfRecord3716() {
		assertEquals("831-649-9507", customers.get(3715).getFax());
	}

	@Test
	@DisplayName("Record 3716: Email is treva@delucas.com")
	void EmailOfRecord3716() {
		assertEquals("treva@delucas.com", customers.get(3715).getEmail());
	}

	@Test
	@DisplayName("Record 3716: Web is http://www.trevadelucas.com")
	void WebOfRecord3716() {
		assertEquals("http://www.trevadelucas.com", customers.get(3715).getWeb());
	}
}
