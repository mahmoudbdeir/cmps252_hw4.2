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

@Tag("12")
class Record_3966 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3966: FirstName is Wm")
	void FirstNameOfRecord3966() {
		assertEquals("Wm", customers.get(3965).getFirstName());
	}

	@Test
	@DisplayName("Record 3966: LastName is Ganther")
	void LastNameOfRecord3966() {
		assertEquals("Ganther", customers.get(3965).getLastName());
	}

	@Test
	@DisplayName("Record 3966: Company is Leagre, Richard M Esq")
	void CompanyOfRecord3966() {
		assertEquals("Leagre, Richard M Esq", customers.get(3965).getCompany());
	}

	@Test
	@DisplayName("Record 3966: Address is 115 S 2nd St")
	void AddressOfRecord3966() {
		assertEquals("115 S 2nd St", customers.get(3965).getAddress());
	}

	@Test
	@DisplayName("Record 3966: City is Selmer")
	void CityOfRecord3966() {
		assertEquals("Selmer", customers.get(3965).getCity());
	}

	@Test
	@DisplayName("Record 3966: County is McNairy")
	void CountyOfRecord3966() {
		assertEquals("McNairy", customers.get(3965).getCounty());
	}

	@Test
	@DisplayName("Record 3966: State is TN")
	void StateOfRecord3966() {
		assertEquals("TN", customers.get(3965).getState());
	}

	@Test
	@DisplayName("Record 3966: ZIP is 38375")
	void ZIPOfRecord3966() {
		assertEquals("38375", customers.get(3965).getZIP());
	}

	@Test
	@DisplayName("Record 3966: Phone is 731-645-9925")
	void PhoneOfRecord3966() {
		assertEquals("731-645-9925", customers.get(3965).getPhone());
	}

	@Test
	@DisplayName("Record 3966: Fax is 731-645-6293")
	void FaxOfRecord3966() {
		assertEquals("731-645-6293", customers.get(3965).getFax());
	}

	@Test
	@DisplayName("Record 3966: Email is wm@ganther.com")
	void EmailOfRecord3966() {
		assertEquals("wm@ganther.com", customers.get(3965).getEmail());
	}

	@Test
	@DisplayName("Record 3966: Web is http://www.wmganther.com")
	void WebOfRecord3966() {
		assertEquals("http://www.wmganther.com", customers.get(3965).getWeb());
	}
}
