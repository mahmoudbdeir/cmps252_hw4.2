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
class Record_4820 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4820: FirstName is Elida")
	void FirstNameOfRecord4820() {
		assertEquals("Elida", customers.get(4819).getFirstName());
	}

	@Test
	@DisplayName("Record 4820: LastName is Blend")
	void LastNameOfRecord4820() {
		assertEquals("Blend", customers.get(4819).getLastName());
	}

	@Test
	@DisplayName("Record 4820: Company is Midwest Micro Tek Inc")
	void CompanyOfRecord4820() {
		assertEquals("Midwest Micro Tek Inc", customers.get(4819).getCompany());
	}

	@Test
	@DisplayName("Record 4820: Address is 2550 9th St")
	void AddressOfRecord4820() {
		assertEquals("2550 9th St", customers.get(4819).getAddress());
	}

	@Test
	@DisplayName("Record 4820: City is Berkeley")
	void CityOfRecord4820() {
		assertEquals("Berkeley", customers.get(4819).getCity());
	}

	@Test
	@DisplayName("Record 4820: County is Alameda")
	void CountyOfRecord4820() {
		assertEquals("Alameda", customers.get(4819).getCounty());
	}

	@Test
	@DisplayName("Record 4820: State is CA")
	void StateOfRecord4820() {
		assertEquals("CA", customers.get(4819).getState());
	}

	@Test
	@DisplayName("Record 4820: ZIP is 94710")
	void ZIPOfRecord4820() {
		assertEquals("94710", customers.get(4819).getZIP());
	}

	@Test
	@DisplayName("Record 4820: Phone is 510-848-9155")
	void PhoneOfRecord4820() {
		assertEquals("510-848-9155", customers.get(4819).getPhone());
	}

	@Test
	@DisplayName("Record 4820: Fax is 510-848-6775")
	void FaxOfRecord4820() {
		assertEquals("510-848-6775", customers.get(4819).getFax());
	}

	@Test
	@DisplayName("Record 4820: Email is elida@blend.com")
	void EmailOfRecord4820() {
		assertEquals("elida@blend.com", customers.get(4819).getEmail());
	}

	@Test
	@DisplayName("Record 4820: Web is http://www.elidablend.com")
	void WebOfRecord4820() {
		assertEquals("http://www.elidablend.com", customers.get(4819).getWeb());
	}
}
