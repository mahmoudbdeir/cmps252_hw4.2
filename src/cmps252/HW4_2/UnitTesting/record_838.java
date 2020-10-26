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
class Record_838 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 838: FirstName is Misty")
	void FirstNameOfRecord838() {
		assertEquals("Misty", customers.get(837).getFirstName());
	}

	@Test
	@DisplayName("Record 838: LastName is Kuchinski")
	void LastNameOfRecord838() {
		assertEquals("Kuchinski", customers.get(837).getLastName());
	}

	@Test
	@DisplayName("Record 838: Company is Neuse River Dev Athrty Inc")
	void CompanyOfRecord838() {
		assertEquals("Neuse River Dev Athrty Inc", customers.get(837).getCompany());
	}

	@Test
	@DisplayName("Record 838: Address is Curry Ford")
	void AddressOfRecord838() {
		assertEquals("Curry Ford", customers.get(837).getAddress());
	}

	@Test
	@DisplayName("Record 838: City is Orlando")
	void CityOfRecord838() {
		assertEquals("Orlando", customers.get(837).getCity());
	}

	@Test
	@DisplayName("Record 838: County is Orange")
	void CountyOfRecord838() {
		assertEquals("Orange", customers.get(837).getCounty());
	}

	@Test
	@DisplayName("Record 838: State is FL")
	void StateOfRecord838() {
		assertEquals("FL", customers.get(837).getState());
	}

	@Test
	@DisplayName("Record 838: ZIP is 32812")
	void ZIPOfRecord838() {
		assertEquals("32812", customers.get(837).getZIP());
	}

	@Test
	@DisplayName("Record 838: Phone is 407-843-5251")
	void PhoneOfRecord838() {
		assertEquals("407-843-5251", customers.get(837).getPhone());
	}

	@Test
	@DisplayName("Record 838: Fax is 407-843-1773")
	void FaxOfRecord838() {
		assertEquals("407-843-1773", customers.get(837).getFax());
	}

	@Test
	@DisplayName("Record 838: Email is misty@kuchinski.com")
	void EmailOfRecord838() {
		assertEquals("misty@kuchinski.com", customers.get(837).getEmail());
	}

	@Test
	@DisplayName("Record 838: Web is http://www.mistykuchinski.com")
	void WebOfRecord838() {
		assertEquals("http://www.mistykuchinski.com", customers.get(837).getWeb());
	}
}
