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

@Tag("36")
class Record_2699 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2699: FirstName is Lara")
	void FirstNameOfRecord2699() {
		assertEquals("Lara", customers.get(2698).getFirstName());
	}

	@Test
	@DisplayName("Record 2699: LastName is Henningson")
	void LastNameOfRecord2699() {
		assertEquals("Henningson", customers.get(2698).getLastName());
	}

	@Test
	@DisplayName("Record 2699: Company is Shtyr, Owen A Md")
	void CompanyOfRecord2699() {
		assertEquals("Shtyr, Owen A Md", customers.get(2698).getCompany());
	}

	@Test
	@DisplayName("Record 2699: Address is 225 E 26th St")
	void AddressOfRecord2699() {
		assertEquals("225 E 26th St", customers.get(2698).getAddress());
	}

	@Test
	@DisplayName("Record 2699: City is New York")
	void CityOfRecord2699() {
		assertEquals("New York", customers.get(2698).getCity());
	}

	@Test
	@DisplayName("Record 2699: County is New York")
	void CountyOfRecord2699() {
		assertEquals("New York", customers.get(2698).getCounty());
	}

	@Test
	@DisplayName("Record 2699: State is NY")
	void StateOfRecord2699() {
		assertEquals("NY", customers.get(2698).getState());
	}

	@Test
	@DisplayName("Record 2699: ZIP is 10010")
	void ZIPOfRecord2699() {
		assertEquals("10010", customers.get(2698).getZIP());
	}

	@Test
	@DisplayName("Record 2699: Phone is 212-979-2310")
	void PhoneOfRecord2699() {
		assertEquals("212-979-2310", customers.get(2698).getPhone());
	}

	@Test
	@DisplayName("Record 2699: Fax is 212-979-7388")
	void FaxOfRecord2699() {
		assertEquals("212-979-7388", customers.get(2698).getFax());
	}

	@Test
	@DisplayName("Record 2699: Email is lara@henningson.com")
	void EmailOfRecord2699() {
		assertEquals("lara@henningson.com", customers.get(2698).getEmail());
	}

	@Test
	@DisplayName("Record 2699: Web is http://www.larahenningson.com")
	void WebOfRecord2699() {
		assertEquals("http://www.larahenningson.com", customers.get(2698).getWeb());
	}
}
