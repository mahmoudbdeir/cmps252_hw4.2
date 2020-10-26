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

@Tag("48")
class Record_1466 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1466: FirstName is Karl")
	void FirstNameOfRecord1466() {
		assertEquals("Karl", customers.get(1465).getFirstName());
	}

	@Test
	@DisplayName("Record 1466: LastName is Huber")
	void LastNameOfRecord1466() {
		assertEquals("Huber", customers.get(1465).getLastName());
	}

	@Test
	@DisplayName("Record 1466: Company is Toledo Scale")
	void CompanyOfRecord1466() {
		assertEquals("Toledo Scale", customers.get(1465).getCompany());
	}

	@Test
	@DisplayName("Record 1466: Address is 304 Hudson St")
	void AddressOfRecord1466() {
		assertEquals("304 Hudson St", customers.get(1465).getAddress());
	}

	@Test
	@DisplayName("Record 1466: City is New York")
	void CityOfRecord1466() {
		assertEquals("New York", customers.get(1465).getCity());
	}

	@Test
	@DisplayName("Record 1466: County is New York")
	void CountyOfRecord1466() {
		assertEquals("New York", customers.get(1465).getCounty());
	}

	@Test
	@DisplayName("Record 1466: State is NY")
	void StateOfRecord1466() {
		assertEquals("NY", customers.get(1465).getState());
	}

	@Test
	@DisplayName("Record 1466: ZIP is 10013")
	void ZIPOfRecord1466() {
		assertEquals("10013", customers.get(1465).getZIP());
	}

	@Test
	@DisplayName("Record 1466: Phone is 212-633-0610")
	void PhoneOfRecord1466() {
		assertEquals("212-633-0610", customers.get(1465).getPhone());
	}

	@Test
	@DisplayName("Record 1466: Fax is 212-633-3723")
	void FaxOfRecord1466() {
		assertEquals("212-633-3723", customers.get(1465).getFax());
	}

	@Test
	@DisplayName("Record 1466: Email is karl@huber.com")
	void EmailOfRecord1466() {
		assertEquals("karl@huber.com", customers.get(1465).getEmail());
	}

	@Test
	@DisplayName("Record 1466: Web is http://www.karlhuber.com")
	void WebOfRecord1466() {
		assertEquals("http://www.karlhuber.com", customers.get(1465).getWeb());
	}
}
