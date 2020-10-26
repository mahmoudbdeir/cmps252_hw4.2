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

@Tag("45")
class Record_2364 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2364: FirstName is Shelley")
	void FirstNameOfRecord2364() {
		assertEquals("Shelley", customers.get(2363).getFirstName());
	}

	@Test
	@DisplayName("Record 2364: LastName is Servello")
	void LastNameOfRecord2364() {
		assertEquals("Servello", customers.get(2363).getLastName());
	}

	@Test
	@DisplayName("Record 2364: Company is Lutheran Church Gloria Dy")
	void CompanyOfRecord2364() {
		assertEquals("Lutheran Church Gloria Dy", customers.get(2363).getCompany());
	}

	@Test
	@DisplayName("Record 2364: Address is 424 West St")
	void AddressOfRecord2364() {
		assertEquals("424 West St", customers.get(2363).getAddress());
	}

	@Test
	@DisplayName("Record 2364: City is New York")
	void CityOfRecord2364() {
		assertEquals("New York", customers.get(2363).getCity());
	}

	@Test
	@DisplayName("Record 2364: County is New York")
	void CountyOfRecord2364() {
		assertEquals("New York", customers.get(2363).getCounty());
	}

	@Test
	@DisplayName("Record 2364: State is NY")
	void StateOfRecord2364() {
		assertEquals("NY", customers.get(2363).getState());
	}

	@Test
	@DisplayName("Record 2364: ZIP is 10014")
	void ZIPOfRecord2364() {
		assertEquals("10014", customers.get(2363).getZIP());
	}

	@Test
	@DisplayName("Record 2364: Phone is 212-741-4185")
	void PhoneOfRecord2364() {
		assertEquals("212-741-4185", customers.get(2363).getPhone());
	}

	@Test
	@DisplayName("Record 2364: Fax is 212-741-1166")
	void FaxOfRecord2364() {
		assertEquals("212-741-1166", customers.get(2363).getFax());
	}

	@Test
	@DisplayName("Record 2364: Email is shelley@servello.com")
	void EmailOfRecord2364() {
		assertEquals("shelley@servello.com", customers.get(2363).getEmail());
	}

	@Test
	@DisplayName("Record 2364: Web is http://www.shelleyservello.com")
	void WebOfRecord2364() {
		assertEquals("http://www.shelleyservello.com", customers.get(2363).getWeb());
	}
}
