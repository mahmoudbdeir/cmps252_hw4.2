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

@Tag("17")
class Record_183 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 183: FirstName is Tanner")
	void FirstNameOfRecord183() {
		assertEquals("Tanner", customers.get(182).getFirstName());
	}

	@Test
	@DisplayName("Record 183: LastName is Lanese")
	void LastNameOfRecord183() {
		assertEquals("Lanese", customers.get(182).getLastName());
	}

	@Test
	@DisplayName("Record 183: Company is American Tile Supply Co Inc")
	void CompanyOfRecord183() {
		assertEquals("American Tile Supply Co Inc", customers.get(182).getCompany());
	}

	@Test
	@DisplayName("Record 183: Address is 1050 State St")
	void AddressOfRecord183() {
		assertEquals("1050 State St", customers.get(182).getAddress());
	}

	@Test
	@DisplayName("Record 183: City is Perth Amboy")
	void CityOfRecord183() {
		assertEquals("Perth Amboy", customers.get(182).getCity());
	}

	@Test
	@DisplayName("Record 183: County is Middlesex")
	void CountyOfRecord183() {
		assertEquals("Middlesex", customers.get(182).getCounty());
	}

	@Test
	@DisplayName("Record 183: State is NJ")
	void StateOfRecord183() {
		assertEquals("NJ", customers.get(182).getState());
	}

	@Test
	@DisplayName("Record 183: ZIP is 8861")
	void ZIPOfRecord183() {
		assertEquals("8861", customers.get(182).getZIP());
	}

	@Test
	@DisplayName("Record 183: Phone is 732-826-3185")
	void PhoneOfRecord183() {
		assertEquals("732-826-3185", customers.get(182).getPhone());
	}

	@Test
	@DisplayName("Record 183: Fax is 732-826-2684")
	void FaxOfRecord183() {
		assertEquals("732-826-2684", customers.get(182).getFax());
	}

	@Test
	@DisplayName("Record 183: Email is tanner@lanese.com")
	void EmailOfRecord183() {
		assertEquals("tanner@lanese.com", customers.get(182).getEmail());
	}

	@Test
	@DisplayName("Record 183: Web is http://www.tannerlanese.com")
	void WebOfRecord183() {
		assertEquals("http://www.tannerlanese.com", customers.get(182).getWeb());
	}
}
