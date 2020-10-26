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

@Tag("13")
class Record_3301 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3301: FirstName is Malcolm")
	void FirstNameOfRecord3301() {
		assertEquals("Malcolm", customers.get(3300).getFirstName());
	}

	@Test
	@DisplayName("Record 3301: LastName is Jesus")
	void LastNameOfRecord3301() {
		assertEquals("Jesus", customers.get(3300).getLastName());
	}

	@Test
	@DisplayName("Record 3301: Company is Mid South Mntnc Paint Co Inc")
	void CompanyOfRecord3301() {
		assertEquals("Mid South Mntnc Paint Co Inc", customers.get(3300).getCompany());
	}

	@Test
	@DisplayName("Record 3301: Address is 570 Sw End Blvd")
	void AddressOfRecord3301() {
		assertEquals("570 Sw End Blvd", customers.get(3300).getAddress());
	}

	@Test
	@DisplayName("Record 3301: City is Quakertown")
	void CityOfRecord3301() {
		assertEquals("Quakertown", customers.get(3300).getCity());
	}

	@Test
	@DisplayName("Record 3301: County is Bucks")
	void CountyOfRecord3301() {
		assertEquals("Bucks", customers.get(3300).getCounty());
	}

	@Test
	@DisplayName("Record 3301: State is PA")
	void StateOfRecord3301() {
		assertEquals("PA", customers.get(3300).getState());
	}

	@Test
	@DisplayName("Record 3301: ZIP is 18951")
	void ZIPOfRecord3301() {
		assertEquals("18951", customers.get(3300).getZIP());
	}

	@Test
	@DisplayName("Record 3301: Phone is 215-538-1886")
	void PhoneOfRecord3301() {
		assertEquals("215-538-1886", customers.get(3300).getPhone());
	}

	@Test
	@DisplayName("Record 3301: Fax is 215-538-2076")
	void FaxOfRecord3301() {
		assertEquals("215-538-2076", customers.get(3300).getFax());
	}

	@Test
	@DisplayName("Record 3301: Email is malcolm@jesus.com")
	void EmailOfRecord3301() {
		assertEquals("malcolm@jesus.com", customers.get(3300).getEmail());
	}

	@Test
	@DisplayName("Record 3301: Web is http://www.malcolmjesus.com")
	void WebOfRecord3301() {
		assertEquals("http://www.malcolmjesus.com", customers.get(3300).getWeb());
	}
}
