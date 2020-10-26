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

@Tag("47")
class Record_2705 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2705: FirstName is Dyrdre")
	void FirstNameOfRecord2705() {
		assertEquals("Dyrdre", customers.get(2704).getFirstName());
	}

	@Test
	@DisplayName("Record 2705: LastName is Thorell")
	void LastNameOfRecord2705() {
		assertEquals("Thorell", customers.get(2704).getLastName());
	}

	@Test
	@DisplayName("Record 2705: Company is Foster Clark & Sims Realty Inc")
	void CompanyOfRecord2705() {
		assertEquals("Foster Clark & Sims Realty Inc", customers.get(2704).getCompany());
	}

	@Test
	@DisplayName("Record 2705: Address is 1 Executive Blvd")
	void AddressOfRecord2705() {
		assertEquals("1 Executive Blvd", customers.get(2704).getAddress());
	}

	@Test
	@DisplayName("Record 2705: City is Yonkers")
	void CityOfRecord2705() {
		assertEquals("Yonkers", customers.get(2704).getCity());
	}

	@Test
	@DisplayName("Record 2705: County is Westchester")
	void CountyOfRecord2705() {
		assertEquals("Westchester", customers.get(2704).getCounty());
	}

	@Test
	@DisplayName("Record 2705: State is NY")
	void StateOfRecord2705() {
		assertEquals("NY", customers.get(2704).getState());
	}

	@Test
	@DisplayName("Record 2705: ZIP is 10701")
	void ZIPOfRecord2705() {
		assertEquals("10701", customers.get(2704).getZIP());
	}

	@Test
	@DisplayName("Record 2705: Phone is 914-965-2283")
	void PhoneOfRecord2705() {
		assertEquals("914-965-2283", customers.get(2704).getPhone());
	}

	@Test
	@DisplayName("Record 2705: Fax is 914-965-6606")
	void FaxOfRecord2705() {
		assertEquals("914-965-6606", customers.get(2704).getFax());
	}

	@Test
	@DisplayName("Record 2705: Email is dyrdre@thorell.com")
	void EmailOfRecord2705() {
		assertEquals("dyrdre@thorell.com", customers.get(2704).getEmail());
	}

	@Test
	@DisplayName("Record 2705: Web is http://www.dyrdrethorell.com")
	void WebOfRecord2705() {
		assertEquals("http://www.dyrdrethorell.com", customers.get(2704).getWeb());
	}
}
