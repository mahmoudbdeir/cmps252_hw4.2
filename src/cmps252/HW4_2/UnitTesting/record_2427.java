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

@Tag("17")
class Record_2427 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2427: FirstName is Denny")
	void FirstNameOfRecord2427() {
		assertEquals("Denny", customers.get(2426).getFirstName());
	}

	@Test
	@DisplayName("Record 2427: LastName is Hoskins")
	void LastNameOfRecord2427() {
		assertEquals("Hoskins", customers.get(2426).getLastName());
	}

	@Test
	@DisplayName("Record 2427: Company is Aer Manufacturing Inc")
	void CompanyOfRecord2427() {
		assertEquals("Aer Manufacturing Inc", customers.get(2426).getCompany());
	}

	@Test
	@DisplayName("Record 2427: Address is 1633 N Us 1")
	void AddressOfRecord2427() {
		assertEquals("1633 N Us 1", customers.get(2426).getAddress());
	}

	@Test
	@DisplayName("Record 2427: City is Cocoa")
	void CityOfRecord2427() {
		assertEquals("Cocoa", customers.get(2426).getCity());
	}

	@Test
	@DisplayName("Record 2427: County is Brevard")
	void CountyOfRecord2427() {
		assertEquals("Brevard", customers.get(2426).getCounty());
	}

	@Test
	@DisplayName("Record 2427: State is FL")
	void StateOfRecord2427() {
		assertEquals("FL", customers.get(2426).getState());
	}

	@Test
	@DisplayName("Record 2427: ZIP is 32922")
	void ZIPOfRecord2427() {
		assertEquals("32922", customers.get(2426).getZIP());
	}

	@Test
	@DisplayName("Record 2427: Phone is 321-639-0320")
	void PhoneOfRecord2427() {
		assertEquals("321-639-0320", customers.get(2426).getPhone());
	}

	@Test
	@DisplayName("Record 2427: Fax is 321-639-2938")
	void FaxOfRecord2427() {
		assertEquals("321-639-2938", customers.get(2426).getFax());
	}

	@Test
	@DisplayName("Record 2427: Email is denny@hoskins.com")
	void EmailOfRecord2427() {
		assertEquals("denny@hoskins.com", customers.get(2426).getEmail());
	}

	@Test
	@DisplayName("Record 2427: Web is http://www.dennyhoskins.com")
	void WebOfRecord2427() {
		assertEquals("http://www.dennyhoskins.com", customers.get(2426).getWeb());
	}
}
