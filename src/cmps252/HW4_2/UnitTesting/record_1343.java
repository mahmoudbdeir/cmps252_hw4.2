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

@Tag("19")
class Record_1343 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1343: FirstName is Morton")
	void FirstNameOfRecord1343() {
		assertEquals("Morton", customers.get(1342).getFirstName());
	}

	@Test
	@DisplayName("Record 1343: LastName is Arcos")
	void LastNameOfRecord1343() {
		assertEquals("Arcos", customers.get(1342).getLastName());
	}

	@Test
	@DisplayName("Record 1343: Company is Hugo Gorecki Insurance")
	void CompanyOfRecord1343() {
		assertEquals("Hugo Gorecki Insurance", customers.get(1342).getCompany());
	}

	@Test
	@DisplayName("Record 1343: Address is 8225 Lyndon St")
	void AddressOfRecord1343() {
		assertEquals("8225 Lyndon St", customers.get(1342).getAddress());
	}

	@Test
	@DisplayName("Record 1343: City is Detroit")
	void CityOfRecord1343() {
		assertEquals("Detroit", customers.get(1342).getCity());
	}

	@Test
	@DisplayName("Record 1343: County is Wayne")
	void CountyOfRecord1343() {
		assertEquals("Wayne", customers.get(1342).getCounty());
	}

	@Test
	@DisplayName("Record 1343: State is MI")
	void StateOfRecord1343() {
		assertEquals("MI", customers.get(1342).getState());
	}

	@Test
	@DisplayName("Record 1343: ZIP is 48238")
	void ZIPOfRecord1343() {
		assertEquals("48238", customers.get(1342).getZIP());
	}

	@Test
	@DisplayName("Record 1343: Phone is 313-931-0734")
	void PhoneOfRecord1343() {
		assertEquals("313-931-0734", customers.get(1342).getPhone());
	}

	@Test
	@DisplayName("Record 1343: Fax is 313-931-3509")
	void FaxOfRecord1343() {
		assertEquals("313-931-3509", customers.get(1342).getFax());
	}

	@Test
	@DisplayName("Record 1343: Email is morton@arcos.com")
	void EmailOfRecord1343() {
		assertEquals("morton@arcos.com", customers.get(1342).getEmail());
	}

	@Test
	@DisplayName("Record 1343: Web is http://www.mortonarcos.com")
	void WebOfRecord1343() {
		assertEquals("http://www.mortonarcos.com", customers.get(1342).getWeb());
	}
}
