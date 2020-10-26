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
class Record_3862 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3862: FirstName is Carrie")
	void FirstNameOfRecord3862() {
		assertEquals("Carrie", customers.get(3861).getFirstName());
	}

	@Test
	@DisplayName("Record 3862: LastName is Blizard")
	void LastNameOfRecord3862() {
		assertEquals("Blizard", customers.get(3861).getLastName());
	}

	@Test
	@DisplayName("Record 3862: Company is Ryd & Clark Screen Arts Co")
	void CompanyOfRecord3862() {
		assertEquals("Ryd & Clark Screen Arts Co", customers.get(3861).getCompany());
	}

	@Test
	@DisplayName("Record 3862: Address is 3855 Clay County Hwy")
	void AddressOfRecord3862() {
		assertEquals("3855 Clay County Hwy", customers.get(3861).getAddress());
	}

	@Test
	@DisplayName("Record 3862: City is Moss")
	void CityOfRecord3862() {
		assertEquals("Moss", customers.get(3861).getCity());
	}

	@Test
	@DisplayName("Record 3862: County is Clay")
	void CountyOfRecord3862() {
		assertEquals("Clay", customers.get(3861).getCounty());
	}

	@Test
	@DisplayName("Record 3862: State is TN")
	void StateOfRecord3862() {
		assertEquals("TN", customers.get(3861).getState());
	}

	@Test
	@DisplayName("Record 3862: ZIP is 38575")
	void ZIPOfRecord3862() {
		assertEquals("38575", customers.get(3861).getZIP());
	}

	@Test
	@DisplayName("Record 3862: Phone is 931-258-1060")
	void PhoneOfRecord3862() {
		assertEquals("931-258-1060", customers.get(3861).getPhone());
	}

	@Test
	@DisplayName("Record 3862: Fax is 931-258-3109")
	void FaxOfRecord3862() {
		assertEquals("931-258-3109", customers.get(3861).getFax());
	}

	@Test
	@DisplayName("Record 3862: Email is carrie@blizard.com")
	void EmailOfRecord3862() {
		assertEquals("carrie@blizard.com", customers.get(3861).getEmail());
	}

	@Test
	@DisplayName("Record 3862: Web is http://www.carrieblizard.com")
	void WebOfRecord3862() {
		assertEquals("http://www.carrieblizard.com", customers.get(3861).getWeb());
	}
}
