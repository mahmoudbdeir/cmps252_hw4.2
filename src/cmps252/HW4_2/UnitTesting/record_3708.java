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

@Tag("41")
class Record_3708 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3708: FirstName is Quincy")
	void FirstNameOfRecord3708() {
		assertEquals("Quincy", customers.get(3707).getFirstName());
	}

	@Test
	@DisplayName("Record 3708: LastName is Kmats")
	void LastNameOfRecord3708() {
		assertEquals("Kmats", customers.get(3707).getLastName());
	}

	@Test
	@DisplayName("Record 3708: Company is Frederick, Rolf R Jr")
	void CompanyOfRecord3708() {
		assertEquals("Frederick, Rolf R Jr", customers.get(3707).getCompany());
	}

	@Test
	@DisplayName("Record 3708: Address is 1273 N Church St  #-108")
	void AddressOfRecord3708() {
		assertEquals("1273 N Church St  #-108", customers.get(3707).getAddress());
	}

	@Test
	@DisplayName("Record 3708: City is Moorestown")
	void CityOfRecord3708() {
		assertEquals("Moorestown", customers.get(3707).getCity());
	}

	@Test
	@DisplayName("Record 3708: County is Burlington")
	void CountyOfRecord3708() {
		assertEquals("Burlington", customers.get(3707).getCounty());
	}

	@Test
	@DisplayName("Record 3708: State is NJ")
	void StateOfRecord3708() {
		assertEquals("NJ", customers.get(3707).getState());
	}

	@Test
	@DisplayName("Record 3708: ZIP is 8057")
	void ZIPOfRecord3708() {
		assertEquals("8057", customers.get(3707).getZIP());
	}

	@Test
	@DisplayName("Record 3708: Phone is 856-778-7627")
	void PhoneOfRecord3708() {
		assertEquals("856-778-7627", customers.get(3707).getPhone());
	}

	@Test
	@DisplayName("Record 3708: Fax is 856-778-8481")
	void FaxOfRecord3708() {
		assertEquals("856-778-8481", customers.get(3707).getFax());
	}

	@Test
	@DisplayName("Record 3708: Email is quincy@kmats.com")
	void EmailOfRecord3708() {
		assertEquals("quincy@kmats.com", customers.get(3707).getEmail());
	}

	@Test
	@DisplayName("Record 3708: Web is http://www.quincykmats.com")
	void WebOfRecord3708() {
		assertEquals("http://www.quincykmats.com", customers.get(3707).getWeb());
	}
}
