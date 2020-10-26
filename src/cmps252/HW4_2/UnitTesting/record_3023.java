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

@Tag("10")
class Record_3023 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3023: FirstName is Willa")
	void FirstNameOfRecord3023() {
		assertEquals("Willa", customers.get(3022).getFirstName());
	}

	@Test
	@DisplayName("Record 3023: LastName is Myklebust")
	void LastNameOfRecord3023() {
		assertEquals("Myklebust", customers.get(3022).getLastName());
	}

	@Test
	@DisplayName("Record 3023: Company is Horton Lees Lighting Design")
	void CompanyOfRecord3023() {
		assertEquals("Horton Lees Lighting Design", customers.get(3022).getCompany());
	}

	@Test
	@DisplayName("Record 3023: Address is Hwy 70w W")
	void AddressOfRecord3023() {
		assertEquals("Hwy 70w W", customers.get(3022).getAddress());
	}

	@Test
	@DisplayName("Record 3023: City is Hildebran")
	void CityOfRecord3023() {
		assertEquals("Hildebran", customers.get(3022).getCity());
	}

	@Test
	@DisplayName("Record 3023: County is Burke")
	void CountyOfRecord3023() {
		assertEquals("Burke", customers.get(3022).getCounty());
	}

	@Test
	@DisplayName("Record 3023: State is NC")
	void StateOfRecord3023() {
		assertEquals("NC", customers.get(3022).getState());
	}

	@Test
	@DisplayName("Record 3023: ZIP is 28637")
	void ZIPOfRecord3023() {
		assertEquals("28637", customers.get(3022).getZIP());
	}

	@Test
	@DisplayName("Record 3023: Phone is 828-392-3598")
	void PhoneOfRecord3023() {
		assertEquals("828-392-3598", customers.get(3022).getPhone());
	}

	@Test
	@DisplayName("Record 3023: Fax is 828-392-3907")
	void FaxOfRecord3023() {
		assertEquals("828-392-3907", customers.get(3022).getFax());
	}

	@Test
	@DisplayName("Record 3023: Email is willa@myklebust.com")
	void EmailOfRecord3023() {
		assertEquals("willa@myklebust.com", customers.get(3022).getEmail());
	}

	@Test
	@DisplayName("Record 3023: Web is http://www.willamyklebust.com")
	void WebOfRecord3023() {
		assertEquals("http://www.willamyklebust.com", customers.get(3022).getWeb());
	}
}
