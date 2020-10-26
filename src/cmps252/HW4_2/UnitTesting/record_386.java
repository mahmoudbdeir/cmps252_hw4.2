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
class Record_386 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 386: FirstName is Randall")
	void FirstNameOfRecord386() {
		assertEquals("Randall", customers.get(385).getFirstName());
	}

	@Test
	@DisplayName("Record 386: LastName is Pacubas")
	void LastNameOfRecord386() {
		assertEquals("Pacubas", customers.get(385).getLastName());
	}

	@Test
	@DisplayName("Record 386: Company is Precision Technologies Inc")
	void CompanyOfRecord386() {
		assertEquals("Precision Technologies Inc", customers.get(385).getCompany());
	}

	@Test
	@DisplayName("Record 386: Address is 19497 Klondike Dr")
	void AddressOfRecord386() {
		assertEquals("19497 Klondike Dr", customers.get(385).getAddress());
	}

	@Test
	@DisplayName("Record 386: City is Chugiak")
	void CityOfRecord386() {
		assertEquals("Chugiak", customers.get(385).getCity());
	}

	@Test
	@DisplayName("Record 386: County is Anchorage")
	void CountyOfRecord386() {
		assertEquals("Anchorage", customers.get(385).getCounty());
	}

	@Test
	@DisplayName("Record 386: State is AK")
	void StateOfRecord386() {
		assertEquals("AK", customers.get(385).getState());
	}

	@Test
	@DisplayName("Record 386: ZIP is 99567")
	void ZIPOfRecord386() {
		assertEquals("99567", customers.get(385).getZIP());
	}

	@Test
	@DisplayName("Record 386: Phone is 907-688-6659")
	void PhoneOfRecord386() {
		assertEquals("907-688-6659", customers.get(385).getPhone());
	}

	@Test
	@DisplayName("Record 386: Fax is 907-688-6992")
	void FaxOfRecord386() {
		assertEquals("907-688-6992", customers.get(385).getFax());
	}

	@Test
	@DisplayName("Record 386: Email is randall@pacubas.com")
	void EmailOfRecord386() {
		assertEquals("randall@pacubas.com", customers.get(385).getEmail());
	}

	@Test
	@DisplayName("Record 386: Web is http://www.randallpacubas.com")
	void WebOfRecord386() {
		assertEquals("http://www.randallpacubas.com", customers.get(385).getWeb());
	}
}
