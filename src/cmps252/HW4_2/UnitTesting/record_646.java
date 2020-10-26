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
class Record_646 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 646: FirstName is Tracy")
	void FirstNameOfRecord646() {
		assertEquals("Tracy", customers.get(645).getFirstName());
	}

	@Test
	@DisplayName("Record 646: LastName is Moradel")
	void LastNameOfRecord646() {
		assertEquals("Moradel", customers.get(645).getLastName());
	}

	@Test
	@DisplayName("Record 646: Company is Ronald A Grover Pc")
	void CompanyOfRecord646() {
		assertEquals("Ronald A Grover Pc", customers.get(645).getCompany());
	}

	@Test
	@DisplayName("Record 646: Address is 12016 W Pico Blvd")
	void AddressOfRecord646() {
		assertEquals("12016 W Pico Blvd", customers.get(645).getAddress());
	}

	@Test
	@DisplayName("Record 646: City is Los Angeles")
	void CityOfRecord646() {
		assertEquals("Los Angeles", customers.get(645).getCity());
	}

	@Test
	@DisplayName("Record 646: County is Los Angeles")
	void CountyOfRecord646() {
		assertEquals("Los Angeles", customers.get(645).getCounty());
	}

	@Test
	@DisplayName("Record 646: State is CA")
	void StateOfRecord646() {
		assertEquals("CA", customers.get(645).getState());
	}

	@Test
	@DisplayName("Record 646: ZIP is 90064")
	void ZIPOfRecord646() {
		assertEquals("90064", customers.get(645).getZIP());
	}

	@Test
	@DisplayName("Record 646: Phone is 310-477-9626")
	void PhoneOfRecord646() {
		assertEquals("310-477-9626", customers.get(645).getPhone());
	}

	@Test
	@DisplayName("Record 646: Fax is 310-477-3185")
	void FaxOfRecord646() {
		assertEquals("310-477-3185", customers.get(645).getFax());
	}

	@Test
	@DisplayName("Record 646: Email is tracy@moradel.com")
	void EmailOfRecord646() {
		assertEquals("tracy@moradel.com", customers.get(645).getEmail());
	}

	@Test
	@DisplayName("Record 646: Web is http://www.tracymoradel.com")
	void WebOfRecord646() {
		assertEquals("http://www.tracymoradel.com", customers.get(645).getWeb());
	}
}
