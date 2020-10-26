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
class Record_468 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 468: FirstName is Birdie")
	void FirstNameOfRecord468() {
		assertEquals("Birdie", customers.get(467).getFirstName());
	}

	@Test
	@DisplayName("Record 468: LastName is Nuque")
	void LastNameOfRecord468() {
		assertEquals("Nuque", customers.get(467).getLastName());
	}

	@Test
	@DisplayName("Record 468: Company is Surgicenter Of S E Texas Inc")
	void CompanyOfRecord468() {
		assertEquals("Surgicenter Of S E Texas Inc", customers.get(467).getCompany());
	}

	@Test
	@DisplayName("Record 468: Address is 15 Oak Ave")
	void AddressOfRecord468() {
		assertEquals("15 Oak Ave", customers.get(467).getAddress());
	}

	@Test
	@DisplayName("Record 468: City is Marmora")
	void CityOfRecord468() {
		assertEquals("Marmora", customers.get(467).getCity());
	}

	@Test
	@DisplayName("Record 468: County is Cape May")
	void CountyOfRecord468() {
		assertEquals("Cape May", customers.get(467).getCounty());
	}

	@Test
	@DisplayName("Record 468: State is NJ")
	void StateOfRecord468() {
		assertEquals("NJ", customers.get(467).getState());
	}

	@Test
	@DisplayName("Record 468: ZIP is 8223")
	void ZIPOfRecord468() {
		assertEquals("8223", customers.get(467).getZIP());
	}

	@Test
	@DisplayName("Record 468: Phone is 609-390-2943")
	void PhoneOfRecord468() {
		assertEquals("609-390-2943", customers.get(467).getPhone());
	}

	@Test
	@DisplayName("Record 468: Fax is 609-390-1628")
	void FaxOfRecord468() {
		assertEquals("609-390-1628", customers.get(467).getFax());
	}

	@Test
	@DisplayName("Record 468: Email is birdie@nuque.com")
	void EmailOfRecord468() {
		assertEquals("birdie@nuque.com", customers.get(467).getEmail());
	}

	@Test
	@DisplayName("Record 468: Web is http://www.birdienuque.com")
	void WebOfRecord468() {
		assertEquals("http://www.birdienuque.com", customers.get(467).getWeb());
	}
}
