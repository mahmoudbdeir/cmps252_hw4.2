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

@Tag("7")
class Record_4835 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4835: FirstName is Maricela")
	void FirstNameOfRecord4835() {
		assertEquals("Maricela", customers.get(4834).getFirstName());
	}

	@Test
	@DisplayName("Record 4835: LastName is Fitanides")
	void LastNameOfRecord4835() {
		assertEquals("Fitanides", customers.get(4834).getLastName());
	}

	@Test
	@DisplayName("Record 4835: Company is Esensten, Robert L Esq")
	void CompanyOfRecord4835() {
		assertEquals("Esensten, Robert L Esq", customers.get(4834).getCompany());
	}

	@Test
	@DisplayName("Record 4835: Address is 67 Saint Marks Ct")
	void AddressOfRecord4835() {
		assertEquals("67 Saint Marks Ct", customers.get(4834).getAddress());
	}

	@Test
	@DisplayName("Record 4835: City is Daly City")
	void CityOfRecord4835() {
		assertEquals("Daly City", customers.get(4834).getCity());
	}

	@Test
	@DisplayName("Record 4835: County is San Mateo")
	void CountyOfRecord4835() {
		assertEquals("San Mateo", customers.get(4834).getCounty());
	}

	@Test
	@DisplayName("Record 4835: State is CA")
	void StateOfRecord4835() {
		assertEquals("CA", customers.get(4834).getState());
	}

	@Test
	@DisplayName("Record 4835: ZIP is 94015")
	void ZIPOfRecord4835() {
		assertEquals("94015", customers.get(4834).getZIP());
	}

	@Test
	@DisplayName("Record 4835: Phone is 650-992-9352")
	void PhoneOfRecord4835() {
		assertEquals("650-992-9352", customers.get(4834).getPhone());
	}

	@Test
	@DisplayName("Record 4835: Fax is 650-992-0823")
	void FaxOfRecord4835() {
		assertEquals("650-992-0823", customers.get(4834).getFax());
	}

	@Test
	@DisplayName("Record 4835: Email is maricela@fitanides.com")
	void EmailOfRecord4835() {
		assertEquals("maricela@fitanides.com", customers.get(4834).getEmail());
	}

	@Test
	@DisplayName("Record 4835: Web is http://www.maricelafitanides.com")
	void WebOfRecord4835() {
		assertEquals("http://www.maricelafitanides.com", customers.get(4834).getWeb());
	}
}
