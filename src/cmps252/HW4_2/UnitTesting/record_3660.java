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

@Tag("34")
class Record_3660 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3660: FirstName is Nettie")
	void FirstNameOfRecord3660() {
		assertEquals("Nettie", customers.get(3659).getFirstName());
	}

	@Test
	@DisplayName("Record 3660: LastName is Palomino")
	void LastNameOfRecord3660() {
		assertEquals("Palomino", customers.get(3659).getLastName());
	}

	@Test
	@DisplayName("Record 3660: Company is Forsberg, Franklin C")
	void CompanyOfRecord3660() {
		assertEquals("Forsberg, Franklin C", customers.get(3659).getCompany());
	}

	@Test
	@DisplayName("Record 3660: Address is 1600 Washington Blvd")
	void AddressOfRecord3660() {
		assertEquals("1600 Washington Blvd", customers.get(3659).getAddress());
	}

	@Test
	@DisplayName("Record 3660: City is Montebello")
	void CityOfRecord3660() {
		assertEquals("Montebello", customers.get(3659).getCity());
	}

	@Test
	@DisplayName("Record 3660: County is Los Angeles")
	void CountyOfRecord3660() {
		assertEquals("Los Angeles", customers.get(3659).getCounty());
	}

	@Test
	@DisplayName("Record 3660: State is CA")
	void StateOfRecord3660() {
		assertEquals("CA", customers.get(3659).getState());
	}

	@Test
	@DisplayName("Record 3660: ZIP is 90640")
	void ZIPOfRecord3660() {
		assertEquals("90640", customers.get(3659).getZIP());
	}

	@Test
	@DisplayName("Record 3660: Phone is 323-728-5324")
	void PhoneOfRecord3660() {
		assertEquals("323-728-5324", customers.get(3659).getPhone());
	}

	@Test
	@DisplayName("Record 3660: Fax is 323-728-3034")
	void FaxOfRecord3660() {
		assertEquals("323-728-3034", customers.get(3659).getFax());
	}

	@Test
	@DisplayName("Record 3660: Email is nettie@palomino.com")
	void EmailOfRecord3660() {
		assertEquals("nettie@palomino.com", customers.get(3659).getEmail());
	}

	@Test
	@DisplayName("Record 3660: Web is http://www.nettiepalomino.com")
	void WebOfRecord3660() {
		assertEquals("http://www.nettiepalomino.com", customers.get(3659).getWeb());
	}
}
