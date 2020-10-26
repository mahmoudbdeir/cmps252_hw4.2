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
class Record_2094 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2094: FirstName is Moses")
	void FirstNameOfRecord2094() {
		assertEquals("Moses", customers.get(2093).getFirstName());
	}

	@Test
	@DisplayName("Record 2094: LastName is Gouthier")
	void LastNameOfRecord2094() {
		assertEquals("Gouthier", customers.get(2093).getLastName());
	}

	@Test
	@DisplayName("Record 2094: Company is Western Reserve Transit Athrty")
	void CompanyOfRecord2094() {
		assertEquals("Western Reserve Transit Athrty", customers.get(2093).getCompany());
	}

	@Test
	@DisplayName("Record 2094: Address is 1650 W Virginia St  #-100")
	void AddressOfRecord2094() {
		assertEquals("1650 W Virginia St  #-100", customers.get(2093).getAddress());
	}

	@Test
	@DisplayName("Record 2094: City is McKinney")
	void CityOfRecord2094() {
		assertEquals("McKinney", customers.get(2093).getCity());
	}

	@Test
	@DisplayName("Record 2094: County is Collin")
	void CountyOfRecord2094() {
		assertEquals("Collin", customers.get(2093).getCounty());
	}

	@Test
	@DisplayName("Record 2094: State is TX")
	void StateOfRecord2094() {
		assertEquals("TX", customers.get(2093).getState());
	}

	@Test
	@DisplayName("Record 2094: ZIP is 75069")
	void ZIPOfRecord2094() {
		assertEquals("75069", customers.get(2093).getZIP());
	}

	@Test
	@DisplayName("Record 2094: Phone is 972-542-2061")
	void PhoneOfRecord2094() {
		assertEquals("972-542-2061", customers.get(2093).getPhone());
	}

	@Test
	@DisplayName("Record 2094: Fax is 972-542-3883")
	void FaxOfRecord2094() {
		assertEquals("972-542-3883", customers.get(2093).getFax());
	}

	@Test
	@DisplayName("Record 2094: Email is moses@gouthier.com")
	void EmailOfRecord2094() {
		assertEquals("moses@gouthier.com", customers.get(2093).getEmail());
	}

	@Test
	@DisplayName("Record 2094: Web is http://www.mosesgouthier.com")
	void WebOfRecord2094() {
		assertEquals("http://www.mosesgouthier.com", customers.get(2093).getWeb());
	}
}
