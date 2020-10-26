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

@Tag("1")
class Record_1457 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1457: FirstName is Dewayne")
	void FirstNameOfRecord1457() {
		assertEquals("Dewayne", customers.get(1456).getFirstName());
	}

	@Test
	@DisplayName("Record 1457: LastName is Dronko")
	void LastNameOfRecord1457() {
		assertEquals("Dronko", customers.get(1456).getLastName());
	}

	@Test
	@DisplayName("Record 1457: Company is American Lyna Co")
	void CompanyOfRecord1457() {
		assertEquals("American Lyna Co", customers.get(1456).getCompany());
	}

	@Test
	@DisplayName("Record 1457: Address is 202 Muldoon Rd")
	void AddressOfRecord1457() {
		assertEquals("202 Muldoon Rd", customers.get(1456).getAddress());
	}

	@Test
	@DisplayName("Record 1457: City is Anchorage")
	void CityOfRecord1457() {
		assertEquals("Anchorage", customers.get(1456).getCity());
	}

	@Test
	@DisplayName("Record 1457: County is Anchorage")
	void CountyOfRecord1457() {
		assertEquals("Anchorage", customers.get(1456).getCounty());
	}

	@Test
	@DisplayName("Record 1457: State is AK")
	void StateOfRecord1457() {
		assertEquals("AK", customers.get(1456).getState());
	}

	@Test
	@DisplayName("Record 1457: ZIP is 99504")
	void ZIPOfRecord1457() {
		assertEquals("99504", customers.get(1456).getZIP());
	}

	@Test
	@DisplayName("Record 1457: Phone is 907-338-8231")
	void PhoneOfRecord1457() {
		assertEquals("907-338-8231", customers.get(1456).getPhone());
	}

	@Test
	@DisplayName("Record 1457: Fax is 907-338-6611")
	void FaxOfRecord1457() {
		assertEquals("907-338-6611", customers.get(1456).getFax());
	}

	@Test
	@DisplayName("Record 1457: Email is dewayne@dronko.com")
	void EmailOfRecord1457() {
		assertEquals("dewayne@dronko.com", customers.get(1456).getEmail());
	}

	@Test
	@DisplayName("Record 1457: Web is http://www.dewaynedronko.com")
	void WebOfRecord1457() {
		assertEquals("http://www.dewaynedronko.com", customers.get(1456).getWeb());
	}
}
