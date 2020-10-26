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

@Tag("16")
class Record_160 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 160: FirstName is Quinn")
	void FirstNameOfRecord160() {
		assertEquals("Quinn", customers.get(159).getFirstName());
	}

	@Test
	@DisplayName("Record 160: LastName is Fridman")
	void LastNameOfRecord160() {
		assertEquals("Fridman", customers.get(159).getLastName());
	}

	@Test
	@DisplayName("Record 160: Company is Dial X Instruments Inc")
	void CompanyOfRecord160() {
		assertEquals("Dial X Instruments Inc", customers.get(159).getCompany());
	}

	@Test
	@DisplayName("Record 160: Address is Concord Rd & I 95")
	void AddressOfRecord160() {
		assertEquals("Concord Rd & I 95", customers.get(159).getAddress());
	}

	@Test
	@DisplayName("Record 160: City is Aston")
	void CityOfRecord160() {
		assertEquals("Aston", customers.get(159).getCity());
	}

	@Test
	@DisplayName("Record 160: County is Delaware")
	void CountyOfRecord160() {
		assertEquals("Delaware", customers.get(159).getCounty());
	}

	@Test
	@DisplayName("Record 160: State is PA")
	void StateOfRecord160() {
		assertEquals("PA", customers.get(159).getState());
	}

	@Test
	@DisplayName("Record 160: ZIP is 19014")
	void ZIPOfRecord160() {
		assertEquals("19014", customers.get(159).getZIP());
	}

	@Test
	@DisplayName("Record 160: Phone is 610-494-3288")
	void PhoneOfRecord160() {
		assertEquals("610-494-3288", customers.get(159).getPhone());
	}

	@Test
	@DisplayName("Record 160: Fax is 610-494-9223")
	void FaxOfRecord160() {
		assertEquals("610-494-9223", customers.get(159).getFax());
	}

	@Test
	@DisplayName("Record 160: Email is quinn@fridman.com")
	void EmailOfRecord160() {
		assertEquals("quinn@fridman.com", customers.get(159).getEmail());
	}

	@Test
	@DisplayName("Record 160: Web is http://www.quinnfridman.com")
	void WebOfRecord160() {
		assertEquals("http://www.quinnfridman.com", customers.get(159).getWeb());
	}
}
