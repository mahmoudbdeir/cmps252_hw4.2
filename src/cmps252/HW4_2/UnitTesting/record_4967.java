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
class Record_4967 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4967: FirstName is Zoila")
	void FirstNameOfRecord4967() {
		assertEquals("Zoila", customers.get(4966).getFirstName());
	}

	@Test
	@DisplayName("Record 4967: LastName is Plese")
	void LastNameOfRecord4967() {
		assertEquals("Plese", customers.get(4966).getLastName());
	}

	@Test
	@DisplayName("Record 4967: Company is Flanigan, Timothy Md")
	void CompanyOfRecord4967() {
		assertEquals("Flanigan, Timothy Md", customers.get(4966).getCompany());
	}

	@Test
	@DisplayName("Record 4967: Address is 98 Battery St  #-600")
	void AddressOfRecord4967() {
		assertEquals("98 Battery St  #-600", customers.get(4966).getAddress());
	}

	@Test
	@DisplayName("Record 4967: City is San Francisco")
	void CityOfRecord4967() {
		assertEquals("San Francisco", customers.get(4966).getCity());
	}

	@Test
	@DisplayName("Record 4967: County is San Francisco")
	void CountyOfRecord4967() {
		assertEquals("San Francisco", customers.get(4966).getCounty());
	}

	@Test
	@DisplayName("Record 4967: State is CA")
	void StateOfRecord4967() {
		assertEquals("CA", customers.get(4966).getState());
	}

	@Test
	@DisplayName("Record 4967: ZIP is 94111")
	void ZIPOfRecord4967() {
		assertEquals("94111", customers.get(4966).getZIP());
	}

	@Test
	@DisplayName("Record 4967: Phone is 415-989-7027")
	void PhoneOfRecord4967() {
		assertEquals("415-989-7027", customers.get(4966).getPhone());
	}

	@Test
	@DisplayName("Record 4967: Fax is 415-989-6076")
	void FaxOfRecord4967() {
		assertEquals("415-989-6076", customers.get(4966).getFax());
	}

	@Test
	@DisplayName("Record 4967: Email is zoila@plese.com")
	void EmailOfRecord4967() {
		assertEquals("zoila@plese.com", customers.get(4966).getEmail());
	}

	@Test
	@DisplayName("Record 4967: Web is http://www.zoilaplese.com")
	void WebOfRecord4967() {
		assertEquals("http://www.zoilaplese.com", customers.get(4966).getWeb());
	}
}
