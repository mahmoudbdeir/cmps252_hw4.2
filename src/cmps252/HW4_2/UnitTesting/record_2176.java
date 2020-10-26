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
class Record_2176 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2176: FirstName is Hugo")
	void FirstNameOfRecord2176() {
		assertEquals("Hugo", customers.get(2175).getFirstName());
	}

	@Test
	@DisplayName("Record 2176: LastName is Tindell")
	void LastNameOfRecord2176() {
		assertEquals("Tindell", customers.get(2175).getLastName());
	}

	@Test
	@DisplayName("Record 2176: Company is Howe, Steve N Esq")
	void CompanyOfRecord2176() {
		assertEquals("Howe, Steve N Esq", customers.get(2175).getCompany());
	}

	@Test
	@DisplayName("Record 2176: Address is 10301 Metropolitan Ave")
	void AddressOfRecord2176() {
		assertEquals("10301 Metropolitan Ave", customers.get(2175).getAddress());
	}

	@Test
	@DisplayName("Record 2176: City is Forest Hills")
	void CityOfRecord2176() {
		assertEquals("Forest Hills", customers.get(2175).getCity());
	}

	@Test
	@DisplayName("Record 2176: County is Queens")
	void CountyOfRecord2176() {
		assertEquals("Queens", customers.get(2175).getCounty());
	}

	@Test
	@DisplayName("Record 2176: State is NY")
	void StateOfRecord2176() {
		assertEquals("NY", customers.get(2175).getState());
	}

	@Test
	@DisplayName("Record 2176: ZIP is 11375")
	void ZIPOfRecord2176() {
		assertEquals("11375", customers.get(2175).getZIP());
	}

	@Test
	@DisplayName("Record 2176: Phone is 718-326-3303")
	void PhoneOfRecord2176() {
		assertEquals("718-326-3303", customers.get(2175).getPhone());
	}

	@Test
	@DisplayName("Record 2176: Fax is 718-326-1158")
	void FaxOfRecord2176() {
		assertEquals("718-326-1158", customers.get(2175).getFax());
	}

	@Test
	@DisplayName("Record 2176: Email is hugo@tindell.com")
	void EmailOfRecord2176() {
		assertEquals("hugo@tindell.com", customers.get(2175).getEmail());
	}

	@Test
	@DisplayName("Record 2176: Web is http://www.hugotindell.com")
	void WebOfRecord2176() {
		assertEquals("http://www.hugotindell.com", customers.get(2175).getWeb());
	}
}
