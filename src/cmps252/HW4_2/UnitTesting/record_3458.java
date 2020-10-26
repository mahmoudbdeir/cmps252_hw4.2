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

@Tag("20")
class Record_3458 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3458: FirstName is Mary")
	void FirstNameOfRecord3458() {
		assertEquals("Mary", customers.get(3457).getFirstName());
	}

	@Test
	@DisplayName("Record 3458: LastName is Rosu")
	void LastNameOfRecord3458() {
		assertEquals("Rosu", customers.get(3457).getLastName());
	}

	@Test
	@DisplayName("Record 3458: Company is G & S Boats")
	void CompanyOfRecord3458() {
		assertEquals("G & S Boats", customers.get(3457).getCompany());
	}

	@Test
	@DisplayName("Record 3458: Address is 1 Justice Sq")
	void AddressOfRecord3458() {
		assertEquals("1 Justice Sq", customers.get(3457).getAddress());
	}

	@Test
	@DisplayName("Record 3458: City is Rutland")
	void CityOfRecord3458() {
		assertEquals("Rutland", customers.get(3457).getCity());
	}

	@Test
	@DisplayName("Record 3458: County is Rutland")
	void CountyOfRecord3458() {
		assertEquals("Rutland", customers.get(3457).getCounty());
	}

	@Test
	@DisplayName("Record 3458: State is VT")
	void StateOfRecord3458() {
		assertEquals("VT", customers.get(3457).getState());
	}

	@Test
	@DisplayName("Record 3458: ZIP is 5701")
	void ZIPOfRecord3458() {
		assertEquals("5701", customers.get(3457).getZIP());
	}

	@Test
	@DisplayName("Record 3458: Phone is 802-775-2109")
	void PhoneOfRecord3458() {
		assertEquals("802-775-2109", customers.get(3457).getPhone());
	}

	@Test
	@DisplayName("Record 3458: Fax is 802-775-1255")
	void FaxOfRecord3458() {
		assertEquals("802-775-1255", customers.get(3457).getFax());
	}

	@Test
	@DisplayName("Record 3458: Email is mary@rosu.com")
	void EmailOfRecord3458() {
		assertEquals("mary@rosu.com", customers.get(3457).getEmail());
	}

	@Test
	@DisplayName("Record 3458: Web is http://www.maryrosu.com")
	void WebOfRecord3458() {
		assertEquals("http://www.maryrosu.com", customers.get(3457).getWeb());
	}
}
