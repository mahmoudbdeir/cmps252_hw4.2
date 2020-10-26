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

@Tag("33")
class Record_2238 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2238: FirstName is Cassie")
	void FirstNameOfRecord2238() {
		assertEquals("Cassie", customers.get(2237).getFirstName());
	}

	@Test
	@DisplayName("Record 2238: LastName is Ferraraccio")
	void LastNameOfRecord2238() {
		assertEquals("Ferraraccio", customers.get(2237).getLastName());
	}

	@Test
	@DisplayName("Record 2238: Company is Designs For Interiors")
	void CompanyOfRecord2238() {
		assertEquals("Designs For Interiors", customers.get(2237).getCompany());
	}

	@Test
	@DisplayName("Record 2238: Address is 2211 Windsor Cir")
	void AddressOfRecord2238() {
		assertEquals("2211 Windsor Cir", customers.get(2237).getAddress());
	}

	@Test
	@DisplayName("Record 2238: City is Broomall")
	void CityOfRecord2238() {
		assertEquals("Broomall", customers.get(2237).getCity());
	}

	@Test
	@DisplayName("Record 2238: County is Delaware")
	void CountyOfRecord2238() {
		assertEquals("Delaware", customers.get(2237).getCounty());
	}

	@Test
	@DisplayName("Record 2238: State is PA")
	void StateOfRecord2238() {
		assertEquals("PA", customers.get(2237).getState());
	}

	@Test
	@DisplayName("Record 2238: ZIP is 19008")
	void ZIPOfRecord2238() {
		assertEquals("19008", customers.get(2237).getZIP());
	}

	@Test
	@DisplayName("Record 2238: Phone is 610-356-1133")
	void PhoneOfRecord2238() {
		assertEquals("610-356-1133", customers.get(2237).getPhone());
	}

	@Test
	@DisplayName("Record 2238: Fax is 610-356-7323")
	void FaxOfRecord2238() {
		assertEquals("610-356-7323", customers.get(2237).getFax());
	}

	@Test
	@DisplayName("Record 2238: Email is cassie@ferraraccio.com")
	void EmailOfRecord2238() {
		assertEquals("cassie@ferraraccio.com", customers.get(2237).getEmail());
	}

	@Test
	@DisplayName("Record 2238: Web is http://www.cassieferraraccio.com")
	void WebOfRecord2238() {
		assertEquals("http://www.cassieferraraccio.com", customers.get(2237).getWeb());
	}
}
