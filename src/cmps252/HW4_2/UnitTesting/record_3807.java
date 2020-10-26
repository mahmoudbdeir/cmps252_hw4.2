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

@Tag("38")
class Record_3807 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3807: FirstName is Molly")
	void FirstNameOfRecord3807() {
		assertEquals("Molly", customers.get(3806).getFirstName());
	}

	@Test
	@DisplayName("Record 3807: LastName is Olten")
	void LastNameOfRecord3807() {
		assertEquals("Olten", customers.get(3806).getLastName());
	}

	@Test
	@DisplayName("Record 3807: Company is Vannoy Cox Insurance Agcy Inc")
	void CompanyOfRecord3807() {
		assertEquals("Vannoy Cox Insurance Agcy Inc", customers.get(3806).getCompany());
	}

	@Test
	@DisplayName("Record 3807: Address is 1307 Barstow Ave")
	void AddressOfRecord3807() {
		assertEquals("1307 Barstow Ave", customers.get(3806).getAddress());
	}

	@Test
	@DisplayName("Record 3807: City is Clovis")
	void CityOfRecord3807() {
		assertEquals("Clovis", customers.get(3806).getCity());
	}

	@Test
	@DisplayName("Record 3807: County is Fresno")
	void CountyOfRecord3807() {
		assertEquals("Fresno", customers.get(3806).getCounty());
	}

	@Test
	@DisplayName("Record 3807: State is CA")
	void StateOfRecord3807() {
		assertEquals("CA", customers.get(3806).getState());
	}

	@Test
	@DisplayName("Record 3807: ZIP is 93612")
	void ZIPOfRecord3807() {
		assertEquals("93612", customers.get(3806).getZIP());
	}

	@Test
	@DisplayName("Record 3807: Phone is 559-299-9671")
	void PhoneOfRecord3807() {
		assertEquals("559-299-9671", customers.get(3806).getPhone());
	}

	@Test
	@DisplayName("Record 3807: Fax is 559-299-7246")
	void FaxOfRecord3807() {
		assertEquals("559-299-7246", customers.get(3806).getFax());
	}

	@Test
	@DisplayName("Record 3807: Email is molly@olten.com")
	void EmailOfRecord3807() {
		assertEquals("molly@olten.com", customers.get(3806).getEmail());
	}

	@Test
	@DisplayName("Record 3807: Web is http://www.mollyolten.com")
	void WebOfRecord3807() {
		assertEquals("http://www.mollyolten.com", customers.get(3806).getWeb());
	}
}
