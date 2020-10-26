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
class Record_3006 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3006: FirstName is Mona")
	void FirstNameOfRecord3006() {
		assertEquals("Mona", customers.get(3005).getFirstName());
	}

	@Test
	@DisplayName("Record 3006: LastName is Grgurevic")
	void LastNameOfRecord3006() {
		assertEquals("Grgurevic", customers.get(3005).getLastName());
	}

	@Test
	@DisplayName("Record 3006: Company is Hall, Thomas S Esq")
	void CompanyOfRecord3006() {
		assertEquals("Hall, Thomas S Esq", customers.get(3005).getCompany());
	}

	@Test
	@DisplayName("Record 3006: Address is 2095 W Hampden Ave")
	void AddressOfRecord3006() {
		assertEquals("2095 W Hampden Ave", customers.get(3005).getAddress());
	}

	@Test
	@DisplayName("Record 3006: City is Englewood")
	void CityOfRecord3006() {
		assertEquals("Englewood", customers.get(3005).getCity());
	}

	@Test
	@DisplayName("Record 3006: County is Arapahoe")
	void CountyOfRecord3006() {
		assertEquals("Arapahoe", customers.get(3005).getCounty());
	}

	@Test
	@DisplayName("Record 3006: State is CO")
	void StateOfRecord3006() {
		assertEquals("CO", customers.get(3005).getState());
	}

	@Test
	@DisplayName("Record 3006: ZIP is 80110")
	void ZIPOfRecord3006() {
		assertEquals("80110", customers.get(3005).getZIP());
	}

	@Test
	@DisplayName("Record 3006: Phone is 303-762-5326")
	void PhoneOfRecord3006() {
		assertEquals("303-762-5326", customers.get(3005).getPhone());
	}

	@Test
	@DisplayName("Record 3006: Fax is 303-762-2775")
	void FaxOfRecord3006() {
		assertEquals("303-762-2775", customers.get(3005).getFax());
	}

	@Test
	@DisplayName("Record 3006: Email is mona@grgurevic.com")
	void EmailOfRecord3006() {
		assertEquals("mona@grgurevic.com", customers.get(3005).getEmail());
	}

	@Test
	@DisplayName("Record 3006: Web is http://www.monagrgurevic.com")
	void WebOfRecord3006() {
		assertEquals("http://www.monagrgurevic.com", customers.get(3005).getWeb());
	}
}
