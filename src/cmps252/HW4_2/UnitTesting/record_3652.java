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

@Tag("32")
class Record_3652 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3652: FirstName is Magdalena")
	void FirstNameOfRecord3652() {
		assertEquals("Magdalena", customers.get(3651).getFirstName());
	}

	@Test
	@DisplayName("Record 3652: LastName is Haper")
	void LastNameOfRecord3652() {
		assertEquals("Haper", customers.get(3651).getLastName());
	}

	@Test
	@DisplayName("Record 3652: Company is Wades Dairy Inc")
	void CompanyOfRecord3652() {
		assertEquals("Wades Dairy Inc", customers.get(3651).getCompany());
	}

	@Test
	@DisplayName("Record 3652: Address is 19 County Line Rd E")
	void AddressOfRecord3652() {
		assertEquals("19 County Line Rd E", customers.get(3651).getAddress());
	}

	@Test
	@DisplayName("Record 3652: City is Lakewood")
	void CityOfRecord3652() {
		assertEquals("Lakewood", customers.get(3651).getCity());
	}

	@Test
	@DisplayName("Record 3652: County is Ocean")
	void CountyOfRecord3652() {
		assertEquals("Ocean", customers.get(3651).getCounty());
	}

	@Test
	@DisplayName("Record 3652: State is NJ")
	void StateOfRecord3652() {
		assertEquals("NJ", customers.get(3651).getState());
	}

	@Test
	@DisplayName("Record 3652: ZIP is 8701")
	void ZIPOfRecord3652() {
		assertEquals("8701", customers.get(3651).getZIP());
	}

	@Test
	@DisplayName("Record 3652: Phone is 732-901-5807")
	void PhoneOfRecord3652() {
		assertEquals("732-901-5807", customers.get(3651).getPhone());
	}

	@Test
	@DisplayName("Record 3652: Fax is 732-901-8029")
	void FaxOfRecord3652() {
		assertEquals("732-901-8029", customers.get(3651).getFax());
	}

	@Test
	@DisplayName("Record 3652: Email is magdalena@haper.com")
	void EmailOfRecord3652() {
		assertEquals("magdalena@haper.com", customers.get(3651).getEmail());
	}

	@Test
	@DisplayName("Record 3652: Web is http://www.magdalenahaper.com")
	void WebOfRecord3652() {
		assertEquals("http://www.magdalenahaper.com", customers.get(3651).getWeb());
	}
}
