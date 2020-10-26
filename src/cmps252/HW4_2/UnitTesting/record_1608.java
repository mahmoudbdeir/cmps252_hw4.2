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
class Record_1608 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1608: FirstName is Shelley")
	void FirstNameOfRecord1608() {
		assertEquals("Shelley", customers.get(1607).getFirstName());
	}

	@Test
	@DisplayName("Record 1608: LastName is Boozer")
	void LastNameOfRecord1608() {
		assertEquals("Boozer", customers.get(1607).getLastName());
	}

	@Test
	@DisplayName("Record 1608: Company is Natl Assn Stat Universities")
	void CompanyOfRecord1608() {
		assertEquals("Natl Assn Stat Universities", customers.get(1607).getCompany());
	}

	@Test
	@DisplayName("Record 1608: Address is 1501 E Bessemer Ave")
	void AddressOfRecord1608() {
		assertEquals("1501 E Bessemer Ave", customers.get(1607).getAddress());
	}

	@Test
	@DisplayName("Record 1608: City is Greensboro")
	void CityOfRecord1608() {
		assertEquals("Greensboro", customers.get(1607).getCity());
	}

	@Test
	@DisplayName("Record 1608: County is Guilford")
	void CountyOfRecord1608() {
		assertEquals("Guilford", customers.get(1607).getCounty());
	}

	@Test
	@DisplayName("Record 1608: State is NC")
	void StateOfRecord1608() {
		assertEquals("NC", customers.get(1607).getState());
	}

	@Test
	@DisplayName("Record 1608: ZIP is 27405")
	void ZIPOfRecord1608() {
		assertEquals("27405", customers.get(1607).getZIP());
	}

	@Test
	@DisplayName("Record 1608: Phone is 336-691-5082")
	void PhoneOfRecord1608() {
		assertEquals("336-691-5082", customers.get(1607).getPhone());
	}

	@Test
	@DisplayName("Record 1608: Fax is 336-691-4471")
	void FaxOfRecord1608() {
		assertEquals("336-691-4471", customers.get(1607).getFax());
	}

	@Test
	@DisplayName("Record 1608: Email is shelley@boozer.com")
	void EmailOfRecord1608() {
		assertEquals("shelley@boozer.com", customers.get(1607).getEmail());
	}

	@Test
	@DisplayName("Record 1608: Web is http://www.shelleyboozer.com")
	void WebOfRecord1608() {
		assertEquals("http://www.shelleyboozer.com", customers.get(1607).getWeb());
	}
}
