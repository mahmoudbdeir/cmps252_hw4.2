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
class Record_1570 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1570: FirstName is Marc")
	void FirstNameOfRecord1570() {
		assertEquals("Marc", customers.get(1569).getFirstName());
	}

	@Test
	@DisplayName("Record 1570: LastName is Tabisola")
	void LastNameOfRecord1570() {
		assertEquals("Tabisola", customers.get(1569).getLastName());
	}

	@Test
	@DisplayName("Record 1570: Company is Nutrite Corp")
	void CompanyOfRecord1570() {
		assertEquals("Nutrite Corp", customers.get(1569).getCompany());
	}

	@Test
	@DisplayName("Record 1570: Address is 1320 Lagrange St")
	void AddressOfRecord1570() {
		assertEquals("1320 Lagrange St", customers.get(1569).getAddress());
	}

	@Test
	@DisplayName("Record 1570: City is Toledo")
	void CityOfRecord1570() {
		assertEquals("Toledo", customers.get(1569).getCity());
	}

	@Test
	@DisplayName("Record 1570: County is Lucas")
	void CountyOfRecord1570() {
		assertEquals("Lucas", customers.get(1569).getCounty());
	}

	@Test
	@DisplayName("Record 1570: State is OH")
	void StateOfRecord1570() {
		assertEquals("OH", customers.get(1569).getState());
	}

	@Test
	@DisplayName("Record 1570: ZIP is 43608")
	void ZIPOfRecord1570() {
		assertEquals("43608", customers.get(1569).getZIP());
	}

	@Test
	@DisplayName("Record 1570: Phone is 419-241-2790")
	void PhoneOfRecord1570() {
		assertEquals("419-241-2790", customers.get(1569).getPhone());
	}

	@Test
	@DisplayName("Record 1570: Fax is 419-241-1922")
	void FaxOfRecord1570() {
		assertEquals("419-241-1922", customers.get(1569).getFax());
	}

	@Test
	@DisplayName("Record 1570: Email is marc@tabisola.com")
	void EmailOfRecord1570() {
		assertEquals("marc@tabisola.com", customers.get(1569).getEmail());
	}

	@Test
	@DisplayName("Record 1570: Web is http://www.marctabisola.com")
	void WebOfRecord1570() {
		assertEquals("http://www.marctabisola.com", customers.get(1569).getWeb());
	}
}
