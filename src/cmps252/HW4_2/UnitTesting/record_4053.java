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
class Record_4053 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4053: FirstName is Jeri")
	void FirstNameOfRecord4053() {
		assertEquals("Jeri", customers.get(4052).getFirstName());
	}

	@Test
	@DisplayName("Record 4053: LastName is Closs")
	void LastNameOfRecord4053() {
		assertEquals("Closs", customers.get(4052).getLastName());
	}

	@Test
	@DisplayName("Record 4053: Company is Moulton, Anthony Md")
	void CompanyOfRecord4053() {
		assertEquals("Moulton, Anthony Md", customers.get(4052).getCompany());
	}

	@Test
	@DisplayName("Record 4053: Address is 912 12th St Se")
	void AddressOfRecord4053() {
		assertEquals("912 12th St Se", customers.get(4052).getAddress());
	}

	@Test
	@DisplayName("Record 4053: City is Salem")
	void CityOfRecord4053() {
		assertEquals("Salem", customers.get(4052).getCity());
	}

	@Test
	@DisplayName("Record 4053: County is Marion")
	void CountyOfRecord4053() {
		assertEquals("Marion", customers.get(4052).getCounty());
	}

	@Test
	@DisplayName("Record 4053: State is OR")
	void StateOfRecord4053() {
		assertEquals("OR", customers.get(4052).getState());
	}

	@Test
	@DisplayName("Record 4053: ZIP is 97302")
	void ZIPOfRecord4053() {
		assertEquals("97302", customers.get(4052).getZIP());
	}

	@Test
	@DisplayName("Record 4053: Phone is 503-391-6651")
	void PhoneOfRecord4053() {
		assertEquals("503-391-6651", customers.get(4052).getPhone());
	}

	@Test
	@DisplayName("Record 4053: Fax is 503-391-8215")
	void FaxOfRecord4053() {
		assertEquals("503-391-8215", customers.get(4052).getFax());
	}

	@Test
	@DisplayName("Record 4053: Email is jeri@closs.com")
	void EmailOfRecord4053() {
		assertEquals("jeri@closs.com", customers.get(4052).getEmail());
	}

	@Test
	@DisplayName("Record 4053: Web is http://www.jericloss.com")
	void WebOfRecord4053() {
		assertEquals("http://www.jericloss.com", customers.get(4052).getWeb());
	}
}
