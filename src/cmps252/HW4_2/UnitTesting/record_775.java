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

@Tag("49")
class Record_775 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 775: FirstName is Cruz")
	void FirstNameOfRecord775() {
		assertEquals("Cruz", customers.get(774).getFirstName());
	}

	@Test
	@DisplayName("Record 775: LastName is Cragle")
	void LastNameOfRecord775() {
		assertEquals("Cragle", customers.get(774).getLastName());
	}

	@Test
	@DisplayName("Record 775: Company is Wilco Properties Inc")
	void CompanyOfRecord775() {
		assertEquals("Wilco Properties Inc", customers.get(774).getCompany());
	}

	@Test
	@DisplayName("Record 775: Address is 5001 W Fullerton Ave")
	void AddressOfRecord775() {
		assertEquals("5001 W Fullerton Ave", customers.get(774).getAddress());
	}

	@Test
	@DisplayName("Record 775: City is Chicago")
	void CityOfRecord775() {
		assertEquals("Chicago", customers.get(774).getCity());
	}

	@Test
	@DisplayName("Record 775: County is Cook")
	void CountyOfRecord775() {
		assertEquals("Cook", customers.get(774).getCounty());
	}

	@Test
	@DisplayName("Record 775: State is IL")
	void StateOfRecord775() {
		assertEquals("IL", customers.get(774).getState());
	}

	@Test
	@DisplayName("Record 775: ZIP is 60639")
	void ZIPOfRecord775() {
		assertEquals("60639", customers.get(774).getZIP());
	}

	@Test
	@DisplayName("Record 775: Phone is 773-622-2854")
	void PhoneOfRecord775() {
		assertEquals("773-622-2854", customers.get(774).getPhone());
	}

	@Test
	@DisplayName("Record 775: Fax is 773-622-5592")
	void FaxOfRecord775() {
		assertEquals("773-622-5592", customers.get(774).getFax());
	}

	@Test
	@DisplayName("Record 775: Email is cruz@cragle.com")
	void EmailOfRecord775() {
		assertEquals("cruz@cragle.com", customers.get(774).getEmail());
	}

	@Test
	@DisplayName("Record 775: Web is http://www.cruzcragle.com")
	void WebOfRecord775() {
		assertEquals("http://www.cruzcragle.com", customers.get(774).getWeb());
	}
}
