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

@Tag("6")
class Record_3792 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3792: FirstName is Octavio")
	void FirstNameOfRecord3792() {
		assertEquals("Octavio", customers.get(3791).getFirstName());
	}

	@Test
	@DisplayName("Record 3792: LastName is Miyashiro")
	void LastNameOfRecord3792() {
		assertEquals("Miyashiro", customers.get(3791).getLastName());
	}

	@Test
	@DisplayName("Record 3792: Company is Deli Beloved")
	void CompanyOfRecord3792() {
		assertEquals("Deli Beloved", customers.get(3791).getCompany());
	}

	@Test
	@DisplayName("Record 3792: Address is 359 Main St")
	void AddressOfRecord3792() {
		assertEquals("359 Main St", customers.get(3791).getAddress());
	}

	@Test
	@DisplayName("Record 3792: City is Haverhill")
	void CityOfRecord3792() {
		assertEquals("Haverhill", customers.get(3791).getCity());
	}

	@Test
	@DisplayName("Record 3792: County is Essex")
	void CountyOfRecord3792() {
		assertEquals("Essex", customers.get(3791).getCounty());
	}

	@Test
	@DisplayName("Record 3792: State is MA")
	void StateOfRecord3792() {
		assertEquals("MA", customers.get(3791).getState());
	}

	@Test
	@DisplayName("Record 3792: ZIP is 1830")
	void ZIPOfRecord3792() {
		assertEquals("1830", customers.get(3791).getZIP());
	}

	@Test
	@DisplayName("Record 3792: Phone is 978-374-5916")
	void PhoneOfRecord3792() {
		assertEquals("978-374-5916", customers.get(3791).getPhone());
	}

	@Test
	@DisplayName("Record 3792: Fax is 978-374-4825")
	void FaxOfRecord3792() {
		assertEquals("978-374-4825", customers.get(3791).getFax());
	}

	@Test
	@DisplayName("Record 3792: Email is octavio@miyashiro.com")
	void EmailOfRecord3792() {
		assertEquals("octavio@miyashiro.com", customers.get(3791).getEmail());
	}

	@Test
	@DisplayName("Record 3792: Web is http://www.octaviomiyashiro.com")
	void WebOfRecord3792() {
		assertEquals("http://www.octaviomiyashiro.com", customers.get(3791).getWeb());
	}
}
