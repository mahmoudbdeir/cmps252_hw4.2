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

@Tag("12")
class Record_2026 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2026: FirstName is Reta")
	void FirstNameOfRecord2026() {
		assertEquals("Reta", customers.get(2025).getFirstName());
	}

	@Test
	@DisplayName("Record 2026: LastName is Lalinde")
	void LastNameOfRecord2026() {
		assertEquals("Lalinde", customers.get(2025).getLastName());
	}

	@Test
	@DisplayName("Record 2026: Company is Video Catalog Co Inc")
	void CompanyOfRecord2026() {
		assertEquals("Video Catalog Co Inc", customers.get(2025).getCompany());
	}

	@Test
	@DisplayName("Record 2026: Address is 5828 Ne 8th Ave")
	void AddressOfRecord2026() {
		assertEquals("5828 Ne 8th Ave", customers.get(2025).getAddress());
	}

	@Test
	@DisplayName("Record 2026: City is Portland")
	void CityOfRecord2026() {
		assertEquals("Portland", customers.get(2025).getCity());
	}

	@Test
	@DisplayName("Record 2026: County is Multnomah")
	void CountyOfRecord2026() {
		assertEquals("Multnomah", customers.get(2025).getCounty());
	}

	@Test
	@DisplayName("Record 2026: State is OR")
	void StateOfRecord2026() {
		assertEquals("OR", customers.get(2025).getState());
	}

	@Test
	@DisplayName("Record 2026: ZIP is 97211")
	void ZIPOfRecord2026() {
		assertEquals("97211", customers.get(2025).getZIP());
	}

	@Test
	@DisplayName("Record 2026: Phone is 503-288-1644")
	void PhoneOfRecord2026() {
		assertEquals("503-288-1644", customers.get(2025).getPhone());
	}

	@Test
	@DisplayName("Record 2026: Fax is 503-288-0367")
	void FaxOfRecord2026() {
		assertEquals("503-288-0367", customers.get(2025).getFax());
	}

	@Test
	@DisplayName("Record 2026: Email is reta@lalinde.com")
	void EmailOfRecord2026() {
		assertEquals("reta@lalinde.com", customers.get(2025).getEmail());
	}

	@Test
	@DisplayName("Record 2026: Web is http://www.retalalinde.com")
	void WebOfRecord2026() {
		assertEquals("http://www.retalalinde.com", customers.get(2025).getWeb());
	}
}
