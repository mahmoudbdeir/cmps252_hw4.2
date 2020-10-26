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

@Tag("11")
class Record_1272 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1272: FirstName is Otto")
	void FirstNameOfRecord1272() {
		assertEquals("Otto", customers.get(1271).getFirstName());
	}

	@Test
	@DisplayName("Record 1272: LastName is Terrel")
	void LastNameOfRecord1272() {
		assertEquals("Terrel", customers.get(1271).getLastName());
	}

	@Test
	@DisplayName("Record 1272: Company is Mackies Pizza Of Harrisburg")
	void CompanyOfRecord1272() {
		assertEquals("Mackies Pizza Of Harrisburg", customers.get(1271).getCompany());
	}

	@Test
	@DisplayName("Record 1272: Address is 1919 Nw 19th Ave")
	void AddressOfRecord1272() {
		assertEquals("1919 Nw 19th Ave", customers.get(1271).getAddress());
	}

	@Test
	@DisplayName("Record 1272: City is Portland")
	void CityOfRecord1272() {
		assertEquals("Portland", customers.get(1271).getCity());
	}

	@Test
	@DisplayName("Record 1272: County is Multnomah")
	void CountyOfRecord1272() {
		assertEquals("Multnomah", customers.get(1271).getCounty());
	}

	@Test
	@DisplayName("Record 1272: State is OR")
	void StateOfRecord1272() {
		assertEquals("OR", customers.get(1271).getState());
	}

	@Test
	@DisplayName("Record 1272: ZIP is 97209")
	void ZIPOfRecord1272() {
		assertEquals("97209", customers.get(1271).getZIP());
	}

	@Test
	@DisplayName("Record 1272: Phone is 503-221-5259")
	void PhoneOfRecord1272() {
		assertEquals("503-221-5259", customers.get(1271).getPhone());
	}

	@Test
	@DisplayName("Record 1272: Fax is 503-221-0457")
	void FaxOfRecord1272() {
		assertEquals("503-221-0457", customers.get(1271).getFax());
	}

	@Test
	@DisplayName("Record 1272: Email is otto@terrel.com")
	void EmailOfRecord1272() {
		assertEquals("otto@terrel.com", customers.get(1271).getEmail());
	}

	@Test
	@DisplayName("Record 1272: Web is http://www.ottoterrel.com")
	void WebOfRecord1272() {
		assertEquals("http://www.ottoterrel.com", customers.get(1271).getWeb());
	}
}
