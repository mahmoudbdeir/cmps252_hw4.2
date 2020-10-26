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

@Tag("15")
class Record_4840 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4840: FirstName is Jed")
	void FirstNameOfRecord4840() {
		assertEquals("Jed", customers.get(4839).getFirstName());
	}

	@Test
	@DisplayName("Record 4840: LastName is Schlenz")
	void LastNameOfRecord4840() {
		assertEquals("Schlenz", customers.get(4839).getLastName());
	}

	@Test
	@DisplayName("Record 4840: Company is Higginbottom, Philip A Md")
	void CompanyOfRecord4840() {
		assertEquals("Higginbottom, Philip A Md", customers.get(4839).getCompany());
	}

	@Test
	@DisplayName("Record 4840: Address is 815 N Broadway Ave")
	void AddressOfRecord4840() {
		assertEquals("815 N Broadway Ave", customers.get(4839).getAddress());
	}

	@Test
	@DisplayName("Record 4840: City is Oklahoma City")
	void CityOfRecord4840() {
		assertEquals("Oklahoma City", customers.get(4839).getCity());
	}

	@Test
	@DisplayName("Record 4840: County is Oklahoma")
	void CountyOfRecord4840() {
		assertEquals("Oklahoma", customers.get(4839).getCounty());
	}

	@Test
	@DisplayName("Record 4840: State is OK")
	void StateOfRecord4840() {
		assertEquals("OK", customers.get(4839).getState());
	}

	@Test
	@DisplayName("Record 4840: ZIP is 73102")
	void ZIPOfRecord4840() {
		assertEquals("73102", customers.get(4839).getZIP());
	}

	@Test
	@DisplayName("Record 4840: Phone is 405-239-1176")
	void PhoneOfRecord4840() {
		assertEquals("405-239-1176", customers.get(4839).getPhone());
	}

	@Test
	@DisplayName("Record 4840: Fax is 405-239-6379")
	void FaxOfRecord4840() {
		assertEquals("405-239-6379", customers.get(4839).getFax());
	}

	@Test
	@DisplayName("Record 4840: Email is jed@schlenz.com")
	void EmailOfRecord4840() {
		assertEquals("jed@schlenz.com", customers.get(4839).getEmail());
	}

	@Test
	@DisplayName("Record 4840: Web is http://www.jedschlenz.com")
	void WebOfRecord4840() {
		assertEquals("http://www.jedschlenz.com", customers.get(4839).getWeb());
	}
}
