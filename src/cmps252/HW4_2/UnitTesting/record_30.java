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

@Tag("13")
class Record_30 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 30: FirstName is Willian")
	void FirstNameOfRecord30() {
		assertEquals("Willian", customers.get(29).getFirstName());
	}

	@Test
	@DisplayName("Record 30: LastName is Carnegie")
	void LastNameOfRecord30() {
		assertEquals("Carnegie", customers.get(29).getLastName());
	}

	@Test
	@DisplayName("Record 30: Company is Tanner Realty Inc")
	void CompanyOfRecord30() {
		assertEquals("Tanner Realty Inc", customers.get(29).getCompany());
	}

	@Test
	@DisplayName("Record 30: Address is 10890 General Dr")
	void AddressOfRecord30() {
		assertEquals("10890 General Dr", customers.get(29).getAddress());
	}

	@Test
	@DisplayName("Record 30: City is Orlando")
	void CityOfRecord30() {
		assertEquals("Orlando", customers.get(29).getCity());
	}

	@Test
	@DisplayName("Record 30: County is Orange")
	void CountyOfRecord30() {
		assertEquals("Orange", customers.get(29).getCounty());
	}

	@Test
	@DisplayName("Record 30: State is FL")
	void StateOfRecord30() {
		assertEquals("FL", customers.get(29).getState());
	}

	@Test
	@DisplayName("Record 30: ZIP is 32824")
	void ZIPOfRecord30() {
		assertEquals("32824", customers.get(29).getZIP());
	}

	@Test
	@DisplayName("Record 30: Phone is 407-850-2017")
	void PhoneOfRecord30() {
		assertEquals("407-850-2017", customers.get(29).getPhone());
	}

	@Test
	@DisplayName("Record 30: Fax is 407-850-2735")
	void FaxOfRecord30() {
		assertEquals("407-850-2735", customers.get(29).getFax());
	}

	@Test
	@DisplayName("Record 30: Email is willian@carnegie.com")
	void EmailOfRecord30() {
		assertEquals("willian@carnegie.com", customers.get(29).getEmail());
	}

	@Test
	@DisplayName("Record 30: Web is http://www.williancarnegie.com")
	void WebOfRecord30() {
		assertEquals("http://www.williancarnegie.com", customers.get(29).getWeb());
	}
}
