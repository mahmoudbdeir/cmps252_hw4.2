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

@Tag("5")
class Record_4343 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4343: FirstName is Mitch")
	void FirstNameOfRecord4343() {
		assertEquals("Mitch", customers.get(4342).getFirstName());
	}

	@Test
	@DisplayName("Record 4343: LastName is Elie")
	void LastNameOfRecord4343() {
		assertEquals("Elie", customers.get(4342).getLastName());
	}

	@Test
	@DisplayName("Record 4343: Company is Payroll Pros Inc")
	void CompanyOfRecord4343() {
		assertEquals("Payroll Pros Inc", customers.get(4342).getCompany());
	}

	@Test
	@DisplayName("Record 4343: Address is 801 N Magnolia Ave")
	void AddressOfRecord4343() {
		assertEquals("801 N Magnolia Ave", customers.get(4342).getAddress());
	}

	@Test
	@DisplayName("Record 4343: City is Orlando")
	void CityOfRecord4343() {
		assertEquals("Orlando", customers.get(4342).getCity());
	}

	@Test
	@DisplayName("Record 4343: County is Orange")
	void CountyOfRecord4343() {
		assertEquals("Orange", customers.get(4342).getCounty());
	}

	@Test
	@DisplayName("Record 4343: State is FL")
	void StateOfRecord4343() {
		assertEquals("FL", customers.get(4342).getState());
	}

	@Test
	@DisplayName("Record 4343: ZIP is 32803")
	void ZIPOfRecord4343() {
		assertEquals("32803", customers.get(4342).getZIP());
	}

	@Test
	@DisplayName("Record 4343: Phone is 407-841-7475")
	void PhoneOfRecord4343() {
		assertEquals("407-841-7475", customers.get(4342).getPhone());
	}

	@Test
	@DisplayName("Record 4343: Fax is 407-841-8346")
	void FaxOfRecord4343() {
		assertEquals("407-841-8346", customers.get(4342).getFax());
	}

	@Test
	@DisplayName("Record 4343: Email is mitch@elie.com")
	void EmailOfRecord4343() {
		assertEquals("mitch@elie.com", customers.get(4342).getEmail());
	}

	@Test
	@DisplayName("Record 4343: Web is http://www.mitchelie.com")
	void WebOfRecord4343() {
		assertEquals("http://www.mitchelie.com", customers.get(4342).getWeb());
	}
}
