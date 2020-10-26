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

@Tag("27")
class Record_1429 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1429: FirstName is Jewel")
	void FirstNameOfRecord1429() {
		assertEquals("Jewel", customers.get(1428).getFirstName());
	}

	@Test
	@DisplayName("Record 1429: LastName is Rhinerson")
	void LastNameOfRecord1429() {
		assertEquals("Rhinerson", customers.get(1428).getLastName());
	}

	@Test
	@DisplayName("Record 1429: Company is Integra Plastics")
	void CompanyOfRecord1429() {
		assertEquals("Integra Plastics", customers.get(1428).getCompany());
	}

	@Test
	@DisplayName("Record 1429: Address is 3975 S Eagleson Rd")
	void AddressOfRecord1429() {
		assertEquals("3975 S Eagleson Rd", customers.get(1428).getAddress());
	}

	@Test
	@DisplayName("Record 1429: City is Boise")
	void CityOfRecord1429() {
		assertEquals("Boise", customers.get(1428).getCity());
	}

	@Test
	@DisplayName("Record 1429: County is Ada")
	void CountyOfRecord1429() {
		assertEquals("Ada", customers.get(1428).getCounty());
	}

	@Test
	@DisplayName("Record 1429: State is ID")
	void StateOfRecord1429() {
		assertEquals("ID", customers.get(1428).getState());
	}

	@Test
	@DisplayName("Record 1429: ZIP is 83705")
	void ZIPOfRecord1429() {
		assertEquals("83705", customers.get(1428).getZIP());
	}

	@Test
	@DisplayName("Record 1429: Phone is 208-362-8346")
	void PhoneOfRecord1429() {
		assertEquals("208-362-8346", customers.get(1428).getPhone());
	}

	@Test
	@DisplayName("Record 1429: Fax is 208-362-6771")
	void FaxOfRecord1429() {
		assertEquals("208-362-6771", customers.get(1428).getFax());
	}

	@Test
	@DisplayName("Record 1429: Email is jewel@rhinerson.com")
	void EmailOfRecord1429() {
		assertEquals("jewel@rhinerson.com", customers.get(1428).getEmail());
	}

	@Test
	@DisplayName("Record 1429: Web is http://www.jewelrhinerson.com")
	void WebOfRecord1429() {
		assertEquals("http://www.jewelrhinerson.com", customers.get(1428).getWeb());
	}
}
