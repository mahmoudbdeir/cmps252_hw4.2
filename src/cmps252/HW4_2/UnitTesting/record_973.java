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

@Tag("12")
class Record_973 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 973: FirstName is Tana")
	void FirstNameOfRecord973() {
		assertEquals("Tana", customers.get(972).getFirstName());
	}

	@Test
	@DisplayName("Record 973: LastName is Hilden")
	void LastNameOfRecord973() {
		assertEquals("Hilden", customers.get(972).getLastName());
	}

	@Test
	@DisplayName("Record 973: Company is Waldron & Fann")
	void CompanyOfRecord973() {
		assertEquals("Waldron & Fann", customers.get(972).getCompany());
	}

	@Test
	@DisplayName("Record 973: Address is 717 Fellowship Rd  #-a")
	void AddressOfRecord973() {
		assertEquals("717 Fellowship Rd  #-a", customers.get(972).getAddress());
	}

	@Test
	@DisplayName("Record 973: City is Mount Laurel")
	void CityOfRecord973() {
		assertEquals("Mount Laurel", customers.get(972).getCity());
	}

	@Test
	@DisplayName("Record 973: County is Burlington")
	void CountyOfRecord973() {
		assertEquals("Burlington", customers.get(972).getCounty());
	}

	@Test
	@DisplayName("Record 973: State is NJ")
	void StateOfRecord973() {
		assertEquals("NJ", customers.get(972).getState());
	}

	@Test
	@DisplayName("Record 973: ZIP is 8054")
	void ZIPOfRecord973() {
		assertEquals("8054", customers.get(972).getZIP());
	}

	@Test
	@DisplayName("Record 973: Phone is 856-235-4839")
	void PhoneOfRecord973() {
		assertEquals("856-235-4839", customers.get(972).getPhone());
	}

	@Test
	@DisplayName("Record 973: Fax is 856-235-0624")
	void FaxOfRecord973() {
		assertEquals("856-235-0624", customers.get(972).getFax());
	}

	@Test
	@DisplayName("Record 973: Email is tana@hilden.com")
	void EmailOfRecord973() {
		assertEquals("tana@hilden.com", customers.get(972).getEmail());
	}

	@Test
	@DisplayName("Record 973: Web is http://www.tanahilden.com")
	void WebOfRecord973() {
		assertEquals("http://www.tanahilden.com", customers.get(972).getWeb());
	}
}
