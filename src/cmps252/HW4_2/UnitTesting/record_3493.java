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

@Tag("14")
class Record_3493 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3493: FirstName is Maricela")
	void FirstNameOfRecord3493() {
		assertEquals("Maricela", customers.get(3492).getFirstName());
	}

	@Test
	@DisplayName("Record 3493: LastName is Brage")
	void LastNameOfRecord3493() {
		assertEquals("Brage", customers.get(3492).getLastName());
	}

	@Test
	@DisplayName("Record 3493: Company is Knews Am 970")
	void CompanyOfRecord3493() {
		assertEquals("Knews Am 970", customers.get(3492).getCompany());
	}

	@Test
	@DisplayName("Record 3493: Address is 123 Gray Ave")
	void AddressOfRecord3493() {
		assertEquals("123 Gray Ave", customers.get(3492).getAddress());
	}

	@Test
	@DisplayName("Record 3493: City is Santa Barbara")
	void CityOfRecord3493() {
		assertEquals("Santa Barbara", customers.get(3492).getCity());
	}

	@Test
	@DisplayName("Record 3493: County is Santa Barbara")
	void CountyOfRecord3493() {
		assertEquals("Santa Barbara", customers.get(3492).getCounty());
	}

	@Test
	@DisplayName("Record 3493: State is CA")
	void StateOfRecord3493() {
		assertEquals("CA", customers.get(3492).getState());
	}

	@Test
	@DisplayName("Record 3493: ZIP is 93101")
	void ZIPOfRecord3493() {
		assertEquals("93101", customers.get(3492).getZIP());
	}

	@Test
	@DisplayName("Record 3493: Phone is 805-966-8209")
	void PhoneOfRecord3493() {
		assertEquals("805-966-8209", customers.get(3492).getPhone());
	}

	@Test
	@DisplayName("Record 3493: Fax is 805-966-4913")
	void FaxOfRecord3493() {
		assertEquals("805-966-4913", customers.get(3492).getFax());
	}

	@Test
	@DisplayName("Record 3493: Email is maricela@brage.com")
	void EmailOfRecord3493() {
		assertEquals("maricela@brage.com", customers.get(3492).getEmail());
	}

	@Test
	@DisplayName("Record 3493: Web is http://www.maricelabrage.com")
	void WebOfRecord3493() {
		assertEquals("http://www.maricelabrage.com", customers.get(3492).getWeb());
	}
}
