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
class Record_629 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 629: FirstName is Ronnie")
	void FirstNameOfRecord629() {
		assertEquals("Ronnie", customers.get(628).getFirstName());
	}

	@Test
	@DisplayName("Record 629: LastName is Latus")
	void LastNameOfRecord629() {
		assertEquals("Latus", customers.get(628).getLastName());
	}

	@Test
	@DisplayName("Record 629: Company is Anderson, Jeffrey C Esq")
	void CompanyOfRecord629() {
		assertEquals("Anderson, Jeffrey C Esq", customers.get(628).getCompany());
	}

	@Test
	@DisplayName("Record 629: Address is 451 Parkfair Dr")
	void AddressOfRecord629() {
		assertEquals("451 Parkfair Dr", customers.get(628).getAddress());
	}

	@Test
	@DisplayName("Record 629: City is Sacramento")
	void CityOfRecord629() {
		assertEquals("Sacramento", customers.get(628).getCity());
	}

	@Test
	@DisplayName("Record 629: County is Sacramento")
	void CountyOfRecord629() {
		assertEquals("Sacramento", customers.get(628).getCounty());
	}

	@Test
	@DisplayName("Record 629: State is CA")
	void StateOfRecord629() {
		assertEquals("CA", customers.get(628).getState());
	}

	@Test
	@DisplayName("Record 629: ZIP is 95864")
	void ZIPOfRecord629() {
		assertEquals("95864", customers.get(628).getZIP());
	}

	@Test
	@DisplayName("Record 629: Phone is 916-972-5797")
	void PhoneOfRecord629() {
		assertEquals("916-972-5797", customers.get(628).getPhone());
	}

	@Test
	@DisplayName("Record 629: Fax is 916-972-2766")
	void FaxOfRecord629() {
		assertEquals("916-972-2766", customers.get(628).getFax());
	}

	@Test
	@DisplayName("Record 629: Email is ronnie@latus.com")
	void EmailOfRecord629() {
		assertEquals("ronnie@latus.com", customers.get(628).getEmail());
	}

	@Test
	@DisplayName("Record 629: Web is http://www.ronnielatus.com")
	void WebOfRecord629() {
		assertEquals("http://www.ronnielatus.com", customers.get(628).getWeb());
	}
}
