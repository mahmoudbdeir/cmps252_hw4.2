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

@Tag("18")
class Record_101 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 101: FirstName is Melba")
	void FirstNameOfRecord101() {
		assertEquals("Melba", customers.get(100).getFirstName());
	}

	@Test
	@DisplayName("Record 101: LastName is Broekemyer")
	void LastNameOfRecord101() {
		assertEquals("Broekemyer", customers.get(100).getLastName());
	}

	@Test
	@DisplayName("Record 101: Company is Perkins, Joseph A")
	void CompanyOfRecord101() {
		assertEquals("Perkins, Joseph A", customers.get(100).getCompany());
	}

	@Test
	@DisplayName("Record 101: Address is 80 Hendrickson Rd")
	void AddressOfRecord101() {
		assertEquals("80 Hendrickson Rd", customers.get(100).getAddress());
	}

	@Test
	@DisplayName("Record 101: City is Freehold")
	void CityOfRecord101() {
		assertEquals("Freehold", customers.get(100).getCity());
	}

	@Test
	@DisplayName("Record 101: County is Monmouth")
	void CountyOfRecord101() {
		assertEquals("Monmouth", customers.get(100).getCounty());
	}

	@Test
	@DisplayName("Record 101: State is NJ")
	void StateOfRecord101() {
		assertEquals("NJ", customers.get(100).getState());
	}

	@Test
	@DisplayName("Record 101: ZIP is 7728")
	void ZIPOfRecord101() {
		assertEquals("7728", customers.get(100).getZIP());
	}

	@Test
	@DisplayName("Record 101: Phone is 732-780-5864")
	void PhoneOfRecord101() {
		assertEquals("732-780-5864", customers.get(100).getPhone());
	}

	@Test
	@DisplayName("Record 101: Fax is 732-780-8799")
	void FaxOfRecord101() {
		assertEquals("732-780-8799", customers.get(100).getFax());
	}

	@Test
	@DisplayName("Record 101: Email is melba@broekemyer.com")
	void EmailOfRecord101() {
		assertEquals("melba@broekemyer.com", customers.get(100).getEmail());
	}

	@Test
	@DisplayName("Record 101: Web is http://www.melbabroekemyer.com")
	void WebOfRecord101() {
		assertEquals("http://www.melbabroekemyer.com", customers.get(100).getWeb());
	}
}
