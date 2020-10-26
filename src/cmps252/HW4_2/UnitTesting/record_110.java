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

@Tag("32")
class Record_110 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 110: FirstName is Orval")
	void FirstNameOfRecord110() {
		assertEquals("Orval", customers.get(109).getFirstName());
	}

	@Test
	@DisplayName("Record 110: LastName is Chiarini")
	void LastNameOfRecord110() {
		assertEquals("Chiarini", customers.get(109).getLastName());
	}

	@Test
	@DisplayName("Record 110: Company is City Lights Inc")
	void CompanyOfRecord110() {
		assertEquals("City Lights Inc", customers.get(109).getCompany());
	}

	@Test
	@DisplayName("Record 110: Address is 341 Queens Row")
	void AddressOfRecord110() {
		assertEquals("341 Queens Row", customers.get(109).getAddress());
	}

	@Test
	@DisplayName("Record 110: City is Lafayette")
	void CityOfRecord110() {
		assertEquals("Lafayette", customers.get(109).getCity());
	}

	@Test
	@DisplayName("Record 110: County is Lafayette")
	void CountyOfRecord110() {
		assertEquals("Lafayette", customers.get(109).getCounty());
	}

	@Test
	@DisplayName("Record 110: State is LA")
	void StateOfRecord110() {
		assertEquals("LA", customers.get(109).getState());
	}

	@Test
	@DisplayName("Record 110: ZIP is 70508")
	void ZIPOfRecord110() {
		assertEquals("70508", customers.get(109).getZIP());
	}

	@Test
	@DisplayName("Record 110: Phone is 337-232-5778")
	void PhoneOfRecord110() {
		assertEquals("337-232-5778", customers.get(109).getPhone());
	}

	@Test
	@DisplayName("Record 110: Fax is 337-232-7243")
	void FaxOfRecord110() {
		assertEquals("337-232-7243", customers.get(109).getFax());
	}

	@Test
	@DisplayName("Record 110: Email is orval@chiarini.com")
	void EmailOfRecord110() {
		assertEquals("orval@chiarini.com", customers.get(109).getEmail());
	}

	@Test
	@DisplayName("Record 110: Web is http://www.orvalchiarini.com")
	void WebOfRecord110() {
		assertEquals("http://www.orvalchiarini.com", customers.get(109).getWeb());
	}
}
