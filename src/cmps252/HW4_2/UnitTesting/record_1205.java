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

@Tag("27")
class Record_1205 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1205: FirstName is Eli")
	void FirstNameOfRecord1205() {
		assertEquals("Eli", customers.get(1204).getFirstName());
	}

	@Test
	@DisplayName("Record 1205: LastName is Turay")
	void LastNameOfRecord1205() {
		assertEquals("Turay", customers.get(1204).getLastName());
	}

	@Test
	@DisplayName("Record 1205: Company is Abacus Storage Co")
	void CompanyOfRecord1205() {
		assertEquals("Abacus Storage Co", customers.get(1204).getCompany());
	}

	@Test
	@DisplayName("Record 1205: Address is 250 Cowesett Ave")
	void AddressOfRecord1205() {
		assertEquals("250 Cowesett Ave", customers.get(1204).getAddress());
	}

	@Test
	@DisplayName("Record 1205: City is West Warwick")
	void CityOfRecord1205() {
		assertEquals("West Warwick", customers.get(1204).getCity());
	}

	@Test
	@DisplayName("Record 1205: County is Kent")
	void CountyOfRecord1205() {
		assertEquals("Kent", customers.get(1204).getCounty());
	}

	@Test
	@DisplayName("Record 1205: State is RI")
	void StateOfRecord1205() {
		assertEquals("RI", customers.get(1204).getState());
	}

	@Test
	@DisplayName("Record 1205: ZIP is 2893")
	void ZIPOfRecord1205() {
		assertEquals("2893", customers.get(1204).getZIP());
	}

	@Test
	@DisplayName("Record 1205: Phone is 401-826-1699")
	void PhoneOfRecord1205() {
		assertEquals("401-826-1699", customers.get(1204).getPhone());
	}

	@Test
	@DisplayName("Record 1205: Fax is 401-826-2251")
	void FaxOfRecord1205() {
		assertEquals("401-826-2251", customers.get(1204).getFax());
	}

	@Test
	@DisplayName("Record 1205: Email is eli@turay.com")
	void EmailOfRecord1205() {
		assertEquals("eli@turay.com", customers.get(1204).getEmail());
	}

	@Test
	@DisplayName("Record 1205: Web is http://www.elituray.com")
	void WebOfRecord1205() {
		assertEquals("http://www.elituray.com", customers.get(1204).getWeb());
	}
}
