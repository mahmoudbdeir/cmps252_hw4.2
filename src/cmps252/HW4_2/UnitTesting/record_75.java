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

@Tag("14")
class Record_75 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 75: FirstName is Kysha")
	void FirstNameOfRecord75() {
		assertEquals("Kysha", customers.get(74).getFirstName());
	}

	@Test
	@DisplayName("Record 75: LastName is Frett")
	void LastNameOfRecord75() {
		assertEquals("Frett", customers.get(74).getLastName());
	}

	@Test
	@DisplayName("Record 75: Company is Maxey, Douglas C")
	void CompanyOfRecord75() {
		assertEquals("Maxey, Douglas C", customers.get(74).getCompany());
	}

	@Test
	@DisplayName("Record 75: Address is 928 Chgo Ave")
	void AddressOfRecord75() {
		assertEquals("928 Chgo Ave", customers.get(74).getAddress());
	}

	@Test
	@DisplayName("Record 75: City is Evanston")
	void CityOfRecord75() {
		assertEquals("Evanston", customers.get(74).getCity());
	}

	@Test
	@DisplayName("Record 75: County is Cook")
	void CountyOfRecord75() {
		assertEquals("Cook", customers.get(74).getCounty());
	}

	@Test
	@DisplayName("Record 75: State is IL")
	void StateOfRecord75() {
		assertEquals("IL", customers.get(74).getState());
	}

	@Test
	@DisplayName("Record 75: ZIP is 60202")
	void ZIPOfRecord75() {
		assertEquals("60202", customers.get(74).getZIP());
	}

	@Test
	@DisplayName("Record 75: Phone is 847-866-8347")
	void PhoneOfRecord75() {
		assertEquals("847-866-8347", customers.get(74).getPhone());
	}

	@Test
	@DisplayName("Record 75: Fax is 847-866-7786")
	void FaxOfRecord75() {
		assertEquals("847-866-7786", customers.get(74).getFax());
	}

	@Test
	@DisplayName("Record 75: Email is kysha@frett.com")
	void EmailOfRecord75() {
		assertEquals("kysha@frett.com", customers.get(74).getEmail());
	}

	@Test
	@DisplayName("Record 75: Web is http://www.kyshafrett.com")
	void WebOfRecord75() {
		assertEquals("http://www.kyshafrett.com", customers.get(74).getWeb());
	}
}
