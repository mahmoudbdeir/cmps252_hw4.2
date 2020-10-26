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

@Tag("23")
class Record_1665 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1665: FirstName is Lavonne")
	void FirstNameOfRecord1665() {
		assertEquals("Lavonne", customers.get(1664).getFirstName());
	}

	@Test
	@DisplayName("Record 1665: LastName is Cisnero")
	void LastNameOfRecord1665() {
		assertEquals("Cisnero", customers.get(1664).getLastName());
	}

	@Test
	@DisplayName("Record 1665: Company is Waters Equipment Co Inc")
	void CompanyOfRecord1665() {
		assertEquals("Waters Equipment Co Inc", customers.get(1664).getCompany());
	}

	@Test
	@DisplayName("Record 1665: Address is 21435 Dequindre Rd")
	void AddressOfRecord1665() {
		assertEquals("21435 Dequindre Rd", customers.get(1664).getAddress());
	}

	@Test
	@DisplayName("Record 1665: City is Hazel Park")
	void CityOfRecord1665() {
		assertEquals("Hazel Park", customers.get(1664).getCity());
	}

	@Test
	@DisplayName("Record 1665: County is Oakland")
	void CountyOfRecord1665() {
		assertEquals("Oakland", customers.get(1664).getCounty());
	}

	@Test
	@DisplayName("Record 1665: State is MI")
	void StateOfRecord1665() {
		assertEquals("MI", customers.get(1664).getState());
	}

	@Test
	@DisplayName("Record 1665: ZIP is 48030")
	void ZIPOfRecord1665() {
		assertEquals("48030", customers.get(1664).getZIP());
	}

	@Test
	@DisplayName("Record 1665: Phone is 248-548-8444")
	void PhoneOfRecord1665() {
		assertEquals("248-548-8444", customers.get(1664).getPhone());
	}

	@Test
	@DisplayName("Record 1665: Fax is 248-548-1108")
	void FaxOfRecord1665() {
		assertEquals("248-548-1108", customers.get(1664).getFax());
	}

	@Test
	@DisplayName("Record 1665: Email is lavonne@cisnero.com")
	void EmailOfRecord1665() {
		assertEquals("lavonne@cisnero.com", customers.get(1664).getEmail());
	}

	@Test
	@DisplayName("Record 1665: Web is http://www.lavonnecisnero.com")
	void WebOfRecord1665() {
		assertEquals("http://www.lavonnecisnero.com", customers.get(1664).getWeb());
	}
}
