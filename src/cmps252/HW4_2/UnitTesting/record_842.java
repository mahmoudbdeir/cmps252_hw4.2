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

@Tag("23")
class Record_842 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 842: FirstName is Denis")
	void FirstNameOfRecord842() {
		assertEquals("Denis", customers.get(841).getFirstName());
	}

	@Test
	@DisplayName("Record 842: LastName is Tausch")
	void LastNameOfRecord842() {
		assertEquals("Tausch", customers.get(841).getLastName());
	}

	@Test
	@DisplayName("Record 842: Company is Safway Steel Products")
	void CompanyOfRecord842() {
		assertEquals("Safway Steel Products", customers.get(841).getCompany());
	}

	@Test
	@DisplayName("Record 842: Address is 1922 Republic Ave")
	void AddressOfRecord842() {
		assertEquals("1922 Republic Ave", customers.get(841).getAddress());
	}

	@Test
	@DisplayName("Record 842: City is San Leandro")
	void CityOfRecord842() {
		assertEquals("San Leandro", customers.get(841).getCity());
	}

	@Test
	@DisplayName("Record 842: County is Alameda")
	void CountyOfRecord842() {
		assertEquals("Alameda", customers.get(841).getCounty());
	}

	@Test
	@DisplayName("Record 842: State is CA")
	void StateOfRecord842() {
		assertEquals("CA", customers.get(841).getState());
	}

	@Test
	@DisplayName("Record 842: ZIP is 94577")
	void ZIPOfRecord842() {
		assertEquals("94577", customers.get(841).getZIP());
	}

	@Test
	@DisplayName("Record 842: Phone is 510-483-6073")
	void PhoneOfRecord842() {
		assertEquals("510-483-6073", customers.get(841).getPhone());
	}

	@Test
	@DisplayName("Record 842: Fax is 510-483-8936")
	void FaxOfRecord842() {
		assertEquals("510-483-8936", customers.get(841).getFax());
	}

	@Test
	@DisplayName("Record 842: Email is denis@tausch.com")
	void EmailOfRecord842() {
		assertEquals("denis@tausch.com", customers.get(841).getEmail());
	}

	@Test
	@DisplayName("Record 842: Web is http://www.denistausch.com")
	void WebOfRecord842() {
		assertEquals("http://www.denistausch.com", customers.get(841).getWeb());
	}
}
