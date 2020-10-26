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

@Tag("42")
class Record_3606 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3606: FirstName is Rebecca")
	void FirstNameOfRecord3606() {
		assertEquals("Rebecca", customers.get(3605).getFirstName());
	}

	@Test
	@DisplayName("Record 3606: LastName is Crary")
	void LastNameOfRecord3606() {
		assertEquals("Crary", customers.get(3605).getLastName());
	}

	@Test
	@DisplayName("Record 3606: Company is Greene Grocery Co")
	void CompanyOfRecord3606() {
		assertEquals("Greene Grocery Co", customers.get(3605).getCompany());
	}

	@Test
	@DisplayName("Record 3606: Address is 1201 W Peachtree St Nw")
	void AddressOfRecord3606() {
		assertEquals("1201 W Peachtree St Nw", customers.get(3605).getAddress());
	}

	@Test
	@DisplayName("Record 3606: City is Atlanta")
	void CityOfRecord3606() {
		assertEquals("Atlanta", customers.get(3605).getCity());
	}

	@Test
	@DisplayName("Record 3606: County is Fulton")
	void CountyOfRecord3606() {
		assertEquals("Fulton", customers.get(3605).getCounty());
	}

	@Test
	@DisplayName("Record 3606: State is GA")
	void StateOfRecord3606() {
		assertEquals("GA", customers.get(3605).getState());
	}

	@Test
	@DisplayName("Record 3606: ZIP is 30309")
	void ZIPOfRecord3606() {
		assertEquals("30309", customers.get(3605).getZIP());
	}

	@Test
	@DisplayName("Record 3606: Phone is 404-885-9202")
	void PhoneOfRecord3606() {
		assertEquals("404-885-9202", customers.get(3605).getPhone());
	}

	@Test
	@DisplayName("Record 3606: Fax is 404-885-3683")
	void FaxOfRecord3606() {
		assertEquals("404-885-3683", customers.get(3605).getFax());
	}

	@Test
	@DisplayName("Record 3606: Email is rebecca@crary.com")
	void EmailOfRecord3606() {
		assertEquals("rebecca@crary.com", customers.get(3605).getEmail());
	}

	@Test
	@DisplayName("Record 3606: Web is http://www.rebeccacrary.com")
	void WebOfRecord3606() {
		assertEquals("http://www.rebeccacrary.com", customers.get(3605).getWeb());
	}
}
