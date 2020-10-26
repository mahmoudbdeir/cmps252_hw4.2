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

@Tag("37")
class Record_3128 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3128: FirstName is Coleen")
	void FirstNameOfRecord3128() {
		assertEquals("Coleen", customers.get(3127).getFirstName());
	}

	@Test
	@DisplayName("Record 3128: LastName is Wendelin")
	void LastNameOfRecord3128() {
		assertEquals("Wendelin", customers.get(3127).getLastName());
	}

	@Test
	@DisplayName("Record 3128: Company is Robb, Philip A Esq")
	void CompanyOfRecord3128() {
		assertEquals("Robb, Philip A Esq", customers.get(3127).getCompany());
	}

	@Test
	@DisplayName("Record 3128: Address is 110 S 32nd St")
	void AddressOfRecord3128() {
		assertEquals("110 S 32nd St", customers.get(3127).getAddress());
	}

	@Test
	@DisplayName("Record 3128: City is Phoenix")
	void CityOfRecord3128() {
		assertEquals("Phoenix", customers.get(3127).getCity());
	}

	@Test
	@DisplayName("Record 3128: County is Maricopa")
	void CountyOfRecord3128() {
		assertEquals("Maricopa", customers.get(3127).getCounty());
	}

	@Test
	@DisplayName("Record 3128: State is AZ")
	void StateOfRecord3128() {
		assertEquals("AZ", customers.get(3127).getState());
	}

	@Test
	@DisplayName("Record 3128: ZIP is 85034")
	void ZIPOfRecord3128() {
		assertEquals("85034", customers.get(3127).getZIP());
	}

	@Test
	@DisplayName("Record 3128: Phone is 602-267-2678")
	void PhoneOfRecord3128() {
		assertEquals("602-267-2678", customers.get(3127).getPhone());
	}

	@Test
	@DisplayName("Record 3128: Fax is 602-267-1189")
	void FaxOfRecord3128() {
		assertEquals("602-267-1189", customers.get(3127).getFax());
	}

	@Test
	@DisplayName("Record 3128: Email is coleen@wendelin.com")
	void EmailOfRecord3128() {
		assertEquals("coleen@wendelin.com", customers.get(3127).getEmail());
	}

	@Test
	@DisplayName("Record 3128: Web is http://www.coleenwendelin.com")
	void WebOfRecord3128() {
		assertEquals("http://www.coleenwendelin.com", customers.get(3127).getWeb());
	}
}
