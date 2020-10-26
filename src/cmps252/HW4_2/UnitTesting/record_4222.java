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

@Tag("19")
class Record_4222 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4222: FirstName is Santiago")
	void FirstNameOfRecord4222() {
		assertEquals("Santiago", customers.get(4221).getFirstName());
	}

	@Test
	@DisplayName("Record 4222: LastName is Gallegly")
	void LastNameOfRecord4222() {
		assertEquals("Gallegly", customers.get(4221).getLastName());
	}

	@Test
	@DisplayName("Record 4222: Company is M A Smith Foundations")
	void CompanyOfRecord4222() {
		assertEquals("M A Smith Foundations", customers.get(4221).getCompany());
	}

	@Test
	@DisplayName("Record 4222: Address is 27 Broadway")
	void AddressOfRecord4222() {
		assertEquals("27 Broadway", customers.get(4221).getAddress());
	}

	@Test
	@DisplayName("Record 4222: City is Kissimmee")
	void CityOfRecord4222() {
		assertEquals("Kissimmee", customers.get(4221).getCity());
	}

	@Test
	@DisplayName("Record 4222: County is Osceola")
	void CountyOfRecord4222() {
		assertEquals("Osceola", customers.get(4221).getCounty());
	}

	@Test
	@DisplayName("Record 4222: State is FL")
	void StateOfRecord4222() {
		assertEquals("FL", customers.get(4221).getState());
	}

	@Test
	@DisplayName("Record 4222: ZIP is 34741")
	void ZIPOfRecord4222() {
		assertEquals("34741", customers.get(4221).getZIP());
	}

	@Test
	@DisplayName("Record 4222: Phone is 407-870-1616")
	void PhoneOfRecord4222() {
		assertEquals("407-870-1616", customers.get(4221).getPhone());
	}

	@Test
	@DisplayName("Record 4222: Fax is 407-870-0956")
	void FaxOfRecord4222() {
		assertEquals("407-870-0956", customers.get(4221).getFax());
	}

	@Test
	@DisplayName("Record 4222: Email is santiago@gallegly.com")
	void EmailOfRecord4222() {
		assertEquals("santiago@gallegly.com", customers.get(4221).getEmail());
	}

	@Test
	@DisplayName("Record 4222: Web is http://www.santiagogallegly.com")
	void WebOfRecord4222() {
		assertEquals("http://www.santiagogallegly.com", customers.get(4221).getWeb());
	}
}
