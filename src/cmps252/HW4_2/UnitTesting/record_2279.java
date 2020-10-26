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

@Tag("2")
class Record_2279 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2279: FirstName is Manuela")
	void FirstNameOfRecord2279() {
		assertEquals("Manuela", customers.get(2278).getFirstName());
	}

	@Test
	@DisplayName("Record 2279: LastName is Fugle")
	void LastNameOfRecord2279() {
		assertEquals("Fugle", customers.get(2278).getLastName());
	}

	@Test
	@DisplayName("Record 2279: Company is Lewis & Clark Research")
	void CompanyOfRecord2279() {
		assertEquals("Lewis & Clark Research", customers.get(2278).getCompany());
	}

	@Test
	@DisplayName("Record 2279: Address is 1015 Camelia St")
	void AddressOfRecord2279() {
		assertEquals("1015 Camelia St", customers.get(2278).getAddress());
	}

	@Test
	@DisplayName("Record 2279: City is Berkeley")
	void CityOfRecord2279() {
		assertEquals("Berkeley", customers.get(2278).getCity());
	}

	@Test
	@DisplayName("Record 2279: County is Alameda")
	void CountyOfRecord2279() {
		assertEquals("Alameda", customers.get(2278).getCounty());
	}

	@Test
	@DisplayName("Record 2279: State is CA")
	void StateOfRecord2279() {
		assertEquals("CA", customers.get(2278).getState());
	}

	@Test
	@DisplayName("Record 2279: ZIP is 94710")
	void ZIPOfRecord2279() {
		assertEquals("94710", customers.get(2278).getZIP());
	}

	@Test
	@DisplayName("Record 2279: Phone is 510-527-8943")
	void PhoneOfRecord2279() {
		assertEquals("510-527-8943", customers.get(2278).getPhone());
	}

	@Test
	@DisplayName("Record 2279: Fax is 510-527-3333")
	void FaxOfRecord2279() {
		assertEquals("510-527-3333", customers.get(2278).getFax());
	}

	@Test
	@DisplayName("Record 2279: Email is manuela@fugle.com")
	void EmailOfRecord2279() {
		assertEquals("manuela@fugle.com", customers.get(2278).getEmail());
	}

	@Test
	@DisplayName("Record 2279: Web is http://www.manuelafugle.com")
	void WebOfRecord2279() {
		assertEquals("http://www.manuelafugle.com", customers.get(2278).getWeb());
	}
}
