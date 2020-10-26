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

@Tag("5")
class Record_113 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 113: FirstName is Delma")
	void FirstNameOfRecord113() {
		assertEquals("Delma", customers.get(112).getFirstName());
	}

	@Test
	@DisplayName("Record 113: LastName is Shumake")
	void LastNameOfRecord113() {
		assertEquals("Shumake", customers.get(112).getLastName());
	}

	@Test
	@DisplayName("Record 113: Company is Pacer Books")
	void CompanyOfRecord113() {
		assertEquals("Pacer Books", customers.get(112).getCompany());
	}

	@Test
	@DisplayName("Record 113: Address is 3827 S Western Ave")
	void AddressOfRecord113() {
		assertEquals("3827 S Western Ave", customers.get(112).getAddress());
	}

	@Test
	@DisplayName("Record 113: City is Sioux Falls")
	void CityOfRecord113() {
		assertEquals("Sioux Falls", customers.get(112).getCity());
	}

	@Test
	@DisplayName("Record 113: County is Minnehaha")
	void CountyOfRecord113() {
		assertEquals("Minnehaha", customers.get(112).getCounty());
	}

	@Test
	@DisplayName("Record 113: State is SD")
	void StateOfRecord113() {
		assertEquals("SD", customers.get(112).getState());
	}

	@Test
	@DisplayName("Record 113: ZIP is 57105")
	void ZIPOfRecord113() {
		assertEquals("57105", customers.get(112).getZIP());
	}

	@Test
	@DisplayName("Record 113: Phone is 605-335-7707")
	void PhoneOfRecord113() {
		assertEquals("605-335-7707", customers.get(112).getPhone());
	}

	@Test
	@DisplayName("Record 113: Fax is 605-335-8199")
	void FaxOfRecord113() {
		assertEquals("605-335-8199", customers.get(112).getFax());
	}

	@Test
	@DisplayName("Record 113: Email is delma@shumake.com")
	void EmailOfRecord113() {
		assertEquals("delma@shumake.com", customers.get(112).getEmail());
	}

	@Test
	@DisplayName("Record 113: Web is http://www.delmashumake.com")
	void WebOfRecord113() {
		assertEquals("http://www.delmashumake.com", customers.get(112).getWeb());
	}
}
