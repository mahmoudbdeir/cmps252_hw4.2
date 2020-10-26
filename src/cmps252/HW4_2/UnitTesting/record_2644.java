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

@Tag("17")
class Record_2644 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2644: FirstName is Art")
	void FirstNameOfRecord2644() {
		assertEquals("Art", customers.get(2643).getFirstName());
	}

	@Test
	@DisplayName("Record 2644: LastName is Lies")
	void LastNameOfRecord2644() {
		assertEquals("Lies", customers.get(2643).getLastName());
	}

	@Test
	@DisplayName("Record 2644: Company is Syts & George Office Equip Co")
	void CompanyOfRecord2644() {
		assertEquals("Syts & George Office Equip Co", customers.get(2643).getCompany());
	}

	@Test
	@DisplayName("Record 2644: Address is 432 N Canal St")
	void AddressOfRecord2644() {
		assertEquals("432 N Canal St", customers.get(2643).getAddress());
	}

	@Test
	@DisplayName("Record 2644: City is South San Francisco")
	void CityOfRecord2644() {
		assertEquals("South San Francisco", customers.get(2643).getCity());
	}

	@Test
	@DisplayName("Record 2644: County is San Mateo")
	void CountyOfRecord2644() {
		assertEquals("San Mateo", customers.get(2643).getCounty());
	}

	@Test
	@DisplayName("Record 2644: State is CA")
	void StateOfRecord2644() {
		assertEquals("CA", customers.get(2643).getState());
	}

	@Test
	@DisplayName("Record 2644: ZIP is 94080")
	void ZIPOfRecord2644() {
		assertEquals("94080", customers.get(2643).getZIP());
	}

	@Test
	@DisplayName("Record 2644: Phone is 650-583-0559")
	void PhoneOfRecord2644() {
		assertEquals("650-583-0559", customers.get(2643).getPhone());
	}

	@Test
	@DisplayName("Record 2644: Fax is 650-583-1138")
	void FaxOfRecord2644() {
		assertEquals("650-583-1138", customers.get(2643).getFax());
	}

	@Test
	@DisplayName("Record 2644: Email is art@lies.com")
	void EmailOfRecord2644() {
		assertEquals("art@lies.com", customers.get(2643).getEmail());
	}

	@Test
	@DisplayName("Record 2644: Web is http://www.artlies.com")
	void WebOfRecord2644() {
		assertEquals("http://www.artlies.com", customers.get(2643).getWeb());
	}
}
