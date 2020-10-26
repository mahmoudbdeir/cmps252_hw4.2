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

@Tag("41")
class Record_4937 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4937: FirstName is Sallie")
	void FirstNameOfRecord4937() {
		assertEquals("Sallie", customers.get(4936).getFirstName());
	}

	@Test
	@DisplayName("Record 4937: LastName is Policz")
	void LastNameOfRecord4937() {
		assertEquals("Policz", customers.get(4936).getLastName());
	}

	@Test
	@DisplayName("Record 4937: Company is Weber Concrete Construction")
	void CompanyOfRecord4937() {
		assertEquals("Weber Concrete Construction", customers.get(4936).getCompany());
	}

	@Test
	@DisplayName("Record 4937: Address is 6750 Poplar Ave")
	void AddressOfRecord4937() {
		assertEquals("6750 Poplar Ave", customers.get(4936).getAddress());
	}

	@Test
	@DisplayName("Record 4937: City is Germantown")
	void CityOfRecord4937() {
		assertEquals("Germantown", customers.get(4936).getCity());
	}

	@Test
	@DisplayName("Record 4937: County is Shelby")
	void CountyOfRecord4937() {
		assertEquals("Shelby", customers.get(4936).getCounty());
	}

	@Test
	@DisplayName("Record 4937: State is TN")
	void StateOfRecord4937() {
		assertEquals("TN", customers.get(4936).getState());
	}

	@Test
	@DisplayName("Record 4937: ZIP is 38138")
	void ZIPOfRecord4937() {
		assertEquals("38138", customers.get(4936).getZIP());
	}

	@Test
	@DisplayName("Record 4937: Phone is 901-753-9288")
	void PhoneOfRecord4937() {
		assertEquals("901-753-9288", customers.get(4936).getPhone());
	}

	@Test
	@DisplayName("Record 4937: Fax is 901-753-9233")
	void FaxOfRecord4937() {
		assertEquals("901-753-9233", customers.get(4936).getFax());
	}

	@Test
	@DisplayName("Record 4937: Email is sallie@policz.com")
	void EmailOfRecord4937() {
		assertEquals("sallie@policz.com", customers.get(4936).getEmail());
	}

	@Test
	@DisplayName("Record 4937: Web is http://www.salliepolicz.com")
	void WebOfRecord4937() {
		assertEquals("http://www.salliepolicz.com", customers.get(4936).getWeb());
	}
}
