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

@Tag("11")
class Record_4299 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4299: FirstName is Maggie")
	void FirstNameOfRecord4299() {
		assertEquals("Maggie", customers.get(4298).getFirstName());
	}

	@Test
	@DisplayName("Record 4299: LastName is Dishman")
	void LastNameOfRecord4299() {
		assertEquals("Dishman", customers.get(4298).getLastName());
	}

	@Test
	@DisplayName("Record 4299: Company is North Pacific Lumber Co")
	void CompanyOfRecord4299() {
		assertEquals("North Pacific Lumber Co", customers.get(4298).getCompany());
	}

	@Test
	@DisplayName("Record 4299: Address is 220 S 6th St")
	void AddressOfRecord4299() {
		assertEquals("220 S 6th St", customers.get(4298).getAddress());
	}

	@Test
	@DisplayName("Record 4299: City is Minneapolis")
	void CityOfRecord4299() {
		assertEquals("Minneapolis", customers.get(4298).getCity());
	}

	@Test
	@DisplayName("Record 4299: County is Hennepin")
	void CountyOfRecord4299() {
		assertEquals("Hennepin", customers.get(4298).getCounty());
	}

	@Test
	@DisplayName("Record 4299: State is MN")
	void StateOfRecord4299() {
		assertEquals("MN", customers.get(4298).getState());
	}

	@Test
	@DisplayName("Record 4299: ZIP is 55402")
	void ZIPOfRecord4299() {
		assertEquals("55402", customers.get(4298).getZIP());
	}

	@Test
	@DisplayName("Record 4299: Phone is 612-340-6275")
	void PhoneOfRecord4299() {
		assertEquals("612-340-6275", customers.get(4298).getPhone());
	}

	@Test
	@DisplayName("Record 4299: Fax is 612-340-5342")
	void FaxOfRecord4299() {
		assertEquals("612-340-5342", customers.get(4298).getFax());
	}

	@Test
	@DisplayName("Record 4299: Email is maggie@dishman.com")
	void EmailOfRecord4299() {
		assertEquals("maggie@dishman.com", customers.get(4298).getEmail());
	}

	@Test
	@DisplayName("Record 4299: Web is http://www.maggiedishman.com")
	void WebOfRecord4299() {
		assertEquals("http://www.maggiedishman.com", customers.get(4298).getWeb());
	}
}
