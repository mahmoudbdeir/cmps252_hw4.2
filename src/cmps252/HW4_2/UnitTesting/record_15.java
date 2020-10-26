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
class Record_15 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 15: FirstName is Camilla")
	void FirstNameOfRecord15() {
		assertEquals("Camilla", customers.get(14).getFirstName());
	}

	@Test
	@DisplayName("Record 15: LastName is Franz")
	void LastNameOfRecord15() {
		assertEquals("Franz", customers.get(14).getLastName());
	}

	@Test
	@DisplayName("Record 15: Company is Contact")
	void CompanyOfRecord15() {
		assertEquals("Contact", customers.get(14).getCompany());
	}

	@Test
	@DisplayName("Record 15: Address is 2300 N Imperial Ave")
	void AddressOfRecord15() {
		assertEquals("2300 N Imperial Ave", customers.get(14).getAddress());
	}

	@Test
	@DisplayName("Record 15: City is Calexico")
	void CityOfRecord15() {
		assertEquals("Calexico", customers.get(14).getCity());
	}

	@Test
	@DisplayName("Record 15: County is Imperial")
	void CountyOfRecord15() {
		assertEquals("Imperial", customers.get(14).getCounty());
	}

	@Test
	@DisplayName("Record 15: State is CA")
	void StateOfRecord15() {
		assertEquals("CA", customers.get(14).getState());
	}

	@Test
	@DisplayName("Record 15: ZIP is 92231")
	void ZIPOfRecord15() {
		assertEquals("92231", customers.get(14).getZIP());
	}

	@Test
	@DisplayName("Record 15: Phone is 760-357-9630")
	void PhoneOfRecord15() {
		assertEquals("760-357-9630", customers.get(14).getPhone());
	}

	@Test
	@DisplayName("Record 15: Fax is 760-357-6843")
	void FaxOfRecord15() {
		assertEquals("760-357-6843", customers.get(14).getFax());
	}

	@Test
	@DisplayName("Record 15: Email is camilla@franz.com")
	void EmailOfRecord15() {
		assertEquals("camilla@franz.com", customers.get(14).getEmail());
	}

	@Test
	@DisplayName("Record 15: Web is http://www.camillafranz.com")
	void WebOfRecord15() {
		assertEquals("http://www.camillafranz.com", customers.get(14).getWeb());
	}
}
