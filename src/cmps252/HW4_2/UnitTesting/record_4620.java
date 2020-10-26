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

@Tag("48")
class Record_4620 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4620: FirstName is Arnold")
	void FirstNameOfRecord4620() {
		assertEquals("Arnold", customers.get(4619).getFirstName());
	}

	@Test
	@DisplayName("Record 4620: LastName is Morrales")
	void LastNameOfRecord4620() {
		assertEquals("Morrales", customers.get(4619).getLastName());
	}

	@Test
	@DisplayName("Record 4620: Company is Global Industries Inc")
	void CompanyOfRecord4620() {
		assertEquals("Global Industries Inc", customers.get(4619).getCompany());
	}

	@Test
	@DisplayName("Record 4620: Address is 307 Atlantic Ave")
	void AddressOfRecord4620() {
		assertEquals("307 Atlantic Ave", customers.get(4619).getAddress());
	}

	@Test
	@DisplayName("Record 4620: City is Brooklyn")
	void CityOfRecord4620() {
		assertEquals("Brooklyn", customers.get(4619).getCity());
	}

	@Test
	@DisplayName("Record 4620: County is Kings")
	void CountyOfRecord4620() {
		assertEquals("Kings", customers.get(4619).getCounty());
	}

	@Test
	@DisplayName("Record 4620: State is NY")
	void StateOfRecord4620() {
		assertEquals("NY", customers.get(4619).getState());
	}

	@Test
	@DisplayName("Record 4620: ZIP is 11201")
	void ZIPOfRecord4620() {
		assertEquals("11201", customers.get(4619).getZIP());
	}

	@Test
	@DisplayName("Record 4620: Phone is 718-852-3312")
	void PhoneOfRecord4620() {
		assertEquals("718-852-3312", customers.get(4619).getPhone());
	}

	@Test
	@DisplayName("Record 4620: Fax is 718-852-5884")
	void FaxOfRecord4620() {
		assertEquals("718-852-5884", customers.get(4619).getFax());
	}

	@Test
	@DisplayName("Record 4620: Email is arnold@morrales.com")
	void EmailOfRecord4620() {
		assertEquals("arnold@morrales.com", customers.get(4619).getEmail());
	}

	@Test
	@DisplayName("Record 4620: Web is http://www.arnoldmorrales.com")
	void WebOfRecord4620() {
		assertEquals("http://www.arnoldmorrales.com", customers.get(4619).getWeb());
	}
}
