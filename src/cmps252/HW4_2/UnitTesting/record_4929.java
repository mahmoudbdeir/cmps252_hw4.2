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
class Record_4929 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4929: FirstName is Dong")
	void FirstNameOfRecord4929() {
		assertEquals("Dong", customers.get(4928).getFirstName());
	}

	@Test
	@DisplayName("Record 4929: LastName is Cordova")
	void LastNameOfRecord4929() {
		assertEquals("Cordova", customers.get(4928).getLastName());
	}

	@Test
	@DisplayName("Record 4929: Company is Pictsweet Frozen Foods")
	void CompanyOfRecord4929() {
		assertEquals("Pictsweet Frozen Foods", customers.get(4928).getCompany());
	}

	@Test
	@DisplayName("Record 4929: Address is 3701 W Algonquin Rd  #-380")
	void AddressOfRecord4929() {
		assertEquals("3701 W Algonquin Rd  #-380", customers.get(4928).getAddress());
	}

	@Test
	@DisplayName("Record 4929: City is Rolling Meadows")
	void CityOfRecord4929() {
		assertEquals("Rolling Meadows", customers.get(4928).getCity());
	}

	@Test
	@DisplayName("Record 4929: County is Cook")
	void CountyOfRecord4929() {
		assertEquals("Cook", customers.get(4928).getCounty());
	}

	@Test
	@DisplayName("Record 4929: State is IL")
	void StateOfRecord4929() {
		assertEquals("IL", customers.get(4928).getState());
	}

	@Test
	@DisplayName("Record 4929: ZIP is 60008")
	void ZIPOfRecord4929() {
		assertEquals("60008", customers.get(4928).getZIP());
	}

	@Test
	@DisplayName("Record 4929: Phone is 847-577-2585")
	void PhoneOfRecord4929() {
		assertEquals("847-577-2585", customers.get(4928).getPhone());
	}

	@Test
	@DisplayName("Record 4929: Fax is 847-577-3615")
	void FaxOfRecord4929() {
		assertEquals("847-577-3615", customers.get(4928).getFax());
	}

	@Test
	@DisplayName("Record 4929: Email is dong@cordova.com")
	void EmailOfRecord4929() {
		assertEquals("dong@cordova.com", customers.get(4928).getEmail());
	}

	@Test
	@DisplayName("Record 4929: Web is http://www.dongcordova.com")
	void WebOfRecord4929() {
		assertEquals("http://www.dongcordova.com", customers.get(4928).getWeb());
	}
}
