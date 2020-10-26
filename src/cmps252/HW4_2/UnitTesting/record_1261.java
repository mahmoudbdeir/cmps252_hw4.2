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

@Tag("38")
class Record_1261 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1261: FirstName is Shawn")
	void FirstNameOfRecord1261() {
		assertEquals("Shawn", customers.get(1260).getFirstName());
	}

	@Test
	@DisplayName("Record 1261: LastName is Gamello")
	void LastNameOfRecord1261() {
		assertEquals("Gamello", customers.get(1260).getLastName());
	}

	@Test
	@DisplayName("Record 1261: Company is Detoronics Corporation")
	void CompanyOfRecord1261() {
		assertEquals("Detoronics Corporation", customers.get(1260).getCompany());
	}

	@Test
	@DisplayName("Record 1261: Address is 9733 Kenwood Rd")
	void AddressOfRecord1261() {
		assertEquals("9733 Kenwood Rd", customers.get(1260).getAddress());
	}

	@Test
	@DisplayName("Record 1261: City is Cincinnati")
	void CityOfRecord1261() {
		assertEquals("Cincinnati", customers.get(1260).getCity());
	}

	@Test
	@DisplayName("Record 1261: County is Hamilton")
	void CountyOfRecord1261() {
		assertEquals("Hamilton", customers.get(1260).getCounty());
	}

	@Test
	@DisplayName("Record 1261: State is OH")
	void StateOfRecord1261() {
		assertEquals("OH", customers.get(1260).getState());
	}

	@Test
	@DisplayName("Record 1261: ZIP is 45242")
	void ZIPOfRecord1261() {
		assertEquals("45242", customers.get(1260).getZIP());
	}

	@Test
	@DisplayName("Record 1261: Phone is 513-792-7555")
	void PhoneOfRecord1261() {
		assertEquals("513-792-7555", customers.get(1260).getPhone());
	}

	@Test
	@DisplayName("Record 1261: Fax is 513-792-2215")
	void FaxOfRecord1261() {
		assertEquals("513-792-2215", customers.get(1260).getFax());
	}

	@Test
	@DisplayName("Record 1261: Email is shawn@gamello.com")
	void EmailOfRecord1261() {
		assertEquals("shawn@gamello.com", customers.get(1260).getEmail());
	}

	@Test
	@DisplayName("Record 1261: Web is http://www.shawngamello.com")
	void WebOfRecord1261() {
		assertEquals("http://www.shawngamello.com", customers.get(1260).getWeb());
	}
}
