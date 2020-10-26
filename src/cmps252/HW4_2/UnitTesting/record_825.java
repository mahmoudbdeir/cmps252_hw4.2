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

@Tag("5")
class Record_825 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 825: FirstName is Rufus")
	void FirstNameOfRecord825() {
		assertEquals("Rufus", customers.get(824).getFirstName());
	}

	@Test
	@DisplayName("Record 825: LastName is Socorro")
	void LastNameOfRecord825() {
		assertEquals("Socorro", customers.get(824).getLastName());
	}

	@Test
	@DisplayName("Record 825: Company is Guenthner, Robert I Esq")
	void CompanyOfRecord825() {
		assertEquals("Guenthner, Robert I Esq", customers.get(824).getCompany());
	}

	@Test
	@DisplayName("Record 825: Address is 3123 Cameron St")
	void AddressOfRecord825() {
		assertEquals("3123 Cameron St", customers.get(824).getAddress());
	}

	@Test
	@DisplayName("Record 825: City is Lafayette")
	void CityOfRecord825() {
		assertEquals("Lafayette", customers.get(824).getCity());
	}

	@Test
	@DisplayName("Record 825: County is Lafayette")
	void CountyOfRecord825() {
		assertEquals("Lafayette", customers.get(824).getCounty());
	}

	@Test
	@DisplayName("Record 825: State is LA")
	void StateOfRecord825() {
		assertEquals("LA", customers.get(824).getState());
	}

	@Test
	@DisplayName("Record 825: ZIP is 70506")
	void ZIPOfRecord825() {
		assertEquals("70506", customers.get(824).getZIP());
	}

	@Test
	@DisplayName("Record 825: Phone is 337-261-5258")
	void PhoneOfRecord825() {
		assertEquals("337-261-5258", customers.get(824).getPhone());
	}

	@Test
	@DisplayName("Record 825: Fax is 337-261-3236")
	void FaxOfRecord825() {
		assertEquals("337-261-3236", customers.get(824).getFax());
	}

	@Test
	@DisplayName("Record 825: Email is rufus@socorro.com")
	void EmailOfRecord825() {
		assertEquals("rufus@socorro.com", customers.get(824).getEmail());
	}

	@Test
	@DisplayName("Record 825: Web is http://www.rufussocorro.com")
	void WebOfRecord825() {
		assertEquals("http://www.rufussocorro.com", customers.get(824).getWeb());
	}
}
