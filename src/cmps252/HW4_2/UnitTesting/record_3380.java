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
class Record_3380 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3380: FirstName is Letha")
	void FirstNameOfRecord3380() {
		assertEquals("Letha", customers.get(3379).getFirstName());
	}

	@Test
	@DisplayName("Record 3380: LastName is Hanstine")
	void LastNameOfRecord3380() {
		assertEquals("Hanstine", customers.get(3379).getLastName());
	}

	@Test
	@DisplayName("Record 3380: Company is Highland Real Estate Inc")
	void CompanyOfRecord3380() {
		assertEquals("Highland Real Estate Inc", customers.get(3379).getCompany());
	}

	@Test
	@DisplayName("Record 3380: Address is 7075 W 20th Ave")
	void AddressOfRecord3380() {
		assertEquals("7075 W 20th Ave", customers.get(3379).getAddress());
	}

	@Test
	@DisplayName("Record 3380: City is Hialeah")
	void CityOfRecord3380() {
		assertEquals("Hialeah", customers.get(3379).getCity());
	}

	@Test
	@DisplayName("Record 3380: County is Miami-Dade")
	void CountyOfRecord3380() {
		assertEquals("Miami-Dade", customers.get(3379).getCounty());
	}

	@Test
	@DisplayName("Record 3380: State is FL")
	void StateOfRecord3380() {
		assertEquals("FL", customers.get(3379).getState());
	}

	@Test
	@DisplayName("Record 3380: ZIP is 33014")
	void ZIPOfRecord3380() {
		assertEquals("33014", customers.get(3379).getZIP());
	}

	@Test
	@DisplayName("Record 3380: Phone is 305-557-9254")
	void PhoneOfRecord3380() {
		assertEquals("305-557-9254", customers.get(3379).getPhone());
	}

	@Test
	@DisplayName("Record 3380: Fax is 305-557-7163")
	void FaxOfRecord3380() {
		assertEquals("305-557-7163", customers.get(3379).getFax());
	}

	@Test
	@DisplayName("Record 3380: Email is letha@hanstine.com")
	void EmailOfRecord3380() {
		assertEquals("letha@hanstine.com", customers.get(3379).getEmail());
	}

	@Test
	@DisplayName("Record 3380: Web is http://www.lethahanstine.com")
	void WebOfRecord3380() {
		assertEquals("http://www.lethahanstine.com", customers.get(3379).getWeb());
	}
}
