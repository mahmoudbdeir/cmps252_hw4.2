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

@Tag("40")
class Record_1580 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1580: FirstName is Karyn")
	void FirstNameOfRecord1580() {
		assertEquals("Karyn", customers.get(1579).getFirstName());
	}

	@Test
	@DisplayName("Record 1580: LastName is Crosier")
	void LastNameOfRecord1580() {
		assertEquals("Crosier", customers.get(1579).getLastName());
	}

	@Test
	@DisplayName("Record 1580: Company is Desberg, Gary S Esq")
	void CompanyOfRecord1580() {
		assertEquals("Desberg, Gary S Esq", customers.get(1579).getCompany());
	}

	@Test
	@DisplayName("Record 1580: Address is 961 Joyce Kilmer Ave")
	void AddressOfRecord1580() {
		assertEquals("961 Joyce Kilmer Ave", customers.get(1579).getAddress());
	}

	@Test
	@DisplayName("Record 1580: City is North Brunswick")
	void CityOfRecord1580() {
		assertEquals("North Brunswick", customers.get(1579).getCity());
	}

	@Test
	@DisplayName("Record 1580: County is Middlesex")
	void CountyOfRecord1580() {
		assertEquals("Middlesex", customers.get(1579).getCounty());
	}

	@Test
	@DisplayName("Record 1580: State is NJ")
	void StateOfRecord1580() {
		assertEquals("NJ", customers.get(1579).getState());
	}

	@Test
	@DisplayName("Record 1580: ZIP is 8902")
	void ZIPOfRecord1580() {
		assertEquals("8902", customers.get(1579).getZIP());
	}

	@Test
	@DisplayName("Record 1580: Phone is 732-846-1756")
	void PhoneOfRecord1580() {
		assertEquals("732-846-1756", customers.get(1579).getPhone());
	}

	@Test
	@DisplayName("Record 1580: Fax is 732-846-6488")
	void FaxOfRecord1580() {
		assertEquals("732-846-6488", customers.get(1579).getFax());
	}

	@Test
	@DisplayName("Record 1580: Email is karyn@crosier.com")
	void EmailOfRecord1580() {
		assertEquals("karyn@crosier.com", customers.get(1579).getEmail());
	}

	@Test
	@DisplayName("Record 1580: Web is http://www.karyncrosier.com")
	void WebOfRecord1580() {
		assertEquals("http://www.karyncrosier.com", customers.get(1579).getWeb());
	}
}
