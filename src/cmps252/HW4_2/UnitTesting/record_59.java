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
class Record_59 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 59: FirstName is Leo")
	void FirstNameOfRecord59() {
		assertEquals("Leo", customers.get(58).getFirstName());
	}

	@Test
	@DisplayName("Record 59: LastName is Mooberry")
	void LastNameOfRecord59() {
		assertEquals("Mooberry", customers.get(58).getLastName());
	}

	@Test
	@DisplayName("Record 59: Company is Eastview Housing Corp")
	void CompanyOfRecord59() {
		assertEquals("Eastview Housing Corp", customers.get(58).getCompany());
	}

	@Test
	@DisplayName("Record 59: Address is 1531 S 1st St")
	void AddressOfRecord59() {
		assertEquals("1531 S 1st St", customers.get(58).getAddress());
	}

	@Test
	@DisplayName("Record 59: City is Milwaukee")
	void CityOfRecord59() {
		assertEquals("Milwaukee", customers.get(58).getCity());
	}

	@Test
	@DisplayName("Record 59: County is Milwaukee")
	void CountyOfRecord59() {
		assertEquals("Milwaukee", customers.get(58).getCounty());
	}

	@Test
	@DisplayName("Record 59: State is WI")
	void StateOfRecord59() {
		assertEquals("WI", customers.get(58).getState());
	}

	@Test
	@DisplayName("Record 59: ZIP is 53204")
	void ZIPOfRecord59() {
		assertEquals("53204", customers.get(58).getZIP());
	}

	@Test
	@DisplayName("Record 59: Phone is 414-383-5317")
	void PhoneOfRecord59() {
		assertEquals("414-383-5317", customers.get(58).getPhone());
	}

	@Test
	@DisplayName("Record 59: Fax is 414-383-3009")
	void FaxOfRecord59() {
		assertEquals("414-383-3009", customers.get(58).getFax());
	}

	@Test
	@DisplayName("Record 59: Email is leo@mooberry.com")
	void EmailOfRecord59() {
		assertEquals("leo@mooberry.com", customers.get(58).getEmail());
	}

	@Test
	@DisplayName("Record 59: Web is http://www.leomooberry.com")
	void WebOfRecord59() {
		assertEquals("http://www.leomooberry.com", customers.get(58).getWeb());
	}
}
