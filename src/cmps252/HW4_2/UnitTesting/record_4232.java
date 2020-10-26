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

@Tag("10")
class Record_4232 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4232: FirstName is Deangelo")
	void FirstNameOfRecord4232() {
		assertEquals("Deangelo", customers.get(4231).getFirstName());
	}

	@Test
	@DisplayName("Record 4232: LastName is Uttech")
	void LastNameOfRecord4232() {
		assertEquals("Uttech", customers.get(4231).getLastName());
	}

	@Test
	@DisplayName("Record 4232: Company is S C Steel Erectors Inc")
	void CompanyOfRecord4232() {
		assertEquals("S C Steel Erectors Inc", customers.get(4231).getCompany());
	}

	@Test
	@DisplayName("Record 4232: Address is 1531 Airway Cir")
	void AddressOfRecord4232() {
		assertEquals("1531 Airway Cir", customers.get(4231).getAddress());
	}

	@Test
	@DisplayName("Record 4232: City is New Smyrna Beach")
	void CityOfRecord4232() {
		assertEquals("New Smyrna Beach", customers.get(4231).getCity());
	}

	@Test
	@DisplayName("Record 4232: County is Volusia")
	void CountyOfRecord4232() {
		assertEquals("Volusia", customers.get(4231).getCounty());
	}

	@Test
	@DisplayName("Record 4232: State is FL")
	void StateOfRecord4232() {
		assertEquals("FL", customers.get(4231).getState());
	}

	@Test
	@DisplayName("Record 4232: ZIP is 32168")
	void ZIPOfRecord4232() {
		assertEquals("32168", customers.get(4231).getZIP());
	}

	@Test
	@DisplayName("Record 4232: Phone is 386-427-9130")
	void PhoneOfRecord4232() {
		assertEquals("386-427-9130", customers.get(4231).getPhone());
	}

	@Test
	@DisplayName("Record 4232: Fax is 386-427-4353")
	void FaxOfRecord4232() {
		assertEquals("386-427-4353", customers.get(4231).getFax());
	}

	@Test
	@DisplayName("Record 4232: Email is deangelo@uttech.com")
	void EmailOfRecord4232() {
		assertEquals("deangelo@uttech.com", customers.get(4231).getEmail());
	}

	@Test
	@DisplayName("Record 4232: Web is http://www.deangelouttech.com")
	void WebOfRecord4232() {
		assertEquals("http://www.deangelouttech.com", customers.get(4231).getWeb());
	}
}
