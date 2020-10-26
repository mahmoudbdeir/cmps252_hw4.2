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

@Tag("21")
class Record_536 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 536: FirstName is Arnold")
	void FirstNameOfRecord536() {
		assertEquals("Arnold", customers.get(535).getFirstName());
	}

	@Test
	@DisplayName("Record 536: LastName is Boney")
	void LastNameOfRecord536() {
		assertEquals("Boney", customers.get(535).getLastName());
	}

	@Test
	@DisplayName("Record 536: Company is Morgan Business Equipment")
	void CompanyOfRecord536() {
		assertEquals("Morgan Business Equipment", customers.get(535).getCompany());
	}

	@Test
	@DisplayName("Record 536: Address is 5155 Wilfong Ln")
	void AddressOfRecord536() {
		assertEquals("5155 Wilfong Ln", customers.get(535).getAddress());
	}

	@Test
	@DisplayName("Record 536: City is Memphis")
	void CityOfRecord536() {
		assertEquals("Memphis", customers.get(535).getCity());
	}

	@Test
	@DisplayName("Record 536: County is Shelby")
	void CountyOfRecord536() {
		assertEquals("Shelby", customers.get(535).getCounty());
	}

	@Test
	@DisplayName("Record 536: State is TN")
	void StateOfRecord536() {
		assertEquals("TN", customers.get(535).getState());
	}

	@Test
	@DisplayName("Record 536: ZIP is 38134")
	void ZIPOfRecord536() {
		assertEquals("38134", customers.get(535).getZIP());
	}

	@Test
	@DisplayName("Record 536: Phone is 901-388-3520")
	void PhoneOfRecord536() {
		assertEquals("901-388-3520", customers.get(535).getPhone());
	}

	@Test
	@DisplayName("Record 536: Fax is 901-388-8825")
	void FaxOfRecord536() {
		assertEquals("901-388-8825", customers.get(535).getFax());
	}

	@Test
	@DisplayName("Record 536: Email is arnold@boney.com")
	void EmailOfRecord536() {
		assertEquals("arnold@boney.com", customers.get(535).getEmail());
	}

	@Test
	@DisplayName("Record 536: Web is http://www.arnoldboney.com")
	void WebOfRecord536() {
		assertEquals("http://www.arnoldboney.com", customers.get(535).getWeb());
	}
}
