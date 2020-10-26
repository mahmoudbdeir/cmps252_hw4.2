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

@Tag("14")
class Record_466 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 466: FirstName is Ines")
	void FirstNameOfRecord466() {
		assertEquals("Ines", customers.get(465).getFirstName());
	}

	@Test
	@DisplayName("Record 466: LastName is Gritsch")
	void LastNameOfRecord466() {
		assertEquals("Gritsch", customers.get(465).getLastName());
	}

	@Test
	@DisplayName("Record 466: Company is Houck Service Co")
	void CompanyOfRecord466() {
		assertEquals("Houck Service Co", customers.get(465).getCompany());
	}

	@Test
	@DisplayName("Record 466: Address is 625 William St")
	void AddressOfRecord466() {
		assertEquals("625 William St", customers.get(465).getAddress());
	}

	@Test
	@DisplayName("Record 466: City is Bridgeport")
	void CityOfRecord466() {
		assertEquals("Bridgeport", customers.get(465).getCity());
	}

	@Test
	@DisplayName("Record 466: County is Fairfield")
	void CountyOfRecord466() {
		assertEquals("Fairfield", customers.get(465).getCounty());
	}

	@Test
	@DisplayName("Record 466: State is CT")
	void StateOfRecord466() {
		assertEquals("CT", customers.get(465).getState());
	}

	@Test
	@DisplayName("Record 466: ZIP is 6608")
	void ZIPOfRecord466() {
		assertEquals("6608", customers.get(465).getZIP());
	}

	@Test
	@DisplayName("Record 466: Phone is 203-333-7108")
	void PhoneOfRecord466() {
		assertEquals("203-333-7108", customers.get(465).getPhone());
	}

	@Test
	@DisplayName("Record 466: Fax is 203-333-6217")
	void FaxOfRecord466() {
		assertEquals("203-333-6217", customers.get(465).getFax());
	}

	@Test
	@DisplayName("Record 466: Email is ines@gritsch.com")
	void EmailOfRecord466() {
		assertEquals("ines@gritsch.com", customers.get(465).getEmail());
	}

	@Test
	@DisplayName("Record 466: Web is http://www.inesgritsch.com")
	void WebOfRecord466() {
		assertEquals("http://www.inesgritsch.com", customers.get(465).getWeb());
	}
}
