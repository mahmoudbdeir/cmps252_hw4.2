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

@Tag("33")
class Record_1546 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1546: FirstName is Danilo")
	void FirstNameOfRecord1546() {
		assertEquals("Danilo", customers.get(1545).getFirstName());
	}

	@Test
	@DisplayName("Record 1546: LastName is Gouse")
	void LastNameOfRecord1546() {
		assertEquals("Gouse", customers.get(1545).getLastName());
	}

	@Test
	@DisplayName("Record 1546: Company is Solid Sound Inc")
	void CompanyOfRecord1546() {
		assertEquals("Solid Sound Inc", customers.get(1545).getCompany());
	}

	@Test
	@DisplayName("Record 1546: Address is 393 Old Bridge Tpk")
	void AddressOfRecord1546() {
		assertEquals("393 Old Bridge Tpk", customers.get(1545).getAddress());
	}

	@Test
	@DisplayName("Record 1546: City is South River")
	void CityOfRecord1546() {
		assertEquals("South River", customers.get(1545).getCity());
	}

	@Test
	@DisplayName("Record 1546: County is Middlesex")
	void CountyOfRecord1546() {
		assertEquals("Middlesex", customers.get(1545).getCounty());
	}

	@Test
	@DisplayName("Record 1546: State is NJ")
	void StateOfRecord1546() {
		assertEquals("NJ", customers.get(1545).getState());
	}

	@Test
	@DisplayName("Record 1546: ZIP is 8882")
	void ZIPOfRecord1546() {
		assertEquals("8882", customers.get(1545).getZIP());
	}

	@Test
	@DisplayName("Record 1546: Phone is 732-257-2134")
	void PhoneOfRecord1546() {
		assertEquals("732-257-2134", customers.get(1545).getPhone());
	}

	@Test
	@DisplayName("Record 1546: Fax is 732-257-6211")
	void FaxOfRecord1546() {
		assertEquals("732-257-6211", customers.get(1545).getFax());
	}

	@Test
	@DisplayName("Record 1546: Email is danilo@gouse.com")
	void EmailOfRecord1546() {
		assertEquals("danilo@gouse.com", customers.get(1545).getEmail());
	}

	@Test
	@DisplayName("Record 1546: Web is http://www.danilogouse.com")
	void WebOfRecord1546() {
		assertEquals("http://www.danilogouse.com", customers.get(1545).getWeb());
	}
}
