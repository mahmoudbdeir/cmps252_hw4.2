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

@Tag("29")
class Record_3621 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3621: FirstName is Cruz")
	void FirstNameOfRecord3621() {
		assertEquals("Cruz", customers.get(3620).getFirstName());
	}

	@Test
	@DisplayName("Record 3621: LastName is Pinch")
	void LastNameOfRecord3621() {
		assertEquals("Pinch", customers.get(3620).getLastName());
	}

	@Test
	@DisplayName("Record 3621: Company is Caldwells Office Products")
	void CompanyOfRecord3621() {
		assertEquals("Caldwells Office Products", customers.get(3620).getCompany());
	}

	@Test
	@DisplayName("Record 3621: Address is 1950 Market St")
	void AddressOfRecord3621() {
		assertEquals("1950 Market St", customers.get(3620).getAddress());
	}

	@Test
	@DisplayName("Record 3621: City is Riverside")
	void CityOfRecord3621() {
		assertEquals("Riverside", customers.get(3620).getCity());
	}

	@Test
	@DisplayName("Record 3621: County is Riverside")
	void CountyOfRecord3621() {
		assertEquals("Riverside", customers.get(3620).getCounty());
	}

	@Test
	@DisplayName("Record 3621: State is CA")
	void StateOfRecord3621() {
		assertEquals("CA", customers.get(3620).getState());
	}

	@Test
	@DisplayName("Record 3621: ZIP is 92501")
	void ZIPOfRecord3621() {
		assertEquals("92501", customers.get(3620).getZIP());
	}

	@Test
	@DisplayName("Record 3621: Phone is 951-684-4610")
	void PhoneOfRecord3621() {
		assertEquals("951-684-4610", customers.get(3620).getPhone());
	}

	@Test
	@DisplayName("Record 3621: Fax is 951-684-1161")
	void FaxOfRecord3621() {
		assertEquals("951-684-1161", customers.get(3620).getFax());
	}

	@Test
	@DisplayName("Record 3621: Email is cruz@pinch.com")
	void EmailOfRecord3621() {
		assertEquals("cruz@pinch.com", customers.get(3620).getEmail());
	}

	@Test
	@DisplayName("Record 3621: Web is http://www.cruzpinch.com")
	void WebOfRecord3621() {
		assertEquals("http://www.cruzpinch.com", customers.get(3620).getWeb());
	}
}
