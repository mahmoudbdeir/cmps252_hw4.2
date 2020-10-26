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

@Tag("29")
class Record_1283 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1283: FirstName is Lucile")
	void FirstNameOfRecord1283() {
		assertEquals("Lucile", customers.get(1282).getFirstName());
	}

	@Test
	@DisplayName("Record 1283: LastName is Dery")
	void LastNameOfRecord1283() {
		assertEquals("Dery", customers.get(1282).getLastName());
	}

	@Test
	@DisplayName("Record 1283: Company is Montgomery Elevator Co")
	void CompanyOfRecord1283() {
		assertEquals("Montgomery Elevator Co", customers.get(1282).getCompany());
	}

	@Test
	@DisplayName("Record 1283: Address is International Plz")
	void AddressOfRecord1283() {
		assertEquals("International Plz", customers.get(1282).getAddress());
	}

	@Test
	@DisplayName("Record 1283: City is Newark")
	void CityOfRecord1283() {
		assertEquals("Newark", customers.get(1282).getCity());
	}

	@Test
	@DisplayName("Record 1283: County is Essex")
	void CountyOfRecord1283() {
		assertEquals("Essex", customers.get(1282).getCounty());
	}

	@Test
	@DisplayName("Record 1283: State is NJ")
	void StateOfRecord1283() {
		assertEquals("NJ", customers.get(1282).getState());
	}

	@Test
	@DisplayName("Record 1283: ZIP is 7114")
	void ZIPOfRecord1283() {
		assertEquals("7114", customers.get(1282).getZIP());
	}

	@Test
	@DisplayName("Record 1283: Phone is 973-824-6707")
	void PhoneOfRecord1283() {
		assertEquals("973-824-6707", customers.get(1282).getPhone());
	}

	@Test
	@DisplayName("Record 1283: Fax is 973-824-2931")
	void FaxOfRecord1283() {
		assertEquals("973-824-2931", customers.get(1282).getFax());
	}

	@Test
	@DisplayName("Record 1283: Email is lucile@dery.com")
	void EmailOfRecord1283() {
		assertEquals("lucile@dery.com", customers.get(1282).getEmail());
	}

	@Test
	@DisplayName("Record 1283: Web is http://www.luciledery.com")
	void WebOfRecord1283() {
		assertEquals("http://www.luciledery.com", customers.get(1282).getWeb());
	}
}
