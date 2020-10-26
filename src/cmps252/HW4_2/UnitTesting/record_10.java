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

@Tag("35")
class Record_10 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 10: FirstName is Tyler")
	void FirstNameOfRecord10() {
		assertEquals("Tyler", customers.get(9).getFirstName());
	}

	@Test
	@DisplayName("Record 10: LastName is Hendershott")
	void LastNameOfRecord10() {
		assertEquals("Hendershott", customers.get(9).getLastName());
	}

	@Test
	@DisplayName("Record 10: Company is Rappaport Herts Cherson")
	void CompanyOfRecord10() {
		assertEquals("Rappaport Herts Cherson", customers.get(9).getCompany());
	}

	@Test
	@DisplayName("Record 10: Address is 3222 Winona Way")
	void AddressOfRecord10() {
		assertEquals("3222 Winona Way", customers.get(9).getAddress());
	}

	@Test
	@DisplayName("Record 10: City is North Highlands")
	void CityOfRecord10() {
		assertEquals("North Highlands", customers.get(9).getCity());
	}

	@Test
	@DisplayName("Record 10: County is Sacramento")
	void CountyOfRecord10() {
		assertEquals("Sacramento", customers.get(9).getCounty());
	}

	@Test
	@DisplayName("Record 10: State is CA")
	void StateOfRecord10() {
		assertEquals("CA", customers.get(9).getState());
	}

	@Test
	@DisplayName("Record 10: ZIP is 95660")
	void ZIPOfRecord10() {
		assertEquals("95660", customers.get(9).getZIP());
	}

	@Test
	@DisplayName("Record 10: Phone is 916-349-5439")
	void PhoneOfRecord10() {
		assertEquals("916-349-5439", customers.get(9).getPhone());
	}

	@Test
	@DisplayName("Record 10: Fax is 916-349-8802")
	void FaxOfRecord10() {
		assertEquals("916-349-8802", customers.get(9).getFax());
	}

	@Test
	@DisplayName("Record 10: Email is tyler@hendershott.com")
	void EmailOfRecord10() {
		assertEquals("tyler@hendershott.com", customers.get(9).getEmail());
	}

	@Test
	@DisplayName("Record 10: Web is http://www.tylerhendershott.com")
	void WebOfRecord10() {
		assertEquals("http://www.tylerhendershott.com", customers.get(9).getWeb());
	}
}
