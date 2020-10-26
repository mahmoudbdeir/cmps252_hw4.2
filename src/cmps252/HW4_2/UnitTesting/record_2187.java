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
class Record_2187 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2187: FirstName is Bernadette")
	void FirstNameOfRecord2187() {
		assertEquals("Bernadette", customers.get(2186).getFirstName());
	}

	@Test
	@DisplayName("Record 2187: LastName is Coplen")
	void LastNameOfRecord2187() {
		assertEquals("Coplen", customers.get(2186).getLastName());
	}

	@Test
	@DisplayName("Record 2187: Company is Tarp Information Systems")
	void CompanyOfRecord2187() {
		assertEquals("Tarp Information Systems", customers.get(2186).getCompany());
	}

	@Test
	@DisplayName("Record 2187: Address is 31375 Fraser Dr")
	void AddressOfRecord2187() {
		assertEquals("31375 Fraser Dr", customers.get(2186).getAddress());
	}

	@Test
	@DisplayName("Record 2187: City is Fraser")
	void CityOfRecord2187() {
		assertEquals("Fraser", customers.get(2186).getCity());
	}

	@Test
	@DisplayName("Record 2187: County is Macomb")
	void CountyOfRecord2187() {
		assertEquals("Macomb", customers.get(2186).getCounty());
	}

	@Test
	@DisplayName("Record 2187: State is MI")
	void StateOfRecord2187() {
		assertEquals("MI", customers.get(2186).getState());
	}

	@Test
	@DisplayName("Record 2187: ZIP is 48026")
	void ZIPOfRecord2187() {
		assertEquals("48026", customers.get(2186).getZIP());
	}

	@Test
	@DisplayName("Record 2187: Phone is 586-294-2280")
	void PhoneOfRecord2187() {
		assertEquals("586-294-2280", customers.get(2186).getPhone());
	}

	@Test
	@DisplayName("Record 2187: Fax is 586-294-4297")
	void FaxOfRecord2187() {
		assertEquals("586-294-4297", customers.get(2186).getFax());
	}

	@Test
	@DisplayName("Record 2187: Email is bernadette@coplen.com")
	void EmailOfRecord2187() {
		assertEquals("bernadette@coplen.com", customers.get(2186).getEmail());
	}

	@Test
	@DisplayName("Record 2187: Web is http://www.bernadettecoplen.com")
	void WebOfRecord2187() {
		assertEquals("http://www.bernadettecoplen.com", customers.get(2186).getWeb());
	}
}
