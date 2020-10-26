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

@Tag("12")
class Record_3163 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3163: FirstName is Charmaine")
	void FirstNameOfRecord3163() {
		assertEquals("Charmaine", customers.get(3162).getFirstName());
	}

	@Test
	@DisplayName("Record 3163: LastName is Cheeseman")
	void LastNameOfRecord3163() {
		assertEquals("Cheeseman", customers.get(3162).getLastName());
	}

	@Test
	@DisplayName("Record 3163: Company is Phoenix Media Commctns Grp")
	void CompanyOfRecord3163() {
		assertEquals("Phoenix Media Commctns Grp", customers.get(3162).getCompany());
	}

	@Test
	@DisplayName("Record 3163: Address is 315 E 62nd St")
	void AddressOfRecord3163() {
		assertEquals("315 E 62nd St", customers.get(3162).getAddress());
	}

	@Test
	@DisplayName("Record 3163: City is New York")
	void CityOfRecord3163() {
		assertEquals("New York", customers.get(3162).getCity());
	}

	@Test
	@DisplayName("Record 3163: County is New York")
	void CountyOfRecord3163() {
		assertEquals("New York", customers.get(3162).getCounty());
	}

	@Test
	@DisplayName("Record 3163: State is NY")
	void StateOfRecord3163() {
		assertEquals("NY", customers.get(3162).getState());
	}

	@Test
	@DisplayName("Record 3163: ZIP is 10021")
	void ZIPOfRecord3163() {
		assertEquals("10021", customers.get(3162).getZIP());
	}

	@Test
	@DisplayName("Record 3163: Phone is 212-758-0404")
	void PhoneOfRecord3163() {
		assertEquals("212-758-0404", customers.get(3162).getPhone());
	}

	@Test
	@DisplayName("Record 3163: Fax is 212-758-2735")
	void FaxOfRecord3163() {
		assertEquals("212-758-2735", customers.get(3162).getFax());
	}

	@Test
	@DisplayName("Record 3163: Email is charmaine@cheeseman.com")
	void EmailOfRecord3163() {
		assertEquals("charmaine@cheeseman.com", customers.get(3162).getEmail());
	}

	@Test
	@DisplayName("Record 3163: Web is http://www.charmainecheeseman.com")
	void WebOfRecord3163() {
		assertEquals("http://www.charmainecheeseman.com", customers.get(3162).getWeb());
	}
}
