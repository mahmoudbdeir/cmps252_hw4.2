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
class Record_551 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 551: FirstName is Selina")
	void FirstNameOfRecord551() {
		assertEquals("Selina", customers.get(550).getFirstName());
	}

	@Test
	@DisplayName("Record 551: LastName is Startt")
	void LastNameOfRecord551() {
		assertEquals("Startt", customers.get(550).getLastName());
	}

	@Test
	@DisplayName("Record 551: Company is V R H Construction Corp")
	void CompanyOfRecord551() {
		assertEquals("V R H Construction Corp", customers.get(550).getCompany());
	}

	@Test
	@DisplayName("Record 551: Address is 1642 Beason St")
	void AddressOfRecord551() {
		assertEquals("1642 Beason St", customers.get(550).getAddress());
	}

	@Test
	@DisplayName("Record 551: City is Baltimore")
	void CityOfRecord551() {
		assertEquals("Baltimore", customers.get(550).getCity());
	}

	@Test
	@DisplayName("Record 551: County is Baltimore City")
	void CountyOfRecord551() {
		assertEquals("Baltimore City", customers.get(550).getCounty());
	}

	@Test
	@DisplayName("Record 551: State is MD")
	void StateOfRecord551() {
		assertEquals("MD", customers.get(550).getState());
	}

	@Test
	@DisplayName("Record 551: ZIP is 21230")
	void ZIPOfRecord551() {
		assertEquals("21230", customers.get(550).getZIP());
	}

	@Test
	@DisplayName("Record 551: Phone is 410-625-7989")
	void PhoneOfRecord551() {
		assertEquals("410-625-7989", customers.get(550).getPhone());
	}

	@Test
	@DisplayName("Record 551: Fax is 410-625-0676")
	void FaxOfRecord551() {
		assertEquals("410-625-0676", customers.get(550).getFax());
	}

	@Test
	@DisplayName("Record 551: Email is selina@startt.com")
	void EmailOfRecord551() {
		assertEquals("selina@startt.com", customers.get(550).getEmail());
	}

	@Test
	@DisplayName("Record 551: Web is http://www.selinastartt.com")
	void WebOfRecord551() {
		assertEquals("http://www.selinastartt.com", customers.get(550).getWeb());
	}
}
