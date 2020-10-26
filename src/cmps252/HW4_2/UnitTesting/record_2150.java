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
class Record_2150 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2150: FirstName is Winnie")
	void FirstNameOfRecord2150() {
		assertEquals("Winnie", customers.get(2149).getFirstName());
	}

	@Test
	@DisplayName("Record 2150: LastName is Widdison")
	void LastNameOfRecord2150() {
		assertEquals("Widdison", customers.get(2149).getLastName());
	}

	@Test
	@DisplayName("Record 2150: Company is National District Attys Assn")
	void CompanyOfRecord2150() {
		assertEquals("National District Attys Assn", customers.get(2149).getCompany());
	}

	@Test
	@DisplayName("Record 2150: Address is 17 Main St")
	void AddressOfRecord2150() {
		assertEquals("17 Main St", customers.get(2149).getAddress());
	}

	@Test
	@DisplayName("Record 2150: City is Newton")
	void CityOfRecord2150() {
		assertEquals("Newton", customers.get(2149).getCity());
	}

	@Test
	@DisplayName("Record 2150: County is Sussex")
	void CountyOfRecord2150() {
		assertEquals("Sussex", customers.get(2149).getCounty());
	}

	@Test
	@DisplayName("Record 2150: State is NJ")
	void StateOfRecord2150() {
		assertEquals("NJ", customers.get(2149).getState());
	}

	@Test
	@DisplayName("Record 2150: ZIP is 7860")
	void ZIPOfRecord2150() {
		assertEquals("7860", customers.get(2149).getZIP());
	}

	@Test
	@DisplayName("Record 2150: Phone is 973-383-6763")
	void PhoneOfRecord2150() {
		assertEquals("973-383-6763", customers.get(2149).getPhone());
	}

	@Test
	@DisplayName("Record 2150: Fax is 973-383-5234")
	void FaxOfRecord2150() {
		assertEquals("973-383-5234", customers.get(2149).getFax());
	}

	@Test
	@DisplayName("Record 2150: Email is winnie@widdison.com")
	void EmailOfRecord2150() {
		assertEquals("winnie@widdison.com", customers.get(2149).getEmail());
	}

	@Test
	@DisplayName("Record 2150: Web is http://www.winniewiddison.com")
	void WebOfRecord2150() {
		assertEquals("http://www.winniewiddison.com", customers.get(2149).getWeb());
	}
}
