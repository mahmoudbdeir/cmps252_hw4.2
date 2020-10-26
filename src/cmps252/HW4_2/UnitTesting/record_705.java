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

@Tag("41")
class Record_705 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 705: FirstName is Cathy")
	void FirstNameOfRecord705() {
		assertEquals("Cathy", customers.get(704).getFirstName());
	}

	@Test
	@DisplayName("Record 705: LastName is Swackhammer")
	void LastNameOfRecord705() {
		assertEquals("Swackhammer", customers.get(704).getLastName());
	}

	@Test
	@DisplayName("Record 705: Company is Individual Development Ctr Inc")
	void CompanyOfRecord705() {
		assertEquals("Individual Development Ctr Inc", customers.get(704).getCompany());
	}

	@Test
	@DisplayName("Record 705: Address is 1705 E 9mile Rd")
	void AddressOfRecord705() {
		assertEquals("1705 E 9mile Rd", customers.get(704).getAddress());
	}

	@Test
	@DisplayName("Record 705: City is Ferndale")
	void CityOfRecord705() {
		assertEquals("Ferndale", customers.get(704).getCity());
	}

	@Test
	@DisplayName("Record 705: County is Oakland")
	void CountyOfRecord705() {
		assertEquals("Oakland", customers.get(704).getCounty());
	}

	@Test
	@DisplayName("Record 705: State is MI")
	void StateOfRecord705() {
		assertEquals("MI", customers.get(704).getState());
	}

	@Test
	@DisplayName("Record 705: ZIP is 48220")
	void ZIPOfRecord705() {
		assertEquals("48220", customers.get(704).getZIP());
	}

	@Test
	@DisplayName("Record 705: Phone is 248-545-2663")
	void PhoneOfRecord705() {
		assertEquals("248-545-2663", customers.get(704).getPhone());
	}

	@Test
	@DisplayName("Record 705: Fax is 248-545-2893")
	void FaxOfRecord705() {
		assertEquals("248-545-2893", customers.get(704).getFax());
	}

	@Test
	@DisplayName("Record 705: Email is cathy@swackhammer.com")
	void EmailOfRecord705() {
		assertEquals("cathy@swackhammer.com", customers.get(704).getEmail());
	}

	@Test
	@DisplayName("Record 705: Web is http://www.cathyswackhammer.com")
	void WebOfRecord705() {
		assertEquals("http://www.cathyswackhammer.com", customers.get(704).getWeb());
	}
}
