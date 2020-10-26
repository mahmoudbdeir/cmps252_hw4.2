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

@Tag("21")
class Record_209 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 209: FirstName is Crystal")
	void FirstNameOfRecord209() {
		assertEquals("Crystal", customers.get(208).getFirstName());
	}

	@Test
	@DisplayName("Record 209: LastName is Russett")
	void LastNameOfRecord209() {
		assertEquals("Russett", customers.get(208).getLastName());
	}

	@Test
	@DisplayName("Record 209: Company is Summit Manufacturing Corp")
	void CompanyOfRecord209() {
		assertEquals("Summit Manufacturing Corp", customers.get(208).getCompany());
	}

	@Test
	@DisplayName("Record 209: Address is 1005 Clothilde St")
	void AddressOfRecord209() {
		assertEquals("1005 Clothilde St", customers.get(208).getAddress());
	}

	@Test
	@DisplayName("Record 209: City is Morgan City")
	void CityOfRecord209() {
		assertEquals("Morgan City", customers.get(208).getCity());
	}

	@Test
	@DisplayName("Record 209: County is Saint Mary")
	void CountyOfRecord209() {
		assertEquals("Saint Mary", customers.get(208).getCounty());
	}

	@Test
	@DisplayName("Record 209: State is LA")
	void StateOfRecord209() {
		assertEquals("LA", customers.get(208).getState());
	}

	@Test
	@DisplayName("Record 209: ZIP is 70380")
	void ZIPOfRecord209() {
		assertEquals("70380", customers.get(208).getZIP());
	}

	@Test
	@DisplayName("Record 209: Phone is 985-384-8650")
	void PhoneOfRecord209() {
		assertEquals("985-384-8650", customers.get(208).getPhone());
	}

	@Test
	@DisplayName("Record 209: Fax is 985-384-2019")
	void FaxOfRecord209() {
		assertEquals("985-384-2019", customers.get(208).getFax());
	}

	@Test
	@DisplayName("Record 209: Email is crystal@russett.com")
	void EmailOfRecord209() {
		assertEquals("crystal@russett.com", customers.get(208).getEmail());
	}

	@Test
	@DisplayName("Record 209: Web is http://www.crystalrussett.com")
	void WebOfRecord209() {
		assertEquals("http://www.crystalrussett.com", customers.get(208).getWeb());
	}
}
