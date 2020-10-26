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

@Tag("44")
class Record_4952 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4952: FirstName is Landon")
	void FirstNameOfRecord4952() {
		assertEquals("Landon", customers.get(4951).getFirstName());
	}

	@Test
	@DisplayName("Record 4952: LastName is Bosch")
	void LastNameOfRecord4952() {
		assertEquals("Bosch", customers.get(4951).getLastName());
	}

	@Test
	@DisplayName("Record 4952: Company is Walker Forge Inc")
	void CompanyOfRecord4952() {
		assertEquals("Walker Forge Inc", customers.get(4951).getCompany());
	}

	@Test
	@DisplayName("Record 4952: Address is 2155 S Bascom Ave")
	void AddressOfRecord4952() {
		assertEquals("2155 S Bascom Ave", customers.get(4951).getAddress());
	}

	@Test
	@DisplayName("Record 4952: City is Campbell")
	void CityOfRecord4952() {
		assertEquals("Campbell", customers.get(4951).getCity());
	}

	@Test
	@DisplayName("Record 4952: County is Santa Clara")
	void CountyOfRecord4952() {
		assertEquals("Santa Clara", customers.get(4951).getCounty());
	}

	@Test
	@DisplayName("Record 4952: State is CA")
	void StateOfRecord4952() {
		assertEquals("CA", customers.get(4951).getState());
	}

	@Test
	@DisplayName("Record 4952: ZIP is 95008")
	void ZIPOfRecord4952() {
		assertEquals("95008", customers.get(4951).getZIP());
	}

	@Test
	@DisplayName("Record 4952: Phone is 408-377-2453")
	void PhoneOfRecord4952() {
		assertEquals("408-377-2453", customers.get(4951).getPhone());
	}

	@Test
	@DisplayName("Record 4952: Fax is 408-377-6572")
	void FaxOfRecord4952() {
		assertEquals("408-377-6572", customers.get(4951).getFax());
	}

	@Test
	@DisplayName("Record 4952: Email is landon@bosch.com")
	void EmailOfRecord4952() {
		assertEquals("landon@bosch.com", customers.get(4951).getEmail());
	}

	@Test
	@DisplayName("Record 4952: Web is http://www.landonbosch.com")
	void WebOfRecord4952() {
		assertEquals("http://www.landonbosch.com", customers.get(4951).getWeb());
	}
}
