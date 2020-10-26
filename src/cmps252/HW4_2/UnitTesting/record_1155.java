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

@Tag("30")
class Record_1155 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1155: FirstName is Octavia")
	void FirstNameOfRecord1155() {
		assertEquals("Octavia", customers.get(1154).getFirstName());
	}

	@Test
	@DisplayName("Record 1155: LastName is Shove")
	void LastNameOfRecord1155() {
		assertEquals("Shove", customers.get(1154).getLastName());
	}

	@Test
	@DisplayName("Record 1155: Company is Jacobs Engineering Group Inc")
	void CompanyOfRecord1155() {
		assertEquals("Jacobs Engineering Group Inc", customers.get(1154).getCompany());
	}

	@Test
	@DisplayName("Record 1155: Address is 405 Murray Hill Pky")
	void AddressOfRecord1155() {
		assertEquals("405 Murray Hill Pky", customers.get(1154).getAddress());
	}

	@Test
	@DisplayName("Record 1155: City is East Rutherford")
	void CityOfRecord1155() {
		assertEquals("East Rutherford", customers.get(1154).getCity());
	}

	@Test
	@DisplayName("Record 1155: County is Bergen")
	void CountyOfRecord1155() {
		assertEquals("Bergen", customers.get(1154).getCounty());
	}

	@Test
	@DisplayName("Record 1155: State is NJ")
	void StateOfRecord1155() {
		assertEquals("NJ", customers.get(1154).getState());
	}

	@Test
	@DisplayName("Record 1155: ZIP is 7073")
	void ZIPOfRecord1155() {
		assertEquals("7073", customers.get(1154).getZIP());
	}

	@Test
	@DisplayName("Record 1155: Phone is 201-756-1976")
	void PhoneOfRecord1155() {
		assertEquals("201-756-1976", customers.get(1154).getPhone());
	}

	@Test
	@DisplayName("Record 1155: Fax is 201-756-6761")
	void FaxOfRecord1155() {
		assertEquals("201-756-6761", customers.get(1154).getFax());
	}

	@Test
	@DisplayName("Record 1155: Email is octavia@shove.com")
	void EmailOfRecord1155() {
		assertEquals("octavia@shove.com", customers.get(1154).getEmail());
	}

	@Test
	@DisplayName("Record 1155: Web is http://www.octaviashove.com")
	void WebOfRecord1155() {
		assertEquals("http://www.octaviashove.com", customers.get(1154).getWeb());
	}
}
