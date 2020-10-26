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

@Tag("39")
class Record_1185 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1185: FirstName is Andrea")
	void FirstNameOfRecord1185() {
		assertEquals("Andrea", customers.get(1184).getFirstName());
	}

	@Test
	@DisplayName("Record 1185: LastName is Shum")
	void LastNameOfRecord1185() {
		assertEquals("Shum", customers.get(1184).getLastName());
	}

	@Test
	@DisplayName("Record 1185: Company is Bethany Hyghts Mini Storage")
	void CompanyOfRecord1185() {
		assertEquals("Bethany Hyghts Mini Storage", customers.get(1184).getCompany());
	}

	@Test
	@DisplayName("Record 1185: Address is 351 E Conestoga Rd")
	void AddressOfRecord1185() {
		assertEquals("351 E Conestoga Rd", customers.get(1184).getAddress());
	}

	@Test
	@DisplayName("Record 1185: City is Wayne")
	void CityOfRecord1185() {
		assertEquals("Wayne", customers.get(1184).getCity());
	}

	@Test
	@DisplayName("Record 1185: County is Delaware")
	void CountyOfRecord1185() {
		assertEquals("Delaware", customers.get(1184).getCounty());
	}

	@Test
	@DisplayName("Record 1185: State is PA")
	void StateOfRecord1185() {
		assertEquals("PA", customers.get(1184).getState());
	}

	@Test
	@DisplayName("Record 1185: ZIP is 19087")
	void ZIPOfRecord1185() {
		assertEquals("19087", customers.get(1184).getZIP());
	}

	@Test
	@DisplayName("Record 1185: Phone is 610-254-8490")
	void PhoneOfRecord1185() {
		assertEquals("610-254-8490", customers.get(1184).getPhone());
	}

	@Test
	@DisplayName("Record 1185: Fax is 610-254-9193")
	void FaxOfRecord1185() {
		assertEquals("610-254-9193", customers.get(1184).getFax());
	}

	@Test
	@DisplayName("Record 1185: Email is andrea@shum.com")
	void EmailOfRecord1185() {
		assertEquals("andrea@shum.com", customers.get(1184).getEmail());
	}

	@Test
	@DisplayName("Record 1185: Web is http://www.andreashum.com")
	void WebOfRecord1185() {
		assertEquals("http://www.andreashum.com", customers.get(1184).getWeb());
	}
}
