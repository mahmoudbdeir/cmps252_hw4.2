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

@Tag("39")
class Record_4651 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4651: FirstName is Nancy")
	void FirstNameOfRecord4651() {
		assertEquals("Nancy", customers.get(4650).getFirstName());
	}

	@Test
	@DisplayName("Record 4651: LastName is Paonessa")
	void LastNameOfRecord4651() {
		assertEquals("Paonessa", customers.get(4650).getLastName());
	}

	@Test
	@DisplayName("Record 4651: Company is Universal Tool Co")
	void CompanyOfRecord4651() {
		assertEquals("Universal Tool Co", customers.get(4650).getCompany());
	}

	@Test
	@DisplayName("Record 4651: Address is 25300 Groesbeck Hwy")
	void AddressOfRecord4651() {
		assertEquals("25300 Groesbeck Hwy", customers.get(4650).getAddress());
	}

	@Test
	@DisplayName("Record 4651: City is Warren")
	void CityOfRecord4651() {
		assertEquals("Warren", customers.get(4650).getCity());
	}

	@Test
	@DisplayName("Record 4651: County is Macomb")
	void CountyOfRecord4651() {
		assertEquals("Macomb", customers.get(4650).getCounty());
	}

	@Test
	@DisplayName("Record 4651: State is MI")
	void StateOfRecord4651() {
		assertEquals("MI", customers.get(4650).getState());
	}

	@Test
	@DisplayName("Record 4651: ZIP is 48089")
	void ZIPOfRecord4651() {
		assertEquals("48089", customers.get(4650).getZIP());
	}

	@Test
	@DisplayName("Record 4651: Phone is 586-777-1591")
	void PhoneOfRecord4651() {
		assertEquals("586-777-1591", customers.get(4650).getPhone());
	}

	@Test
	@DisplayName("Record 4651: Fax is 586-777-2191")
	void FaxOfRecord4651() {
		assertEquals("586-777-2191", customers.get(4650).getFax());
	}

	@Test
	@DisplayName("Record 4651: Email is nancy@paonessa.com")
	void EmailOfRecord4651() {
		assertEquals("nancy@paonessa.com", customers.get(4650).getEmail());
	}

	@Test
	@DisplayName("Record 4651: Web is http://www.nancypaonessa.com")
	void WebOfRecord4651() {
		assertEquals("http://www.nancypaonessa.com", customers.get(4650).getWeb());
	}
}
