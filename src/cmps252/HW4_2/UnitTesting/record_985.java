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

@Tag("40")
class Record_985 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 985: FirstName is Mellisa")
	void FirstNameOfRecord985() {
		assertEquals("Mellisa", customers.get(984).getFirstName());
	}

	@Test
	@DisplayName("Record 985: LastName is Cazzell")
	void LastNameOfRecord985() {
		assertEquals("Cazzell", customers.get(984).getLastName());
	}

	@Test
	@DisplayName("Record 985: Company is Hovercraft Of New Mexico")
	void CompanyOfRecord985() {
		assertEquals("Hovercraft Of New Mexico", customers.get(984).getCompany());
	}

	@Test
	@DisplayName("Record 985: Address is 5785 Peachtree Industrial Blvd")
	void AddressOfRecord985() {
		assertEquals("5785 Peachtree Industrial Blvd", customers.get(984).getAddress());
	}

	@Test
	@DisplayName("Record 985: City is Atlanta")
	void CityOfRecord985() {
		assertEquals("Atlanta", customers.get(984).getCity());
	}

	@Test
	@DisplayName("Record 985: County is Dekalb")
	void CountyOfRecord985() {
		assertEquals("Dekalb", customers.get(984).getCounty());
	}

	@Test
	@DisplayName("Record 985: State is GA")
	void StateOfRecord985() {
		assertEquals("GA", customers.get(984).getState());
	}

	@Test
	@DisplayName("Record 985: ZIP is 30341")
	void ZIPOfRecord985() {
		assertEquals("30341", customers.get(984).getZIP());
	}

	@Test
	@DisplayName("Record 985: Phone is 770-454-2442")
	void PhoneOfRecord985() {
		assertEquals("770-454-2442", customers.get(984).getPhone());
	}

	@Test
	@DisplayName("Record 985: Fax is 770-454-5372")
	void FaxOfRecord985() {
		assertEquals("770-454-5372", customers.get(984).getFax());
	}

	@Test
	@DisplayName("Record 985: Email is mellisa@cazzell.com")
	void EmailOfRecord985() {
		assertEquals("mellisa@cazzell.com", customers.get(984).getEmail());
	}

	@Test
	@DisplayName("Record 985: Web is http://www.mellisacazzell.com")
	void WebOfRecord985() {
		assertEquals("http://www.mellisacazzell.com", customers.get(984).getWeb());
	}
}
