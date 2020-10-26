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

@Tag("30")
class Record_229 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 229: FirstName is Amie")
	void FirstNameOfRecord229() {
		assertEquals("Amie", customers.get(228).getFirstName());
	}

	@Test
	@DisplayName("Record 229: LastName is Laudat")
	void LastNameOfRecord229() {
		assertEquals("Laudat", customers.get(228).getLastName());
	}

	@Test
	@DisplayName("Record 229: Company is Sentry Turnstiles")
	void CompanyOfRecord229() {
		assertEquals("Sentry Turnstiles", customers.get(228).getCompany());
	}

	@Test
	@DisplayName("Record 229: Address is 400 E 5th St")
	void AddressOfRecord229() {
		assertEquals("400 E 5th St", customers.get(228).getAddress());
	}

	@Test
	@DisplayName("Record 229: City is Del Rio")
	void CityOfRecord229() {
		assertEquals("Del Rio", customers.get(228).getCity());
	}

	@Test
	@DisplayName("Record 229: County is Val Verde")
	void CountyOfRecord229() {
		assertEquals("Val Verde", customers.get(228).getCounty());
	}

	@Test
	@DisplayName("Record 229: State is TX")
	void StateOfRecord229() {
		assertEquals("TX", customers.get(228).getState());
	}

	@Test
	@DisplayName("Record 229: ZIP is 78840")
	void ZIPOfRecord229() {
		assertEquals("78840", customers.get(228).getZIP());
	}

	@Test
	@DisplayName("Record 229: Phone is 830-775-8895")
	void PhoneOfRecord229() {
		assertEquals("830-775-8895", customers.get(228).getPhone());
	}

	@Test
	@DisplayName("Record 229: Fax is 830-775-9441")
	void FaxOfRecord229() {
		assertEquals("830-775-9441", customers.get(228).getFax());
	}

	@Test
	@DisplayName("Record 229: Email is amie@laudat.com")
	void EmailOfRecord229() {
		assertEquals("amie@laudat.com", customers.get(228).getEmail());
	}

	@Test
	@DisplayName("Record 229: Web is http://www.amielaudat.com")
	void WebOfRecord229() {
		assertEquals("http://www.amielaudat.com", customers.get(228).getWeb());
	}
}
