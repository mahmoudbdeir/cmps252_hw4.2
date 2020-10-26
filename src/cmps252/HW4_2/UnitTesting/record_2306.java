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

@Tag("46")
class Record_2306 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2306: FirstName is Eloisa")
	void FirstNameOfRecord2306() {
		assertEquals("Eloisa", customers.get(2305).getFirstName());
	}

	@Test
	@DisplayName("Record 2306: LastName is Mallonee")
	void LastNameOfRecord2306() {
		assertEquals("Mallonee", customers.get(2305).getLastName());
	}

	@Test
	@DisplayName("Record 2306: Company is Executive Clemency Board")
	void CompanyOfRecord2306() {
		assertEquals("Executive Clemency Board", customers.get(2305).getCompany());
	}

	@Test
	@DisplayName("Record 2306: Address is 928 S Cedar Ridge Dr")
	void AddressOfRecord2306() {
		assertEquals("928 S Cedar Ridge Dr", customers.get(2305).getAddress());
	}

	@Test
	@DisplayName("Record 2306: City is Duncanville")
	void CityOfRecord2306() {
		assertEquals("Duncanville", customers.get(2305).getCity());
	}

	@Test
	@DisplayName("Record 2306: County is Dallas")
	void CountyOfRecord2306() {
		assertEquals("Dallas", customers.get(2305).getCounty());
	}

	@Test
	@DisplayName("Record 2306: State is TX")
	void StateOfRecord2306() {
		assertEquals("TX", customers.get(2305).getState());
	}

	@Test
	@DisplayName("Record 2306: ZIP is 75137")
	void ZIPOfRecord2306() {
		assertEquals("75137", customers.get(2305).getZIP());
	}

	@Test
	@DisplayName("Record 2306: Phone is 972-709-6243")
	void PhoneOfRecord2306() {
		assertEquals("972-709-6243", customers.get(2305).getPhone());
	}

	@Test
	@DisplayName("Record 2306: Fax is 972-709-2968")
	void FaxOfRecord2306() {
		assertEquals("972-709-2968", customers.get(2305).getFax());
	}

	@Test
	@DisplayName("Record 2306: Email is eloisa@mallonee.com")
	void EmailOfRecord2306() {
		assertEquals("eloisa@mallonee.com", customers.get(2305).getEmail());
	}

	@Test
	@DisplayName("Record 2306: Web is http://www.eloisamallonee.com")
	void WebOfRecord2306() {
		assertEquals("http://www.eloisamallonee.com", customers.get(2305).getWeb());
	}
}
