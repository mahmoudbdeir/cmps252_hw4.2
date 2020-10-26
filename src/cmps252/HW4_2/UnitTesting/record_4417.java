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

@Tag("32")
class Record_4417 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4417: FirstName is Guy")
	void FirstNameOfRecord4417() {
		assertEquals("Guy", customers.get(4416).getFirstName());
	}

	@Test
	@DisplayName("Record 4417: LastName is Moshos")
	void LastNameOfRecord4417() {
		assertEquals("Moshos", customers.get(4416).getLastName());
	}

	@Test
	@DisplayName("Record 4417: Company is Grodon")
	void CompanyOfRecord4417() {
		assertEquals("Grodon", customers.get(4416).getCompany());
	}

	@Test
	@DisplayName("Record 4417: Address is 651 W Mount Pleasant Ave")
	void AddressOfRecord4417() {
		assertEquals("651 W Mount Pleasant Ave", customers.get(4416).getAddress());
	}

	@Test
	@DisplayName("Record 4417: City is Livingston")
	void CityOfRecord4417() {
		assertEquals("Livingston", customers.get(4416).getCity());
	}

	@Test
	@DisplayName("Record 4417: County is Essex")
	void CountyOfRecord4417() {
		assertEquals("Essex", customers.get(4416).getCounty());
	}

	@Test
	@DisplayName("Record 4417: State is NJ")
	void StateOfRecord4417() {
		assertEquals("NJ", customers.get(4416).getState());
	}

	@Test
	@DisplayName("Record 4417: ZIP is 7039")
	void ZIPOfRecord4417() {
		assertEquals("7039", customers.get(4416).getZIP());
	}

	@Test
	@DisplayName("Record 4417: Phone is 973-994-7083")
	void PhoneOfRecord4417() {
		assertEquals("973-994-7083", customers.get(4416).getPhone());
	}

	@Test
	@DisplayName("Record 4417: Fax is 973-994-2798")
	void FaxOfRecord4417() {
		assertEquals("973-994-2798", customers.get(4416).getFax());
	}

	@Test
	@DisplayName("Record 4417: Email is guy@moshos.com")
	void EmailOfRecord4417() {
		assertEquals("guy@moshos.com", customers.get(4416).getEmail());
	}

	@Test
	@DisplayName("Record 4417: Web is http://www.guymoshos.com")
	void WebOfRecord4417() {
		assertEquals("http://www.guymoshos.com", customers.get(4416).getWeb());
	}
}
