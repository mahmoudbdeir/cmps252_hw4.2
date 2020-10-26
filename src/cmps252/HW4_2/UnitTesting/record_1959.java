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

@Tag("41")
class Record_1959 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1959: FirstName is Ivan")
	void FirstNameOfRecord1959() {
		assertEquals("Ivan", customers.get(1958).getFirstName());
	}

	@Test
	@DisplayName("Record 1959: LastName is Sondrini")
	void LastNameOfRecord1959() {
		assertEquals("Sondrini", customers.get(1958).getLastName());
	}

	@Test
	@DisplayName("Record 1959: Company is Boy Scouts Of America")
	void CompanyOfRecord1959() {
		assertEquals("Boy Scouts Of America", customers.get(1958).getCompany());
	}

	@Test
	@DisplayName("Record 1959: Address is 559 Howell Ave")
	void AddressOfRecord1959() {
		assertEquals("559 Howell Ave", customers.get(1958).getAddress());
	}

	@Test
	@DisplayName("Record 1959: City is Trenton")
	void CityOfRecord1959() {
		assertEquals("Trenton", customers.get(1958).getCity());
	}

	@Test
	@DisplayName("Record 1959: County is Mercer")
	void CountyOfRecord1959() {
		assertEquals("Mercer", customers.get(1958).getCounty());
	}

	@Test
	@DisplayName("Record 1959: State is NJ")
	void StateOfRecord1959() {
		assertEquals("NJ", customers.get(1958).getState());
	}

	@Test
	@DisplayName("Record 1959: ZIP is 8628")
	void ZIPOfRecord1959() {
		assertEquals("8628", customers.get(1958).getZIP());
	}

	@Test
	@DisplayName("Record 1959: Phone is 609-883-2527")
	void PhoneOfRecord1959() {
		assertEquals("609-883-2527", customers.get(1958).getPhone());
	}

	@Test
	@DisplayName("Record 1959: Fax is 609-883-4931")
	void FaxOfRecord1959() {
		assertEquals("609-883-4931", customers.get(1958).getFax());
	}

	@Test
	@DisplayName("Record 1959: Email is ivan@sondrini.com")
	void EmailOfRecord1959() {
		assertEquals("ivan@sondrini.com", customers.get(1958).getEmail());
	}

	@Test
	@DisplayName("Record 1959: Web is http://www.ivansondrini.com")
	void WebOfRecord1959() {
		assertEquals("http://www.ivansondrini.com", customers.get(1958).getWeb());
	}
}
