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

@Tag("42")
class Record_3976 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3976: FirstName is Anton")
	void FirstNameOfRecord3976() {
		assertEquals("Anton", customers.get(3975).getFirstName());
	}

	@Test
	@DisplayName("Record 3976: LastName is Rohrback")
	void LastNameOfRecord3976() {
		assertEquals("Rohrback", customers.get(3975).getLastName());
	}

	@Test
	@DisplayName("Record 3976: Company is Gaskets Inc")
	void CompanyOfRecord3976() {
		assertEquals("Gaskets Inc", customers.get(3975).getCompany());
	}

	@Test
	@DisplayName("Record 3976: Address is 12 Griggs Pl")
	void AddressOfRecord3976() {
		assertEquals("12 Griggs Pl", customers.get(3975).getAddress());
	}

	@Test
	@DisplayName("Record 3976: City is Manville")
	void CityOfRecord3976() {
		assertEquals("Manville", customers.get(3975).getCity());
	}

	@Test
	@DisplayName("Record 3976: County is Somerset")
	void CountyOfRecord3976() {
		assertEquals("Somerset", customers.get(3975).getCounty());
	}

	@Test
	@DisplayName("Record 3976: State is NJ")
	void StateOfRecord3976() {
		assertEquals("NJ", customers.get(3975).getState());
	}

	@Test
	@DisplayName("Record 3976: ZIP is 8835")
	void ZIPOfRecord3976() {
		assertEquals("8835", customers.get(3975).getZIP());
	}

	@Test
	@DisplayName("Record 3976: Phone is 908-526-2085")
	void PhoneOfRecord3976() {
		assertEquals("908-526-2085", customers.get(3975).getPhone());
	}

	@Test
	@DisplayName("Record 3976: Fax is 908-526-8598")
	void FaxOfRecord3976() {
		assertEquals("908-526-8598", customers.get(3975).getFax());
	}

	@Test
	@DisplayName("Record 3976: Email is anton@rohrback.com")
	void EmailOfRecord3976() {
		assertEquals("anton@rohrback.com", customers.get(3975).getEmail());
	}

	@Test
	@DisplayName("Record 3976: Web is http://www.antonrohrback.com")
	void WebOfRecord3976() {
		assertEquals("http://www.antonrohrback.com", customers.get(3975).getWeb());
	}
}
