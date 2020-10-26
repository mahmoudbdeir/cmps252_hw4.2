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
class Record_534 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 534: FirstName is Lindsey")
	void FirstNameOfRecord534() {
		assertEquals("Lindsey", customers.get(533).getFirstName());
	}

	@Test
	@DisplayName("Record 534: LastName is Michocki")
	void LastNameOfRecord534() {
		assertEquals("Michocki", customers.get(533).getLastName());
	}

	@Test
	@DisplayName("Record 534: Company is Ink Spot Printing Med Svc Inc")
	void CompanyOfRecord534() {
		assertEquals("Ink Spot Printing Med Svc Inc", customers.get(533).getCompany());
	}

	@Test
	@DisplayName("Record 534: Address is 1691 Los Angeles Ave")
	void AddressOfRecord534() {
		assertEquals("1691 Los Angeles Ave", customers.get(533).getAddress());
	}

	@Test
	@DisplayName("Record 534: City is Ventura")
	void CityOfRecord534() {
		assertEquals("Ventura", customers.get(533).getCity());
	}

	@Test
	@DisplayName("Record 534: County is Ventura")
	void CountyOfRecord534() {
		assertEquals("Ventura", customers.get(533).getCounty());
	}

	@Test
	@DisplayName("Record 534: State is CA")
	void StateOfRecord534() {
		assertEquals("CA", customers.get(533).getState());
	}

	@Test
	@DisplayName("Record 534: ZIP is 93004")
	void ZIPOfRecord534() {
		assertEquals("93004", customers.get(533).getZIP());
	}

	@Test
	@DisplayName("Record 534: Phone is 805-659-3697")
	void PhoneOfRecord534() {
		assertEquals("805-659-3697", customers.get(533).getPhone());
	}

	@Test
	@DisplayName("Record 534: Fax is 805-659-8553")
	void FaxOfRecord534() {
		assertEquals("805-659-8553", customers.get(533).getFax());
	}

	@Test
	@DisplayName("Record 534: Email is lindsey@michocki.com")
	void EmailOfRecord534() {
		assertEquals("lindsey@michocki.com", customers.get(533).getEmail());
	}

	@Test
	@DisplayName("Record 534: Web is http://www.lindseymichocki.com")
	void WebOfRecord534() {
		assertEquals("http://www.lindseymichocki.com", customers.get(533).getWeb());
	}
}
