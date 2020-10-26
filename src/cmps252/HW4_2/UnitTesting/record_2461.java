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

@Tag("27")
class Record_2461 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2461: FirstName is Maggie")
	void FirstNameOfRecord2461() {
		assertEquals("Maggie", customers.get(2460).getFirstName());
	}

	@Test
	@DisplayName("Record 2461: LastName is Mcilvenny")
	void LastNameOfRecord2461() {
		assertEquals("Mcilvenny", customers.get(2460).getLastName());
	}

	@Test
	@DisplayName("Record 2461: Company is Park West Development Co")
	void CompanyOfRecord2461() {
		assertEquals("Park West Development Co", customers.get(2460).getCompany());
	}

	@Test
	@DisplayName("Record 2461: Address is 2100 Nw 99th Ave")
	void AddressOfRecord2461() {
		assertEquals("2100 Nw 99th Ave", customers.get(2460).getAddress());
	}

	@Test
	@DisplayName("Record 2461: City is Miami")
	void CityOfRecord2461() {
		assertEquals("Miami", customers.get(2460).getCity());
	}

	@Test
	@DisplayName("Record 2461: County is Miami-Dade")
	void CountyOfRecord2461() {
		assertEquals("Miami-Dade", customers.get(2460).getCounty());
	}

	@Test
	@DisplayName("Record 2461: State is FL")
	void StateOfRecord2461() {
		assertEquals("FL", customers.get(2460).getState());
	}

	@Test
	@DisplayName("Record 2461: ZIP is 33172")
	void ZIPOfRecord2461() {
		assertEquals("33172", customers.get(2460).getZIP());
	}

	@Test
	@DisplayName("Record 2461: Phone is 305-477-5422")
	void PhoneOfRecord2461() {
		assertEquals("305-477-5422", customers.get(2460).getPhone());
	}

	@Test
	@DisplayName("Record 2461: Fax is 305-477-3617")
	void FaxOfRecord2461() {
		assertEquals("305-477-3617", customers.get(2460).getFax());
	}

	@Test
	@DisplayName("Record 2461: Email is maggie@mcilvenny.com")
	void EmailOfRecord2461() {
		assertEquals("maggie@mcilvenny.com", customers.get(2460).getEmail());
	}

	@Test
	@DisplayName("Record 2461: Web is http://www.maggiemcilvenny.com")
	void WebOfRecord2461() {
		assertEquals("http://www.maggiemcilvenny.com", customers.get(2460).getWeb());
	}
}
