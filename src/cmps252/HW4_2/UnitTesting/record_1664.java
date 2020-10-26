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
class Record_1664 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1664: FirstName is Kimberly")
	void FirstNameOfRecord1664() {
		assertEquals("Kimberly", customers.get(1663).getFirstName());
	}

	@Test
	@DisplayName("Record 1664: LastName is Argulewicz")
	void LastNameOfRecord1664() {
		assertEquals("Argulewicz", customers.get(1663).getLastName());
	}

	@Test
	@DisplayName("Record 1664: Company is Kolon California Corp")
	void CompanyOfRecord1664() {
		assertEquals("Kolon California Corp", customers.get(1663).getCompany());
	}

	@Test
	@DisplayName("Record 1664: Address is 484 Washington St  #-d")
	void AddressOfRecord1664() {
		assertEquals("484 Washington St  #-d", customers.get(1663).getAddress());
	}

	@Test
	@DisplayName("Record 1664: City is Monterey")
	void CityOfRecord1664() {
		assertEquals("Monterey", customers.get(1663).getCity());
	}

	@Test
	@DisplayName("Record 1664: County is Monterey")
	void CountyOfRecord1664() {
		assertEquals("Monterey", customers.get(1663).getCounty());
	}

	@Test
	@DisplayName("Record 1664: State is CA")
	void StateOfRecord1664() {
		assertEquals("CA", customers.get(1663).getState());
	}

	@Test
	@DisplayName("Record 1664: ZIP is 93940")
	void ZIPOfRecord1664() {
		assertEquals("93940", customers.get(1663).getZIP());
	}

	@Test
	@DisplayName("Record 1664: Phone is 831-372-3138")
	void PhoneOfRecord1664() {
		assertEquals("831-372-3138", customers.get(1663).getPhone());
	}

	@Test
	@DisplayName("Record 1664: Fax is 831-372-4733")
	void FaxOfRecord1664() {
		assertEquals("831-372-4733", customers.get(1663).getFax());
	}

	@Test
	@DisplayName("Record 1664: Email is kimberly@argulewicz.com")
	void EmailOfRecord1664() {
		assertEquals("kimberly@argulewicz.com", customers.get(1663).getEmail());
	}

	@Test
	@DisplayName("Record 1664: Web is http://www.kimberlyargulewicz.com")
	void WebOfRecord1664() {
		assertEquals("http://www.kimberlyargulewicz.com", customers.get(1663).getWeb());
	}
}
