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

@Tag("25")
class Record_4913 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4913: FirstName is Jackie")
	void FirstNameOfRecord4913() {
		assertEquals("Jackie", customers.get(4912).getFirstName());
	}

	@Test
	@DisplayName("Record 4913: LastName is Masterton")
	void LastNameOfRecord4913() {
		assertEquals("Masterton", customers.get(4912).getLastName());
	}

	@Test
	@DisplayName("Record 4913: Company is Ikes Auto Parts Inc")
	void CompanyOfRecord4913() {
		assertEquals("Ikes Auto Parts Inc", customers.get(4912).getCompany());
	}

	@Test
	@DisplayName("Record 4913: Address is 600 W 41st Ave  #-203")
	void AddressOfRecord4913() {
		assertEquals("600 W 41st Ave  #-203", customers.get(4912).getAddress());
	}

	@Test
	@DisplayName("Record 4913: City is Anchorage")
	void CityOfRecord4913() {
		assertEquals("Anchorage", customers.get(4912).getCity());
	}

	@Test
	@DisplayName("Record 4913: County is Anchorage")
	void CountyOfRecord4913() {
		assertEquals("Anchorage", customers.get(4912).getCounty());
	}

	@Test
	@DisplayName("Record 4913: State is AK")
	void StateOfRecord4913() {
		assertEquals("AK", customers.get(4912).getState());
	}

	@Test
	@DisplayName("Record 4913: ZIP is 99503")
	void ZIPOfRecord4913() {
		assertEquals("99503", customers.get(4912).getZIP());
	}

	@Test
	@DisplayName("Record 4913: Phone is 907-563-0753")
	void PhoneOfRecord4913() {
		assertEquals("907-563-0753", customers.get(4912).getPhone());
	}

	@Test
	@DisplayName("Record 4913: Fax is 907-563-4143")
	void FaxOfRecord4913() {
		assertEquals("907-563-4143", customers.get(4912).getFax());
	}

	@Test
	@DisplayName("Record 4913: Email is jackie@masterton.com")
	void EmailOfRecord4913() {
		assertEquals("jackie@masterton.com", customers.get(4912).getEmail());
	}

	@Test
	@DisplayName("Record 4913: Web is http://www.jackiemasterton.com")
	void WebOfRecord4913() {
		assertEquals("http://www.jackiemasterton.com", customers.get(4912).getWeb());
	}
}
