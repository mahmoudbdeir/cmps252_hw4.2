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

@Tag("6")
class Record_868 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 868: FirstName is Dydra")
	void FirstNameOfRecord868() {
		assertEquals("Dydra", customers.get(867).getFirstName());
	}

	@Test
	@DisplayName("Record 868: LastName is Laganga")
	void LastNameOfRecord868() {
		assertEquals("Laganga", customers.get(867).getLastName());
	}

	@Test
	@DisplayName("Record 868: Company is Perma Cool")
	void CompanyOfRecord868() {
		assertEquals("Perma Cool", customers.get(867).getCompany());
	}

	@Test
	@DisplayName("Record 868: Address is 8880 Ward Pky")
	void AddressOfRecord868() {
		assertEquals("8880 Ward Pky", customers.get(867).getAddress());
	}

	@Test
	@DisplayName("Record 868: City is Kansas City")
	void CityOfRecord868() {
		assertEquals("Kansas City", customers.get(867).getCity());
	}

	@Test
	@DisplayName("Record 868: County is Jackson")
	void CountyOfRecord868() {
		assertEquals("Jackson", customers.get(867).getCounty());
	}

	@Test
	@DisplayName("Record 868: State is MO")
	void StateOfRecord868() {
		assertEquals("MO", customers.get(867).getState());
	}

	@Test
	@DisplayName("Record 868: ZIP is 64114")
	void ZIPOfRecord868() {
		assertEquals("64114", customers.get(867).getZIP());
	}

	@Test
	@DisplayName("Record 868: Phone is 816-333-6031")
	void PhoneOfRecord868() {
		assertEquals("816-333-6031", customers.get(867).getPhone());
	}

	@Test
	@DisplayName("Record 868: Fax is 816-333-6592")
	void FaxOfRecord868() {
		assertEquals("816-333-6592", customers.get(867).getFax());
	}

	@Test
	@DisplayName("Record 868: Email is dydra@laganga.com")
	void EmailOfRecord868() {
		assertEquals("dydra@laganga.com", customers.get(867).getEmail());
	}

	@Test
	@DisplayName("Record 868: Web is http://www.dydralaganga.com")
	void WebOfRecord868() {
		assertEquals("http://www.dydralaganga.com", customers.get(867).getWeb());
	}
}
