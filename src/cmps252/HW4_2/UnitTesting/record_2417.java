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

@Tag("8")
class Record_2417 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2417: FirstName is Leora")
	void FirstNameOfRecord2417() {
		assertEquals("Leora", customers.get(2416).getFirstName());
	}

	@Test
	@DisplayName("Record 2417: LastName is Nogueras")
	void LastNameOfRecord2417() {
		assertEquals("Nogueras", customers.get(2416).getLastName());
	}

	@Test
	@DisplayName("Record 2417: Company is Robert Luk Studio Inc")
	void CompanyOfRecord2417() {
		assertEquals("Robert Luk Studio Inc", customers.get(2416).getCompany());
	}

	@Test
	@DisplayName("Record 2417: Address is 13193 Wayne Rd")
	void AddressOfRecord2417() {
		assertEquals("13193 Wayne Rd", customers.get(2416).getAddress());
	}

	@Test
	@DisplayName("Record 2417: City is Livonia")
	void CityOfRecord2417() {
		assertEquals("Livonia", customers.get(2416).getCity());
	}

	@Test
	@DisplayName("Record 2417: County is Wayne")
	void CountyOfRecord2417() {
		assertEquals("Wayne", customers.get(2416).getCounty());
	}

	@Test
	@DisplayName("Record 2417: State is MI")
	void StateOfRecord2417() {
		assertEquals("MI", customers.get(2416).getState());
	}

	@Test
	@DisplayName("Record 2417: ZIP is 48150")
	void ZIPOfRecord2417() {
		assertEquals("48150", customers.get(2416).getZIP());
	}

	@Test
	@DisplayName("Record 2417: Phone is 734-261-1462")
	void PhoneOfRecord2417() {
		assertEquals("734-261-1462", customers.get(2416).getPhone());
	}

	@Test
	@DisplayName("Record 2417: Fax is 734-261-4351")
	void FaxOfRecord2417() {
		assertEquals("734-261-4351", customers.get(2416).getFax());
	}

	@Test
	@DisplayName("Record 2417: Email is leora@nogueras.com")
	void EmailOfRecord2417() {
		assertEquals("leora@nogueras.com", customers.get(2416).getEmail());
	}

	@Test
	@DisplayName("Record 2417: Web is http://www.leoranogueras.com")
	void WebOfRecord2417() {
		assertEquals("http://www.leoranogueras.com", customers.get(2416).getWeb());
	}
}
