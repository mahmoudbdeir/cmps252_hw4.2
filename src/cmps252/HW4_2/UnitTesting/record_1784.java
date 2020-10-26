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

@Tag("4")
class Record_1784 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1784: FirstName is Jarvis")
	void FirstNameOfRecord1784() {
		assertEquals("Jarvis", customers.get(1783).getFirstName());
	}

	@Test
	@DisplayName("Record 1784: LastName is Bermea")
	void LastNameOfRecord1784() {
		assertEquals("Bermea", customers.get(1783).getLastName());
	}

	@Test
	@DisplayName("Record 1784: Company is Crow Sevey Gilwee Britt")
	void CompanyOfRecord1784() {
		assertEquals("Crow Sevey Gilwee Britt", customers.get(1783).getCompany());
	}

	@Test
	@DisplayName("Record 1784: Address is 553 E Jefferson Ave")
	void AddressOfRecord1784() {
		assertEquals("553 E Jefferson Ave", customers.get(1783).getAddress());
	}

	@Test
	@DisplayName("Record 1784: City is Detroit")
	void CityOfRecord1784() {
		assertEquals("Detroit", customers.get(1783).getCity());
	}

	@Test
	@DisplayName("Record 1784: County is Wayne")
	void CountyOfRecord1784() {
		assertEquals("Wayne", customers.get(1783).getCounty());
	}

	@Test
	@DisplayName("Record 1784: State is MI")
	void StateOfRecord1784() {
		assertEquals("MI", customers.get(1783).getState());
	}

	@Test
	@DisplayName("Record 1784: ZIP is 48226")
	void ZIPOfRecord1784() {
		assertEquals("48226", customers.get(1783).getZIP());
	}

	@Test
	@DisplayName("Record 1784: Phone is 313-965-4742")
	void PhoneOfRecord1784() {
		assertEquals("313-965-4742", customers.get(1783).getPhone());
	}

	@Test
	@DisplayName("Record 1784: Fax is 313-965-4266")
	void FaxOfRecord1784() {
		assertEquals("313-965-4266", customers.get(1783).getFax());
	}

	@Test
	@DisplayName("Record 1784: Email is jarvis@bermea.com")
	void EmailOfRecord1784() {
		assertEquals("jarvis@bermea.com", customers.get(1783).getEmail());
	}

	@Test
	@DisplayName("Record 1784: Web is http://www.jarvisbermea.com")
	void WebOfRecord1784() {
		assertEquals("http://www.jarvisbermea.com", customers.get(1783).getWeb());
	}
}
