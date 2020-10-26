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

@Tag("8")
class Record_998 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 998: FirstName is Brittney")
	void FirstNameOfRecord998() {
		assertEquals("Brittney", customers.get(997).getFirstName());
	}

	@Test
	@DisplayName("Record 998: LastName is Naish")
	void LastNameOfRecord998() {
		assertEquals("Naish", customers.get(997).getLastName());
	}

	@Test
	@DisplayName("Record 998: Company is Come Together")
	void CompanyOfRecord998() {
		assertEquals("Come Together", customers.get(997).getCompany());
	}

	@Test
	@DisplayName("Record 998: Address is 9100 Ellis Rd  #-a")
	void AddressOfRecord998() {
		assertEquals("9100 Ellis Rd  #-a", customers.get(997).getAddress());
	}

	@Test
	@DisplayName("Record 998: City is Melbourne")
	void CityOfRecord998() {
		assertEquals("Melbourne", customers.get(997).getCity());
	}

	@Test
	@DisplayName("Record 998: County is Brevard")
	void CountyOfRecord998() {
		assertEquals("Brevard", customers.get(997).getCounty());
	}

	@Test
	@DisplayName("Record 998: State is FL")
	void StateOfRecord998() {
		assertEquals("FL", customers.get(997).getState());
	}

	@Test
	@DisplayName("Record 998: ZIP is 32904")
	void ZIPOfRecord998() {
		assertEquals("32904", customers.get(997).getZIP());
	}

	@Test
	@DisplayName("Record 998: Phone is 321-725-9684")
	void PhoneOfRecord998() {
		assertEquals("321-725-9684", customers.get(997).getPhone());
	}

	@Test
	@DisplayName("Record 998: Fax is 321-725-8869")
	void FaxOfRecord998() {
		assertEquals("321-725-8869", customers.get(997).getFax());
	}

	@Test
	@DisplayName("Record 998: Email is brittney@naish.com")
	void EmailOfRecord998() {
		assertEquals("brittney@naish.com", customers.get(997).getEmail());
	}

	@Test
	@DisplayName("Record 998: Web is http://www.brittneynaish.com")
	void WebOfRecord998() {
		assertEquals("http://www.brittneynaish.com", customers.get(997).getWeb());
	}
}
