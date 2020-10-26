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

@Tag("29")
class Record_3646 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3646: FirstName is Rolf")
	void FirstNameOfRecord3646() {
		assertEquals("Rolf", customers.get(3645).getFirstName());
	}

	@Test
	@DisplayName("Record 3646: LastName is Chalk")
	void LastNameOfRecord3646() {
		assertEquals("Chalk", customers.get(3645).getLastName());
	}

	@Test
	@DisplayName("Record 3646: Company is Pacquet Onyda Inc")
	void CompanyOfRecord3646() {
		assertEquals("Pacquet Onyda Inc", customers.get(3645).getCompany());
	}

	@Test
	@DisplayName("Record 3646: Address is 600 W 41st Ave")
	void AddressOfRecord3646() {
		assertEquals("600 W 41st Ave", customers.get(3645).getAddress());
	}

	@Test
	@DisplayName("Record 3646: City is Anchorage")
	void CityOfRecord3646() {
		assertEquals("Anchorage", customers.get(3645).getCity());
	}

	@Test
	@DisplayName("Record 3646: County is Anchorage")
	void CountyOfRecord3646() {
		assertEquals("Anchorage", customers.get(3645).getCounty());
	}

	@Test
	@DisplayName("Record 3646: State is AK")
	void StateOfRecord3646() {
		assertEquals("AK", customers.get(3645).getState());
	}

	@Test
	@DisplayName("Record 3646: ZIP is 99503")
	void ZIPOfRecord3646() {
		assertEquals("99503", customers.get(3645).getZIP());
	}

	@Test
	@DisplayName("Record 3646: Phone is 907-563-4653")
	void PhoneOfRecord3646() {
		assertEquals("907-563-4653", customers.get(3645).getPhone());
	}

	@Test
	@DisplayName("Record 3646: Fax is 907-563-3642")
	void FaxOfRecord3646() {
		assertEquals("907-563-3642", customers.get(3645).getFax());
	}

	@Test
	@DisplayName("Record 3646: Email is rolf@chalk.com")
	void EmailOfRecord3646() {
		assertEquals("rolf@chalk.com", customers.get(3645).getEmail());
	}

	@Test
	@DisplayName("Record 3646: Web is http://www.rolfchalk.com")
	void WebOfRecord3646() {
		assertEquals("http://www.rolfchalk.com", customers.get(3645).getWeb());
	}
}
