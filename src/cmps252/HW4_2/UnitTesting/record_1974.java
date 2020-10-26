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
class Record_1974 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1974: FirstName is Autumn")
	void FirstNameOfRecord1974() {
		assertEquals("Autumn", customers.get(1973).getFirstName());
	}

	@Test
	@DisplayName("Record 1974: LastName is Minges")
	void LastNameOfRecord1974() {
		assertEquals("Minges", customers.get(1973).getLastName());
	}

	@Test
	@DisplayName("Record 1974: Company is Home Tech Publications")
	void CompanyOfRecord1974() {
		assertEquals("Home Tech Publications", customers.get(1973).getCompany());
	}

	@Test
	@DisplayName("Record 1974: Address is 8014 State Line Rd")
	void AddressOfRecord1974() {
		assertEquals("8014 State Line Rd", customers.get(1973).getAddress());
	}

	@Test
	@DisplayName("Record 1974: City is Prairie Village")
	void CityOfRecord1974() {
		assertEquals("Prairie Village", customers.get(1973).getCity());
	}

	@Test
	@DisplayName("Record 1974: County is Johnson")
	void CountyOfRecord1974() {
		assertEquals("Johnson", customers.get(1973).getCounty());
	}

	@Test
	@DisplayName("Record 1974: State is KS")
	void StateOfRecord1974() {
		assertEquals("KS", customers.get(1973).getState());
	}

	@Test
	@DisplayName("Record 1974: ZIP is 66208")
	void ZIPOfRecord1974() {
		assertEquals("66208", customers.get(1973).getZIP());
	}

	@Test
	@DisplayName("Record 1974: Phone is 913-341-5445")
	void PhoneOfRecord1974() {
		assertEquals("913-341-5445", customers.get(1973).getPhone());
	}

	@Test
	@DisplayName("Record 1974: Fax is 913-341-5071")
	void FaxOfRecord1974() {
		assertEquals("913-341-5071", customers.get(1973).getFax());
	}

	@Test
	@DisplayName("Record 1974: Email is autumn@minges.com")
	void EmailOfRecord1974() {
		assertEquals("autumn@minges.com", customers.get(1973).getEmail());
	}

	@Test
	@DisplayName("Record 1974: Web is http://www.autumnminges.com")
	void WebOfRecord1974() {
		assertEquals("http://www.autumnminges.com", customers.get(1973).getWeb());
	}
}
