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

@Tag("49")
class Record_874 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 874: FirstName is Eddie")
	void FirstNameOfRecord874() {
		assertEquals("Eddie", customers.get(873).getFirstName());
	}

	@Test
	@DisplayName("Record 874: LastName is Friehauf")
	void LastNameOfRecord874() {
		assertEquals("Friehauf", customers.get(873).getLastName());
	}

	@Test
	@DisplayName("Record 874: Company is Micro Electronic Technologies")
	void CompanyOfRecord874() {
		assertEquals("Micro Electronic Technologies", customers.get(873).getCompany());
	}

	@Test
	@DisplayName("Record 874: Address is 323 W 39th St")
	void AddressOfRecord874() {
		assertEquals("323 W 39th St", customers.get(873).getAddress());
	}

	@Test
	@DisplayName("Record 874: City is New York")
	void CityOfRecord874() {
		assertEquals("New York", customers.get(873).getCity());
	}

	@Test
	@DisplayName("Record 874: County is New York")
	void CountyOfRecord874() {
		assertEquals("New York", customers.get(873).getCounty());
	}

	@Test
	@DisplayName("Record 874: State is NY")
	void StateOfRecord874() {
		assertEquals("NY", customers.get(873).getState());
	}

	@Test
	@DisplayName("Record 874: ZIP is 10018")
	void ZIPOfRecord874() {
		assertEquals("10018", customers.get(873).getZIP());
	}

	@Test
	@DisplayName("Record 874: Phone is 212-695-6359")
	void PhoneOfRecord874() {
		assertEquals("212-695-6359", customers.get(873).getPhone());
	}

	@Test
	@DisplayName("Record 874: Fax is 212-695-3922")
	void FaxOfRecord874() {
		assertEquals("212-695-3922", customers.get(873).getFax());
	}

	@Test
	@DisplayName("Record 874: Email is eddie@friehauf.com")
	void EmailOfRecord874() {
		assertEquals("eddie@friehauf.com", customers.get(873).getEmail());
	}

	@Test
	@DisplayName("Record 874: Web is http://www.eddiefriehauf.com")
	void WebOfRecord874() {
		assertEquals("http://www.eddiefriehauf.com", customers.get(873).getWeb());
	}
}
