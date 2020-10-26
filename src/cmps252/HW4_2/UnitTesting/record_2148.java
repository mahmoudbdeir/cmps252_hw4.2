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

@Tag("47")
class Record_2148 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2148: FirstName is Eliza")
	void FirstNameOfRecord2148() {
		assertEquals("Eliza", customers.get(2147).getFirstName());
	}

	@Test
	@DisplayName("Record 2148: LastName is Lysner")
	void LastNameOfRecord2148() {
		assertEquals("Lysner", customers.get(2147).getLastName());
	}

	@Test
	@DisplayName("Record 2148: Company is Ettore & Associates Inc")
	void CompanyOfRecord2148() {
		assertEquals("Ettore & Associates Inc", customers.get(2147).getCompany());
	}

	@Test
	@DisplayName("Record 2148: Address is 14525 Se 98th Ct")
	void AddressOfRecord2148() {
		assertEquals("14525 Se 98th Ct", customers.get(2147).getAddress());
	}

	@Test
	@DisplayName("Record 2148: City is Clackamas")
	void CityOfRecord2148() {
		assertEquals("Clackamas", customers.get(2147).getCity());
	}

	@Test
	@DisplayName("Record 2148: County is Clackamas")
	void CountyOfRecord2148() {
		assertEquals("Clackamas", customers.get(2147).getCounty());
	}

	@Test
	@DisplayName("Record 2148: State is OR")
	void StateOfRecord2148() {
		assertEquals("OR", customers.get(2147).getState());
	}

	@Test
	@DisplayName("Record 2148: ZIP is 97015")
	void ZIPOfRecord2148() {
		assertEquals("97015", customers.get(2147).getZIP());
	}

	@Test
	@DisplayName("Record 2148: Phone is 503-650-1550")
	void PhoneOfRecord2148() {
		assertEquals("503-650-1550", customers.get(2147).getPhone());
	}

	@Test
	@DisplayName("Record 2148: Fax is 503-650-6672")
	void FaxOfRecord2148() {
		assertEquals("503-650-6672", customers.get(2147).getFax());
	}

	@Test
	@DisplayName("Record 2148: Email is eliza@lysner.com")
	void EmailOfRecord2148() {
		assertEquals("eliza@lysner.com", customers.get(2147).getEmail());
	}

	@Test
	@DisplayName("Record 2148: Web is http://www.elizalysner.com")
	void WebOfRecord2148() {
		assertEquals("http://www.elizalysner.com", customers.get(2147).getWeb());
	}
}
