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
class Record_2539 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2539: FirstName is Sonja")
	void FirstNameOfRecord2539() {
		assertEquals("Sonja", customers.get(2538).getFirstName());
	}

	@Test
	@DisplayName("Record 2539: LastName is Mancini")
	void LastNameOfRecord2539() {
		assertEquals("Mancini", customers.get(2538).getLastName());
	}

	@Test
	@DisplayName("Record 2539: Company is Ackerman Medical Supply Co")
	void CompanyOfRecord2539() {
		assertEquals("Ackerman Medical Supply Co", customers.get(2538).getCompany());
	}

	@Test
	@DisplayName("Record 2539: Address is 104 E 25th St")
	void AddressOfRecord2539() {
		assertEquals("104 E 25th St", customers.get(2538).getAddress());
	}

	@Test
	@DisplayName("Record 2539: City is New York")
	void CityOfRecord2539() {
		assertEquals("New York", customers.get(2538).getCity());
	}

	@Test
	@DisplayName("Record 2539: County is New York")
	void CountyOfRecord2539() {
		assertEquals("New York", customers.get(2538).getCounty());
	}

	@Test
	@DisplayName("Record 2539: State is NY")
	void StateOfRecord2539() {
		assertEquals("NY", customers.get(2538).getState());
	}

	@Test
	@DisplayName("Record 2539: ZIP is 10010")
	void ZIPOfRecord2539() {
		assertEquals("10010", customers.get(2538).getZIP());
	}

	@Test
	@DisplayName("Record 2539: Phone is 212-353-0243")
	void PhoneOfRecord2539() {
		assertEquals("212-353-0243", customers.get(2538).getPhone());
	}

	@Test
	@DisplayName("Record 2539: Fax is 212-353-9695")
	void FaxOfRecord2539() {
		assertEquals("212-353-9695", customers.get(2538).getFax());
	}

	@Test
	@DisplayName("Record 2539: Email is sonja@mancini.com")
	void EmailOfRecord2539() {
		assertEquals("sonja@mancini.com", customers.get(2538).getEmail());
	}

	@Test
	@DisplayName("Record 2539: Web is http://www.sonjamancini.com")
	void WebOfRecord2539() {
		assertEquals("http://www.sonjamancini.com", customers.get(2538).getWeb());
	}
}
