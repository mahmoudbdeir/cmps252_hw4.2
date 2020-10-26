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

@Tag("35")
class Record_2650 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2650: FirstName is Deena")
	void FirstNameOfRecord2650() {
		assertEquals("Deena", customers.get(2649).getFirstName());
	}

	@Test
	@DisplayName("Record 2650: LastName is Mathies")
	void LastNameOfRecord2650() {
		assertEquals("Mathies", customers.get(2649).getLastName());
	}

	@Test
	@DisplayName("Record 2650: Company is Dorsey & Whitney")
	void CompanyOfRecord2650() {
		assertEquals("Dorsey & Whitney", customers.get(2649).getCompany());
	}

	@Test
	@DisplayName("Record 2650: Address is 2275 Murfreesboro Pike")
	void AddressOfRecord2650() {
		assertEquals("2275 Murfreesboro Pike", customers.get(2649).getAddress());
	}

	@Test
	@DisplayName("Record 2650: City is Nashville")
	void CityOfRecord2650() {
		assertEquals("Nashville", customers.get(2649).getCity());
	}

	@Test
	@DisplayName("Record 2650: County is Davidson")
	void CountyOfRecord2650() {
		assertEquals("Davidson", customers.get(2649).getCounty());
	}

	@Test
	@DisplayName("Record 2650: State is TN")
	void StateOfRecord2650() {
		assertEquals("TN", customers.get(2649).getState());
	}

	@Test
	@DisplayName("Record 2650: ZIP is 37217")
	void ZIPOfRecord2650() {
		assertEquals("37217", customers.get(2649).getZIP());
	}

	@Test
	@DisplayName("Record 2650: Phone is 615-367-5247")
	void PhoneOfRecord2650() {
		assertEquals("615-367-5247", customers.get(2649).getPhone());
	}

	@Test
	@DisplayName("Record 2650: Fax is 615-367-4378")
	void FaxOfRecord2650() {
		assertEquals("615-367-4378", customers.get(2649).getFax());
	}

	@Test
	@DisplayName("Record 2650: Email is deena@mathies.com")
	void EmailOfRecord2650() {
		assertEquals("deena@mathies.com", customers.get(2649).getEmail());
	}

	@Test
	@DisplayName("Record 2650: Web is http://www.deenamathies.com")
	void WebOfRecord2650() {
		assertEquals("http://www.deenamathies.com", customers.get(2649).getWeb());
	}
}
