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

@Tag("22")
class Record_3120 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3120: FirstName is Evangelina")
	void FirstNameOfRecord3120() {
		assertEquals("Evangelina", customers.get(3119).getFirstName());
	}

	@Test
	@DisplayName("Record 3120: LastName is Butac")
	void LastNameOfRecord3120() {
		assertEquals("Butac", customers.get(3119).getLastName());
	}

	@Test
	@DisplayName("Record 3120: Company is T J Bros Inc Body Shop")
	void CompanyOfRecord3120() {
		assertEquals("T J Bros Inc Body Shop", customers.get(3119).getCompany());
	}

	@Test
	@DisplayName("Record 3120: Address is 7606 Sw Bridgeport Rd")
	void AddressOfRecord3120() {
		assertEquals("7606 Sw Bridgeport Rd", customers.get(3119).getAddress());
	}

	@Test
	@DisplayName("Record 3120: City is Portland")
	void CityOfRecord3120() {
		assertEquals("Portland", customers.get(3119).getCity());
	}

	@Test
	@DisplayName("Record 3120: County is Washington")
	void CountyOfRecord3120() {
		assertEquals("Washington", customers.get(3119).getCounty());
	}

	@Test
	@DisplayName("Record 3120: State is OR")
	void StateOfRecord3120() {
		assertEquals("OR", customers.get(3119).getState());
	}

	@Test
	@DisplayName("Record 3120: ZIP is 97224")
	void ZIPOfRecord3120() {
		assertEquals("97224", customers.get(3119).getZIP());
	}

	@Test
	@DisplayName("Record 3120: Phone is 503-620-7482")
	void PhoneOfRecord3120() {
		assertEquals("503-620-7482", customers.get(3119).getPhone());
	}

	@Test
	@DisplayName("Record 3120: Fax is 503-620-0556")
	void FaxOfRecord3120() {
		assertEquals("503-620-0556", customers.get(3119).getFax());
	}

	@Test
	@DisplayName("Record 3120: Email is evangelina@butac.com")
	void EmailOfRecord3120() {
		assertEquals("evangelina@butac.com", customers.get(3119).getEmail());
	}

	@Test
	@DisplayName("Record 3120: Web is http://www.evangelinabutac.com")
	void WebOfRecord3120() {
		assertEquals("http://www.evangelinabutac.com", customers.get(3119).getWeb());
	}
}
