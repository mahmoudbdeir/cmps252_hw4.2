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

@Tag("45")
class Record_392 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 392: FirstName is Rupert")
	void FirstNameOfRecord392() {
		assertEquals("Rupert", customers.get(391).getFirstName());
	}

	@Test
	@DisplayName("Record 392: LastName is Polnau")
	void LastNameOfRecord392() {
		assertEquals("Polnau", customers.get(391).getLastName());
	}

	@Test
	@DisplayName("Record 392: Company is Hyneman Winery")
	void CompanyOfRecord392() {
		assertEquals("Hyneman Winery", customers.get(391).getCompany());
	}

	@Test
	@DisplayName("Record 392: Address is 213 Empire Ave")
	void AddressOfRecord392() {
		assertEquals("213 Empire Ave", customers.get(391).getAddress());
	}

	@Test
	@DisplayName("Record 392: City is Modesto")
	void CityOfRecord392() {
		assertEquals("Modesto", customers.get(391).getCity());
	}

	@Test
	@DisplayName("Record 392: County is Stanislaus")
	void CountyOfRecord392() {
		assertEquals("Stanislaus", customers.get(391).getCounty());
	}

	@Test
	@DisplayName("Record 392: State is CA")
	void StateOfRecord392() {
		assertEquals("CA", customers.get(391).getState());
	}

	@Test
	@DisplayName("Record 392: ZIP is 95354")
	void ZIPOfRecord392() {
		assertEquals("95354", customers.get(391).getZIP());
	}

	@Test
	@DisplayName("Record 392: Phone is 209-578-7932")
	void PhoneOfRecord392() {
		assertEquals("209-578-7932", customers.get(391).getPhone());
	}

	@Test
	@DisplayName("Record 392: Fax is 209-578-0146")
	void FaxOfRecord392() {
		assertEquals("209-578-0146", customers.get(391).getFax());
	}

	@Test
	@DisplayName("Record 392: Email is rupert@polnau.com")
	void EmailOfRecord392() {
		assertEquals("rupert@polnau.com", customers.get(391).getEmail());
	}

	@Test
	@DisplayName("Record 392: Web is http://www.rupertpolnau.com")
	void WebOfRecord392() {
		assertEquals("http://www.rupertpolnau.com", customers.get(391).getWeb());
	}
}
