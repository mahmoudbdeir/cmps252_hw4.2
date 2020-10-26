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
class Record_1015 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1015: FirstName is Kate")
	void FirstNameOfRecord1015() {
		assertEquals("Kate", customers.get(1014).getFirstName());
	}

	@Test
	@DisplayName("Record 1015: LastName is Veasey")
	void LastNameOfRecord1015() {
		assertEquals("Veasey", customers.get(1014).getLastName());
	}

	@Test
	@DisplayName("Record 1015: Company is Wayne Industries Inc")
	void CompanyOfRecord1015() {
		assertEquals("Wayne Industries Inc", customers.get(1014).getCompany());
	}

	@Test
	@DisplayName("Record 1015: Address is 1211 Sw 5th Ave")
	void AddressOfRecord1015() {
		assertEquals("1211 Sw 5th Ave", customers.get(1014).getAddress());
	}

	@Test
	@DisplayName("Record 1015: City is Portland")
	void CityOfRecord1015() {
		assertEquals("Portland", customers.get(1014).getCity());
	}

	@Test
	@DisplayName("Record 1015: County is Multnomah")
	void CountyOfRecord1015() {
		assertEquals("Multnomah", customers.get(1014).getCounty());
	}

	@Test
	@DisplayName("Record 1015: State is OR")
	void StateOfRecord1015() {
		assertEquals("OR", customers.get(1014).getState());
	}

	@Test
	@DisplayName("Record 1015: ZIP is 97204")
	void ZIPOfRecord1015() {
		assertEquals("97204", customers.get(1014).getZIP());
	}

	@Test
	@DisplayName("Record 1015: Phone is 503-796-5078")
	void PhoneOfRecord1015() {
		assertEquals("503-796-5078", customers.get(1014).getPhone());
	}

	@Test
	@DisplayName("Record 1015: Fax is 503-796-6687")
	void FaxOfRecord1015() {
		assertEquals("503-796-6687", customers.get(1014).getFax());
	}

	@Test
	@DisplayName("Record 1015: Email is kate@veasey.com")
	void EmailOfRecord1015() {
		assertEquals("kate@veasey.com", customers.get(1014).getEmail());
	}

	@Test
	@DisplayName("Record 1015: Web is http://www.kateveasey.com")
	void WebOfRecord1015() {
		assertEquals("http://www.kateveasey.com", customers.get(1014).getWeb());
	}
}
