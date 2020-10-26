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

@Tag("28")
class Record_1696 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1696: FirstName is Alba")
	void FirstNameOfRecord1696() {
		assertEquals("Alba", customers.get(1695).getFirstName());
	}

	@Test
	@DisplayName("Record 1696: LastName is Cotillo")
	void LastNameOfRecord1696() {
		assertEquals("Cotillo", customers.get(1695).getLastName());
	}

	@Test
	@DisplayName("Record 1696: Company is Professional Optical Whol")
	void CompanyOfRecord1696() {
		assertEquals("Professional Optical Whol", customers.get(1695).getCompany());
	}

	@Test
	@DisplayName("Record 1696: Address is 18191 Se Tickle Creek Rd")
	void AddressOfRecord1696() {
		assertEquals("18191 Se Tickle Creek Rd", customers.get(1695).getAddress());
	}

	@Test
	@DisplayName("Record 1696: City is Boring")
	void CityOfRecord1696() {
		assertEquals("Boring", customers.get(1695).getCity());
	}

	@Test
	@DisplayName("Record 1696: County is Clackamas")
	void CountyOfRecord1696() {
		assertEquals("Clackamas", customers.get(1695).getCounty());
	}

	@Test
	@DisplayName("Record 1696: State is OR")
	void StateOfRecord1696() {
		assertEquals("OR", customers.get(1695).getState());
	}

	@Test
	@DisplayName("Record 1696: ZIP is 97009")
	void ZIPOfRecord1696() {
		assertEquals("97009", customers.get(1695).getZIP());
	}

	@Test
	@DisplayName("Record 1696: Phone is 503-658-3549")
	void PhoneOfRecord1696() {
		assertEquals("503-658-3549", customers.get(1695).getPhone());
	}

	@Test
	@DisplayName("Record 1696: Fax is 503-658-0707")
	void FaxOfRecord1696() {
		assertEquals("503-658-0707", customers.get(1695).getFax());
	}

	@Test
	@DisplayName("Record 1696: Email is alba@cotillo.com")
	void EmailOfRecord1696() {
		assertEquals("alba@cotillo.com", customers.get(1695).getEmail());
	}

	@Test
	@DisplayName("Record 1696: Web is http://www.albacotillo.com")
	void WebOfRecord1696() {
		assertEquals("http://www.albacotillo.com", customers.get(1695).getWeb());
	}
}
