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

@Tag("1")
class Record_1076 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1076: FirstName is Bruce")
	void FirstNameOfRecord1076() {
		assertEquals("Bruce", customers.get(1075).getFirstName());
	}

	@Test
	@DisplayName("Record 1076: LastName is Hazim")
	void LastNameOfRecord1076() {
		assertEquals("Hazim", customers.get(1075).getLastName());
	}

	@Test
	@DisplayName("Record 1076: Company is Fine Wire Coil Company")
	void CompanyOfRecord1076() {
		assertEquals("Fine Wire Coil Company", customers.get(1075).getCompany());
	}

	@Test
	@DisplayName("Record 1076: Address is 315 W 36th St")
	void AddressOfRecord1076() {
		assertEquals("315 W 36th St", customers.get(1075).getAddress());
	}

	@Test
	@DisplayName("Record 1076: City is New York")
	void CityOfRecord1076() {
		assertEquals("New York", customers.get(1075).getCity());
	}

	@Test
	@DisplayName("Record 1076: County is New York")
	void CountyOfRecord1076() {
		assertEquals("New York", customers.get(1075).getCounty());
	}

	@Test
	@DisplayName("Record 1076: State is NY")
	void StateOfRecord1076() {
		assertEquals("NY", customers.get(1075).getState());
	}

	@Test
	@DisplayName("Record 1076: ZIP is 10018")
	void ZIPOfRecord1076() {
		assertEquals("10018", customers.get(1075).getZIP());
	}

	@Test
	@DisplayName("Record 1076: Phone is 212-643-3693")
	void PhoneOfRecord1076() {
		assertEquals("212-643-3693", customers.get(1075).getPhone());
	}

	@Test
	@DisplayName("Record 1076: Fax is 212-643-7594")
	void FaxOfRecord1076() {
		assertEquals("212-643-7594", customers.get(1075).getFax());
	}

	@Test
	@DisplayName("Record 1076: Email is bruce@hazim.com")
	void EmailOfRecord1076() {
		assertEquals("bruce@hazim.com", customers.get(1075).getEmail());
	}

	@Test
	@DisplayName("Record 1076: Web is http://www.brucehazim.com")
	void WebOfRecord1076() {
		assertEquals("http://www.brucehazim.com", customers.get(1075).getWeb());
	}
}
