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

@Tag("38")
class Record_1403 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1403: FirstName is Asa")
	void FirstNameOfRecord1403() {
		assertEquals("Asa", customers.get(1402).getFirstName());
	}

	@Test
	@DisplayName("Record 1403: LastName is Lancaster")
	void LastNameOfRecord1403() {
		assertEquals("Lancaster", customers.get(1402).getLastName());
	}

	@Test
	@DisplayName("Record 1403: Company is Fiber Seal Of Northeast La")
	void CompanyOfRecord1403() {
		assertEquals("Fiber Seal Of Northeast La", customers.get(1402).getCompany());
	}

	@Test
	@DisplayName("Record 1403: Address is 212 Vintage Way")
	void AddressOfRecord1403() {
		assertEquals("212 Vintage Way", customers.get(1402).getAddress());
	}

	@Test
	@DisplayName("Record 1403: City is Novato")
	void CityOfRecord1403() {
		assertEquals("Novato", customers.get(1402).getCity());
	}

	@Test
	@DisplayName("Record 1403: County is Marin")
	void CountyOfRecord1403() {
		assertEquals("Marin", customers.get(1402).getCounty());
	}

	@Test
	@DisplayName("Record 1403: State is CA")
	void StateOfRecord1403() {
		assertEquals("CA", customers.get(1402).getState());
	}

	@Test
	@DisplayName("Record 1403: ZIP is 94945")
	void ZIPOfRecord1403() {
		assertEquals("94945", customers.get(1402).getZIP());
	}

	@Test
	@DisplayName("Record 1403: Phone is 415-898-6777")
	void PhoneOfRecord1403() {
		assertEquals("415-898-6777", customers.get(1402).getPhone());
	}

	@Test
	@DisplayName("Record 1403: Fax is 415-898-4269")
	void FaxOfRecord1403() {
		assertEquals("415-898-4269", customers.get(1402).getFax());
	}

	@Test
	@DisplayName("Record 1403: Email is asa@lancaster.com")
	void EmailOfRecord1403() {
		assertEquals("asa@lancaster.com", customers.get(1402).getEmail());
	}

	@Test
	@DisplayName("Record 1403: Web is http://www.asalancaster.com")
	void WebOfRecord1403() {
		assertEquals("http://www.asalancaster.com", customers.get(1402).getWeb());
	}
}
