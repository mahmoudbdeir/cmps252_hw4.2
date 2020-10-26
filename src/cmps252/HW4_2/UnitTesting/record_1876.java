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

@Tag("20")
class Record_1876 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1876: FirstName is Shon")
	void FirstNameOfRecord1876() {
		assertEquals("Shon", customers.get(1875).getFirstName());
	}

	@Test
	@DisplayName("Record 1876: LastName is Wyborny")
	void LastNameOfRecord1876() {
		assertEquals("Wyborny", customers.get(1875).getLastName());
	}

	@Test
	@DisplayName("Record 1876: Company is Innovative Electronics & Cmptg")
	void CompanyOfRecord1876() {
		assertEquals("Innovative Electronics & Cmptg", customers.get(1875).getCompany());
	}

	@Test
	@DisplayName("Record 1876: Address is 24832 Jericho Tpke")
	void AddressOfRecord1876() {
		assertEquals("24832 Jericho Tpke", customers.get(1875).getAddress());
	}

	@Test
	@DisplayName("Record 1876: City is Floral Park")
	void CityOfRecord1876() {
		assertEquals("Floral Park", customers.get(1875).getCity());
	}

	@Test
	@DisplayName("Record 1876: County is Nassau")
	void CountyOfRecord1876() {
		assertEquals("Nassau", customers.get(1875).getCounty());
	}

	@Test
	@DisplayName("Record 1876: State is NY")
	void StateOfRecord1876() {
		assertEquals("NY", customers.get(1875).getState());
	}

	@Test
	@DisplayName("Record 1876: ZIP is 11001")
	void ZIPOfRecord1876() {
		assertEquals("11001", customers.get(1875).getZIP());
	}

	@Test
	@DisplayName("Record 1876: Phone is 516-437-4004")
	void PhoneOfRecord1876() {
		assertEquals("516-437-4004", customers.get(1875).getPhone());
	}

	@Test
	@DisplayName("Record 1876: Fax is 516-437-0719")
	void FaxOfRecord1876() {
		assertEquals("516-437-0719", customers.get(1875).getFax());
	}

	@Test
	@DisplayName("Record 1876: Email is shon@wyborny.com")
	void EmailOfRecord1876() {
		assertEquals("shon@wyborny.com", customers.get(1875).getEmail());
	}

	@Test
	@DisplayName("Record 1876: Web is http://www.shonwyborny.com")
	void WebOfRecord1876() {
		assertEquals("http://www.shonwyborny.com", customers.get(1875).getWeb());
	}
}
