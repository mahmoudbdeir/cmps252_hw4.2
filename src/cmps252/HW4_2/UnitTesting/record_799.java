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

@Tag("15")
class Record_799 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 799: FirstName is Jerrell")
	void FirstNameOfRecord799() {
		assertEquals("Jerrell", customers.get(798).getFirstName());
	}

	@Test
	@DisplayName("Record 799: LastName is Gronowski")
	void LastNameOfRecord799() {
		assertEquals("Gronowski", customers.get(798).getLastName());
	}

	@Test
	@DisplayName("Record 799: Company is Diets Constr Inc")
	void CompanyOfRecord799() {
		assertEquals("Diets Constr Inc", customers.get(798).getCompany());
	}

	@Test
	@DisplayName("Record 799: Address is 10301 Jefferson Blvd")
	void AddressOfRecord799() {
		assertEquals("10301 Jefferson Blvd", customers.get(798).getAddress());
	}

	@Test
	@DisplayName("Record 799: City is Culver City")
	void CityOfRecord799() {
		assertEquals("Culver City", customers.get(798).getCity());
	}

	@Test
	@DisplayName("Record 799: County is Los Angeles")
	void CountyOfRecord799() {
		assertEquals("Los Angeles", customers.get(798).getCounty());
	}

	@Test
	@DisplayName("Record 799: State is CA")
	void StateOfRecord799() {
		assertEquals("CA", customers.get(798).getState());
	}

	@Test
	@DisplayName("Record 799: ZIP is 90232")
	void ZIPOfRecord799() {
		assertEquals("90232", customers.get(798).getZIP());
	}

	@Test
	@DisplayName("Record 799: Phone is 310-559-7876")
	void PhoneOfRecord799() {
		assertEquals("310-559-7876", customers.get(798).getPhone());
	}

	@Test
	@DisplayName("Record 799: Fax is 310-559-5078")
	void FaxOfRecord799() {
		assertEquals("310-559-5078", customers.get(798).getFax());
	}

	@Test
	@DisplayName("Record 799: Email is jerrell@gronowski.com")
	void EmailOfRecord799() {
		assertEquals("jerrell@gronowski.com", customers.get(798).getEmail());
	}

	@Test
	@DisplayName("Record 799: Web is http://www.jerrellgronowski.com")
	void WebOfRecord799() {
		assertEquals("http://www.jerrellgronowski.com", customers.get(798).getWeb());
	}
}
