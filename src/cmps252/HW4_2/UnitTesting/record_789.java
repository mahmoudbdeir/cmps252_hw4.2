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

@Tag("18")
class Record_789 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 789: FirstName is Owen")
	void FirstNameOfRecord789() {
		assertEquals("Owen", customers.get(788).getFirstName());
	}

	@Test
	@DisplayName("Record 789: LastName is Carstarphen")
	void LastNameOfRecord789() {
		assertEquals("Carstarphen", customers.get(788).getLastName());
	}

	@Test
	@DisplayName("Record 789: Company is Fort Worth Aluminum Fndry Inc")
	void CompanyOfRecord789() {
		assertEquals("Fort Worth Aluminum Fndry Inc", customers.get(788).getCompany());
	}

	@Test
	@DisplayName("Record 789: Address is 232 W 58th St")
	void AddressOfRecord789() {
		assertEquals("232 W 58th St", customers.get(788).getAddress());
	}

	@Test
	@DisplayName("Record 789: City is New York")
	void CityOfRecord789() {
		assertEquals("New York", customers.get(788).getCity());
	}

	@Test
	@DisplayName("Record 789: County is New York")
	void CountyOfRecord789() {
		assertEquals("New York", customers.get(788).getCounty());
	}

	@Test
	@DisplayName("Record 789: State is NY")
	void StateOfRecord789() {
		assertEquals("NY", customers.get(788).getState());
	}

	@Test
	@DisplayName("Record 789: ZIP is 10019")
	void ZIPOfRecord789() {
		assertEquals("10019", customers.get(788).getZIP());
	}

	@Test
	@DisplayName("Record 789: Phone is 212-765-3199")
	void PhoneOfRecord789() {
		assertEquals("212-765-3199", customers.get(788).getPhone());
	}

	@Test
	@DisplayName("Record 789: Fax is 212-765-6349")
	void FaxOfRecord789() {
		assertEquals("212-765-6349", customers.get(788).getFax());
	}

	@Test
	@DisplayName("Record 789: Email is owen@carstarphen.com")
	void EmailOfRecord789() {
		assertEquals("owen@carstarphen.com", customers.get(788).getEmail());
	}

	@Test
	@DisplayName("Record 789: Web is http://www.owencarstarphen.com")
	void WebOfRecord789() {
		assertEquals("http://www.owencarstarphen.com", customers.get(788).getWeb());
	}
}
