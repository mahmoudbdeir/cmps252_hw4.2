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

@Tag("19")
class Record_1326 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1326: FirstName is Ben")
	void FirstNameOfRecord1326() {
		assertEquals("Ben", customers.get(1325).getFirstName());
	}

	@Test
	@DisplayName("Record 1326: LastName is Ahlborn")
	void LastNameOfRecord1326() {
		assertEquals("Ahlborn", customers.get(1325).getLastName());
	}

	@Test
	@DisplayName("Record 1326: Company is Kim Imports Inc")
	void CompanyOfRecord1326() {
		assertEquals("Kim Imports Inc", customers.get(1325).getCompany());
	}

	@Test
	@DisplayName("Record 1326: Address is 3301 S Rider Trl")
	void AddressOfRecord1326() {
		assertEquals("3301 S Rider Trl", customers.get(1325).getAddress());
	}

	@Test
	@DisplayName("Record 1326: City is Earth City")
	void CityOfRecord1326() {
		assertEquals("Earth City", customers.get(1325).getCity());
	}

	@Test
	@DisplayName("Record 1326: County is Saint Louis")
	void CountyOfRecord1326() {
		assertEquals("Saint Louis", customers.get(1325).getCounty());
	}

	@Test
	@DisplayName("Record 1326: State is MO")
	void StateOfRecord1326() {
		assertEquals("MO", customers.get(1325).getState());
	}

	@Test
	@DisplayName("Record 1326: ZIP is 63045")
	void ZIPOfRecord1326() {
		assertEquals("63045", customers.get(1325).getZIP());
	}

	@Test
	@DisplayName("Record 1326: Phone is 314-344-4147")
	void PhoneOfRecord1326() {
		assertEquals("314-344-4147", customers.get(1325).getPhone());
	}

	@Test
	@DisplayName("Record 1326: Fax is 314-344-0621")
	void FaxOfRecord1326() {
		assertEquals("314-344-0621", customers.get(1325).getFax());
	}

	@Test
	@DisplayName("Record 1326: Email is ben@ahlborn.com")
	void EmailOfRecord1326() {
		assertEquals("ben@ahlborn.com", customers.get(1325).getEmail());
	}

	@Test
	@DisplayName("Record 1326: Web is http://www.benahlborn.com")
	void WebOfRecord1326() {
		assertEquals("http://www.benahlborn.com", customers.get(1325).getWeb());
	}
}
