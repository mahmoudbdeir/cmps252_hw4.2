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

@Tag("45")
class Record_83 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 83: FirstName is Bert")
	void FirstNameOfRecord83() {
		assertEquals("Bert", customers.get(82).getFirstName());
	}

	@Test
	@DisplayName("Record 83: LastName is Vegh")
	void LastNameOfRecord83() {
		assertEquals("Vegh", customers.get(82).getLastName());
	}

	@Test
	@DisplayName("Record 83: Company is Lea Serv Ppl With Physcl Disab")
	void CompanyOfRecord83() {
		assertEquals("Lea Serv Ppl With Physcl Disab", customers.get(82).getCompany());
	}

	@Test
	@DisplayName("Record 83: Address is 3501 Haven Ave")
	void AddressOfRecord83() {
		assertEquals("3501 Haven Ave", customers.get(82).getAddress());
	}

	@Test
	@DisplayName("Record 83: City is Menlo Park")
	void CityOfRecord83() {
		assertEquals("Menlo Park", customers.get(82).getCity());
	}

	@Test
	@DisplayName("Record 83: County is San Mateo")
	void CountyOfRecord83() {
		assertEquals("San Mateo", customers.get(82).getCounty());
	}

	@Test
	@DisplayName("Record 83: State is CA")
	void StateOfRecord83() {
		assertEquals("CA", customers.get(82).getState());
	}

	@Test
	@DisplayName("Record 83: ZIP is 94025")
	void ZIPOfRecord83() {
		assertEquals("94025", customers.get(82).getZIP());
	}

	@Test
	@DisplayName("Record 83: Phone is 650-369-1403")
	void PhoneOfRecord83() {
		assertEquals("650-369-1403", customers.get(82).getPhone());
	}

	@Test
	@DisplayName("Record 83: Fax is 650-369-2088")
	void FaxOfRecord83() {
		assertEquals("650-369-2088", customers.get(82).getFax());
	}

	@Test
	@DisplayName("Record 83: Email is bert@vegh.com")
	void EmailOfRecord83() {
		assertEquals("bert@vegh.com", customers.get(82).getEmail());
	}

	@Test
	@DisplayName("Record 83: Web is http://www.bertvegh.com")
	void WebOfRecord83() {
		assertEquals("http://www.bertvegh.com", customers.get(82).getWeb());
	}
}
