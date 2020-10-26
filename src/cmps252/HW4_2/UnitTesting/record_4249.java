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

@Tag("42")
class Record_4249 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4249: FirstName is Bradly")
	void FirstNameOfRecord4249() {
		assertEquals("Bradly", customers.get(4248).getFirstName());
	}

	@Test
	@DisplayName("Record 4249: LastName is Jourdan")
	void LastNameOfRecord4249() {
		assertEquals("Jourdan", customers.get(4248).getLastName());
	}

	@Test
	@DisplayName("Record 4249: Company is Wmmx")
	void CompanyOfRecord4249() {
		assertEquals("Wmmx", customers.get(4248).getCompany());
	}

	@Test
	@DisplayName("Record 4249: Address is 305 W Market St")
	void AddressOfRecord4249() {
		assertEquals("305 W Market St", customers.get(4248).getAddress());
	}

	@Test
	@DisplayName("Record 4249: City is Greenwood")
	void CityOfRecord4249() {
		assertEquals("Greenwood", customers.get(4248).getCity());
	}

	@Test
	@DisplayName("Record 4249: County is Leflore")
	void CountyOfRecord4249() {
		assertEquals("Leflore", customers.get(4248).getCounty());
	}

	@Test
	@DisplayName("Record 4249: State is MS")
	void StateOfRecord4249() {
		assertEquals("MS", customers.get(4248).getState());
	}

	@Test
	@DisplayName("Record 4249: ZIP is 38930")
	void ZIPOfRecord4249() {
		assertEquals("38930", customers.get(4248).getZIP());
	}

	@Test
	@DisplayName("Record 4249: Phone is 662-453-4289")
	void PhoneOfRecord4249() {
		assertEquals("662-453-4289", customers.get(4248).getPhone());
	}

	@Test
	@DisplayName("Record 4249: Fax is 662-453-9742")
	void FaxOfRecord4249() {
		assertEquals("662-453-9742", customers.get(4248).getFax());
	}

	@Test
	@DisplayName("Record 4249: Email is bradly@jourdan.com")
	void EmailOfRecord4249() {
		assertEquals("bradly@jourdan.com", customers.get(4248).getEmail());
	}

	@Test
	@DisplayName("Record 4249: Web is http://www.bradlyjourdan.com")
	void WebOfRecord4249() {
		assertEquals("http://www.bradlyjourdan.com", customers.get(4248).getWeb());
	}
}
