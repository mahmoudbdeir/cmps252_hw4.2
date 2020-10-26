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

@Tag("42")
class Record_1972 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1972: FirstName is Shauna")
	void FirstNameOfRecord1972() {
		assertEquals("Shauna", customers.get(1971).getFirstName());
	}

	@Test
	@DisplayName("Record 1972: LastName is Shearn")
	void LastNameOfRecord1972() {
		assertEquals("Shearn", customers.get(1971).getLastName());
	}

	@Test
	@DisplayName("Record 1972: Company is Broad Ripple Trophy Center")
	void CompanyOfRecord1972() {
		assertEquals("Broad Ripple Trophy Center", customers.get(1971).getCompany());
	}

	@Test
	@DisplayName("Record 1972: Address is 12445 E 39th Ave  #-501")
	void AddressOfRecord1972() {
		assertEquals("12445 E 39th Ave  #-501", customers.get(1971).getAddress());
	}

	@Test
	@DisplayName("Record 1972: City is Denver")
	void CityOfRecord1972() {
		assertEquals("Denver", customers.get(1971).getCity());
	}

	@Test
	@DisplayName("Record 1972: County is Denver")
	void CountyOfRecord1972() {
		assertEquals("Denver", customers.get(1971).getCounty());
	}

	@Test
	@DisplayName("Record 1972: State is CO")
	void StateOfRecord1972() {
		assertEquals("CO", customers.get(1971).getState());
	}

	@Test
	@DisplayName("Record 1972: ZIP is 80239")
	void ZIPOfRecord1972() {
		assertEquals("80239", customers.get(1971).getZIP());
	}

	@Test
	@DisplayName("Record 1972: Phone is 303-373-0983")
	void PhoneOfRecord1972() {
		assertEquals("303-373-0983", customers.get(1971).getPhone());
	}

	@Test
	@DisplayName("Record 1972: Fax is 303-373-7936")
	void FaxOfRecord1972() {
		assertEquals("303-373-7936", customers.get(1971).getFax());
	}

	@Test
	@DisplayName("Record 1972: Email is shauna@shearn.com")
	void EmailOfRecord1972() {
		assertEquals("shauna@shearn.com", customers.get(1971).getEmail());
	}

	@Test
	@DisplayName("Record 1972: Web is http://www.shaunashearn.com")
	void WebOfRecord1972() {
		assertEquals("http://www.shaunashearn.com", customers.get(1971).getWeb());
	}
}
