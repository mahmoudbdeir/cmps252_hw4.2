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

@Tag("43")
class Record_4480 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4480: FirstName is Bonnie")
	void FirstNameOfRecord4480() {
		assertEquals("Bonnie", customers.get(4479).getFirstName());
	}

	@Test
	@DisplayName("Record 4480: LastName is Lightbourne")
	void LastNameOfRecord4480() {
		assertEquals("Lightbourne", customers.get(4479).getLastName());
	}

	@Test
	@DisplayName("Record 4480: Company is Industrial Hardware Co")
	void CompanyOfRecord4480() {
		assertEquals("Industrial Hardware Co", customers.get(4479).getCompany());
	}

	@Test
	@DisplayName("Record 4480: Address is 2455 29th St Se")
	void AddressOfRecord4480() {
		assertEquals("2455 29th St Se", customers.get(4479).getAddress());
	}

	@Test
	@DisplayName("Record 4480: City is Grand Rapids")
	void CityOfRecord4480() {
		assertEquals("Grand Rapids", customers.get(4479).getCity());
	}

	@Test
	@DisplayName("Record 4480: County is Kent")
	void CountyOfRecord4480() {
		assertEquals("Kent", customers.get(4479).getCounty());
	}

	@Test
	@DisplayName("Record 4480: State is MI")
	void StateOfRecord4480() {
		assertEquals("MI", customers.get(4479).getState());
	}

	@Test
	@DisplayName("Record 4480: ZIP is 49512")
	void ZIPOfRecord4480() {
		assertEquals("49512", customers.get(4479).getZIP());
	}

	@Test
	@DisplayName("Record 4480: Phone is 616-285-8242")
	void PhoneOfRecord4480() {
		assertEquals("616-285-8242", customers.get(4479).getPhone());
	}

	@Test
	@DisplayName("Record 4480: Fax is 616-285-5512")
	void FaxOfRecord4480() {
		assertEquals("616-285-5512", customers.get(4479).getFax());
	}

	@Test
	@DisplayName("Record 4480: Email is bonnie@lightbourne.com")
	void EmailOfRecord4480() {
		assertEquals("bonnie@lightbourne.com", customers.get(4479).getEmail());
	}

	@Test
	@DisplayName("Record 4480: Web is http://www.bonnielightbourne.com")
	void WebOfRecord4480() {
		assertEquals("http://www.bonnielightbourne.com", customers.get(4479).getWeb());
	}
}
