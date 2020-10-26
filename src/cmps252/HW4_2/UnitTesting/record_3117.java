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

@Tag("5")
class Record_3117 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3117: FirstName is Lucille")
	void FirstNameOfRecord3117() {
		assertEquals("Lucille", customers.get(3116).getFirstName());
	}

	@Test
	@DisplayName("Record 3117: LastName is Mcmurtrie")
	void LastNameOfRecord3117() {
		assertEquals("Mcmurtrie", customers.get(3116).getLastName());
	}

	@Test
	@DisplayName("Record 3117: Company is Umbaugh, Craig A Esq")
	void CompanyOfRecord3117() {
		assertEquals("Umbaugh, Craig A Esq", customers.get(3116).getCompany());
	}

	@Test
	@DisplayName("Record 3117: Address is 15 W Central Pky")
	void AddressOfRecord3117() {
		assertEquals("15 W Central Pky", customers.get(3116).getAddress());
	}

	@Test
	@DisplayName("Record 3117: City is Cincinnati")
	void CityOfRecord3117() {
		assertEquals("Cincinnati", customers.get(3116).getCity());
	}

	@Test
	@DisplayName("Record 3117: County is Hamilton")
	void CountyOfRecord3117() {
		assertEquals("Hamilton", customers.get(3116).getCounty());
	}

	@Test
	@DisplayName("Record 3117: State is OH")
	void StateOfRecord3117() {
		assertEquals("OH", customers.get(3116).getState());
	}

	@Test
	@DisplayName("Record 3117: ZIP is 45202")
	void ZIPOfRecord3117() {
		assertEquals("45202", customers.get(3116).getZIP());
	}

	@Test
	@DisplayName("Record 3117: Phone is 513-762-3588")
	void PhoneOfRecord3117() {
		assertEquals("513-762-3588", customers.get(3116).getPhone());
	}

	@Test
	@DisplayName("Record 3117: Fax is 513-762-5968")
	void FaxOfRecord3117() {
		assertEquals("513-762-5968", customers.get(3116).getFax());
	}

	@Test
	@DisplayName("Record 3117: Email is lucille@mcmurtrie.com")
	void EmailOfRecord3117() {
		assertEquals("lucille@mcmurtrie.com", customers.get(3116).getEmail());
	}

	@Test
	@DisplayName("Record 3117: Web is http://www.lucillemcmurtrie.com")
	void WebOfRecord3117() {
		assertEquals("http://www.lucillemcmurtrie.com", customers.get(3116).getWeb());
	}
}
