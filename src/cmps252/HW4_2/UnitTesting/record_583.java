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

@Tag("36")
class Record_583 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 583: FirstName is Sasha")
	void FirstNameOfRecord583() {
		assertEquals("Sasha", customers.get(582).getFirstName());
	}

	@Test
	@DisplayName("Record 583: LastName is Aston")
	void LastNameOfRecord583() {
		assertEquals("Aston", customers.get(582).getLastName());
	}

	@Test
	@DisplayName("Record 583: Company is Ivy Home Infusions")
	void CompanyOfRecord583() {
		assertEquals("Ivy Home Infusions", customers.get(582).getCompany());
	}

	@Test
	@DisplayName("Record 583: Address is 3933 Spenard Rd")
	void AddressOfRecord583() {
		assertEquals("3933 Spenard Rd", customers.get(582).getAddress());
	}

	@Test
	@DisplayName("Record 583: City is Anchorage")
	void CityOfRecord583() {
		assertEquals("Anchorage", customers.get(582).getCity());
	}

	@Test
	@DisplayName("Record 583: County is Anchorage")
	void CountyOfRecord583() {
		assertEquals("Anchorage", customers.get(582).getCounty());
	}

	@Test
	@DisplayName("Record 583: State is AK")
	void StateOfRecord583() {
		assertEquals("AK", customers.get(582).getState());
	}

	@Test
	@DisplayName("Record 583: ZIP is 99517")
	void ZIPOfRecord583() {
		assertEquals("99517", customers.get(582).getZIP());
	}

	@Test
	@DisplayName("Record 583: Phone is 907-243-3425")
	void PhoneOfRecord583() {
		assertEquals("907-243-3425", customers.get(582).getPhone());
	}

	@Test
	@DisplayName("Record 583: Fax is 907-243-7133")
	void FaxOfRecord583() {
		assertEquals("907-243-7133", customers.get(582).getFax());
	}

	@Test
	@DisplayName("Record 583: Email is sasha@aston.com")
	void EmailOfRecord583() {
		assertEquals("sasha@aston.com", customers.get(582).getEmail());
	}

	@Test
	@DisplayName("Record 583: Web is http://www.sashaaston.com")
	void WebOfRecord583() {
		assertEquals("http://www.sashaaston.com", customers.get(582).getWeb());
	}
}
