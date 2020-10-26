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
class Record_947 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 947: FirstName is Tory")
	void FirstNameOfRecord947() {
		assertEquals("Tory", customers.get(946).getFirstName());
	}

	@Test
	@DisplayName("Record 947: LastName is Brookshier")
	void LastNameOfRecord947() {
		assertEquals("Brookshier", customers.get(946).getLastName());
	}

	@Test
	@DisplayName("Record 947: Company is Hampton Inn")
	void CompanyOfRecord947() {
		assertEquals("Hampton Inn", customers.get(946).getCompany());
	}

	@Test
	@DisplayName("Record 947: Address is 117 Grand Ave")
	void AddressOfRecord947() {
		assertEquals("117 Grand Ave", customers.get(946).getAddress());
	}

	@Test
	@DisplayName("Record 947: City is Palisades Park")
	void CityOfRecord947() {
		assertEquals("Palisades Park", customers.get(946).getCity());
	}

	@Test
	@DisplayName("Record 947: County is Bergen")
	void CountyOfRecord947() {
		assertEquals("Bergen", customers.get(946).getCounty());
	}

	@Test
	@DisplayName("Record 947: State is NJ")
	void StateOfRecord947() {
		assertEquals("NJ", customers.get(946).getState());
	}

	@Test
	@DisplayName("Record 947: ZIP is 7650")
	void ZIPOfRecord947() {
		assertEquals("7650", customers.get(946).getZIP());
	}

	@Test
	@DisplayName("Record 947: Phone is 201-944-0514")
	void PhoneOfRecord947() {
		assertEquals("201-944-0514", customers.get(946).getPhone());
	}

	@Test
	@DisplayName("Record 947: Fax is 201-944-8328")
	void FaxOfRecord947() {
		assertEquals("201-944-8328", customers.get(946).getFax());
	}

	@Test
	@DisplayName("Record 947: Email is tory@brookshier.com")
	void EmailOfRecord947() {
		assertEquals("tory@brookshier.com", customers.get(946).getEmail());
	}

	@Test
	@DisplayName("Record 947: Web is http://www.torybrookshier.com")
	void WebOfRecord947() {
		assertEquals("http://www.torybrookshier.com", customers.get(946).getWeb());
	}
}
