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

@Tag("49")
class Record_1126 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1126: FirstName is Mose")
	void FirstNameOfRecord1126() {
		assertEquals("Mose", customers.get(1125).getFirstName());
	}

	@Test
	@DisplayName("Record 1126: LastName is Vanwart")
	void LastNameOfRecord1126() {
		assertEquals("Vanwart", customers.get(1125).getLastName());
	}

	@Test
	@DisplayName("Record 1126: Company is Fram Employees Credit Un Inc")
	void CompanyOfRecord1126() {
		assertEquals("Fram Employees Credit Un Inc", customers.get(1125).getCompany());
	}

	@Test
	@DisplayName("Record 1126: Address is 5910 49th St")
	void AddressOfRecord1126() {
		assertEquals("5910 49th St", customers.get(1125).getAddress());
	}

	@Test
	@DisplayName("Record 1126: City is Kenosha")
	void CityOfRecord1126() {
		assertEquals("Kenosha", customers.get(1125).getCity());
	}

	@Test
	@DisplayName("Record 1126: County is Kenosha")
	void CountyOfRecord1126() {
		assertEquals("Kenosha", customers.get(1125).getCounty());
	}

	@Test
	@DisplayName("Record 1126: State is WI")
	void StateOfRecord1126() {
		assertEquals("WI", customers.get(1125).getState());
	}

	@Test
	@DisplayName("Record 1126: ZIP is 53144")
	void ZIPOfRecord1126() {
		assertEquals("53144", customers.get(1125).getZIP());
	}

	@Test
	@DisplayName("Record 1126: Phone is 262-657-0808")
	void PhoneOfRecord1126() {
		assertEquals("262-657-0808", customers.get(1125).getPhone());
	}

	@Test
	@DisplayName("Record 1126: Fax is 262-657-4773")
	void FaxOfRecord1126() {
		assertEquals("262-657-4773", customers.get(1125).getFax());
	}

	@Test
	@DisplayName("Record 1126: Email is mose@vanwart.com")
	void EmailOfRecord1126() {
		assertEquals("mose@vanwart.com", customers.get(1125).getEmail());
	}

	@Test
	@DisplayName("Record 1126: Web is http://www.mosevanwart.com")
	void WebOfRecord1126() {
		assertEquals("http://www.mosevanwart.com", customers.get(1125).getWeb());
	}
}
