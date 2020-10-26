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

@Tag("28")
class Record_3007 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3007: FirstName is Jame")
	void FirstNameOfRecord3007() {
		assertEquals("Jame", customers.get(3006).getFirstName());
	}

	@Test
	@DisplayName("Record 3007: LastName is Mracek")
	void LastNameOfRecord3007() {
		assertEquals("Mracek", customers.get(3006).getLastName());
	}

	@Test
	@DisplayName("Record 3007: Company is Allied Aluminum Co")
	void CompanyOfRecord3007() {
		assertEquals("Allied Aluminum Co", customers.get(3006).getCompany());
	}

	@Test
	@DisplayName("Record 3007: Address is 1401 W Mount Royal Ave")
	void AddressOfRecord3007() {
		assertEquals("1401 W Mount Royal Ave", customers.get(3006).getAddress());
	}

	@Test
	@DisplayName("Record 3007: City is Baltimore")
	void CityOfRecord3007() {
		assertEquals("Baltimore", customers.get(3006).getCity());
	}

	@Test
	@DisplayName("Record 3007: County is Baltimore City")
	void CountyOfRecord3007() {
		assertEquals("Baltimore City", customers.get(3006).getCounty());
	}

	@Test
	@DisplayName("Record 3007: State is MD")
	void StateOfRecord3007() {
		assertEquals("MD", customers.get(3006).getState());
	}

	@Test
	@DisplayName("Record 3007: ZIP is 21217")
	void ZIPOfRecord3007() {
		assertEquals("21217", customers.get(3006).getZIP());
	}

	@Test
	@DisplayName("Record 3007: Phone is 410-728-6497")
	void PhoneOfRecord3007() {
		assertEquals("410-728-6497", customers.get(3006).getPhone());
	}

	@Test
	@DisplayName("Record 3007: Fax is 410-728-7944")
	void FaxOfRecord3007() {
		assertEquals("410-728-7944", customers.get(3006).getFax());
	}

	@Test
	@DisplayName("Record 3007: Email is jame@mracek.com")
	void EmailOfRecord3007() {
		assertEquals("jame@mracek.com", customers.get(3006).getEmail());
	}

	@Test
	@DisplayName("Record 3007: Web is http://www.jamemracek.com")
	void WebOfRecord3007() {
		assertEquals("http://www.jamemracek.com", customers.get(3006).getWeb());
	}
}
