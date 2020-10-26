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

@Tag("6")
class Record_1213 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1213: FirstName is Alta")
	void FirstNameOfRecord1213() {
		assertEquals("Alta", customers.get(1212).getFirstName());
	}

	@Test
	@DisplayName("Record 1213: LastName is Krupiak")
	void LastNameOfRecord1213() {
		assertEquals("Krupiak", customers.get(1212).getLastName());
	}

	@Test
	@DisplayName("Record 1213: Company is Crime Stoppers")
	void CompanyOfRecord1213() {
		assertEquals("Crime Stoppers", customers.get(1212).getCompany());
	}

	@Test
	@DisplayName("Record 1213: Address is 8000 Franklin Hill Rd")
	void AddressOfRecord1213() {
		assertEquals("8000 Franklin Hill Rd", customers.get(1212).getAddress());
	}

	@Test
	@DisplayName("Record 1213: City is East Stroudsburg")
	void CityOfRecord1213() {
		assertEquals("East Stroudsburg", customers.get(1212).getCity());
	}

	@Test
	@DisplayName("Record 1213: County is Monroe")
	void CountyOfRecord1213() {
		assertEquals("Monroe", customers.get(1212).getCounty());
	}

	@Test
	@DisplayName("Record 1213: State is PA")
	void StateOfRecord1213() {
		assertEquals("PA", customers.get(1212).getState());
	}

	@Test
	@DisplayName("Record 1213: ZIP is 18301")
	void ZIPOfRecord1213() {
		assertEquals("18301", customers.get(1212).getZIP());
	}

	@Test
	@DisplayName("Record 1213: Phone is 570-223-2417")
	void PhoneOfRecord1213() {
		assertEquals("570-223-2417", customers.get(1212).getPhone());
	}

	@Test
	@DisplayName("Record 1213: Fax is 570-223-4373")
	void FaxOfRecord1213() {
		assertEquals("570-223-4373", customers.get(1212).getFax());
	}

	@Test
	@DisplayName("Record 1213: Email is alta@krupiak.com")
	void EmailOfRecord1213() {
		assertEquals("alta@krupiak.com", customers.get(1212).getEmail());
	}

	@Test
	@DisplayName("Record 1213: Web is http://www.altakrupiak.com")
	void WebOfRecord1213() {
		assertEquals("http://www.altakrupiak.com", customers.get(1212).getWeb());
	}
}
