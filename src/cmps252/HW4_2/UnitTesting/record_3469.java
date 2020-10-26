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

@Tag("39")
class Record_3469 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3469: FirstName is Jerry")
	void FirstNameOfRecord3469() {
		assertEquals("Jerry", customers.get(3468).getFirstName());
	}

	@Test
	@DisplayName("Record 3469: LastName is Curls")
	void LastNameOfRecord3469() {
		assertEquals("Curls", customers.get(3468).getLastName());
	}

	@Test
	@DisplayName("Record 3469: Company is Dougherty, Patrick J Esq")
	void CompanyOfRecord3469() {
		assertEquals("Dougherty, Patrick J Esq", customers.get(3468).getCompany());
	}

	@Test
	@DisplayName("Record 3469: Address is 5000 Executive Pky")
	void AddressOfRecord3469() {
		assertEquals("5000 Executive Pky", customers.get(3468).getAddress());
	}

	@Test
	@DisplayName("Record 3469: City is San Ramon")
	void CityOfRecord3469() {
		assertEquals("San Ramon", customers.get(3468).getCity());
	}

	@Test
	@DisplayName("Record 3469: County is Contra Costa")
	void CountyOfRecord3469() {
		assertEquals("Contra Costa", customers.get(3468).getCounty());
	}

	@Test
	@DisplayName("Record 3469: State is CA")
	void StateOfRecord3469() {
		assertEquals("CA", customers.get(3468).getState());
	}

	@Test
	@DisplayName("Record 3469: ZIP is 94583")
	void ZIPOfRecord3469() {
		assertEquals("94583", customers.get(3468).getZIP());
	}

	@Test
	@DisplayName("Record 3469: Phone is 925-275-9477")
	void PhoneOfRecord3469() {
		assertEquals("925-275-9477", customers.get(3468).getPhone());
	}

	@Test
	@DisplayName("Record 3469: Fax is 925-275-6157")
	void FaxOfRecord3469() {
		assertEquals("925-275-6157", customers.get(3468).getFax());
	}

	@Test
	@DisplayName("Record 3469: Email is jerry@curls.com")
	void EmailOfRecord3469() {
		assertEquals("jerry@curls.com", customers.get(3468).getEmail());
	}

	@Test
	@DisplayName("Record 3469: Web is http://www.jerrycurls.com")
	void WebOfRecord3469() {
		assertEquals("http://www.jerrycurls.com", customers.get(3468).getWeb());
	}
}
