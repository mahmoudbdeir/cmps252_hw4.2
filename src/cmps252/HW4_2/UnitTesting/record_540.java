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

@Tag("12")
class Record_540 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 540: FirstName is Refugio")
	void FirstNameOfRecord540() {
		assertEquals("Refugio", customers.get(539).getFirstName());
	}

	@Test
	@DisplayName("Record 540: LastName is Dornak")
	void LastNameOfRecord540() {
		assertEquals("Dornak", customers.get(539).getLastName());
	}

	@Test
	@DisplayName("Record 540: Company is Asa Fryght Systems Inc")
	void CompanyOfRecord540() {
		assertEquals("Asa Fryght Systems Inc", customers.get(539).getCompany());
	}

	@Test
	@DisplayName("Record 540: Address is 5002 Industrial Way")
	void AddressOfRecord540() {
		assertEquals("5002 Industrial Way", customers.get(539).getAddress());
	}

	@Test
	@DisplayName("Record 540: City is Coeur d Alene")
	void CityOfRecord540() {
		assertEquals("Coeur d Alene", customers.get(539).getCity());
	}

	@Test
	@DisplayName("Record 540: County is Kootenai")
	void CountyOfRecord540() {
		assertEquals("Kootenai", customers.get(539).getCounty());
	}

	@Test
	@DisplayName("Record 540: State is ID")
	void StateOfRecord540() {
		assertEquals("ID", customers.get(539).getState());
	}

	@Test
	@DisplayName("Record 540: ZIP is 83814")
	void ZIPOfRecord540() {
		assertEquals("83814", customers.get(539).getZIP());
	}

	@Test
	@DisplayName("Record 540: Phone is 208-765-8905")
	void PhoneOfRecord540() {
		assertEquals("208-765-8905", customers.get(539).getPhone());
	}

	@Test
	@DisplayName("Record 540: Fax is 208-765-8329")
	void FaxOfRecord540() {
		assertEquals("208-765-8329", customers.get(539).getFax());
	}

	@Test
	@DisplayName("Record 540: Email is refugio@dornak.com")
	void EmailOfRecord540() {
		assertEquals("refugio@dornak.com", customers.get(539).getEmail());
	}

	@Test
	@DisplayName("Record 540: Web is http://www.refugiodornak.com")
	void WebOfRecord540() {
		assertEquals("http://www.refugiodornak.com", customers.get(539).getWeb());
	}
}
