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

@Tag("24")
class Record_2252 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2252: FirstName is Kirby")
	void FirstNameOfRecord2252() {
		assertEquals("Kirby", customers.get(2251).getFirstName());
	}

	@Test
	@DisplayName("Record 2252: LastName is Soules")
	void LastNameOfRecord2252() {
		assertEquals("Soules", customers.get(2251).getLastName());
	}

	@Test
	@DisplayName("Record 2252: Company is Ledyard, David W Esq")
	void CompanyOfRecord2252() {
		assertEquals("Ledyard, David W Esq", customers.get(2251).getCompany());
	}

	@Test
	@DisplayName("Record 2252: Address is 212 State Route 35")
	void AddressOfRecord2252() {
		assertEquals("212 State Route 35", customers.get(2251).getAddress());
	}

	@Test
	@DisplayName("Record 2252: City is Red Bank")
	void CityOfRecord2252() {
		assertEquals("Red Bank", customers.get(2251).getCity());
	}

	@Test
	@DisplayName("Record 2252: County is Monmouth")
	void CountyOfRecord2252() {
		assertEquals("Monmouth", customers.get(2251).getCounty());
	}

	@Test
	@DisplayName("Record 2252: State is NJ")
	void StateOfRecord2252() {
		assertEquals("NJ", customers.get(2251).getState());
	}

	@Test
	@DisplayName("Record 2252: ZIP is 07701")
	void ZIPOfRecord2252() {
		assertEquals("07701", customers.get(2251).getZIP());
	}

	@Test
	@DisplayName("Record 2252: Phone is 732-758-1206")
	void PhoneOfRecord2252() {
		assertEquals("732-758-1206", customers.get(2251).getPhone());
	}

	@Test
	@DisplayName("Record 2252: Fax is 732-758-9369")
	void FaxOfRecord2252() {
		assertEquals("732-758-9369", customers.get(2251).getFax());
	}

	@Test
	@DisplayName("Record 2252: Email is kirby@soules.com")
	void EmailOfRecord2252() {
		assertEquals("kirby@soules.com", customers.get(2251).getEmail());
	}

	@Test
	@DisplayName("Record 2252: Web is http://www.kirbysoules.com")
	void WebOfRecord2252() {
		assertEquals("http://www.kirbysoules.com", customers.get(2251).getWeb());
	}
}
