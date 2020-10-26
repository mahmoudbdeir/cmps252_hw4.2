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

@Tag("47")
class Record_234 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 234: FirstName is Agustin")
	void FirstNameOfRecord234() {
		assertEquals("Agustin", customers.get(233).getFirstName());
	}

	@Test
	@DisplayName("Record 234: LastName is Slothower")
	void LastNameOfRecord234() {
		assertEquals("Slothower", customers.get(233).getLastName());
	}

	@Test
	@DisplayName("Record 234: Company is Wplw Radio Station")
	void CompanyOfRecord234() {
		assertEquals("Wplw Radio Station", customers.get(233).getCompany());
	}

	@Test
	@DisplayName("Record 234: Address is 300 E Irving Park Rd")
	void AddressOfRecord234() {
		assertEquals("300 E Irving Park Rd", customers.get(233).getAddress());
	}

	@Test
	@DisplayName("Record 234: City is Wood Dale")
	void CityOfRecord234() {
		assertEquals("Wood Dale", customers.get(233).getCity());
	}

	@Test
	@DisplayName("Record 234: County is DuPage")
	void CountyOfRecord234() {
		assertEquals("DuPage", customers.get(233).getCounty());
	}

	@Test
	@DisplayName("Record 234: State is IL")
	void StateOfRecord234() {
		assertEquals("IL", customers.get(233).getState());
	}

	@Test
	@DisplayName("Record 234: ZIP is 60191")
	void ZIPOfRecord234() {
		assertEquals("60191", customers.get(233).getZIP());
	}

	@Test
	@DisplayName("Record 234: Phone is 630-860-6129")
	void PhoneOfRecord234() {
		assertEquals("630-860-6129", customers.get(233).getPhone());
	}

	@Test
	@DisplayName("Record 234: Fax is 630-860-1944")
	void FaxOfRecord234() {
		assertEquals("630-860-1944", customers.get(233).getFax());
	}

	@Test
	@DisplayName("Record 234: Email is agustin@slothower.com")
	void EmailOfRecord234() {
		assertEquals("agustin@slothower.com", customers.get(233).getEmail());
	}

	@Test
	@DisplayName("Record 234: Web is http://www.agustinslothower.com")
	void WebOfRecord234() {
		assertEquals("http://www.agustinslothower.com", customers.get(233).getWeb());
	}
}
