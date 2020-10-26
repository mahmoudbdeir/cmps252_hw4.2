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

@Tag("22")
class Record_3958 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3958: FirstName is Steven")
	void FirstNameOfRecord3958() {
		assertEquals("Steven", customers.get(3957).getFirstName());
	}

	@Test
	@DisplayName("Record 3958: LastName is Brownlee")
	void LastNameOfRecord3958() {
		assertEquals("Brownlee", customers.get(3957).getLastName());
	}

	@Test
	@DisplayName("Record 3958: Company is Dunbar Assocts Inc")
	void CompanyOfRecord3958() {
		assertEquals("Dunbar Assocts Inc", customers.get(3957).getCompany());
	}

	@Test
	@DisplayName("Record 3958: Address is 2455 Francis Lewis Blvd")
	void AddressOfRecord3958() {
		assertEquals("2455 Francis Lewis Blvd", customers.get(3957).getAddress());
	}

	@Test
	@DisplayName("Record 3958: City is Whitestone")
	void CityOfRecord3958() {
		assertEquals("Whitestone", customers.get(3957).getCity());
	}

	@Test
	@DisplayName("Record 3958: County is Queens")
	void CountyOfRecord3958() {
		assertEquals("Queens", customers.get(3957).getCounty());
	}

	@Test
	@DisplayName("Record 3958: State is NY")
	void StateOfRecord3958() {
		assertEquals("NY", customers.get(3957).getState());
	}

	@Test
	@DisplayName("Record 3958: ZIP is 11357")
	void ZIPOfRecord3958() {
		assertEquals("11357", customers.get(3957).getZIP());
	}

	@Test
	@DisplayName("Record 3958: Phone is 718-352-4261")
	void PhoneOfRecord3958() {
		assertEquals("718-352-4261", customers.get(3957).getPhone());
	}

	@Test
	@DisplayName("Record 3958: Fax is 718-352-8996")
	void FaxOfRecord3958() {
		assertEquals("718-352-8996", customers.get(3957).getFax());
	}

	@Test
	@DisplayName("Record 3958: Email is steven@brownlee.com")
	void EmailOfRecord3958() {
		assertEquals("steven@brownlee.com", customers.get(3957).getEmail());
	}

	@Test
	@DisplayName("Record 3958: Web is http://www.stevenbrownlee.com")
	void WebOfRecord3958() {
		assertEquals("http://www.stevenbrownlee.com", customers.get(3957).getWeb());
	}
}
