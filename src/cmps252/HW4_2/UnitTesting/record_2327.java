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

@Tag("4")
class Record_2327 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2327: FirstName is Glenda")
	void FirstNameOfRecord2327() {
		assertEquals("Glenda", customers.get(2326).getFirstName());
	}

	@Test
	@DisplayName("Record 2327: LastName is Yelin")
	void LastNameOfRecord2327() {
		assertEquals("Yelin", customers.get(2326).getLastName());
	}

	@Test
	@DisplayName("Record 2327: Company is Digovanni, Thomas R")
	void CompanyOfRecord2327() {
		assertEquals("Digovanni, Thomas R", customers.get(2326).getCompany());
	}

	@Test
	@DisplayName("Record 2327: Address is 612 Sw 3rd St")
	void AddressOfRecord2327() {
		assertEquals("612 Sw 3rd St", customers.get(2326).getAddress());
	}

	@Test
	@DisplayName("Record 2327: City is Lees Summit")
	void CityOfRecord2327() {
		assertEquals("Lees Summit", customers.get(2326).getCity());
	}

	@Test
	@DisplayName("Record 2327: County is Jackson")
	void CountyOfRecord2327() {
		assertEquals("Jackson", customers.get(2326).getCounty());
	}

	@Test
	@DisplayName("Record 2327: State is MO")
	void StateOfRecord2327() {
		assertEquals("MO", customers.get(2326).getState());
	}

	@Test
	@DisplayName("Record 2327: ZIP is 64063")
	void ZIPOfRecord2327() {
		assertEquals("64063", customers.get(2326).getZIP());
	}

	@Test
	@DisplayName("Record 2327: Phone is 816-246-3438")
	void PhoneOfRecord2327() {
		assertEquals("816-246-3438", customers.get(2326).getPhone());
	}

	@Test
	@DisplayName("Record 2327: Fax is 816-246-1982")
	void FaxOfRecord2327() {
		assertEquals("816-246-1982", customers.get(2326).getFax());
	}

	@Test
	@DisplayName("Record 2327: Email is glenda@yelin.com")
	void EmailOfRecord2327() {
		assertEquals("glenda@yelin.com", customers.get(2326).getEmail());
	}

	@Test
	@DisplayName("Record 2327: Web is http://www.glendayelin.com")
	void WebOfRecord2327() {
		assertEquals("http://www.glendayelin.com", customers.get(2326).getWeb());
	}
}
