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

@Tag("46")
class Record_2090 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2090: FirstName is Shane")
	void FirstNameOfRecord2090() {
		assertEquals("Shane", customers.get(2089).getFirstName());
	}

	@Test
	@DisplayName("Record 2090: LastName is Slagter")
	void LastNameOfRecord2090() {
		assertEquals("Slagter", customers.get(2089).getLastName());
	}

	@Test
	@DisplayName("Record 2090: Company is Suddsco Sign Studio Inc")
	void CompanyOfRecord2090() {
		assertEquals("Suddsco Sign Studio Inc", customers.get(2089).getCompany());
	}

	@Test
	@DisplayName("Record 2090: Address is 10126 Rush St")
	void AddressOfRecord2090() {
		assertEquals("10126 Rush St", customers.get(2089).getAddress());
	}

	@Test
	@DisplayName("Record 2090: City is South El Monte")
	void CityOfRecord2090() {
		assertEquals("South El Monte", customers.get(2089).getCity());
	}

	@Test
	@DisplayName("Record 2090: County is Los Angeles")
	void CountyOfRecord2090() {
		assertEquals("Los Angeles", customers.get(2089).getCounty());
	}

	@Test
	@DisplayName("Record 2090: State is CA")
	void StateOfRecord2090() {
		assertEquals("CA", customers.get(2089).getState());
	}

	@Test
	@DisplayName("Record 2090: ZIP is 91733")
	void ZIPOfRecord2090() {
		assertEquals("91733", customers.get(2089).getZIP());
	}

	@Test
	@DisplayName("Record 2090: Phone is 626-575-3232")
	void PhoneOfRecord2090() {
		assertEquals("626-575-3232", customers.get(2089).getPhone());
	}

	@Test
	@DisplayName("Record 2090: Fax is 626-575-1071")
	void FaxOfRecord2090() {
		assertEquals("626-575-1071", customers.get(2089).getFax());
	}

	@Test
	@DisplayName("Record 2090: Email is shane@slagter.com")
	void EmailOfRecord2090() {
		assertEquals("shane@slagter.com", customers.get(2089).getEmail());
	}

	@Test
	@DisplayName("Record 2090: Web is http://www.shaneslagter.com")
	void WebOfRecord2090() {
		assertEquals("http://www.shaneslagter.com", customers.get(2089).getWeb());
	}
}
