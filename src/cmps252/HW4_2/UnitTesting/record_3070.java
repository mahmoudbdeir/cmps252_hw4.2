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

@Tag("0")
class Record_3070 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3070: FirstName is Concetta")
	void FirstNameOfRecord3070() {
		assertEquals("Concetta", customers.get(3069).getFirstName());
	}

	@Test
	@DisplayName("Record 3070: LastName is Sweetland")
	void LastNameOfRecord3070() {
		assertEquals("Sweetland", customers.get(3069).getLastName());
	}

	@Test
	@DisplayName("Record 3070: Company is Bell, Julie A Esq")
	void CompanyOfRecord3070() {
		assertEquals("Bell, Julie A Esq", customers.get(3069).getCompany());
	}

	@Test
	@DisplayName("Record 3070: Address is 8966 National Blvd")
	void AddressOfRecord3070() {
		assertEquals("8966 National Blvd", customers.get(3069).getAddress());
	}

	@Test
	@DisplayName("Record 3070: City is Los Angeles")
	void CityOfRecord3070() {
		assertEquals("Los Angeles", customers.get(3069).getCity());
	}

	@Test
	@DisplayName("Record 3070: County is Los Angeles")
	void CountyOfRecord3070() {
		assertEquals("Los Angeles", customers.get(3069).getCounty());
	}

	@Test
	@DisplayName("Record 3070: State is CA")
	void StateOfRecord3070() {
		assertEquals("CA", customers.get(3069).getState());
	}

	@Test
	@DisplayName("Record 3070: ZIP is 90034")
	void ZIPOfRecord3070() {
		assertEquals("90034", customers.get(3069).getZIP());
	}

	@Test
	@DisplayName("Record 3070: Phone is 310-836-2612")
	void PhoneOfRecord3070() {
		assertEquals("310-836-2612", customers.get(3069).getPhone());
	}

	@Test
	@DisplayName("Record 3070: Fax is 310-836-8192")
	void FaxOfRecord3070() {
		assertEquals("310-836-8192", customers.get(3069).getFax());
	}

	@Test
	@DisplayName("Record 3070: Email is concetta@sweetland.com")
	void EmailOfRecord3070() {
		assertEquals("concetta@sweetland.com", customers.get(3069).getEmail());
	}

	@Test
	@DisplayName("Record 3070: Web is http://www.concettasweetland.com")
	void WebOfRecord3070() {
		assertEquals("http://www.concettasweetland.com", customers.get(3069).getWeb());
	}
}
