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

@Tag("0")
class Record_119 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 119: FirstName is Felecia")
	void FirstNameOfRecord119() {
		assertEquals("Felecia", customers.get(118).getFirstName());
	}

	@Test
	@DisplayName("Record 119: LastName is Stoklasa")
	void LastNameOfRecord119() {
		assertEquals("Stoklasa", customers.get(118).getLastName());
	}

	@Test
	@DisplayName("Record 119: Company is Adams, Jeffrey M Esq")
	void CompanyOfRecord119() {
		assertEquals("Adams, Jeffrey M Esq", customers.get(118).getCompany());
	}

	@Test
	@DisplayName("Record 119: Address is 12 N Main St")
	void AddressOfRecord119() {
		assertEquals("12 N Main St", customers.get(118).getAddress());
	}

	@Test
	@DisplayName("Record 119: City is Elmer")
	void CityOfRecord119() {
		assertEquals("Elmer", customers.get(118).getCity());
	}

	@Test
	@DisplayName("Record 119: County is Salem")
	void CountyOfRecord119() {
		assertEquals("Salem", customers.get(118).getCounty());
	}

	@Test
	@DisplayName("Record 119: State is NJ")
	void StateOfRecord119() {
		assertEquals("NJ", customers.get(118).getState());
	}

	@Test
	@DisplayName("Record 119: ZIP is 8318")
	void ZIPOfRecord119() {
		assertEquals("8318", customers.get(118).getZIP());
	}

	@Test
	@DisplayName("Record 119: Phone is 856-358-2655")
	void PhoneOfRecord119() {
		assertEquals("856-358-2655", customers.get(118).getPhone());
	}

	@Test
	@DisplayName("Record 119: Fax is 856-358-7293")
	void FaxOfRecord119() {
		assertEquals("856-358-7293", customers.get(118).getFax());
	}

	@Test
	@DisplayName("Record 119: Email is felecia@stoklasa.com")
	void EmailOfRecord119() {
		assertEquals("felecia@stoklasa.com", customers.get(118).getEmail());
	}

	@Test
	@DisplayName("Record 119: Web is http://www.feleciastoklasa.com")
	void WebOfRecord119() {
		assertEquals("http://www.feleciastoklasa.com", customers.get(118).getWeb());
	}
}
