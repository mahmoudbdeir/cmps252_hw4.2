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

@Tag("13")
class Record_2491 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2491: FirstName is Garland")
	void FirstNameOfRecord2491() {
		assertEquals("Garland", customers.get(2490).getFirstName());
	}

	@Test
	@DisplayName("Record 2491: LastName is Lamorgese")
	void LastNameOfRecord2491() {
		assertEquals("Lamorgese", customers.get(2490).getLastName());
	}

	@Test
	@DisplayName("Record 2491: Company is Lambos, Constantine P Esq")
	void CompanyOfRecord2491() {
		assertEquals("Lambos, Constantine P Esq", customers.get(2490).getCompany());
	}

	@Test
	@DisplayName("Record 2491: Address is 310 Pinehurst St")
	void AddressOfRecord2491() {
		assertEquals("310 Pinehurst St", customers.get(2490).getAddress());
	}

	@Test
	@DisplayName("Record 2491: City is Lafayette")
	void CityOfRecord2491() {
		assertEquals("Lafayette", customers.get(2490).getCity());
	}

	@Test
	@DisplayName("Record 2491: County is Lafayette")
	void CountyOfRecord2491() {
		assertEquals("Lafayette", customers.get(2490).getCounty());
	}

	@Test
	@DisplayName("Record 2491: State is LA")
	void StateOfRecord2491() {
		assertEquals("LA", customers.get(2490).getState());
	}

	@Test
	@DisplayName("Record 2491: ZIP is 70508")
	void ZIPOfRecord2491() {
		assertEquals("70508", customers.get(2490).getZIP());
	}

	@Test
	@DisplayName("Record 2491: Phone is 337-234-5882")
	void PhoneOfRecord2491() {
		assertEquals("337-234-5882", customers.get(2490).getPhone());
	}

	@Test
	@DisplayName("Record 2491: Fax is 337-234-9226")
	void FaxOfRecord2491() {
		assertEquals("337-234-9226", customers.get(2490).getFax());
	}

	@Test
	@DisplayName("Record 2491: Email is garland@lamorgese.com")
	void EmailOfRecord2491() {
		assertEquals("garland@lamorgese.com", customers.get(2490).getEmail());
	}

	@Test
	@DisplayName("Record 2491: Web is http://www.garlandlamorgese.com")
	void WebOfRecord2491() {
		assertEquals("http://www.garlandlamorgese.com", customers.get(2490).getWeb());
	}
}
