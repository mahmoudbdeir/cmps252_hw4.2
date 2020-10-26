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

@Tag("0")
class Record_125 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 125: FirstName is Ron")
	void FirstNameOfRecord125() {
		assertEquals("Ron", customers.get(124).getFirstName());
	}

	@Test
	@DisplayName("Record 125: LastName is Hollimon")
	void LastNameOfRecord125() {
		assertEquals("Hollimon", customers.get(124).getLastName());
	}

	@Test
	@DisplayName("Record 125: Company is Clearing House Inc")
	void CompanyOfRecord125() {
		assertEquals("Clearing House Inc", customers.get(124).getCompany());
	}

	@Test
	@DisplayName("Record 125: Address is 16 Longhurst Rd")
	void AddressOfRecord125() {
		assertEquals("16 Longhurst Rd", customers.get(124).getAddress());
	}

	@Test
	@DisplayName("Record 125: City is Marlton")
	void CityOfRecord125() {
		assertEquals("Marlton", customers.get(124).getCity());
	}

	@Test
	@DisplayName("Record 125: County is Burlington")
	void CountyOfRecord125() {
		assertEquals("Burlington", customers.get(124).getCounty());
	}

	@Test
	@DisplayName("Record 125: State is NJ")
	void StateOfRecord125() {
		assertEquals("NJ", customers.get(124).getState());
	}

	@Test
	@DisplayName("Record 125: ZIP is 8053")
	void ZIPOfRecord125() {
		assertEquals("8053", customers.get(124).getZIP());
	}

	@Test
	@DisplayName("Record 125: Phone is 856-547-2287")
	void PhoneOfRecord125() {
		assertEquals("856-547-2287", customers.get(124).getPhone());
	}

	@Test
	@DisplayName("Record 125: Fax is 856-547-9946")
	void FaxOfRecord125() {
		assertEquals("856-547-9946", customers.get(124).getFax());
	}

	@Test
	@DisplayName("Record 125: Email is ron@hollimon.com")
	void EmailOfRecord125() {
		assertEquals("ron@hollimon.com", customers.get(124).getEmail());
	}

	@Test
	@DisplayName("Record 125: Web is http://www.ronhollimon.com")
	void WebOfRecord125() {
		assertEquals("http://www.ronhollimon.com", customers.get(124).getWeb());
	}
}
