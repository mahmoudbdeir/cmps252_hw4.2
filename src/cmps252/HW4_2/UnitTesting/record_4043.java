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

@Tag("19")
class Record_4043 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4043: FirstName is Sofia")
	void FirstNameOfRecord4043() {
		assertEquals("Sofia", customers.get(4042).getFirstName());
	}

	@Test
	@DisplayName("Record 4043: LastName is Bracero")
	void LastNameOfRecord4043() {
		assertEquals("Bracero", customers.get(4042).getLastName());
	}

	@Test
	@DisplayName("Record 4043: Company is Synenberg, Roger M Esq")
	void CompanyOfRecord4043() {
		assertEquals("Synenberg, Roger M Esq", customers.get(4042).getCompany());
	}

	@Test
	@DisplayName("Record 4043: Address is 200 Wales St")
	void AddressOfRecord4043() {
		assertEquals("200 Wales St", customers.get(4042).getAddress());
	}

	@Test
	@DisplayName("Record 4043: City is Abington")
	void CityOfRecord4043() {
		assertEquals("Abington", customers.get(4042).getCity());
	}

	@Test
	@DisplayName("Record 4043: County is Plymouth")
	void CountyOfRecord4043() {
		assertEquals("Plymouth", customers.get(4042).getCounty());
	}

	@Test
	@DisplayName("Record 4043: State is MA")
	void StateOfRecord4043() {
		assertEquals("MA", customers.get(4042).getState());
	}

	@Test
	@DisplayName("Record 4043: ZIP is 2351")
	void ZIPOfRecord4043() {
		assertEquals("2351", customers.get(4042).getZIP());
	}

	@Test
	@DisplayName("Record 4043: Phone is 781-871-3055")
	void PhoneOfRecord4043() {
		assertEquals("781-871-3055", customers.get(4042).getPhone());
	}

	@Test
	@DisplayName("Record 4043: Fax is 781-871-0428")
	void FaxOfRecord4043() {
		assertEquals("781-871-0428", customers.get(4042).getFax());
	}

	@Test
	@DisplayName("Record 4043: Email is sofia@bracero.com")
	void EmailOfRecord4043() {
		assertEquals("sofia@bracero.com", customers.get(4042).getEmail());
	}

	@Test
	@DisplayName("Record 4043: Web is http://www.sofiabracero.com")
	void WebOfRecord4043() {
		assertEquals("http://www.sofiabracero.com", customers.get(4042).getWeb());
	}
}
