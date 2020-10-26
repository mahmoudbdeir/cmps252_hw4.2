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

@Tag("36")
class Record_1279 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1279: FirstName is Rafaela")
	void FirstNameOfRecord1279() {
		assertEquals("Rafaela", customers.get(1278).getFirstName());
	}

	@Test
	@DisplayName("Record 1279: LastName is Grysiger")
	void LastNameOfRecord1279() {
		assertEquals("Grysiger", customers.get(1278).getLastName());
	}

	@Test
	@DisplayName("Record 1279: Company is Brook Warehousing Corp")
	void CompanyOfRecord1279() {
		assertEquals("Brook Warehousing Corp", customers.get(1278).getCompany());
	}

	@Test
	@DisplayName("Record 1279: Address is 4300 Ridgewood Center Dr")
	void AddressOfRecord1279() {
		assertEquals("4300 Ridgewood Center Dr", customers.get(1278).getAddress());
	}

	@Test
	@DisplayName("Record 1279: City is Woodbridge")
	void CityOfRecord1279() {
		assertEquals("Woodbridge", customers.get(1278).getCity());
	}

	@Test
	@DisplayName("Record 1279: County is Prince William")
	void CountyOfRecord1279() {
		assertEquals("Prince William", customers.get(1278).getCounty());
	}

	@Test
	@DisplayName("Record 1279: State is VA")
	void StateOfRecord1279() {
		assertEquals("VA", customers.get(1278).getState());
	}

	@Test
	@DisplayName("Record 1279: ZIP is 22192")
	void ZIPOfRecord1279() {
		assertEquals("22192", customers.get(1278).getZIP());
	}

	@Test
	@DisplayName("Record 1279: Phone is 703-590-3080")
	void PhoneOfRecord1279() {
		assertEquals("703-590-3080", customers.get(1278).getPhone());
	}

	@Test
	@DisplayName("Record 1279: Fax is 703-590-3699")
	void FaxOfRecord1279() {
		assertEquals("703-590-3699", customers.get(1278).getFax());
	}

	@Test
	@DisplayName("Record 1279: Email is rafaela@grysiger.com")
	void EmailOfRecord1279() {
		assertEquals("rafaela@grysiger.com", customers.get(1278).getEmail());
	}

	@Test
	@DisplayName("Record 1279: Web is http://www.rafaelagrysiger.com")
	void WebOfRecord1279() {
		assertEquals("http://www.rafaelagrysiger.com", customers.get(1278).getWeb());
	}
}
