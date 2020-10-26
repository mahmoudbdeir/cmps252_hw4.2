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

@Tag("38")
class Record_4457 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4457: FirstName is Rodrigo")
	void FirstNameOfRecord4457() {
		assertEquals("Rodrigo", customers.get(4456).getFirstName());
	}

	@Test
	@DisplayName("Record 4457: LastName is Sanots")
	void LastNameOfRecord4457() {
		assertEquals("Sanots", customers.get(4456).getLastName());
	}

	@Test
	@DisplayName("Record 4457: Company is Rominger Funeral Home")
	void CompanyOfRecord4457() {
		assertEquals("Rominger Funeral Home", customers.get(4456).getCompany());
	}

	@Test
	@DisplayName("Record 4457: Address is 2800 Hamilton Blvd")
	void AddressOfRecord4457() {
		assertEquals("2800 Hamilton Blvd", customers.get(4456).getAddress());
	}

	@Test
	@DisplayName("Record 4457: City is South Plainfield")
	void CityOfRecord4457() {
		assertEquals("South Plainfield", customers.get(4456).getCity());
	}

	@Test
	@DisplayName("Record 4457: County is Middlesex")
	void CountyOfRecord4457() {
		assertEquals("Middlesex", customers.get(4456).getCounty());
	}

	@Test
	@DisplayName("Record 4457: State is NJ")
	void StateOfRecord4457() {
		assertEquals("NJ", customers.get(4456).getState());
	}

	@Test
	@DisplayName("Record 4457: ZIP is 7080")
	void ZIPOfRecord4457() {
		assertEquals("7080", customers.get(4456).getZIP());
	}

	@Test
	@DisplayName("Record 4457: Phone is 908-757-4095")
	void PhoneOfRecord4457() {
		assertEquals("908-757-4095", customers.get(4456).getPhone());
	}

	@Test
	@DisplayName("Record 4457: Fax is 908-757-9362")
	void FaxOfRecord4457() {
		assertEquals("908-757-9362", customers.get(4456).getFax());
	}

	@Test
	@DisplayName("Record 4457: Email is rodrigo@sanots.com")
	void EmailOfRecord4457() {
		assertEquals("rodrigo@sanots.com", customers.get(4456).getEmail());
	}

	@Test
	@DisplayName("Record 4457: Web is http://www.rodrigosanots.com")
	void WebOfRecord4457() {
		assertEquals("http://www.rodrigosanots.com", customers.get(4456).getWeb());
	}
}
