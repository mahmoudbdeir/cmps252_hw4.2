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

@Tag("37")
class Record_1094 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1094: FirstName is Chasity")
	void FirstNameOfRecord1094() {
		assertEquals("Chasity", customers.get(1093).getFirstName());
	}

	@Test
	@DisplayName("Record 1094: LastName is Peaker")
	void LastNameOfRecord1094() {
		assertEquals("Peaker", customers.get(1093).getLastName());
	}

	@Test
	@DisplayName("Record 1094: Company is Doe Anderson Advtsng & Pub Rel")
	void CompanyOfRecord1094() {
		assertEquals("Doe Anderson Advtsng & Pub Rel", customers.get(1093).getCompany());
	}

	@Test
	@DisplayName("Record 1094: Address is 115 Wooster St")
	void AddressOfRecord1094() {
		assertEquals("115 Wooster St", customers.get(1093).getAddress());
	}

	@Test
	@DisplayName("Record 1094: City is Bethel")
	void CityOfRecord1094() {
		assertEquals("Bethel", customers.get(1093).getCity());
	}

	@Test
	@DisplayName("Record 1094: County is Fairfield")
	void CountyOfRecord1094() {
		assertEquals("Fairfield", customers.get(1093).getCounty());
	}

	@Test
	@DisplayName("Record 1094: State is CT")
	void StateOfRecord1094() {
		assertEquals("CT", customers.get(1093).getState());
	}

	@Test
	@DisplayName("Record 1094: ZIP is 6801")
	void ZIPOfRecord1094() {
		assertEquals("6801", customers.get(1093).getZIP());
	}

	@Test
	@DisplayName("Record 1094: Phone is 203-778-1211")
	void PhoneOfRecord1094() {
		assertEquals("203-778-1211", customers.get(1093).getPhone());
	}

	@Test
	@DisplayName("Record 1094: Fax is 203-778-2994")
	void FaxOfRecord1094() {
		assertEquals("203-778-2994", customers.get(1093).getFax());
	}

	@Test
	@DisplayName("Record 1094: Email is chasity@peaker.com")
	void EmailOfRecord1094() {
		assertEquals("chasity@peaker.com", customers.get(1093).getEmail());
	}

	@Test
	@DisplayName("Record 1094: Web is http://www.chasitypeaker.com")
	void WebOfRecord1094() {
		assertEquals("http://www.chasitypeaker.com", customers.get(1093).getWeb());
	}
}
