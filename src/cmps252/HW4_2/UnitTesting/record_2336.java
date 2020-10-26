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

@Tag("45")
class Record_2336 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2336: FirstName is Mark")
	void FirstNameOfRecord2336() {
		assertEquals("Mark", customers.get(2335).getFirstName());
	}

	@Test
	@DisplayName("Record 2336: LastName is Caouette")
	void LastNameOfRecord2336() {
		assertEquals("Caouette", customers.get(2335).getLastName());
	}

	@Test
	@DisplayName("Record 2336: Company is Sparkle Janitorial Supply Co")
	void CompanyOfRecord2336() {
		assertEquals("Sparkle Janitorial Supply Co", customers.get(2335).getCompany());
	}

	@Test
	@DisplayName("Record 2336: Address is 772 South St")
	void AddressOfRecord2336() {
		assertEquals("772 South St", customers.get(2335).getAddress());
	}

	@Test
	@DisplayName("Record 2336: City is Newburgh")
	void CityOfRecord2336() {
		assertEquals("Newburgh", customers.get(2335).getCity());
	}

	@Test
	@DisplayName("Record 2336: County is Orange")
	void CountyOfRecord2336() {
		assertEquals("Orange", customers.get(2335).getCounty());
	}

	@Test
	@DisplayName("Record 2336: State is NY")
	void StateOfRecord2336() {
		assertEquals("NY", customers.get(2335).getState());
	}

	@Test
	@DisplayName("Record 2336: ZIP is 12550")
	void ZIPOfRecord2336() {
		assertEquals("12550", customers.get(2335).getZIP());
	}

	@Test
	@DisplayName("Record 2336: Phone is 845-562-8182")
	void PhoneOfRecord2336() {
		assertEquals("845-562-8182", customers.get(2335).getPhone());
	}

	@Test
	@DisplayName("Record 2336: Fax is 845-562-2543")
	void FaxOfRecord2336() {
		assertEquals("845-562-2543", customers.get(2335).getFax());
	}

	@Test
	@DisplayName("Record 2336: Email is mark@caouette.com")
	void EmailOfRecord2336() {
		assertEquals("mark@caouette.com", customers.get(2335).getEmail());
	}

	@Test
	@DisplayName("Record 2336: Web is http://www.markcaouette.com")
	void WebOfRecord2336() {
		assertEquals("http://www.markcaouette.com", customers.get(2335).getWeb());
	}
}
