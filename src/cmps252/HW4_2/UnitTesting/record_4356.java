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
class Record_4356 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4356: FirstName is Buster")
	void FirstNameOfRecord4356() {
		assertEquals("Buster", customers.get(4355).getFirstName());
	}

	@Test
	@DisplayName("Record 4356: LastName is Spanswick")
	void LastNameOfRecord4356() {
		assertEquals("Spanswick", customers.get(4355).getLastName());
	}

	@Test
	@DisplayName("Record 4356: Company is Reynolds Constrctn Managment")
	void CompanyOfRecord4356() {
		assertEquals("Reynolds Constrctn Managment", customers.get(4355).getCompany());
	}

	@Test
	@DisplayName("Record 4356: Address is 501 5th Ave")
	void AddressOfRecord4356() {
		assertEquals("501 5th Ave", customers.get(4355).getAddress());
	}

	@Test
	@DisplayName("Record 4356: City is New York")
	void CityOfRecord4356() {
		assertEquals("New York", customers.get(4355).getCity());
	}

	@Test
	@DisplayName("Record 4356: County is New York")
	void CountyOfRecord4356() {
		assertEquals("New York", customers.get(4355).getCounty());
	}

	@Test
	@DisplayName("Record 4356: State is NY")
	void StateOfRecord4356() {
		assertEquals("NY", customers.get(4355).getState());
	}

	@Test
	@DisplayName("Record 4356: ZIP is 10017")
	void ZIPOfRecord4356() {
		assertEquals("10017", customers.get(4355).getZIP());
	}

	@Test
	@DisplayName("Record 4356: Phone is 212-490-4097")
	void PhoneOfRecord4356() {
		assertEquals("212-490-4097", customers.get(4355).getPhone());
	}

	@Test
	@DisplayName("Record 4356: Fax is 212-490-8649")
	void FaxOfRecord4356() {
		assertEquals("212-490-8649", customers.get(4355).getFax());
	}

	@Test
	@DisplayName("Record 4356: Email is buster@spanswick.com")
	void EmailOfRecord4356() {
		assertEquals("buster@spanswick.com", customers.get(4355).getEmail());
	}

	@Test
	@DisplayName("Record 4356: Web is http://www.busterspanswick.com")
	void WebOfRecord4356() {
		assertEquals("http://www.busterspanswick.com", customers.get(4355).getWeb());
	}
}
