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
class Record_4142 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4142: FirstName is Ronda")
	void FirstNameOfRecord4142() {
		assertEquals("Ronda", customers.get(4141).getFirstName());
	}

	@Test
	@DisplayName("Record 4142: LastName is Laitinen")
	void LastNameOfRecord4142() {
		assertEquals("Laitinen", customers.get(4141).getLastName());
	}

	@Test
	@DisplayName("Record 4142: Company is Russo & Atlas")
	void CompanyOfRecord4142() {
		assertEquals("Russo & Atlas", customers.get(4141).getCompany());
	}

	@Test
	@DisplayName("Record 4142: Address is 1920 Mcgilchrist St Se")
	void AddressOfRecord4142() {
		assertEquals("1920 Mcgilchrist St Se", customers.get(4141).getAddress());
	}

	@Test
	@DisplayName("Record 4142: City is Salem")
	void CityOfRecord4142() {
		assertEquals("Salem", customers.get(4141).getCity());
	}

	@Test
	@DisplayName("Record 4142: County is Marion")
	void CountyOfRecord4142() {
		assertEquals("Marion", customers.get(4141).getCounty());
	}

	@Test
	@DisplayName("Record 4142: State is OR")
	void StateOfRecord4142() {
		assertEquals("OR", customers.get(4141).getState());
	}

	@Test
	@DisplayName("Record 4142: ZIP is 97302")
	void ZIPOfRecord4142() {
		assertEquals("97302", customers.get(4141).getZIP());
	}

	@Test
	@DisplayName("Record 4142: Phone is 503-588-2786")
	void PhoneOfRecord4142() {
		assertEquals("503-588-2786", customers.get(4141).getPhone());
	}

	@Test
	@DisplayName("Record 4142: Fax is 503-588-4447")
	void FaxOfRecord4142() {
		assertEquals("503-588-4447", customers.get(4141).getFax());
	}

	@Test
	@DisplayName("Record 4142: Email is ronda@laitinen.com")
	void EmailOfRecord4142() {
		assertEquals("ronda@laitinen.com", customers.get(4141).getEmail());
	}

	@Test
	@DisplayName("Record 4142: Web is http://www.rondalaitinen.com")
	void WebOfRecord4142() {
		assertEquals("http://www.rondalaitinen.com", customers.get(4141).getWeb());
	}
}
