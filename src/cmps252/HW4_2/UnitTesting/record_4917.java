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

@Tag("28")
class Record_4917 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4917: FirstName is Pamela")
	void FirstNameOfRecord4917() {
		assertEquals("Pamela", customers.get(4916).getFirstName());
	}

	@Test
	@DisplayName("Record 4917: LastName is Bommer")
	void LastNameOfRecord4917() {
		assertEquals("Bommer", customers.get(4916).getLastName());
	}

	@Test
	@DisplayName("Record 4917: Company is Columbia Bay Inc")
	void CompanyOfRecord4917() {
		assertEquals("Columbia Bay Inc", customers.get(4916).getCompany());
	}

	@Test
	@DisplayName("Record 4917: Address is 3218 Pringle Rd Se  #-b")
	void AddressOfRecord4917() {
		assertEquals("3218 Pringle Rd Se  #-b", customers.get(4916).getAddress());
	}

	@Test
	@DisplayName("Record 4917: City is Salem")
	void CityOfRecord4917() {
		assertEquals("Salem", customers.get(4916).getCity());
	}

	@Test
	@DisplayName("Record 4917: County is Marion")
	void CountyOfRecord4917() {
		assertEquals("Marion", customers.get(4916).getCounty());
	}

	@Test
	@DisplayName("Record 4917: State is OR")
	void StateOfRecord4917() {
		assertEquals("OR", customers.get(4916).getState());
	}

	@Test
	@DisplayName("Record 4917: ZIP is 97302")
	void ZIPOfRecord4917() {
		assertEquals("97302", customers.get(4916).getZIP());
	}

	@Test
	@DisplayName("Record 4917: Phone is 503-378-6390")
	void PhoneOfRecord4917() {
		assertEquals("503-378-6390", customers.get(4916).getPhone());
	}

	@Test
	@DisplayName("Record 4917: Fax is 503-378-7699")
	void FaxOfRecord4917() {
		assertEquals("503-378-7699", customers.get(4916).getFax());
	}

	@Test
	@DisplayName("Record 4917: Email is pamela@bommer.com")
	void EmailOfRecord4917() {
		assertEquals("pamela@bommer.com", customers.get(4916).getEmail());
	}

	@Test
	@DisplayName("Record 4917: Web is http://www.pamelabommer.com")
	void WebOfRecord4917() {
		assertEquals("http://www.pamelabommer.com", customers.get(4916).getWeb());
	}
}
