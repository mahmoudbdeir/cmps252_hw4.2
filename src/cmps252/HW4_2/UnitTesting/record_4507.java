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

@Tag("30")
class Record_4507 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4507: FirstName is Flossie")
	void FirstNameOfRecord4507() {
		assertEquals("Flossie", customers.get(4506).getFirstName());
	}

	@Test
	@DisplayName("Record 4507: LastName is Medin")
	void LastNameOfRecord4507() {
		assertEquals("Medin", customers.get(4506).getLastName());
	}

	@Test
	@DisplayName("Record 4507: Company is Action Temps Inc")
	void CompanyOfRecord4507() {
		assertEquals("Action Temps Inc", customers.get(4506).getCompany());
	}

	@Test
	@DisplayName("Record 4507: Address is 340 Royal Palm Way")
	void AddressOfRecord4507() {
		assertEquals("340 Royal Palm Way", customers.get(4506).getAddress());
	}

	@Test
	@DisplayName("Record 4507: City is Palm Beach")
	void CityOfRecord4507() {
		assertEquals("Palm Beach", customers.get(4506).getCity());
	}

	@Test
	@DisplayName("Record 4507: County is Palm Beach")
	void CountyOfRecord4507() {
		assertEquals("Palm Beach", customers.get(4506).getCounty());
	}

	@Test
	@DisplayName("Record 4507: State is FL")
	void StateOfRecord4507() {
		assertEquals("FL", customers.get(4506).getState());
	}

	@Test
	@DisplayName("Record 4507: ZIP is 33480")
	void ZIPOfRecord4507() {
		assertEquals("33480", customers.get(4506).getZIP());
	}

	@Test
	@DisplayName("Record 4507: Phone is 561-837-7220")
	void PhoneOfRecord4507() {
		assertEquals("561-837-7220", customers.get(4506).getPhone());
	}

	@Test
	@DisplayName("Record 4507: Fax is 561-837-6668")
	void FaxOfRecord4507() {
		assertEquals("561-837-6668", customers.get(4506).getFax());
	}

	@Test
	@DisplayName("Record 4507: Email is flossie@medin.com")
	void EmailOfRecord4507() {
		assertEquals("flossie@medin.com", customers.get(4506).getEmail());
	}

	@Test
	@DisplayName("Record 4507: Web is http://www.flossiemedin.com")
	void WebOfRecord4507() {
		assertEquals("http://www.flossiemedin.com", customers.get(4506).getWeb());
	}
}
