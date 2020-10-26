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
class Record_1499 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1499: FirstName is Nestor")
	void FirstNameOfRecord1499() {
		assertEquals("Nestor", customers.get(1498).getFirstName());
	}

	@Test
	@DisplayName("Record 1499: LastName is Henrichsen")
	void LastNameOfRecord1499() {
		assertEquals("Henrichsen", customers.get(1498).getLastName());
	}

	@Test
	@DisplayName("Record 1499: Company is Kearneys Metals Inc")
	void CompanyOfRecord1499() {
		assertEquals("Kearneys Metals Inc", customers.get(1498).getCompany());
	}

	@Test
	@DisplayName("Record 1499: Address is 4831 Van Dam St")
	void AddressOfRecord1499() {
		assertEquals("4831 Van Dam St", customers.get(1498).getAddress());
	}

	@Test
	@DisplayName("Record 1499: City is Long Island City")
	void CityOfRecord1499() {
		assertEquals("Long Island City", customers.get(1498).getCity());
	}

	@Test
	@DisplayName("Record 1499: County is Queens")
	void CountyOfRecord1499() {
		assertEquals("Queens", customers.get(1498).getCounty());
	}

	@Test
	@DisplayName("Record 1499: State is NY")
	void StateOfRecord1499() {
		assertEquals("NY", customers.get(1498).getState());
	}

	@Test
	@DisplayName("Record 1499: ZIP is 11101")
	void ZIPOfRecord1499() {
		assertEquals("11101", customers.get(1498).getZIP());
	}

	@Test
	@DisplayName("Record 1499: Phone is 718-392-0300")
	void PhoneOfRecord1499() {
		assertEquals("718-392-0300", customers.get(1498).getPhone());
	}

	@Test
	@DisplayName("Record 1499: Fax is 718-392-4104")
	void FaxOfRecord1499() {
		assertEquals("718-392-4104", customers.get(1498).getFax());
	}

	@Test
	@DisplayName("Record 1499: Email is nestor@henrichsen.com")
	void EmailOfRecord1499() {
		assertEquals("nestor@henrichsen.com", customers.get(1498).getEmail());
	}

	@Test
	@DisplayName("Record 1499: Web is http://www.nestorhenrichsen.com")
	void WebOfRecord1499() {
		assertEquals("http://www.nestorhenrichsen.com", customers.get(1498).getWeb());
	}
}
