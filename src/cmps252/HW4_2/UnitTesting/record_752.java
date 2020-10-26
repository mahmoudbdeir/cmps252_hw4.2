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

@Tag("49")
class Record_752 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 752: FirstName is Charla")
	void FirstNameOfRecord752() {
		assertEquals("Charla", customers.get(751).getFirstName());
	}

	@Test
	@DisplayName("Record 752: LastName is Titman")
	void LastNameOfRecord752() {
		assertEquals("Titman", customers.get(751).getLastName());
	}

	@Test
	@DisplayName("Record 752: Company is Keyes Temps")
	void CompanyOfRecord752() {
		assertEquals("Keyes Temps", customers.get(751).getCompany());
	}

	@Test
	@DisplayName("Record 752: Address is 451 Parkfair Dr  #-u7")
	void AddressOfRecord752() {
		assertEquals("451 Parkfair Dr  #-u7", customers.get(751).getAddress());
	}

	@Test
	@DisplayName("Record 752: City is Sacramento")
	void CityOfRecord752() {
		assertEquals("Sacramento", customers.get(751).getCity());
	}

	@Test
	@DisplayName("Record 752: County is Sacramento")
	void CountyOfRecord752() {
		assertEquals("Sacramento", customers.get(751).getCounty());
	}

	@Test
	@DisplayName("Record 752: State is CA")
	void StateOfRecord752() {
		assertEquals("CA", customers.get(751).getState());
	}

	@Test
	@DisplayName("Record 752: ZIP is 95864")
	void ZIPOfRecord752() {
		assertEquals("95864", customers.get(751).getZIP());
	}

	@Test
	@DisplayName("Record 752: Phone is 916-972-3762")
	void PhoneOfRecord752() {
		assertEquals("916-972-3762", customers.get(751).getPhone());
	}

	@Test
	@DisplayName("Record 752: Fax is 916-972-5982")
	void FaxOfRecord752() {
		assertEquals("916-972-5982", customers.get(751).getFax());
	}

	@Test
	@DisplayName("Record 752: Email is charla@titman.com")
	void EmailOfRecord752() {
		assertEquals("charla@titman.com", customers.get(751).getEmail());
	}

	@Test
	@DisplayName("Record 752: Web is http://www.charlatitman.com")
	void WebOfRecord752() {
		assertEquals("http://www.charlatitman.com", customers.get(751).getWeb());
	}
}
