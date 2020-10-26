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

@Tag("36")
class Record_996 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 996: FirstName is Debra")
	void FirstNameOfRecord996() {
		assertEquals("Debra", customers.get(995).getFirstName());
	}

	@Test
	@DisplayName("Record 996: LastName is Vyno")
	void LastNameOfRecord996() {
		assertEquals("Vyno", customers.get(995).getLastName());
	}

	@Test
	@DisplayName("Record 996: Company is Executive Management Renewal")
	void CompanyOfRecord996() {
		assertEquals("Executive Management Renewal", customers.get(995).getCompany());
	}

	@Test
	@DisplayName("Record 996: Address is 600 S Virginia St")
	void AddressOfRecord996() {
		assertEquals("600 S Virginia St", customers.get(995).getAddress());
	}

	@Test
	@DisplayName("Record 996: City is Reno")
	void CityOfRecord996() {
		assertEquals("Reno", customers.get(995).getCity());
	}

	@Test
	@DisplayName("Record 996: County is Washoe")
	void CountyOfRecord996() {
		assertEquals("Washoe", customers.get(995).getCounty());
	}

	@Test
	@DisplayName("Record 996: State is NV")
	void StateOfRecord996() {
		assertEquals("NV", customers.get(995).getState());
	}

	@Test
	@DisplayName("Record 996: ZIP is 89501")
	void ZIPOfRecord996() {
		assertEquals("89501", customers.get(995).getZIP());
	}

	@Test
	@DisplayName("Record 996: Phone is 775-786-6250")
	void PhoneOfRecord996() {
		assertEquals("775-786-6250", customers.get(995).getPhone());
	}

	@Test
	@DisplayName("Record 996: Fax is 775-786-6993")
	void FaxOfRecord996() {
		assertEquals("775-786-6993", customers.get(995).getFax());
	}

	@Test
	@DisplayName("Record 996: Email is debra@vyno.com")
	void EmailOfRecord996() {
		assertEquals("debra@vyno.com", customers.get(995).getEmail());
	}

	@Test
	@DisplayName("Record 996: Web is http://www.debravyno.com")
	void WebOfRecord996() {
		assertEquals("http://www.debravyno.com", customers.get(995).getWeb());
	}
}
