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

@Tag("18")
class Record_20 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 20: FirstName is Willard")
	void FirstNameOfRecord20() {
		assertEquals("Willard", customers.get(19).getFirstName());
	}

	@Test
	@DisplayName("Record 20: LastName is Keathley")
	void LastNameOfRecord20() {
		assertEquals("Keathley", customers.get(19).getLastName());
	}

	@Test
	@DisplayName("Record 20: Company is Savings Bank Of Finger Lks Fsb")
	void CompanyOfRecord20() {
		assertEquals("Savings Bank Of Finger Lks Fsb", customers.get(19).getCompany());
	}

	@Test
	@DisplayName("Record 20: Address is 801 T St")
	void AddressOfRecord20() {
		assertEquals("801 T St", customers.get(19).getAddress());
	}

	@Test
	@DisplayName("Record 20: City is Bedford")
	void CityOfRecord20() {
		assertEquals("Bedford", customers.get(19).getCity());
	}

	@Test
	@DisplayName("Record 20: County is Lawrence")
	void CountyOfRecord20() {
		assertEquals("Lawrence", customers.get(19).getCounty());
	}

	@Test
	@DisplayName("Record 20: State is IN")
	void StateOfRecord20() {
		assertEquals("IN", customers.get(19).getState());
	}

	@Test
	@DisplayName("Record 20: ZIP is 47421")
	void ZIPOfRecord20() {
		assertEquals("47421", customers.get(19).getZIP());
	}

	@Test
	@DisplayName("Record 20: Phone is 812-275-4393")
	void PhoneOfRecord20() {
		assertEquals("812-275-4393", customers.get(19).getPhone());
	}

	@Test
	@DisplayName("Record 20: Fax is 812-275-4832")
	void FaxOfRecord20() {
		assertEquals("812-275-4832", customers.get(19).getFax());
	}

	@Test
	@DisplayName("Record 20: Email is willard@keathley.com")
	void EmailOfRecord20() {
		assertEquals("willard@keathley.com", customers.get(19).getEmail());
	}

	@Test
	@DisplayName("Record 20: Web is http://www.willardkeathley.com")
	void WebOfRecord20() {
		assertEquals("http://www.willardkeathley.com", customers.get(19).getWeb());
	}
}
