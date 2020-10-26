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

@Tag("45")
class Record_2351 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2351: FirstName is Maggie")
	void FirstNameOfRecord2351() {
		assertEquals("Maggie", customers.get(2350).getFirstName());
	}

	@Test
	@DisplayName("Record 2351: LastName is Beger")
	void LastNameOfRecord2351() {
		assertEquals("Beger", customers.get(2350).getLastName());
	}

	@Test
	@DisplayName("Record 2351: Company is Illini Bank Stonington")
	void CompanyOfRecord2351() {
		assertEquals("Illini Bank Stonington", customers.get(2350).getCompany());
	}

	@Test
	@DisplayName("Record 2351: Address is 417 W Broad St")
	void AddressOfRecord2351() {
		assertEquals("417 W Broad St", customers.get(2350).getAddress());
	}

	@Test
	@DisplayName("Record 2351: City is Falls Church")
	void CityOfRecord2351() {
		assertEquals("Falls Church", customers.get(2350).getCity());
	}

	@Test
	@DisplayName("Record 2351: County is Falls Church City")
	void CountyOfRecord2351() {
		assertEquals("Falls Church City", customers.get(2350).getCounty());
	}

	@Test
	@DisplayName("Record 2351: State is VA")
	void StateOfRecord2351() {
		assertEquals("VA", customers.get(2350).getState());
	}

	@Test
	@DisplayName("Record 2351: ZIP is 22046")
	void ZIPOfRecord2351() {
		assertEquals("22046", customers.get(2350).getZIP());
	}

	@Test
	@DisplayName("Record 2351: Phone is 703-536-0285")
	void PhoneOfRecord2351() {
		assertEquals("703-536-0285", customers.get(2350).getPhone());
	}

	@Test
	@DisplayName("Record 2351: Fax is 703-536-2462")
	void FaxOfRecord2351() {
		assertEquals("703-536-2462", customers.get(2350).getFax());
	}

	@Test
	@DisplayName("Record 2351: Email is maggie@beger.com")
	void EmailOfRecord2351() {
		assertEquals("maggie@beger.com", customers.get(2350).getEmail());
	}

	@Test
	@DisplayName("Record 2351: Web is http://www.maggiebeger.com")
	void WebOfRecord2351() {
		assertEquals("http://www.maggiebeger.com", customers.get(2350).getWeb());
	}
}
