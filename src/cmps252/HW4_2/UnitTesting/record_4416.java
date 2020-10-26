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

@Tag("9")
class Record_4416 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4416: FirstName is Marcellus")
	void FirstNameOfRecord4416() {
		assertEquals("Marcellus", customers.get(4415).getFirstName());
	}

	@Test
	@DisplayName("Record 4416: LastName is Straughan")
	void LastNameOfRecord4416() {
		assertEquals("Straughan", customers.get(4415).getLastName());
	}

	@Test
	@DisplayName("Record 4416: Company is All Seasons Travel")
	void CompanyOfRecord4416() {
		assertEquals("All Seasons Travel", customers.get(4415).getCompany());
	}

	@Test
	@DisplayName("Record 4416: Address is 466 Grand St")
	void AddressOfRecord4416() {
		assertEquals("466 Grand St", customers.get(4415).getAddress());
	}

	@Test
	@DisplayName("Record 4416: City is New York")
	void CityOfRecord4416() {
		assertEquals("New York", customers.get(4415).getCity());
	}

	@Test
	@DisplayName("Record 4416: County is New York")
	void CountyOfRecord4416() {
		assertEquals("New York", customers.get(4415).getCounty());
	}

	@Test
	@DisplayName("Record 4416: State is NY")
	void StateOfRecord4416() {
		assertEquals("NY", customers.get(4415).getState());
	}

	@Test
	@DisplayName("Record 4416: ZIP is 10002")
	void ZIPOfRecord4416() {
		assertEquals("10002", customers.get(4415).getZIP());
	}

	@Test
	@DisplayName("Record 4416: Phone is 212-505-9632")
	void PhoneOfRecord4416() {
		assertEquals("212-505-9632", customers.get(4415).getPhone());
	}

	@Test
	@DisplayName("Record 4416: Fax is 212-505-1483")
	void FaxOfRecord4416() {
		assertEquals("212-505-1483", customers.get(4415).getFax());
	}

	@Test
	@DisplayName("Record 4416: Email is marcellus@straughan.com")
	void EmailOfRecord4416() {
		assertEquals("marcellus@straughan.com", customers.get(4415).getEmail());
	}

	@Test
	@DisplayName("Record 4416: Web is http://www.marcellusstraughan.com")
	void WebOfRecord4416() {
		assertEquals("http://www.marcellusstraughan.com", customers.get(4415).getWeb());
	}
}
