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

@Tag("23")
class Record_683 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 683: FirstName is Coleman")
	void FirstNameOfRecord683() {
		assertEquals("Coleman", customers.get(682).getFirstName());
	}

	@Test
	@DisplayName("Record 683: LastName is Larock")
	void LastNameOfRecord683() {
		assertEquals("Larock", customers.get(682).getLastName());
	}

	@Test
	@DisplayName("Record 683: Company is Kingfisher Dover Loyal Omega")
	void CompanyOfRecord683() {
		assertEquals("Kingfisher Dover Loyal Omega", customers.get(682).getCompany());
	}

	@Test
	@DisplayName("Record 683: Address is 811 N 13th Ave")
	void AddressOfRecord683() {
		assertEquals("811 N 13th Ave", customers.get(682).getAddress());
	}

	@Test
	@DisplayName("Record 683: City is Phoenix")
	void CityOfRecord683() {
		assertEquals("Phoenix", customers.get(682).getCity());
	}

	@Test
	@DisplayName("Record 683: County is Maricopa")
	void CountyOfRecord683() {
		assertEquals("Maricopa", customers.get(682).getCounty());
	}

	@Test
	@DisplayName("Record 683: State is AZ")
	void StateOfRecord683() {
		assertEquals("AZ", customers.get(682).getState());
	}

	@Test
	@DisplayName("Record 683: ZIP is 85007")
	void ZIPOfRecord683() {
		assertEquals("85007", customers.get(682).getZIP());
	}

	@Test
	@DisplayName("Record 683: Phone is 602-254-1343")
	void PhoneOfRecord683() {
		assertEquals("602-254-1343", customers.get(682).getPhone());
	}

	@Test
	@DisplayName("Record 683: Fax is 602-254-9769")
	void FaxOfRecord683() {
		assertEquals("602-254-9769", customers.get(682).getFax());
	}

	@Test
	@DisplayName("Record 683: Email is coleman@larock.com")
	void EmailOfRecord683() {
		assertEquals("coleman@larock.com", customers.get(682).getEmail());
	}

	@Test
	@DisplayName("Record 683: Web is http://www.colemanlarock.com")
	void WebOfRecord683() {
		assertEquals("http://www.colemanlarock.com", customers.get(682).getWeb());
	}
}
