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

@Tag("10")
class Record_549 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 549: FirstName is Issac")
	void FirstNameOfRecord549() {
		assertEquals("Issac", customers.get(548).getFirstName());
	}

	@Test
	@DisplayName("Record 549: LastName is Thormina")
	void LastNameOfRecord549() {
		assertEquals("Thormina", customers.get(548).getLastName());
	}

	@Test
	@DisplayName("Record 549: Company is Associated Bldrs & Contr Inc")
	void CompanyOfRecord549() {
		assertEquals("Associated Bldrs & Contr Inc", customers.get(548).getCompany());
	}

	@Test
	@DisplayName("Record 549: Address is 117 N Kings Ave")
	void AddressOfRecord549() {
		assertEquals("117 N Kings Ave", customers.get(548).getAddress());
	}

	@Test
	@DisplayName("Record 549: City is Brandon")
	void CityOfRecord549() {
		assertEquals("Brandon", customers.get(548).getCity());
	}

	@Test
	@DisplayName("Record 549: County is Hillsborough")
	void CountyOfRecord549() {
		assertEquals("Hillsborough", customers.get(548).getCounty());
	}

	@Test
	@DisplayName("Record 549: State is FL")
	void StateOfRecord549() {
		assertEquals("FL", customers.get(548).getState());
	}

	@Test
	@DisplayName("Record 549: ZIP is 33510")
	void ZIPOfRecord549() {
		assertEquals("33510", customers.get(548).getZIP());
	}

	@Test
	@DisplayName("Record 549: Phone is 813-681-6362")
	void PhoneOfRecord549() {
		assertEquals("813-681-6362", customers.get(548).getPhone());
	}

	@Test
	@DisplayName("Record 549: Fax is 813-681-1487")
	void FaxOfRecord549() {
		assertEquals("813-681-1487", customers.get(548).getFax());
	}

	@Test
	@DisplayName("Record 549: Email is issac@thormina.com")
	void EmailOfRecord549() {
		assertEquals("issac@thormina.com", customers.get(548).getEmail());
	}

	@Test
	@DisplayName("Record 549: Web is http://www.issacthormina.com")
	void WebOfRecord549() {
		assertEquals("http://www.issacthormina.com", customers.get(548).getWeb());
	}
}
