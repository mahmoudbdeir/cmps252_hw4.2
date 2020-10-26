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

@Tag("18")
class Record_3150 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3150: FirstName is Kerry")
	void FirstNameOfRecord3150() {
		assertEquals("Kerry", customers.get(3149).getFirstName());
	}

	@Test
	@DisplayName("Record 3150: LastName is Metott")
	void LastNameOfRecord3150() {
		assertEquals("Metott", customers.get(3149).getLastName());
	}

	@Test
	@DisplayName("Record 3150: Company is Contract Eviction Service")
	void CompanyOfRecord3150() {
		assertEquals("Contract Eviction Service", customers.get(3149).getCompany());
	}

	@Test
	@DisplayName("Record 3150: Address is 557 Fairbanks St")
	void AddressOfRecord3150() {
		assertEquals("557 Fairbanks St", customers.get(3149).getAddress());
	}

	@Test
	@DisplayName("Record 3150: City is Fairbanks")
	void CityOfRecord3150() {
		assertEquals("Fairbanks", customers.get(3149).getCity());
	}

	@Test
	@DisplayName("Record 3150: County is Fairbanks North Star")
	void CountyOfRecord3150() {
		assertEquals("Fairbanks North Star", customers.get(3149).getCounty());
	}

	@Test
	@DisplayName("Record 3150: State is AK")
	void StateOfRecord3150() {
		assertEquals("AK", customers.get(3149).getState());
	}

	@Test
	@DisplayName("Record 3150: ZIP is 99709")
	void ZIPOfRecord3150() {
		assertEquals("99709", customers.get(3149).getZIP());
	}

	@Test
	@DisplayName("Record 3150: Phone is 907-479-7306")
	void PhoneOfRecord3150() {
		assertEquals("907-479-7306", customers.get(3149).getPhone());
	}

	@Test
	@DisplayName("Record 3150: Fax is 907-479-8658")
	void FaxOfRecord3150() {
		assertEquals("907-479-8658", customers.get(3149).getFax());
	}

	@Test
	@DisplayName("Record 3150: Email is kerry@metott.com")
	void EmailOfRecord3150() {
		assertEquals("kerry@metott.com", customers.get(3149).getEmail());
	}

	@Test
	@DisplayName("Record 3150: Web is http://www.kerrymetott.com")
	void WebOfRecord3150() {
		assertEquals("http://www.kerrymetott.com", customers.get(3149).getWeb());
	}
}
