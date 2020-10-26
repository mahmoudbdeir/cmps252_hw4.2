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
class Record_2374 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2374: FirstName is Jessie")
	void FirstNameOfRecord2374() {
		assertEquals("Jessie", customers.get(2373).getFirstName());
	}

	@Test
	@DisplayName("Record 2374: LastName is Mcduffie")
	void LastNameOfRecord2374() {
		assertEquals("Mcduffie", customers.get(2373).getLastName());
	}

	@Test
	@DisplayName("Record 2374: Company is U S Daicel A Inc")
	void CompanyOfRecord2374() {
		assertEquals("U S Daicel A Inc", customers.get(2373).getCompany());
	}

	@Test
	@DisplayName("Record 2374: Address is 28302 Industrial Blvd  #-c")
	void AddressOfRecord2374() {
		assertEquals("28302 Industrial Blvd  #-c", customers.get(2373).getAddress());
	}

	@Test
	@DisplayName("Record 2374: City is Hayward")
	void CityOfRecord2374() {
		assertEquals("Hayward", customers.get(2373).getCity());
	}

	@Test
	@DisplayName("Record 2374: County is Alameda")
	void CountyOfRecord2374() {
		assertEquals("Alameda", customers.get(2373).getCounty());
	}

	@Test
	@DisplayName("Record 2374: State is CA")
	void StateOfRecord2374() {
		assertEquals("CA", customers.get(2373).getState());
	}

	@Test
	@DisplayName("Record 2374: ZIP is 94545")
	void ZIPOfRecord2374() {
		assertEquals("94545", customers.get(2373).getZIP());
	}

	@Test
	@DisplayName("Record 2374: Phone is 510-786-6558")
	void PhoneOfRecord2374() {
		assertEquals("510-786-6558", customers.get(2373).getPhone());
	}

	@Test
	@DisplayName("Record 2374: Fax is 510-786-0574")
	void FaxOfRecord2374() {
		assertEquals("510-786-0574", customers.get(2373).getFax());
	}

	@Test
	@DisplayName("Record 2374: Email is jessie@mcduffie.com")
	void EmailOfRecord2374() {
		assertEquals("jessie@mcduffie.com", customers.get(2373).getEmail());
	}

	@Test
	@DisplayName("Record 2374: Web is http://www.jessiemcduffie.com")
	void WebOfRecord2374() {
		assertEquals("http://www.jessiemcduffie.com", customers.get(2373).getWeb());
	}
}
