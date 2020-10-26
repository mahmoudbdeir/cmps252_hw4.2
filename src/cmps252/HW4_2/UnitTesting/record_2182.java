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

@Tag("3")
class Record_2182 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2182: FirstName is Evan")
	void FirstNameOfRecord2182() {
		assertEquals("Evan", customers.get(2181).getFirstName());
	}

	@Test
	@DisplayName("Record 2182: LastName is Nolin")
	void LastNameOfRecord2182() {
		assertEquals("Nolin", customers.get(2181).getLastName());
	}

	@Test
	@DisplayName("Record 2182: Company is Beausay, William J")
	void CompanyOfRecord2182() {
		assertEquals("Beausay, William J", customers.get(2181).getCompany());
	}

	@Test
	@DisplayName("Record 2182: Address is 531 N 4th St")
	void AddressOfRecord2182() {
		assertEquals("531 N 4th St", customers.get(2181).getAddress());
	}

	@Test
	@DisplayName("Record 2182: City is Tipp City")
	void CityOfRecord2182() {
		assertEquals("Tipp City", customers.get(2181).getCity());
	}

	@Test
	@DisplayName("Record 2182: County is Miami")
	void CountyOfRecord2182() {
		assertEquals("Miami", customers.get(2181).getCounty());
	}

	@Test
	@DisplayName("Record 2182: State is OH")
	void StateOfRecord2182() {
		assertEquals("OH", customers.get(2181).getState());
	}

	@Test
	@DisplayName("Record 2182: ZIP is 45371")
	void ZIPOfRecord2182() {
		assertEquals("45371", customers.get(2181).getZIP());
	}

	@Test
	@DisplayName("Record 2182: Phone is 937-667-2121")
	void PhoneOfRecord2182() {
		assertEquals("937-667-2121", customers.get(2181).getPhone());
	}

	@Test
	@DisplayName("Record 2182: Fax is 937-667-1078")
	void FaxOfRecord2182() {
		assertEquals("937-667-1078", customers.get(2181).getFax());
	}

	@Test
	@DisplayName("Record 2182: Email is evan@nolin.com")
	void EmailOfRecord2182() {
		assertEquals("evan@nolin.com", customers.get(2181).getEmail());
	}

	@Test
	@DisplayName("Record 2182: Web is http://www.evannolin.com")
	void WebOfRecord2182() {
		assertEquals("http://www.evannolin.com", customers.get(2181).getWeb());
	}
}
