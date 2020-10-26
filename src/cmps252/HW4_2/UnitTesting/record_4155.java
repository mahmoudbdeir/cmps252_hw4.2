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

@Tag("9")
class Record_4155 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4155: FirstName is Lucille")
	void FirstNameOfRecord4155() {
		assertEquals("Lucille", customers.get(4154).getFirstName());
	}

	@Test
	@DisplayName("Record 4155: LastName is Gravis")
	void LastNameOfRecord4155() {
		assertEquals("Gravis", customers.get(4154).getLastName());
	}

	@Test
	@DisplayName("Record 4155: Company is H La Rosee & Sons Inc")
	void CompanyOfRecord4155() {
		assertEquals("H La Rosee & Sons Inc", customers.get(4154).getCompany());
	}

	@Test
	@DisplayName("Record 4155: Address is Kerr Ave  #-600")
	void AddressOfRecord4155() {
		assertEquals("Kerr Ave  #-600", customers.get(4154).getAddress());
	}

	@Test
	@DisplayName("Record 4155: City is Oklahoma City")
	void CityOfRecord4155() {
		assertEquals("Oklahoma City", customers.get(4154).getCity());
	}

	@Test
	@DisplayName("Record 4155: County is Oklahoma")
	void CountyOfRecord4155() {
		assertEquals("Oklahoma", customers.get(4154).getCounty());
	}

	@Test
	@DisplayName("Record 4155: State is OK")
	void StateOfRecord4155() {
		assertEquals("OK", customers.get(4154).getState());
	}

	@Test
	@DisplayName("Record 4155: ZIP is 73102")
	void ZIPOfRecord4155() {
		assertEquals("73102", customers.get(4154).getZIP());
	}

	@Test
	@DisplayName("Record 4155: Phone is 405-236-9397")
	void PhoneOfRecord4155() {
		assertEquals("405-236-9397", customers.get(4154).getPhone());
	}

	@Test
	@DisplayName("Record 4155: Fax is 405-236-4228")
	void FaxOfRecord4155() {
		assertEquals("405-236-4228", customers.get(4154).getFax());
	}

	@Test
	@DisplayName("Record 4155: Email is lucille@gravis.com")
	void EmailOfRecord4155() {
		assertEquals("lucille@gravis.com", customers.get(4154).getEmail());
	}

	@Test
	@DisplayName("Record 4155: Web is http://www.lucillegravis.com")
	void WebOfRecord4155() {
		assertEquals("http://www.lucillegravis.com", customers.get(4154).getWeb());
	}
}
