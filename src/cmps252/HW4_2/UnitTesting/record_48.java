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
class Record_48 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 48: FirstName is Antionette")
	void FirstNameOfRecord48() {
		assertEquals("Antionette", customers.get(47).getFirstName());
	}

	@Test
	@DisplayName("Record 48: LastName is Andree")
	void LastNameOfRecord48() {
		assertEquals("Andree", customers.get(47).getLastName());
	}

	@Test
	@DisplayName("Record 48: Company is Syring Wayne Ins Agcy Inc")
	void CompanyOfRecord48() {
		assertEquals("Syring Wayne Ins Agcy Inc", customers.get(47).getCompany());
	}

	@Test
	@DisplayName("Record 48: Address is Pearlridge")
	void AddressOfRecord48() {
		assertEquals("Pearlridge", customers.get(47).getAddress());
	}

	@Test
	@DisplayName("Record 48: City is Aiea")
	void CityOfRecord48() {
		assertEquals("Aiea", customers.get(47).getCity());
	}

	@Test
	@DisplayName("Record 48: County is Honolulu")
	void CountyOfRecord48() {
		assertEquals("Honolulu", customers.get(47).getCounty());
	}

	@Test
	@DisplayName("Record 48: State is HI")
	void StateOfRecord48() {
		assertEquals("HI", customers.get(47).getState());
	}

	@Test
	@DisplayName("Record 48: ZIP is 96701")
	void ZIPOfRecord48() {
		assertEquals("96701", customers.get(47).getZIP());
	}

	@Test
	@DisplayName("Record 48: Phone is 808-488-7186")
	void PhoneOfRecord48() {
		assertEquals("808-488-7186", customers.get(47).getPhone());
	}

	@Test
	@DisplayName("Record 48: Fax is 808-488-3278")
	void FaxOfRecord48() {
		assertEquals("808-488-3278", customers.get(47).getFax());
	}

	@Test
	@DisplayName("Record 48: Email is antionette@andree.com")
	void EmailOfRecord48() {
		assertEquals("antionette@andree.com", customers.get(47).getEmail());
	}

	@Test
	@DisplayName("Record 48: Web is http://www.antionetteandree.com")
	void WebOfRecord48() {
		assertEquals("http://www.antionetteandree.com", customers.get(47).getWeb());
	}
}
