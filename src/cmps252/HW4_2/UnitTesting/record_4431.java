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

@Tag("14")
class Record_4431 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4431: FirstName is Josiah")
	void FirstNameOfRecord4431() {
		assertEquals("Josiah", customers.get(4430).getFirstName());
	}

	@Test
	@DisplayName("Record 4431: LastName is Shidemantle")
	void LastNameOfRecord4431() {
		assertEquals("Shidemantle", customers.get(4430).getLastName());
	}

	@Test
	@DisplayName("Record 4431: Company is United Shoe Machinery Corp")
	void CompanyOfRecord4431() {
		assertEquals("United Shoe Machinery Corp", customers.get(4430).getCompany());
	}

	@Test
	@DisplayName("Record 4431: Address is 2939 Cameron St")
	void AddressOfRecord4431() {
		assertEquals("2939 Cameron St", customers.get(4430).getAddress());
	}

	@Test
	@DisplayName("Record 4431: City is Lafayette")
	void CityOfRecord4431() {
		assertEquals("Lafayette", customers.get(4430).getCity());
	}

	@Test
	@DisplayName("Record 4431: County is Lafayette")
	void CountyOfRecord4431() {
		assertEquals("Lafayette", customers.get(4430).getCounty());
	}

	@Test
	@DisplayName("Record 4431: State is LA")
	void StateOfRecord4431() {
		assertEquals("LA", customers.get(4430).getState());
	}

	@Test
	@DisplayName("Record 4431: ZIP is 70506")
	void ZIPOfRecord4431() {
		assertEquals("70506", customers.get(4430).getZIP());
	}

	@Test
	@DisplayName("Record 4431: Phone is 337-233-3549")
	void PhoneOfRecord4431() {
		assertEquals("337-233-3549", customers.get(4430).getPhone());
	}

	@Test
	@DisplayName("Record 4431: Fax is 337-233-5554")
	void FaxOfRecord4431() {
		assertEquals("337-233-5554", customers.get(4430).getFax());
	}

	@Test
	@DisplayName("Record 4431: Email is josiah@shidemantle.com")
	void EmailOfRecord4431() {
		assertEquals("josiah@shidemantle.com", customers.get(4430).getEmail());
	}

	@Test
	@DisplayName("Record 4431: Web is http://www.josiahshidemantle.com")
	void WebOfRecord4431() {
		assertEquals("http://www.josiahshidemantle.com", customers.get(4430).getWeb());
	}
}
