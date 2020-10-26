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

@Tag("31")
class Record_65 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 65: FirstName is Toby")
	void FirstNameOfRecord65() {
		assertEquals("Toby", customers.get(64).getFirstName());
	}

	@Test
	@DisplayName("Record 65: LastName is Blazina")
	void LastNameOfRecord65() {
		assertEquals("Blazina", customers.get(64).getLastName());
	}

	@Test
	@DisplayName("Record 65: Company is Wharfside Brokerage Co Inc")
	void CompanyOfRecord65() {
		assertEquals("Wharfside Brokerage Co Inc", customers.get(64).getCompany());
	}

	@Test
	@DisplayName("Record 65: Address is 210 S 4th Ave")
	void AddressOfRecord65() {
		assertEquals("210 S 4th Ave", customers.get(64).getAddress());
	}

	@Test
	@DisplayName("Record 65: City is Mount Vernon")
	void CityOfRecord65() {
		assertEquals("Mount Vernon", customers.get(64).getCity());
	}

	@Test
	@DisplayName("Record 65: County is Westchester")
	void CountyOfRecord65() {
		assertEquals("Westchester", customers.get(64).getCounty());
	}

	@Test
	@DisplayName("Record 65: State is NY")
	void StateOfRecord65() {
		assertEquals("NY", customers.get(64).getState());
	}

	@Test
	@DisplayName("Record 65: ZIP is 10550")
	void ZIPOfRecord65() {
		assertEquals("10550", customers.get(64).getZIP());
	}

	@Test
	@DisplayName("Record 65: Phone is 914-771-2679")
	void PhoneOfRecord65() {
		assertEquals("914-771-2679", customers.get(64).getPhone());
	}

	@Test
	@DisplayName("Record 65: Fax is 914-771-5884")
	void FaxOfRecord65() {
		assertEquals("914-771-5884", customers.get(64).getFax());
	}

	@Test
	@DisplayName("Record 65: Email is toby@blazina.com")
	void EmailOfRecord65() {
		assertEquals("toby@blazina.com", customers.get(64).getEmail());
	}

	@Test
	@DisplayName("Record 65: Web is http://www.tobyblazina.com")
	void WebOfRecord65() {
		assertEquals("http://www.tobyblazina.com", customers.get(64).getWeb());
	}
}
