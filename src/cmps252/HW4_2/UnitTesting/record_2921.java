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

@Tag("13")
class Record_2921 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2921: FirstName is Gus")
	void FirstNameOfRecord2921() {
		assertEquals("Gus", customers.get(2920).getFirstName());
	}

	@Test
	@DisplayName("Record 2921: LastName is Faessler")
	void LastNameOfRecord2921() {
		assertEquals("Faessler", customers.get(2920).getLastName());
	}

	@Test
	@DisplayName("Record 2921: Company is Hyper Micro Inc")
	void CompanyOfRecord2921() {
		assertEquals("Hyper Micro Inc", customers.get(2920).getCompany());
	}

	@Test
	@DisplayName("Record 2921: Address is 519 N Monroe St")
	void AddressOfRecord2921() {
		assertEquals("519 N Monroe St", customers.get(2920).getAddress());
	}

	@Test
	@DisplayName("Record 2921: City is Tallahassee")
	void CityOfRecord2921() {
		assertEquals("Tallahassee", customers.get(2920).getCity());
	}

	@Test
	@DisplayName("Record 2921: County is Leon")
	void CountyOfRecord2921() {
		assertEquals("Leon", customers.get(2920).getCounty());
	}

	@Test
	@DisplayName("Record 2921: State is FL")
	void StateOfRecord2921() {
		assertEquals("FL", customers.get(2920).getState());
	}

	@Test
	@DisplayName("Record 2921: ZIP is 32301")
	void ZIPOfRecord2921() {
		assertEquals("32301", customers.get(2920).getZIP());
	}

	@Test
	@DisplayName("Record 2921: Phone is 850-222-7287")
	void PhoneOfRecord2921() {
		assertEquals("850-222-7287", customers.get(2920).getPhone());
	}

	@Test
	@DisplayName("Record 2921: Fax is 850-222-4962")
	void FaxOfRecord2921() {
		assertEquals("850-222-4962", customers.get(2920).getFax());
	}

	@Test
	@DisplayName("Record 2921: Email is gus@faessler.com")
	void EmailOfRecord2921() {
		assertEquals("gus@faessler.com", customers.get(2920).getEmail());
	}

	@Test
	@DisplayName("Record 2921: Web is http://www.gusfaessler.com")
	void WebOfRecord2921() {
		assertEquals("http://www.gusfaessler.com", customers.get(2920).getWeb());
	}
}
