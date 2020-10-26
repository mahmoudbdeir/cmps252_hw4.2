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

@Tag("27")
class Record_1599 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1599: FirstName is Bethany")
	void FirstNameOfRecord1599() {
		assertEquals("Bethany", customers.get(1598).getFirstName());
	}

	@Test
	@DisplayName("Record 1599: LastName is Tubolino")
	void LastNameOfRecord1599() {
		assertEquals("Tubolino", customers.get(1598).getLastName());
	}

	@Test
	@DisplayName("Record 1599: Company is Bedrosians Tile & Marble")
	void CompanyOfRecord1599() {
		assertEquals("Bedrosians Tile & Marble", customers.get(1598).getCompany());
	}

	@Test
	@DisplayName("Record 1599: Address is 435 Washington Sq S")
	void AddressOfRecord1599() {
		assertEquals("435 Washington Sq S", customers.get(1598).getAddress());
	}

	@Test
	@DisplayName("Record 1599: City is Lansing")
	void CityOfRecord1599() {
		assertEquals("Lansing", customers.get(1598).getCity());
	}

	@Test
	@DisplayName("Record 1599: County is Ingham")
	void CountyOfRecord1599() {
		assertEquals("Ingham", customers.get(1598).getCounty());
	}

	@Test
	@DisplayName("Record 1599: State is MI")
	void StateOfRecord1599() {
		assertEquals("MI", customers.get(1598).getState());
	}

	@Test
	@DisplayName("Record 1599: ZIP is 48933")
	void ZIPOfRecord1599() {
		assertEquals("48933", customers.get(1598).getZIP());
	}

	@Test
	@DisplayName("Record 1599: Phone is 517-487-1952")
	void PhoneOfRecord1599() {
		assertEquals("517-487-1952", customers.get(1598).getPhone());
	}

	@Test
	@DisplayName("Record 1599: Fax is 517-487-0529")
	void FaxOfRecord1599() {
		assertEquals("517-487-0529", customers.get(1598).getFax());
	}

	@Test
	@DisplayName("Record 1599: Email is bethany@tubolino.com")
	void EmailOfRecord1599() {
		assertEquals("bethany@tubolino.com", customers.get(1598).getEmail());
	}

	@Test
	@DisplayName("Record 1599: Web is http://www.bethanytubolino.com")
	void WebOfRecord1599() {
		assertEquals("http://www.bethanytubolino.com", customers.get(1598).getWeb());
	}
}
