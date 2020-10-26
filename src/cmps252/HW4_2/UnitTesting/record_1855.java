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

@Tag("42")
class Record_1855 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1855: FirstName is Dena")
	void FirstNameOfRecord1855() {
		assertEquals("Dena", customers.get(1854).getFirstName());
	}

	@Test
	@DisplayName("Record 1855: LastName is Diggins")
	void LastNameOfRecord1855() {
		assertEquals("Diggins", customers.get(1854).getLastName());
	}

	@Test
	@DisplayName("Record 1855: Company is Wood International Corp")
	void CompanyOfRecord1855() {
		assertEquals("Wood International Corp", customers.get(1854).getCompany());
	}

	@Test
	@DisplayName("Record 1855: Address is 2080 Wineridge Pl")
	void AddressOfRecord1855() {
		assertEquals("2080 Wineridge Pl", customers.get(1854).getAddress());
	}

	@Test
	@DisplayName("Record 1855: City is Escondido")
	void CityOfRecord1855() {
		assertEquals("Escondido", customers.get(1854).getCity());
	}

	@Test
	@DisplayName("Record 1855: County is San Diego")
	void CountyOfRecord1855() {
		assertEquals("San Diego", customers.get(1854).getCounty());
	}

	@Test
	@DisplayName("Record 1855: State is CA")
	void StateOfRecord1855() {
		assertEquals("CA", customers.get(1854).getState());
	}

	@Test
	@DisplayName("Record 1855: ZIP is 92029")
	void ZIPOfRecord1855() {
		assertEquals("92029", customers.get(1854).getZIP());
	}

	@Test
	@DisplayName("Record 1855: Phone is 760-738-3349")
	void PhoneOfRecord1855() {
		assertEquals("760-738-3349", customers.get(1854).getPhone());
	}

	@Test
	@DisplayName("Record 1855: Fax is 760-738-5832")
	void FaxOfRecord1855() {
		assertEquals("760-738-5832", customers.get(1854).getFax());
	}

	@Test
	@DisplayName("Record 1855: Email is dena@diggins.com")
	void EmailOfRecord1855() {
		assertEquals("dena@diggins.com", customers.get(1854).getEmail());
	}

	@Test
	@DisplayName("Record 1855: Web is http://www.denadiggins.com")
	void WebOfRecord1855() {
		assertEquals("http://www.denadiggins.com", customers.get(1854).getWeb());
	}
}
