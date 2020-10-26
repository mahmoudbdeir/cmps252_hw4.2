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

@Tag("47")
class Record_3744 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3744: FirstName is Tim")
	void FirstNameOfRecord3744() {
		assertEquals("Tim", customers.get(3743).getFirstName());
	}

	@Test
	@DisplayName("Record 3744: LastName is Goffman")
	void LastNameOfRecord3744() {
		assertEquals("Goffman", customers.get(3743).getLastName());
	}

	@Test
	@DisplayName("Record 3744: Company is Chapman Corp")
	void CompanyOfRecord3744() {
		assertEquals("Chapman Corp", customers.get(3743).getCompany());
	}

	@Test
	@DisplayName("Record 3744: Address is 702 2nd Ave Se")
	void AddressOfRecord3744() {
		assertEquals("702 2nd Ave Se", customers.get(3743).getAddress());
	}

	@Test
	@DisplayName("Record 3744: City is Cedar Rapids")
	void CityOfRecord3744() {
		assertEquals("Cedar Rapids", customers.get(3743).getCity());
	}

	@Test
	@DisplayName("Record 3744: County is Linn")
	void CountyOfRecord3744() {
		assertEquals("Linn", customers.get(3743).getCounty());
	}

	@Test
	@DisplayName("Record 3744: State is IA")
	void StateOfRecord3744() {
		assertEquals("IA", customers.get(3743).getState());
	}

	@Test
	@DisplayName("Record 3744: ZIP is 52401")
	void ZIPOfRecord3744() {
		assertEquals("52401", customers.get(3743).getZIP());
	}

	@Test
	@DisplayName("Record 3744: Phone is 319-362-0387")
	void PhoneOfRecord3744() {
		assertEquals("319-362-0387", customers.get(3743).getPhone());
	}

	@Test
	@DisplayName("Record 3744: Fax is 319-362-8833")
	void FaxOfRecord3744() {
		assertEquals("319-362-8833", customers.get(3743).getFax());
	}

	@Test
	@DisplayName("Record 3744: Email is tim@goffman.com")
	void EmailOfRecord3744() {
		assertEquals("tim@goffman.com", customers.get(3743).getEmail());
	}

	@Test
	@DisplayName("Record 3744: Web is http://www.timgoffman.com")
	void WebOfRecord3744() {
		assertEquals("http://www.timgoffman.com", customers.get(3743).getWeb());
	}
}
