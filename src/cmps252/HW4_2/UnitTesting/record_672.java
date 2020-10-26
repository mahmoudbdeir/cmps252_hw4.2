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
class Record_672 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 672: FirstName is Davis")
	void FirstNameOfRecord672() {
		assertEquals("Davis", customers.get(671).getFirstName());
	}

	@Test
	@DisplayName("Record 672: LastName is Lotti")
	void LastNameOfRecord672() {
		assertEquals("Lotti", customers.get(671).getLastName());
	}

	@Test
	@DisplayName("Record 672: Company is Stout & Winterbottom")
	void CompanyOfRecord672() {
		assertEquals("Stout & Winterbottom", customers.get(671).getCompany());
	}

	@Test
	@DisplayName("Record 672: Address is 2168 Mentor Ave")
	void AddressOfRecord672() {
		assertEquals("2168 Mentor Ave", customers.get(671).getAddress());
	}

	@Test
	@DisplayName("Record 672: City is Painesville")
	void CityOfRecord672() {
		assertEquals("Painesville", customers.get(671).getCity());
	}

	@Test
	@DisplayName("Record 672: County is Lake")
	void CountyOfRecord672() {
		assertEquals("Lake", customers.get(671).getCounty());
	}

	@Test
	@DisplayName("Record 672: State is OH")
	void StateOfRecord672() {
		assertEquals("OH", customers.get(671).getState());
	}

	@Test
	@DisplayName("Record 672: ZIP is 44077")
	void ZIPOfRecord672() {
		assertEquals("44077", customers.get(671).getZIP());
	}

	@Test
	@DisplayName("Record 672: Phone is 440-639-4741")
	void PhoneOfRecord672() {
		assertEquals("440-639-4741", customers.get(671).getPhone());
	}

	@Test
	@DisplayName("Record 672: Fax is 440-639-0991")
	void FaxOfRecord672() {
		assertEquals("440-639-0991", customers.get(671).getFax());
	}

	@Test
	@DisplayName("Record 672: Email is davis@lotti.com")
	void EmailOfRecord672() {
		assertEquals("davis@lotti.com", customers.get(671).getEmail());
	}

	@Test
	@DisplayName("Record 672: Web is http://www.davislotti.com")
	void WebOfRecord672() {
		assertEquals("http://www.davislotti.com", customers.get(671).getWeb());
	}
}
