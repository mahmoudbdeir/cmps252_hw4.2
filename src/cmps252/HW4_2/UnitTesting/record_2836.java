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

@Tag("33")
class Record_2836 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2836: FirstName is Latasha")
	void FirstNameOfRecord2836() {
		assertEquals("Latasha", customers.get(2835).getFirstName());
	}

	@Test
	@DisplayName("Record 2836: LastName is Schlett")
	void LastNameOfRecord2836() {
		assertEquals("Schlett", customers.get(2835).getLastName());
	}

	@Test
	@DisplayName("Record 2836: Company is University Title Co")
	void CompanyOfRecord2836() {
		assertEquals("University Title Co", customers.get(2835).getCompany());
	}

	@Test
	@DisplayName("Record 2836: Address is 1037 N Velasco St")
	void AddressOfRecord2836() {
		assertEquals("1037 N Velasco St", customers.get(2835).getAddress());
	}

	@Test
	@DisplayName("Record 2836: City is Angleton")
	void CityOfRecord2836() {
		assertEquals("Angleton", customers.get(2835).getCity());
	}

	@Test
	@DisplayName("Record 2836: County is Brazoria")
	void CountyOfRecord2836() {
		assertEquals("Brazoria", customers.get(2835).getCounty());
	}

	@Test
	@DisplayName("Record 2836: State is TX")
	void StateOfRecord2836() {
		assertEquals("TX", customers.get(2835).getState());
	}

	@Test
	@DisplayName("Record 2836: ZIP is 77515")
	void ZIPOfRecord2836() {
		assertEquals("77515", customers.get(2835).getZIP());
	}

	@Test
	@DisplayName("Record 2836: Phone is 979-849-9724")
	void PhoneOfRecord2836() {
		assertEquals("979-849-9724", customers.get(2835).getPhone());
	}

	@Test
	@DisplayName("Record 2836: Fax is 979-849-3532")
	void FaxOfRecord2836() {
		assertEquals("979-849-3532", customers.get(2835).getFax());
	}

	@Test
	@DisplayName("Record 2836: Email is latasha@schlett.com")
	void EmailOfRecord2836() {
		assertEquals("latasha@schlett.com", customers.get(2835).getEmail());
	}

	@Test
	@DisplayName("Record 2836: Web is http://www.latashaschlett.com")
	void WebOfRecord2836() {
		assertEquals("http://www.latashaschlett.com", customers.get(2835).getWeb());
	}
}
