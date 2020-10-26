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

@Tag("36")
class Record_1756 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1756: FirstName is Audrey")
	void FirstNameOfRecord1756() {
		assertEquals("Audrey", customers.get(1755).getFirstName());
	}

	@Test
	@DisplayName("Record 1756: LastName is Loveless")
	void LastNameOfRecord1756() {
		assertEquals("Loveless", customers.get(1755).getLastName());
	}

	@Test
	@DisplayName("Record 1756: Company is Warshauer Electric Supply Co")
	void CompanyOfRecord1756() {
		assertEquals("Warshauer Electric Supply Co", customers.get(1755).getCompany());
	}

	@Test
	@DisplayName("Record 1756: Address is 1 W Main St")
	void AddressOfRecord1756() {
		assertEquals("1 W Main St", customers.get(1755).getAddress());
	}

	@Test
	@DisplayName("Record 1756: City is Marlton")
	void CityOfRecord1756() {
		assertEquals("Marlton", customers.get(1755).getCity());
	}

	@Test
	@DisplayName("Record 1756: County is Burlington")
	void CountyOfRecord1756() {
		assertEquals("Burlington", customers.get(1755).getCounty());
	}

	@Test
	@DisplayName("Record 1756: State is NJ")
	void StateOfRecord1756() {
		assertEquals("NJ", customers.get(1755).getState());
	}

	@Test
	@DisplayName("Record 1756: ZIP is 8053")
	void ZIPOfRecord1756() {
		assertEquals("8053", customers.get(1755).getZIP());
	}

	@Test
	@DisplayName("Record 1756: Phone is 856-596-7509")
	void PhoneOfRecord1756() {
		assertEquals("856-596-7509", customers.get(1755).getPhone());
	}

	@Test
	@DisplayName("Record 1756: Fax is 856-596-7259")
	void FaxOfRecord1756() {
		assertEquals("856-596-7259", customers.get(1755).getFax());
	}

	@Test
	@DisplayName("Record 1756: Email is audrey@loveless.com")
	void EmailOfRecord1756() {
		assertEquals("audrey@loveless.com", customers.get(1755).getEmail());
	}

	@Test
	@DisplayName("Record 1756: Web is http://www.audreyloveless.com")
	void WebOfRecord1756() {
		assertEquals("http://www.audreyloveless.com", customers.get(1755).getWeb());
	}
}
