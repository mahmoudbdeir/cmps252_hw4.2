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

@Tag("0")
class Record_2510 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2510: FirstName is Angelique")
	void FirstNameOfRecord2510() {
		assertEquals("Angelique", customers.get(2509).getFirstName());
	}

	@Test
	@DisplayName("Record 2510: LastName is Charbonneau")
	void LastNameOfRecord2510() {
		assertEquals("Charbonneau", customers.get(2509).getLastName());
	}

	@Test
	@DisplayName("Record 2510: Company is Giovani Furniture")
	void CompanyOfRecord2510() {
		assertEquals("Giovani Furniture", customers.get(2509).getCompany());
	}

	@Test
	@DisplayName("Record 2510: Address is 13432 Wyandotte St")
	void AddressOfRecord2510() {
		assertEquals("13432 Wyandotte St", customers.get(2509).getAddress());
	}

	@Test
	@DisplayName("Record 2510: City is North Hollywood")
	void CityOfRecord2510() {
		assertEquals("North Hollywood", customers.get(2509).getCity());
	}

	@Test
	@DisplayName("Record 2510: County is Los Angeles")
	void CountyOfRecord2510() {
		assertEquals("Los Angeles", customers.get(2509).getCounty());
	}

	@Test
	@DisplayName("Record 2510: State is CA")
	void StateOfRecord2510() {
		assertEquals("CA", customers.get(2509).getState());
	}

	@Test
	@DisplayName("Record 2510: ZIP is 91605")
	void ZIPOfRecord2510() {
		assertEquals("91605", customers.get(2509).getZIP());
	}

	@Test
	@DisplayName("Record 2510: Phone is 818-982-2773")
	void PhoneOfRecord2510() {
		assertEquals("818-982-2773", customers.get(2509).getPhone());
	}

	@Test
	@DisplayName("Record 2510: Fax is 818-982-7883")
	void FaxOfRecord2510() {
		assertEquals("818-982-7883", customers.get(2509).getFax());
	}

	@Test
	@DisplayName("Record 2510: Email is angelique@charbonneau.com")
	void EmailOfRecord2510() {
		assertEquals("angelique@charbonneau.com", customers.get(2509).getEmail());
	}

	@Test
	@DisplayName("Record 2510: Web is http://www.angeliquecharbonneau.com")
	void WebOfRecord2510() {
		assertEquals("http://www.angeliquecharbonneau.com", customers.get(2509).getWeb());
	}
}
