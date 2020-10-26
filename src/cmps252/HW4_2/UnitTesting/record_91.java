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

@Tag("25")
class Record_91 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 91: FirstName is Prince")
	void FirstNameOfRecord91() {
		assertEquals("Prince", customers.get(90).getFirstName());
	}

	@Test
	@DisplayName("Record 91: LastName is Kisselburg")
	void LastNameOfRecord91() {
		assertEquals("Kisselburg", customers.get(90).getLastName());
	}

	@Test
	@DisplayName("Record 91: Company is Gilmans Mineral & Lapdry Supl")
	void CompanyOfRecord91() {
		assertEquals("Gilmans Mineral & Lapdry Supl", customers.get(90).getCompany());
	}

	@Test
	@DisplayName("Record 91: Address is 68 Green St")
	void AddressOfRecord91() {
		assertEquals("68 Green St", customers.get(90).getAddress());
	}

	@Test
	@DisplayName("Record 91: City is Warner Robins")
	void CityOfRecord91() {
		assertEquals("Warner Robins", customers.get(90).getCity());
	}

	@Test
	@DisplayName("Record 91: County is Houston")
	void CountyOfRecord91() {
		assertEquals("Houston", customers.get(90).getCounty());
	}

	@Test
	@DisplayName("Record 91: State is GA")
	void StateOfRecord91() {
		assertEquals("GA", customers.get(90).getState());
	}

	@Test
	@DisplayName("Record 91: ZIP is 31093")
	void ZIPOfRecord91() {
		assertEquals("31093", customers.get(90).getZIP());
	}

	@Test
	@DisplayName("Record 91: Phone is 478-866-4984")
	void PhoneOfRecord91() {
		assertEquals("478-866-4984", customers.get(90).getPhone());
	}

	@Test
	@DisplayName("Record 91: Fax is 478-866-3354")
	void FaxOfRecord91() {
		assertEquals("478-866-3354", customers.get(90).getFax());
	}

	@Test
	@DisplayName("Record 91: Email is prince@kisselburg.com")
	void EmailOfRecord91() {
		assertEquals("prince@kisselburg.com", customers.get(90).getEmail());
	}

	@Test
	@DisplayName("Record 91: Web is http://www.princekisselburg.com")
	void WebOfRecord91() {
		assertEquals("http://www.princekisselburg.com", customers.get(90).getWeb());
	}
}
