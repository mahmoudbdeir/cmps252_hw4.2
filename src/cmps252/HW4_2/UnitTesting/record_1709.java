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

@Tag("23")
class Record_1709 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1709: FirstName is Darrell")
	void FirstNameOfRecord1709() {
		assertEquals("Darrell", customers.get(1708).getFirstName());
	}

	@Test
	@DisplayName("Record 1709: LastName is Jansons")
	void LastNameOfRecord1709() {
		assertEquals("Jansons", customers.get(1708).getLastName());
	}

	@Test
	@DisplayName("Record 1709: Company is Port Printing")
	void CompanyOfRecord1709() {
		assertEquals("Port Printing", customers.get(1708).getCompany());
	}

	@Test
	@DisplayName("Record 1709: Address is 200 Oceangate")
	void AddressOfRecord1709() {
		assertEquals("200 Oceangate", customers.get(1708).getAddress());
	}

	@Test
	@DisplayName("Record 1709: City is Long Beach")
	void CityOfRecord1709() {
		assertEquals("Long Beach", customers.get(1708).getCity());
	}

	@Test
	@DisplayName("Record 1709: County is Los Angeles")
	void CountyOfRecord1709() {
		assertEquals("Los Angeles", customers.get(1708).getCounty());
	}

	@Test
	@DisplayName("Record 1709: State is CA")
	void StateOfRecord1709() {
		assertEquals("CA", customers.get(1708).getState());
	}

	@Test
	@DisplayName("Record 1709: ZIP is 90802")
	void ZIPOfRecord1709() {
		assertEquals("90802", customers.get(1708).getZIP());
	}

	@Test
	@DisplayName("Record 1709: Phone is 562-590-4252")
	void PhoneOfRecord1709() {
		assertEquals("562-590-4252", customers.get(1708).getPhone());
	}

	@Test
	@DisplayName("Record 1709: Fax is 562-590-5009")
	void FaxOfRecord1709() {
		assertEquals("562-590-5009", customers.get(1708).getFax());
	}

	@Test
	@DisplayName("Record 1709: Email is darrell@jansons.com")
	void EmailOfRecord1709() {
		assertEquals("darrell@jansons.com", customers.get(1708).getEmail());
	}

	@Test
	@DisplayName("Record 1709: Web is http://www.darrelljansons.com")
	void WebOfRecord1709() {
		assertEquals("http://www.darrelljansons.com", customers.get(1708).getWeb());
	}
}
