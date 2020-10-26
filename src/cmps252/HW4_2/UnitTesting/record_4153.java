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

@Tag("33")
class Record_4153 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4153: FirstName is Wade")
	void FirstNameOfRecord4153() {
		assertEquals("Wade", customers.get(4152).getFirstName());
	}

	@Test
	@DisplayName("Record 4153: LastName is Engelhart")
	void LastNameOfRecord4153() {
		assertEquals("Engelhart", customers.get(4152).getLastName());
	}

	@Test
	@DisplayName("Record 4153: Company is Russell Crane Service")
	void CompanyOfRecord4153() {
		assertEquals("Russell Crane Service", customers.get(4152).getCompany());
	}

	@Test
	@DisplayName("Record 4153: Address is 10 E 40th St")
	void AddressOfRecord4153() {
		assertEquals("10 E 40th St", customers.get(4152).getAddress());
	}

	@Test
	@DisplayName("Record 4153: City is New York")
	void CityOfRecord4153() {
		assertEquals("New York", customers.get(4152).getCity());
	}

	@Test
	@DisplayName("Record 4153: County is New York")
	void CountyOfRecord4153() {
		assertEquals("New York", customers.get(4152).getCounty());
	}

	@Test
	@DisplayName("Record 4153: State is NY")
	void StateOfRecord4153() {
		assertEquals("NY", customers.get(4152).getState());
	}

	@Test
	@DisplayName("Record 4153: ZIP is 10016")
	void ZIPOfRecord4153() {
		assertEquals("10016", customers.get(4152).getZIP());
	}

	@Test
	@DisplayName("Record 4153: Phone is 212-689-7574")
	void PhoneOfRecord4153() {
		assertEquals("212-689-7574", customers.get(4152).getPhone());
	}

	@Test
	@DisplayName("Record 4153: Fax is 212-689-3497")
	void FaxOfRecord4153() {
		assertEquals("212-689-3497", customers.get(4152).getFax());
	}

	@Test
	@DisplayName("Record 4153: Email is wade@engelhart.com")
	void EmailOfRecord4153() {
		assertEquals("wade@engelhart.com", customers.get(4152).getEmail());
	}

	@Test
	@DisplayName("Record 4153: Web is http://www.wadeengelhart.com")
	void WebOfRecord4153() {
		assertEquals("http://www.wadeengelhart.com", customers.get(4152).getWeb());
	}
}
