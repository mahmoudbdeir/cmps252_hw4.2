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

@Tag("18")
class Record_1637 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1637: FirstName is Spencer")
	void FirstNameOfRecord1637() {
		assertEquals("Spencer", customers.get(1636).getFirstName());
	}

	@Test
	@DisplayName("Record 1637: LastName is Scruton")
	void LastNameOfRecord1637() {
		assertEquals("Scruton", customers.get(1636).getLastName());
	}

	@Test
	@DisplayName("Record 1637: Company is Assn Mgr & Cnslnts Frank S")
	void CompanyOfRecord1637() {
		assertEquals("Assn Mgr & Cnslnts Frank S", customers.get(1636).getCompany());
	}

	@Test
	@DisplayName("Record 1637: Address is 580 5th Ave  #-512")
	void AddressOfRecord1637() {
		assertEquals("580 5th Ave  #-512", customers.get(1636).getAddress());
	}

	@Test
	@DisplayName("Record 1637: City is New York")
	void CityOfRecord1637() {
		assertEquals("New York", customers.get(1636).getCity());
	}

	@Test
	@DisplayName("Record 1637: County is New York")
	void CountyOfRecord1637() {
		assertEquals("New York", customers.get(1636).getCounty());
	}

	@Test
	@DisplayName("Record 1637: State is NY")
	void StateOfRecord1637() {
		assertEquals("NY", customers.get(1636).getState());
	}

	@Test
	@DisplayName("Record 1637: ZIP is 10036")
	void ZIPOfRecord1637() {
		assertEquals("10036", customers.get(1636).getZIP());
	}

	@Test
	@DisplayName("Record 1637: Phone is 212-302-8021")
	void PhoneOfRecord1637() {
		assertEquals("212-302-8021", customers.get(1636).getPhone());
	}

	@Test
	@DisplayName("Record 1637: Fax is 212-302-0647")
	void FaxOfRecord1637() {
		assertEquals("212-302-0647", customers.get(1636).getFax());
	}

	@Test
	@DisplayName("Record 1637: Email is spencer@scruton.com")
	void EmailOfRecord1637() {
		assertEquals("spencer@scruton.com", customers.get(1636).getEmail());
	}

	@Test
	@DisplayName("Record 1637: Web is http://www.spencerscruton.com")
	void WebOfRecord1637() {
		assertEquals("http://www.spencerscruton.com", customers.get(1636).getWeb());
	}
}
