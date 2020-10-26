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

@Tag("9")
class Record_1513 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1513: FirstName is Tommie")
	void FirstNameOfRecord1513() {
		assertEquals("Tommie", customers.get(1512).getFirstName());
	}

	@Test
	@DisplayName("Record 1513: LastName is Whitacker")
	void LastNameOfRecord1513() {
		assertEquals("Whitacker", customers.get(1512).getLastName());
	}

	@Test
	@DisplayName("Record 1513: Company is Jernigan, Leonard T Jr")
	void CompanyOfRecord1513() {
		assertEquals("Jernigan, Leonard T Jr", customers.get(1512).getCompany());
	}

	@Test
	@DisplayName("Record 1513: Address is 246 W Hoffman Ave")
	void AddressOfRecord1513() {
		assertEquals("246 W Hoffman Ave", customers.get(1512).getAddress());
	}

	@Test
	@DisplayName("Record 1513: City is Lindenhurst")
	void CityOfRecord1513() {
		assertEquals("Lindenhurst", customers.get(1512).getCity());
	}

	@Test
	@DisplayName("Record 1513: County is Suffolk")
	void CountyOfRecord1513() {
		assertEquals("Suffolk", customers.get(1512).getCounty());
	}

	@Test
	@DisplayName("Record 1513: State is NY")
	void StateOfRecord1513() {
		assertEquals("NY", customers.get(1512).getState());
	}

	@Test
	@DisplayName("Record 1513: ZIP is 11757")
	void ZIPOfRecord1513() {
		assertEquals("11757", customers.get(1512).getZIP());
	}

	@Test
	@DisplayName("Record 1513: Phone is 631-226-3573")
	void PhoneOfRecord1513() {
		assertEquals("631-226-3573", customers.get(1512).getPhone());
	}

	@Test
	@DisplayName("Record 1513: Fax is 631-226-1784")
	void FaxOfRecord1513() {
		assertEquals("631-226-1784", customers.get(1512).getFax());
	}

	@Test
	@DisplayName("Record 1513: Email is tommie@whitacker.com")
	void EmailOfRecord1513() {
		assertEquals("tommie@whitacker.com", customers.get(1512).getEmail());
	}

	@Test
	@DisplayName("Record 1513: Web is http://www.tommiewhitacker.com")
	void WebOfRecord1513() {
		assertEquals("http://www.tommiewhitacker.com", customers.get(1512).getWeb());
	}
}
