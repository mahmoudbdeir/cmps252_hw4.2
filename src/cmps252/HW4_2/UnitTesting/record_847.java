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

@Tag("13")
class Record_847 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 847: FirstName is Kimberlee")
	void FirstNameOfRecord847() {
		assertEquals("Kimberlee", customers.get(846).getFirstName());
	}

	@Test
	@DisplayName("Record 847: LastName is Micheals")
	void LastNameOfRecord847() {
		assertEquals("Micheals", customers.get(846).getLastName());
	}

	@Test
	@DisplayName("Record 847: Company is Howard Johnson Intrntl Htl")
	void CompanyOfRecord847() {
		assertEquals("Howard Johnson Intrntl Htl", customers.get(846).getCompany());
	}

	@Test
	@DisplayName("Record 847: Address is 39 Library St")
	void AddressOfRecord847() {
		assertEquals("39 Library St", customers.get(846).getAddress());
	}

	@Test
	@DisplayName("Record 847: City is Hudson")
	void CityOfRecord847() {
		assertEquals("Hudson", customers.get(846).getCity());
	}

	@Test
	@DisplayName("Record 847: County is Hillsborough")
	void CountyOfRecord847() {
		assertEquals("Hillsborough", customers.get(846).getCounty());
	}

	@Test
	@DisplayName("Record 847: State is NH")
	void StateOfRecord847() {
		assertEquals("NH", customers.get(846).getState());
	}

	@Test
	@DisplayName("Record 847: ZIP is 3051")
	void ZIPOfRecord847() {
		assertEquals("3051", customers.get(846).getZIP());
	}

	@Test
	@DisplayName("Record 847: Phone is 603-881-2618")
	void PhoneOfRecord847() {
		assertEquals("603-881-2618", customers.get(846).getPhone());
	}

	@Test
	@DisplayName("Record 847: Fax is 603-881-2219")
	void FaxOfRecord847() {
		assertEquals("603-881-2219", customers.get(846).getFax());
	}

	@Test
	@DisplayName("Record 847: Email is kimberlee@micheals.com")
	void EmailOfRecord847() {
		assertEquals("kimberlee@micheals.com", customers.get(846).getEmail());
	}

	@Test
	@DisplayName("Record 847: Web is http://www.kimberleemicheals.com")
	void WebOfRecord847() {
		assertEquals("http://www.kimberleemicheals.com", customers.get(846).getWeb());
	}
}
