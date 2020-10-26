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

@Tag("8")
class Record_320 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 320: FirstName is Cara")
	void FirstNameOfRecord320() {
		assertEquals("Cara", customers.get(319).getFirstName());
	}

	@Test
	@DisplayName("Record 320: LastName is Ryse")
	void LastNameOfRecord320() {
		assertEquals("Ryse", customers.get(319).getLastName());
	}

	@Test
	@DisplayName("Record 320: Company is Gs Industries Inc")
	void CompanyOfRecord320() {
		assertEquals("Gs Industries Inc", customers.get(319).getCompany());
	}

	@Test
	@DisplayName("Record 320: Address is 2 Municipal Rd")
	void AddressOfRecord320() {
		assertEquals("2 Municipal Rd", customers.get(319).getAddress());
	}

	@Test
	@DisplayName("Record 320: City is Newton")
	void CityOfRecord320() {
		assertEquals("Newton", customers.get(319).getCity());
	}

	@Test
	@DisplayName("Record 320: County is Sussex")
	void CountyOfRecord320() {
		assertEquals("Sussex", customers.get(319).getCounty());
	}

	@Test
	@DisplayName("Record 320: State is NJ")
	void StateOfRecord320() {
		assertEquals("NJ", customers.get(319).getState());
	}

	@Test
	@DisplayName("Record 320: ZIP is 7860")
	void ZIPOfRecord320() {
		assertEquals("7860", customers.get(319).getZIP());
	}

	@Test
	@DisplayName("Record 320: Phone is 973-383-2528")
	void PhoneOfRecord320() {
		assertEquals("973-383-2528", customers.get(319).getPhone());
	}

	@Test
	@DisplayName("Record 320: Fax is 973-383-7235")
	void FaxOfRecord320() {
		assertEquals("973-383-7235", customers.get(319).getFax());
	}

	@Test
	@DisplayName("Record 320: Email is cara@ryse.com")
	void EmailOfRecord320() {
		assertEquals("cara@ryse.com", customers.get(319).getEmail());
	}

	@Test
	@DisplayName("Record 320: Web is http://www.cararyse.com")
	void WebOfRecord320() {
		assertEquals("http://www.cararyse.com", customers.get(319).getWeb());
	}
}
