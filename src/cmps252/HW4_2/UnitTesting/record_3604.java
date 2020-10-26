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

@Tag("34")
class Record_3604 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3604: FirstName is Tim")
	void FirstNameOfRecord3604() {
		assertEquals("Tim", customers.get(3603).getFirstName());
	}

	@Test
	@DisplayName("Record 3604: LastName is Pituch")
	void LastNameOfRecord3604() {
		assertEquals("Pituch", customers.get(3603).getLastName());
	}

	@Test
	@DisplayName("Record 3604: Company is Wzmp Fm Z 95")
	void CompanyOfRecord3604() {
		assertEquals("Wzmp Fm Z 95", customers.get(3603).getCompany());
	}

	@Test
	@DisplayName("Record 3604: Address is 509 N 1st St")
	void AddressOfRecord3604() {
		assertEquals("509 N 1st St", customers.get(3603).getAddress());
	}

	@Test
	@DisplayName("Record 3604: City is Olean")
	void CityOfRecord3604() {
		assertEquals("Olean", customers.get(3603).getCity());
	}

	@Test
	@DisplayName("Record 3604: County is Cattaraugus")
	void CountyOfRecord3604() {
		assertEquals("Cattaraugus", customers.get(3603).getCounty());
	}

	@Test
	@DisplayName("Record 3604: State is NY")
	void StateOfRecord3604() {
		assertEquals("NY", customers.get(3603).getState());
	}

	@Test
	@DisplayName("Record 3604: ZIP is 14760")
	void ZIPOfRecord3604() {
		assertEquals("14760", customers.get(3603).getZIP());
	}

	@Test
	@DisplayName("Record 3604: Phone is 716-372-7979")
	void PhoneOfRecord3604() {
		assertEquals("716-372-7979", customers.get(3603).getPhone());
	}

	@Test
	@DisplayName("Record 3604: Fax is 716-372-0834")
	void FaxOfRecord3604() {
		assertEquals("716-372-0834", customers.get(3603).getFax());
	}

	@Test
	@DisplayName("Record 3604: Email is tim@pituch.com")
	void EmailOfRecord3604() {
		assertEquals("tim@pituch.com", customers.get(3603).getEmail());
	}

	@Test
	@DisplayName("Record 3604: Web is http://www.timpituch.com")
	void WebOfRecord3604() {
		assertEquals("http://www.timpituch.com", customers.get(3603).getWeb());
	}
}
