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

@Tag("42")
class Record_3913 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3913: FirstName is Brandon")
	void FirstNameOfRecord3913() {
		assertEquals("Brandon", customers.get(3912).getFirstName());
	}

	@Test
	@DisplayName("Record 3913: LastName is Shimek")
	void LastNameOfRecord3913() {
		assertEquals("Shimek", customers.get(3912).getLastName());
	}

	@Test
	@DisplayName("Record 3913: Company is Wyner Distributing Co")
	void CompanyOfRecord3913() {
		assertEquals("Wyner Distributing Co", customers.get(3912).getCompany());
	}

	@Test
	@DisplayName("Record 3913: Address is 1211 Sw 5th Ave  #-2000")
	void AddressOfRecord3913() {
		assertEquals("1211 Sw 5th Ave  #-2000", customers.get(3912).getAddress());
	}

	@Test
	@DisplayName("Record 3913: City is Portland")
	void CityOfRecord3913() {
		assertEquals("Portland", customers.get(3912).getCity());
	}

	@Test
	@DisplayName("Record 3913: County is Multnomah")
	void CountyOfRecord3913() {
		assertEquals("Multnomah", customers.get(3912).getCounty());
	}

	@Test
	@DisplayName("Record 3913: State is OR")
	void StateOfRecord3913() {
		assertEquals("OR", customers.get(3912).getState());
	}

	@Test
	@DisplayName("Record 3913: ZIP is 97204")
	void ZIPOfRecord3913() {
		assertEquals("97204", customers.get(3912).getZIP());
	}

	@Test
	@DisplayName("Record 3913: Phone is 503-796-3274")
	void PhoneOfRecord3913() {
		assertEquals("503-796-3274", customers.get(3912).getPhone());
	}

	@Test
	@DisplayName("Record 3913: Fax is 503-796-1709")
	void FaxOfRecord3913() {
		assertEquals("503-796-1709", customers.get(3912).getFax());
	}

	@Test
	@DisplayName("Record 3913: Email is brandon@shimek.com")
	void EmailOfRecord3913() {
		assertEquals("brandon@shimek.com", customers.get(3912).getEmail());
	}

	@Test
	@DisplayName("Record 3913: Web is http://www.brandonshimek.com")
	void WebOfRecord3913() {
		assertEquals("http://www.brandonshimek.com", customers.get(3912).getWeb());
	}
}
