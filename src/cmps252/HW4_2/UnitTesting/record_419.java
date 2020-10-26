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

@Tag("8")
class Record_419 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 419: FirstName is Angelo")
	void FirstNameOfRecord419() {
		assertEquals("Angelo", customers.get(418).getFirstName());
	}

	@Test
	@DisplayName("Record 419: LastName is Somogyi")
	void LastNameOfRecord419() {
		assertEquals("Somogyi", customers.get(418).getLastName());
	}

	@Test
	@DisplayName("Record 419: Company is Fmly Home Medl Div Foley Medl")
	void CompanyOfRecord419() {
		assertEquals("Fmly Home Medl Div Foley Medl", customers.get(418).getCompany());
	}

	@Test
	@DisplayName("Record 419: Address is 218 N Randolphville Rd")
	void AddressOfRecord419() {
		assertEquals("218 N Randolphville Rd", customers.get(418).getAddress());
	}

	@Test
	@DisplayName("Record 419: City is Piscataway")
	void CityOfRecord419() {
		assertEquals("Piscataway", customers.get(418).getCity());
	}

	@Test
	@DisplayName("Record 419: County is Middlesex")
	void CountyOfRecord419() {
		assertEquals("Middlesex", customers.get(418).getCounty());
	}

	@Test
	@DisplayName("Record 419: State is NJ")
	void StateOfRecord419() {
		assertEquals("NJ", customers.get(418).getState());
	}

	@Test
	@DisplayName("Record 419: ZIP is 8854")
	void ZIPOfRecord419() {
		assertEquals("8854", customers.get(418).getZIP());
	}

	@Test
	@DisplayName("Record 419: Phone is 732-752-0985")
	void PhoneOfRecord419() {
		assertEquals("732-752-0985", customers.get(418).getPhone());
	}

	@Test
	@DisplayName("Record 419: Fax is 732-752-7387")
	void FaxOfRecord419() {
		assertEquals("732-752-7387", customers.get(418).getFax());
	}

	@Test
	@DisplayName("Record 419: Email is angelo@somogyi.com")
	void EmailOfRecord419() {
		assertEquals("angelo@somogyi.com", customers.get(418).getEmail());
	}

	@Test
	@DisplayName("Record 419: Web is http://www.angelosomogyi.com")
	void WebOfRecord419() {
		assertEquals("http://www.angelosomogyi.com", customers.get(418).getWeb());
	}
}
