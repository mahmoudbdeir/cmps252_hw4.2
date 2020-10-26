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
class Record_2718 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2718: FirstName is Lenora")
	void FirstNameOfRecord2718() {
		assertEquals("Lenora", customers.get(2717).getFirstName());
	}

	@Test
	@DisplayName("Record 2718: LastName is Nippe")
	void LastNameOfRecord2718() {
		assertEquals("Nippe", customers.get(2717).getLastName());
	}

	@Test
	@DisplayName("Record 2718: Company is Jimmerson, Phillip L")
	void CompanyOfRecord2718() {
		assertEquals("Jimmerson, Phillip L", customers.get(2717).getCompany());
	}

	@Test
	@DisplayName("Record 2718: Address is 2152 Plainfield Ave Ne")
	void AddressOfRecord2718() {
		assertEquals("2152 Plainfield Ave Ne", customers.get(2717).getAddress());
	}

	@Test
	@DisplayName("Record 2718: City is Grand Rapids")
	void CityOfRecord2718() {
		assertEquals("Grand Rapids", customers.get(2717).getCity());
	}

	@Test
	@DisplayName("Record 2718: County is Kent")
	void CountyOfRecord2718() {
		assertEquals("Kent", customers.get(2717).getCounty());
	}

	@Test
	@DisplayName("Record 2718: State is MI")
	void StateOfRecord2718() {
		assertEquals("MI", customers.get(2717).getState());
	}

	@Test
	@DisplayName("Record 2718: ZIP is 49505")
	void ZIPOfRecord2718() {
		assertEquals("49505", customers.get(2717).getZIP());
	}

	@Test
	@DisplayName("Record 2718: Phone is 616-364-5935")
	void PhoneOfRecord2718() {
		assertEquals("616-364-5935", customers.get(2717).getPhone());
	}

	@Test
	@DisplayName("Record 2718: Fax is 616-364-5254")
	void FaxOfRecord2718() {
		assertEquals("616-364-5254", customers.get(2717).getFax());
	}

	@Test
	@DisplayName("Record 2718: Email is lenora@nippe.com")
	void EmailOfRecord2718() {
		assertEquals("lenora@nippe.com", customers.get(2717).getEmail());
	}

	@Test
	@DisplayName("Record 2718: Web is http://www.lenoranippe.com")
	void WebOfRecord2718() {
		assertEquals("http://www.lenoranippe.com", customers.get(2717).getWeb());
	}
}
