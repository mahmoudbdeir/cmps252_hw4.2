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

@Tag("48")
class Record_2308 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2308: FirstName is Noble")
	void FirstNameOfRecord2308() {
		assertEquals("Noble", customers.get(2307).getFirstName());
	}

	@Test
	@DisplayName("Record 2308: LastName is Plaisance")
	void LastNameOfRecord2308() {
		assertEquals("Plaisance", customers.get(2307).getLastName());
	}

	@Test
	@DisplayName("Record 2308: Company is Boo Rays Cafe")
	void CompanyOfRecord2308() {
		assertEquals("Boo Rays Cafe", customers.get(2307).getCompany());
	}

	@Test
	@DisplayName("Record 2308: Address is 4020 W Cayuga St")
	void AddressOfRecord2308() {
		assertEquals("4020 W Cayuga St", customers.get(2307).getAddress());
	}

	@Test
	@DisplayName("Record 2308: City is Tampa")
	void CityOfRecord2308() {
		assertEquals("Tampa", customers.get(2307).getCity());
	}

	@Test
	@DisplayName("Record 2308: County is Hillsborough")
	void CountyOfRecord2308() {
		assertEquals("Hillsborough", customers.get(2307).getCounty());
	}

	@Test
	@DisplayName("Record 2308: State is FL")
	void StateOfRecord2308() {
		assertEquals("FL", customers.get(2307).getState());
	}

	@Test
	@DisplayName("Record 2308: ZIP is 33614")
	void ZIPOfRecord2308() {
		assertEquals("33614", customers.get(2307).getZIP());
	}

	@Test
	@DisplayName("Record 2308: Phone is 813-879-5361")
	void PhoneOfRecord2308() {
		assertEquals("813-879-5361", customers.get(2307).getPhone());
	}

	@Test
	@DisplayName("Record 2308: Fax is 813-879-9854")
	void FaxOfRecord2308() {
		assertEquals("813-879-9854", customers.get(2307).getFax());
	}

	@Test
	@DisplayName("Record 2308: Email is noble@plaisance.com")
	void EmailOfRecord2308() {
		assertEquals("noble@plaisance.com", customers.get(2307).getEmail());
	}

	@Test
	@DisplayName("Record 2308: Web is http://www.nobleplaisance.com")
	void WebOfRecord2308() {
		assertEquals("http://www.nobleplaisance.com", customers.get(2307).getWeb());
	}
}
