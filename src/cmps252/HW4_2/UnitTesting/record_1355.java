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

@Tag("18")
class Record_1355 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1355: FirstName is Brandy")
	void FirstNameOfRecord1355() {
		assertEquals("Brandy", customers.get(1354).getFirstName());
	}

	@Test
	@DisplayName("Record 1355: LastName is Toni")
	void LastNameOfRecord1355() {
		assertEquals("Toni", customers.get(1354).getLastName());
	}

	@Test
	@DisplayName("Record 1355: Company is Modern Supply Co Inc")
	void CompanyOfRecord1355() {
		assertEquals("Modern Supply Co Inc", customers.get(1354).getCompany());
	}

	@Test
	@DisplayName("Record 1355: Address is 8 S Hanover Ave")
	void AddressOfRecord1355() {
		assertEquals("8 S Hanover Ave", customers.get(1354).getAddress());
	}

	@Test
	@DisplayName("Record 1355: City is Margate City")
	void CityOfRecord1355() {
		assertEquals("Margate City", customers.get(1354).getCity());
	}

	@Test
	@DisplayName("Record 1355: County is Atlantic")
	void CountyOfRecord1355() {
		assertEquals("Atlantic", customers.get(1354).getCounty());
	}

	@Test
	@DisplayName("Record 1355: State is NJ")
	void StateOfRecord1355() {
		assertEquals("NJ", customers.get(1354).getState());
	}

	@Test
	@DisplayName("Record 1355: ZIP is 8402")
	void ZIPOfRecord1355() {
		assertEquals("8402", customers.get(1354).getZIP());
	}

	@Test
	@DisplayName("Record 1355: Phone is 609-823-0048")
	void PhoneOfRecord1355() {
		assertEquals("609-823-0048", customers.get(1354).getPhone());
	}

	@Test
	@DisplayName("Record 1355: Fax is 609-823-0709")
	void FaxOfRecord1355() {
		assertEquals("609-823-0709", customers.get(1354).getFax());
	}

	@Test
	@DisplayName("Record 1355: Email is brandy@toni.com")
	void EmailOfRecord1355() {
		assertEquals("brandy@toni.com", customers.get(1354).getEmail());
	}

	@Test
	@DisplayName("Record 1355: Web is http://www.brandytoni.com")
	void WebOfRecord1355() {
		assertEquals("http://www.brandytoni.com", customers.get(1354).getWeb());
	}
}
