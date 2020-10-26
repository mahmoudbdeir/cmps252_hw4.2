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
class Record_2376 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2376: FirstName is Lucia")
	void FirstNameOfRecord2376() {
		assertEquals("Lucia", customers.get(2375).getFirstName());
	}

	@Test
	@DisplayName("Record 2376: LastName is Kennaugh")
	void LastNameOfRecord2376() {
		assertEquals("Kennaugh", customers.get(2375).getLastName());
	}

	@Test
	@DisplayName("Record 2376: Company is Kearny Mesa Auto Body")
	void CompanyOfRecord2376() {
		assertEquals("Kearny Mesa Auto Body", customers.get(2375).getCompany());
	}

	@Test
	@DisplayName("Record 2376: Address is 981 Second St")
	void AddressOfRecord2376() {
		assertEquals("981 Second St", customers.get(2375).getAddress());
	}

	@Test
	@DisplayName("Record 2376: City is Manchester")
	void CityOfRecord2376() {
		assertEquals("Manchester", customers.get(2375).getCity());
	}

	@Test
	@DisplayName("Record 2376: County is Hillsborough")
	void CountyOfRecord2376() {
		assertEquals("Hillsborough", customers.get(2375).getCounty());
	}

	@Test
	@DisplayName("Record 2376: State is NH")
	void StateOfRecord2376() {
		assertEquals("NH", customers.get(2375).getState());
	}

	@Test
	@DisplayName("Record 2376: ZIP is 3102")
	void ZIPOfRecord2376() {
		assertEquals("3102", customers.get(2375).getZIP());
	}

	@Test
	@DisplayName("Record 2376: Phone is 603-623-6920")
	void PhoneOfRecord2376() {
		assertEquals("603-623-6920", customers.get(2375).getPhone());
	}

	@Test
	@DisplayName("Record 2376: Fax is 603-623-1416")
	void FaxOfRecord2376() {
		assertEquals("603-623-1416", customers.get(2375).getFax());
	}

	@Test
	@DisplayName("Record 2376: Email is lucia@kennaugh.com")
	void EmailOfRecord2376() {
		assertEquals("lucia@kennaugh.com", customers.get(2375).getEmail());
	}

	@Test
	@DisplayName("Record 2376: Web is http://www.luciakennaugh.com")
	void WebOfRecord2376() {
		assertEquals("http://www.luciakennaugh.com", customers.get(2375).getWeb());
	}
}
