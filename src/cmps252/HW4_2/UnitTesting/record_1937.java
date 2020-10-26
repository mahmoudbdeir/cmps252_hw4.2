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
class Record_1937 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1937: FirstName is Tyree")
	void FirstNameOfRecord1937() {
		assertEquals("Tyree", customers.get(1936).getFirstName());
	}

	@Test
	@DisplayName("Record 1937: LastName is Elbertson")
	void LastNameOfRecord1937() {
		assertEquals("Elbertson", customers.get(1936).getLastName());
	}

	@Test
	@DisplayName("Record 1937: Company is Jiffi Print")
	void CompanyOfRecord1937() {
		assertEquals("Jiffi Print", customers.get(1936).getCompany());
	}

	@Test
	@DisplayName("Record 1937: Address is 71 5th Ave")
	void AddressOfRecord1937() {
		assertEquals("71 5th Ave", customers.get(1936).getAddress());
	}

	@Test
	@DisplayName("Record 1937: City is New York")
	void CityOfRecord1937() {
		assertEquals("New York", customers.get(1936).getCity());
	}

	@Test
	@DisplayName("Record 1937: County is New York")
	void CountyOfRecord1937() {
		assertEquals("New York", customers.get(1936).getCounty());
	}

	@Test
	@DisplayName("Record 1937: State is NY")
	void StateOfRecord1937() {
		assertEquals("NY", customers.get(1936).getState());
	}

	@Test
	@DisplayName("Record 1937: ZIP is 10003")
	void ZIPOfRecord1937() {
		assertEquals("10003", customers.get(1936).getZIP());
	}

	@Test
	@DisplayName("Record 1937: Phone is 212-807-2231")
	void PhoneOfRecord1937() {
		assertEquals("212-807-2231", customers.get(1936).getPhone());
	}

	@Test
	@DisplayName("Record 1937: Fax is 212-807-3579")
	void FaxOfRecord1937() {
		assertEquals("212-807-3579", customers.get(1936).getFax());
	}

	@Test
	@DisplayName("Record 1937: Email is tyree@elbertson.com")
	void EmailOfRecord1937() {
		assertEquals("tyree@elbertson.com", customers.get(1936).getEmail());
	}

	@Test
	@DisplayName("Record 1937: Web is http://www.tyreeelbertson.com")
	void WebOfRecord1937() {
		assertEquals("http://www.tyreeelbertson.com", customers.get(1936).getWeb());
	}
}
