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

@Tag("49")
class Record_2890 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2890: FirstName is Lucy")
	void FirstNameOfRecord2890() {
		assertEquals("Lucy", customers.get(2889).getFirstName());
	}

	@Test
	@DisplayName("Record 2890: LastName is Cashion")
	void LastNameOfRecord2890() {
		assertEquals("Cashion", customers.get(2889).getLastName());
	}

	@Test
	@DisplayName("Record 2890: Company is Emerson, Henry Lavonne Esq")
	void CompanyOfRecord2890() {
		assertEquals("Emerson, Henry Lavonne Esq", customers.get(2889).getCompany());
	}

	@Test
	@DisplayName("Record 2890: Address is 1415 N Midland Blvd")
	void AddressOfRecord2890() {
		assertEquals("1415 N Midland Blvd", customers.get(2889).getAddress());
	}

	@Test
	@DisplayName("Record 2890: City is Nampa")
	void CityOfRecord2890() {
		assertEquals("Nampa", customers.get(2889).getCity());
	}

	@Test
	@DisplayName("Record 2890: County is Canyon")
	void CountyOfRecord2890() {
		assertEquals("Canyon", customers.get(2889).getCounty());
	}

	@Test
	@DisplayName("Record 2890: State is ID")
	void StateOfRecord2890() {
		assertEquals("ID", customers.get(2889).getState());
	}

	@Test
	@DisplayName("Record 2890: ZIP is 83651")
	void ZIPOfRecord2890() {
		assertEquals("83651", customers.get(2889).getZIP());
	}

	@Test
	@DisplayName("Record 2890: Phone is 208-467-6576")
	void PhoneOfRecord2890() {
		assertEquals("208-467-6576", customers.get(2889).getPhone());
	}

	@Test
	@DisplayName("Record 2890: Fax is 208-467-9234")
	void FaxOfRecord2890() {
		assertEquals("208-467-9234", customers.get(2889).getFax());
	}

	@Test
	@DisplayName("Record 2890: Email is lucy@cashion.com")
	void EmailOfRecord2890() {
		assertEquals("lucy@cashion.com", customers.get(2889).getEmail());
	}

	@Test
	@DisplayName("Record 2890: Web is http://www.lucycashion.com")
	void WebOfRecord2890() {
		assertEquals("http://www.lucycashion.com", customers.get(2889).getWeb());
	}
}
