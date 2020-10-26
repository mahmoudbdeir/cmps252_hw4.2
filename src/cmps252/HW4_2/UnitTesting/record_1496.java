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
class Record_1496 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1496: FirstName is Roseann")
	void FirstNameOfRecord1496() {
		assertEquals("Roseann", customers.get(1495).getFirstName());
	}

	@Test
	@DisplayName("Record 1496: LastName is Koeneman")
	void LastNameOfRecord1496() {
		assertEquals("Koeneman", customers.get(1495).getLastName());
	}

	@Test
	@DisplayName("Record 1496: Company is Brands Cycle & Fitness Center")
	void CompanyOfRecord1496() {
		assertEquals("Brands Cycle & Fitness Center", customers.get(1495).getCompany());
	}

	@Test
	@DisplayName("Record 1496: Address is 43 Elm St")
	void AddressOfRecord1496() {
		assertEquals("43 Elm St", customers.get(1495).getAddress());
	}

	@Test
	@DisplayName("Record 1496: City is New Haven")
	void CityOfRecord1496() {
		assertEquals("New Haven", customers.get(1495).getCity());
	}

	@Test
	@DisplayName("Record 1496: County is New Haven")
	void CountyOfRecord1496() {
		assertEquals("New Haven", customers.get(1495).getCounty());
	}

	@Test
	@DisplayName("Record 1496: State is CT")
	void StateOfRecord1496() {
		assertEquals("CT", customers.get(1495).getState());
	}

	@Test
	@DisplayName("Record 1496: ZIP is 6510")
	void ZIPOfRecord1496() {
		assertEquals("6510", customers.get(1495).getZIP());
	}

	@Test
	@DisplayName("Record 1496: Phone is 203-777-4692")
	void PhoneOfRecord1496() {
		assertEquals("203-777-4692", customers.get(1495).getPhone());
	}

	@Test
	@DisplayName("Record 1496: Fax is 203-777-6717")
	void FaxOfRecord1496() {
		assertEquals("203-777-6717", customers.get(1495).getFax());
	}

	@Test
	@DisplayName("Record 1496: Email is roseann@koeneman.com")
	void EmailOfRecord1496() {
		assertEquals("roseann@koeneman.com", customers.get(1495).getEmail());
	}

	@Test
	@DisplayName("Record 1496: Web is http://www.roseannkoeneman.com")
	void WebOfRecord1496() {
		assertEquals("http://www.roseannkoeneman.com", customers.get(1495).getWeb());
	}
}
