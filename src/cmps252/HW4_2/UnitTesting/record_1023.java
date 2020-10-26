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
class Record_1023 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1023: FirstName is Beatriz")
	void FirstNameOfRecord1023() {
		assertEquals("Beatriz", customers.get(1022).getFirstName());
	}

	@Test
	@DisplayName("Record 1023: LastName is Grams")
	void LastNameOfRecord1023() {
		assertEquals("Grams", customers.get(1022).getLastName());
	}

	@Test
	@DisplayName("Record 1023: Company is Dottie Edge Realty Co Inc")
	void CompanyOfRecord1023() {
		assertEquals("Dottie Edge Realty Co Inc", customers.get(1022).getCompany());
	}

	@Test
	@DisplayName("Record 1023: Address is Hwy 65 & 3 Rd")
	void AddressOfRecord1023() {
		assertEquals("Hwy 65 & 3 Rd", customers.get(1022).getAddress());
	}

	@Test
	@DisplayName("Record 1023: City is Hollister")
	void CityOfRecord1023() {
		assertEquals("Hollister", customers.get(1022).getCity());
	}

	@Test
	@DisplayName("Record 1023: County is Taney")
	void CountyOfRecord1023() {
		assertEquals("Taney", customers.get(1022).getCounty());
	}

	@Test
	@DisplayName("Record 1023: State is MO")
	void StateOfRecord1023() {
		assertEquals("MO", customers.get(1022).getState());
	}

	@Test
	@DisplayName("Record 1023: ZIP is 65672")
	void ZIPOfRecord1023() {
		assertEquals("65672", customers.get(1022).getZIP());
	}

	@Test
	@DisplayName("Record 1023: Phone is 417-336-9157")
	void PhoneOfRecord1023() {
		assertEquals("417-336-9157", customers.get(1022).getPhone());
	}

	@Test
	@DisplayName("Record 1023: Fax is 417-336-8152")
	void FaxOfRecord1023() {
		assertEquals("417-336-8152", customers.get(1022).getFax());
	}

	@Test
	@DisplayName("Record 1023: Email is beatriz@grams.com")
	void EmailOfRecord1023() {
		assertEquals("beatriz@grams.com", customers.get(1022).getEmail());
	}

	@Test
	@DisplayName("Record 1023: Web is http://www.beatrizgrams.com")
	void WebOfRecord1023() {
		assertEquals("http://www.beatrizgrams.com", customers.get(1022).getWeb());
	}
}
