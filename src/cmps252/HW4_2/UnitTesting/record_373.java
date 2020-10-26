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
class Record_373 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 373: FirstName is Florence")
	void FirstNameOfRecord373() {
		assertEquals("Florence", customers.get(372).getFirstName());
	}

	@Test
	@DisplayName("Record 373: LastName is Checketts")
	void LastNameOfRecord373() {
		assertEquals("Checketts", customers.get(372).getLastName());
	}

	@Test
	@DisplayName("Record 373: Company is Ophthalmology Times Publctn")
	void CompanyOfRecord373() {
		assertEquals("Ophthalmology Times Publctn", customers.get(372).getCompany());
	}

	@Test
	@DisplayName("Record 373: Address is 3748 Silver Star Rd")
	void AddressOfRecord373() {
		assertEquals("3748 Silver Star Rd", customers.get(372).getAddress());
	}

	@Test
	@DisplayName("Record 373: City is Orlando")
	void CityOfRecord373() {
		assertEquals("Orlando", customers.get(372).getCity());
	}

	@Test
	@DisplayName("Record 373: County is Orange")
	void CountyOfRecord373() {
		assertEquals("Orange", customers.get(372).getCounty());
	}

	@Test
	@DisplayName("Record 373: State is FL")
	void StateOfRecord373() {
		assertEquals("FL", customers.get(372).getState());
	}

	@Test
	@DisplayName("Record 373: ZIP is 32808")
	void ZIPOfRecord373() {
		assertEquals("32808", customers.get(372).getZIP());
	}

	@Test
	@DisplayName("Record 373: Phone is 407-299-5488")
	void PhoneOfRecord373() {
		assertEquals("407-299-5488", customers.get(372).getPhone());
	}

	@Test
	@DisplayName("Record 373: Fax is 407-299-4456")
	void FaxOfRecord373() {
		assertEquals("407-299-4456", customers.get(372).getFax());
	}

	@Test
	@DisplayName("Record 373: Email is florence@checketts.com")
	void EmailOfRecord373() {
		assertEquals("florence@checketts.com", customers.get(372).getEmail());
	}

	@Test
	@DisplayName("Record 373: Web is http://www.florencechecketts.com")
	void WebOfRecord373() {
		assertEquals("http://www.florencechecketts.com", customers.get(372).getWeb());
	}
}
