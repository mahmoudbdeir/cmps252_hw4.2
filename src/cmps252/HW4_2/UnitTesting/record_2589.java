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

@Tag("18")
class Record_2589 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2589: FirstName is Guy")
	void FirstNameOfRecord2589() {
		assertEquals("Guy", customers.get(2588).getFirstName());
	}

	@Test
	@DisplayName("Record 2589: LastName is Easter")
	void LastNameOfRecord2589() {
		assertEquals("Easter", customers.get(2588).getLastName());
	}

	@Test
	@DisplayName("Record 2589: Company is Rogers, Kim A Esq")
	void CompanyOfRecord2589() {
		assertEquals("Rogers, Kim A Esq", customers.get(2588).getCompany());
	}

	@Test
	@DisplayName("Record 2589: Address is 1281 Terminal Way  #-223")
	void AddressOfRecord2589() {
		assertEquals("1281 Terminal Way  #-223", customers.get(2588).getAddress());
	}

	@Test
	@DisplayName("Record 2589: City is Reno")
	void CityOfRecord2589() {
		assertEquals("Reno", customers.get(2588).getCity());
	}

	@Test
	@DisplayName("Record 2589: County is Washoe")
	void CountyOfRecord2589() {
		assertEquals("Washoe", customers.get(2588).getCounty());
	}

	@Test
	@DisplayName("Record 2589: State is NV")
	void StateOfRecord2589() {
		assertEquals("NV", customers.get(2588).getState());
	}

	@Test
	@DisplayName("Record 2589: ZIP is 89502")
	void ZIPOfRecord2589() {
		assertEquals("89502", customers.get(2588).getZIP());
	}

	@Test
	@DisplayName("Record 2589: Phone is 775-348-9665")
	void PhoneOfRecord2589() {
		assertEquals("775-348-9665", customers.get(2588).getPhone());
	}

	@Test
	@DisplayName("Record 2589: Fax is 775-348-1492")
	void FaxOfRecord2589() {
		assertEquals("775-348-1492", customers.get(2588).getFax());
	}

	@Test
	@DisplayName("Record 2589: Email is guy@easter.com")
	void EmailOfRecord2589() {
		assertEquals("guy@easter.com", customers.get(2588).getEmail());
	}

	@Test
	@DisplayName("Record 2589: Web is http://www.guyeaster.com")
	void WebOfRecord2589() {
		assertEquals("http://www.guyeaster.com", customers.get(2588).getWeb());
	}
}
