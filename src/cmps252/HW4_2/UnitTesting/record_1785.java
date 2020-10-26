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

@Tag("12")
class Record_1785 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1785: FirstName is Daren")
	void FirstNameOfRecord1785() {
		assertEquals("Daren", customers.get(1784).getFirstName());
	}

	@Test
	@DisplayName("Record 1785: LastName is Schyderer")
	void LastNameOfRecord1785() {
		assertEquals("Schyderer", customers.get(1784).getLastName());
	}

	@Test
	@DisplayName("Record 1785: Company is Lombardi, Thomas C")
	void CompanyOfRecord1785() {
		assertEquals("Lombardi, Thomas C", customers.get(1784).getCompany());
	}

	@Test
	@DisplayName("Record 1785: Address is 5155 Wilfong Ln")
	void AddressOfRecord1785() {
		assertEquals("5155 Wilfong Ln", customers.get(1784).getAddress());
	}

	@Test
	@DisplayName("Record 1785: City is Memphis")
	void CityOfRecord1785() {
		assertEquals("Memphis", customers.get(1784).getCity());
	}

	@Test
	@DisplayName("Record 1785: County is Shelby")
	void CountyOfRecord1785() {
		assertEquals("Shelby", customers.get(1784).getCounty());
	}

	@Test
	@DisplayName("Record 1785: State is TN")
	void StateOfRecord1785() {
		assertEquals("TN", customers.get(1784).getState());
	}

	@Test
	@DisplayName("Record 1785: ZIP is 38134")
	void ZIPOfRecord1785() {
		assertEquals("38134", customers.get(1784).getZIP());
	}

	@Test
	@DisplayName("Record 1785: Phone is 901-388-4765")
	void PhoneOfRecord1785() {
		assertEquals("901-388-4765", customers.get(1784).getPhone());
	}

	@Test
	@DisplayName("Record 1785: Fax is 901-388-1967")
	void FaxOfRecord1785() {
		assertEquals("901-388-1967", customers.get(1784).getFax());
	}

	@Test
	@DisplayName("Record 1785: Email is daren@schyderer.com")
	void EmailOfRecord1785() {
		assertEquals("daren@schyderer.com", customers.get(1784).getEmail());
	}

	@Test
	@DisplayName("Record 1785: Web is http://www.darenschyderer.com")
	void WebOfRecord1785() {
		assertEquals("http://www.darenschyderer.com", customers.get(1784).getWeb());
	}
}
