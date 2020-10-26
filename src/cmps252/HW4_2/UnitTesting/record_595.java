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
class Record_595 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 595: FirstName is Lucio")
	void FirstNameOfRecord595() {
		assertEquals("Lucio", customers.get(594).getFirstName());
	}

	@Test
	@DisplayName("Record 595: LastName is Gifford")
	void LastNameOfRecord595() {
		assertEquals("Gifford", customers.get(594).getLastName());
	}

	@Test
	@DisplayName("Record 595: Company is Therapeutic Tch Massage Thrpy")
	void CompanyOfRecord595() {
		assertEquals("Therapeutic Tch Massage Thrpy", customers.get(594).getCompany());
	}

	@Test
	@DisplayName("Record 595: Address is 1940 Lombard St")
	void AddressOfRecord595() {
		assertEquals("1940 Lombard St", customers.get(594).getAddress());
	}

	@Test
	@DisplayName("Record 595: City is San Francisco")
	void CityOfRecord595() {
		assertEquals("San Francisco", customers.get(594).getCity());
	}

	@Test
	@DisplayName("Record 595: County is San Francisco")
	void CountyOfRecord595() {
		assertEquals("San Francisco", customers.get(594).getCounty());
	}

	@Test
	@DisplayName("Record 595: State is CA")
	void StateOfRecord595() {
		assertEquals("CA", customers.get(594).getState());
	}

	@Test
	@DisplayName("Record 595: ZIP is 94123")
	void ZIPOfRecord595() {
		assertEquals("94123", customers.get(594).getZIP());
	}

	@Test
	@DisplayName("Record 595: Phone is 415-775-4835")
	void PhoneOfRecord595() {
		assertEquals("415-775-4835", customers.get(594).getPhone());
	}

	@Test
	@DisplayName("Record 595: Fax is 415-775-3569")
	void FaxOfRecord595() {
		assertEquals("415-775-3569", customers.get(594).getFax());
	}

	@Test
	@DisplayName("Record 595: Email is lucio@gifford.com")
	void EmailOfRecord595() {
		assertEquals("lucio@gifford.com", customers.get(594).getEmail());
	}

	@Test
	@DisplayName("Record 595: Web is http://www.luciogifford.com")
	void WebOfRecord595() {
		assertEquals("http://www.luciogifford.com", customers.get(594).getWeb());
	}
}
