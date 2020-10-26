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

@Tag("33")
class Record_3086 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3086: FirstName is Terrance")
	void FirstNameOfRecord3086() {
		assertEquals("Terrance", customers.get(3085).getFirstName());
	}

	@Test
	@DisplayName("Record 3086: LastName is Brownstone")
	void LastNameOfRecord3086() {
		assertEquals("Brownstone", customers.get(3085).getLastName());
	}

	@Test
	@DisplayName("Record 3086: Company is Bl Dental Co Inc")
	void CompanyOfRecord3086() {
		assertEquals("Bl Dental Co Inc", customers.get(3085).getCompany());
	}

	@Test
	@DisplayName("Record 3086: Address is 6835 26th St")
	void AddressOfRecord3086() {
		assertEquals("6835 26th St", customers.get(3085).getAddress());
	}

	@Test
	@DisplayName("Record 3086: City is Rio Linda")
	void CityOfRecord3086() {
		assertEquals("Rio Linda", customers.get(3085).getCity());
	}

	@Test
	@DisplayName("Record 3086: County is Sacramento")
	void CountyOfRecord3086() {
		assertEquals("Sacramento", customers.get(3085).getCounty());
	}

	@Test
	@DisplayName("Record 3086: State is CA")
	void StateOfRecord3086() {
		assertEquals("CA", customers.get(3085).getState());
	}

	@Test
	@DisplayName("Record 3086: ZIP is 95673")
	void ZIPOfRecord3086() {
		assertEquals("95673", customers.get(3085).getZIP());
	}

	@Test
	@DisplayName("Record 3086: Phone is 916-992-6646")
	void PhoneOfRecord3086() {
		assertEquals("916-992-6646", customers.get(3085).getPhone());
	}

	@Test
	@DisplayName("Record 3086: Fax is 916-992-8023")
	void FaxOfRecord3086() {
		assertEquals("916-992-8023", customers.get(3085).getFax());
	}

	@Test
	@DisplayName("Record 3086: Email is terrance@brownstone.com")
	void EmailOfRecord3086() {
		assertEquals("terrance@brownstone.com", customers.get(3085).getEmail());
	}

	@Test
	@DisplayName("Record 3086: Web is http://www.terrancebrownstone.com")
	void WebOfRecord3086() {
		assertEquals("http://www.terrancebrownstone.com", customers.get(3085).getWeb());
	}
}
