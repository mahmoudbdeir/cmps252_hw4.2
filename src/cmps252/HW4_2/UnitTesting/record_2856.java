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
class Record_2856 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2856: FirstName is Rosa")
	void FirstNameOfRecord2856() {
		assertEquals("Rosa", customers.get(2855).getFirstName());
	}

	@Test
	@DisplayName("Record 2856: LastName is Pyo")
	void LastNameOfRecord2856() {
		assertEquals("Pyo", customers.get(2855).getLastName());
	}

	@Test
	@DisplayName("Record 2856: Company is Bollam Sheedy Torani & Co")
	void CompanyOfRecord2856() {
		assertEquals("Bollam Sheedy Torani & Co", customers.get(2855).getCompany());
	}

	@Test
	@DisplayName("Record 2856: Address is 140 E 38th St")
	void AddressOfRecord2856() {
		assertEquals("140 E 38th St", customers.get(2855).getAddress());
	}

	@Test
	@DisplayName("Record 2856: City is New York")
	void CityOfRecord2856() {
		assertEquals("New York", customers.get(2855).getCity());
	}

	@Test
	@DisplayName("Record 2856: County is New York")
	void CountyOfRecord2856() {
		assertEquals("New York", customers.get(2855).getCounty());
	}

	@Test
	@DisplayName("Record 2856: State is NY")
	void StateOfRecord2856() {
		assertEquals("NY", customers.get(2855).getState());
	}

	@Test
	@DisplayName("Record 2856: ZIP is 10016")
	void ZIPOfRecord2856() {
		assertEquals("10016", customers.get(2855).getZIP());
	}

	@Test
	@DisplayName("Record 2856: Phone is 212-481-9528")
	void PhoneOfRecord2856() {
		assertEquals("212-481-9528", customers.get(2855).getPhone());
	}

	@Test
	@DisplayName("Record 2856: Fax is 212-481-2178")
	void FaxOfRecord2856() {
		assertEquals("212-481-2178", customers.get(2855).getFax());
	}

	@Test
	@DisplayName("Record 2856: Email is rosa@pyo.com")
	void EmailOfRecord2856() {
		assertEquals("rosa@pyo.com", customers.get(2855).getEmail());
	}

	@Test
	@DisplayName("Record 2856: Web is http://www.rosapyo.com")
	void WebOfRecord2856() {
		assertEquals("http://www.rosapyo.com", customers.get(2855).getWeb());
	}
}
