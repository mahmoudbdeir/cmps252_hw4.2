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

@Tag("24")
class Record_2734 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2734: FirstName is Eva")
	void FirstNameOfRecord2734() {
		assertEquals("Eva", customers.get(2733).getFirstName());
	}

	@Test
	@DisplayName("Record 2734: LastName is Fullenwider")
	void LastNameOfRecord2734() {
		assertEquals("Fullenwider", customers.get(2733).getLastName());
	}

	@Test
	@DisplayName("Record 2734: Company is Alcone Co Inc")
	void CompanyOfRecord2734() {
		assertEquals("Alcone Co Inc", customers.get(2733).getCompany());
	}

	@Test
	@DisplayName("Record 2734: Address is 41 Newman Springs Rd E")
	void AddressOfRecord2734() {
		assertEquals("41 Newman Springs Rd E", customers.get(2733).getAddress());
	}

	@Test
	@DisplayName("Record 2734: City is Shrewsbury")
	void CityOfRecord2734() {
		assertEquals("Shrewsbury", customers.get(2733).getCity());
	}

	@Test
	@DisplayName("Record 2734: County is Monmouth")
	void CountyOfRecord2734() {
		assertEquals("Monmouth", customers.get(2733).getCounty());
	}

	@Test
	@DisplayName("Record 2734: State is NJ")
	void StateOfRecord2734() {
		assertEquals("NJ", customers.get(2733).getState());
	}

	@Test
	@DisplayName("Record 2734: ZIP is 07702")
	void ZIPOfRecord2734() {
		assertEquals("07702", customers.get(2733).getZIP());
	}

	@Test
	@DisplayName("Record 2734: Phone is 732-530-7897")
	void PhoneOfRecord2734() {
		assertEquals("732-530-7897", customers.get(2733).getPhone());
	}

	@Test
	@DisplayName("Record 2734: Fax is 732-530-2113")
	void FaxOfRecord2734() {
		assertEquals("732-530-2113", customers.get(2733).getFax());
	}

	@Test
	@DisplayName("Record 2734: Email is eva@fullenwider.com")
	void EmailOfRecord2734() {
		assertEquals("eva@fullenwider.com", customers.get(2733).getEmail());
	}

	@Test
	@DisplayName("Record 2734: Web is http://www.evafullenwider.com")
	void WebOfRecord2734() {
		assertEquals("http://www.evafullenwider.com", customers.get(2733).getWeb());
	}
}
