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

@Tag("24")
class Record_2123 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2123: FirstName is Alec")
	void FirstNameOfRecord2123() {
		assertEquals("Alec", customers.get(2122).getFirstName());
	}

	@Test
	@DisplayName("Record 2123: LastName is Conzemius")
	void LastNameOfRecord2123() {
		assertEquals("Conzemius", customers.get(2122).getLastName());
	}

	@Test
	@DisplayName("Record 2123: Company is Builders Supply Company Inc")
	void CompanyOfRecord2123() {
		assertEquals("Builders Supply Company Inc", customers.get(2122).getCompany());
	}

	@Test
	@DisplayName("Record 2123: Address is 4241 E Clinton Ave")
	void AddressOfRecord2123() {
		assertEquals("4241 E Clinton Ave", customers.get(2122).getAddress());
	}

	@Test
	@DisplayName("Record 2123: City is Fresno")
	void CityOfRecord2123() {
		assertEquals("Fresno", customers.get(2122).getCity());
	}

	@Test
	@DisplayName("Record 2123: County is Fresno")
	void CountyOfRecord2123() {
		assertEquals("Fresno", customers.get(2122).getCounty());
	}

	@Test
	@DisplayName("Record 2123: State is CA")
	void StateOfRecord2123() {
		assertEquals("CA", customers.get(2122).getState());
	}

	@Test
	@DisplayName("Record 2123: ZIP is 93703")
	void ZIPOfRecord2123() {
		assertEquals("93703", customers.get(2122).getZIP());
	}

	@Test
	@DisplayName("Record 2123: Phone is 559-221-3977")
	void PhoneOfRecord2123() {
		assertEquals("559-221-3977", customers.get(2122).getPhone());
	}

	@Test
	@DisplayName("Record 2123: Fax is 559-221-3839")
	void FaxOfRecord2123() {
		assertEquals("559-221-3839", customers.get(2122).getFax());
	}

	@Test
	@DisplayName("Record 2123: Email is alec@conzemius.com")
	void EmailOfRecord2123() {
		assertEquals("alec@conzemius.com", customers.get(2122).getEmail());
	}

	@Test
	@DisplayName("Record 2123: Web is http://www.alecconzemius.com")
	void WebOfRecord2123() {
		assertEquals("http://www.alecconzemius.com", customers.get(2122).getWeb());
	}
}
