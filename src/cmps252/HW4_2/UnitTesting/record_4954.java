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

@Tag("5")
class Record_4954 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4954: FirstName is Roxanna")
	void FirstNameOfRecord4954() {
		assertEquals("Roxanna", customers.get(4953).getFirstName());
	}

	@Test
	@DisplayName("Record 4954: LastName is Hinkey")
	void LastNameOfRecord4954() {
		assertEquals("Hinkey", customers.get(4953).getLastName());
	}

	@Test
	@DisplayName("Record 4954: Company is Smith, Loyd E Esq")
	void CompanyOfRecord4954() {
		assertEquals("Smith, Loyd E Esq", customers.get(4953).getCompany());
	}

	@Test
	@DisplayName("Record 4954: Address is 104 W Century Rd  #-d")
	void AddressOfRecord4954() {
		assertEquals("104 W Century Rd  #-d", customers.get(4953).getAddress());
	}

	@Test
	@DisplayName("Record 4954: City is Leesburg")
	void CityOfRecord4954() {
		assertEquals("Leesburg", customers.get(4953).getCity());
	}

	@Test
	@DisplayName("Record 4954: County is Lee")
	void CountyOfRecord4954() {
		assertEquals("Lee", customers.get(4953).getCounty());
	}

	@Test
	@DisplayName("Record 4954: State is GA")
	void StateOfRecord4954() {
		assertEquals("GA", customers.get(4953).getState());
	}

	@Test
	@DisplayName("Record 4954: ZIP is 31763")
	void ZIPOfRecord4954() {
		assertEquals("31763", customers.get(4953).getZIP());
	}

	@Test
	@DisplayName("Record 4954: Phone is 229-883-2767")
	void PhoneOfRecord4954() {
		assertEquals("229-883-2767", customers.get(4953).getPhone());
	}

	@Test
	@DisplayName("Record 4954: Fax is 229-883-7812")
	void FaxOfRecord4954() {
		assertEquals("229-883-7812", customers.get(4953).getFax());
	}

	@Test
	@DisplayName("Record 4954: Email is roxanna@hinkey.com")
	void EmailOfRecord4954() {
		assertEquals("roxanna@hinkey.com", customers.get(4953).getEmail());
	}

	@Test
	@DisplayName("Record 4954: Web is http://www.roxannahinkey.com")
	void WebOfRecord4954() {
		assertEquals("http://www.roxannahinkey.com", customers.get(4953).getWeb());
	}
}
