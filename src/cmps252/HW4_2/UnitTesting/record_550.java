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

@Tag("30")
class Record_550 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 550: FirstName is Lakysha")
	void FirstNameOfRecord550() {
		assertEquals("Lakysha", customers.get(549).getFirstName());
	}

	@Test
	@DisplayName("Record 550: LastName is Dubose")
	void LastNameOfRecord550() {
		assertEquals("Dubose", customers.get(549).getLastName());
	}

	@Test
	@DisplayName("Record 550: Company is Applegate & Vaulaskas")
	void CompanyOfRecord550() {
		assertEquals("Applegate & Vaulaskas", customers.get(549).getCompany());
	}

	@Test
	@DisplayName("Record 550: Address is 2838 Pleasant Vly")
	void AddressOfRecord550() {
		assertEquals("2838 Pleasant Vly", customers.get(549).getAddress());
	}

	@Test
	@DisplayName("Record 550: City is Brighton")
	void CityOfRecord550() {
		assertEquals("Brighton", customers.get(549).getCity());
	}

	@Test
	@DisplayName("Record 550: County is Livingston")
	void CountyOfRecord550() {
		assertEquals("Livingston", customers.get(549).getCounty());
	}

	@Test
	@DisplayName("Record 550: State is MI")
	void StateOfRecord550() {
		assertEquals("MI", customers.get(549).getState());
	}

	@Test
	@DisplayName("Record 550: ZIP is 48116")
	void ZIPOfRecord550() {
		assertEquals("48116", customers.get(549).getZIP());
	}

	@Test
	@DisplayName("Record 550: Phone is 810-229-9522")
	void PhoneOfRecord550() {
		assertEquals("810-229-9522", customers.get(549).getPhone());
	}

	@Test
	@DisplayName("Record 550: Fax is 810-229-0002")
	void FaxOfRecord550() {
		assertEquals("810-229-0002", customers.get(549).getFax());
	}

	@Test
	@DisplayName("Record 550: Email is lakysha@dubose.com")
	void EmailOfRecord550() {
		assertEquals("lakysha@dubose.com", customers.get(549).getEmail());
	}

	@Test
	@DisplayName("Record 550: Web is http://www.lakyshadubose.com")
	void WebOfRecord550() {
		assertEquals("http://www.lakyshadubose.com", customers.get(549).getWeb());
	}
}
