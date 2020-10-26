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

@Tag("44")
class Record_2009 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2009: FirstName is Shanda")
	void FirstNameOfRecord2009() {
		assertEquals("Shanda", customers.get(2008).getFirstName());
	}

	@Test
	@DisplayName("Record 2009: LastName is Prime")
	void LastNameOfRecord2009() {
		assertEquals("Prime", customers.get(2008).getLastName());
	}

	@Test
	@DisplayName("Record 2009: Company is United States Amer Prt Shops")
	void CompanyOfRecord2009() {
		assertEquals("United States Amer Prt Shops", customers.get(2008).getCompany());
	}

	@Test
	@DisplayName("Record 2009: Address is 3215 58th St")
	void AddressOfRecord2009() {
		assertEquals("3215 58th St", customers.get(2008).getAddress());
	}

	@Test
	@DisplayName("Record 2009: City is Woodside")
	void CityOfRecord2009() {
		assertEquals("Woodside", customers.get(2008).getCity());
	}

	@Test
	@DisplayName("Record 2009: County is Queens")
	void CountyOfRecord2009() {
		assertEquals("Queens", customers.get(2008).getCounty());
	}

	@Test
	@DisplayName("Record 2009: State is NY")
	void StateOfRecord2009() {
		assertEquals("NY", customers.get(2008).getState());
	}

	@Test
	@DisplayName("Record 2009: ZIP is 11377")
	void ZIPOfRecord2009() {
		assertEquals("11377", customers.get(2008).getZIP());
	}

	@Test
	@DisplayName("Record 2009: Phone is 718-728-0818")
	void PhoneOfRecord2009() {
		assertEquals("718-728-0818", customers.get(2008).getPhone());
	}

	@Test
	@DisplayName("Record 2009: Fax is 718-728-0756")
	void FaxOfRecord2009() {
		assertEquals("718-728-0756", customers.get(2008).getFax());
	}

	@Test
	@DisplayName("Record 2009: Email is shanda@prime.com")
	void EmailOfRecord2009() {
		assertEquals("shanda@prime.com", customers.get(2008).getEmail());
	}

	@Test
	@DisplayName("Record 2009: Web is http://www.shandaprime.com")
	void WebOfRecord2009() {
		assertEquals("http://www.shandaprime.com", customers.get(2008).getWeb());
	}
}
