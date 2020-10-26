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

@Tag("7")
class Record_922 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 922: FirstName is Alyce")
	void FirstNameOfRecord922() {
		assertEquals("Alyce", customers.get(921).getFirstName());
	}

	@Test
	@DisplayName("Record 922: LastName is Lafevre")
	void LastNameOfRecord922() {
		assertEquals("Lafevre", customers.get(921).getLastName());
	}

	@Test
	@DisplayName("Record 922: Company is D & D Metal Products")
	void CompanyOfRecord922() {
		assertEquals("D & D Metal Products", customers.get(921).getCompany());
	}

	@Test
	@DisplayName("Record 922: Address is 54 W 21st St")
	void AddressOfRecord922() {
		assertEquals("54 W 21st St", customers.get(921).getAddress());
	}

	@Test
	@DisplayName("Record 922: City is New York")
	void CityOfRecord922() {
		assertEquals("New York", customers.get(921).getCity());
	}

	@Test
	@DisplayName("Record 922: County is New York")
	void CountyOfRecord922() {
		assertEquals("New York", customers.get(921).getCounty());
	}

	@Test
	@DisplayName("Record 922: State is NY")
	void StateOfRecord922() {
		assertEquals("NY", customers.get(921).getState());
	}

	@Test
	@DisplayName("Record 922: ZIP is 10010")
	void ZIPOfRecord922() {
		assertEquals("10010", customers.get(921).getZIP());
	}

	@Test
	@DisplayName("Record 922: Phone is 212-243-9180")
	void PhoneOfRecord922() {
		assertEquals("212-243-9180", customers.get(921).getPhone());
	}

	@Test
	@DisplayName("Record 922: Fax is 212-243-2944")
	void FaxOfRecord922() {
		assertEquals("212-243-2944", customers.get(921).getFax());
	}

	@Test
	@DisplayName("Record 922: Email is alyce@lafevre.com")
	void EmailOfRecord922() {
		assertEquals("alyce@lafevre.com", customers.get(921).getEmail());
	}

	@Test
	@DisplayName("Record 922: Web is http://www.alycelafevre.com")
	void WebOfRecord922() {
		assertEquals("http://www.alycelafevre.com", customers.get(921).getWeb());
	}
}
