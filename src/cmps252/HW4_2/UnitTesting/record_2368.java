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

@Tag("34")
class Record_2368 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2368: FirstName is Luigi")
	void FirstNameOfRecord2368() {
		assertEquals("Luigi", customers.get(2367).getFirstName());
	}

	@Test
	@DisplayName("Record 2368: LastName is Schlesier")
	void LastNameOfRecord2368() {
		assertEquals("Schlesier", customers.get(2367).getLastName());
	}

	@Test
	@DisplayName("Record 2368: Company is Cliffs Carpet Outlet")
	void CompanyOfRecord2368() {
		assertEquals("Cliffs Carpet Outlet", customers.get(2367).getCompany());
	}

	@Test
	@DisplayName("Record 2368: Address is 801 Deming Way")
	void AddressOfRecord2368() {
		assertEquals("801 Deming Way", customers.get(2367).getAddress());
	}

	@Test
	@DisplayName("Record 2368: City is Madison")
	void CityOfRecord2368() {
		assertEquals("Madison", customers.get(2367).getCity());
	}

	@Test
	@DisplayName("Record 2368: County is Dane")
	void CountyOfRecord2368() {
		assertEquals("Dane", customers.get(2367).getCounty());
	}

	@Test
	@DisplayName("Record 2368: State is WI")
	void StateOfRecord2368() {
		assertEquals("WI", customers.get(2367).getState());
	}

	@Test
	@DisplayName("Record 2368: ZIP is 53717")
	void ZIPOfRecord2368() {
		assertEquals("53717", customers.get(2367).getZIP());
	}

	@Test
	@DisplayName("Record 2368: Phone is 608-831-6795")
	void PhoneOfRecord2368() {
		assertEquals("608-831-6795", customers.get(2367).getPhone());
	}

	@Test
	@DisplayName("Record 2368: Fax is 608-831-0039")
	void FaxOfRecord2368() {
		assertEquals("608-831-0039", customers.get(2367).getFax());
	}

	@Test
	@DisplayName("Record 2368: Email is luigi@schlesier.com")
	void EmailOfRecord2368() {
		assertEquals("luigi@schlesier.com", customers.get(2367).getEmail());
	}

	@Test
	@DisplayName("Record 2368: Web is http://www.luigischlesier.com")
	void WebOfRecord2368() {
		assertEquals("http://www.luigischlesier.com", customers.get(2367).getWeb());
	}
}
