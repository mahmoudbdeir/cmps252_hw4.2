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

@Tag("30")
class Record_1886 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1886: FirstName is Jon")
	void FirstNameOfRecord1886() {
		assertEquals("Jon", customers.get(1885).getFirstName());
	}

	@Test
	@DisplayName("Record 1886: LastName is Dials")
	void LastNameOfRecord1886() {
		assertEquals("Dials", customers.get(1885).getLastName());
	}

	@Test
	@DisplayName("Record 1886: Company is Eastern Bus Sales & Svc Corp")
	void CompanyOfRecord1886() {
		assertEquals("Eastern Bus Sales & Svc Corp", customers.get(1885).getCompany());
	}

	@Test
	@DisplayName("Record 1886: Address is 240 Railroad Ave")
	void AddressOfRecord1886() {
		assertEquals("240 Railroad Ave", customers.get(1885).getAddress());
	}

	@Test
	@DisplayName("Record 1886: City is Ambler")
	void CityOfRecord1886() {
		assertEquals("Ambler", customers.get(1885).getCity());
	}

	@Test
	@DisplayName("Record 1886: County is Montgomery")
	void CountyOfRecord1886() {
		assertEquals("Montgomery", customers.get(1885).getCounty());
	}

	@Test
	@DisplayName("Record 1886: State is PA")
	void StateOfRecord1886() {
		assertEquals("PA", customers.get(1885).getState());
	}

	@Test
	@DisplayName("Record 1886: ZIP is 19002")
	void ZIPOfRecord1886() {
		assertEquals("19002", customers.get(1885).getZIP());
	}

	@Test
	@DisplayName("Record 1886: Phone is 215-643-7188")
	void PhoneOfRecord1886() {
		assertEquals("215-643-7188", customers.get(1885).getPhone());
	}

	@Test
	@DisplayName("Record 1886: Fax is 215-643-7674")
	void FaxOfRecord1886() {
		assertEquals("215-643-7674", customers.get(1885).getFax());
	}

	@Test
	@DisplayName("Record 1886: Email is jon@dials.com")
	void EmailOfRecord1886() {
		assertEquals("jon@dials.com", customers.get(1885).getEmail());
	}

	@Test
	@DisplayName("Record 1886: Web is http://www.jondials.com")
	void WebOfRecord1886() {
		assertEquals("http://www.jondials.com", customers.get(1885).getWeb());
	}
}
