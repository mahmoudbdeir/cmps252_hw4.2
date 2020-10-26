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
class Record_2071 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2071: FirstName is Daryl")
	void FirstNameOfRecord2071() {
		assertEquals("Daryl", customers.get(2070).getFirstName());
	}

	@Test
	@DisplayName("Record 2071: LastName is Devries")
	void LastNameOfRecord2071() {
		assertEquals("Devries", customers.get(2070).getLastName());
	}

	@Test
	@DisplayName("Record 2071: Company is Carr, Rex Esq")
	void CompanyOfRecord2071() {
		assertEquals("Carr, Rex Esq", customers.get(2070).getCompany());
	}

	@Test
	@DisplayName("Record 2071: Address is 26 C St")
	void AddressOfRecord2071() {
		assertEquals("26 C St", customers.get(2070).getAddress());
	}

	@Test
	@DisplayName("Record 2071: City is Laurel")
	void CityOfRecord2071() {
		assertEquals("Laurel", customers.get(2070).getCity());
	}

	@Test
	@DisplayName("Record 2071: County is Prince Georges")
	void CountyOfRecord2071() {
		assertEquals("Prince Georges", customers.get(2070).getCounty());
	}

	@Test
	@DisplayName("Record 2071: State is MD")
	void StateOfRecord2071() {
		assertEquals("MD", customers.get(2070).getState());
	}

	@Test
	@DisplayName("Record 2071: ZIP is 20707")
	void ZIPOfRecord2071() {
		assertEquals("20707", customers.get(2070).getZIP());
	}

	@Test
	@DisplayName("Record 2071: Phone is 301-725-1681")
	void PhoneOfRecord2071() {
		assertEquals("301-725-1681", customers.get(2070).getPhone());
	}

	@Test
	@DisplayName("Record 2071: Fax is 301-725-1512")
	void FaxOfRecord2071() {
		assertEquals("301-725-1512", customers.get(2070).getFax());
	}

	@Test
	@DisplayName("Record 2071: Email is daryl@devries.com")
	void EmailOfRecord2071() {
		assertEquals("daryl@devries.com", customers.get(2070).getEmail());
	}

	@Test
	@DisplayName("Record 2071: Web is http://www.daryldevries.com")
	void WebOfRecord2071() {
		assertEquals("http://www.daryldevries.com", customers.get(2070).getWeb());
	}
}
