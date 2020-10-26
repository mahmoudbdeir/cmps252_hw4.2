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

@Tag("31")
class Record_1766 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1766: FirstName is Simone")
	void FirstNameOfRecord1766() {
		assertEquals("Simone", customers.get(1765).getFirstName());
	}

	@Test
	@DisplayName("Record 1766: LastName is Leverett")
	void LastNameOfRecord1766() {
		assertEquals("Leverett", customers.get(1765).getLastName());
	}

	@Test
	@DisplayName("Record 1766: Company is Redbrand Credit Union")
	void CompanyOfRecord1766() {
		assertEquals("Redbrand Credit Union", customers.get(1765).getCompany());
	}

	@Test
	@DisplayName("Record 1766: Address is 3rd")
	void AddressOfRecord1766() {
		assertEquals("3rd", customers.get(1765).getAddress());
	}

	@Test
	@DisplayName("Record 1766: City is Berkeley")
	void CityOfRecord1766() {
		assertEquals("Berkeley", customers.get(1765).getCity());
	}

	@Test
	@DisplayName("Record 1766: County is Alameda")
	void CountyOfRecord1766() {
		assertEquals("Alameda", customers.get(1765).getCounty());
	}

	@Test
	@DisplayName("Record 1766: State is CA")
	void StateOfRecord1766() {
		assertEquals("CA", customers.get(1765).getState());
	}

	@Test
	@DisplayName("Record 1766: ZIP is 94710")
	void ZIPOfRecord1766() {
		assertEquals("94710", customers.get(1765).getZIP());
	}

	@Test
	@DisplayName("Record 1766: Phone is 510-526-5878")
	void PhoneOfRecord1766() {
		assertEquals("510-526-5878", customers.get(1765).getPhone());
	}

	@Test
	@DisplayName("Record 1766: Fax is 510-526-3094")
	void FaxOfRecord1766() {
		assertEquals("510-526-3094", customers.get(1765).getFax());
	}

	@Test
	@DisplayName("Record 1766: Email is simone@leverett.com")
	void EmailOfRecord1766() {
		assertEquals("simone@leverett.com", customers.get(1765).getEmail());
	}

	@Test
	@DisplayName("Record 1766: Web is http://www.simoneleverett.com")
	void WebOfRecord1766() {
		assertEquals("http://www.simoneleverett.com", customers.get(1765).getWeb());
	}
}
