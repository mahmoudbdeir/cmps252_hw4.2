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

@Tag("44")
class Record_3343 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3343: FirstName is Viola")
	void FirstNameOfRecord3343() {
		assertEquals("Viola", customers.get(3342).getFirstName());
	}

	@Test
	@DisplayName("Record 3343: LastName is Marr")
	void LastNameOfRecord3343() {
		assertEquals("Marr", customers.get(3342).getLastName());
	}

	@Test
	@DisplayName("Record 3343: Company is Huber & Suhner Inc Wstrn Regl")
	void CompanyOfRecord3343() {
		assertEquals("Huber & Suhner Inc Wstrn Regl", customers.get(3342).getCompany());
	}

	@Test
	@DisplayName("Record 3343: Address is Se Financial")
	void AddressOfRecord3343() {
		assertEquals("Se Financial", customers.get(3342).getAddress());
	}

	@Test
	@DisplayName("Record 3343: City is Miami")
	void CityOfRecord3343() {
		assertEquals("Miami", customers.get(3342).getCity());
	}

	@Test
	@DisplayName("Record 3343: County is Miami-Dade")
	void CountyOfRecord3343() {
		assertEquals("Miami-Dade", customers.get(3342).getCounty());
	}

	@Test
	@DisplayName("Record 3343: State is FL")
	void StateOfRecord3343() {
		assertEquals("FL", customers.get(3342).getState());
	}

	@Test
	@DisplayName("Record 3343: ZIP is 33131")
	void ZIPOfRecord3343() {
		assertEquals("33131", customers.get(3342).getZIP());
	}

	@Test
	@DisplayName("Record 3343: Phone is 305-371-8434")
	void PhoneOfRecord3343() {
		assertEquals("305-371-8434", customers.get(3342).getPhone());
	}

	@Test
	@DisplayName("Record 3343: Fax is 305-371-3632")
	void FaxOfRecord3343() {
		assertEquals("305-371-3632", customers.get(3342).getFax());
	}

	@Test
	@DisplayName("Record 3343: Email is viola@marr.com")
	void EmailOfRecord3343() {
		assertEquals("viola@marr.com", customers.get(3342).getEmail());
	}

	@Test
	@DisplayName("Record 3343: Web is http://www.violamarr.com")
	void WebOfRecord3343() {
		assertEquals("http://www.violamarr.com", customers.get(3342).getWeb());
	}
}
