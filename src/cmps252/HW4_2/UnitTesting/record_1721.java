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

@Tag("16")
class Record_1721 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1721: FirstName is Robin")
	void FirstNameOfRecord1721() {
		assertEquals("Robin", customers.get(1720).getFirstName());
	}

	@Test
	@DisplayName("Record 1721: LastName is Fetch")
	void LastNameOfRecord1721() {
		assertEquals("Fetch", customers.get(1720).getLastName());
	}

	@Test
	@DisplayName("Record 1721: Company is Yeshiva Gedolah Bais Yisroel")
	void CompanyOfRecord1721() {
		assertEquals("Yeshiva Gedolah Bais Yisroel", customers.get(1720).getCompany());
	}

	@Test
	@DisplayName("Record 1721: Address is 401 Cleveland Ave")
	void AddressOfRecord1721() {
		assertEquals("401 Cleveland Ave", customers.get(1720).getAddress());
	}

	@Test
	@DisplayName("Record 1721: City is Highland Park")
	void CityOfRecord1721() {
		assertEquals("Highland Park", customers.get(1720).getCity());
	}

	@Test
	@DisplayName("Record 1721: County is Middlesex")
	void CountyOfRecord1721() {
		assertEquals("Middlesex", customers.get(1720).getCounty());
	}

	@Test
	@DisplayName("Record 1721: State is NJ")
	void StateOfRecord1721() {
		assertEquals("NJ", customers.get(1720).getState());
	}

	@Test
	@DisplayName("Record 1721: ZIP is 8904")
	void ZIPOfRecord1721() {
		assertEquals("8904", customers.get(1720).getZIP());
	}

	@Test
	@DisplayName("Record 1721: Phone is 732-545-9029")
	void PhoneOfRecord1721() {
		assertEquals("732-545-9029", customers.get(1720).getPhone());
	}

	@Test
	@DisplayName("Record 1721: Fax is 732-545-0872")
	void FaxOfRecord1721() {
		assertEquals("732-545-0872", customers.get(1720).getFax());
	}

	@Test
	@DisplayName("Record 1721: Email is robin@fetch.com")
	void EmailOfRecord1721() {
		assertEquals("robin@fetch.com", customers.get(1720).getEmail());
	}

	@Test
	@DisplayName("Record 1721: Web is http://www.robinfetch.com")
	void WebOfRecord1721() {
		assertEquals("http://www.robinfetch.com", customers.get(1720).getWeb());
	}
}
