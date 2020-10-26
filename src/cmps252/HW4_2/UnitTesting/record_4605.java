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

@Tag("33")
class Record_4605 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4605: FirstName is Douglas")
	void FirstNameOfRecord4605() {
		assertEquals("Douglas", customers.get(4604).getFirstName());
	}

	@Test
	@DisplayName("Record 4605: LastName is Defeo")
	void LastNameOfRecord4605() {
		assertEquals("Defeo", customers.get(4604).getLastName());
	}

	@Test
	@DisplayName("Record 4605: Company is Toyota Industrial Equip Dlr")
	void CompanyOfRecord4605() {
		assertEquals("Toyota Industrial Equip Dlr", customers.get(4604).getCompany());
	}

	@Test
	@DisplayName("Record 4605: Address is 98 Mayfield Ave")
	void AddressOfRecord4605() {
		assertEquals("98 Mayfield Ave", customers.get(4604).getAddress());
	}

	@Test
	@DisplayName("Record 4605: City is Edison")
	void CityOfRecord4605() {
		assertEquals("Edison", customers.get(4604).getCity());
	}

	@Test
	@DisplayName("Record 4605: County is Middlesex")
	void CountyOfRecord4605() {
		assertEquals("Middlesex", customers.get(4604).getCounty());
	}

	@Test
	@DisplayName("Record 4605: State is NJ")
	void StateOfRecord4605() {
		assertEquals("NJ", customers.get(4604).getState());
	}

	@Test
	@DisplayName("Record 4605: ZIP is 8837")
	void ZIPOfRecord4605() {
		assertEquals("8837", customers.get(4604).getZIP());
	}

	@Test
	@DisplayName("Record 4605: Phone is 732-417-2852")
	void PhoneOfRecord4605() {
		assertEquals("732-417-2852", customers.get(4604).getPhone());
	}

	@Test
	@DisplayName("Record 4605: Fax is 732-417-9793")
	void FaxOfRecord4605() {
		assertEquals("732-417-9793", customers.get(4604).getFax());
	}

	@Test
	@DisplayName("Record 4605: Email is douglas@defeo.com")
	void EmailOfRecord4605() {
		assertEquals("douglas@defeo.com", customers.get(4604).getEmail());
	}

	@Test
	@DisplayName("Record 4605: Web is http://www.douglasdefeo.com")
	void WebOfRecord4605() {
		assertEquals("http://www.douglasdefeo.com", customers.get(4604).getWeb());
	}
}
