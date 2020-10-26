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

@Tag("23")
class Record_2237 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2237: FirstName is Marybeth")
	void FirstNameOfRecord2237() {
		assertEquals("Marybeth", customers.get(2236).getFirstName());
	}

	@Test
	@DisplayName("Record 2237: LastName is Digmann")
	void LastNameOfRecord2237() {
		assertEquals("Digmann", customers.get(2236).getLastName());
	}

	@Test
	@DisplayName("Record 2237: Company is Hansard, Matthew B Cpa")
	void CompanyOfRecord2237() {
		assertEquals("Hansard, Matthew B Cpa", customers.get(2236).getCompany());
	}

	@Test
	@DisplayName("Record 2237: Address is 3130 Belmont Ave")
	void AddressOfRecord2237() {
		assertEquals("3130 Belmont Ave", customers.get(2236).getAddress());
	}

	@Test
	@DisplayName("Record 2237: City is Youngstown")
	void CityOfRecord2237() {
		assertEquals("Youngstown", customers.get(2236).getCity());
	}

	@Test
	@DisplayName("Record 2237: County is Mahoning")
	void CountyOfRecord2237() {
		assertEquals("Mahoning", customers.get(2236).getCounty());
	}

	@Test
	@DisplayName("Record 2237: State is OH")
	void StateOfRecord2237() {
		assertEquals("OH", customers.get(2236).getState());
	}

	@Test
	@DisplayName("Record 2237: ZIP is 44505")
	void ZIPOfRecord2237() {
		assertEquals("44505", customers.get(2236).getZIP());
	}

	@Test
	@DisplayName("Record 2237: Phone is 330-759-4201")
	void PhoneOfRecord2237() {
		assertEquals("330-759-4201", customers.get(2236).getPhone());
	}

	@Test
	@DisplayName("Record 2237: Fax is 330-759-1321")
	void FaxOfRecord2237() {
		assertEquals("330-759-1321", customers.get(2236).getFax());
	}

	@Test
	@DisplayName("Record 2237: Email is marybeth@digmann.com")
	void EmailOfRecord2237() {
		assertEquals("marybeth@digmann.com", customers.get(2236).getEmail());
	}

	@Test
	@DisplayName("Record 2237: Web is http://www.marybethdigmann.com")
	void WebOfRecord2237() {
		assertEquals("http://www.marybethdigmann.com", customers.get(2236).getWeb());
	}
}
