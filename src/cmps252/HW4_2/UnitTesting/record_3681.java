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

@Tag("45")
class Record_3681 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3681: FirstName is Winona")
	void FirstNameOfRecord3681() {
		assertEquals("Winona", customers.get(3680).getFirstName());
	}

	@Test
	@DisplayName("Record 3681: LastName is Henriksen")
	void LastNameOfRecord3681() {
		assertEquals("Henriksen", customers.get(3680).getLastName());
	}

	@Test
	@DisplayName("Record 3681: Company is Albinson")
	void CompanyOfRecord3681() {
		assertEquals("Albinson", customers.get(3680).getCompany());
	}

	@Test
	@DisplayName("Record 3681: Address is Box #-724")
	void AddressOfRecord3681() {
		assertEquals("Box #-724", customers.get(3680).getAddress());
	}

	@Test
	@DisplayName("Record 3681: City is Lecanto")
	void CityOfRecord3681() {
		assertEquals("Lecanto", customers.get(3680).getCity());
	}

	@Test
	@DisplayName("Record 3681: County is Citrus")
	void CountyOfRecord3681() {
		assertEquals("Citrus", customers.get(3680).getCounty());
	}

	@Test
	@DisplayName("Record 3681: State is FL")
	void StateOfRecord3681() {
		assertEquals("FL", customers.get(3680).getState());
	}

	@Test
	@DisplayName("Record 3681: ZIP is 34460")
	void ZIPOfRecord3681() {
		assertEquals("34460", customers.get(3680).getZIP());
	}

	@Test
	@DisplayName("Record 3681: Phone is 352-726-9045")
	void PhoneOfRecord3681() {
		assertEquals("352-726-9045", customers.get(3680).getPhone());
	}

	@Test
	@DisplayName("Record 3681: Fax is 352-726-9934")
	void FaxOfRecord3681() {
		assertEquals("352-726-9934", customers.get(3680).getFax());
	}

	@Test
	@DisplayName("Record 3681: Email is winona@henriksen.com")
	void EmailOfRecord3681() {
		assertEquals("winona@henriksen.com", customers.get(3680).getEmail());
	}

	@Test
	@DisplayName("Record 3681: Web is http://www.winonahenriksen.com")
	void WebOfRecord3681() {
		assertEquals("http://www.winonahenriksen.com", customers.get(3680).getWeb());
	}
}
