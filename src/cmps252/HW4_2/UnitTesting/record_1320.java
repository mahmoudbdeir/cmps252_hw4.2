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

@Tag("7")
class Record_1320 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1320: FirstName is Brendan")
	void FirstNameOfRecord1320() {
		assertEquals("Brendan", customers.get(1319).getFirstName());
	}

	@Test
	@DisplayName("Record 1320: LastName is Campellone")
	void LastNameOfRecord1320() {
		assertEquals("Campellone", customers.get(1319).getLastName());
	}

	@Test
	@DisplayName("Record 1320: Company is Best Insurance Agency Inc")
	void CompanyOfRecord1320() {
		assertEquals("Best Insurance Agency Inc", customers.get(1319).getCompany());
	}

	@Test
	@DisplayName("Record 1320: Address is 7601 Central St")
	void AddressOfRecord1320() {
		assertEquals("7601 Central St", customers.get(1319).getAddress());
	}

	@Test
	@DisplayName("Record 1320: City is Detroit")
	void CityOfRecord1320() {
		assertEquals("Detroit", customers.get(1319).getCity());
	}

	@Test
	@DisplayName("Record 1320: County is Wayne")
	void CountyOfRecord1320() {
		assertEquals("Wayne", customers.get(1319).getCounty());
	}

	@Test
	@DisplayName("Record 1320: State is MI")
	void StateOfRecord1320() {
		assertEquals("MI", customers.get(1319).getState());
	}

	@Test
	@DisplayName("Record 1320: ZIP is 48210")
	void ZIPOfRecord1320() {
		assertEquals("48210", customers.get(1319).getZIP());
	}

	@Test
	@DisplayName("Record 1320: Phone is 313-834-8343")
	void PhoneOfRecord1320() {
		assertEquals("313-834-8343", customers.get(1319).getPhone());
	}

	@Test
	@DisplayName("Record 1320: Fax is 313-834-0665")
	void FaxOfRecord1320() {
		assertEquals("313-834-0665", customers.get(1319).getFax());
	}

	@Test
	@DisplayName("Record 1320: Email is brendan@campellone.com")
	void EmailOfRecord1320() {
		assertEquals("brendan@campellone.com", customers.get(1319).getEmail());
	}

	@Test
	@DisplayName("Record 1320: Web is http://www.brendancampellone.com")
	void WebOfRecord1320() {
		assertEquals("http://www.brendancampellone.com", customers.get(1319).getWeb());
	}
}
