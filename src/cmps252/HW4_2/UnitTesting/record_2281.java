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

@Tag("17")
class Record_2281 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2281: FirstName is Alfredo")
	void FirstNameOfRecord2281() {
		assertEquals("Alfredo", customers.get(2280).getFirstName());
	}

	@Test
	@DisplayName("Record 2281: LastName is Padden")
	void LastNameOfRecord2281() {
		assertEquals("Padden", customers.get(2280).getLastName());
	}

	@Test
	@DisplayName("Record 2281: Company is Stalker & Dysthe Screw Mach")
	void CompanyOfRecord2281() {
		assertEquals("Stalker & Dysthe Screw Mach", customers.get(2280).getCompany());
	}

	@Test
	@DisplayName("Record 2281: Address is 1246 Pine Ave")
	void AddressOfRecord2281() {
		assertEquals("1246 Pine Ave", customers.get(2280).getAddress());
	}

	@Test
	@DisplayName("Record 2281: City is Niagara Falls")
	void CityOfRecord2281() {
		assertEquals("Niagara Falls", customers.get(2280).getCity());
	}

	@Test
	@DisplayName("Record 2281: County is Niagara")
	void CountyOfRecord2281() {
		assertEquals("Niagara", customers.get(2280).getCounty());
	}

	@Test
	@DisplayName("Record 2281: State is NY")
	void StateOfRecord2281() {
		assertEquals("NY", customers.get(2280).getState());
	}

	@Test
	@DisplayName("Record 2281: ZIP is 14301")
	void ZIPOfRecord2281() {
		assertEquals("14301", customers.get(2280).getZIP());
	}

	@Test
	@DisplayName("Record 2281: Phone is 716-282-3964")
	void PhoneOfRecord2281() {
		assertEquals("716-282-3964", customers.get(2280).getPhone());
	}

	@Test
	@DisplayName("Record 2281: Fax is 716-282-8882")
	void FaxOfRecord2281() {
		assertEquals("716-282-8882", customers.get(2280).getFax());
	}

	@Test
	@DisplayName("Record 2281: Email is alfredo@padden.com")
	void EmailOfRecord2281() {
		assertEquals("alfredo@padden.com", customers.get(2280).getEmail());
	}

	@Test
	@DisplayName("Record 2281: Web is http://www.alfredopadden.com")
	void WebOfRecord2281() {
		assertEquals("http://www.alfredopadden.com", customers.get(2280).getWeb());
	}
}
