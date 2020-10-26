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

@Tag("11")
class Record_1902 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1902: FirstName is Ramiro")
	void FirstNameOfRecord1902() {
		assertEquals("Ramiro", customers.get(1901).getFirstName());
	}

	@Test
	@DisplayName("Record 1902: LastName is Bloebeam")
	void LastNameOfRecord1902() {
		assertEquals("Bloebeam", customers.get(1901).getLastName());
	}

	@Test
	@DisplayName("Record 1902: Company is International Hobby Corp")
	void CompanyOfRecord1902() {
		assertEquals("International Hobby Corp", customers.get(1901).getCompany());
	}

	@Test
	@DisplayName("Record 1902: Address is 611 E Main St")
	void AddressOfRecord1902() {
		assertEquals("611 E Main St", customers.get(1901).getAddress());
	}

	@Test
	@DisplayName("Record 1902: City is Middletown")
	void CityOfRecord1902() {
		assertEquals("Middletown", customers.get(1901).getCity());
	}

	@Test
	@DisplayName("Record 1902: County is Orange")
	void CountyOfRecord1902() {
		assertEquals("Orange", customers.get(1901).getCounty());
	}

	@Test
	@DisplayName("Record 1902: State is NY")
	void StateOfRecord1902() {
		assertEquals("NY", customers.get(1901).getState());
	}

	@Test
	@DisplayName("Record 1902: ZIP is 10940")
	void ZIPOfRecord1902() {
		assertEquals("10940", customers.get(1901).getZIP());
	}

	@Test
	@DisplayName("Record 1902: Phone is 845-342-8756")
	void PhoneOfRecord1902() {
		assertEquals("845-342-8756", customers.get(1901).getPhone());
	}

	@Test
	@DisplayName("Record 1902: Fax is 845-342-7963")
	void FaxOfRecord1902() {
		assertEquals("845-342-7963", customers.get(1901).getFax());
	}

	@Test
	@DisplayName("Record 1902: Email is ramiro@bloebeam.com")
	void EmailOfRecord1902() {
		assertEquals("ramiro@bloebeam.com", customers.get(1901).getEmail());
	}

	@Test
	@DisplayName("Record 1902: Web is http://www.ramirobloebeam.com")
	void WebOfRecord1902() {
		assertEquals("http://www.ramirobloebeam.com", customers.get(1901).getWeb());
	}
}
