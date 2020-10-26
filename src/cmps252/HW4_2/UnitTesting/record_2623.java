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
class Record_2623 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2623: FirstName is Elias")
	void FirstNameOfRecord2623() {
		assertEquals("Elias", customers.get(2622).getFirstName());
	}

	@Test
	@DisplayName("Record 2623: LastName is Reyelts")
	void LastNameOfRecord2623() {
		assertEquals("Reyelts", customers.get(2622).getLastName());
	}

	@Test
	@DisplayName("Record 2623: Company is Kirk Machinists Inc")
	void CompanyOfRecord2623() {
		assertEquals("Kirk Machinists Inc", customers.get(2622).getCompany());
	}

	@Test
	@DisplayName("Record 2623: Address is 7240 Ne Sandy Blvd")
	void AddressOfRecord2623() {
		assertEquals("7240 Ne Sandy Blvd", customers.get(2622).getAddress());
	}

	@Test
	@DisplayName("Record 2623: City is Portland")
	void CityOfRecord2623() {
		assertEquals("Portland", customers.get(2622).getCity());
	}

	@Test
	@DisplayName("Record 2623: County is Multnomah")
	void CountyOfRecord2623() {
		assertEquals("Multnomah", customers.get(2622).getCounty());
	}

	@Test
	@DisplayName("Record 2623: State is OR")
	void StateOfRecord2623() {
		assertEquals("OR", customers.get(2622).getState());
	}

	@Test
	@DisplayName("Record 2623: ZIP is 97213")
	void ZIPOfRecord2623() {
		assertEquals("97213", customers.get(2622).getZIP());
	}

	@Test
	@DisplayName("Record 2623: Phone is 503-281-3505")
	void PhoneOfRecord2623() {
		assertEquals("503-281-3505", customers.get(2622).getPhone());
	}

	@Test
	@DisplayName("Record 2623: Fax is 503-281-2323")
	void FaxOfRecord2623() {
		assertEquals("503-281-2323", customers.get(2622).getFax());
	}

	@Test
	@DisplayName("Record 2623: Email is elias@reyelts.com")
	void EmailOfRecord2623() {
		assertEquals("elias@reyelts.com", customers.get(2622).getEmail());
	}

	@Test
	@DisplayName("Record 2623: Web is http://www.eliasreyelts.com")
	void WebOfRecord2623() {
		assertEquals("http://www.eliasreyelts.com", customers.get(2622).getWeb());
	}
}
