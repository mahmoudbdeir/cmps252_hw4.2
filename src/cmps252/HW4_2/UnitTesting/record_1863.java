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

@Tag("25")
class Record_1863 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1863: FirstName is Javier")
	void FirstNameOfRecord1863() {
		assertEquals("Javier", customers.get(1862).getFirstName());
	}

	@Test
	@DisplayName("Record 1863: LastName is Hertle")
	void LastNameOfRecord1863() {
		assertEquals("Hertle", customers.get(1862).getLastName());
	}

	@Test
	@DisplayName("Record 1863: Company is North American Kelp")
	void CompanyOfRecord1863() {
		assertEquals("North American Kelp", customers.get(1862).getCompany());
	}

	@Test
	@DisplayName("Record 1863: Address is 1901 Dakota Ave")
	void AddressOfRecord1863() {
		assertEquals("1901 Dakota Ave", customers.get(1862).getAddress());
	}

	@Test
	@DisplayName("Record 1863: City is South Sioux City")
	void CityOfRecord1863() {
		assertEquals("South Sioux City", customers.get(1862).getCity());
	}

	@Test
	@DisplayName("Record 1863: County is Dakota")
	void CountyOfRecord1863() {
		assertEquals("Dakota", customers.get(1862).getCounty());
	}

	@Test
	@DisplayName("Record 1863: State is NE")
	void StateOfRecord1863() {
		assertEquals("NE", customers.get(1862).getState());
	}

	@Test
	@DisplayName("Record 1863: ZIP is 68776")
	void ZIPOfRecord1863() {
		assertEquals("68776", customers.get(1862).getZIP());
	}

	@Test
	@DisplayName("Record 1863: Phone is 402-494-0393")
	void PhoneOfRecord1863() {
		assertEquals("402-494-0393", customers.get(1862).getPhone());
	}

	@Test
	@DisplayName("Record 1863: Fax is 402-494-3583")
	void FaxOfRecord1863() {
		assertEquals("402-494-3583", customers.get(1862).getFax());
	}

	@Test
	@DisplayName("Record 1863: Email is javier@hertle.com")
	void EmailOfRecord1863() {
		assertEquals("javier@hertle.com", customers.get(1862).getEmail());
	}

	@Test
	@DisplayName("Record 1863: Web is http://www.javierhertle.com")
	void WebOfRecord1863() {
		assertEquals("http://www.javierhertle.com", customers.get(1862).getWeb());
	}
}
