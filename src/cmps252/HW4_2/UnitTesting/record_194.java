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

@Tag("20")
class Record_194 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 194: FirstName is Leo")
	void FirstNameOfRecord194() {
		assertEquals("Leo", customers.get(193).getFirstName());
	}

	@Test
	@DisplayName("Record 194: LastName is Casacchia")
	void LastNameOfRecord194() {
		assertEquals("Casacchia", customers.get(193).getLastName());
	}

	@Test
	@DisplayName("Record 194: Company is Shearer, W David Jr")
	void CompanyOfRecord194() {
		assertEquals("Shearer, W David Jr", customers.get(193).getCompany());
	}

	@Test
	@DisplayName("Record 194: Address is 8943 J St")
	void AddressOfRecord194() {
		assertEquals("8943 J St", customers.get(193).getAddress());
	}

	@Test
	@DisplayName("Record 194: City is Omaha")
	void CityOfRecord194() {
		assertEquals("Omaha", customers.get(193).getCity());
	}

	@Test
	@DisplayName("Record 194: County is Douglas")
	void CountyOfRecord194() {
		assertEquals("Douglas", customers.get(193).getCounty());
	}

	@Test
	@DisplayName("Record 194: State is NE")
	void StateOfRecord194() {
		assertEquals("NE", customers.get(193).getState());
	}

	@Test
	@DisplayName("Record 194: ZIP is 68127")
	void ZIPOfRecord194() {
		assertEquals("68127", customers.get(193).getZIP());
	}

	@Test
	@DisplayName("Record 194: Phone is 402-592-5529")
	void PhoneOfRecord194() {
		assertEquals("402-592-5529", customers.get(193).getPhone());
	}

	@Test
	@DisplayName("Record 194: Fax is 402-592-6247")
	void FaxOfRecord194() {
		assertEquals("402-592-6247", customers.get(193).getFax());
	}

	@Test
	@DisplayName("Record 194: Email is leo@casacchia.com")
	void EmailOfRecord194() {
		assertEquals("leo@casacchia.com", customers.get(193).getEmail());
	}

	@Test
	@DisplayName("Record 194: Web is http://www.leocasacchia.com")
	void WebOfRecord194() {
		assertEquals("http://www.leocasacchia.com", customers.get(193).getWeb());
	}
}
