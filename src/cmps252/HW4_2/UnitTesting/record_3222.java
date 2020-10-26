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

@Tag("1")
class Record_3222 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3222: FirstName is Jason")
	void FirstNameOfRecord3222() {
		assertEquals("Jason", customers.get(3221).getFirstName());
	}

	@Test
	@DisplayName("Record 3222: LastName is Chmura")
	void LastNameOfRecord3222() {
		assertEquals("Chmura", customers.get(3221).getLastName());
	}

	@Test
	@DisplayName("Record 3222: Company is Northwest Boring Co Inc")
	void CompanyOfRecord3222() {
		assertEquals("Northwest Boring Co Inc", customers.get(3221).getCompany());
	}

	@Test
	@DisplayName("Record 3222: Address is 1700 N Lindbergh Blvd")
	void AddressOfRecord3222() {
		assertEquals("1700 N Lindbergh Blvd", customers.get(3221).getAddress());
	}

	@Test
	@DisplayName("Record 3222: City is Saint Louis")
	void CityOfRecord3222() {
		assertEquals("Saint Louis", customers.get(3221).getCity());
	}

	@Test
	@DisplayName("Record 3222: County is Saint Louis")
	void CountyOfRecord3222() {
		assertEquals("Saint Louis", customers.get(3221).getCounty());
	}

	@Test
	@DisplayName("Record 3222: State is MO")
	void StateOfRecord3222() {
		assertEquals("MO", customers.get(3221).getState());
	}

	@Test
	@DisplayName("Record 3222: ZIP is 63132")
	void ZIPOfRecord3222() {
		assertEquals("63132", customers.get(3221).getZIP());
	}

	@Test
	@DisplayName("Record 3222: Phone is 314-991-9175")
	void PhoneOfRecord3222() {
		assertEquals("314-991-9175", customers.get(3221).getPhone());
	}

	@Test
	@DisplayName("Record 3222: Fax is 314-991-3905")
	void FaxOfRecord3222() {
		assertEquals("314-991-3905", customers.get(3221).getFax());
	}

	@Test
	@DisplayName("Record 3222: Email is jason@chmura.com")
	void EmailOfRecord3222() {
		assertEquals("jason@chmura.com", customers.get(3221).getEmail());
	}

	@Test
	@DisplayName("Record 3222: Web is http://www.jasonchmura.com")
	void WebOfRecord3222() {
		assertEquals("http://www.jasonchmura.com", customers.get(3221).getWeb());
	}
}
