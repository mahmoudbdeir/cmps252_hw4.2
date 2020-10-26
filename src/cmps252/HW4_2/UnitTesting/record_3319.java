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

@Tag("0")
class Record_3319 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3319: FirstName is Ben")
	void FirstNameOfRecord3319() {
		assertEquals("Ben", customers.get(3318).getFirstName());
	}

	@Test
	@DisplayName("Record 3319: LastName is Sanasith")
	void LastNameOfRecord3319() {
		assertEquals("Sanasith", customers.get(3318).getLastName());
	}

	@Test
	@DisplayName("Record 3319: Company is Concession Supply Co")
	void CompanyOfRecord3319() {
		assertEquals("Concession Supply Co", customers.get(3318).getCompany());
	}

	@Test
	@DisplayName("Record 3319: Address is 1501 Alameda")
	void AddressOfRecord3319() {
		assertEquals("1501 Alameda", customers.get(3318).getAddress());
	}

	@Test
	@DisplayName("Record 3319: City is San Jose")
	void CityOfRecord3319() {
		assertEquals("San Jose", customers.get(3318).getCity());
	}

	@Test
	@DisplayName("Record 3319: County is Santa Clara")
	void CountyOfRecord3319() {
		assertEquals("Santa Clara", customers.get(3318).getCounty());
	}

	@Test
	@DisplayName("Record 3319: State is CA")
	void StateOfRecord3319() {
		assertEquals("CA", customers.get(3318).getState());
	}

	@Test
	@DisplayName("Record 3319: ZIP is 95126")
	void ZIPOfRecord3319() {
		assertEquals("95126", customers.get(3318).getZIP());
	}

	@Test
	@DisplayName("Record 3319: Phone is 408-297-9335")
	void PhoneOfRecord3319() {
		assertEquals("408-297-9335", customers.get(3318).getPhone());
	}

	@Test
	@DisplayName("Record 3319: Fax is 408-297-0551")
	void FaxOfRecord3319() {
		assertEquals("408-297-0551", customers.get(3318).getFax());
	}

	@Test
	@DisplayName("Record 3319: Email is ben@sanasith.com")
	void EmailOfRecord3319() {
		assertEquals("ben@sanasith.com", customers.get(3318).getEmail());
	}

	@Test
	@DisplayName("Record 3319: Web is http://www.bensanasith.com")
	void WebOfRecord3319() {
		assertEquals("http://www.bensanasith.com", customers.get(3318).getWeb());
	}
}
