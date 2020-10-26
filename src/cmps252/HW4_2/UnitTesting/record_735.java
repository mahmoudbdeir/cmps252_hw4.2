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

@Tag("29")
class Record_735 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 735: FirstName is Erik")
	void FirstNameOfRecord735() {
		assertEquals("Erik", customers.get(734).getFirstName());
	}

	@Test
	@DisplayName("Record 735: LastName is Prins")
	void LastNameOfRecord735() {
		assertEquals("Prins", customers.get(734).getLastName());
	}

	@Test
	@DisplayName("Record 735: Company is Ann, Bass Dee Cpa")
	void CompanyOfRecord735() {
		assertEquals("Ann, Bass Dee Cpa", customers.get(734).getCompany());
	}

	@Test
	@DisplayName("Record 735: Address is 1647 N Cocoa Blvd")
	void AddressOfRecord735() {
		assertEquals("1647 N Cocoa Blvd", customers.get(734).getAddress());
	}

	@Test
	@DisplayName("Record 735: City is Cocoa")
	void CityOfRecord735() {
		assertEquals("Cocoa", customers.get(734).getCity());
	}

	@Test
	@DisplayName("Record 735: County is Brevard")
	void CountyOfRecord735() {
		assertEquals("Brevard", customers.get(734).getCounty());
	}

	@Test
	@DisplayName("Record 735: State is FL")
	void StateOfRecord735() {
		assertEquals("FL", customers.get(734).getState());
	}

	@Test
	@DisplayName("Record 735: ZIP is 32922")
	void ZIPOfRecord735() {
		assertEquals("32922", customers.get(734).getZIP());
	}

	@Test
	@DisplayName("Record 735: Phone is 321-636-0955")
	void PhoneOfRecord735() {
		assertEquals("321-636-0955", customers.get(734).getPhone());
	}

	@Test
	@DisplayName("Record 735: Fax is 321-636-2323")
	void FaxOfRecord735() {
		assertEquals("321-636-2323", customers.get(734).getFax());
	}

	@Test
	@DisplayName("Record 735: Email is erik@prins.com")
	void EmailOfRecord735() {
		assertEquals("erik@prins.com", customers.get(734).getEmail());
	}

	@Test
	@DisplayName("Record 735: Web is http://www.erikprins.com")
	void WebOfRecord735() {
		assertEquals("http://www.erikprins.com", customers.get(734).getWeb());
	}
}
