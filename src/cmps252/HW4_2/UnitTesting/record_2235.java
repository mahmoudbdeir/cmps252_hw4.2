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
class Record_2235 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2235: FirstName is Lauren")
	void FirstNameOfRecord2235() {
		assertEquals("Lauren", customers.get(2234).getFirstName());
	}

	@Test
	@DisplayName("Record 2235: LastName is Corrett")
	void LastNameOfRecord2235() {
		assertEquals("Corrett", customers.get(2234).getLastName());
	}

	@Test
	@DisplayName("Record 2235: Company is Morford, Tom H Esq")
	void CompanyOfRecord2235() {
		assertEquals("Morford, Tom H Esq", customers.get(2234).getCompany());
	}

	@Test
	@DisplayName("Record 2235: Address is 3285 Yale Way")
	void AddressOfRecord2235() {
		assertEquals("3285 Yale Way", customers.get(2234).getAddress());
	}

	@Test
	@DisplayName("Record 2235: City is Fremont")
	void CityOfRecord2235() {
		assertEquals("Fremont", customers.get(2234).getCity());
	}

	@Test
	@DisplayName("Record 2235: County is Alameda")
	void CountyOfRecord2235() {
		assertEquals("Alameda", customers.get(2234).getCounty());
	}

	@Test
	@DisplayName("Record 2235: State is CA")
	void StateOfRecord2235() {
		assertEquals("CA", customers.get(2234).getState());
	}

	@Test
	@DisplayName("Record 2235: ZIP is 94538")
	void ZIPOfRecord2235() {
		assertEquals("94538", customers.get(2234).getZIP());
	}

	@Test
	@DisplayName("Record 2235: Phone is 510-651-6326")
	void PhoneOfRecord2235() {
		assertEquals("510-651-6326", customers.get(2234).getPhone());
	}

	@Test
	@DisplayName("Record 2235: Fax is 510-651-5092")
	void FaxOfRecord2235() {
		assertEquals("510-651-5092", customers.get(2234).getFax());
	}

	@Test
	@DisplayName("Record 2235: Email is lauren@corrett.com")
	void EmailOfRecord2235() {
		assertEquals("lauren@corrett.com", customers.get(2234).getEmail());
	}

	@Test
	@DisplayName("Record 2235: Web is http://www.laurencorrett.com")
	void WebOfRecord2235() {
		assertEquals("http://www.laurencorrett.com", customers.get(2234).getWeb());
	}
}
