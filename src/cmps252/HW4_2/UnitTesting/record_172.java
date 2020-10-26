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

@Tag("37")
class Record_172 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 172: FirstName is Delmer")
	void FirstNameOfRecord172() {
		assertEquals("Delmer", customers.get(171).getFirstName());
	}

	@Test
	@DisplayName("Record 172: LastName is Doster")
	void LastNameOfRecord172() {
		assertEquals("Doster", customers.get(171).getLastName());
	}

	@Test
	@DisplayName("Record 172: Company is Versailles Physical Thrpy Clnc")
	void CompanyOfRecord172() {
		assertEquals("Versailles Physical Thrpy Clnc", customers.get(171).getCompany());
	}

	@Test
	@DisplayName("Record 172: Address is 305 Bloomfield Ave")
	void AddressOfRecord172() {
		assertEquals("305 Bloomfield Ave", customers.get(171).getAddress());
	}

	@Test
	@DisplayName("Record 172: City is Gilroy")
	void CityOfRecord172() {
		assertEquals("Gilroy", customers.get(171).getCity());
	}

	@Test
	@DisplayName("Record 172: County is Santa Clara")
	void CountyOfRecord172() {
		assertEquals("Santa Clara", customers.get(171).getCounty());
	}

	@Test
	@DisplayName("Record 172: State is CA")
	void StateOfRecord172() {
		assertEquals("CA", customers.get(171).getState());
	}

	@Test
	@DisplayName("Record 172: ZIP is 95020")
	void ZIPOfRecord172() {
		assertEquals("95020", customers.get(171).getZIP());
	}

	@Test
	@DisplayName("Record 172: Phone is 408-847-4619")
	void PhoneOfRecord172() {
		assertEquals("408-847-4619", customers.get(171).getPhone());
	}

	@Test
	@DisplayName("Record 172: Fax is 408-847-2226")
	void FaxOfRecord172() {
		assertEquals("408-847-2226", customers.get(171).getFax());
	}

	@Test
	@DisplayName("Record 172: Email is delmer@doster.com")
	void EmailOfRecord172() {
		assertEquals("delmer@doster.com", customers.get(171).getEmail());
	}

	@Test
	@DisplayName("Record 172: Web is http://www.delmerdoster.com")
	void WebOfRecord172() {
		assertEquals("http://www.delmerdoster.com", customers.get(171).getWeb());
	}
}
