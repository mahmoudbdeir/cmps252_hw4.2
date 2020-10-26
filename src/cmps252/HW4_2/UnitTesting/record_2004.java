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

@Tag("29")
class Record_2004 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2004: FirstName is Shawn")
	void FirstNameOfRecord2004() {
		assertEquals("Shawn", customers.get(2003).getFirstName());
	}

	@Test
	@DisplayName("Record 2004: LastName is Moneyhun")
	void LastNameOfRecord2004() {
		assertEquals("Moneyhun", customers.get(2003).getLastName());
	}

	@Test
	@DisplayName("Record 2004: Company is Lets Do It Productions")
	void CompanyOfRecord2004() {
		assertEquals("Lets Do It Productions", customers.get(2003).getCompany());
	}

	@Test
	@DisplayName("Record 2004: Address is 1555 King St")
	void AddressOfRecord2004() {
		assertEquals("1555 King St", customers.get(2003).getAddress());
	}

	@Test
	@DisplayName("Record 2004: City is Alexandria")
	void CityOfRecord2004() {
		assertEquals("Alexandria", customers.get(2003).getCity());
	}

	@Test
	@DisplayName("Record 2004: County is Alexandria City")
	void CountyOfRecord2004() {
		assertEquals("Alexandria City", customers.get(2003).getCounty());
	}

	@Test
	@DisplayName("Record 2004: State is VA")
	void StateOfRecord2004() {
		assertEquals("VA", customers.get(2003).getState());
	}

	@Test
	@DisplayName("Record 2004: ZIP is 22314")
	void ZIPOfRecord2004() {
		assertEquals("22314", customers.get(2003).getZIP());
	}

	@Test
	@DisplayName("Record 2004: Phone is 703-836-5328")
	void PhoneOfRecord2004() {
		assertEquals("703-836-5328", customers.get(2003).getPhone());
	}

	@Test
	@DisplayName("Record 2004: Fax is 703-836-9199")
	void FaxOfRecord2004() {
		assertEquals("703-836-9199", customers.get(2003).getFax());
	}

	@Test
	@DisplayName("Record 2004: Email is shawn@moneyhun.com")
	void EmailOfRecord2004() {
		assertEquals("shawn@moneyhun.com", customers.get(2003).getEmail());
	}

	@Test
	@DisplayName("Record 2004: Web is http://www.shawnmoneyhun.com")
	void WebOfRecord2004() {
		assertEquals("http://www.shawnmoneyhun.com", customers.get(2003).getWeb());
	}
}
