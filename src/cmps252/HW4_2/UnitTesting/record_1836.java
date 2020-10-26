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

@Tag("3")
class Record_1836 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1836: FirstName is Malissa")
	void FirstNameOfRecord1836() {
		assertEquals("Malissa", customers.get(1835).getFirstName());
	}

	@Test
	@DisplayName("Record 1836: LastName is Strassell")
	void LastNameOfRecord1836() {
		assertEquals("Strassell", customers.get(1835).getLastName());
	}

	@Test
	@DisplayName("Record 1836: Company is Datacomm Networks Incorporated")
	void CompanyOfRecord1836() {
		assertEquals("Datacomm Networks Incorporated", customers.get(1835).getCompany());
	}

	@Test
	@DisplayName("Record 1836: Address is 3805 Van Brunt Blvd")
	void AddressOfRecord1836() {
		assertEquals("3805 Van Brunt Blvd", customers.get(1835).getAddress());
	}

	@Test
	@DisplayName("Record 1836: City is Kansas City")
	void CityOfRecord1836() {
		assertEquals("Kansas City", customers.get(1835).getCity());
	}

	@Test
	@DisplayName("Record 1836: County is Jackson")
	void CountyOfRecord1836() {
		assertEquals("Jackson", customers.get(1835).getCounty());
	}

	@Test
	@DisplayName("Record 1836: State is MO")
	void StateOfRecord1836() {
		assertEquals("MO", customers.get(1835).getState());
	}

	@Test
	@DisplayName("Record 1836: ZIP is 64128")
	void ZIPOfRecord1836() {
		assertEquals("64128", customers.get(1835).getZIP());
	}

	@Test
	@DisplayName("Record 1836: Phone is 816-921-3608")
	void PhoneOfRecord1836() {
		assertEquals("816-921-3608", customers.get(1835).getPhone());
	}

	@Test
	@DisplayName("Record 1836: Fax is 816-921-5064")
	void FaxOfRecord1836() {
		assertEquals("816-921-5064", customers.get(1835).getFax());
	}

	@Test
	@DisplayName("Record 1836: Email is malissa@strassell.com")
	void EmailOfRecord1836() {
		assertEquals("malissa@strassell.com", customers.get(1835).getEmail());
	}

	@Test
	@DisplayName("Record 1836: Web is http://www.malissastrassell.com")
	void WebOfRecord1836() {
		assertEquals("http://www.malissastrassell.com", customers.get(1835).getWeb());
	}
}
