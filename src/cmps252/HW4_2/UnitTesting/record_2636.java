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

@Tag("9")
class Record_2636 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2636: FirstName is Antione")
	void FirstNameOfRecord2636() {
		assertEquals("Antione", customers.get(2635).getFirstName());
	}

	@Test
	@DisplayName("Record 2636: LastName is Peeples")
	void LastNameOfRecord2636() {
		assertEquals("Peeples", customers.get(2635).getLastName());
	}

	@Test
	@DisplayName("Record 2636: Company is Bahia Hotel San Diego")
	void CompanyOfRecord2636() {
		assertEquals("Bahia Hotel San Diego", customers.get(2635).getCompany());
	}

	@Test
	@DisplayName("Record 2636: Address is 10269 Ralph Ct")
	void AddressOfRecord2636() {
		assertEquals("10269 Ralph Ct", customers.get(2635).getAddress());
	}

	@Test
	@DisplayName("Record 2636: City is Boise")
	void CityOfRecord2636() {
		assertEquals("Boise", customers.get(2635).getCity());
	}

	@Test
	@DisplayName("Record 2636: County is Ada")
	void CountyOfRecord2636() {
		assertEquals("Ada", customers.get(2635).getCounty());
	}

	@Test
	@DisplayName("Record 2636: State is ID")
	void StateOfRecord2636() {
		assertEquals("ID", customers.get(2635).getState());
	}

	@Test
	@DisplayName("Record 2636: ZIP is 83709")
	void ZIPOfRecord2636() {
		assertEquals("83709", customers.get(2635).getZIP());
	}

	@Test
	@DisplayName("Record 2636: Phone is 208-362-8458")
	void PhoneOfRecord2636() {
		assertEquals("208-362-8458", customers.get(2635).getPhone());
	}

	@Test
	@DisplayName("Record 2636: Fax is 208-362-3505")
	void FaxOfRecord2636() {
		assertEquals("208-362-3505", customers.get(2635).getFax());
	}

	@Test
	@DisplayName("Record 2636: Email is antione@peeples.com")
	void EmailOfRecord2636() {
		assertEquals("antione@peeples.com", customers.get(2635).getEmail());
	}

	@Test
	@DisplayName("Record 2636: Web is http://www.antionepeeples.com")
	void WebOfRecord2636() {
		assertEquals("http://www.antionepeeples.com", customers.get(2635).getWeb());
	}
}
