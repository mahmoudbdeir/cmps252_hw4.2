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

@Tag("17")
class Record_2633 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2633: FirstName is Adele")
	void FirstNameOfRecord2633() {
		assertEquals("Adele", customers.get(2632).getFirstName());
	}

	@Test
	@DisplayName("Record 2633: LastName is Salvati")
	void LastNameOfRecord2633() {
		assertEquals("Salvati", customers.get(2632).getLastName());
	}

	@Test
	@DisplayName("Record 2633: Company is Mcdonald Gates & Co")
	void CompanyOfRecord2633() {
		assertEquals("Mcdonald Gates & Co", customers.get(2632).getCompany());
	}

	@Test
	@DisplayName("Record 2633: Address is 8000 Route 130")
	void AddressOfRecord2633() {
		assertEquals("8000 Route 130", customers.get(2632).getAddress());
	}

	@Test
	@DisplayName("Record 2633: City is Riverside")
	void CityOfRecord2633() {
		assertEquals("Riverside", customers.get(2632).getCity());
	}

	@Test
	@DisplayName("Record 2633: County is Burlington")
	void CountyOfRecord2633() {
		assertEquals("Burlington", customers.get(2632).getCounty());
	}

	@Test
	@DisplayName("Record 2633: State is NJ")
	void StateOfRecord2633() {
		assertEquals("NJ", customers.get(2632).getState());
	}

	@Test
	@DisplayName("Record 2633: ZIP is 8075")
	void ZIPOfRecord2633() {
		assertEquals("8075", customers.get(2632).getZIP());
	}

	@Test
	@DisplayName("Record 2633: Phone is 856-764-7383")
	void PhoneOfRecord2633() {
		assertEquals("856-764-7383", customers.get(2632).getPhone());
	}

	@Test
	@DisplayName("Record 2633: Fax is 856-764-3698")
	void FaxOfRecord2633() {
		assertEquals("856-764-3698", customers.get(2632).getFax());
	}

	@Test
	@DisplayName("Record 2633: Email is adele@salvati.com")
	void EmailOfRecord2633() {
		assertEquals("adele@salvati.com", customers.get(2632).getEmail());
	}

	@Test
	@DisplayName("Record 2633: Web is http://www.adelesalvati.com")
	void WebOfRecord2633() {
		assertEquals("http://www.adelesalvati.com", customers.get(2632).getWeb());
	}
}
