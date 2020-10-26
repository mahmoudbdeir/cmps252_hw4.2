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

@Tag("29")
class Record_1327 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1327: FirstName is Eugene")
	void FirstNameOfRecord1327() {
		assertEquals("Eugene", customers.get(1326).getFirstName());
	}

	@Test
	@DisplayName("Record 1327: LastName is Stilts")
	void LastNameOfRecord1327() {
		assertEquals("Stilts", customers.get(1326).getLastName());
	}

	@Test
	@DisplayName("Record 1327: Company is Natl Assn Scl Workers Metro")
	void CompanyOfRecord1327() {
		assertEquals("Natl Assn Scl Workers Metro", customers.get(1326).getCompany());
	}

	@Test
	@DisplayName("Record 1327: Address is 133 Calle De Industrias")
	void AddressOfRecord1327() {
		assertEquals("133 Calle De Industrias", customers.get(1326).getAddress());
	}

	@Test
	@DisplayName("Record 1327: City is San Clemente")
	void CityOfRecord1327() {
		assertEquals("San Clemente", customers.get(1326).getCity());
	}

	@Test
	@DisplayName("Record 1327: County is Orange")
	void CountyOfRecord1327() {
		assertEquals("Orange", customers.get(1326).getCounty());
	}

	@Test
	@DisplayName("Record 1327: State is CA")
	void StateOfRecord1327() {
		assertEquals("CA", customers.get(1326).getState());
	}

	@Test
	@DisplayName("Record 1327: ZIP is 92672")
	void ZIPOfRecord1327() {
		assertEquals("92672", customers.get(1326).getZIP());
	}

	@Test
	@DisplayName("Record 1327: Phone is 949-498-7969")
	void PhoneOfRecord1327() {
		assertEquals("949-498-7969", customers.get(1326).getPhone());
	}

	@Test
	@DisplayName("Record 1327: Fax is 949-498-5575")
	void FaxOfRecord1327() {
		assertEquals("949-498-5575", customers.get(1326).getFax());
	}

	@Test
	@DisplayName("Record 1327: Email is eugene@stilts.com")
	void EmailOfRecord1327() {
		assertEquals("eugene@stilts.com", customers.get(1326).getEmail());
	}

	@Test
	@DisplayName("Record 1327: Web is http://www.eugenestilts.com")
	void WebOfRecord1327() {
		assertEquals("http://www.eugenestilts.com", customers.get(1326).getWeb());
	}
}
