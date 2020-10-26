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

@Tag("27")
class Record_4118 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4118: FirstName is Lilia")
	void FirstNameOfRecord4118() {
		assertEquals("Lilia", customers.get(4117).getFirstName());
	}

	@Test
	@DisplayName("Record 4118: LastName is Schwynberg")
	void LastNameOfRecord4118() {
		assertEquals("Schwynberg", customers.get(4117).getLastName());
	}

	@Test
	@DisplayName("Record 4118: Company is First Federal Savings Bank")
	void CompanyOfRecord4118() {
		assertEquals("First Federal Savings Bank", customers.get(4117).getCompany());
	}

	@Test
	@DisplayName("Record 4118: Address is 30 Oakwood Ave")
	void AddressOfRecord4118() {
		assertEquals("30 Oakwood Ave", customers.get(4117).getAddress());
	}

	@Test
	@DisplayName("Record 4118: City is Norwalk")
	void CityOfRecord4118() {
		assertEquals("Norwalk", customers.get(4117).getCity());
	}

	@Test
	@DisplayName("Record 4118: County is Fairfield")
	void CountyOfRecord4118() {
		assertEquals("Fairfield", customers.get(4117).getCounty());
	}

	@Test
	@DisplayName("Record 4118: State is CT")
	void StateOfRecord4118() {
		assertEquals("CT", customers.get(4117).getState());
	}

	@Test
	@DisplayName("Record 4118: ZIP is 6850")
	void ZIPOfRecord4118() {
		assertEquals("6850", customers.get(4117).getZIP());
	}

	@Test
	@DisplayName("Record 4118: Phone is 203-853-3599")
	void PhoneOfRecord4118() {
		assertEquals("203-853-3599", customers.get(4117).getPhone());
	}

	@Test
	@DisplayName("Record 4118: Fax is 203-853-0801")
	void FaxOfRecord4118() {
		assertEquals("203-853-0801", customers.get(4117).getFax());
	}

	@Test
	@DisplayName("Record 4118: Email is lilia@schwynberg.com")
	void EmailOfRecord4118() {
		assertEquals("lilia@schwynberg.com", customers.get(4117).getEmail());
	}

	@Test
	@DisplayName("Record 4118: Web is http://www.liliaschwynberg.com")
	void WebOfRecord4118() {
		assertEquals("http://www.liliaschwynberg.com", customers.get(4117).getWeb());
	}
}
