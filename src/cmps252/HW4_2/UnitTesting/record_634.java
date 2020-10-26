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
class Record_634 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 634: FirstName is Wanda")
	void FirstNameOfRecord634() {
		assertEquals("Wanda", customers.get(633).getFirstName());
	}

	@Test
	@DisplayName("Record 634: LastName is Bjorkman")
	void LastNameOfRecord634() {
		assertEquals("Bjorkman", customers.get(633).getLastName());
	}

	@Test
	@DisplayName("Record 634: Company is Art Museum Of Southeast Texas")
	void CompanyOfRecord634() {
		assertEquals("Art Museum Of Southeast Texas", customers.get(633).getCompany());
	}

	@Test
	@DisplayName("Record 634: Address is 251 Price Rd")
	void AddressOfRecord634() {
		assertEquals("251 Price Rd", customers.get(633).getAddress());
	}

	@Test
	@DisplayName("Record 634: City is Lexington")
	void CityOfRecord634() {
		assertEquals("Lexington", customers.get(633).getCity());
	}

	@Test
	@DisplayName("Record 634: County is Fayette")
	void CountyOfRecord634() {
		assertEquals("Fayette", customers.get(633).getCounty());
	}

	@Test
	@DisplayName("Record 634: State is KY")
	void StateOfRecord634() {
		assertEquals("KY", customers.get(633).getState());
	}

	@Test
	@DisplayName("Record 634: ZIP is 40511")
	void ZIPOfRecord634() {
		assertEquals("40511", customers.get(633).getZIP());
	}

	@Test
	@DisplayName("Record 634: Phone is 859-226-5211")
	void PhoneOfRecord634() {
		assertEquals("859-226-5211", customers.get(633).getPhone());
	}

	@Test
	@DisplayName("Record 634: Fax is 859-226-7438")
	void FaxOfRecord634() {
		assertEquals("859-226-7438", customers.get(633).getFax());
	}

	@Test
	@DisplayName("Record 634: Email is wanda@bjorkman.com")
	void EmailOfRecord634() {
		assertEquals("wanda@bjorkman.com", customers.get(633).getEmail());
	}

	@Test
	@DisplayName("Record 634: Web is http://www.wandabjorkman.com")
	void WebOfRecord634() {
		assertEquals("http://www.wandabjorkman.com", customers.get(633).getWeb());
	}
}
