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
class Record_1831 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1831: FirstName is Juliet")
	void FirstNameOfRecord1831() {
		assertEquals("Juliet", customers.get(1830).getFirstName());
	}

	@Test
	@DisplayName("Record 1831: LastName is Harrellson")
	void LastNameOfRecord1831() {
		assertEquals("Harrellson", customers.get(1830).getLastName());
	}

	@Test
	@DisplayName("Record 1831: Company is Deloitte & Touche Llp")
	void CompanyOfRecord1831() {
		assertEquals("Deloitte & Touche Llp", customers.get(1830).getCompany());
	}

	@Test
	@DisplayName("Record 1831: Address is 1170 Broadway  #-503")
	void AddressOfRecord1831() {
		assertEquals("1170 Broadway  #-503", customers.get(1830).getAddress());
	}

	@Test
	@DisplayName("Record 1831: City is New York")
	void CityOfRecord1831() {
		assertEquals("New York", customers.get(1830).getCity());
	}

	@Test
	@DisplayName("Record 1831: County is New York")
	void CountyOfRecord1831() {
		assertEquals("New York", customers.get(1830).getCounty());
	}

	@Test
	@DisplayName("Record 1831: State is NY")
	void StateOfRecord1831() {
		assertEquals("NY", customers.get(1830).getState());
	}

	@Test
	@DisplayName("Record 1831: ZIP is 10001")
	void ZIPOfRecord1831() {
		assertEquals("10001", customers.get(1830).getZIP());
	}

	@Test
	@DisplayName("Record 1831: Phone is 212-683-5602")
	void PhoneOfRecord1831() {
		assertEquals("212-683-5602", customers.get(1830).getPhone());
	}

	@Test
	@DisplayName("Record 1831: Fax is 212-683-9505")
	void FaxOfRecord1831() {
		assertEquals("212-683-9505", customers.get(1830).getFax());
	}

	@Test
	@DisplayName("Record 1831: Email is juliet@harrellson.com")
	void EmailOfRecord1831() {
		assertEquals("juliet@harrellson.com", customers.get(1830).getEmail());
	}

	@Test
	@DisplayName("Record 1831: Web is http://www.julietharrellson.com")
	void WebOfRecord1831() {
		assertEquals("http://www.julietharrellson.com", customers.get(1830).getWeb());
	}
}
