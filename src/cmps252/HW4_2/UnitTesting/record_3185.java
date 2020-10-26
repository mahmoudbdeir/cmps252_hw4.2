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

@Tag("31")
class Record_3185 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3185: FirstName is Elise")
	void FirstNameOfRecord3185() {
		assertEquals("Elise", customers.get(3184).getFirstName());
	}

	@Test
	@DisplayName("Record 3185: LastName is Wehbe")
	void LastNameOfRecord3185() {
		assertEquals("Wehbe", customers.get(3184).getLastName());
	}

	@Test
	@DisplayName("Record 3185: Company is Henderson, Chad E Esq")
	void CompanyOfRecord3185() {
		assertEquals("Henderson, Chad E Esq", customers.get(3184).getCompany());
	}

	@Test
	@DisplayName("Record 3185: Address is 209 Prairie Ave")
	void AddressOfRecord3185() {
		assertEquals("209 Prairie Ave", customers.get(3184).getAddress());
	}

	@Test
	@DisplayName("Record 3185: City is Morgantown")
	void CityOfRecord3185() {
		assertEquals("Morgantown", customers.get(3184).getCity());
	}

	@Test
	@DisplayName("Record 3185: County is Monongalia")
	void CountyOfRecord3185() {
		assertEquals("Monongalia", customers.get(3184).getCounty());
	}

	@Test
	@DisplayName("Record 3185: State is WV")
	void StateOfRecord3185() {
		assertEquals("WV", customers.get(3184).getState());
	}

	@Test
	@DisplayName("Record 3185: ZIP is 26505")
	void ZIPOfRecord3185() {
		assertEquals("26505", customers.get(3184).getZIP());
	}

	@Test
	@DisplayName("Record 3185: Phone is 304-291-8422")
	void PhoneOfRecord3185() {
		assertEquals("304-291-8422", customers.get(3184).getPhone());
	}

	@Test
	@DisplayName("Record 3185: Fax is 304-291-3217")
	void FaxOfRecord3185() {
		assertEquals("304-291-3217", customers.get(3184).getFax());
	}

	@Test
	@DisplayName("Record 3185: Email is elise@wehbe.com")
	void EmailOfRecord3185() {
		assertEquals("elise@wehbe.com", customers.get(3184).getEmail());
	}

	@Test
	@DisplayName("Record 3185: Web is http://www.elisewehbe.com")
	void WebOfRecord3185() {
		assertEquals("http://www.elisewehbe.com", customers.get(3184).getWeb());
	}
}
