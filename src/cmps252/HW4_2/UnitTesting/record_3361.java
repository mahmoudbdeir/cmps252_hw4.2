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
class Record_3361 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3361: FirstName is Betsy")
	void FirstNameOfRecord3361() {
		assertEquals("Betsy", customers.get(3360).getFirstName());
	}

	@Test
	@DisplayName("Record 3361: LastName is Brittle")
	void LastNameOfRecord3361() {
		assertEquals("Brittle", customers.get(3360).getLastName());
	}

	@Test
	@DisplayName("Record 3361: Company is Stearns Printing Inc")
	void CompanyOfRecord3361() {
		assertEquals("Stearns Printing Inc", customers.get(3360).getCompany());
	}

	@Test
	@DisplayName("Record 3361: Address is 8655 Tamarack Ave")
	void AddressOfRecord3361() {
		assertEquals("8655 Tamarack Ave", customers.get(3360).getAddress());
	}

	@Test
	@DisplayName("Record 3361: City is Sun Valley")
	void CityOfRecord3361() {
		assertEquals("Sun Valley", customers.get(3360).getCity());
	}

	@Test
	@DisplayName("Record 3361: County is Los Angeles")
	void CountyOfRecord3361() {
		assertEquals("Los Angeles", customers.get(3360).getCounty());
	}

	@Test
	@DisplayName("Record 3361: State is CA")
	void StateOfRecord3361() {
		assertEquals("CA", customers.get(3360).getState());
	}

	@Test
	@DisplayName("Record 3361: ZIP is 91352")
	void ZIPOfRecord3361() {
		assertEquals("91352", customers.get(3360).getZIP());
	}

	@Test
	@DisplayName("Record 3361: Phone is 818-768-2726")
	void PhoneOfRecord3361() {
		assertEquals("818-768-2726", customers.get(3360).getPhone());
	}

	@Test
	@DisplayName("Record 3361: Fax is 818-768-5681")
	void FaxOfRecord3361() {
		assertEquals("818-768-5681", customers.get(3360).getFax());
	}

	@Test
	@DisplayName("Record 3361: Email is betsy@brittle.com")
	void EmailOfRecord3361() {
		assertEquals("betsy@brittle.com", customers.get(3360).getEmail());
	}

	@Test
	@DisplayName("Record 3361: Web is http://www.betsybrittle.com")
	void WebOfRecord3361() {
		assertEquals("http://www.betsybrittle.com", customers.get(3360).getWeb());
	}
}
