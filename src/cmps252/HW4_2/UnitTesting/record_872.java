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

@Tag("25")
class Record_872 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 872: FirstName is Helga")
	void FirstNameOfRecord872() {
		assertEquals("Helga", customers.get(871).getFirstName());
	}

	@Test
	@DisplayName("Record 872: LastName is Cristal")
	void LastNameOfRecord872() {
		assertEquals("Cristal", customers.get(871).getLastName());
	}

	@Test
	@DisplayName("Record 872: Company is Kinkos Photo Lab")
	void CompanyOfRecord872() {
		assertEquals("Kinkos Photo Lab", customers.get(871).getCompany());
	}

	@Test
	@DisplayName("Record 872: Address is 1459 Shelburne Rd")
	void AddressOfRecord872() {
		assertEquals("1459 Shelburne Rd", customers.get(871).getAddress());
	}

	@Test
	@DisplayName("Record 872: City is South Burlington")
	void CityOfRecord872() {
		assertEquals("South Burlington", customers.get(871).getCity());
	}

	@Test
	@DisplayName("Record 872: County is Chittenden")
	void CountyOfRecord872() {
		assertEquals("Chittenden", customers.get(871).getCounty());
	}

	@Test
	@DisplayName("Record 872: State is VT")
	void StateOfRecord872() {
		assertEquals("VT", customers.get(871).getState());
	}

	@Test
	@DisplayName("Record 872: ZIP is 5403")
	void ZIPOfRecord872() {
		assertEquals("05403", customers.get(871).getZIP());
	}

	@Test
	@DisplayName("Record 872: Phone is 802-863-2212")
	void PhoneOfRecord872() {
		assertEquals("802-863-2212", customers.get(871).getPhone());
	}

	@Test
	@DisplayName("Record 872: Fax is 802-863-3418")
	void FaxOfRecord872() {
		assertEquals("802-863-3418", customers.get(871).getFax());
	}

	@Test
	@DisplayName("Record 872: Email is helga@cristal.com")
	void EmailOfRecord872() {
		assertEquals("helga@cristal.com", customers.get(871).getEmail());
	}

	@Test
	@DisplayName("Record 872: Web is http://www.helgacristal.com")
	void WebOfRecord872() {
		assertEquals("http://www.helgacristal.com", customers.get(871).getWeb());
	}
}
