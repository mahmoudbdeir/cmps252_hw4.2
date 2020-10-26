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

@Tag("48")
class Record_1131 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1131: FirstName is Gloria")
	void FirstNameOfRecord1131() {
		assertEquals("Gloria", customers.get(1130).getFirstName());
	}

	@Test
	@DisplayName("Record 1131: LastName is Matthees")
	void LastNameOfRecord1131() {
		assertEquals("Matthees", customers.get(1130).getLastName());
	}

	@Test
	@DisplayName("Record 1131: Company is American Coaster Co")
	void CompanyOfRecord1131() {
		assertEquals("American Coaster Co", customers.get(1130).getCompany());
	}

	@Test
	@DisplayName("Record 1131: Address is 409 W 10mile Rd")
	void AddressOfRecord1131() {
		assertEquals("409 W 10mile Rd", customers.get(1130).getAddress());
	}

	@Test
	@DisplayName("Record 1131: City is Hazel Park")
	void CityOfRecord1131() {
		assertEquals("Hazel Park", customers.get(1130).getCity());
	}

	@Test
	@DisplayName("Record 1131: County is Oakland")
	void CountyOfRecord1131() {
		assertEquals("Oakland", customers.get(1130).getCounty());
	}

	@Test
	@DisplayName("Record 1131: State is MI")
	void StateOfRecord1131() {
		assertEquals("MI", customers.get(1130).getState());
	}

	@Test
	@DisplayName("Record 1131: ZIP is 48030")
	void ZIPOfRecord1131() {
		assertEquals("48030", customers.get(1130).getZIP());
	}

	@Test
	@DisplayName("Record 1131: Phone is 248-542-8557")
	void PhoneOfRecord1131() {
		assertEquals("248-542-8557", customers.get(1130).getPhone());
	}

	@Test
	@DisplayName("Record 1131: Fax is 248-542-6701")
	void FaxOfRecord1131() {
		assertEquals("248-542-6701", customers.get(1130).getFax());
	}

	@Test
	@DisplayName("Record 1131: Email is gloria@matthees.com")
	void EmailOfRecord1131() {
		assertEquals("gloria@matthees.com", customers.get(1130).getEmail());
	}

	@Test
	@DisplayName("Record 1131: Web is http://www.gloriamatthees.com")
	void WebOfRecord1131() {
		assertEquals("http://www.gloriamatthees.com", customers.get(1130).getWeb());
	}
}
