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
class Record_900 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 900: FirstName is Nadia")
	void FirstNameOfRecord900() {
		assertEquals("Nadia", customers.get(899).getFirstName());
	}

	@Test
	@DisplayName("Record 900: LastName is Garza")
	void LastNameOfRecord900() {
		assertEquals("Garza", customers.get(899).getLastName());
	}

	@Test
	@DisplayName("Record 900: Company is Kendall County Abstract Co")
	void CompanyOfRecord900() {
		assertEquals("Kendall County Abstract Co", customers.get(899).getCompany());
	}

	@Test
	@DisplayName("Record 900: Address is 380 Rd")
	void AddressOfRecord900() {
		assertEquals("380 Rd", customers.get(899).getAddress());
	}

	@Test
	@DisplayName("Record 900: City is Wenatchee")
	void CityOfRecord900() {
		assertEquals("Wenatchee", customers.get(899).getCity());
	}

	@Test
	@DisplayName("Record 900: County is Chelan")
	void CountyOfRecord900() {
		assertEquals("Chelan", customers.get(899).getCounty());
	}

	@Test
	@DisplayName("Record 900: State is WA")
	void StateOfRecord900() {
		assertEquals("WA", customers.get(899).getState());
	}

	@Test
	@DisplayName("Record 900: ZIP is 98801")
	void ZIPOfRecord900() {
		assertEquals("98801", customers.get(899).getZIP());
	}

	@Test
	@DisplayName("Record 900: Phone is 509-662-0596")
	void PhoneOfRecord900() {
		assertEquals("509-662-0596", customers.get(899).getPhone());
	}

	@Test
	@DisplayName("Record 900: Fax is 509-662-6345")
	void FaxOfRecord900() {
		assertEquals("509-662-6345", customers.get(899).getFax());
	}

	@Test
	@DisplayName("Record 900: Email is nadia@garza.com")
	void EmailOfRecord900() {
		assertEquals("nadia@garza.com", customers.get(899).getEmail());
	}

	@Test
	@DisplayName("Record 900: Web is http://www.nadiagarza.com")
	void WebOfRecord900() {
		assertEquals("http://www.nadiagarza.com", customers.get(899).getWeb());
	}
}
