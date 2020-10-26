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

@Tag("39")
class Record_161 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 161: FirstName is Everette")
	void FirstNameOfRecord161() {
		assertEquals("Everette", customers.get(160).getFirstName());
	}

	@Test
	@DisplayName("Record 161: LastName is Leffler")
	void LastNameOfRecord161() {
		assertEquals("Leffler", customers.get(160).getLastName());
	}

	@Test
	@DisplayName("Record 161: Company is Case, Max S Esq")
	void CompanyOfRecord161() {
		assertEquals("Case, Max S Esq", customers.get(160).getCompany());
	}

	@Test
	@DisplayName("Record 161: Address is 66 Pond St")
	void AddressOfRecord161() {
		assertEquals("66 Pond St", customers.get(160).getAddress());
	}

	@Test
	@DisplayName("Record 161: City is Whitman")
	void CityOfRecord161() {
		assertEquals("Whitman", customers.get(160).getCity());
	}

	@Test
	@DisplayName("Record 161: County is Plymouth")
	void CountyOfRecord161() {
		assertEquals("Plymouth", customers.get(160).getCounty());
	}

	@Test
	@DisplayName("Record 161: State is MA")
	void StateOfRecord161() {
		assertEquals("MA", customers.get(160).getState());
	}

	@Test
	@DisplayName("Record 161: ZIP is 2382")
	void ZIPOfRecord161() {
		assertEquals("2382", customers.get(160).getZIP());
	}

	@Test
	@DisplayName("Record 161: Phone is 781-447-3451")
	void PhoneOfRecord161() {
		assertEquals("781-447-3451", customers.get(160).getPhone());
	}

	@Test
	@DisplayName("Record 161: Fax is 781-447-9351")
	void FaxOfRecord161() {
		assertEquals("781-447-9351", customers.get(160).getFax());
	}

	@Test
	@DisplayName("Record 161: Email is everette@leffler.com")
	void EmailOfRecord161() {
		assertEquals("everette@leffler.com", customers.get(160).getEmail());
	}

	@Test
	@DisplayName("Record 161: Web is http://www.everetteleffler.com")
	void WebOfRecord161() {
		assertEquals("http://www.everetteleffler.com", customers.get(160).getWeb());
	}
}
