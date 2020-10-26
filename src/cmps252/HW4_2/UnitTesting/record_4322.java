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

@Tag("38")
class Record_4322 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4322: FirstName is Randolph")
	void FirstNameOfRecord4322() {
		assertEquals("Randolph", customers.get(4321).getFirstName());
	}

	@Test
	@DisplayName("Record 4322: LastName is Yokoyama")
	void LastNameOfRecord4322() {
		assertEquals("Yokoyama", customers.get(4321).getLastName());
	}

	@Test
	@DisplayName("Record 4322: Company is R & S Concrete Construction")
	void CompanyOfRecord4322() {
		assertEquals("R & S Concrete Construction", customers.get(4321).getCompany());
	}

	@Test
	@DisplayName("Record 4322: Address is Village")
	void AddressOfRecord4322() {
		assertEquals("Village", customers.get(4321).getAddress());
	}

	@Test
	@DisplayName("Record 4322: City is Baltimore")
	void CityOfRecord4322() {
		assertEquals("Baltimore", customers.get(4321).getCity());
	}

	@Test
	@DisplayName("Record 4322: County is Baltimore City")
	void CountyOfRecord4322() {
		assertEquals("Baltimore City", customers.get(4321).getCounty());
	}

	@Test
	@DisplayName("Record 4322: State is MD")
	void StateOfRecord4322() {
		assertEquals("MD", customers.get(4321).getState());
	}

	@Test
	@DisplayName("Record 4322: ZIP is 21210")
	void ZIPOfRecord4322() {
		assertEquals("21210", customers.get(4321).getZIP());
	}

	@Test
	@DisplayName("Record 4322: Phone is 410-433-6315")
	void PhoneOfRecord4322() {
		assertEquals("410-433-6315", customers.get(4321).getPhone());
	}

	@Test
	@DisplayName("Record 4322: Fax is 410-433-0871")
	void FaxOfRecord4322() {
		assertEquals("410-433-0871", customers.get(4321).getFax());
	}

	@Test
	@DisplayName("Record 4322: Email is randolph@yokoyama.com")
	void EmailOfRecord4322() {
		assertEquals("randolph@yokoyama.com", customers.get(4321).getEmail());
	}

	@Test
	@DisplayName("Record 4322: Web is http://www.randolphyokoyama.com")
	void WebOfRecord4322() {
		assertEquals("http://www.randolphyokoyama.com", customers.get(4321).getWeb());
	}
}
