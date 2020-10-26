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
class Record_1510 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1510: FirstName is Darius")
	void FirstNameOfRecord1510() {
		assertEquals("Darius", customers.get(1509).getFirstName());
	}

	@Test
	@DisplayName("Record 1510: LastName is Amey")
	void LastNameOfRecord1510() {
		assertEquals("Amey", customers.get(1509).getLastName());
	}

	@Test
	@DisplayName("Record 1510: Company is Trenton Public Library")
	void CompanyOfRecord1510() {
		assertEquals("Trenton Public Library", customers.get(1509).getCompany());
	}

	@Test
	@DisplayName("Record 1510: Address is 39 15th St")
	void AddressOfRecord1510() {
		assertEquals("39 15th St", customers.get(1509).getAddress());
	}

	@Test
	@DisplayName("Record 1510: City is Wheeling")
	void CityOfRecord1510() {
		assertEquals("Wheeling", customers.get(1509).getCity());
	}

	@Test
	@DisplayName("Record 1510: County is Ohio")
	void CountyOfRecord1510() {
		assertEquals("Ohio", customers.get(1509).getCounty());
	}

	@Test
	@DisplayName("Record 1510: State is WV")
	void StateOfRecord1510() {
		assertEquals("WV", customers.get(1509).getState());
	}

	@Test
	@DisplayName("Record 1510: ZIP is 26003")
	void ZIPOfRecord1510() {
		assertEquals("26003", customers.get(1509).getZIP());
	}

	@Test
	@DisplayName("Record 1510: Phone is 304-232-9869")
	void PhoneOfRecord1510() {
		assertEquals("304-232-9869", customers.get(1509).getPhone());
	}

	@Test
	@DisplayName("Record 1510: Fax is 304-232-8981")
	void FaxOfRecord1510() {
		assertEquals("304-232-8981", customers.get(1509).getFax());
	}

	@Test
	@DisplayName("Record 1510: Email is darius@amey.com")
	void EmailOfRecord1510() {
		assertEquals("darius@amey.com", customers.get(1509).getEmail());
	}

	@Test
	@DisplayName("Record 1510: Web is http://www.dariusamey.com")
	void WebOfRecord1510() {
		assertEquals("http://www.dariusamey.com", customers.get(1509).getWeb());
	}
}
