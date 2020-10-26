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

@Tag("48")
class Record_3197 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3197: FirstName is Sandy")
	void FirstNameOfRecord3197() {
		assertEquals("Sandy", customers.get(3196).getFirstName());
	}

	@Test
	@DisplayName("Record 3197: LastName is Stigler")
	void LastNameOfRecord3197() {
		assertEquals("Stigler", customers.get(3196).getLastName());
	}

	@Test
	@DisplayName("Record 3197: Company is Jacksonlea")
	void CompanyOfRecord3197() {
		assertEquals("Jacksonlea", customers.get(3196).getCompany());
	}

	@Test
	@DisplayName("Record 3197: Address is 2161 Regal Pky")
	void AddressOfRecord3197() {
		assertEquals("2161 Regal Pky", customers.get(3196).getAddress());
	}

	@Test
	@DisplayName("Record 3197: City is Euless")
	void CityOfRecord3197() {
		assertEquals("Euless", customers.get(3196).getCity());
	}

	@Test
	@DisplayName("Record 3197: County is Tarrant")
	void CountyOfRecord3197() {
		assertEquals("Tarrant", customers.get(3196).getCounty());
	}

	@Test
	@DisplayName("Record 3197: State is TX")
	void StateOfRecord3197() {
		assertEquals("TX", customers.get(3196).getState());
	}

	@Test
	@DisplayName("Record 3197: ZIP is 76040")
	void ZIPOfRecord3197() {
		assertEquals("76040", customers.get(3196).getZIP());
	}

	@Test
	@DisplayName("Record 3197: Phone is 817-540-8744")
	void PhoneOfRecord3197() {
		assertEquals("817-540-8744", customers.get(3196).getPhone());
	}

	@Test
	@DisplayName("Record 3197: Fax is 817-540-9816")
	void FaxOfRecord3197() {
		assertEquals("817-540-9816", customers.get(3196).getFax());
	}

	@Test
	@DisplayName("Record 3197: Email is sandy@stigler.com")
	void EmailOfRecord3197() {
		assertEquals("sandy@stigler.com", customers.get(3196).getEmail());
	}

	@Test
	@DisplayName("Record 3197: Web is http://www.sandystigler.com")
	void WebOfRecord3197() {
		assertEquals("http://www.sandystigler.com", customers.get(3196).getWeb());
	}
}
