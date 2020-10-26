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

@Tag("9")
class Record_3835 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3835: FirstName is Ronny")
	void FirstNameOfRecord3835() {
		assertEquals("Ronny", customers.get(3834).getFirstName());
	}

	@Test
	@DisplayName("Record 3835: LastName is Brydel")
	void LastNameOfRecord3835() {
		assertEquals("Brydel", customers.get(3834).getLastName());
	}

	@Test
	@DisplayName("Record 3835: Company is Untd Methdst Assn Hlth")
	void CompanyOfRecord3835() {
		assertEquals("Untd Methdst Assn Hlth", customers.get(3834).getCompany());
	}

	@Test
	@DisplayName("Record 3835: Address is 1695 Main St")
	void AddressOfRecord3835() {
		assertEquals("1695 Main St", customers.get(3834).getAddress());
	}

	@Test
	@DisplayName("Record 3835: City is Springfield")
	void CityOfRecord3835() {
		assertEquals("Springfield", customers.get(3834).getCity());
	}

	@Test
	@DisplayName("Record 3835: County is Hampden")
	void CountyOfRecord3835() {
		assertEquals("Hampden", customers.get(3834).getCounty());
	}

	@Test
	@DisplayName("Record 3835: State is MA")
	void StateOfRecord3835() {
		assertEquals("MA", customers.get(3834).getState());
	}

	@Test
	@DisplayName("Record 3835: ZIP is 1103")
	void ZIPOfRecord3835() {
		assertEquals("1103", customers.get(3834).getZIP());
	}

	@Test
	@DisplayName("Record 3835: Phone is 413-732-1938")
	void PhoneOfRecord3835() {
		assertEquals("413-732-1938", customers.get(3834).getPhone());
	}

	@Test
	@DisplayName("Record 3835: Fax is 413-732-9281")
	void FaxOfRecord3835() {
		assertEquals("413-732-9281", customers.get(3834).getFax());
	}

	@Test
	@DisplayName("Record 3835: Email is ronny@brydel.com")
	void EmailOfRecord3835() {
		assertEquals("ronny@brydel.com", customers.get(3834).getEmail());
	}

	@Test
	@DisplayName("Record 3835: Web is http://www.ronnybrydel.com")
	void WebOfRecord3835() {
		assertEquals("http://www.ronnybrydel.com", customers.get(3834).getWeb());
	}
}
