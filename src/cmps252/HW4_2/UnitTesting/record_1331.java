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
class Record_1331 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1331: FirstName is Queen")
	void FirstNameOfRecord1331() {
		assertEquals("Queen", customers.get(1330).getFirstName());
	}

	@Test
	@DisplayName("Record 1331: LastName is Varady")
	void LastNameOfRecord1331() {
		assertEquals("Varady", customers.get(1330).getLastName());
	}

	@Test
	@DisplayName("Record 1331: Company is Smith, J Michael Esq")
	void CompanyOfRecord1331() {
		assertEquals("Smith, J Michael Esq", customers.get(1330).getCompany());
	}

	@Test
	@DisplayName("Record 1331: Address is 1606 Manning Blvd  #-b")
	void AddressOfRecord1331() {
		assertEquals("1606 Manning Blvd  #-b", customers.get(1330).getAddress());
	}

	@Test
	@DisplayName("Record 1331: City is Levittown")
	void CityOfRecord1331() {
		assertEquals("Levittown", customers.get(1330).getCity());
	}

	@Test
	@DisplayName("Record 1331: County is Bucks")
	void CountyOfRecord1331() {
		assertEquals("Bucks", customers.get(1330).getCounty());
	}

	@Test
	@DisplayName("Record 1331: State is PA")
	void StateOfRecord1331() {
		assertEquals("PA", customers.get(1330).getState());
	}

	@Test
	@DisplayName("Record 1331: ZIP is 19057")
	void ZIPOfRecord1331() {
		assertEquals("19057", customers.get(1330).getZIP());
	}

	@Test
	@DisplayName("Record 1331: Phone is 215-949-4624")
	void PhoneOfRecord1331() {
		assertEquals("215-949-4624", customers.get(1330).getPhone());
	}

	@Test
	@DisplayName("Record 1331: Fax is 215-949-9489")
	void FaxOfRecord1331() {
		assertEquals("215-949-9489", customers.get(1330).getFax());
	}

	@Test
	@DisplayName("Record 1331: Email is queen@varady.com")
	void EmailOfRecord1331() {
		assertEquals("queen@varady.com", customers.get(1330).getEmail());
	}

	@Test
	@DisplayName("Record 1331: Web is http://www.queenvarady.com")
	void WebOfRecord1331() {
		assertEquals("http://www.queenvarady.com", customers.get(1330).getWeb());
	}
}
