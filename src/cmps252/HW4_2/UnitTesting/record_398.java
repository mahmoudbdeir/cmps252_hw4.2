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

@Tag("38")
class Record_398 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 398: FirstName is Katharine")
	void FirstNameOfRecord398() {
		assertEquals("Katharine", customers.get(397).getFirstName());
	}

	@Test
	@DisplayName("Record 398: LastName is Rosete")
	void LastNameOfRecord398() {
		assertEquals("Rosete", customers.get(397).getLastName());
	}

	@Test
	@DisplayName("Record 398: Company is Hugo, Hydi K Esq")
	void CompanyOfRecord398() {
		assertEquals("Hugo, Hydi K Esq", customers.get(397).getCompany());
	}

	@Test
	@DisplayName("Record 398: Address is 800 S Washington St")
	void AddressOfRecord398() {
		assertEquals("800 S Washington St", customers.get(397).getAddress());
	}

	@Test
	@DisplayName("Record 398: City is Tullahoma")
	void CityOfRecord398() {
		assertEquals("Tullahoma", customers.get(397).getCity());
	}

	@Test
	@DisplayName("Record 398: County is Coffee")
	void CountyOfRecord398() {
		assertEquals("Coffee", customers.get(397).getCounty());
	}

	@Test
	@DisplayName("Record 398: State is TN")
	void StateOfRecord398() {
		assertEquals("TN", customers.get(397).getState());
	}

	@Test
	@DisplayName("Record 398: ZIP is 37388")
	void ZIPOfRecord398() {
		assertEquals("37388", customers.get(397).getZIP());
	}

	@Test
	@DisplayName("Record 398: Phone is 931-455-2301")
	void PhoneOfRecord398() {
		assertEquals("931-455-2301", customers.get(397).getPhone());
	}

	@Test
	@DisplayName("Record 398: Fax is 931-455-1303")
	void FaxOfRecord398() {
		assertEquals("931-455-1303", customers.get(397).getFax());
	}

	@Test
	@DisplayName("Record 398: Email is katharine@rosete.com")
	void EmailOfRecord398() {
		assertEquals("katharine@rosete.com", customers.get(397).getEmail());
	}

	@Test
	@DisplayName("Record 398: Web is http://www.katharinerosete.com")
	void WebOfRecord398() {
		assertEquals("http://www.katharinerosete.com", customers.get(397).getWeb());
	}
}
