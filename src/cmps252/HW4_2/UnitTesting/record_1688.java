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
class Record_1688 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1688: FirstName is Rhoda")
	void FirstNameOfRecord1688() {
		assertEquals("Rhoda", customers.get(1687).getFirstName());
	}

	@Test
	@DisplayName("Record 1688: LastName is Alwang")
	void LastNameOfRecord1688() {
		assertEquals("Alwang", customers.get(1687).getLastName());
	}

	@Test
	@DisplayName("Record 1688: Company is Vogelin Optical Company")
	void CompanyOfRecord1688() {
		assertEquals("Vogelin Optical Company", customers.get(1687).getCompany());
	}

	@Test
	@DisplayName("Record 1688: Address is 9888 Reading Rd")
	void AddressOfRecord1688() {
		assertEquals("9888 Reading Rd", customers.get(1687).getAddress());
	}

	@Test
	@DisplayName("Record 1688: City is Cincinnati")
	void CityOfRecord1688() {
		assertEquals("Cincinnati", customers.get(1687).getCity());
	}

	@Test
	@DisplayName("Record 1688: County is Hamilton")
	void CountyOfRecord1688() {
		assertEquals("Hamilton", customers.get(1687).getCounty());
	}

	@Test
	@DisplayName("Record 1688: State is OH")
	void StateOfRecord1688() {
		assertEquals("OH", customers.get(1687).getState());
	}

	@Test
	@DisplayName("Record 1688: ZIP is 45241")
	void ZIPOfRecord1688() {
		assertEquals("45241", customers.get(1687).getZIP());
	}

	@Test
	@DisplayName("Record 1688: Phone is 513-733-9342")
	void PhoneOfRecord1688() {
		assertEquals("513-733-9342", customers.get(1687).getPhone());
	}

	@Test
	@DisplayName("Record 1688: Fax is 513-733-5773")
	void FaxOfRecord1688() {
		assertEquals("513-733-5773", customers.get(1687).getFax());
	}

	@Test
	@DisplayName("Record 1688: Email is rhoda@alwang.com")
	void EmailOfRecord1688() {
		assertEquals("rhoda@alwang.com", customers.get(1687).getEmail());
	}

	@Test
	@DisplayName("Record 1688: Web is http://www.rhodaalwang.com")
	void WebOfRecord1688() {
		assertEquals("http://www.rhodaalwang.com", customers.get(1687).getWeb());
	}
}
