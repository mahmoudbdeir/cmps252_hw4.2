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
class Record_4055 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4055: FirstName is Landon")
	void FirstNameOfRecord4055() {
		assertEquals("Landon", customers.get(4054).getFirstName());
	}

	@Test
	@DisplayName("Record 4055: LastName is Skoczylas")
	void LastNameOfRecord4055() {
		assertEquals("Skoczylas", customers.get(4054).getLastName());
	}

	@Test
	@DisplayName("Record 4055: Company is Aurelios Pizza")
	void CompanyOfRecord4055() {
		assertEquals("Aurelios Pizza", customers.get(4054).getCompany());
	}

	@Test
	@DisplayName("Record 4055: Address is 381 Greenwich Ave")
	void AddressOfRecord4055() {
		assertEquals("381 Greenwich Ave", customers.get(4054).getAddress());
	}

	@Test
	@DisplayName("Record 4055: City is Greenwich")
	void CityOfRecord4055() {
		assertEquals("Greenwich", customers.get(4054).getCity());
	}

	@Test
	@DisplayName("Record 4055: County is Fairfield")
	void CountyOfRecord4055() {
		assertEquals("Fairfield", customers.get(4054).getCounty());
	}

	@Test
	@DisplayName("Record 4055: State is CT")
	void StateOfRecord4055() {
		assertEquals("CT", customers.get(4054).getState());
	}

	@Test
	@DisplayName("Record 4055: ZIP is 6830")
	void ZIPOfRecord4055() {
		assertEquals("6830", customers.get(4054).getZIP());
	}

	@Test
	@DisplayName("Record 4055: Phone is 203-862-4131")
	void PhoneOfRecord4055() {
		assertEquals("203-862-4131", customers.get(4054).getPhone());
	}

	@Test
	@DisplayName("Record 4055: Fax is 203-862-1833")
	void FaxOfRecord4055() {
		assertEquals("203-862-1833", customers.get(4054).getFax());
	}

	@Test
	@DisplayName("Record 4055: Email is landon@skoczylas.com")
	void EmailOfRecord4055() {
		assertEquals("landon@skoczylas.com", customers.get(4054).getEmail());
	}

	@Test
	@DisplayName("Record 4055: Web is http://www.landonskoczylas.com")
	void WebOfRecord4055() {
		assertEquals("http://www.landonskoczylas.com", customers.get(4054).getWeb());
	}
}
