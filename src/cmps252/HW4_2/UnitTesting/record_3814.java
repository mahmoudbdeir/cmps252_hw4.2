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

@Tag("22")
class Record_3814 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3814: FirstName is Ashlee")
	void FirstNameOfRecord3814() {
		assertEquals("Ashlee", customers.get(3813).getFirstName());
	}

	@Test
	@DisplayName("Record 3814: LastName is Valeri")
	void LastNameOfRecord3814() {
		assertEquals("Valeri", customers.get(3813).getLastName());
	}

	@Test
	@DisplayName("Record 3814: Company is Rosenzwyg Schulz")
	void CompanyOfRecord3814() {
		assertEquals("Rosenzwyg Schulz", customers.get(3813).getCompany());
	}

	@Test
	@DisplayName("Record 3814: Address is 4221 Daubert St")
	void AddressOfRecord3814() {
		assertEquals("4221 Daubert St", customers.get(3813).getAddress());
	}

	@Test
	@DisplayName("Record 3814: City is Orlando")
	void CityOfRecord3814() {
		assertEquals("Orlando", customers.get(3813).getCity());
	}

	@Test
	@DisplayName("Record 3814: County is Orange")
	void CountyOfRecord3814() {
		assertEquals("Orange", customers.get(3813).getCounty());
	}

	@Test
	@DisplayName("Record 3814: State is FL")
	void StateOfRecord3814() {
		assertEquals("FL", customers.get(3813).getState());
	}

	@Test
	@DisplayName("Record 3814: ZIP is 32803")
	void ZIPOfRecord3814() {
		assertEquals("32803", customers.get(3813).getZIP());
	}

	@Test
	@DisplayName("Record 3814: Phone is 407-896-3048")
	void PhoneOfRecord3814() {
		assertEquals("407-896-3048", customers.get(3813).getPhone());
	}

	@Test
	@DisplayName("Record 3814: Fax is 407-896-9669")
	void FaxOfRecord3814() {
		assertEquals("407-896-9669", customers.get(3813).getFax());
	}

	@Test
	@DisplayName("Record 3814: Email is ashlee@valeri.com")
	void EmailOfRecord3814() {
		assertEquals("ashlee@valeri.com", customers.get(3813).getEmail());
	}

	@Test
	@DisplayName("Record 3814: Web is http://www.ashleevaleri.com")
	void WebOfRecord3814() {
		assertEquals("http://www.ashleevaleri.com", customers.get(3813).getWeb());
	}
}
