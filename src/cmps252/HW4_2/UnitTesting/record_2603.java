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

@Tag("11")
class Record_2603 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2603: FirstName is Concetta")
	void FirstNameOfRecord2603() {
		assertEquals("Concetta", customers.get(2602).getFirstName());
	}

	@Test
	@DisplayName("Record 2603: LastName is Hertsberg")
	void LastNameOfRecord2603() {
		assertEquals("Hertsberg", customers.get(2602).getLastName());
	}

	@Test
	@DisplayName("Record 2603: Company is Bokhara Pet Care Centers")
	void CompanyOfRecord2603() {
		assertEquals("Bokhara Pet Care Centers", customers.get(2602).getCompany());
	}

	@Test
	@DisplayName("Record 2603: Address is 4695 S Windermere St")
	void AddressOfRecord2603() {
		assertEquals("4695 S Windermere St", customers.get(2602).getAddress());
	}

	@Test
	@DisplayName("Record 2603: City is Englewood")
	void CityOfRecord2603() {
		assertEquals("Englewood", customers.get(2602).getCity());
	}

	@Test
	@DisplayName("Record 2603: County is Arapahoe")
	void CountyOfRecord2603() {
		assertEquals("Arapahoe", customers.get(2602).getCounty());
	}

	@Test
	@DisplayName("Record 2603: State is CO")
	void StateOfRecord2603() {
		assertEquals("CO", customers.get(2602).getState());
	}

	@Test
	@DisplayName("Record 2603: ZIP is 80110")
	void ZIPOfRecord2603() {
		assertEquals("80110", customers.get(2602).getZIP());
	}

	@Test
	@DisplayName("Record 2603: Phone is 303-761-1558")
	void PhoneOfRecord2603() {
		assertEquals("303-761-1558", customers.get(2602).getPhone());
	}

	@Test
	@DisplayName("Record 2603: Fax is 303-761-3288")
	void FaxOfRecord2603() {
		assertEquals("303-761-3288", customers.get(2602).getFax());
	}

	@Test
	@DisplayName("Record 2603: Email is concetta@hertsberg.com")
	void EmailOfRecord2603() {
		assertEquals("concetta@hertsberg.com", customers.get(2602).getEmail());
	}

	@Test
	@DisplayName("Record 2603: Web is http://www.concettahertsberg.com")
	void WebOfRecord2603() {
		assertEquals("http://www.concettahertsberg.com", customers.get(2602).getWeb());
	}
}
