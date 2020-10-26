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

@Tag("2")
class Record_4366 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4366: FirstName is Alice")
	void FirstNameOfRecord4366() {
		assertEquals("Alice", customers.get(4365).getFirstName());
	}

	@Test
	@DisplayName("Record 4366: LastName is Caporiccio")
	void LastNameOfRecord4366() {
		assertEquals("Caporiccio", customers.get(4365).getLastName());
	}

	@Test
	@DisplayName("Record 4366: Company is Blanchette Co")
	void CompanyOfRecord4366() {
		assertEquals("Blanchette Co", customers.get(4365).getCompany());
	}

	@Test
	@DisplayName("Record 4366: Address is 120 S 6th St  #-1800")
	void AddressOfRecord4366() {
		assertEquals("120 S 6th St  #-1800", customers.get(4365).getAddress());
	}

	@Test
	@DisplayName("Record 4366: City is Minneapolis")
	void CityOfRecord4366() {
		assertEquals("Minneapolis", customers.get(4365).getCity());
	}

	@Test
	@DisplayName("Record 4366: County is Hennepin")
	void CountyOfRecord4366() {
		assertEquals("Hennepin", customers.get(4365).getCounty());
	}

	@Test
	@DisplayName("Record 4366: State is MN")
	void StateOfRecord4366() {
		assertEquals("MN", customers.get(4365).getState());
	}

	@Test
	@DisplayName("Record 4366: ZIP is 55402")
	void ZIPOfRecord4366() {
		assertEquals("55402", customers.get(4365).getZIP());
	}

	@Test
	@DisplayName("Record 4366: Phone is 612-338-3025")
	void PhoneOfRecord4366() {
		assertEquals("612-338-3025", customers.get(4365).getPhone());
	}

	@Test
	@DisplayName("Record 4366: Fax is 612-338-2346")
	void FaxOfRecord4366() {
		assertEquals("612-338-2346", customers.get(4365).getFax());
	}

	@Test
	@DisplayName("Record 4366: Email is alice@caporiccio.com")
	void EmailOfRecord4366() {
		assertEquals("alice@caporiccio.com", customers.get(4365).getEmail());
	}

	@Test
	@DisplayName("Record 4366: Web is http://www.alicecaporiccio.com")
	void WebOfRecord4366() {
		assertEquals("http://www.alicecaporiccio.com", customers.get(4365).getWeb());
	}
}
