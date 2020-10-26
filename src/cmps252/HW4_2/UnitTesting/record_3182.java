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
class Record_3182 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3182: FirstName is Dessie")
	void FirstNameOfRecord3182() {
		assertEquals("Dessie", customers.get(3181).getFirstName());
	}

	@Test
	@DisplayName("Record 3182: LastName is Bridgmon")
	void LastNameOfRecord3182() {
		assertEquals("Bridgmon", customers.get(3181).getLastName());
	}

	@Test
	@DisplayName("Record 3182: Company is Mastromonaco, Leonard P Esq")
	void CompanyOfRecord3182() {
		assertEquals("Mastromonaco, Leonard P Esq", customers.get(3181).getCompany());
	}

	@Test
	@DisplayName("Record 3182: Address is 180 Mill Rd")
	void AddressOfRecord3182() {
		assertEquals("180 Mill Rd", customers.get(3181).getAddress());
	}

	@Test
	@DisplayName("Record 3182: City is Edison")
	void CityOfRecord3182() {
		assertEquals("Edison", customers.get(3181).getCity());
	}

	@Test
	@DisplayName("Record 3182: County is Middlesex")
	void CountyOfRecord3182() {
		assertEquals("Middlesex", customers.get(3181).getCounty());
	}

	@Test
	@DisplayName("Record 3182: State is NJ")
	void StateOfRecord3182() {
		assertEquals("NJ", customers.get(3181).getState());
	}

	@Test
	@DisplayName("Record 3182: ZIP is 8817")
	void ZIPOfRecord3182() {
		assertEquals("8817", customers.get(3181).getZIP());
	}

	@Test
	@DisplayName("Record 3182: Phone is 732-287-2737")
	void PhoneOfRecord3182() {
		assertEquals("732-287-2737", customers.get(3181).getPhone());
	}

	@Test
	@DisplayName("Record 3182: Fax is 732-287-0969")
	void FaxOfRecord3182() {
		assertEquals("732-287-0969", customers.get(3181).getFax());
	}

	@Test
	@DisplayName("Record 3182: Email is dessie@bridgmon.com")
	void EmailOfRecord3182() {
		assertEquals("dessie@bridgmon.com", customers.get(3181).getEmail());
	}

	@Test
	@DisplayName("Record 3182: Web is http://www.dessiebridgmon.com")
	void WebOfRecord3182() {
		assertEquals("http://www.dessiebridgmon.com", customers.get(3181).getWeb());
	}
}
