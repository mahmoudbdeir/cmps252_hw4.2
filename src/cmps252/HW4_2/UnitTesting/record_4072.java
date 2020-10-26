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

@Tag("6")
class Record_4072 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4072: FirstName is Ronny")
	void FirstNameOfRecord4072() {
		assertEquals("Ronny", customers.get(4071).getFirstName());
	}

	@Test
	@DisplayName("Record 4072: LastName is Chiodini")
	void LastNameOfRecord4072() {
		assertEquals("Chiodini", customers.get(4071).getLastName());
	}

	@Test
	@DisplayName("Record 4072: Company is Procopy Inc")
	void CompanyOfRecord4072() {
		assertEquals("Procopy Inc", customers.get(4071).getCompany());
	}

	@Test
	@DisplayName("Record 4072: Address is 11138 W Greenfield Ave")
	void AddressOfRecord4072() {
		assertEquals("11138 W Greenfield Ave", customers.get(4071).getAddress());
	}

	@Test
	@DisplayName("Record 4072: City is Milwaukee")
	void CityOfRecord4072() {
		assertEquals("Milwaukee", customers.get(4071).getCity());
	}

	@Test
	@DisplayName("Record 4072: County is Milwaukee")
	void CountyOfRecord4072() {
		assertEquals("Milwaukee", customers.get(4071).getCounty());
	}

	@Test
	@DisplayName("Record 4072: State is WI")
	void StateOfRecord4072() {
		assertEquals("WI", customers.get(4071).getState());
	}

	@Test
	@DisplayName("Record 4072: ZIP is 53214")
	void ZIPOfRecord4072() {
		assertEquals("53214", customers.get(4071).getZIP());
	}

	@Test
	@DisplayName("Record 4072: Phone is 414-256-5214")
	void PhoneOfRecord4072() {
		assertEquals("414-256-5214", customers.get(4071).getPhone());
	}

	@Test
	@DisplayName("Record 4072: Fax is 414-256-8947")
	void FaxOfRecord4072() {
		assertEquals("414-256-8947", customers.get(4071).getFax());
	}

	@Test
	@DisplayName("Record 4072: Email is ronny@chiodini.com")
	void EmailOfRecord4072() {
		assertEquals("ronny@chiodini.com", customers.get(4071).getEmail());
	}

	@Test
	@DisplayName("Record 4072: Web is http://www.ronnychiodini.com")
	void WebOfRecord4072() {
		assertEquals("http://www.ronnychiodini.com", customers.get(4071).getWeb());
	}
}
