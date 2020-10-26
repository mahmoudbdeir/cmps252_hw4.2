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
class Record_3138 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3138: FirstName is Wilson")
	void FirstNameOfRecord3138() {
		assertEquals("Wilson", customers.get(3137).getFirstName());
	}

	@Test
	@DisplayName("Record 3138: LastName is Maha")
	void LastNameOfRecord3138() {
		assertEquals("Maha", customers.get(3137).getLastName());
	}

	@Test
	@DisplayName("Record 3138: Company is Kluger And Associates Inc")
	void CompanyOfRecord3138() {
		assertEquals("Kluger And Associates Inc", customers.get(3137).getCompany());
	}

	@Test
	@DisplayName("Record 3138: Address is Hwy 69")
	void AddressOfRecord3138() {
		assertEquals("Hwy 69", customers.get(3137).getAddress());
	}

	@Test
	@DisplayName("Record 3138: City is Point")
	void CityOfRecord3138() {
		assertEquals("Point", customers.get(3137).getCity());
	}

	@Test
	@DisplayName("Record 3138: County is Rains")
	void CountyOfRecord3138() {
		assertEquals("Rains", customers.get(3137).getCounty());
	}

	@Test
	@DisplayName("Record 3138: State is TX")
	void StateOfRecord3138() {
		assertEquals("TX", customers.get(3137).getState());
	}

	@Test
	@DisplayName("Record 3138: ZIP is 75472")
	void ZIPOfRecord3138() {
		assertEquals("75472", customers.get(3137).getZIP());
	}

	@Test
	@DisplayName("Record 3138: Phone is 903-598-6506")
	void PhoneOfRecord3138() {
		assertEquals("903-598-6506", customers.get(3137).getPhone());
	}

	@Test
	@DisplayName("Record 3138: Fax is 903-598-7679")
	void FaxOfRecord3138() {
		assertEquals("903-598-7679", customers.get(3137).getFax());
	}

	@Test
	@DisplayName("Record 3138: Email is wilson@maha.com")
	void EmailOfRecord3138() {
		assertEquals("wilson@maha.com", customers.get(3137).getEmail());
	}

	@Test
	@DisplayName("Record 3138: Web is http://www.wilsonmaha.com")
	void WebOfRecord3138() {
		assertEquals("http://www.wilsonmaha.com", customers.get(3137).getWeb());
	}
}
