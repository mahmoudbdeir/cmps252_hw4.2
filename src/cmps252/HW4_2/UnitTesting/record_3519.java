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

@Tag("42")
class Record_3519 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3519: FirstName is Francine")
	void FirstNameOfRecord3519() {
		assertEquals("Francine", customers.get(3518).getFirstName());
	}

	@Test
	@DisplayName("Record 3519: LastName is Sengupta")
	void LastNameOfRecord3519() {
		assertEquals("Sengupta", customers.get(3518).getLastName());
	}

	@Test
	@DisplayName("Record 3519: Company is Owi Inc")
	void CompanyOfRecord3519() {
		assertEquals("Owi Inc", customers.get(3518).getCompany());
	}

	@Test
	@DisplayName("Record 3519: Address is 1235 Pass Rd")
	void AddressOfRecord3519() {
		assertEquals("1235 Pass Rd", customers.get(3518).getAddress());
	}

	@Test
	@DisplayName("Record 3519: City is Gulfport")
	void CityOfRecord3519() {
		assertEquals("Gulfport", customers.get(3518).getCity());
	}

	@Test
	@DisplayName("Record 3519: County is Harrison")
	void CountyOfRecord3519() {
		assertEquals("Harrison", customers.get(3518).getCounty());
	}

	@Test
	@DisplayName("Record 3519: State is MS")
	void StateOfRecord3519() {
		assertEquals("MS", customers.get(3518).getState());
	}

	@Test
	@DisplayName("Record 3519: ZIP is 39501")
	void ZIPOfRecord3519() {
		assertEquals("39501", customers.get(3518).getZIP());
	}

	@Test
	@DisplayName("Record 3519: Phone is 228-864-4934")
	void PhoneOfRecord3519() {
		assertEquals("228-864-4934", customers.get(3518).getPhone());
	}

	@Test
	@DisplayName("Record 3519: Fax is 228-864-0371")
	void FaxOfRecord3519() {
		assertEquals("228-864-0371", customers.get(3518).getFax());
	}

	@Test
	@DisplayName("Record 3519: Email is francine@sengupta.com")
	void EmailOfRecord3519() {
		assertEquals("francine@sengupta.com", customers.get(3518).getEmail());
	}

	@Test
	@DisplayName("Record 3519: Web is http://www.francinesengupta.com")
	void WebOfRecord3519() {
		assertEquals("http://www.francinesengupta.com", customers.get(3518).getWeb());
	}
}
