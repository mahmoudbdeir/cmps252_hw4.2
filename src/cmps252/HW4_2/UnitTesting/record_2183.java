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
class Record_2183 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2183: FirstName is Ginger")
	void FirstNameOfRecord2183() {
		assertEquals("Ginger", customers.get(2182).getFirstName());
	}

	@Test
	@DisplayName("Record 2183: LastName is Khachatoorian")
	void LastNameOfRecord2183() {
		assertEquals("Khachatoorian", customers.get(2182).getLastName());
	}

	@Test
	@DisplayName("Record 2183: Company is Dodez & Derr Inc")
	void CompanyOfRecord2183() {
		assertEquals("Dodez & Derr Inc", customers.get(2182).getCompany());
	}

	@Test
	@DisplayName("Record 2183: Address is 3127 Farrisview Blvd")
	void AddressOfRecord2183() {
		assertEquals("3127 Farrisview Blvd", customers.get(2182).getAddress());
	}

	@Test
	@DisplayName("Record 2183: City is Memphis")
	void CityOfRecord2183() {
		assertEquals("Memphis", customers.get(2182).getCity());
	}

	@Test
	@DisplayName("Record 2183: County is Shelby")
	void CountyOfRecord2183() {
		assertEquals("Shelby", customers.get(2182).getCounty());
	}

	@Test
	@DisplayName("Record 2183: State is TN")
	void StateOfRecord2183() {
		assertEquals("TN", customers.get(2182).getState());
	}

	@Test
	@DisplayName("Record 2183: ZIP is 38118")
	void ZIPOfRecord2183() {
		assertEquals("38118", customers.get(2182).getZIP());
	}

	@Test
	@DisplayName("Record 2183: Phone is 901-367-5624")
	void PhoneOfRecord2183() {
		assertEquals("901-367-5624", customers.get(2182).getPhone());
	}

	@Test
	@DisplayName("Record 2183: Fax is 901-367-5239")
	void FaxOfRecord2183() {
		assertEquals("901-367-5239", customers.get(2182).getFax());
	}

	@Test
	@DisplayName("Record 2183: Email is ginger@khachatoorian.com")
	void EmailOfRecord2183() {
		assertEquals("ginger@khachatoorian.com", customers.get(2182).getEmail());
	}

	@Test
	@DisplayName("Record 2183: Web is http://www.gingerkhachatoorian.com")
	void WebOfRecord2183() {
		assertEquals("http://www.gingerkhachatoorian.com", customers.get(2182).getWeb());
	}
}
