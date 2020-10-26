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

@Tag("2")
class Record_2165 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2165: FirstName is Kenneth")
	void FirstNameOfRecord2165() {
		assertEquals("Kenneth", customers.get(2164).getFirstName());
	}

	@Test
	@DisplayName("Record 2165: LastName is Laitinen")
	void LastNameOfRecord2165() {
		assertEquals("Laitinen", customers.get(2164).getLastName());
	}

	@Test
	@DisplayName("Record 2165: Company is Holland & Hart")
	void CompanyOfRecord2165() {
		assertEquals("Holland & Hart", customers.get(2164).getCompany());
	}

	@Test
	@DisplayName("Record 2165: Address is 131 Nassau St")
	void AddressOfRecord2165() {
		assertEquals("131 Nassau St", customers.get(2164).getAddress());
	}

	@Test
	@DisplayName("Record 2165: City is New York")
	void CityOfRecord2165() {
		assertEquals("New York", customers.get(2164).getCity());
	}

	@Test
	@DisplayName("Record 2165: County is New York")
	void CountyOfRecord2165() {
		assertEquals("New York", customers.get(2164).getCounty());
	}

	@Test
	@DisplayName("Record 2165: State is NY")
	void StateOfRecord2165() {
		assertEquals("NY", customers.get(2164).getState());
	}

	@Test
	@DisplayName("Record 2165: ZIP is 10038")
	void ZIPOfRecord2165() {
		assertEquals("10038", customers.get(2164).getZIP());
	}

	@Test
	@DisplayName("Record 2165: Phone is 212-964-2746")
	void PhoneOfRecord2165() {
		assertEquals("212-964-2746", customers.get(2164).getPhone());
	}

	@Test
	@DisplayName("Record 2165: Fax is 212-964-7015")
	void FaxOfRecord2165() {
		assertEquals("212-964-7015", customers.get(2164).getFax());
	}

	@Test
	@DisplayName("Record 2165: Email is kenneth@laitinen.com")
	void EmailOfRecord2165() {
		assertEquals("kenneth@laitinen.com", customers.get(2164).getEmail());
	}

	@Test
	@DisplayName("Record 2165: Web is http://www.kennethlaitinen.com")
	void WebOfRecord2165() {
		assertEquals("http://www.kennethlaitinen.com", customers.get(2164).getWeb());
	}
}
