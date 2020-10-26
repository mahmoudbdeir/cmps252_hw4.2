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

@Tag("34")
class Record_2092 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2092: FirstName is Damion")
	void FirstNameOfRecord2092() {
		assertEquals("Damion", customers.get(2091).getFirstName());
	}

	@Test
	@DisplayName("Record 2092: LastName is Anastos")
	void LastNameOfRecord2092() {
		assertEquals("Anastos", customers.get(2091).getLastName());
	}

	@Test
	@DisplayName("Record 2092: Company is Central Beverage Co Inc")
	void CompanyOfRecord2092() {
		assertEquals("Central Beverage Co Inc", customers.get(2091).getCompany());
	}

	@Test
	@DisplayName("Record 2092: Address is 16105 Gundry Ave")
	void AddressOfRecord2092() {
		assertEquals("16105 Gundry Ave", customers.get(2091).getAddress());
	}

	@Test
	@DisplayName("Record 2092: City is Paramount")
	void CityOfRecord2092() {
		assertEquals("Paramount", customers.get(2091).getCity());
	}

	@Test
	@DisplayName("Record 2092: County is Los Angeles")
	void CountyOfRecord2092() {
		assertEquals("Los Angeles", customers.get(2091).getCounty());
	}

	@Test
	@DisplayName("Record 2092: State is CA")
	void StateOfRecord2092() {
		assertEquals("CA", customers.get(2091).getState());
	}

	@Test
	@DisplayName("Record 2092: ZIP is 90723")
	void ZIPOfRecord2092() {
		assertEquals("90723", customers.get(2091).getZIP());
	}

	@Test
	@DisplayName("Record 2092: Phone is 562-531-4571")
	void PhoneOfRecord2092() {
		assertEquals("562-531-4571", customers.get(2091).getPhone());
	}

	@Test
	@DisplayName("Record 2092: Fax is 562-531-9502")
	void FaxOfRecord2092() {
		assertEquals("562-531-9502", customers.get(2091).getFax());
	}

	@Test
	@DisplayName("Record 2092: Email is damion@anastos.com")
	void EmailOfRecord2092() {
		assertEquals("damion@anastos.com", customers.get(2091).getEmail());
	}

	@Test
	@DisplayName("Record 2092: Web is http://www.damionanastos.com")
	void WebOfRecord2092() {
		assertEquals("http://www.damionanastos.com", customers.get(2091).getWeb());
	}
}
