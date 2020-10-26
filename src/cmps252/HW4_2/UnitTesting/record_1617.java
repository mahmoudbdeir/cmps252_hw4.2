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

@Tag("42")
class Record_1617 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1617: FirstName is Hattie")
	void FirstNameOfRecord1617() {
		assertEquals("Hattie", customers.get(1616).getFirstName());
	}

	@Test
	@DisplayName("Record 1617: LastName is Gerwig")
	void LastNameOfRecord1617() {
		assertEquals("Gerwig", customers.get(1616).getLastName());
	}

	@Test
	@DisplayName("Record 1617: Company is Unicoa")
	void CompanyOfRecord1617() {
		assertEquals("Unicoa", customers.get(1616).getCompany());
	}

	@Test
	@DisplayName("Record 1617: Address is 206 Talmadge Rd")
	void AddressOfRecord1617() {
		assertEquals("206 Talmadge Rd", customers.get(1616).getAddress());
	}

	@Test
	@DisplayName("Record 1617: City is Edison")
	void CityOfRecord1617() {
		assertEquals("Edison", customers.get(1616).getCity());
	}

	@Test
	@DisplayName("Record 1617: County is Middlesex")
	void CountyOfRecord1617() {
		assertEquals("Middlesex", customers.get(1616).getCounty());
	}

	@Test
	@DisplayName("Record 1617: State is NJ")
	void StateOfRecord1617() {
		assertEquals("NJ", customers.get(1616).getState());
	}

	@Test
	@DisplayName("Record 1617: ZIP is 8817")
	void ZIPOfRecord1617() {
		assertEquals("8817", customers.get(1616).getZIP());
	}

	@Test
	@DisplayName("Record 1617: Phone is 732-248-0162")
	void PhoneOfRecord1617() {
		assertEquals("732-248-0162", customers.get(1616).getPhone());
	}

	@Test
	@DisplayName("Record 1617: Fax is 732-248-3121")
	void FaxOfRecord1617() {
		assertEquals("732-248-3121", customers.get(1616).getFax());
	}

	@Test
	@DisplayName("Record 1617: Email is hattie@gerwig.com")
	void EmailOfRecord1617() {
		assertEquals("hattie@gerwig.com", customers.get(1616).getEmail());
	}

	@Test
	@DisplayName("Record 1617: Web is http://www.hattiegerwig.com")
	void WebOfRecord1617() {
		assertEquals("http://www.hattiegerwig.com", customers.get(1616).getWeb());
	}
}
