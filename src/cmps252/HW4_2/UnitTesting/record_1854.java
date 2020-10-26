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

@Tag("32")
class Record_1854 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1854: FirstName is Dwain")
	void FirstNameOfRecord1854() {
		assertEquals("Dwain", customers.get(1853).getFirstName());
	}

	@Test
	@DisplayName("Record 1854: LastName is Maio")
	void LastNameOfRecord1854() {
		assertEquals("Maio", customers.get(1853).getLastName());
	}

	@Test
	@DisplayName("Record 1854: Company is Hydelberg Press Inc")
	void CompanyOfRecord1854() {
		assertEquals("Hydelberg Press Inc", customers.get(1853).getCompany());
	}

	@Test
	@DisplayName("Record 1854: Address is 104 Tremont St")
	void AddressOfRecord1854() {
		assertEquals("104 Tremont St", customers.get(1853).getAddress());
	}

	@Test
	@DisplayName("Record 1854: City is Everett")
	void CityOfRecord1854() {
		assertEquals("Everett", customers.get(1853).getCity());
	}

	@Test
	@DisplayName("Record 1854: County is Middlesex")
	void CountyOfRecord1854() {
		assertEquals("Middlesex", customers.get(1853).getCounty());
	}

	@Test
	@DisplayName("Record 1854: State is MA")
	void StateOfRecord1854() {
		assertEquals("MA", customers.get(1853).getState());
	}

	@Test
	@DisplayName("Record 1854: ZIP is 2149")
	void ZIPOfRecord1854() {
		assertEquals("2149", customers.get(1853).getZIP());
	}

	@Test
	@DisplayName("Record 1854: Phone is 617-381-6692")
	void PhoneOfRecord1854() {
		assertEquals("617-381-6692", customers.get(1853).getPhone());
	}

	@Test
	@DisplayName("Record 1854: Fax is 617-381-5929")
	void FaxOfRecord1854() {
		assertEquals("617-381-5929", customers.get(1853).getFax());
	}

	@Test
	@DisplayName("Record 1854: Email is dwain@maio.com")
	void EmailOfRecord1854() {
		assertEquals("dwain@maio.com", customers.get(1853).getEmail());
	}

	@Test
	@DisplayName("Record 1854: Web is http://www.dwainmaio.com")
	void WebOfRecord1854() {
		assertEquals("http://www.dwainmaio.com", customers.get(1853).getWeb());
	}
}
