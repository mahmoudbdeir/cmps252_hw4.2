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

@Tag("28")
class Record_2526 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2526: FirstName is Lee")
	void FirstNameOfRecord2526() {
		assertEquals("Lee", customers.get(2525).getFirstName());
	}

	@Test
	@DisplayName("Record 2526: LastName is Clarson")
	void LastNameOfRecord2526() {
		assertEquals("Clarson", customers.get(2525).getLastName());
	}

	@Test
	@DisplayName("Record 2526: Company is Record Press Inc")
	void CompanyOfRecord2526() {
		assertEquals("Record Press Inc", customers.get(2525).getCompany());
	}

	@Test
	@DisplayName("Record 2526: Address is 15 Nyl Ct")
	void AddressOfRecord2526() {
		assertEquals("15 Nyl Ct", customers.get(2525).getAddress());
	}

	@Test
	@DisplayName("Record 2526: City is Oceanside")
	void CityOfRecord2526() {
		assertEquals("Oceanside", customers.get(2525).getCity());
	}

	@Test
	@DisplayName("Record 2526: County is Nassau")
	void CountyOfRecord2526() {
		assertEquals("Nassau", customers.get(2525).getCounty());
	}

	@Test
	@DisplayName("Record 2526: State is NY")
	void StateOfRecord2526() {
		assertEquals("NY", customers.get(2525).getState());
	}

	@Test
	@DisplayName("Record 2526: ZIP is 11572")
	void ZIPOfRecord2526() {
		assertEquals("11572", customers.get(2525).getZIP());
	}

	@Test
	@DisplayName("Record 2526: Phone is 516-764-4209")
	void PhoneOfRecord2526() {
		assertEquals("516-764-4209", customers.get(2525).getPhone());
	}

	@Test
	@DisplayName("Record 2526: Fax is 516-764-5987")
	void FaxOfRecord2526() {
		assertEquals("516-764-5987", customers.get(2525).getFax());
	}

	@Test
	@DisplayName("Record 2526: Email is lee@clarson.com")
	void EmailOfRecord2526() {
		assertEquals("lee@clarson.com", customers.get(2525).getEmail());
	}

	@Test
	@DisplayName("Record 2526: Web is http://www.leeclarson.com")
	void WebOfRecord2526() {
		assertEquals("http://www.leeclarson.com", customers.get(2525).getWeb());
	}
}
