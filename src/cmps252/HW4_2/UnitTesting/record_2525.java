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

@Tag("14")
class Record_2525 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2525: FirstName is Winnie")
	void FirstNameOfRecord2525() {
		assertEquals("Winnie", customers.get(2524).getFirstName());
	}

	@Test
	@DisplayName("Record 2525: LastName is Oles")
	void LastNameOfRecord2525() {
		assertEquals("Oles", customers.get(2524).getLastName());
	}

	@Test
	@DisplayName("Record 2525: Company is Pa Cmnwlth Somerset Hist Ctr")
	void CompanyOfRecord2525() {
		assertEquals("Pa Cmnwlth Somerset Hist Ctr", customers.get(2524).getCompany());
	}

	@Test
	@DisplayName("Record 2525: Address is 1883 Fox Ave")
	void AddressOfRecord2525() {
		assertEquals("1883 Fox Ave", customers.get(2524).getAddress());
	}

	@Test
	@DisplayName("Record 2525: City is Fairbanks")
	void CityOfRecord2525() {
		assertEquals("Fairbanks", customers.get(2524).getCity());
	}

	@Test
	@DisplayName("Record 2525: County is Fairbanks North Star")
	void CountyOfRecord2525() {
		assertEquals("Fairbanks North Star", customers.get(2524).getCounty());
	}

	@Test
	@DisplayName("Record 2525: State is AK")
	void StateOfRecord2525() {
		assertEquals("AK", customers.get(2524).getState());
	}

	@Test
	@DisplayName("Record 2525: ZIP is 99701")
	void ZIPOfRecord2525() {
		assertEquals("99701", customers.get(2524).getZIP());
	}

	@Test
	@DisplayName("Record 2525: Phone is 907-452-0791")
	void PhoneOfRecord2525() {
		assertEquals("907-452-0791", customers.get(2524).getPhone());
	}

	@Test
	@DisplayName("Record 2525: Fax is 907-452-3284")
	void FaxOfRecord2525() {
		assertEquals("907-452-3284", customers.get(2524).getFax());
	}

	@Test
	@DisplayName("Record 2525: Email is winnie@oles.com")
	void EmailOfRecord2525() {
		assertEquals("winnie@oles.com", customers.get(2524).getEmail());
	}

	@Test
	@DisplayName("Record 2525: Web is http://www.winnieoles.com")
	void WebOfRecord2525() {
		assertEquals("http://www.winnieoles.com", customers.get(2524).getWeb());
	}
}
