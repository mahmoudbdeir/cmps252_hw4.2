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

@Tag("18")
class Record_3119 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3119: FirstName is Lucius")
	void FirstNameOfRecord3119() {
		assertEquals("Lucius", customers.get(3118).getFirstName());
	}

	@Test
	@DisplayName("Record 3119: LastName is Demien")
	void LastNameOfRecord3119() {
		assertEquals("Demien", customers.get(3118).getLastName());
	}

	@Test
	@DisplayName("Record 3119: Company is H D K Machine Inc")
	void CompanyOfRecord3119() {
		assertEquals("H D K Machine Inc", customers.get(3118).getCompany());
	}

	@Test
	@DisplayName("Record 3119: Address is 5640 Wayside Dr")
	void AddressOfRecord3119() {
		assertEquals("5640 Wayside Dr", customers.get(3118).getAddress());
	}

	@Test
	@DisplayName("Record 3119: City is Sanford")
	void CityOfRecord3119() {
		assertEquals("Sanford", customers.get(3118).getCity());
	}

	@Test
	@DisplayName("Record 3119: County is Seminole")
	void CountyOfRecord3119() {
		assertEquals("Seminole", customers.get(3118).getCounty());
	}

	@Test
	@DisplayName("Record 3119: State is FL")
	void StateOfRecord3119() {
		assertEquals("FL", customers.get(3118).getState());
	}

	@Test
	@DisplayName("Record 3119: ZIP is 32771")
	void ZIPOfRecord3119() {
		assertEquals("32771", customers.get(3118).getZIP());
	}

	@Test
	@DisplayName("Record 3119: Phone is 407-339-2926")
	void PhoneOfRecord3119() {
		assertEquals("407-339-2926", customers.get(3118).getPhone());
	}

	@Test
	@DisplayName("Record 3119: Fax is 407-339-4969")
	void FaxOfRecord3119() {
		assertEquals("407-339-4969", customers.get(3118).getFax());
	}

	@Test
	@DisplayName("Record 3119: Email is lucius@demien.com")
	void EmailOfRecord3119() {
		assertEquals("lucius@demien.com", customers.get(3118).getEmail());
	}

	@Test
	@DisplayName("Record 3119: Web is http://www.luciusdemien.com")
	void WebOfRecord3119() {
		assertEquals("http://www.luciusdemien.com", customers.get(3118).getWeb());
	}
}
