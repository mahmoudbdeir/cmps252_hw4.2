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

@Tag("11")
class Record_1767 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1767: FirstName is Angelo")
	void FirstNameOfRecord1767() {
		assertEquals("Angelo", customers.get(1766).getFirstName());
	}

	@Test
	@DisplayName("Record 1767: LastName is Lebeouf")
	void LastNameOfRecord1767() {
		assertEquals("Lebeouf", customers.get(1766).getLastName());
	}

	@Test
	@DisplayName("Record 1767: Company is Best Tile Dstrbtrs Of Syracuse")
	void CompanyOfRecord1767() {
		assertEquals("Best Tile Dstrbtrs Of Syracuse", customers.get(1766).getCompany());
	}

	@Test
	@DisplayName("Record 1767: Address is 1708 N Michigan Ave")
	void AddressOfRecord1767() {
		assertEquals("1708 N Michigan Ave", customers.get(1766).getAddress());
	}

	@Test
	@DisplayName("Record 1767: City is Saginaw")
	void CityOfRecord1767() {
		assertEquals("Saginaw", customers.get(1766).getCity());
	}

	@Test
	@DisplayName("Record 1767: County is Saginaw")
	void CountyOfRecord1767() {
		assertEquals("Saginaw", customers.get(1766).getCounty());
	}

	@Test
	@DisplayName("Record 1767: State is MI")
	void StateOfRecord1767() {
		assertEquals("MI", customers.get(1766).getState());
	}

	@Test
	@DisplayName("Record 1767: ZIP is 48602")
	void ZIPOfRecord1767() {
		assertEquals("48602", customers.get(1766).getZIP());
	}

	@Test
	@DisplayName("Record 1767: Phone is 989-752-4555")
	void PhoneOfRecord1767() {
		assertEquals("989-752-4555", customers.get(1766).getPhone());
	}

	@Test
	@DisplayName("Record 1767: Fax is 989-752-7274")
	void FaxOfRecord1767() {
		assertEquals("989-752-7274", customers.get(1766).getFax());
	}

	@Test
	@DisplayName("Record 1767: Email is angelo@lebeouf.com")
	void EmailOfRecord1767() {
		assertEquals("angelo@lebeouf.com", customers.get(1766).getEmail());
	}

	@Test
	@DisplayName("Record 1767: Web is http://www.angelolebeouf.com")
	void WebOfRecord1767() {
		assertEquals("http://www.angelolebeouf.com", customers.get(1766).getWeb());
	}
}
