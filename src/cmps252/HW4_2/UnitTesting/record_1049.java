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

@Tag("2")
class Record_1049 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1049: FirstName is Darla")
	void FirstNameOfRecord1049() {
		assertEquals("Darla", customers.get(1048).getFirstName());
	}

	@Test
	@DisplayName("Record 1049: LastName is Mander")
	void LastNameOfRecord1049() {
		assertEquals("Mander", customers.get(1048).getLastName());
	}

	@Test
	@DisplayName("Record 1049: Company is Martin, Robert A Md")
	void CompanyOfRecord1049() {
		assertEquals("Martin, Robert A Md", customers.get(1048).getCompany());
	}

	@Test
	@DisplayName("Record 1049: Address is 5501 Lake Lizzie Dr")
	void AddressOfRecord1049() {
		assertEquals("5501 Lake Lizzie Dr", customers.get(1048).getAddress());
	}

	@Test
	@DisplayName("Record 1049: City is Saint Cloud")
	void CityOfRecord1049() {
		assertEquals("Saint Cloud", customers.get(1048).getCity());
	}

	@Test
	@DisplayName("Record 1049: County is Osceola")
	void CountyOfRecord1049() {
		assertEquals("Osceola", customers.get(1048).getCounty());
	}

	@Test
	@DisplayName("Record 1049: State is FL")
	void StateOfRecord1049() {
		assertEquals("FL", customers.get(1048).getState());
	}

	@Test
	@DisplayName("Record 1049: ZIP is 34771")
	void ZIPOfRecord1049() {
		assertEquals("34771", customers.get(1048).getZIP());
	}

	@Test
	@DisplayName("Record 1049: Phone is 407-892-3479")
	void PhoneOfRecord1049() {
		assertEquals("407-892-3479", customers.get(1048).getPhone());
	}

	@Test
	@DisplayName("Record 1049: Fax is 407-892-3534")
	void FaxOfRecord1049() {
		assertEquals("407-892-3534", customers.get(1048).getFax());
	}

	@Test
	@DisplayName("Record 1049: Email is darla@mander.com")
	void EmailOfRecord1049() {
		assertEquals("darla@mander.com", customers.get(1048).getEmail());
	}

	@Test
	@DisplayName("Record 1049: Web is http://www.darlamander.com")
	void WebOfRecord1049() {
		assertEquals("http://www.darlamander.com", customers.get(1048).getWeb());
	}
}
