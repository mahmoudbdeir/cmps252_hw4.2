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

@Tag("19")
class Record_4090 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4090: FirstName is Coleman")
	void FirstNameOfRecord4090() {
		assertEquals("Coleman", customers.get(4089).getFirstName());
	}

	@Test
	@DisplayName("Record 4090: LastName is Buerger")
	void LastNameOfRecord4090() {
		assertEquals("Buerger", customers.get(4089).getLastName());
	}

	@Test
	@DisplayName("Record 4090: Company is Fastsigns")
	void CompanyOfRecord4090() {
		assertEquals("Fastsigns", customers.get(4089).getCompany());
	}

	@Test
	@DisplayName("Record 4090: Address is 615 Se Clay St")
	void AddressOfRecord4090() {
		assertEquals("615 Se Clay St", customers.get(4089).getAddress());
	}

	@Test
	@DisplayName("Record 4090: City is Portland")
	void CityOfRecord4090() {
		assertEquals("Portland", customers.get(4089).getCity());
	}

	@Test
	@DisplayName("Record 4090: County is Multnomah")
	void CountyOfRecord4090() {
		assertEquals("Multnomah", customers.get(4089).getCounty());
	}

	@Test
	@DisplayName("Record 4090: State is OR")
	void StateOfRecord4090() {
		assertEquals("OR", customers.get(4089).getState());
	}

	@Test
	@DisplayName("Record 4090: ZIP is 97214")
	void ZIPOfRecord4090() {
		assertEquals("97214", customers.get(4089).getZIP());
	}

	@Test
	@DisplayName("Record 4090: Phone is 503-232-1410")
	void PhoneOfRecord4090() {
		assertEquals("503-232-1410", customers.get(4089).getPhone());
	}

	@Test
	@DisplayName("Record 4090: Fax is 503-232-7845")
	void FaxOfRecord4090() {
		assertEquals("503-232-7845", customers.get(4089).getFax());
	}

	@Test
	@DisplayName("Record 4090: Email is coleman@buerger.com")
	void EmailOfRecord4090() {
		assertEquals("coleman@buerger.com", customers.get(4089).getEmail());
	}

	@Test
	@DisplayName("Record 4090: Web is http://www.colemanbuerger.com")
	void WebOfRecord4090() {
		assertEquals("http://www.colemanbuerger.com", customers.get(4089).getWeb());
	}
}
