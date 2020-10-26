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

@Tag("20")
class Record_841 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 841: FirstName is Tommie")
	void FirstNameOfRecord841() {
		assertEquals("Tommie", customers.get(840).getFirstName());
	}

	@Test
	@DisplayName("Record 841: LastName is Booten")
	void LastNameOfRecord841() {
		assertEquals("Booten", customers.get(840).getLastName());
	}

	@Test
	@DisplayName("Record 841: Company is Bay City Scale Inc")
	void CompanyOfRecord841() {
		assertEquals("Bay City Scale Inc", customers.get(840).getCompany());
	}

	@Test
	@DisplayName("Record 841: Address is 20755 Greenfield Rd")
	void AddressOfRecord841() {
		assertEquals("20755 Greenfield Rd", customers.get(840).getAddress());
	}

	@Test
	@DisplayName("Record 841: City is Southfield")
	void CityOfRecord841() {
		assertEquals("Southfield", customers.get(840).getCity());
	}

	@Test
	@DisplayName("Record 841: County is Oakland")
	void CountyOfRecord841() {
		assertEquals("Oakland", customers.get(840).getCounty());
	}

	@Test
	@DisplayName("Record 841: State is MI")
	void StateOfRecord841() {
		assertEquals("MI", customers.get(840).getState());
	}

	@Test
	@DisplayName("Record 841: ZIP is 48075")
	void ZIPOfRecord841() {
		assertEquals("48075", customers.get(840).getZIP());
	}

	@Test
	@DisplayName("Record 841: Phone is 248-559-4135")
	void PhoneOfRecord841() {
		assertEquals("248-559-4135", customers.get(840).getPhone());
	}

	@Test
	@DisplayName("Record 841: Fax is 248-559-4597")
	void FaxOfRecord841() {
		assertEquals("248-559-4597", customers.get(840).getFax());
	}

	@Test
	@DisplayName("Record 841: Email is tommie@booten.com")
	void EmailOfRecord841() {
		assertEquals("tommie@booten.com", customers.get(840).getEmail());
	}

	@Test
	@DisplayName("Record 841: Web is http://www.tommiebooten.com")
	void WebOfRecord841() {
		assertEquals("http://www.tommiebooten.com", customers.get(840).getWeb());
	}
}
