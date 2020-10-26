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

@Tag("19")
class Record_1169 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1169: FirstName is Isiah")
	void FirstNameOfRecord1169() {
		assertEquals("Isiah", customers.get(1168).getFirstName());
	}

	@Test
	@DisplayName("Record 1169: LastName is Ales")
	void LastNameOfRecord1169() {
		assertEquals("Ales", customers.get(1168).getLastName());
	}

	@Test
	@DisplayName("Record 1169: Company is Harry Page Inc")
	void CompanyOfRecord1169() {
		assertEquals("Harry Page Inc", customers.get(1168).getCompany());
	}

	@Test
	@DisplayName("Record 1169: Address is 68 S Jefferson Rd")
	void AddressOfRecord1169() {
		assertEquals("68 S Jefferson Rd", customers.get(1168).getAddress());
	}

	@Test
	@DisplayName("Record 1169: City is Whippany")
	void CityOfRecord1169() {
		assertEquals("Whippany", customers.get(1168).getCity());
	}

	@Test
	@DisplayName("Record 1169: County is Morris")
	void CountyOfRecord1169() {
		assertEquals("Morris", customers.get(1168).getCounty());
	}

	@Test
	@DisplayName("Record 1169: State is NJ")
	void StateOfRecord1169() {
		assertEquals("NJ", customers.get(1168).getState());
	}

	@Test
	@DisplayName("Record 1169: ZIP is 7981")
	void ZIPOfRecord1169() {
		assertEquals("7981", customers.get(1168).getZIP());
	}

	@Test
	@DisplayName("Record 1169: Phone is 973-386-4515")
	void PhoneOfRecord1169() {
		assertEquals("973-386-4515", customers.get(1168).getPhone());
	}

	@Test
	@DisplayName("Record 1169: Fax is 973-386-3572")
	void FaxOfRecord1169() {
		assertEquals("973-386-3572", customers.get(1168).getFax());
	}

	@Test
	@DisplayName("Record 1169: Email is isiah@ales.com")
	void EmailOfRecord1169() {
		assertEquals("isiah@ales.com", customers.get(1168).getEmail());
	}

	@Test
	@DisplayName("Record 1169: Web is http://www.isiahales.com")
	void WebOfRecord1169() {
		assertEquals("http://www.isiahales.com", customers.get(1168).getWeb());
	}
}
