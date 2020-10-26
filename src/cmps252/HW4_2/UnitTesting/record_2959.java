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

@Tag("49")
class Record_2959 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2959: FirstName is Regina")
	void FirstNameOfRecord2959() {
		assertEquals("Regina", customers.get(2958).getFirstName());
	}

	@Test
	@DisplayName("Record 2959: LastName is Sasuille")
	void LastNameOfRecord2959() {
		assertEquals("Sasuille", customers.get(2958).getLastName());
	}

	@Test
	@DisplayName("Record 2959: Company is Landscaping And Large Tree")
	void CompanyOfRecord2959() {
		assertEquals("Landscaping And Large Tree", customers.get(2958).getCompany());
	}

	@Test
	@DisplayName("Record 2959: Address is 3240 E Elm Rd")
	void AddressOfRecord2959() {
		assertEquals("3240 E Elm Rd", customers.get(2958).getAddress());
	}

	@Test
	@DisplayName("Record 2959: City is Oak Creek")
	void CityOfRecord2959() {
		assertEquals("Oak Creek", customers.get(2958).getCity());
	}

	@Test
	@DisplayName("Record 2959: County is Milwaukee")
	void CountyOfRecord2959() {
		assertEquals("Milwaukee", customers.get(2958).getCounty());
	}

	@Test
	@DisplayName("Record 2959: State is WI")
	void StateOfRecord2959() {
		assertEquals("WI", customers.get(2958).getState());
	}

	@Test
	@DisplayName("Record 2959: ZIP is 53154")
	void ZIPOfRecord2959() {
		assertEquals("53154", customers.get(2958).getZIP());
	}

	@Test
	@DisplayName("Record 2959: Phone is 414-761-9319")
	void PhoneOfRecord2959() {
		assertEquals("414-761-9319", customers.get(2958).getPhone());
	}

	@Test
	@DisplayName("Record 2959: Fax is 414-761-2477")
	void FaxOfRecord2959() {
		assertEquals("414-761-2477", customers.get(2958).getFax());
	}

	@Test
	@DisplayName("Record 2959: Email is regina@sasuille.com")
	void EmailOfRecord2959() {
		assertEquals("regina@sasuille.com", customers.get(2958).getEmail());
	}

	@Test
	@DisplayName("Record 2959: Web is http://www.reginasasuille.com")
	void WebOfRecord2959() {
		assertEquals("http://www.reginasasuille.com", customers.get(2958).getWeb());
	}
}
