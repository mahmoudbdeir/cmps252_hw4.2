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

@Tag("10")
class Record_2744 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2744: FirstName is Marjorie")
	void FirstNameOfRecord2744() {
		assertEquals("Marjorie", customers.get(2743).getFirstName());
	}

	@Test
	@DisplayName("Record 2744: LastName is Cason")
	void LastNameOfRecord2744() {
		assertEquals("Cason", customers.get(2743).getLastName());
	}

	@Test
	@DisplayName("Record 2744: Company is Wonder Land Bargain Center")
	void CompanyOfRecord2744() {
		assertEquals("Wonder Land Bargain Center", customers.get(2743).getCompany());
	}

	@Test
	@DisplayName("Record 2744: Address is 1260 Stone Valley Rd")
	void AddressOfRecord2744() {
		assertEquals("1260 Stone Valley Rd", customers.get(2743).getAddress());
	}

	@Test
	@DisplayName("Record 2744: City is Alamo")
	void CityOfRecord2744() {
		assertEquals("Alamo", customers.get(2743).getCity());
	}

	@Test
	@DisplayName("Record 2744: County is Contra Costa")
	void CountyOfRecord2744() {
		assertEquals("Contra Costa", customers.get(2743).getCounty());
	}

	@Test
	@DisplayName("Record 2744: State is CA")
	void StateOfRecord2744() {
		assertEquals("CA", customers.get(2743).getState());
	}

	@Test
	@DisplayName("Record 2744: ZIP is 94507")
	void ZIPOfRecord2744() {
		assertEquals("94507", customers.get(2743).getZIP());
	}

	@Test
	@DisplayName("Record 2744: Phone is 925-838-9417")
	void PhoneOfRecord2744() {
		assertEquals("925-838-9417", customers.get(2743).getPhone());
	}

	@Test
	@DisplayName("Record 2744: Fax is 925-838-4826")
	void FaxOfRecord2744() {
		assertEquals("925-838-4826", customers.get(2743).getFax());
	}

	@Test
	@DisplayName("Record 2744: Email is marjorie@cason.com")
	void EmailOfRecord2744() {
		assertEquals("marjorie@cason.com", customers.get(2743).getEmail());
	}

	@Test
	@DisplayName("Record 2744: Web is http://www.marjoriecason.com")
	void WebOfRecord2744() {
		assertEquals("http://www.marjoriecason.com", customers.get(2743).getWeb());
	}
}
