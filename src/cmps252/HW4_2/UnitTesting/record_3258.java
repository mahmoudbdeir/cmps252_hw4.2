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

@Tag("18")
class Record_3258 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3258: FirstName is Damon")
	void FirstNameOfRecord3258() {
		assertEquals("Damon", customers.get(3257).getFirstName());
	}

	@Test
	@DisplayName("Record 3258: LastName is Bloomstrand")
	void LastNameOfRecord3258() {
		assertEquals("Bloomstrand", customers.get(3257).getLastName());
	}

	@Test
	@DisplayName("Record 3258: Company is Frisbie, Jay")
	void CompanyOfRecord3258() {
		assertEquals("Frisbie, Jay", customers.get(3257).getCompany());
	}

	@Test
	@DisplayName("Record 3258: Address is 2010 E Prospect Rd")
	void AddressOfRecord3258() {
		assertEquals("2010 E Prospect Rd", customers.get(3257).getAddress());
	}

	@Test
	@DisplayName("Record 3258: City is Ashtabula")
	void CityOfRecord3258() {
		assertEquals("Ashtabula", customers.get(3257).getCity());
	}

	@Test
	@DisplayName("Record 3258: County is Ashtabula")
	void CountyOfRecord3258() {
		assertEquals("Ashtabula", customers.get(3257).getCounty());
	}

	@Test
	@DisplayName("Record 3258: State is OH")
	void StateOfRecord3258() {
		assertEquals("OH", customers.get(3257).getState());
	}

	@Test
	@DisplayName("Record 3258: ZIP is 44004")
	void ZIPOfRecord3258() {
		assertEquals("44004", customers.get(3257).getZIP());
	}

	@Test
	@DisplayName("Record 3258: Phone is 440-992-0086")
	void PhoneOfRecord3258() {
		assertEquals("440-992-0086", customers.get(3257).getPhone());
	}

	@Test
	@DisplayName("Record 3258: Fax is 440-992-9384")
	void FaxOfRecord3258() {
		assertEquals("440-992-9384", customers.get(3257).getFax());
	}

	@Test
	@DisplayName("Record 3258: Email is damon@bloomstrand.com")
	void EmailOfRecord3258() {
		assertEquals("damon@bloomstrand.com", customers.get(3257).getEmail());
	}

	@Test
	@DisplayName("Record 3258: Web is http://www.damonbloomstrand.com")
	void WebOfRecord3258() {
		assertEquals("http://www.damonbloomstrand.com", customers.get(3257).getWeb());
	}
}
