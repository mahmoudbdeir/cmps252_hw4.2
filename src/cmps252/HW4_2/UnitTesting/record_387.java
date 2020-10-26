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

@Tag("10")
class Record_387 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 387: FirstName is Leandro")
	void FirstNameOfRecord387() {
		assertEquals("Leandro", customers.get(386).getFirstName());
	}

	@Test
	@DisplayName("Record 387: LastName is Chowansky")
	void LastNameOfRecord387() {
		assertEquals("Chowansky", customers.get(386).getLastName());
	}

	@Test
	@DisplayName("Record 387: Company is C West Sales Division Pozacorp")
	void CompanyOfRecord387() {
		assertEquals("C West Sales Division Pozacorp", customers.get(386).getCompany());
	}

	@Test
	@DisplayName("Record 387: Address is Broad")
	void AddressOfRecord387() {
		assertEquals("Broad", customers.get(386).getAddress());
	}

	@Test
	@DisplayName("Record 387: City is Paulsboro")
	void CityOfRecord387() {
		assertEquals("Paulsboro", customers.get(386).getCity());
	}

	@Test
	@DisplayName("Record 387: County is Gloucester")
	void CountyOfRecord387() {
		assertEquals("Gloucester", customers.get(386).getCounty());
	}

	@Test
	@DisplayName("Record 387: State is NJ")
	void StateOfRecord387() {
		assertEquals("NJ", customers.get(386).getState());
	}

	@Test
	@DisplayName("Record 387: ZIP is 8066")
	void ZIPOfRecord387() {
		assertEquals("8066", customers.get(386).getZIP());
	}

	@Test
	@DisplayName("Record 387: Phone is 856-423-7847")
	void PhoneOfRecord387() {
		assertEquals("856-423-7847", customers.get(386).getPhone());
	}

	@Test
	@DisplayName("Record 387: Fax is 856-423-5387")
	void FaxOfRecord387() {
		assertEquals("856-423-5387", customers.get(386).getFax());
	}

	@Test
	@DisplayName("Record 387: Email is leandro@chowansky.com")
	void EmailOfRecord387() {
		assertEquals("leandro@chowansky.com", customers.get(386).getEmail());
	}

	@Test
	@DisplayName("Record 387: Web is http://www.leandrochowansky.com")
	void WebOfRecord387() {
		assertEquals("http://www.leandrochowansky.com", customers.get(386).getWeb());
	}
}
