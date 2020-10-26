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

@Tag("1")
class Record_4850 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4850: FirstName is Elliot")
	void FirstNameOfRecord4850() {
		assertEquals("Elliot", customers.get(4849).getFirstName());
	}

	@Test
	@DisplayName("Record 4850: LastName is Main")
	void LastNameOfRecord4850() {
		assertEquals("Main", customers.get(4849).getLastName());
	}

	@Test
	@DisplayName("Record 4850: Company is Parrot Restaurant & Bar")
	void CompanyOfRecord4850() {
		assertEquals("Parrot Restaurant & Bar", customers.get(4849).getCompany());
	}

	@Test
	@DisplayName("Record 4850: Address is 471 E 124th Ave")
	void AddressOfRecord4850() {
		assertEquals("471 E 124th Ave", customers.get(4849).getAddress());
	}

	@Test
	@DisplayName("Record 4850: City is Denver")
	void CityOfRecord4850() {
		assertEquals("Denver", customers.get(4849).getCity());
	}

	@Test
	@DisplayName("Record 4850: County is Adams")
	void CountyOfRecord4850() {
		assertEquals("Adams", customers.get(4849).getCounty());
	}

	@Test
	@DisplayName("Record 4850: State is CO")
	void StateOfRecord4850() {
		assertEquals("CO", customers.get(4849).getState());
	}

	@Test
	@DisplayName("Record 4850: ZIP is 80241")
	void ZIPOfRecord4850() {
		assertEquals("80241", customers.get(4849).getZIP());
	}

	@Test
	@DisplayName("Record 4850: Phone is 303-451-1386")
	void PhoneOfRecord4850() {
		assertEquals("303-451-1386", customers.get(4849).getPhone());
	}

	@Test
	@DisplayName("Record 4850: Fax is 303-451-9365")
	void FaxOfRecord4850() {
		assertEquals("303-451-9365", customers.get(4849).getFax());
	}

	@Test
	@DisplayName("Record 4850: Email is elliot@main.com")
	void EmailOfRecord4850() {
		assertEquals("elliot@main.com", customers.get(4849).getEmail());
	}

	@Test
	@DisplayName("Record 4850: Web is http://www.elliotmain.com")
	void WebOfRecord4850() {
		assertEquals("http://www.elliotmain.com", customers.get(4849).getWeb());
	}
}
