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
class Record_2153 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2153: FirstName is Nigel")
	void FirstNameOfRecord2153() {
		assertEquals("Nigel", customers.get(2152).getFirstName());
	}

	@Test
	@DisplayName("Record 2153: LastName is Kobylarz")
	void LastNameOfRecord2153() {
		assertEquals("Kobylarz", customers.get(2152).getLastName());
	}

	@Test
	@DisplayName("Record 2153: Company is Waterhouse Securities Inc")
	void CompanyOfRecord2153() {
		assertEquals("Waterhouse Securities Inc", customers.get(2152).getCompany());
	}

	@Test
	@DisplayName("Record 2153: Address is 35 E 21st St")
	void AddressOfRecord2153() {
		assertEquals("35 E 21st St", customers.get(2152).getAddress());
	}

	@Test
	@DisplayName("Record 2153: City is New York")
	void CityOfRecord2153() {
		assertEquals("New York", customers.get(2152).getCity());
	}

	@Test
	@DisplayName("Record 2153: County is New York")
	void CountyOfRecord2153() {
		assertEquals("New York", customers.get(2152).getCounty());
	}

	@Test
	@DisplayName("Record 2153: State is NY")
	void StateOfRecord2153() {
		assertEquals("NY", customers.get(2152).getState());
	}

	@Test
	@DisplayName("Record 2153: ZIP is 10010")
	void ZIPOfRecord2153() {
		assertEquals("10010", customers.get(2152).getZIP());
	}

	@Test
	@DisplayName("Record 2153: Phone is 212-673-2173")
	void PhoneOfRecord2153() {
		assertEquals("212-673-2173", customers.get(2152).getPhone());
	}

	@Test
	@DisplayName("Record 2153: Fax is 212-673-3413")
	void FaxOfRecord2153() {
		assertEquals("212-673-3413", customers.get(2152).getFax());
	}

	@Test
	@DisplayName("Record 2153: Email is nigel@kobylarz.com")
	void EmailOfRecord2153() {
		assertEquals("nigel@kobylarz.com", customers.get(2152).getEmail());
	}

	@Test
	@DisplayName("Record 2153: Web is http://www.nigelkobylarz.com")
	void WebOfRecord2153() {
		assertEquals("http://www.nigelkobylarz.com", customers.get(2152).getWeb());
	}
}
