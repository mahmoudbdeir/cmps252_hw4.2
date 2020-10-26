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

@Tag("19")
class Record_3590 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3590: FirstName is Edna")
	void FirstNameOfRecord3590() {
		assertEquals("Edna", customers.get(3589).getFirstName());
	}

	@Test
	@DisplayName("Record 3590: LastName is Dorsainvil")
	void LastNameOfRecord3590() {
		assertEquals("Dorsainvil", customers.get(3589).getLastName());
	}

	@Test
	@DisplayName("Record 3590: Company is Star Mountain")
	void CompanyOfRecord3590() {
		assertEquals("Star Mountain", customers.get(3589).getCompany());
	}

	@Test
	@DisplayName("Record 3590: Address is 810 Central Ave")
	void AddressOfRecord3590() {
		assertEquals("810 Central Ave", customers.get(3589).getAddress());
	}

	@Test
	@DisplayName("Record 3590: City is Plainfield")
	void CityOfRecord3590() {
		assertEquals("Plainfield", customers.get(3589).getCity());
	}

	@Test
	@DisplayName("Record 3590: County is Union")
	void CountyOfRecord3590() {
		assertEquals("Union", customers.get(3589).getCounty());
	}

	@Test
	@DisplayName("Record 3590: State is NJ")
	void StateOfRecord3590() {
		assertEquals("NJ", customers.get(3589).getState());
	}

	@Test
	@DisplayName("Record 3590: ZIP is 7060")
	void ZIPOfRecord3590() {
		assertEquals("7060", customers.get(3589).getZIP());
	}

	@Test
	@DisplayName("Record 3590: Phone is 908-757-5935")
	void PhoneOfRecord3590() {
		assertEquals("908-757-5935", customers.get(3589).getPhone());
	}

	@Test
	@DisplayName("Record 3590: Fax is 908-757-3735")
	void FaxOfRecord3590() {
		assertEquals("908-757-3735", customers.get(3589).getFax());
	}

	@Test
	@DisplayName("Record 3590: Email is edna@dorsainvil.com")
	void EmailOfRecord3590() {
		assertEquals("edna@dorsainvil.com", customers.get(3589).getEmail());
	}

	@Test
	@DisplayName("Record 3590: Web is http://www.ednadorsainvil.com")
	void WebOfRecord3590() {
		assertEquals("http://www.ednadorsainvil.com", customers.get(3589).getWeb());
	}
}
