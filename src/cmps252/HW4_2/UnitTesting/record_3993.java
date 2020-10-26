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

@Tag("37")
class Record_3993 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3993: FirstName is Alice")
	void FirstNameOfRecord3993() {
		assertEquals("Alice", customers.get(3992).getFirstName());
	}

	@Test
	@DisplayName("Record 3993: LastName is Harl")
	void LastNameOfRecord3993() {
		assertEquals("Harl", customers.get(3992).getLastName());
	}

	@Test
	@DisplayName("Record 3993: Company is Days Inn")
	void CompanyOfRecord3993() {
		assertEquals("Days Inn", customers.get(3992).getCompany());
	}

	@Test
	@DisplayName("Record 3993: Address is 1705 Holbrook St")
	void AddressOfRecord3993() {
		assertEquals("1705 Holbrook St", customers.get(3992).getAddress());
	}

	@Test
	@DisplayName("Record 3993: City is Greensboro")
	void CityOfRecord3993() {
		assertEquals("Greensboro", customers.get(3992).getCity());
	}

	@Test
	@DisplayName("Record 3993: County is Guilford")
	void CountyOfRecord3993() {
		assertEquals("Guilford", customers.get(3992).getCounty());
	}

	@Test
	@DisplayName("Record 3993: State is NC")
	void StateOfRecord3993() {
		assertEquals("NC", customers.get(3992).getState());
	}

	@Test
	@DisplayName("Record 3993: ZIP is 27403")
	void ZIPOfRecord3993() {
		assertEquals("27403", customers.get(3992).getZIP());
	}

	@Test
	@DisplayName("Record 3993: Phone is 336-299-5212")
	void PhoneOfRecord3993() {
		assertEquals("336-299-5212", customers.get(3992).getPhone());
	}

	@Test
	@DisplayName("Record 3993: Fax is 336-299-1171")
	void FaxOfRecord3993() {
		assertEquals("336-299-1171", customers.get(3992).getFax());
	}

	@Test
	@DisplayName("Record 3993: Email is alice@harl.com")
	void EmailOfRecord3993() {
		assertEquals("alice@harl.com", customers.get(3992).getEmail());
	}

	@Test
	@DisplayName("Record 3993: Web is http://www.aliceharl.com")
	void WebOfRecord3993() {
		assertEquals("http://www.aliceharl.com", customers.get(3992).getWeb());
	}
}
