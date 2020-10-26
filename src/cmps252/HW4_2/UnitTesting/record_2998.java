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

@Tag("27")
class Record_2998 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2998: FirstName is Davis")
	void FirstNameOfRecord2998() {
		assertEquals("Davis", customers.get(2997).getFirstName());
	}

	@Test
	@DisplayName("Record 2998: LastName is Tinley")
	void LastNameOfRecord2998() {
		assertEquals("Tinley", customers.get(2997).getLastName());
	}

	@Test
	@DisplayName("Record 2998: Company is Goldsmith, Scott A")
	void CompanyOfRecord2998() {
		assertEquals("Goldsmith, Scott A", customers.get(2997).getCompany());
	}

	@Test
	@DisplayName("Record 2998: Address is 3780 S Highland Dr")
	void AddressOfRecord2998() {
		assertEquals("3780 S Highland Dr", customers.get(2997).getAddress());
	}

	@Test
	@DisplayName("Record 2998: City is Las Vegas")
	void CityOfRecord2998() {
		assertEquals("Las Vegas", customers.get(2997).getCity());
	}

	@Test
	@DisplayName("Record 2998: County is Clark")
	void CountyOfRecord2998() {
		assertEquals("Clark", customers.get(2997).getCounty());
	}

	@Test
	@DisplayName("Record 2998: State is NV")
	void StateOfRecord2998() {
		assertEquals("NV", customers.get(2997).getState());
	}

	@Test
	@DisplayName("Record 2998: ZIP is 89103")
	void ZIPOfRecord2998() {
		assertEquals("89103", customers.get(2997).getZIP());
	}

	@Test
	@DisplayName("Record 2998: Phone is 702-362-9351")
	void PhoneOfRecord2998() {
		assertEquals("702-362-9351", customers.get(2997).getPhone());
	}

	@Test
	@DisplayName("Record 2998: Fax is 702-362-1429")
	void FaxOfRecord2998() {
		assertEquals("702-362-1429", customers.get(2997).getFax());
	}

	@Test
	@DisplayName("Record 2998: Email is davis@tinley.com")
	void EmailOfRecord2998() {
		assertEquals("davis@tinley.com", customers.get(2997).getEmail());
	}

	@Test
	@DisplayName("Record 2998: Web is http://www.davistinley.com")
	void WebOfRecord2998() {
		assertEquals("http://www.davistinley.com", customers.get(2997).getWeb());
	}
}
