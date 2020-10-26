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
class Record_2534 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2534: FirstName is Arline")
	void FirstNameOfRecord2534() {
		assertEquals("Arline", customers.get(2533).getFirstName());
	}

	@Test
	@DisplayName("Record 2534: LastName is Galarza")
	void LastNameOfRecord2534() {
		assertEquals("Galarza", customers.get(2533).getLastName());
	}

	@Test
	@DisplayName("Record 2534: Company is D & G Machine Products Inc")
	void CompanyOfRecord2534() {
		assertEquals("D & G Machine Products Inc", customers.get(2533).getCompany());
	}

	@Test
	@DisplayName("Record 2534: Address is 3733 National Dr  #-100")
	void AddressOfRecord2534() {
		assertEquals("3733 National Dr  #-100", customers.get(2533).getAddress());
	}

	@Test
	@DisplayName("Record 2534: City is Ralygh")
	void CityOfRecord2534() {
		assertEquals("Ralygh", customers.get(2533).getCity());
	}

	@Test
	@DisplayName("Record 2534: County is Wake")
	void CountyOfRecord2534() {
		assertEquals("Wake", customers.get(2533).getCounty());
	}

	@Test
	@DisplayName("Record 2534: State is NC")
	void StateOfRecord2534() {
		assertEquals("NC", customers.get(2533).getState());
	}

	@Test
	@DisplayName("Record 2534: ZIP is 27612")
	void ZIPOfRecord2534() {
		assertEquals("27612", customers.get(2533).getZIP());
	}

	@Test
	@DisplayName("Record 2534: Phone is 919-781-8623")
	void PhoneOfRecord2534() {
		assertEquals("919-781-8623", customers.get(2533).getPhone());
	}

	@Test
	@DisplayName("Record 2534: Fax is 919-781-6599")
	void FaxOfRecord2534() {
		assertEquals("919-781-6599", customers.get(2533).getFax());
	}

	@Test
	@DisplayName("Record 2534: Email is arline@galarza.com")
	void EmailOfRecord2534() {
		assertEquals("arline@galarza.com", customers.get(2533).getEmail());
	}

	@Test
	@DisplayName("Record 2534: Web is http://www.arlinegalarza.com")
	void WebOfRecord2534() {
		assertEquals("http://www.arlinegalarza.com", customers.get(2533).getWeb());
	}
}
