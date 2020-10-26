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
class Record_2785 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2785: FirstName is Arron")
	void FirstNameOfRecord2785() {
		assertEquals("Arron", customers.get(2784).getFirstName());
	}

	@Test
	@DisplayName("Record 2785: LastName is Ziccardi")
	void LastNameOfRecord2785() {
		assertEquals("Ziccardi", customers.get(2784).getLastName());
	}

	@Test
	@DisplayName("Record 2785: Company is Reed, Richard R Esq")
	void CompanyOfRecord2785() {
		assertEquals("Reed, Richard R Esq", customers.get(2784).getCompany());
	}

	@Test
	@DisplayName("Record 2785: Address is 1103 W Tunnel Blvd")
	void AddressOfRecord2785() {
		assertEquals("1103 W Tunnel Blvd", customers.get(2784).getAddress());
	}

	@Test
	@DisplayName("Record 2785: City is Houma")
	void CityOfRecord2785() {
		assertEquals("Houma", customers.get(2784).getCity());
	}

	@Test
	@DisplayName("Record 2785: County is Terrebonne")
	void CountyOfRecord2785() {
		assertEquals("Terrebonne", customers.get(2784).getCounty());
	}

	@Test
	@DisplayName("Record 2785: State is LA")
	void StateOfRecord2785() {
		assertEquals("LA", customers.get(2784).getState());
	}

	@Test
	@DisplayName("Record 2785: ZIP is 70360")
	void ZIPOfRecord2785() {
		assertEquals("70360", customers.get(2784).getZIP());
	}

	@Test
	@DisplayName("Record 2785: Phone is 985-876-8336")
	void PhoneOfRecord2785() {
		assertEquals("985-876-8336", customers.get(2784).getPhone());
	}

	@Test
	@DisplayName("Record 2785: Fax is 985-876-4042")
	void FaxOfRecord2785() {
		assertEquals("985-876-4042", customers.get(2784).getFax());
	}

	@Test
	@DisplayName("Record 2785: Email is arron@ziccardi.com")
	void EmailOfRecord2785() {
		assertEquals("arron@ziccardi.com", customers.get(2784).getEmail());
	}

	@Test
	@DisplayName("Record 2785: Web is http://www.arronziccardi.com")
	void WebOfRecord2785() {
		assertEquals("http://www.arronziccardi.com", customers.get(2784).getWeb());
	}
}
