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

@Tag("27")
class Record_606 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 606: FirstName is Kathy")
	void FirstNameOfRecord606() {
		assertEquals("Kathy", customers.get(605).getFirstName());
	}

	@Test
	@DisplayName("Record 606: LastName is Hladek")
	void LastNameOfRecord606() {
		assertEquals("Hladek", customers.get(605).getLastName());
	}

	@Test
	@DisplayName("Record 606: Company is American Transit Supply")
	void CompanyOfRecord606() {
		assertEquals("American Transit Supply", customers.get(605).getCompany());
	}

	@Test
	@DisplayName("Record 606: Address is 2 Emmons Dr")
	void AddressOfRecord606() {
		assertEquals("2 Emmons Dr", customers.get(605).getAddress());
	}

	@Test
	@DisplayName("Record 606: City is Princeton")
	void CityOfRecord606() {
		assertEquals("Princeton", customers.get(605).getCity());
	}

	@Test
	@DisplayName("Record 606: County is Mercer")
	void CountyOfRecord606() {
		assertEquals("Mercer", customers.get(605).getCounty());
	}

	@Test
	@DisplayName("Record 606: State is NJ")
	void StateOfRecord606() {
		assertEquals("NJ", customers.get(605).getState());
	}

	@Test
	@DisplayName("Record 606: ZIP is 8540")
	void ZIPOfRecord606() {
		assertEquals("8540", customers.get(605).getZIP());
	}

	@Test
	@DisplayName("Record 606: Phone is 609-452-4226")
	void PhoneOfRecord606() {
		assertEquals("609-452-4226", customers.get(605).getPhone());
	}

	@Test
	@DisplayName("Record 606: Fax is 609-452-6637")
	void FaxOfRecord606() {
		assertEquals("609-452-6637", customers.get(605).getFax());
	}

	@Test
	@DisplayName("Record 606: Email is kathy@hladek.com")
	void EmailOfRecord606() {
		assertEquals("kathy@hladek.com", customers.get(605).getEmail());
	}

	@Test
	@DisplayName("Record 606: Web is http://www.kathyhladek.com")
	void WebOfRecord606() {
		assertEquals("http://www.kathyhladek.com", customers.get(605).getWeb());
	}
}
