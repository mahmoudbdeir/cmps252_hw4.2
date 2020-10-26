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

@Tag("15")
class Record_4014 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4014: FirstName is Blaine")
	void FirstNameOfRecord4014() {
		assertEquals("Blaine", customers.get(4013).getFirstName());
	}

	@Test
	@DisplayName("Record 4014: LastName is Caporali")
	void LastNameOfRecord4014() {
		assertEquals("Caporali", customers.get(4013).getLastName());
	}

	@Test
	@DisplayName("Record 4014: Company is Blue Diamond Growers")
	void CompanyOfRecord4014() {
		assertEquals("Blue Diamond Growers", customers.get(4013).getCompany());
	}

	@Test
	@DisplayName("Record 4014: Address is 2120 Antilley Rd")
	void AddressOfRecord4014() {
		assertEquals("2120 Antilley Rd", customers.get(4013).getAddress());
	}

	@Test
	@DisplayName("Record 4014: City is Abilene")
	void CityOfRecord4014() {
		assertEquals("Abilene", customers.get(4013).getCity());
	}

	@Test
	@DisplayName("Record 4014: County is Taylor")
	void CountyOfRecord4014() {
		assertEquals("Taylor", customers.get(4013).getCounty());
	}

	@Test
	@DisplayName("Record 4014: State is TX")
	void StateOfRecord4014() {
		assertEquals("TX", customers.get(4013).getState());
	}

	@Test
	@DisplayName("Record 4014: ZIP is 79606")
	void ZIPOfRecord4014() {
		assertEquals("79606", customers.get(4013).getZIP());
	}

	@Test
	@DisplayName("Record 4014: Phone is 325-692-4125")
	void PhoneOfRecord4014() {
		assertEquals("325-692-4125", customers.get(4013).getPhone());
	}

	@Test
	@DisplayName("Record 4014: Fax is 325-692-5054")
	void FaxOfRecord4014() {
		assertEquals("325-692-5054", customers.get(4013).getFax());
	}

	@Test
	@DisplayName("Record 4014: Email is blaine@caporali.com")
	void EmailOfRecord4014() {
		assertEquals("blaine@caporali.com", customers.get(4013).getEmail());
	}

	@Test
	@DisplayName("Record 4014: Web is http://www.blainecaporali.com")
	void WebOfRecord4014() {
		assertEquals("http://www.blainecaporali.com", customers.get(4013).getWeb());
	}
}
