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

@Tag("2")
class Record_4120 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4120: FirstName is Hobert")
	void FirstNameOfRecord4120() {
		assertEquals("Hobert", customers.get(4119).getFirstName());
	}

	@Test
	@DisplayName("Record 4120: LastName is Waffenschmidt")
	void LastNameOfRecord4120() {
		assertEquals("Waffenschmidt", customers.get(4119).getLastName());
	}

	@Test
	@DisplayName("Record 4120: Company is Kessler, Robert W Esq")
	void CompanyOfRecord4120() {
		assertEquals("Kessler, Robert W Esq", customers.get(4119).getCompany());
	}

	@Test
	@DisplayName("Record 4120: Address is 1562 Hamilton Ave")
	void AddressOfRecord4120() {
		assertEquals("1562 Hamilton Ave", customers.get(4119).getAddress());
	}

	@Test
	@DisplayName("Record 4120: City is San Jose")
	void CityOfRecord4120() {
		assertEquals("San Jose", customers.get(4119).getCity());
	}

	@Test
	@DisplayName("Record 4120: County is Santa Clara")
	void CountyOfRecord4120() {
		assertEquals("Santa Clara", customers.get(4119).getCounty());
	}

	@Test
	@DisplayName("Record 4120: State is CA")
	void StateOfRecord4120() {
		assertEquals("CA", customers.get(4119).getState());
	}

	@Test
	@DisplayName("Record 4120: ZIP is 95125")
	void ZIPOfRecord4120() {
		assertEquals("95125", customers.get(4119).getZIP());
	}

	@Test
	@DisplayName("Record 4120: Phone is 408-723-8646")
	void PhoneOfRecord4120() {
		assertEquals("408-723-8646", customers.get(4119).getPhone());
	}

	@Test
	@DisplayName("Record 4120: Fax is 408-723-9227")
	void FaxOfRecord4120() {
		assertEquals("408-723-9227", customers.get(4119).getFax());
	}

	@Test
	@DisplayName("Record 4120: Email is hobert@waffenschmidt.com")
	void EmailOfRecord4120() {
		assertEquals("hobert@waffenschmidt.com", customers.get(4119).getEmail());
	}

	@Test
	@DisplayName("Record 4120: Web is http://www.hobertwaffenschmidt.com")
	void WebOfRecord4120() {
		assertEquals("http://www.hobertwaffenschmidt.com", customers.get(4119).getWeb());
	}
}
