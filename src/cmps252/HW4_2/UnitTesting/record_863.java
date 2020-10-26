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

@Tag("5")
class Record_863 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 863: FirstName is Laurence")
	void FirstNameOfRecord863() {
		assertEquals("Laurence", customers.get(862).getFirstName());
	}

	@Test
	@DisplayName("Record 863: LastName is Grasman")
	void LastNameOfRecord863() {
		assertEquals("Grasman", customers.get(862).getLastName());
	}

	@Test
	@DisplayName("Record 863: Company is Jet Tool Corp")
	void CompanyOfRecord863() {
		assertEquals("Jet Tool Corp", customers.get(862).getCompany());
	}

	@Test
	@DisplayName("Record 863: Address is 205 Tilden Ave")
	void AddressOfRecord863() {
		assertEquals("205 Tilden Ave", customers.get(862).getAddress());
	}

	@Test
	@DisplayName("Record 863: City is Michigan City")
	void CityOfRecord863() {
		assertEquals("Michigan City", customers.get(862).getCity());
	}

	@Test
	@DisplayName("Record 863: County is La Porte")
	void CountyOfRecord863() {
		assertEquals("La Porte", customers.get(862).getCounty());
	}

	@Test
	@DisplayName("Record 863: State is IN")
	void StateOfRecord863() {
		assertEquals("IN", customers.get(862).getState());
	}

	@Test
	@DisplayName("Record 863: ZIP is 46360")
	void ZIPOfRecord863() {
		assertEquals("46360", customers.get(862).getZIP());
	}

	@Test
	@DisplayName("Record 863: Phone is 219-879-5718")
	void PhoneOfRecord863() {
		assertEquals("219-879-5718", customers.get(862).getPhone());
	}

	@Test
	@DisplayName("Record 863: Fax is 219-879-1059")
	void FaxOfRecord863() {
		assertEquals("219-879-1059", customers.get(862).getFax());
	}

	@Test
	@DisplayName("Record 863: Email is laurence@grasman.com")
	void EmailOfRecord863() {
		assertEquals("laurence@grasman.com", customers.get(862).getEmail());
	}

	@Test
	@DisplayName("Record 863: Web is http://www.laurencegrasman.com")
	void WebOfRecord863() {
		assertEquals("http://www.laurencegrasman.com", customers.get(862).getWeb());
	}
}
