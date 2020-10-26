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

@Tag("48")
class Record_3067 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3067: FirstName is Melody")
	void FirstNameOfRecord3067() {
		assertEquals("Melody", customers.get(3066).getFirstName());
	}

	@Test
	@DisplayName("Record 3067: LastName is Lahey")
	void LastNameOfRecord3067() {
		assertEquals("Lahey", customers.get(3066).getLastName());
	}

	@Test
	@DisplayName("Record 3067: Company is Lee Ice Cream Factory")
	void CompanyOfRecord3067() {
		assertEquals("Lee Ice Cream Factory", customers.get(3066).getCompany());
	}

	@Test
	@DisplayName("Record 3067: Address is 104th St")
	void AddressOfRecord3067() {
		assertEquals("104th St", customers.get(3066).getAddress());
	}

	@Test
	@DisplayName("Record 3067: City is Urbandale")
	void CityOfRecord3067() {
		assertEquals("Urbandale", customers.get(3066).getCity());
	}

	@Test
	@DisplayName("Record 3067: County is Polk")
	void CountyOfRecord3067() {
		assertEquals("Polk", customers.get(3066).getCounty());
	}

	@Test
	@DisplayName("Record 3067: State is IA")
	void StateOfRecord3067() {
		assertEquals("IA", customers.get(3066).getState());
	}

	@Test
	@DisplayName("Record 3067: ZIP is 50322")
	void ZIPOfRecord3067() {
		assertEquals("50322", customers.get(3066).getZIP());
	}

	@Test
	@DisplayName("Record 3067: Phone is 515-254-0263")
	void PhoneOfRecord3067() {
		assertEquals("515-254-0263", customers.get(3066).getPhone());
	}

	@Test
	@DisplayName("Record 3067: Fax is 515-254-7915")
	void FaxOfRecord3067() {
		assertEquals("515-254-7915", customers.get(3066).getFax());
	}

	@Test
	@DisplayName("Record 3067: Email is melody@lahey.com")
	void EmailOfRecord3067() {
		assertEquals("melody@lahey.com", customers.get(3066).getEmail());
	}

	@Test
	@DisplayName("Record 3067: Web is http://www.melodylahey.com")
	void WebOfRecord3067() {
		assertEquals("http://www.melodylahey.com", customers.get(3066).getWeb());
	}
}
