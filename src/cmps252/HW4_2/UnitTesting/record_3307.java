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

@Tag("21")
class Record_3307 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3307: FirstName is Jamaal")
	void FirstNameOfRecord3307() {
		assertEquals("Jamaal", customers.get(3306).getFirstName());
	}

	@Test
	@DisplayName("Record 3307: LastName is Wimmer")
	void LastNameOfRecord3307() {
		assertEquals("Wimmer", customers.get(3306).getLastName());
	}

	@Test
	@DisplayName("Record 3307: Company is Pacific Lithograph Co")
	void CompanyOfRecord3307() {
		assertEquals("Pacific Lithograph Co", customers.get(3306).getCompany());
	}

	@Test
	@DisplayName("Record 3307: Address is 83 State St")
	void AddressOfRecord3307() {
		assertEquals("83 State St", customers.get(3306).getAddress());
	}

	@Test
	@DisplayName("Record 3307: City is Springfield")
	void CityOfRecord3307() {
		assertEquals("Springfield", customers.get(3306).getCity());
	}

	@Test
	@DisplayName("Record 3307: County is Hampden")
	void CountyOfRecord3307() {
		assertEquals("Hampden", customers.get(3306).getCounty());
	}

	@Test
	@DisplayName("Record 3307: State is MA")
	void StateOfRecord3307() {
		assertEquals("MA", customers.get(3306).getState());
	}

	@Test
	@DisplayName("Record 3307: ZIP is 1103")
	void ZIPOfRecord3307() {
		assertEquals("1103", customers.get(3306).getZIP());
	}

	@Test
	@DisplayName("Record 3307: Phone is 413-732-8244")
	void PhoneOfRecord3307() {
		assertEquals("413-732-8244", customers.get(3306).getPhone());
	}

	@Test
	@DisplayName("Record 3307: Fax is 413-732-4398")
	void FaxOfRecord3307() {
		assertEquals("413-732-4398", customers.get(3306).getFax());
	}

	@Test
	@DisplayName("Record 3307: Email is jamaal@wimmer.com")
	void EmailOfRecord3307() {
		assertEquals("jamaal@wimmer.com", customers.get(3306).getEmail());
	}

	@Test
	@DisplayName("Record 3307: Web is http://www.jamaalwimmer.com")
	void WebOfRecord3307() {
		assertEquals("http://www.jamaalwimmer.com", customers.get(3306).getWeb());
	}
}
