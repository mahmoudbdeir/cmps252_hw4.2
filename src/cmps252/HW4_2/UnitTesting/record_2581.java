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

@Tag("3")
class Record_2581 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2581: FirstName is Edwina")
	void FirstNameOfRecord2581() {
		assertEquals("Edwina", customers.get(2580).getFirstName());
	}

	@Test
	@DisplayName("Record 2581: LastName is Speer")
	void LastNameOfRecord2581() {
		assertEquals("Speer", customers.get(2580).getLastName());
	}

	@Test
	@DisplayName("Record 2581: Company is Family Center Friendly Center")
	void CompanyOfRecord2581() {
		assertEquals("Family Center Friendly Center", customers.get(2580).getCompany());
	}

	@Test
	@DisplayName("Record 2581: Address is 55 Service Ave")
	void AddressOfRecord2581() {
		assertEquals("55 Service Ave", customers.get(2580).getAddress());
	}

	@Test
	@DisplayName("Record 2581: City is Warwick")
	void CityOfRecord2581() {
		assertEquals("Warwick", customers.get(2580).getCity());
	}

	@Test
	@DisplayName("Record 2581: County is Kent")
	void CountyOfRecord2581() {
		assertEquals("Kent", customers.get(2580).getCounty());
	}

	@Test
	@DisplayName("Record 2581: State is RI")
	void StateOfRecord2581() {
		assertEquals("RI", customers.get(2580).getState());
	}

	@Test
	@DisplayName("Record 2581: ZIP is 2886")
	void ZIPOfRecord2581() {
		assertEquals("2886", customers.get(2580).getZIP());
	}

	@Test
	@DisplayName("Record 2581: Phone is 401-732-4861")
	void PhoneOfRecord2581() {
		assertEquals("401-732-4861", customers.get(2580).getPhone());
	}

	@Test
	@DisplayName("Record 2581: Fax is 401-732-7986")
	void FaxOfRecord2581() {
		assertEquals("401-732-7986", customers.get(2580).getFax());
	}

	@Test
	@DisplayName("Record 2581: Email is edwina@speer.com")
	void EmailOfRecord2581() {
		assertEquals("edwina@speer.com", customers.get(2580).getEmail());
	}

	@Test
	@DisplayName("Record 2581: Web is http://www.edwinaspeer.com")
	void WebOfRecord2581() {
		assertEquals("http://www.edwinaspeer.com", customers.get(2580).getWeb());
	}
}
