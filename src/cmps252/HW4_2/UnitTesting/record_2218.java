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

@Tag("30")
class Record_2218 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2218: FirstName is Kristie")
	void FirstNameOfRecord2218() {
		assertEquals("Kristie", customers.get(2217).getFirstName());
	}

	@Test
	@DisplayName("Record 2218: LastName is Calfee")
	void LastNameOfRecord2218() {
		assertEquals("Calfee", customers.get(2217).getLastName());
	}

	@Test
	@DisplayName("Record 2218: Company is Specialty Decor & Dsgn Inc")
	void CompanyOfRecord2218() {
		assertEquals("Specialty Decor & Dsgn Inc", customers.get(2217).getCompany());
	}

	@Test
	@DisplayName("Record 2218: Address is 1601 Caspian Ave")
	void AddressOfRecord2218() {
		assertEquals("1601 Caspian Ave", customers.get(2217).getAddress());
	}

	@Test
	@DisplayName("Record 2218: City is Long Beach")
	void CityOfRecord2218() {
		assertEquals("Long Beach", customers.get(2217).getCity());
	}

	@Test
	@DisplayName("Record 2218: County is Los Angeles")
	void CountyOfRecord2218() {
		assertEquals("Los Angeles", customers.get(2217).getCounty());
	}

	@Test
	@DisplayName("Record 2218: State is CA")
	void StateOfRecord2218() {
		assertEquals("CA", customers.get(2217).getState());
	}

	@Test
	@DisplayName("Record 2218: ZIP is 90813")
	void ZIPOfRecord2218() {
		assertEquals("90813", customers.get(2217).getZIP());
	}

	@Test
	@DisplayName("Record 2218: Phone is 562-491-7177")
	void PhoneOfRecord2218() {
		assertEquals("562-491-7177", customers.get(2217).getPhone());
	}

	@Test
	@DisplayName("Record 2218: Fax is 562-491-3708")
	void FaxOfRecord2218() {
		assertEquals("562-491-3708", customers.get(2217).getFax());
	}

	@Test
	@DisplayName("Record 2218: Email is kristie@calfee.com")
	void EmailOfRecord2218() {
		assertEquals("kristie@calfee.com", customers.get(2217).getEmail());
	}

	@Test
	@DisplayName("Record 2218: Web is http://www.kristiecalfee.com")
	void WebOfRecord2218() {
		assertEquals("http://www.kristiecalfee.com", customers.get(2217).getWeb());
	}
}
