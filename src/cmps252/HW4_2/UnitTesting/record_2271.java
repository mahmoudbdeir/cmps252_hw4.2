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

@Tag("32")
class Record_2271 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2271: FirstName is Jerrell")
	void FirstNameOfRecord2271() {
		assertEquals("Jerrell", customers.get(2270).getFirstName());
	}

	@Test
	@DisplayName("Record 2271: LastName is Balcerzak")
	void LastNameOfRecord2271() {
		assertEquals("Balcerzak", customers.get(2270).getLastName());
	}

	@Test
	@DisplayName("Record 2271: Company is Aqua Dynamic Group Corp")
	void CompanyOfRecord2271() {
		assertEquals("Aqua Dynamic Group Corp", customers.get(2270).getCompany());
	}

	@Test
	@DisplayName("Record 2271: Address is 909 E Wilmette Rd  #-c")
	void AddressOfRecord2271() {
		assertEquals("909 E Wilmette Rd  #-c", customers.get(2270).getAddress());
	}

	@Test
	@DisplayName("Record 2271: City is Palatine")
	void CityOfRecord2271() {
		assertEquals("Palatine", customers.get(2270).getCity());
	}

	@Test
	@DisplayName("Record 2271: County is Cook")
	void CountyOfRecord2271() {
		assertEquals("Cook", customers.get(2270).getCounty());
	}

	@Test
	@DisplayName("Record 2271: State is IL")
	void StateOfRecord2271() {
		assertEquals("IL", customers.get(2270).getState());
	}

	@Test
	@DisplayName("Record 2271: ZIP is 60067")
	void ZIPOfRecord2271() {
		assertEquals("60067", customers.get(2270).getZIP());
	}

	@Test
	@DisplayName("Record 2271: Phone is 847-358-1545")
	void PhoneOfRecord2271() {
		assertEquals("847-358-1545", customers.get(2270).getPhone());
	}

	@Test
	@DisplayName("Record 2271: Fax is 847-358-0338")
	void FaxOfRecord2271() {
		assertEquals("847-358-0338", customers.get(2270).getFax());
	}

	@Test
	@DisplayName("Record 2271: Email is jerrell@balcerzak.com")
	void EmailOfRecord2271() {
		assertEquals("jerrell@balcerzak.com", customers.get(2270).getEmail());
	}

	@Test
	@DisplayName("Record 2271: Web is http://www.jerrellbalcerzak.com")
	void WebOfRecord2271() {
		assertEquals("http://www.jerrellbalcerzak.com", customers.get(2270).getWeb());
	}
}
