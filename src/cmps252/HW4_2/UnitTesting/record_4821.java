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

@Tag("8")
class Record_4821 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4821: FirstName is Ira")
	void FirstNameOfRecord4821() {
		assertEquals("Ira", customers.get(4820).getFirstName());
	}

	@Test
	@DisplayName("Record 4821: LastName is Fron")
	void LastNameOfRecord4821() {
		assertEquals("Fron", customers.get(4820).getLastName());
	}

	@Test
	@DisplayName("Record 4821: Company is Southwest Serv Corp")
	void CompanyOfRecord4821() {
		assertEquals("Southwest Serv Corp", customers.get(4820).getCompany());
	}

	@Test
	@DisplayName("Record 4821: Address is 4750 Wiley Post Way  #-1200")
	void AddressOfRecord4821() {
		assertEquals("4750 Wiley Post Way  #-1200", customers.get(4820).getAddress());
	}

	@Test
	@DisplayName("Record 4821: City is Salt Lake City")
	void CityOfRecord4821() {
		assertEquals("Salt Lake City", customers.get(4820).getCity());
	}

	@Test
	@DisplayName("Record 4821: County is Salt Lake")
	void CountyOfRecord4821() {
		assertEquals("Salt Lake", customers.get(4820).getCounty());
	}

	@Test
	@DisplayName("Record 4821: State is UT")
	void StateOfRecord4821() {
		assertEquals("UT", customers.get(4820).getState());
	}

	@Test
	@DisplayName("Record 4821: ZIP is 84116")
	void ZIPOfRecord4821() {
		assertEquals("84116", customers.get(4820).getZIP());
	}

	@Test
	@DisplayName("Record 4821: Phone is 801-359-8153")
	void PhoneOfRecord4821() {
		assertEquals("801-359-8153", customers.get(4820).getPhone());
	}

	@Test
	@DisplayName("Record 4821: Fax is 801-359-9296")
	void FaxOfRecord4821() {
		assertEquals("801-359-9296", customers.get(4820).getFax());
	}

	@Test
	@DisplayName("Record 4821: Email is ira@fron.com")
	void EmailOfRecord4821() {
		assertEquals("ira@fron.com", customers.get(4820).getEmail());
	}

	@Test
	@DisplayName("Record 4821: Web is http://www.irafron.com")
	void WebOfRecord4821() {
		assertEquals("http://www.irafron.com", customers.get(4820).getWeb());
	}
}
