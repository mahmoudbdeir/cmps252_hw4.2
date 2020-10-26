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

@Tag("35")
class Record_2897 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2897: FirstName is Theodora")
	void FirstNameOfRecord2897() {
		assertEquals("Theodora", customers.get(2896).getFirstName());
	}

	@Test
	@DisplayName("Record 2897: LastName is Lenhart")
	void LastNameOfRecord2897() {
		assertEquals("Lenhart", customers.get(2896).getLastName());
	}

	@Test
	@DisplayName("Record 2897: Company is Barry County Advertiser")
	void CompanyOfRecord2897() {
		assertEquals("Barry County Advertiser", customers.get(2896).getCompany());
	}

	@Test
	@DisplayName("Record 2897: Address is Box #-84069")
	void AddressOfRecord2897() {
		assertEquals("Box #-84069", customers.get(2896).getAddress());
	}

	@Test
	@DisplayName("Record 2897: City is Fairbanks")
	void CityOfRecord2897() {
		assertEquals("Fairbanks", customers.get(2896).getCity());
	}

	@Test
	@DisplayName("Record 2897: County is Fairbanks North Star")
	void CountyOfRecord2897() {
		assertEquals("Fairbanks North Star", customers.get(2896).getCounty());
	}

	@Test
	@DisplayName("Record 2897: State is AK")
	void StateOfRecord2897() {
		assertEquals("AK", customers.get(2896).getState());
	}

	@Test
	@DisplayName("Record 2897: ZIP is 99708")
	void ZIPOfRecord2897() {
		assertEquals("99708", customers.get(2896).getZIP());
	}

	@Test
	@DisplayName("Record 2897: Phone is 907-457-7457")
	void PhoneOfRecord2897() {
		assertEquals("907-457-7457", customers.get(2896).getPhone());
	}

	@Test
	@DisplayName("Record 2897: Fax is 907-457-8732")
	void FaxOfRecord2897() {
		assertEquals("907-457-8732", customers.get(2896).getFax());
	}

	@Test
	@DisplayName("Record 2897: Email is theodora@lenhart.com")
	void EmailOfRecord2897() {
		assertEquals("theodora@lenhart.com", customers.get(2896).getEmail());
	}

	@Test
	@DisplayName("Record 2897: Web is http://www.theodoralenhart.com")
	void WebOfRecord2897() {
		assertEquals("http://www.theodoralenhart.com", customers.get(2896).getWeb());
	}
}
