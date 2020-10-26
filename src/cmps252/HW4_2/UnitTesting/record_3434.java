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

@Tag("26")
class Record_3434 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3434: FirstName is Elisa")
	void FirstNameOfRecord3434() {
		assertEquals("Elisa", customers.get(3433).getFirstName());
	}

	@Test
	@DisplayName("Record 3434: LastName is Lopez")
	void LastNameOfRecord3434() {
		assertEquals("Lopez", customers.get(3433).getLastName());
	}

	@Test
	@DisplayName("Record 3434: Company is Precision Hard Chrome Co Inc")
	void CompanyOfRecord3434() {
		assertEquals("Precision Hard Chrome Co Inc", customers.get(3433).getCompany());
	}

	@Test
	@DisplayName("Record 3434: Address is 2940 16th St")
	void AddressOfRecord3434() {
		assertEquals("2940 16th St", customers.get(3433).getAddress());
	}

	@Test
	@DisplayName("Record 3434: City is San Francisco")
	void CityOfRecord3434() {
		assertEquals("San Francisco", customers.get(3433).getCity());
	}

	@Test
	@DisplayName("Record 3434: County is San Francisco")
	void CountyOfRecord3434() {
		assertEquals("San Francisco", customers.get(3433).getCounty());
	}

	@Test
	@DisplayName("Record 3434: State is CA")
	void StateOfRecord3434() {
		assertEquals("CA", customers.get(3433).getState());
	}

	@Test
	@DisplayName("Record 3434: ZIP is 94103")
	void ZIPOfRecord3434() {
		assertEquals("94103", customers.get(3433).getZIP());
	}

	@Test
	@DisplayName("Record 3434: Phone is 415-558-0690")
	void PhoneOfRecord3434() {
		assertEquals("415-558-0690", customers.get(3433).getPhone());
	}

	@Test
	@DisplayName("Record 3434: Fax is 415-558-4674")
	void FaxOfRecord3434() {
		assertEquals("415-558-4674", customers.get(3433).getFax());
	}

	@Test
	@DisplayName("Record 3434: Email is elisa@lopez.com")
	void EmailOfRecord3434() {
		assertEquals("elisa@lopez.com", customers.get(3433).getEmail());
	}

	@Test
	@DisplayName("Record 3434: Web is http://www.elisalopez.com")
	void WebOfRecord3434() {
		assertEquals("http://www.elisalopez.com", customers.get(3433).getWeb());
	}
}
