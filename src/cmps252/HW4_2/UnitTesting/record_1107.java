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
class Record_1107 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1107: FirstName is Antone")
	void FirstNameOfRecord1107() {
		assertEquals("Antone", customers.get(1106).getFirstName());
	}

	@Test
	@DisplayName("Record 1107: LastName is Throop")
	void LastNameOfRecord1107() {
		assertEquals("Throop", customers.get(1106).getLastName());
	}

	@Test
	@DisplayName("Record 1107: Company is Gordon Truck Leasing")
	void CompanyOfRecord1107() {
		assertEquals("Gordon Truck Leasing", customers.get(1106).getCompany());
	}

	@Test
	@DisplayName("Record 1107: Address is 1310 12th St Se")
	void AddressOfRecord1107() {
		assertEquals("1310 12th St Se", customers.get(1106).getAddress());
	}

	@Test
	@DisplayName("Record 1107: City is Salem")
	void CityOfRecord1107() {
		assertEquals("Salem", customers.get(1106).getCity());
	}

	@Test
	@DisplayName("Record 1107: County is Marion")
	void CountyOfRecord1107() {
		assertEquals("Marion", customers.get(1106).getCounty());
	}

	@Test
	@DisplayName("Record 1107: State is OR")
	void StateOfRecord1107() {
		assertEquals("OR", customers.get(1106).getState());
	}

	@Test
	@DisplayName("Record 1107: ZIP is 97302")
	void ZIPOfRecord1107() {
		assertEquals("97302", customers.get(1106).getZIP());
	}

	@Test
	@DisplayName("Record 1107: Phone is 503-581-3463")
	void PhoneOfRecord1107() {
		assertEquals("503-581-3463", customers.get(1106).getPhone());
	}

	@Test
	@DisplayName("Record 1107: Fax is 503-581-3969")
	void FaxOfRecord1107() {
		assertEquals("503-581-3969", customers.get(1106).getFax());
	}

	@Test
	@DisplayName("Record 1107: Email is antone@throop.com")
	void EmailOfRecord1107() {
		assertEquals("antone@throop.com", customers.get(1106).getEmail());
	}

	@Test
	@DisplayName("Record 1107: Web is http://www.antonethroop.com")
	void WebOfRecord1107() {
		assertEquals("http://www.antonethroop.com", customers.get(1106).getWeb());
	}
}
