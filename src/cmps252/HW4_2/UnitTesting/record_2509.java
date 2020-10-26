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

@Tag("16")
class Record_2509 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2509: FirstName is Liliana")
	void FirstNameOfRecord2509() {
		assertEquals("Liliana", customers.get(2508).getFirstName());
	}

	@Test
	@DisplayName("Record 2509: LastName is Grabarczyk")
	void LastNameOfRecord2509() {
		assertEquals("Grabarczyk", customers.get(2508).getLastName());
	}

	@Test
	@DisplayName("Record 2509: Company is Vineyard Gazette")
	void CompanyOfRecord2509() {
		assertEquals("Vineyard Gazette", customers.get(2508).getCompany());
	}

	@Test
	@DisplayName("Record 2509: Address is 5850 S Semoran Blvd")
	void AddressOfRecord2509() {
		assertEquals("5850 S Semoran Blvd", customers.get(2508).getAddress());
	}

	@Test
	@DisplayName("Record 2509: City is Orlando")
	void CityOfRecord2509() {
		assertEquals("Orlando", customers.get(2508).getCity());
	}

	@Test
	@DisplayName("Record 2509: County is Orange")
	void CountyOfRecord2509() {
		assertEquals("Orange", customers.get(2508).getCounty());
	}

	@Test
	@DisplayName("Record 2509: State is FL")
	void StateOfRecord2509() {
		assertEquals("FL", customers.get(2508).getState());
	}

	@Test
	@DisplayName("Record 2509: ZIP is 32822")
	void ZIPOfRecord2509() {
		assertEquals("32822", customers.get(2508).getZIP());
	}

	@Test
	@DisplayName("Record 2509: Phone is 407-381-6089")
	void PhoneOfRecord2509() {
		assertEquals("407-381-6089", customers.get(2508).getPhone());
	}

	@Test
	@DisplayName("Record 2509: Fax is 407-381-6616")
	void FaxOfRecord2509() {
		assertEquals("407-381-6616", customers.get(2508).getFax());
	}

	@Test
	@DisplayName("Record 2509: Email is liliana@grabarczyk.com")
	void EmailOfRecord2509() {
		assertEquals("liliana@grabarczyk.com", customers.get(2508).getEmail());
	}

	@Test
	@DisplayName("Record 2509: Web is http://www.lilianagrabarczyk.com")
	void WebOfRecord2509() {
		assertEquals("http://www.lilianagrabarczyk.com", customers.get(2508).getWeb());
	}
}
