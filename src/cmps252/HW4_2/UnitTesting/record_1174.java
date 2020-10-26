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

@Tag("41")
class Record_1174 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1174: FirstName is Sherwood")
	void FirstNameOfRecord1174() {
		assertEquals("Sherwood", customers.get(1173).getFirstName());
	}

	@Test
	@DisplayName("Record 1174: LastName is Boissy")
	void LastNameOfRecord1174() {
		assertEquals("Boissy", customers.get(1173).getLastName());
	}

	@Test
	@DisplayName("Record 1174: Company is Executrain Of Atlanta")
	void CompanyOfRecord1174() {
		assertEquals("Executrain Of Atlanta", customers.get(1173).getCompany());
	}

	@Test
	@DisplayName("Record 1174: Address is 157 Broad St")
	void AddressOfRecord1174() {
		assertEquals("157 Broad St", customers.get(1173).getAddress());
	}

	@Test
	@DisplayName("Record 1174: City is Red Bank")
	void CityOfRecord1174() {
		assertEquals("Red Bank", customers.get(1173).getCity());
	}

	@Test
	@DisplayName("Record 1174: County is Monmouth")
	void CountyOfRecord1174() {
		assertEquals("Monmouth", customers.get(1173).getCounty());
	}

	@Test
	@DisplayName("Record 1174: State is NJ")
	void StateOfRecord1174() {
		assertEquals("NJ", customers.get(1173).getState());
	}

	@Test
	@DisplayName("Record 1174: ZIP is 7701")
	void ZIPOfRecord1174() {
		assertEquals("7701", customers.get(1173).getZIP());
	}

	@Test
	@DisplayName("Record 1174: Phone is 732-741-0353")
	void PhoneOfRecord1174() {
		assertEquals("732-741-0353", customers.get(1173).getPhone());
	}

	@Test
	@DisplayName("Record 1174: Fax is 732-741-6171")
	void FaxOfRecord1174() {
		assertEquals("732-741-6171", customers.get(1173).getFax());
	}

	@Test
	@DisplayName("Record 1174: Email is sherwood@boissy.com")
	void EmailOfRecord1174() {
		assertEquals("sherwood@boissy.com", customers.get(1173).getEmail());
	}

	@Test
	@DisplayName("Record 1174: Web is http://www.sherwoodboissy.com")
	void WebOfRecord1174() {
		assertEquals("http://www.sherwoodboissy.com", customers.get(1173).getWeb());
	}
}
