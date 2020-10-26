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

@Tag("40")
class Record_1145 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1145: FirstName is King")
	void FirstNameOfRecord1145() {
		assertEquals("King", customers.get(1144).getFirstName());
	}

	@Test
	@DisplayName("Record 1145: LastName is Syvert")
	void LastNameOfRecord1145() {
		assertEquals("Syvert", customers.get(1144).getLastName());
	}

	@Test
	@DisplayName("Record 1145: Company is Vic Miltiades Insurance")
	void CompanyOfRecord1145() {
		assertEquals("Vic Miltiades Insurance", customers.get(1144).getCompany());
	}

	@Test
	@DisplayName("Record 1145: Address is 4115 8th Ave")
	void AddressOfRecord1145() {
		assertEquals("4115 8th Ave", customers.get(1144).getAddress());
	}

	@Test
	@DisplayName("Record 1145: City is Brooklyn")
	void CityOfRecord1145() {
		assertEquals("Brooklyn", customers.get(1144).getCity());
	}

	@Test
	@DisplayName("Record 1145: County is Kings")
	void CountyOfRecord1145() {
		assertEquals("Kings", customers.get(1144).getCounty());
	}

	@Test
	@DisplayName("Record 1145: State is NY")
	void StateOfRecord1145() {
		assertEquals("NY", customers.get(1144).getState());
	}

	@Test
	@DisplayName("Record 1145: ZIP is 11232")
	void ZIPOfRecord1145() {
		assertEquals("11232", customers.get(1144).getZIP());
	}

	@Test
	@DisplayName("Record 1145: Phone is 718-972-8246")
	void PhoneOfRecord1145() {
		assertEquals("718-972-8246", customers.get(1144).getPhone());
	}

	@Test
	@DisplayName("Record 1145: Fax is 718-972-4486")
	void FaxOfRecord1145() {
		assertEquals("718-972-4486", customers.get(1144).getFax());
	}

	@Test
	@DisplayName("Record 1145: Email is king@syvert.com")
	void EmailOfRecord1145() {
		assertEquals("king@syvert.com", customers.get(1144).getEmail());
	}

	@Test
	@DisplayName("Record 1145: Web is http://www.kingsyvert.com")
	void WebOfRecord1145() {
		assertEquals("http://www.kingsyvert.com", customers.get(1144).getWeb());
	}
}
