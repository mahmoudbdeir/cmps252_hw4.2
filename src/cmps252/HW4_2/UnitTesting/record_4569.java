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

@Tag("33")
class Record_4569 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4569: FirstName is Edith")
	void FirstNameOfRecord4569() {
		assertEquals("Edith", customers.get(4568).getFirstName());
	}

	@Test
	@DisplayName("Record 4569: LastName is Brunick")
	void LastNameOfRecord4569() {
		assertEquals("Brunick", customers.get(4568).getLastName());
	}

	@Test
	@DisplayName("Record 4569: Company is Ghalili, Kamran Md")
	void CompanyOfRecord4569() {
		assertEquals("Ghalili, Kamran Md", customers.get(4568).getCompany());
	}

	@Test
	@DisplayName("Record 4569: Address is 429 E 1st St")
	void AddressOfRecord4569() {
		assertEquals("429 E 1st St", customers.get(4568).getAddress());
	}

	@Test
	@DisplayName("Record 4569: City is Long Beach")
	void CityOfRecord4569() {
		assertEquals("Long Beach", customers.get(4568).getCity());
	}

	@Test
	@DisplayName("Record 4569: County is Los Angeles")
	void CountyOfRecord4569() {
		assertEquals("Los Angeles", customers.get(4568).getCounty());
	}

	@Test
	@DisplayName("Record 4569: State is CA")
	void StateOfRecord4569() {
		assertEquals("CA", customers.get(4568).getState());
	}

	@Test
	@DisplayName("Record 4569: ZIP is 90802")
	void ZIPOfRecord4569() {
		assertEquals("90802", customers.get(4568).getZIP());
	}

	@Test
	@DisplayName("Record 4569: Phone is 562-435-1130")
	void PhoneOfRecord4569() {
		assertEquals("562-435-1130", customers.get(4568).getPhone());
	}

	@Test
	@DisplayName("Record 4569: Fax is 562-435-1429")
	void FaxOfRecord4569() {
		assertEquals("562-435-1429", customers.get(4568).getFax());
	}

	@Test
	@DisplayName("Record 4569: Email is edith@brunick.com")
	void EmailOfRecord4569() {
		assertEquals("edith@brunick.com", customers.get(4568).getEmail());
	}

	@Test
	@DisplayName("Record 4569: Web is http://www.edithbrunick.com")
	void WebOfRecord4569() {
		assertEquals("http://www.edithbrunick.com", customers.get(4568).getWeb());
	}
}
