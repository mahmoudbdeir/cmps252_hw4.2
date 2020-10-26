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

@Tag("11")
class Record_221 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 221: FirstName is Ralph")
	void FirstNameOfRecord221() {
		assertEquals("Ralph", customers.get(220).getFirstName());
	}

	@Test
	@DisplayName("Record 221: LastName is Gerland")
	void LastNameOfRecord221() {
		assertEquals("Gerland", customers.get(220).getLastName());
	}

	@Test
	@DisplayName("Record 221: Company is Prestige Printing")
	void CompanyOfRecord221() {
		assertEquals("Prestige Printing", customers.get(220).getCompany());
	}

	@Test
	@DisplayName("Record 221: Address is 6150 Lancaster Ave")
	void AddressOfRecord221() {
		assertEquals("6150 Lancaster Ave", customers.get(220).getAddress());
	}

	@Test
	@DisplayName("Record 221: City is Philadelphia")
	void CityOfRecord221() {
		assertEquals("Philadelphia", customers.get(220).getCity());
	}

	@Test
	@DisplayName("Record 221: County is Philadelphia")
	void CountyOfRecord221() {
		assertEquals("Philadelphia", customers.get(220).getCounty());
	}

	@Test
	@DisplayName("Record 221: State is PA")
	void StateOfRecord221() {
		assertEquals("PA", customers.get(220).getState());
	}

	@Test
	@DisplayName("Record 221: ZIP is 19151")
	void ZIPOfRecord221() {
		assertEquals("19151", customers.get(220).getZIP());
	}

	@Test
	@DisplayName("Record 221: Phone is 215-477-1698")
	void PhoneOfRecord221() {
		assertEquals("215-477-1698", customers.get(220).getPhone());
	}

	@Test
	@DisplayName("Record 221: Fax is 215-477-3857")
	void FaxOfRecord221() {
		assertEquals("215-477-3857", customers.get(220).getFax());
	}

	@Test
	@DisplayName("Record 221: Email is ralph@gerland.com")
	void EmailOfRecord221() {
		assertEquals("ralph@gerland.com", customers.get(220).getEmail());
	}

	@Test
	@DisplayName("Record 221: Web is http://www.ralphgerland.com")
	void WebOfRecord221() {
		assertEquals("http://www.ralphgerland.com", customers.get(220).getWeb());
	}
}
