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

@Tag("10")
class Record_2690 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2690: FirstName is Francine")
	void FirstNameOfRecord2690() {
		assertEquals("Francine", customers.get(2689).getFirstName());
	}

	@Test
	@DisplayName("Record 2690: LastName is Teper")
	void LastNameOfRecord2690() {
		assertEquals("Teper", customers.get(2689).getLastName());
	}

	@Test
	@DisplayName("Record 2690: Company is Pantagraph")
	void CompanyOfRecord2690() {
		assertEquals("Pantagraph", customers.get(2689).getCompany());
	}

	@Test
	@DisplayName("Record 2690: Address is 30 Montauk Blvd")
	void AddressOfRecord2690() {
		assertEquals("30 Montauk Blvd", customers.get(2689).getAddress());
	}

	@Test
	@DisplayName("Record 2690: City is Oakdale")
	void CityOfRecord2690() {
		assertEquals("Oakdale", customers.get(2689).getCity());
	}

	@Test
	@DisplayName("Record 2690: County is Suffolk")
	void CountyOfRecord2690() {
		assertEquals("Suffolk", customers.get(2689).getCounty());
	}

	@Test
	@DisplayName("Record 2690: State is NY")
	void StateOfRecord2690() {
		assertEquals("NY", customers.get(2689).getState());
	}

	@Test
	@DisplayName("Record 2690: ZIP is 11769")
	void ZIPOfRecord2690() {
		assertEquals("11769", customers.get(2689).getZIP());
	}

	@Test
	@DisplayName("Record 2690: Phone is 631-567-6781")
	void PhoneOfRecord2690() {
		assertEquals("631-567-6781", customers.get(2689).getPhone());
	}

	@Test
	@DisplayName("Record 2690: Fax is 631-567-5185")
	void FaxOfRecord2690() {
		assertEquals("631-567-5185", customers.get(2689).getFax());
	}

	@Test
	@DisplayName("Record 2690: Email is francine@teper.com")
	void EmailOfRecord2690() {
		assertEquals("francine@teper.com", customers.get(2689).getEmail());
	}

	@Test
	@DisplayName("Record 2690: Web is http://www.francineteper.com")
	void WebOfRecord2690() {
		assertEquals("http://www.francineteper.com", customers.get(2689).getWeb());
	}
}
