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

@Tag("2")
class Record_1057 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1057: FirstName is Jarrod")
	void FirstNameOfRecord1057() {
		assertEquals("Jarrod", customers.get(1056).getFirstName());
	}

	@Test
	@DisplayName("Record 1057: LastName is Shelby")
	void LastNameOfRecord1057() {
		assertEquals("Shelby", customers.get(1056).getLastName());
	}

	@Test
	@DisplayName("Record 1057: Company is American Scandinavian Fndtn")
	void CompanyOfRecord1057() {
		assertEquals("American Scandinavian Fndtn", customers.get(1056).getCompany());
	}

	@Test
	@DisplayName("Record 1057: Address is 132 N Yosemite Ave")
	void AddressOfRecord1057() {
		assertEquals("132 N Yosemite Ave", customers.get(1056).getAddress());
	}

	@Test
	@DisplayName("Record 1057: City is Oakdale")
	void CityOfRecord1057() {
		assertEquals("Oakdale", customers.get(1056).getCity());
	}

	@Test
	@DisplayName("Record 1057: County is Stanislaus")
	void CountyOfRecord1057() {
		assertEquals("Stanislaus", customers.get(1056).getCounty());
	}

	@Test
	@DisplayName("Record 1057: State is CA")
	void StateOfRecord1057() {
		assertEquals("CA", customers.get(1056).getState());
	}

	@Test
	@DisplayName("Record 1057: ZIP is 95361")
	void ZIPOfRecord1057() {
		assertEquals("95361", customers.get(1056).getZIP());
	}

	@Test
	@DisplayName("Record 1057: Phone is 209-847-3484")
	void PhoneOfRecord1057() {
		assertEquals("209-847-3484", customers.get(1056).getPhone());
	}

	@Test
	@DisplayName("Record 1057: Fax is 209-847-3962")
	void FaxOfRecord1057() {
		assertEquals("209-847-3962", customers.get(1056).getFax());
	}

	@Test
	@DisplayName("Record 1057: Email is jarrod@shelby.com")
	void EmailOfRecord1057() {
		assertEquals("jarrod@shelby.com", customers.get(1056).getEmail());
	}

	@Test
	@DisplayName("Record 1057: Web is http://www.jarrodshelby.com")
	void WebOfRecord1057() {
		assertEquals("http://www.jarrodshelby.com", customers.get(1056).getWeb());
	}
}
