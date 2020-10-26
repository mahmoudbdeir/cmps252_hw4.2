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
class Record_2955 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2955: FirstName is Rochelle")
	void FirstNameOfRecord2955() {
		assertEquals("Rochelle", customers.get(2954).getFirstName());
	}

	@Test
	@DisplayName("Record 2955: LastName is Mu")
	void LastNameOfRecord2955() {
		assertEquals("Mu", customers.get(2954).getLastName());
	}

	@Test
	@DisplayName("Record 2955: Company is Seaboard Seed Co")
	void CompanyOfRecord2955() {
		assertEquals("Seaboard Seed Co", customers.get(2954).getCompany());
	}

	@Test
	@DisplayName("Record 2955: Address is 741 Edgewood Ave Ne")
	void AddressOfRecord2955() {
		assertEquals("741 Edgewood Ave Ne", customers.get(2954).getAddress());
	}

	@Test
	@DisplayName("Record 2955: City is Atlanta")
	void CityOfRecord2955() {
		assertEquals("Atlanta", customers.get(2954).getCity());
	}

	@Test
	@DisplayName("Record 2955: County is Fulton")
	void CountyOfRecord2955() {
		assertEquals("Fulton", customers.get(2954).getCounty());
	}

	@Test
	@DisplayName("Record 2955: State is GA")
	void StateOfRecord2955() {
		assertEquals("GA", customers.get(2954).getState());
	}

	@Test
	@DisplayName("Record 2955: ZIP is 30307")
	void ZIPOfRecord2955() {
		assertEquals("30307", customers.get(2954).getZIP());
	}

	@Test
	@DisplayName("Record 2955: Phone is 404-521-3931")
	void PhoneOfRecord2955() {
		assertEquals("404-521-3931", customers.get(2954).getPhone());
	}

	@Test
	@DisplayName("Record 2955: Fax is 404-521-8271")
	void FaxOfRecord2955() {
		assertEquals("404-521-8271", customers.get(2954).getFax());
	}

	@Test
	@DisplayName("Record 2955: Email is rochelle@mu.com")
	void EmailOfRecord2955() {
		assertEquals("rochelle@mu.com", customers.get(2954).getEmail());
	}

	@Test
	@DisplayName("Record 2955: Web is http://www.rochellemu.com")
	void WebOfRecord2955() {
		assertEquals("http://www.rochellemu.com", customers.get(2954).getWeb());
	}
}
