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

@Tag("18")
class Record_74 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 74: FirstName is Alfonzo")
	void FirstNameOfRecord74() {
		assertEquals("Alfonzo", customers.get(73).getFirstName());
	}

	@Test
	@DisplayName("Record 74: LastName is ysermann")
	void LastNameOfRecord74() {
		assertEquals("ysermann", customers.get(73).getLastName());
	}

	@Test
	@DisplayName("Record 74: Company is Resonex")
	void CompanyOfRecord74() {
		assertEquals("Resonex", customers.get(73).getCompany());
	}

	@Test
	@DisplayName("Record 74: Address is 5601 Clinton Dr")
	void AddressOfRecord74() {
		assertEquals("5601 Clinton Dr", customers.get(73).getAddress());
	}

	@Test
	@DisplayName("Record 74: City is Houston")
	void CityOfRecord74() {
		assertEquals("Houston", customers.get(73).getCity());
	}

	@Test
	@DisplayName("Record 74: County is Harris")
	void CountyOfRecord74() {
		assertEquals("Harris", customers.get(73).getCounty());
	}

	@Test
	@DisplayName("Record 74: State is TX")
	void StateOfRecord74() {
		assertEquals("TX", customers.get(73).getState());
	}

	@Test
	@DisplayName("Record 74: ZIP is 77020")
	void ZIPOfRecord74() {
		assertEquals("77020", customers.get(73).getZIP());
	}

	@Test
	@DisplayName("Record 74: Phone is 281-673-2567")
	void PhoneOfRecord74() {
		assertEquals("281-673-2567", customers.get(73).getPhone());
	}

	@Test
	@DisplayName("Record 74: Fax is 281-673-6307")
	void FaxOfRecord74() {
		assertEquals("281-673-6307", customers.get(73).getFax());
	}

	@Test
	@DisplayName("Record 74: Email is alfonzo@ysermann.com")
	void EmailOfRecord74() {
		assertEquals("alfonzo@ysermann.com", customers.get(73).getEmail());
	}

	@Test
	@DisplayName("Record 74: Web is http://www.alfonzoysermann.com")
	void WebOfRecord74() {
		assertEquals("http://www.alfonzoysermann.com", customers.get(73).getWeb());
	}
}
