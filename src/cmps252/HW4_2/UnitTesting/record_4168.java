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

@Tag("22")
class Record_4168 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4168: FirstName is Dwain")
	void FirstNameOfRecord4168() {
		assertEquals("Dwain", customers.get(4167).getFirstName());
	}

	@Test
	@DisplayName("Record 4168: LastName is Dicola")
	void LastNameOfRecord4168() {
		assertEquals("Dicola", customers.get(4167).getLastName());
	}

	@Test
	@DisplayName("Record 4168: Company is Heck Office Equipment Inc")
	void CompanyOfRecord4168() {
		assertEquals("Heck Office Equipment Inc", customers.get(4167).getCompany());
	}

	@Test
	@DisplayName("Record 4168: Address is 1615 Hickory Ln")
	void AddressOfRecord4168() {
		assertEquals("1615 Hickory Ln", customers.get(4167).getAddress());
	}

	@Test
	@DisplayName("Record 4168: City is Sedalia")
	void CityOfRecord4168() {
		assertEquals("Sedalia", customers.get(4167).getCity());
	}

	@Test
	@DisplayName("Record 4168: County is Pettis")
	void CountyOfRecord4168() {
		assertEquals("Pettis", customers.get(4167).getCounty());
	}

	@Test
	@DisplayName("Record 4168: State is MO")
	void StateOfRecord4168() {
		assertEquals("MO", customers.get(4167).getState());
	}

	@Test
	@DisplayName("Record 4168: ZIP is 65301")
	void ZIPOfRecord4168() {
		assertEquals("65301", customers.get(4167).getZIP());
	}

	@Test
	@DisplayName("Record 4168: Phone is 660-827-6646")
	void PhoneOfRecord4168() {
		assertEquals("660-827-6646", customers.get(4167).getPhone());
	}

	@Test
	@DisplayName("Record 4168: Fax is 660-827-6483")
	void FaxOfRecord4168() {
		assertEquals("660-827-6483", customers.get(4167).getFax());
	}

	@Test
	@DisplayName("Record 4168: Email is dwain@dicola.com")
	void EmailOfRecord4168() {
		assertEquals("dwain@dicola.com", customers.get(4167).getEmail());
	}

	@Test
	@DisplayName("Record 4168: Web is http://www.dwaindicola.com")
	void WebOfRecord4168() {
		assertEquals("http://www.dwaindicola.com", customers.get(4167).getWeb());
	}
}
