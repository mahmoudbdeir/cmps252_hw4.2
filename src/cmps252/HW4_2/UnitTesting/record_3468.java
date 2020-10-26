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

@Tag("11")
class Record_3468 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3468: FirstName is Gerry")
	void FirstNameOfRecord3468() {
		assertEquals("Gerry", customers.get(3467).getFirstName());
	}

	@Test
	@DisplayName("Record 3468: LastName is Galindez")
	void LastNameOfRecord3468() {
		assertEquals("Galindez", customers.get(3467).getLastName());
	}

	@Test
	@DisplayName("Record 3468: Company is Natl Ctr For Erly Childhood")
	void CompanyOfRecord3468() {
		assertEquals("Natl Ctr For Erly Childhood", customers.get(3467).getCompany());
	}

	@Test
	@DisplayName("Record 3468: Address is 1701 Terminal Rd")
	void AddressOfRecord3468() {
		assertEquals("1701 Terminal Rd", customers.get(3467).getAddress());
	}

	@Test
	@DisplayName("Record 3468: City is Niles")
	void CityOfRecord3468() {
		assertEquals("Niles", customers.get(3467).getCity());
	}

	@Test
	@DisplayName("Record 3468: County is Berrien")
	void CountyOfRecord3468() {
		assertEquals("Berrien", customers.get(3467).getCounty());
	}

	@Test
	@DisplayName("Record 3468: State is MI")
	void StateOfRecord3468() {
		assertEquals("MI", customers.get(3467).getState());
	}

	@Test
	@DisplayName("Record 3468: ZIP is 49120")
	void ZIPOfRecord3468() {
		assertEquals("49120", customers.get(3467).getZIP());
	}

	@Test
	@DisplayName("Record 3468: Phone is 269-683-8840")
	void PhoneOfRecord3468() {
		assertEquals("269-683-8840", customers.get(3467).getPhone());
	}

	@Test
	@DisplayName("Record 3468: Fax is 269-683-4454")
	void FaxOfRecord3468() {
		assertEquals("269-683-4454", customers.get(3467).getFax());
	}

	@Test
	@DisplayName("Record 3468: Email is gerry@galindez.com")
	void EmailOfRecord3468() {
		assertEquals("gerry@galindez.com", customers.get(3467).getEmail());
	}

	@Test
	@DisplayName("Record 3468: Web is http://www.gerrygalindez.com")
	void WebOfRecord3468() {
		assertEquals("http://www.gerrygalindez.com", customers.get(3467).getWeb());
	}
}
