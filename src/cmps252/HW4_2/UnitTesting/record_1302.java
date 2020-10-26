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

@Tag("8")
class Record_1302 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1302: FirstName is Lakysha")
	void FirstNameOfRecord1302() {
		assertEquals("Lakysha", customers.get(1301).getFirstName());
	}

	@Test
	@DisplayName("Record 1302: LastName is Sievertsen")
	void LastNameOfRecord1302() {
		assertEquals("Sievertsen", customers.get(1301).getLastName());
	}

	@Test
	@DisplayName("Record 1302: Company is Spini, David S Esq")
	void CompanyOfRecord1302() {
		assertEquals("Spini, David S Esq", customers.get(1301).getCompany());
	}

	@Test
	@DisplayName("Record 1302: Address is 16500 E Truman Rd")
	void AddressOfRecord1302() {
		assertEquals("16500 E Truman Rd", customers.get(1301).getAddress());
	}

	@Test
	@DisplayName("Record 1302: City is Independence")
	void CityOfRecord1302() {
		assertEquals("Independence", customers.get(1301).getCity());
	}

	@Test
	@DisplayName("Record 1302: County is Jackson")
	void CountyOfRecord1302() {
		assertEquals("Jackson", customers.get(1301).getCounty());
	}

	@Test
	@DisplayName("Record 1302: State is MO")
	void StateOfRecord1302() {
		assertEquals("MO", customers.get(1301).getState());
	}

	@Test
	@DisplayName("Record 1302: ZIP is 64050")
	void ZIPOfRecord1302() {
		assertEquals("64050", customers.get(1301).getZIP());
	}

	@Test
	@DisplayName("Record 1302: Phone is 816-836-9188")
	void PhoneOfRecord1302() {
		assertEquals("816-836-9188", customers.get(1301).getPhone());
	}

	@Test
	@DisplayName("Record 1302: Fax is 816-836-0278")
	void FaxOfRecord1302() {
		assertEquals("816-836-0278", customers.get(1301).getFax());
	}

	@Test
	@DisplayName("Record 1302: Email is lakysha@sievertsen.com")
	void EmailOfRecord1302() {
		assertEquals("lakysha@sievertsen.com", customers.get(1301).getEmail());
	}

	@Test
	@DisplayName("Record 1302: Web is http://www.lakyshasievertsen.com")
	void WebOfRecord1302() {
		assertEquals("http://www.lakyshasievertsen.com", customers.get(1301).getWeb());
	}
}
