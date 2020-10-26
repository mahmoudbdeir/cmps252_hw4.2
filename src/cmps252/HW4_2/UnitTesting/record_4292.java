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

@Tag("45")
class Record_4292 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4292: FirstName is Quinn")
	void FirstNameOfRecord4292() {
		assertEquals("Quinn", customers.get(4291).getFirstName());
	}

	@Test
	@DisplayName("Record 4292: LastName is Frattini")
	void LastNameOfRecord4292() {
		assertEquals("Frattini", customers.get(4291).getLastName());
	}

	@Test
	@DisplayName("Record 4292: Company is Wheatley, Doug Md")
	void CompanyOfRecord4292() {
		assertEquals("Wheatley, Doug Md", customers.get(4291).getCompany());
	}

	@Test
	@DisplayName("Record 4292: Address is 216 S Orange St")
	void AddressOfRecord4292() {
		assertEquals("216 S Orange St", customers.get(4291).getAddress());
	}

	@Test
	@DisplayName("Record 4292: City is Media")
	void CityOfRecord4292() {
		assertEquals("Media", customers.get(4291).getCity());
	}

	@Test
	@DisplayName("Record 4292: County is Delaware")
	void CountyOfRecord4292() {
		assertEquals("Delaware", customers.get(4291).getCounty());
	}

	@Test
	@DisplayName("Record 4292: State is PA")
	void StateOfRecord4292() {
		assertEquals("PA", customers.get(4291).getState());
	}

	@Test
	@DisplayName("Record 4292: ZIP is 19063")
	void ZIPOfRecord4292() {
		assertEquals("19063", customers.get(4291).getZIP());
	}

	@Test
	@DisplayName("Record 4292: Phone is 610-565-2941")
	void PhoneOfRecord4292() {
		assertEquals("610-565-2941", customers.get(4291).getPhone());
	}

	@Test
	@DisplayName("Record 4292: Fax is 610-565-8595")
	void FaxOfRecord4292() {
		assertEquals("610-565-8595", customers.get(4291).getFax());
	}

	@Test
	@DisplayName("Record 4292: Email is quinn@frattini.com")
	void EmailOfRecord4292() {
		assertEquals("quinn@frattini.com", customers.get(4291).getEmail());
	}

	@Test
	@DisplayName("Record 4292: Web is http://www.quinnfrattini.com")
	void WebOfRecord4292() {
		assertEquals("http://www.quinnfrattini.com", customers.get(4291).getWeb());
	}
}
