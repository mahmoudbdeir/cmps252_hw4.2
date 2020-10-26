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

@Tag("46")
class Record_1575 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1575: FirstName is Marianne")
	void FirstNameOfRecord1575() {
		assertEquals("Marianne", customers.get(1574).getFirstName());
	}

	@Test
	@DisplayName("Record 1575: LastName is Vargo")
	void LastNameOfRecord1575() {
		assertEquals("Vargo", customers.get(1574).getLastName());
	}

	@Test
	@DisplayName("Record 1575: Company is Clinton Pattern Works Inc")
	void CompanyOfRecord1575() {
		assertEquals("Clinton Pattern Works Inc", customers.get(1574).getCompany());
	}

	@Test
	@DisplayName("Record 1575: Address is 1228 W Scyene Rd  #-103")
	void AddressOfRecord1575() {
		assertEquals("1228 W Scyene Rd  #-103", customers.get(1574).getAddress());
	}

	@Test
	@DisplayName("Record 1575: City is Mesquite")
	void CityOfRecord1575() {
		assertEquals("Mesquite", customers.get(1574).getCity());
	}

	@Test
	@DisplayName("Record 1575: County is Dallas")
	void CountyOfRecord1575() {
		assertEquals("Dallas", customers.get(1574).getCounty());
	}

	@Test
	@DisplayName("Record 1575: State is TX")
	void StateOfRecord1575() {
		assertEquals("TX", customers.get(1574).getState());
	}

	@Test
	@DisplayName("Record 1575: ZIP is 75149")
	void ZIPOfRecord1575() {
		assertEquals("75149", customers.get(1574).getZIP());
	}

	@Test
	@DisplayName("Record 1575: Phone is 972-289-1235")
	void PhoneOfRecord1575() {
		assertEquals("972-289-1235", customers.get(1574).getPhone());
	}

	@Test
	@DisplayName("Record 1575: Fax is 972-289-0255")
	void FaxOfRecord1575() {
		assertEquals("972-289-0255", customers.get(1574).getFax());
	}

	@Test
	@DisplayName("Record 1575: Email is marianne@vargo.com")
	void EmailOfRecord1575() {
		assertEquals("marianne@vargo.com", customers.get(1574).getEmail());
	}

	@Test
	@DisplayName("Record 1575: Web is http://www.mariannevargo.com")
	void WebOfRecord1575() {
		assertEquals("http://www.mariannevargo.com", customers.get(1574).getWeb());
	}
}
