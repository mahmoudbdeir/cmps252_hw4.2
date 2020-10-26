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

@Tag("32")
class Record_3247 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3247: FirstName is Mary")
	void FirstNameOfRecord3247() {
		assertEquals("Mary", customers.get(3246).getFirstName());
	}

	@Test
	@DisplayName("Record 3247: LastName is Moncur")
	void LastNameOfRecord3247() {
		assertEquals("Moncur", customers.get(3246).getLastName());
	}

	@Test
	@DisplayName("Record 3247: Company is Frank Kreutser & Co")
	void CompanyOfRecord3247() {
		assertEquals("Frank Kreutser & Co", customers.get(3246).getCompany());
	}

	@Test
	@DisplayName("Record 3247: Address is 1845 Grand Ave")
	void AddressOfRecord3247() {
		assertEquals("1845 Grand Ave", customers.get(3246).getAddress());
	}

	@Test
	@DisplayName("Record 3247: City is Phoenix")
	void CityOfRecord3247() {
		assertEquals("Phoenix", customers.get(3246).getCity());
	}

	@Test
	@DisplayName("Record 3247: County is Maricopa")
	void CountyOfRecord3247() {
		assertEquals("Maricopa", customers.get(3246).getCounty());
	}

	@Test
	@DisplayName("Record 3247: State is AZ")
	void StateOfRecord3247() {
		assertEquals("AZ", customers.get(3246).getState());
	}

	@Test
	@DisplayName("Record 3247: ZIP is 85007")
	void ZIPOfRecord3247() {
		assertEquals("85007", customers.get(3246).getZIP());
	}

	@Test
	@DisplayName("Record 3247: Phone is 602-252-9608")
	void PhoneOfRecord3247() {
		assertEquals("602-252-9608", customers.get(3246).getPhone());
	}

	@Test
	@DisplayName("Record 3247: Fax is 602-252-6198")
	void FaxOfRecord3247() {
		assertEquals("602-252-6198", customers.get(3246).getFax());
	}

	@Test
	@DisplayName("Record 3247: Email is mary@moncur.com")
	void EmailOfRecord3247() {
		assertEquals("mary@moncur.com", customers.get(3246).getEmail());
	}

	@Test
	@DisplayName("Record 3247: Web is http://www.marymoncur.com")
	void WebOfRecord3247() {
		assertEquals("http://www.marymoncur.com", customers.get(3246).getWeb());
	}
}
