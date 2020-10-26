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
class Record_4730 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4730: FirstName is Percy")
	void FirstNameOfRecord4730() {
		assertEquals("Percy", customers.get(4729).getFirstName());
	}

	@Test
	@DisplayName("Record 4730: LastName is Gatske")
	void LastNameOfRecord4730() {
		assertEquals("Gatske", customers.get(4729).getLastName());
	}

	@Test
	@DisplayName("Record 4730: Company is Morrison Haney & Dowd Inc")
	void CompanyOfRecord4730() {
		assertEquals("Morrison Haney & Dowd Inc", customers.get(4729).getCompany());
	}

	@Test
	@DisplayName("Record 4730: Address is 224 Broughton Ave")
	void AddressOfRecord4730() {
		assertEquals("224 Broughton Ave", customers.get(4729).getAddress());
	}

	@Test
	@DisplayName("Record 4730: City is Bloomfield")
	void CityOfRecord4730() {
		assertEquals("Bloomfield", customers.get(4729).getCity());
	}

	@Test
	@DisplayName("Record 4730: County is Essex")
	void CountyOfRecord4730() {
		assertEquals("Essex", customers.get(4729).getCounty());
	}

	@Test
	@DisplayName("Record 4730: State is NJ")
	void StateOfRecord4730() {
		assertEquals("NJ", customers.get(4729).getState());
	}

	@Test
	@DisplayName("Record 4730: ZIP is 7003")
	void ZIPOfRecord4730() {
		assertEquals("7003", customers.get(4729).getZIP());
	}

	@Test
	@DisplayName("Record 4730: Phone is 973-338-2396")
	void PhoneOfRecord4730() {
		assertEquals("973-338-2396", customers.get(4729).getPhone());
	}

	@Test
	@DisplayName("Record 4730: Fax is 973-338-1333")
	void FaxOfRecord4730() {
		assertEquals("973-338-1333", customers.get(4729).getFax());
	}

	@Test
	@DisplayName("Record 4730: Email is percy@gatske.com")
	void EmailOfRecord4730() {
		assertEquals("percy@gatske.com", customers.get(4729).getEmail());
	}

	@Test
	@DisplayName("Record 4730: Web is http://www.percygatske.com")
	void WebOfRecord4730() {
		assertEquals("http://www.percygatske.com", customers.get(4729).getWeb());
	}
}
