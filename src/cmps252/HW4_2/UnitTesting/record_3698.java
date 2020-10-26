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

@Tag("44")
class Record_3698 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3698: FirstName is Bernard")
	void FirstNameOfRecord3698() {
		assertEquals("Bernard", customers.get(3697).getFirstName());
	}

	@Test
	@DisplayName("Record 3698: LastName is Thoma")
	void LastNameOfRecord3698() {
		assertEquals("Thoma", customers.get(3697).getLastName());
	}

	@Test
	@DisplayName("Record 3698: Company is Uncommon Hands")
	void CompanyOfRecord3698() {
		assertEquals("Uncommon Hands", customers.get(3697).getCompany());
	}

	@Test
	@DisplayName("Record 3698: Address is 1245 Shawmut Ave")
	void AddressOfRecord3698() {
		assertEquals("1245 Shawmut Ave", customers.get(3697).getAddress());
	}

	@Test
	@DisplayName("Record 3698: City is New Bedford")
	void CityOfRecord3698() {
		assertEquals("New Bedford", customers.get(3697).getCity());
	}

	@Test
	@DisplayName("Record 3698: County is Bristol")
	void CountyOfRecord3698() {
		assertEquals("Bristol", customers.get(3697).getCounty());
	}

	@Test
	@DisplayName("Record 3698: State is MA")
	void StateOfRecord3698() {
		assertEquals("MA", customers.get(3697).getState());
	}

	@Test
	@DisplayName("Record 3698: ZIP is 2746")
	void ZIPOfRecord3698() {
		assertEquals("2746", customers.get(3697).getZIP());
	}

	@Test
	@DisplayName("Record 3698: Phone is 508-996-1674")
	void PhoneOfRecord3698() {
		assertEquals("508-996-1674", customers.get(3697).getPhone());
	}

	@Test
	@DisplayName("Record 3698: Fax is 508-996-0528")
	void FaxOfRecord3698() {
		assertEquals("508-996-0528", customers.get(3697).getFax());
	}

	@Test
	@DisplayName("Record 3698: Email is bernard@thoma.com")
	void EmailOfRecord3698() {
		assertEquals("bernard@thoma.com", customers.get(3697).getEmail());
	}

	@Test
	@DisplayName("Record 3698: Web is http://www.bernardthoma.com")
	void WebOfRecord3698() {
		assertEquals("http://www.bernardthoma.com", customers.get(3697).getWeb());
	}
}
