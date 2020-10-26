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
class Record_1509 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1509: FirstName is Betsy")
	void FirstNameOfRecord1509() {
		assertEquals("Betsy", customers.get(1508).getFirstName());
	}

	@Test
	@DisplayName("Record 1509: LastName is Rapisura")
	void LastNameOfRecord1509() {
		assertEquals("Rapisura", customers.get(1508).getLastName());
	}

	@Test
	@DisplayName("Record 1509: Company is Ritter, Lloyd B")
	void CompanyOfRecord1509() {
		assertEquals("Ritter, Lloyd B", customers.get(1508).getCompany());
	}

	@Test
	@DisplayName("Record 1509: Address is 1150 E 5th Ave")
	void AddressOfRecord1509() {
		assertEquals("1150 E 5th Ave", customers.get(1508).getAddress());
	}

	@Test
	@DisplayName("Record 1509: City is Anchorage")
	void CityOfRecord1509() {
		assertEquals("Anchorage", customers.get(1508).getCity());
	}

	@Test
	@DisplayName("Record 1509: County is Anchorage")
	void CountyOfRecord1509() {
		assertEquals("Anchorage", customers.get(1508).getCounty());
	}

	@Test
	@DisplayName("Record 1509: State is AK")
	void StateOfRecord1509() {
		assertEquals("AK", customers.get(1508).getState());
	}

	@Test
	@DisplayName("Record 1509: ZIP is 99501")
	void ZIPOfRecord1509() {
		assertEquals("99501", customers.get(1508).getZIP());
	}

	@Test
	@DisplayName("Record 1509: Phone is 907-276-1607")
	void PhoneOfRecord1509() {
		assertEquals("907-276-1607", customers.get(1508).getPhone());
	}

	@Test
	@DisplayName("Record 1509: Fax is 907-276-2726")
	void FaxOfRecord1509() {
		assertEquals("907-276-2726", customers.get(1508).getFax());
	}

	@Test
	@DisplayName("Record 1509: Email is betsy@rapisura.com")
	void EmailOfRecord1509() {
		assertEquals("betsy@rapisura.com", customers.get(1508).getEmail());
	}

	@Test
	@DisplayName("Record 1509: Web is http://www.betsyrapisura.com")
	void WebOfRecord1509() {
		assertEquals("http://www.betsyrapisura.com", customers.get(1508).getWeb());
	}
}
