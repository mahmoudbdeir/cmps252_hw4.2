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

@Tag("7")
class Record_3477 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3477: FirstName is Nadine")
	void FirstNameOfRecord3477() {
		assertEquals("Nadine", customers.get(3476).getFirstName());
	}

	@Test
	@DisplayName("Record 3477: LastName is Papps")
	void LastNameOfRecord3477() {
		assertEquals("Papps", customers.get(3476).getLastName());
	}

	@Test
	@DisplayName("Record 3477: Company is Crates & Pallets")
	void CompanyOfRecord3477() {
		assertEquals("Crates & Pallets", customers.get(3476).getCompany());
	}

	@Test
	@DisplayName("Record 3477: Address is 25 Bridle Ln")
	void AddressOfRecord3477() {
		assertEquals("25 Bridle Ln", customers.get(3476).getAddress());
	}

	@Test
	@DisplayName("Record 3477: City is Westborough")
	void CityOfRecord3477() {
		assertEquals("Westborough", customers.get(3476).getCity());
	}

	@Test
	@DisplayName("Record 3477: County is Worcester")
	void CountyOfRecord3477() {
		assertEquals("Worcester", customers.get(3476).getCounty());
	}

	@Test
	@DisplayName("Record 3477: State is MA")
	void StateOfRecord3477() {
		assertEquals("MA", customers.get(3476).getState());
	}

	@Test
	@DisplayName("Record 3477: ZIP is 1581")
	void ZIPOfRecord3477() {
		assertEquals("1581", customers.get(3476).getZIP());
	}

	@Test
	@DisplayName("Record 3477: Phone is 508-836-5823")
	void PhoneOfRecord3477() {
		assertEquals("508-836-5823", customers.get(3476).getPhone());
	}

	@Test
	@DisplayName("Record 3477: Fax is 508-836-2183")
	void FaxOfRecord3477() {
		assertEquals("508-836-2183", customers.get(3476).getFax());
	}

	@Test
	@DisplayName("Record 3477: Email is nadine@papps.com")
	void EmailOfRecord3477() {
		assertEquals("nadine@papps.com", customers.get(3476).getEmail());
	}

	@Test
	@DisplayName("Record 3477: Web is http://www.nadinepapps.com")
	void WebOfRecord3477() {
		assertEquals("http://www.nadinepapps.com", customers.get(3476).getWeb());
	}
}
