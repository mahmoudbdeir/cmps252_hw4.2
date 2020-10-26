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

@Tag("31")
class Record_817 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 817: FirstName is Guillermina")
	void FirstNameOfRecord817() {
		assertEquals("Guillermina", customers.get(816).getFirstName());
	}

	@Test
	@DisplayName("Record 817: LastName is Westenbarger")
	void LastNameOfRecord817() {
		assertEquals("Westenbarger", customers.get(816).getLastName());
	}

	@Test
	@DisplayName("Record 817: Company is Paoli, Peter P")
	void CompanyOfRecord817() {
		assertEquals("Paoli, Peter P", customers.get(816).getCompany());
	}

	@Test
	@DisplayName("Record 817: Address is 424 E Dixon St")
	void AddressOfRecord817() {
		assertEquals("424 E Dixon St", customers.get(816).getAddress());
	}

	@Test
	@DisplayName("Record 817: City is Compton")
	void CityOfRecord817() {
		assertEquals("Compton", customers.get(816).getCity());
	}

	@Test
	@DisplayName("Record 817: County is Los Angeles")
	void CountyOfRecord817() {
		assertEquals("Los Angeles", customers.get(816).getCounty());
	}

	@Test
	@DisplayName("Record 817: State is CA")
	void StateOfRecord817() {
		assertEquals("CA", customers.get(816).getState());
	}

	@Test
	@DisplayName("Record 817: ZIP is 90222")
	void ZIPOfRecord817() {
		assertEquals("90222", customers.get(816).getZIP());
	}

	@Test
	@DisplayName("Record 817: Phone is 310-637-8206")
	void PhoneOfRecord817() {
		assertEquals("310-637-8206", customers.get(816).getPhone());
	}

	@Test
	@DisplayName("Record 817: Fax is 310-637-5748")
	void FaxOfRecord817() {
		assertEquals("310-637-5748", customers.get(816).getFax());
	}

	@Test
	@DisplayName("Record 817: Email is guillermina@westenbarger.com")
	void EmailOfRecord817() {
		assertEquals("guillermina@westenbarger.com", customers.get(816).getEmail());
	}

	@Test
	@DisplayName("Record 817: Web is http://www.guillerminawestenbarger.com")
	void WebOfRecord817() {
		assertEquals("http://www.guillerminawestenbarger.com", customers.get(816).getWeb());
	}
}
