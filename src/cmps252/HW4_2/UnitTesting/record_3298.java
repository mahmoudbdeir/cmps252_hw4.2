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

@Tag("25")
class Record_3298 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3298: FirstName is Sherrie")
	void FirstNameOfRecord3298() {
		assertEquals("Sherrie", customers.get(3297).getFirstName());
	}

	@Test
	@DisplayName("Record 3298: LastName is Loughman")
	void LastNameOfRecord3298() {
		assertEquals("Loughman", customers.get(3297).getLastName());
	}

	@Test
	@DisplayName("Record 3298: Company is Grand Rapids Education Assn")
	void CompanyOfRecord3298() {
		assertEquals("Grand Rapids Education Assn", customers.get(3297).getCompany());
	}

	@Test
	@DisplayName("Record 3298: Address is 909 Abbott Dr")
	void AddressOfRecord3298() {
		assertEquals("909 Abbott Dr", customers.get(3297).getAddress());
	}

	@Test
	@DisplayName("Record 3298: City is Omaha")
	void CityOfRecord3298() {
		assertEquals("Omaha", customers.get(3297).getCity());
	}

	@Test
	@DisplayName("Record 3298: County is Douglas")
	void CountyOfRecord3298() {
		assertEquals("Douglas", customers.get(3297).getCounty());
	}

	@Test
	@DisplayName("Record 3298: State is NE")
	void StateOfRecord3298() {
		assertEquals("NE", customers.get(3297).getState());
	}

	@Test
	@DisplayName("Record 3298: ZIP is 68102")
	void ZIPOfRecord3298() {
		assertEquals("68102", customers.get(3297).getZIP());
	}

	@Test
	@DisplayName("Record 3298: Phone is 402-342-2599")
	void PhoneOfRecord3298() {
		assertEquals("402-342-2599", customers.get(3297).getPhone());
	}

	@Test
	@DisplayName("Record 3298: Fax is 402-342-8197")
	void FaxOfRecord3298() {
		assertEquals("402-342-8197", customers.get(3297).getFax());
	}

	@Test
	@DisplayName("Record 3298: Email is sherrie@loughman.com")
	void EmailOfRecord3298() {
		assertEquals("sherrie@loughman.com", customers.get(3297).getEmail());
	}

	@Test
	@DisplayName("Record 3298: Web is http://www.sherrieloughman.com")
	void WebOfRecord3298() {
		assertEquals("http://www.sherrieloughman.com", customers.get(3297).getWeb());
	}
}
