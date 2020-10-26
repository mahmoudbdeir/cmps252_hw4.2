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
class Record_4978 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4978: FirstName is Dee")
	void FirstNameOfRecord4978() {
		assertEquals("Dee", customers.get(4977).getFirstName());
	}

	@Test
	@DisplayName("Record 4978: LastName is Nigon")
	void LastNameOfRecord4978() {
		assertEquals("Nigon", customers.get(4977).getLastName());
	}

	@Test
	@DisplayName("Record 4978: Company is Adcraft Printers")
	void CompanyOfRecord4978() {
		assertEquals("Adcraft Printers", customers.get(4977).getCompany());
	}

	@Test
	@DisplayName("Record 4978: Address is 534 E Thomas Rd")
	void AddressOfRecord4978() {
		assertEquals("534 E Thomas Rd", customers.get(4977).getAddress());
	}

	@Test
	@DisplayName("Record 4978: City is Phoenix")
	void CityOfRecord4978() {
		assertEquals("Phoenix", customers.get(4977).getCity());
	}

	@Test
	@DisplayName("Record 4978: County is Maricopa")
	void CountyOfRecord4978() {
		assertEquals("Maricopa", customers.get(4977).getCounty());
	}

	@Test
	@DisplayName("Record 4978: State is AZ")
	void StateOfRecord4978() {
		assertEquals("AZ", customers.get(4977).getState());
	}

	@Test
	@DisplayName("Record 4978: ZIP is 85012")
	void ZIPOfRecord4978() {
		assertEquals("85012", customers.get(4977).getZIP());
	}

	@Test
	@DisplayName("Record 4978: Phone is 602-650-2594")
	void PhoneOfRecord4978() {
		assertEquals("602-650-2594", customers.get(4977).getPhone());
	}

	@Test
	@DisplayName("Record 4978: Fax is 602-650-5258")
	void FaxOfRecord4978() {
		assertEquals("602-650-5258", customers.get(4977).getFax());
	}

	@Test
	@DisplayName("Record 4978: Email is dee@nigon.com")
	void EmailOfRecord4978() {
		assertEquals("dee@nigon.com", customers.get(4977).getEmail());
	}

	@Test
	@DisplayName("Record 4978: Web is http://www.deenigon.com")
	void WebOfRecord4978() {
		assertEquals("http://www.deenigon.com", customers.get(4977).getWeb());
	}
}
