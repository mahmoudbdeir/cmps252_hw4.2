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

@Tag("47")
class Record_2595 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2595: FirstName is Kathryn")
	void FirstNameOfRecord2595() {
		assertEquals("Kathryn", customers.get(2594).getFirstName());
	}

	@Test
	@DisplayName("Record 2595: LastName is Minic")
	void LastNameOfRecord2595() {
		assertEquals("Minic", customers.get(2594).getLastName());
	}

	@Test
	@DisplayName("Record 2595: Company is Aa Security Lock & Safe")
	void CompanyOfRecord2595() {
		assertEquals("Aa Security Lock & Safe", customers.get(2594).getCompany());
	}

	@Test
	@DisplayName("Record 2595: Address is 69 Bonaventura Dr")
	void AddressOfRecord2595() {
		assertEquals("69 Bonaventura Dr", customers.get(2594).getAddress());
	}

	@Test
	@DisplayName("Record 2595: City is San Jose")
	void CityOfRecord2595() {
		assertEquals("San Jose", customers.get(2594).getCity());
	}

	@Test
	@DisplayName("Record 2595: County is Santa Clara")
	void CountyOfRecord2595() {
		assertEquals("Santa Clara", customers.get(2594).getCounty());
	}

	@Test
	@DisplayName("Record 2595: State is CA")
	void StateOfRecord2595() {
		assertEquals("CA", customers.get(2594).getState());
	}

	@Test
	@DisplayName("Record 2595: ZIP is 95134")
	void ZIPOfRecord2595() {
		assertEquals("95134", customers.get(2594).getZIP());
	}

	@Test
	@DisplayName("Record 2595: Phone is 408-456-8568")
	void PhoneOfRecord2595() {
		assertEquals("408-456-8568", customers.get(2594).getPhone());
	}

	@Test
	@DisplayName("Record 2595: Fax is 408-456-3549")
	void FaxOfRecord2595() {
		assertEquals("408-456-3549", customers.get(2594).getFax());
	}

	@Test
	@DisplayName("Record 2595: Email is kathryn@minic.com")
	void EmailOfRecord2595() {
		assertEquals("kathryn@minic.com", customers.get(2594).getEmail());
	}

	@Test
	@DisplayName("Record 2595: Web is http://www.kathrynminic.com")
	void WebOfRecord2595() {
		assertEquals("http://www.kathrynminic.com", customers.get(2594).getWeb());
	}
}
