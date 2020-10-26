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

@Tag("9")
class Record_2497 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2497: FirstName is Brandon")
	void FirstNameOfRecord2497() {
		assertEquals("Brandon", customers.get(2496).getFirstName());
	}

	@Test
	@DisplayName("Record 2497: LastName is Gonales")
	void LastNameOfRecord2497() {
		assertEquals("Gonales", customers.get(2496).getLastName());
	}

	@Test
	@DisplayName("Record 2497: Company is Art Schneck Optical Co")
	void CompanyOfRecord2497() {
		assertEquals("Art Schneck Optical Co", customers.get(2496).getCompany());
	}

	@Test
	@DisplayName("Record 2497: Address is 1379 Old County Rd")
	void AddressOfRecord2497() {
		assertEquals("1379 Old County Rd", customers.get(2496).getAddress());
	}

	@Test
	@DisplayName("Record 2497: City is San Carlos")
	void CityOfRecord2497() {
		assertEquals("San Carlos", customers.get(2496).getCity());
	}

	@Test
	@DisplayName("Record 2497: County is San Mateo")
	void CountyOfRecord2497() {
		assertEquals("San Mateo", customers.get(2496).getCounty());
	}

	@Test
	@DisplayName("Record 2497: State is CA")
	void StateOfRecord2497() {
		assertEquals("CA", customers.get(2496).getState());
	}

	@Test
	@DisplayName("Record 2497: ZIP is 94070")
	void ZIPOfRecord2497() {
		assertEquals("94070", customers.get(2496).getZIP());
	}

	@Test
	@DisplayName("Record 2497: Phone is 650-592-6896")
	void PhoneOfRecord2497() {
		assertEquals("650-592-6896", customers.get(2496).getPhone());
	}

	@Test
	@DisplayName("Record 2497: Fax is 650-592-1932")
	void FaxOfRecord2497() {
		assertEquals("650-592-1932", customers.get(2496).getFax());
	}

	@Test
	@DisplayName("Record 2497: Email is brandon@gonales.com")
	void EmailOfRecord2497() {
		assertEquals("brandon@gonales.com", customers.get(2496).getEmail());
	}

	@Test
	@DisplayName("Record 2497: Web is http://www.brandongonales.com")
	void WebOfRecord2497() {
		assertEquals("http://www.brandongonales.com", customers.get(2496).getWeb());
	}
}
