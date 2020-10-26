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

@Tag("37")
class Record_116 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 116: FirstName is Annetta")
	void FirstNameOfRecord116() {
		assertEquals("Annetta", customers.get(115).getFirstName());
	}

	@Test
	@DisplayName("Record 116: LastName is Whitt")
	void LastNameOfRecord116() {
		assertEquals("Whitt", customers.get(115).getLastName());
	}

	@Test
	@DisplayName("Record 116: Company is M W Windows")
	void CompanyOfRecord116() {
		assertEquals("M W Windows", customers.get(115).getCompany());
	}

	@Test
	@DisplayName("Record 116: Address is 107 E 27th St")
	void AddressOfRecord116() {
		assertEquals("107 E 27th St", customers.get(115).getAddress());
	}

	@Test
	@DisplayName("Record 116: City is Paterson")
	void CityOfRecord116() {
		assertEquals("Paterson", customers.get(115).getCity());
	}

	@Test
	@DisplayName("Record 116: County is Passaic")
	void CountyOfRecord116() {
		assertEquals("Passaic", customers.get(115).getCounty());
	}

	@Test
	@DisplayName("Record 116: State is NJ")
	void StateOfRecord116() {
		assertEquals("NJ", customers.get(115).getState());
	}

	@Test
	@DisplayName("Record 116: ZIP is 7514")
	void ZIPOfRecord116() {
		assertEquals("7514", customers.get(115).getZIP());
	}

	@Test
	@DisplayName("Record 116: Phone is 973-279-2324")
	void PhoneOfRecord116() {
		assertEquals("973-279-2324", customers.get(115).getPhone());
	}

	@Test
	@DisplayName("Record 116: Fax is 973-279-5645")
	void FaxOfRecord116() {
		assertEquals("973-279-5645", customers.get(115).getFax());
	}

	@Test
	@DisplayName("Record 116: Email is annetta@whitt.com")
	void EmailOfRecord116() {
		assertEquals("annetta@whitt.com", customers.get(115).getEmail());
	}

	@Test
	@DisplayName("Record 116: Web is http://www.annettawhitt.com")
	void WebOfRecord116() {
		assertEquals("http://www.annettawhitt.com", customers.get(115).getWeb());
	}
}
