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

@Tag("8")
class Record_1488 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1488: FirstName is Rose")
	void FirstNameOfRecord1488() {
		assertEquals("Rose", customers.get(1487).getFirstName());
	}

	@Test
	@DisplayName("Record 1488: LastName is Cal")
	void LastNameOfRecord1488() {
		assertEquals("Cal", customers.get(1487).getLastName());
	}

	@Test
	@DisplayName("Record 1488: Company is Allied Leasing Corp")
	void CompanyOfRecord1488() {
		assertEquals("Allied Leasing Corp", customers.get(1487).getCompany());
	}

	@Test
	@DisplayName("Record 1488: Address is 32 S Main St")
	void AddressOfRecord1488() {
		assertEquals("32 S Main St", customers.get(1487).getAddress());
	}

	@Test
	@DisplayName("Record 1488: City is Mullica Hill")
	void CityOfRecord1488() {
		assertEquals("Mullica Hill", customers.get(1487).getCity());
	}

	@Test
	@DisplayName("Record 1488: County is Gloucester")
	void CountyOfRecord1488() {
		assertEquals("Gloucester", customers.get(1487).getCounty());
	}

	@Test
	@DisplayName("Record 1488: State is NJ")
	void StateOfRecord1488() {
		assertEquals("NJ", customers.get(1487).getState());
	}

	@Test
	@DisplayName("Record 1488: ZIP is 8062")
	void ZIPOfRecord1488() {
		assertEquals("8062", customers.get(1487).getZIP());
	}

	@Test
	@DisplayName("Record 1488: Phone is 856-478-3692")
	void PhoneOfRecord1488() {
		assertEquals("856-478-3692", customers.get(1487).getPhone());
	}

	@Test
	@DisplayName("Record 1488: Fax is 856-478-5577")
	void FaxOfRecord1488() {
		assertEquals("856-478-5577", customers.get(1487).getFax());
	}

	@Test
	@DisplayName("Record 1488: Email is rose@cal.com")
	void EmailOfRecord1488() {
		assertEquals("rose@cal.com", customers.get(1487).getEmail());
	}

	@Test
	@DisplayName("Record 1488: Web is http://www.rosecal.com")
	void WebOfRecord1488() {
		assertEquals("http://www.rosecal.com", customers.get(1487).getWeb());
	}
}
