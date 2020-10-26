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

@Tag("5")
class Record_1310 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1310: FirstName is Nick")
	void FirstNameOfRecord1310() {
		assertEquals("Nick", customers.get(1309).getFirstName());
	}

	@Test
	@DisplayName("Record 1310: LastName is Bundley")
	void LastNameOfRecord1310() {
		assertEquals("Bundley", customers.get(1309).getLastName());
	}

	@Test
	@DisplayName("Record 1310: Company is Annen, Richard J Esq")
	void CompanyOfRecord1310() {
		assertEquals("Annen, Richard J Esq", customers.get(1309).getCompany());
	}

	@Test
	@DisplayName("Record 1310: Address is 109 Worcester Rd")
	void AddressOfRecord1310() {
		assertEquals("109 Worcester Rd", customers.get(1309).getAddress());
	}

	@Test
	@DisplayName("Record 1310: City is Webster")
	void CityOfRecord1310() {
		assertEquals("Webster", customers.get(1309).getCity());
	}

	@Test
	@DisplayName("Record 1310: County is Worcester")
	void CountyOfRecord1310() {
		assertEquals("Worcester", customers.get(1309).getCounty());
	}

	@Test
	@DisplayName("Record 1310: State is MA")
	void StateOfRecord1310() {
		assertEquals("MA", customers.get(1309).getState());
	}

	@Test
	@DisplayName("Record 1310: ZIP is 1570")
	void ZIPOfRecord1310() {
		assertEquals("1570", customers.get(1309).getZIP());
	}

	@Test
	@DisplayName("Record 1310: Phone is 508-943-5953")
	void PhoneOfRecord1310() {
		assertEquals("508-943-5953", customers.get(1309).getPhone());
	}

	@Test
	@DisplayName("Record 1310: Fax is 508-943-6836")
	void FaxOfRecord1310() {
		assertEquals("508-943-6836", customers.get(1309).getFax());
	}

	@Test
	@DisplayName("Record 1310: Email is nick@bundley.com")
	void EmailOfRecord1310() {
		assertEquals("nick@bundley.com", customers.get(1309).getEmail());
	}

	@Test
	@DisplayName("Record 1310: Web is http://www.nickbundley.com")
	void WebOfRecord1310() {
		assertEquals("http://www.nickbundley.com", customers.get(1309).getWeb());
	}
}
