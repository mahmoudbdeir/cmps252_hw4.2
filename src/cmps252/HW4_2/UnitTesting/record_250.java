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

@Tag("37")
class Record_250 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 250: FirstName is Lyndon")
	void FirstNameOfRecord250() {
		assertEquals("Lyndon", customers.get(249).getFirstName());
	}

	@Test
	@DisplayName("Record 250: LastName is Rater")
	void LastNameOfRecord250() {
		assertEquals("Rater", customers.get(249).getLastName());
	}

	@Test
	@DisplayName("Record 250: Company is J T Lions & Associates")
	void CompanyOfRecord250() {
		assertEquals("J T Lions & Associates", customers.get(249).getCompany());
	}

	@Test
	@DisplayName("Record 250: Address is 204 Huntingdon Dr")
	void AddressOfRecord250() {
		assertEquals("204 Huntingdon Dr", customers.get(249).getAddress());
	}

	@Test
	@DisplayName("Record 250: City is Irving")
	void CityOfRecord250() {
		assertEquals("Irving", customers.get(249).getCity());
	}

	@Test
	@DisplayName("Record 250: County is Dallas")
	void CountyOfRecord250() {
		assertEquals("Dallas", customers.get(249).getCounty());
	}

	@Test
	@DisplayName("Record 250: State is TX")
	void StateOfRecord250() {
		assertEquals("TX", customers.get(249).getState());
	}

	@Test
	@DisplayName("Record 250: ZIP is 75061")
	void ZIPOfRecord250() {
		assertEquals("75061", customers.get(249).getZIP());
	}

	@Test
	@DisplayName("Record 250: Phone is 972-986-3207")
	void PhoneOfRecord250() {
		assertEquals("972-986-3207", customers.get(249).getPhone());
	}

	@Test
	@DisplayName("Record 250: Fax is 972-986-3368")
	void FaxOfRecord250() {
		assertEquals("972-986-3368", customers.get(249).getFax());
	}

	@Test
	@DisplayName("Record 250: Email is lyndon@rater.com")
	void EmailOfRecord250() {
		assertEquals("lyndon@rater.com", customers.get(249).getEmail());
	}

	@Test
	@DisplayName("Record 250: Web is http://www.lyndonrater.com")
	void WebOfRecord250() {
		assertEquals("http://www.lyndonrater.com", customers.get(249).getWeb());
	}
}
