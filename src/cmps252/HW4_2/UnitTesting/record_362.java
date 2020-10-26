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

@Tag("35")
class Record_362 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 362: FirstName is Laverne")
	void FirstNameOfRecord362() {
		assertEquals("Laverne", customers.get(361).getFirstName());
	}

	@Test
	@DisplayName("Record 362: LastName is Yavorsky")
	void LastNameOfRecord362() {
		assertEquals("Yavorsky", customers.get(361).getLastName());
	}

	@Test
	@DisplayName("Record 362: Company is Hinshaw Music Inc")
	void CompanyOfRecord362() {
		assertEquals("Hinshaw Music Inc", customers.get(361).getCompany());
	}

	@Test
	@DisplayName("Record 362: Address is 6346 Orchard Lake Rd")
	void AddressOfRecord362() {
		assertEquals("6346 Orchard Lake Rd", customers.get(361).getAddress());
	}

	@Test
	@DisplayName("Record 362: City is West Bloomfield")
	void CityOfRecord362() {
		assertEquals("West Bloomfield", customers.get(361).getCity());
	}

	@Test
	@DisplayName("Record 362: County is Oakland")
	void CountyOfRecord362() {
		assertEquals("Oakland", customers.get(361).getCounty());
	}

	@Test
	@DisplayName("Record 362: State is MI")
	void StateOfRecord362() {
		assertEquals("MI", customers.get(361).getState());
	}

	@Test
	@DisplayName("Record 362: ZIP is 48322")
	void ZIPOfRecord362() {
		assertEquals("48322", customers.get(361).getZIP());
	}

	@Test
	@DisplayName("Record 362: Phone is 248-626-5589")
	void PhoneOfRecord362() {
		assertEquals("248-626-5589", customers.get(361).getPhone());
	}

	@Test
	@DisplayName("Record 362: Fax is 248-626-4312")
	void FaxOfRecord362() {
		assertEquals("248-626-4312", customers.get(361).getFax());
	}

	@Test
	@DisplayName("Record 362: Email is laverne@yavorsky.com")
	void EmailOfRecord362() {
		assertEquals("laverne@yavorsky.com", customers.get(361).getEmail());
	}

	@Test
	@DisplayName("Record 362: Web is http://www.laverneyavorsky.com")
	void WebOfRecord362() {
		assertEquals("http://www.laverneyavorsky.com", customers.get(361).getWeb());
	}
}
