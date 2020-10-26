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

@Tag("12")
class Record_3219 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3219: FirstName is Cody")
	void FirstNameOfRecord3219() {
		assertEquals("Cody", customers.get(3218).getFirstName());
	}

	@Test
	@DisplayName("Record 3219: LastName is Thibodeau")
	void LastNameOfRecord3219() {
		assertEquals("Thibodeau", customers.get(3218).getLastName());
	}

	@Test
	@DisplayName("Record 3219: Company is Geogan & Geogan Pc")
	void CompanyOfRecord3219() {
		assertEquals("Geogan & Geogan Pc", customers.get(3218).getCompany());
	}

	@Test
	@DisplayName("Record 3219: Address is 909 Grant Ave")
	void AddressOfRecord3219() {
		assertEquals("909 Grant Ave", customers.get(3218).getAddress());
	}

	@Test
	@DisplayName("Record 3219: City is Fort Wayne")
	void CityOfRecord3219() {
		assertEquals("Fort Wayne", customers.get(3218).getCity());
	}

	@Test
	@DisplayName("Record 3219: County is Allen")
	void CountyOfRecord3219() {
		assertEquals("Allen", customers.get(3218).getCounty());
	}

	@Test
	@DisplayName("Record 3219: State is IN")
	void StateOfRecord3219() {
		assertEquals("IN", customers.get(3218).getState());
	}

	@Test
	@DisplayName("Record 3219: ZIP is 46803")
	void ZIPOfRecord3219() {
		assertEquals("46803", customers.get(3218).getZIP());
	}

	@Test
	@DisplayName("Record 3219: Phone is 260-422-9172")
	void PhoneOfRecord3219() {
		assertEquals("260-422-9172", customers.get(3218).getPhone());
	}

	@Test
	@DisplayName("Record 3219: Fax is 260-422-0127")
	void FaxOfRecord3219() {
		assertEquals("260-422-0127", customers.get(3218).getFax());
	}

	@Test
	@DisplayName("Record 3219: Email is cody@thibodeau.com")
	void EmailOfRecord3219() {
		assertEquals("cody@thibodeau.com", customers.get(3218).getEmail());
	}

	@Test
	@DisplayName("Record 3219: Web is http://www.codythibodeau.com")
	void WebOfRecord3219() {
		assertEquals("http://www.codythibodeau.com", customers.get(3218).getWeb());
	}
}
