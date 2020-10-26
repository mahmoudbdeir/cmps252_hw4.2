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

@Tag("16")
class Record_1588 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1588: FirstName is Clark")
	void FirstNameOfRecord1588() {
		assertEquals("Clark", customers.get(1587).getFirstName());
	}

	@Test
	@DisplayName("Record 1588: LastName is Unruh")
	void LastNameOfRecord1588() {
		assertEquals("Unruh", customers.get(1587).getLastName());
	}

	@Test
	@DisplayName("Record 1588: Company is Myster Cheese Co")
	void CompanyOfRecord1588() {
		assertEquals("Myster Cheese Co", customers.get(1587).getCompany());
	}

	@Test
	@DisplayName("Record 1588: Address is 1308 Fm  #-1845s")
	void AddressOfRecord1588() {
		assertEquals("1308 Fm  #-1845s", customers.get(1587).getAddress());
	}

	@Test
	@DisplayName("Record 1588: City is Longview")
	void CityOfRecord1588() {
		assertEquals("Longview", customers.get(1587).getCity());
	}

	@Test
	@DisplayName("Record 1588: County is Gregg")
	void CountyOfRecord1588() {
		assertEquals("Gregg", customers.get(1587).getCounty());
	}

	@Test
	@DisplayName("Record 1588: State is TX")
	void StateOfRecord1588() {
		assertEquals("TX", customers.get(1587).getState());
	}

	@Test
	@DisplayName("Record 1588: ZIP is 75603")
	void ZIPOfRecord1588() {
		assertEquals("75603", customers.get(1587).getZIP());
	}

	@Test
	@DisplayName("Record 1588: Phone is 903-757-5508")
	void PhoneOfRecord1588() {
		assertEquals("903-757-5508", customers.get(1587).getPhone());
	}

	@Test
	@DisplayName("Record 1588: Fax is 903-757-3271")
	void FaxOfRecord1588() {
		assertEquals("903-757-3271", customers.get(1587).getFax());
	}

	@Test
	@DisplayName("Record 1588: Email is clark@unruh.com")
	void EmailOfRecord1588() {
		assertEquals("clark@unruh.com", customers.get(1587).getEmail());
	}

	@Test
	@DisplayName("Record 1588: Web is http://www.clarkunruh.com")
	void WebOfRecord1588() {
		assertEquals("http://www.clarkunruh.com", customers.get(1587).getWeb());
	}
}
