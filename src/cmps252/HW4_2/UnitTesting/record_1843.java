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

@Tag("11")
class Record_1843 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1843: FirstName is Basil")
	void FirstNameOfRecord1843() {
		assertEquals("Basil", customers.get(1842).getFirstName());
	}

	@Test
	@DisplayName("Record 1843: LastName is Magliulo")
	void LastNameOfRecord1843() {
		assertEquals("Magliulo", customers.get(1842).getLastName());
	}

	@Test
	@DisplayName("Record 1843: Company is S K W Chemicals Inc")
	void CompanyOfRecord1843() {
		assertEquals("S K W Chemicals Inc", customers.get(1842).getCompany());
	}

	@Test
	@DisplayName("Record 1843: Address is 471 Main St")
	void AddressOfRecord1843() {
		assertEquals("471 Main St", customers.get(1842).getAddress());
	}

	@Test
	@DisplayName("Record 1843: City is Mantua")
	void CityOfRecord1843() {
		assertEquals("Mantua", customers.get(1842).getCity());
	}

	@Test
	@DisplayName("Record 1843: County is Gloucester")
	void CountyOfRecord1843() {
		assertEquals("Gloucester", customers.get(1842).getCounty());
	}

	@Test
	@DisplayName("Record 1843: State is NJ")
	void StateOfRecord1843() {
		assertEquals("NJ", customers.get(1842).getState());
	}

	@Test
	@DisplayName("Record 1843: ZIP is 8051")
	void ZIPOfRecord1843() {
		assertEquals("8051", customers.get(1842).getZIP());
	}

	@Test
	@DisplayName("Record 1843: Phone is 856-468-7467")
	void PhoneOfRecord1843() {
		assertEquals("856-468-7467", customers.get(1842).getPhone());
	}

	@Test
	@DisplayName("Record 1843: Fax is 856-468-4379")
	void FaxOfRecord1843() {
		assertEquals("856-468-4379", customers.get(1842).getFax());
	}

	@Test
	@DisplayName("Record 1843: Email is basil@magliulo.com")
	void EmailOfRecord1843() {
		assertEquals("basil@magliulo.com", customers.get(1842).getEmail());
	}

	@Test
	@DisplayName("Record 1843: Web is http://www.basilmagliulo.com")
	void WebOfRecord1843() {
		assertEquals("http://www.basilmagliulo.com", customers.get(1842).getWeb());
	}
}
