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
class Record_1475 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1475: FirstName is Trey")
	void FirstNameOfRecord1475() {
		assertEquals("Trey", customers.get(1474).getFirstName());
	}

	@Test
	@DisplayName("Record 1475: LastName is Makhija")
	void LastNameOfRecord1475() {
		assertEquals("Makhija", customers.get(1474).getLastName());
	}

	@Test
	@DisplayName("Record 1475: Company is Parthenon Sportswear Ltd")
	void CompanyOfRecord1475() {
		assertEquals("Parthenon Sportswear Ltd", customers.get(1474).getCompany());
	}

	@Test
	@DisplayName("Record 1475: Address is 2129 Portage St")
	void AddressOfRecord1475() {
		assertEquals("2129 Portage St", customers.get(1474).getAddress());
	}

	@Test
	@DisplayName("Record 1475: City is Kalamazoo")
	void CityOfRecord1475() {
		assertEquals("Kalamazoo", customers.get(1474).getCity());
	}

	@Test
	@DisplayName("Record 1475: County is Kalamazoo")
	void CountyOfRecord1475() {
		assertEquals("Kalamazoo", customers.get(1474).getCounty());
	}

	@Test
	@DisplayName("Record 1475: State is MI")
	void StateOfRecord1475() {
		assertEquals("MI", customers.get(1474).getState());
	}

	@Test
	@DisplayName("Record 1475: ZIP is 49001")
	void ZIPOfRecord1475() {
		assertEquals("49001", customers.get(1474).getZIP());
	}

	@Test
	@DisplayName("Record 1475: Phone is 269-385-4749")
	void PhoneOfRecord1475() {
		assertEquals("269-385-4749", customers.get(1474).getPhone());
	}

	@Test
	@DisplayName("Record 1475: Fax is 269-385-3794")
	void FaxOfRecord1475() {
		assertEquals("269-385-3794", customers.get(1474).getFax());
	}

	@Test
	@DisplayName("Record 1475: Email is trey@makhija.com")
	void EmailOfRecord1475() {
		assertEquals("trey@makhija.com", customers.get(1474).getEmail());
	}

	@Test
	@DisplayName("Record 1475: Web is http://www.treymakhija.com")
	void WebOfRecord1475() {
		assertEquals("http://www.treymakhija.com", customers.get(1474).getWeb());
	}
}
