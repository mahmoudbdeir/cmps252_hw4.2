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
class Record_2803 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2803: FirstName is Marshall")
	void FirstNameOfRecord2803() {
		assertEquals("Marshall", customers.get(2802).getFirstName());
	}

	@Test
	@DisplayName("Record 2803: LastName is Lutkus")
	void LastNameOfRecord2803() {
		assertEquals("Lutkus", customers.get(2802).getLastName());
	}

	@Test
	@DisplayName("Record 2803: Company is Brunswick Signs")
	void CompanyOfRecord2803() {
		assertEquals("Brunswick Signs", customers.get(2802).getCompany());
	}

	@Test
	@DisplayName("Record 2803: Address is 207 S Elliott Rd")
	void AddressOfRecord2803() {
		assertEquals("207 S Elliott Rd", customers.get(2802).getAddress());
	}

	@Test
	@DisplayName("Record 2803: City is Chapel Hill")
	void CityOfRecord2803() {
		assertEquals("Chapel Hill", customers.get(2802).getCity());
	}

	@Test
	@DisplayName("Record 2803: County is Orange")
	void CountyOfRecord2803() {
		assertEquals("Orange", customers.get(2802).getCounty());
	}

	@Test
	@DisplayName("Record 2803: State is NC")
	void StateOfRecord2803() {
		assertEquals("NC", customers.get(2802).getState());
	}

	@Test
	@DisplayName("Record 2803: ZIP is 27514")
	void ZIPOfRecord2803() {
		assertEquals("27514", customers.get(2802).getZIP());
	}

	@Test
	@DisplayName("Record 2803: Phone is 919-968-5255")
	void PhoneOfRecord2803() {
		assertEquals("919-968-5255", customers.get(2802).getPhone());
	}

	@Test
	@DisplayName("Record 2803: Fax is 919-968-4643")
	void FaxOfRecord2803() {
		assertEquals("919-968-4643", customers.get(2802).getFax());
	}

	@Test
	@DisplayName("Record 2803: Email is marshall@lutkus.com")
	void EmailOfRecord2803() {
		assertEquals("marshall@lutkus.com", customers.get(2802).getEmail());
	}

	@Test
	@DisplayName("Record 2803: Web is http://www.marshalllutkus.com")
	void WebOfRecord2803() {
		assertEquals("http://www.marshalllutkus.com", customers.get(2802).getWeb());
	}
}
