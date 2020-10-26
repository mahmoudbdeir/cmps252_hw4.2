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

@Tag("3")
class Record_1206 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1206: FirstName is Mikel")
	void FirstNameOfRecord1206() {
		assertEquals("Mikel", customers.get(1205).getFirstName());
	}

	@Test
	@DisplayName("Record 1206: LastName is Teters")
	void LastNameOfRecord1206() {
		assertEquals("Teters", customers.get(1205).getLastName());
	}

	@Test
	@DisplayName("Record 1206: Company is Intercontinental Mortgage Corp")
	void CompanyOfRecord1206() {
		assertEquals("Intercontinental Mortgage Corp", customers.get(1205).getCompany());
	}

	@Test
	@DisplayName("Record 1206: Address is 3008 Park Blvd")
	void AddressOfRecord1206() {
		assertEquals("3008 Park Blvd", customers.get(1205).getAddress());
	}

	@Test
	@DisplayName("Record 1206: City is Wildwood")
	void CityOfRecord1206() {
		assertEquals("Wildwood", customers.get(1205).getCity());
	}

	@Test
	@DisplayName("Record 1206: County is Cape May")
	void CountyOfRecord1206() {
		assertEquals("Cape May", customers.get(1205).getCounty());
	}

	@Test
	@DisplayName("Record 1206: State is NJ")
	void StateOfRecord1206() {
		assertEquals("NJ", customers.get(1205).getState());
	}

	@Test
	@DisplayName("Record 1206: ZIP is 8260")
	void ZIPOfRecord1206() {
		assertEquals("8260", customers.get(1205).getZIP());
	}

	@Test
	@DisplayName("Record 1206: Phone is 609-522-4764")
	void PhoneOfRecord1206() {
		assertEquals("609-522-4764", customers.get(1205).getPhone());
	}

	@Test
	@DisplayName("Record 1206: Fax is 609-522-2731")
	void FaxOfRecord1206() {
		assertEquals("609-522-2731", customers.get(1205).getFax());
	}

	@Test
	@DisplayName("Record 1206: Email is mikel@teters.com")
	void EmailOfRecord1206() {
		assertEquals("mikel@teters.com", customers.get(1205).getEmail());
	}

	@Test
	@DisplayName("Record 1206: Web is http://www.mikelteters.com")
	void WebOfRecord1206() {
		assertEquals("http://www.mikelteters.com", customers.get(1205).getWeb());
	}
}
