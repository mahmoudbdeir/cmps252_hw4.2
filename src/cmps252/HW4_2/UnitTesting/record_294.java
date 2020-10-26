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

@Tag("3")
class Record_294 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 294: FirstName is Adan")
	void FirstNameOfRecord294() {
		assertEquals("Adan", customers.get(293).getFirstName());
	}

	@Test
	@DisplayName("Record 294: LastName is Debenedetto")
	void LastNameOfRecord294() {
		assertEquals("Debenedetto", customers.get(293).getLastName());
	}

	@Test
	@DisplayName("Record 294: Company is Sign Arts")
	void CompanyOfRecord294() {
		assertEquals("Sign Arts", customers.get(293).getCompany());
	}

	@Test
	@DisplayName("Record 294: Address is 1640 Nyl Armstrong St")
	void AddressOfRecord294() {
		assertEquals("1640 Nyl Armstrong St", customers.get(293).getAddress());
	}

	@Test
	@DisplayName("Record 294: City is Montebello")
	void CityOfRecord294() {
		assertEquals("Montebello", customers.get(293).getCity());
	}

	@Test
	@DisplayName("Record 294: County is Los Angeles")
	void CountyOfRecord294() {
		assertEquals("Los Angeles", customers.get(293).getCounty());
	}

	@Test
	@DisplayName("Record 294: State is CA")
	void StateOfRecord294() {
		assertEquals("CA", customers.get(293).getState());
	}

	@Test
	@DisplayName("Record 294: ZIP is 90640")
	void ZIPOfRecord294() {
		assertEquals("90640", customers.get(293).getZIP());
	}

	@Test
	@DisplayName("Record 294: Phone is 323-888-3385")
	void PhoneOfRecord294() {
		assertEquals("323-888-3385", customers.get(293).getPhone());
	}

	@Test
	@DisplayName("Record 294: Fax is 323-888-0106")
	void FaxOfRecord294() {
		assertEquals("323-888-0106", customers.get(293).getFax());
	}

	@Test
	@DisplayName("Record 294: Email is adan@debenedetto.com")
	void EmailOfRecord294() {
		assertEquals("adan@debenedetto.com", customers.get(293).getEmail());
	}

	@Test
	@DisplayName("Record 294: Web is http://www.adandebenedetto.com")
	void WebOfRecord294() {
		assertEquals("http://www.adandebenedetto.com", customers.get(293).getWeb());
	}
}
