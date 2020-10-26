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
class Record_2813 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2813: FirstName is Noble")
	void FirstNameOfRecord2813() {
		assertEquals("Noble", customers.get(2812).getFirstName());
	}

	@Test
	@DisplayName("Record 2813: LastName is Hergert")
	void LastNameOfRecord2813() {
		assertEquals("Hergert", customers.get(2812).getLastName());
	}

	@Test
	@DisplayName("Record 2813: Company is Ward, Damon L Esq")
	void CompanyOfRecord2813() {
		assertEquals("Ward, Damon L Esq", customers.get(2812).getCompany());
	}

	@Test
	@DisplayName("Record 2813: Address is 31 Kingston Rd")
	void AddressOfRecord2813() {
		assertEquals("31 Kingston Rd", customers.get(2812).getAddress());
	}

	@Test
	@DisplayName("Record 2813: City is Plaistow")
	void CityOfRecord2813() {
		assertEquals("Plaistow", customers.get(2812).getCity());
	}

	@Test
	@DisplayName("Record 2813: County is Rockingham")
	void CountyOfRecord2813() {
		assertEquals("Rockingham", customers.get(2812).getCounty());
	}

	@Test
	@DisplayName("Record 2813: State is NH")
	void StateOfRecord2813() {
		assertEquals("NH", customers.get(2812).getState());
	}

	@Test
	@DisplayName("Record 2813: ZIP is 3865")
	void ZIPOfRecord2813() {
		assertEquals("3865", customers.get(2812).getZIP());
	}

	@Test
	@DisplayName("Record 2813: Phone is 603-382-7620")
	void PhoneOfRecord2813() {
		assertEquals("603-382-7620", customers.get(2812).getPhone());
	}

	@Test
	@DisplayName("Record 2813: Fax is 603-382-1174")
	void FaxOfRecord2813() {
		assertEquals("603-382-1174", customers.get(2812).getFax());
	}

	@Test
	@DisplayName("Record 2813: Email is noble@hergert.com")
	void EmailOfRecord2813() {
		assertEquals("noble@hergert.com", customers.get(2812).getEmail());
	}

	@Test
	@DisplayName("Record 2813: Web is http://www.noblehergert.com")
	void WebOfRecord2813() {
		assertEquals("http://www.noblehergert.com", customers.get(2812).getWeb());
	}
}
