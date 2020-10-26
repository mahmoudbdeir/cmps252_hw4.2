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

@Tag("21")
class Record_1392 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1392: FirstName is Rolando")
	void FirstNameOfRecord1392() {
		assertEquals("Rolando", customers.get(1391).getFirstName());
	}

	@Test
	@DisplayName("Record 1392: LastName is Goshow")
	void LastNameOfRecord1392() {
		assertEquals("Goshow", customers.get(1391).getLastName());
	}

	@Test
	@DisplayName("Record 1392: Company is Commercial Associates Inc")
	void CompanyOfRecord1392() {
		assertEquals("Commercial Associates Inc", customers.get(1391).getCompany());
	}

	@Test
	@DisplayName("Record 1392: Address is 2035 N 15th Ave")
	void AddressOfRecord1392() {
		assertEquals("2035 N 15th Ave", customers.get(1391).getAddress());
	}

	@Test
	@DisplayName("Record 1392: City is Melrose Park")
	void CityOfRecord1392() {
		assertEquals("Melrose Park", customers.get(1391).getCity());
	}

	@Test
	@DisplayName("Record 1392: County is Cook")
	void CountyOfRecord1392() {
		assertEquals("Cook", customers.get(1391).getCounty());
	}

	@Test
	@DisplayName("Record 1392: State is IL")
	void StateOfRecord1392() {
		assertEquals("IL", customers.get(1391).getState());
	}

	@Test
	@DisplayName("Record 1392: ZIP is 60160")
	void ZIPOfRecord1392() {
		assertEquals("60160", customers.get(1391).getZIP());
	}

	@Test
	@DisplayName("Record 1392: Phone is 708-344-4830")
	void PhoneOfRecord1392() {
		assertEquals("708-344-4830", customers.get(1391).getPhone());
	}

	@Test
	@DisplayName("Record 1392: Fax is 708-344-3652")
	void FaxOfRecord1392() {
		assertEquals("708-344-3652", customers.get(1391).getFax());
	}

	@Test
	@DisplayName("Record 1392: Email is rolando@goshow.com")
	void EmailOfRecord1392() {
		assertEquals("rolando@goshow.com", customers.get(1391).getEmail());
	}

	@Test
	@DisplayName("Record 1392: Web is http://www.rolandogoshow.com")
	void WebOfRecord1392() {
		assertEquals("http://www.rolandogoshow.com", customers.get(1391).getWeb());
	}
}
