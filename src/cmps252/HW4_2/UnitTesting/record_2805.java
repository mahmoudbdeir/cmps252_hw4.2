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

@Tag("17")
class Record_2805 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2805: FirstName is Charlene")
	void FirstNameOfRecord2805() {
		assertEquals("Charlene", customers.get(2804).getFirstName());
	}

	@Test
	@DisplayName("Record 2805: LastName is Stamenov")
	void LastNameOfRecord2805() {
		assertEquals("Stamenov", customers.get(2804).getLastName());
	}

	@Test
	@DisplayName("Record 2805: Company is Carbonator Rental Service Inc")
	void CompanyOfRecord2805() {
		assertEquals("Carbonator Rental Service Inc", customers.get(2804).getCompany());
	}

	@Test
	@DisplayName("Record 2805: Address is 10405 E 11th St St")
	void AddressOfRecord2805() {
		assertEquals("10405 E 11th St St", customers.get(2804).getAddress());
	}

	@Test
	@DisplayName("Record 2805: City is Independence")
	void CityOfRecord2805() {
		assertEquals("Independence", customers.get(2804).getCity());
	}

	@Test
	@DisplayName("Record 2805: County is Jackson")
	void CountyOfRecord2805() {
		assertEquals("Jackson", customers.get(2804).getCounty());
	}

	@Test
	@DisplayName("Record 2805: State is MO")
	void StateOfRecord2805() {
		assertEquals("MO", customers.get(2804).getState());
	}

	@Test
	@DisplayName("Record 2805: ZIP is 64052")
	void ZIPOfRecord2805() {
		assertEquals("64052", customers.get(2804).getZIP());
	}

	@Test
	@DisplayName("Record 2805: Phone is 816-254-2747")
	void PhoneOfRecord2805() {
		assertEquals("816-254-2747", customers.get(2804).getPhone());
	}

	@Test
	@DisplayName("Record 2805: Fax is 816-254-3711")
	void FaxOfRecord2805() {
		assertEquals("816-254-3711", customers.get(2804).getFax());
	}

	@Test
	@DisplayName("Record 2805: Email is charlene@stamenov.com")
	void EmailOfRecord2805() {
		assertEquals("charlene@stamenov.com", customers.get(2804).getEmail());
	}

	@Test
	@DisplayName("Record 2805: Web is http://www.charlenestamenov.com")
	void WebOfRecord2805() {
		assertEquals("http://www.charlenestamenov.com", customers.get(2804).getWeb());
	}
}
