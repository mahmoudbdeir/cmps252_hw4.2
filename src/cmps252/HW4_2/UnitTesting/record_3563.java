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

@Tag("16")
class Record_3563 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3563: FirstName is Alfredo")
	void FirstNameOfRecord3563() {
		assertEquals("Alfredo", customers.get(3562).getFirstName());
	}

	@Test
	@DisplayName("Record 3563: LastName is Kornblum")
	void LastNameOfRecord3563() {
		assertEquals("Kornblum", customers.get(3562).getLastName());
	}

	@Test
	@DisplayName("Record 3563: Company is Robles Bracken Coffman")
	void CompanyOfRecord3563() {
		assertEquals("Robles Bracken Coffman", customers.get(3562).getCompany());
	}

	@Test
	@DisplayName("Record 3563: Address is 7011 Fresh Pond Rd")
	void AddressOfRecord3563() {
		assertEquals("7011 Fresh Pond Rd", customers.get(3562).getAddress());
	}

	@Test
	@DisplayName("Record 3563: City is Ridgewood")
	void CityOfRecord3563() {
		assertEquals("Ridgewood", customers.get(3562).getCity());
	}

	@Test
	@DisplayName("Record 3563: County is Queens")
	void CountyOfRecord3563() {
		assertEquals("Queens", customers.get(3562).getCounty());
	}

	@Test
	@DisplayName("Record 3563: State is NY")
	void StateOfRecord3563() {
		assertEquals("NY", customers.get(3562).getState());
	}

	@Test
	@DisplayName("Record 3563: ZIP is 11385")
	void ZIPOfRecord3563() {
		assertEquals("11385", customers.get(3562).getZIP());
	}

	@Test
	@DisplayName("Record 3563: Phone is 718-366-4027")
	void PhoneOfRecord3563() {
		assertEquals("718-366-4027", customers.get(3562).getPhone());
	}

	@Test
	@DisplayName("Record 3563: Fax is 718-366-3164")
	void FaxOfRecord3563() {
		assertEquals("718-366-3164", customers.get(3562).getFax());
	}

	@Test
	@DisplayName("Record 3563: Email is alfredo@kornblum.com")
	void EmailOfRecord3563() {
		assertEquals("alfredo@kornblum.com", customers.get(3562).getEmail());
	}

	@Test
	@DisplayName("Record 3563: Web is http://www.alfredokornblum.com")
	void WebOfRecord3563() {
		assertEquals("http://www.alfredokornblum.com", customers.get(3562).getWeb());
	}
}
