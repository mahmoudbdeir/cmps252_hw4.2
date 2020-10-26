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
class Record_3440 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3440: FirstName is Raymon")
	void FirstNameOfRecord3440() {
		assertEquals("Raymon", customers.get(3439).getFirstName());
	}

	@Test
	@DisplayName("Record 3440: LastName is Tuschhoff")
	void LastNameOfRecord3440() {
		assertEquals("Tuschhoff", customers.get(3439).getLastName());
	}

	@Test
	@DisplayName("Record 3440: Company is South Dakota Newpaper Assn")
	void CompanyOfRecord3440() {
		assertEquals("South Dakota Newpaper Assn", customers.get(3439).getCompany());
	}

	@Test
	@DisplayName("Record 3440: Address is 791 Bethlehem Pike")
	void AddressOfRecord3440() {
		assertEquals("791 Bethlehem Pike", customers.get(3439).getAddress());
	}

	@Test
	@DisplayName("Record 3440: City is Colmar")
	void CityOfRecord3440() {
		assertEquals("Colmar", customers.get(3439).getCity());
	}

	@Test
	@DisplayName("Record 3440: County is Montgomery")
	void CountyOfRecord3440() {
		assertEquals("Montgomery", customers.get(3439).getCounty());
	}

	@Test
	@DisplayName("Record 3440: State is PA")
	void StateOfRecord3440() {
		assertEquals("PA", customers.get(3439).getState());
	}

	@Test
	@DisplayName("Record 3440: ZIP is 18915")
	void ZIPOfRecord3440() {
		assertEquals("18915", customers.get(3439).getZIP());
	}

	@Test
	@DisplayName("Record 3440: Phone is 215-997-4767")
	void PhoneOfRecord3440() {
		assertEquals("215-997-4767", customers.get(3439).getPhone());
	}

	@Test
	@DisplayName("Record 3440: Fax is 215-997-4576")
	void FaxOfRecord3440() {
		assertEquals("215-997-4576", customers.get(3439).getFax());
	}

	@Test
	@DisplayName("Record 3440: Email is raymon@tuschhoff.com")
	void EmailOfRecord3440() {
		assertEquals("raymon@tuschhoff.com", customers.get(3439).getEmail());
	}

	@Test
	@DisplayName("Record 3440: Web is http://www.raymontuschhoff.com")
	void WebOfRecord3440() {
		assertEquals("http://www.raymontuschhoff.com", customers.get(3439).getWeb());
	}
}
