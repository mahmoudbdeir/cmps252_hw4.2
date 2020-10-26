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

@Tag("21")
class Record_769 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 769: FirstName is Bob")
	void FirstNameOfRecord769() {
		assertEquals("Bob", customers.get(768).getFirstName());
	}

	@Test
	@DisplayName("Record 769: LastName is Mowatt")
	void LastNameOfRecord769() {
		assertEquals("Mowatt", customers.get(768).getLastName());
	}

	@Test
	@DisplayName("Record 769: Company is Regional Tours")
	void CompanyOfRecord769() {
		assertEquals("Regional Tours", customers.get(768).getCompany());
	}

	@Test
	@DisplayName("Record 769: Address is 6000 San Fernando Rd")
	void AddressOfRecord769() {
		assertEquals("6000 San Fernando Rd", customers.get(768).getAddress());
	}

	@Test
	@DisplayName("Record 769: City is Glendale")
	void CityOfRecord769() {
		assertEquals("Glendale", customers.get(768).getCity());
	}

	@Test
	@DisplayName("Record 769: County is Los Angeles")
	void CountyOfRecord769() {
		assertEquals("Los Angeles", customers.get(768).getCounty());
	}

	@Test
	@DisplayName("Record 769: State is CA")
	void StateOfRecord769() {
		assertEquals("CA", customers.get(768).getState());
	}

	@Test
	@DisplayName("Record 769: ZIP is 91202")
	void ZIPOfRecord769() {
		assertEquals("91202", customers.get(768).getZIP());
	}

	@Test
	@DisplayName("Record 769: Phone is 818-545-3315")
	void PhoneOfRecord769() {
		assertEquals("818-545-3315", customers.get(768).getPhone());
	}

	@Test
	@DisplayName("Record 769: Fax is 818-545-2878")
	void FaxOfRecord769() {
		assertEquals("818-545-2878", customers.get(768).getFax());
	}

	@Test
	@DisplayName("Record 769: Email is bob@mowatt.com")
	void EmailOfRecord769() {
		assertEquals("bob@mowatt.com", customers.get(768).getEmail());
	}

	@Test
	@DisplayName("Record 769: Web is http://www.bobmowatt.com")
	void WebOfRecord769() {
		assertEquals("http://www.bobmowatt.com", customers.get(768).getWeb());
	}
}
