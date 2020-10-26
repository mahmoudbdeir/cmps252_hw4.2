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

@Tag("19")
class Record_2870 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2870: FirstName is Maggie")
	void FirstNameOfRecord2870() {
		assertEquals("Maggie", customers.get(2869).getFirstName());
	}

	@Test
	@DisplayName("Record 2870: LastName is Galiano")
	void LastNameOfRecord2870() {
		assertEquals("Galiano", customers.get(2869).getLastName());
	}

	@Test
	@DisplayName("Record 2870: Company is Island Computers")
	void CompanyOfRecord2870() {
		assertEquals("Island Computers", customers.get(2869).getCompany());
	}

	@Test
	@DisplayName("Record 2870: Address is 17843 Se Mcloughlin Blvd")
	void AddressOfRecord2870() {
		assertEquals("17843 Se Mcloughlin Blvd", customers.get(2869).getAddress());
	}

	@Test
	@DisplayName("Record 2870: City is Portland")
	void CityOfRecord2870() {
		assertEquals("Portland", customers.get(2869).getCity());
	}

	@Test
	@DisplayName("Record 2870: County is Clackamas")
	void CountyOfRecord2870() {
		assertEquals("Clackamas", customers.get(2869).getCounty());
	}

	@Test
	@DisplayName("Record 2870: State is OR")
	void StateOfRecord2870() {
		assertEquals("OR", customers.get(2869).getState());
	}

	@Test
	@DisplayName("Record 2870: ZIP is 97267")
	void ZIPOfRecord2870() {
		assertEquals("97267", customers.get(2869).getZIP());
	}

	@Test
	@DisplayName("Record 2870: Phone is 503-786-9830")
	void PhoneOfRecord2870() {
		assertEquals("503-786-9830", customers.get(2869).getPhone());
	}

	@Test
	@DisplayName("Record 2870: Fax is 503-786-3969")
	void FaxOfRecord2870() {
		assertEquals("503-786-3969", customers.get(2869).getFax());
	}

	@Test
	@DisplayName("Record 2870: Email is maggie@galiano.com")
	void EmailOfRecord2870() {
		assertEquals("maggie@galiano.com", customers.get(2869).getEmail());
	}

	@Test
	@DisplayName("Record 2870: Web is http://www.maggiegaliano.com")
	void WebOfRecord2870() {
		assertEquals("http://www.maggiegaliano.com", customers.get(2869).getWeb());
	}
}
