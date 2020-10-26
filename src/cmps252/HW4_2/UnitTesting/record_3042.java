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

@Tag("47")
class Record_3042 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3042: FirstName is Columbus")
	void FirstNameOfRecord3042() {
		assertEquals("Columbus", customers.get(3041).getFirstName());
	}

	@Test
	@DisplayName("Record 3042: LastName is Ehrismann")
	void LastNameOfRecord3042() {
		assertEquals("Ehrismann", customers.get(3041).getLastName());
	}

	@Test
	@DisplayName("Record 3042: Company is Palm Harbor Area Chmbr Commrce")
	void CompanyOfRecord3042() {
		assertEquals("Palm Harbor Area Chmbr Commrce", customers.get(3041).getCompany());
	}

	@Test
	@DisplayName("Record 3042: Address is 7625 Page Ave")
	void AddressOfRecord3042() {
		assertEquals("7625 Page Ave", customers.get(3041).getAddress());
	}

	@Test
	@DisplayName("Record 3042: City is Saint Louis")
	void CityOfRecord3042() {
		assertEquals("Saint Louis", customers.get(3041).getCity());
	}

	@Test
	@DisplayName("Record 3042: County is Saint Louis")
	void CountyOfRecord3042() {
		assertEquals("Saint Louis", customers.get(3041).getCounty());
	}

	@Test
	@DisplayName("Record 3042: State is MO")
	void StateOfRecord3042() {
		assertEquals("MO", customers.get(3041).getState());
	}

	@Test
	@DisplayName("Record 3042: ZIP is 63133")
	void ZIPOfRecord3042() {
		assertEquals("63133", customers.get(3041).getZIP());
	}

	@Test
	@DisplayName("Record 3042: Phone is 314-727-2255")
	void PhoneOfRecord3042() {
		assertEquals("314-727-2255", customers.get(3041).getPhone());
	}

	@Test
	@DisplayName("Record 3042: Fax is 314-727-4091")
	void FaxOfRecord3042() {
		assertEquals("314-727-4091", customers.get(3041).getFax());
	}

	@Test
	@DisplayName("Record 3042: Email is columbus@ehrismann.com")
	void EmailOfRecord3042() {
		assertEquals("columbus@ehrismann.com", customers.get(3041).getEmail());
	}

	@Test
	@DisplayName("Record 3042: Web is http://www.columbusehrismann.com")
	void WebOfRecord3042() {
		assertEquals("http://www.columbusehrismann.com", customers.get(3041).getWeb());
	}
}
