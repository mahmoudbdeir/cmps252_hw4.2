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

@Tag("5")
class Record_3324 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3324: FirstName is Ernestina")
	void FirstNameOfRecord3324() {
		assertEquals("Ernestina", customers.get(3323).getFirstName());
	}

	@Test
	@DisplayName("Record 3324: LastName is Dachelet")
	void LastNameOfRecord3324() {
		assertEquals("Dachelet", customers.get(3323).getLastName());
	}

	@Test
	@DisplayName("Record 3324: Company is Cuban American Natl Cncl Inc")
	void CompanyOfRecord3324() {
		assertEquals("Cuban American Natl Cncl Inc", customers.get(3323).getCompany());
	}

	@Test
	@DisplayName("Record 3324: Address is 319 Lennon Ln")
	void AddressOfRecord3324() {
		assertEquals("319 Lennon Ln", customers.get(3323).getAddress());
	}

	@Test
	@DisplayName("Record 3324: City is Walnut Creek")
	void CityOfRecord3324() {
		assertEquals("Walnut Creek", customers.get(3323).getCity());
	}

	@Test
	@DisplayName("Record 3324: County is Contra Costa")
	void CountyOfRecord3324() {
		assertEquals("Contra Costa", customers.get(3323).getCounty());
	}

	@Test
	@DisplayName("Record 3324: State is CA")
	void StateOfRecord3324() {
		assertEquals("CA", customers.get(3323).getState());
	}

	@Test
	@DisplayName("Record 3324: ZIP is 94598")
	void ZIPOfRecord3324() {
		assertEquals("94598", customers.get(3323).getZIP());
	}

	@Test
	@DisplayName("Record 3324: Phone is 925-256-9228")
	void PhoneOfRecord3324() {
		assertEquals("925-256-9228", customers.get(3323).getPhone());
	}

	@Test
	@DisplayName("Record 3324: Fax is 925-256-6162")
	void FaxOfRecord3324() {
		assertEquals("925-256-6162", customers.get(3323).getFax());
	}

	@Test
	@DisplayName("Record 3324: Email is ernestina@dachelet.com")
	void EmailOfRecord3324() {
		assertEquals("ernestina@dachelet.com", customers.get(3323).getEmail());
	}

	@Test
	@DisplayName("Record 3324: Web is http://www.ernestinadachelet.com")
	void WebOfRecord3324() {
		assertEquals("http://www.ernestinadachelet.com", customers.get(3323).getWeb());
	}
}
