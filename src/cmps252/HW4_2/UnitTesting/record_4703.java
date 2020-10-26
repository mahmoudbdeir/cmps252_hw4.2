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

@Tag("14")
class Record_4703 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4703: FirstName is Stephanie")
	void FirstNameOfRecord4703() {
		assertEquals("Stephanie", customers.get(4702).getFirstName());
	}

	@Test
	@DisplayName("Record 4703: LastName is Rashdi")
	void LastNameOfRecord4703() {
		assertEquals("Rashdi", customers.get(4702).getLastName());
	}

	@Test
	@DisplayName("Record 4703: Company is Carl Budding & Co")
	void CompanyOfRecord4703() {
		assertEquals("Carl Budding & Co", customers.get(4702).getCompany());
	}

	@Test
	@DisplayName("Record 4703: Address is 4125 N 14th St")
	void AddressOfRecord4703() {
		assertEquals("4125 N 14th St", customers.get(4702).getAddress());
	}

	@Test
	@DisplayName("Record 4703: City is Phoenix")
	void CityOfRecord4703() {
		assertEquals("Phoenix", customers.get(4702).getCity());
	}

	@Test
	@DisplayName("Record 4703: County is Maricopa")
	void CountyOfRecord4703() {
		assertEquals("Maricopa", customers.get(4702).getCounty());
	}

	@Test
	@DisplayName("Record 4703: State is AZ")
	void StateOfRecord4703() {
		assertEquals("AZ", customers.get(4702).getState());
	}

	@Test
	@DisplayName("Record 4703: ZIP is 85014")
	void ZIPOfRecord4703() {
		assertEquals("85014", customers.get(4702).getZIP());
	}

	@Test
	@DisplayName("Record 4703: Phone is 602-241-7013")
	void PhoneOfRecord4703() {
		assertEquals("602-241-7013", customers.get(4702).getPhone());
	}

	@Test
	@DisplayName("Record 4703: Fax is 602-241-2282")
	void FaxOfRecord4703() {
		assertEquals("602-241-2282", customers.get(4702).getFax());
	}

	@Test
	@DisplayName("Record 4703: Email is stephanie@rashdi.com")
	void EmailOfRecord4703() {
		assertEquals("stephanie@rashdi.com", customers.get(4702).getEmail());
	}

	@Test
	@DisplayName("Record 4703: Web is http://www.stephanierashdi.com")
	void WebOfRecord4703() {
		assertEquals("http://www.stephanierashdi.com", customers.get(4702).getWeb());
	}
}
