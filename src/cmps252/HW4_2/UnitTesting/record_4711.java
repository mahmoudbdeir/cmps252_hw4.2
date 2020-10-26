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

@Tag("38")
class Record_4711 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4711: FirstName is Emma")
	void FirstNameOfRecord4711() {
		assertEquals("Emma", customers.get(4710).getFirstName());
	}

	@Test
	@DisplayName("Record 4711: LastName is Montalbano")
	void LastNameOfRecord4711() {
		assertEquals("Montalbano", customers.get(4710).getLastName());
	}

	@Test
	@DisplayName("Record 4711: Company is Robert Half International")
	void CompanyOfRecord4711() {
		assertEquals("Robert Half International", customers.get(4710).getCompany());
	}

	@Test
	@DisplayName("Record 4711: Address is 412 N Walnut St")
	void AddressOfRecord4711() {
		assertEquals("412 N Walnut St", customers.get(4710).getAddress());
	}

	@Test
	@DisplayName("Record 4711: City is Lansing")
	void CityOfRecord4711() {
		assertEquals("Lansing", customers.get(4710).getCity());
	}

	@Test
	@DisplayName("Record 4711: County is Ingham")
	void CountyOfRecord4711() {
		assertEquals("Ingham", customers.get(4710).getCounty());
	}

	@Test
	@DisplayName("Record 4711: State is MI")
	void StateOfRecord4711() {
		assertEquals("MI", customers.get(4710).getState());
	}

	@Test
	@DisplayName("Record 4711: ZIP is 48933")
	void ZIPOfRecord4711() {
		assertEquals("48933", customers.get(4710).getZIP());
	}

	@Test
	@DisplayName("Record 4711: Phone is 517-372-5239")
	void PhoneOfRecord4711() {
		assertEquals("517-372-5239", customers.get(4710).getPhone());
	}

	@Test
	@DisplayName("Record 4711: Fax is 517-372-8905")
	void FaxOfRecord4711() {
		assertEquals("517-372-8905", customers.get(4710).getFax());
	}

	@Test
	@DisplayName("Record 4711: Email is emma@montalbano.com")
	void EmailOfRecord4711() {
		assertEquals("emma@montalbano.com", customers.get(4710).getEmail());
	}

	@Test
	@DisplayName("Record 4711: Web is http://www.emmamontalbano.com")
	void WebOfRecord4711() {
		assertEquals("http://www.emmamontalbano.com", customers.get(4710).getWeb());
	}
}
