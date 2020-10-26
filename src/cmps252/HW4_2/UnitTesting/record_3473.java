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

@Tag("15")
class Record_3473 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3473: FirstName is Lowell")
	void FirstNameOfRecord3473() {
		assertEquals("Lowell", customers.get(3472).getFirstName());
	}

	@Test
	@DisplayName("Record 3473: LastName is Muscaro")
	void LastNameOfRecord3473() {
		assertEquals("Muscaro", customers.get(3472).getLastName());
	}

	@Test
	@DisplayName("Record 3473: Company is Mandell, Jeffery Esq")
	void CompanyOfRecord3473() {
		assertEquals("Mandell, Jeffery Esq", customers.get(3472).getCompany());
	}

	@Test
	@DisplayName("Record 3473: Address is 650 Ackerman Rd")
	void AddressOfRecord3473() {
		assertEquals("650 Ackerman Rd", customers.get(3472).getAddress());
	}

	@Test
	@DisplayName("Record 3473: City is Columbus")
	void CityOfRecord3473() {
		assertEquals("Columbus", customers.get(3472).getCity());
	}

	@Test
	@DisplayName("Record 3473: County is Franklin")
	void CountyOfRecord3473() {
		assertEquals("Franklin", customers.get(3472).getCounty());
	}

	@Test
	@DisplayName("Record 3473: State is OH")
	void StateOfRecord3473() {
		assertEquals("OH", customers.get(3472).getState());
	}

	@Test
	@DisplayName("Record 3473: ZIP is 43202")
	void ZIPOfRecord3473() {
		assertEquals("43202", customers.get(3472).getZIP());
	}

	@Test
	@DisplayName("Record 3473: Phone is 614-261-9720")
	void PhoneOfRecord3473() {
		assertEquals("614-261-9720", customers.get(3472).getPhone());
	}

	@Test
	@DisplayName("Record 3473: Fax is 614-261-2887")
	void FaxOfRecord3473() {
		assertEquals("614-261-2887", customers.get(3472).getFax());
	}

	@Test
	@DisplayName("Record 3473: Email is lowell@muscaro.com")
	void EmailOfRecord3473() {
		assertEquals("lowell@muscaro.com", customers.get(3472).getEmail());
	}

	@Test
	@DisplayName("Record 3473: Web is http://www.lowellmuscaro.com")
	void WebOfRecord3473() {
		assertEquals("http://www.lowellmuscaro.com", customers.get(3472).getWeb());
	}
}
