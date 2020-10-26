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

@Tag("37")
class Record_2048 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2048: FirstName is Franklyn")
	void FirstNameOfRecord2048() {
		assertEquals("Franklyn", customers.get(2047).getFirstName());
	}

	@Test
	@DisplayName("Record 2048: LastName is Vandestreek")
	void LastNameOfRecord2048() {
		assertEquals("Vandestreek", customers.get(2047).getLastName());
	}

	@Test
	@DisplayName("Record 2048: Company is Lee & Lee Financial Services")
	void CompanyOfRecord2048() {
		assertEquals("Lee & Lee Financial Services", customers.get(2047).getCompany());
	}

	@Test
	@DisplayName("Record 2048: Address is 1109 Emerson St")
	void AddressOfRecord2048() {
		assertEquals("1109 Emerson St", customers.get(2047).getAddress());
	}

	@Test
	@DisplayName("Record 2048: City is Evanston")
	void CityOfRecord2048() {
		assertEquals("Evanston", customers.get(2047).getCity());
	}

	@Test
	@DisplayName("Record 2048: County is Cook")
	void CountyOfRecord2048() {
		assertEquals("Cook", customers.get(2047).getCounty());
	}

	@Test
	@DisplayName("Record 2048: State is IL")
	void StateOfRecord2048() {
		assertEquals("IL", customers.get(2047).getState());
	}

	@Test
	@DisplayName("Record 2048: ZIP is 60201")
	void ZIPOfRecord2048() {
		assertEquals("60201", customers.get(2047).getZIP());
	}

	@Test
	@DisplayName("Record 2048: Phone is 847-328-9858")
	void PhoneOfRecord2048() {
		assertEquals("847-328-9858", customers.get(2047).getPhone());
	}

	@Test
	@DisplayName("Record 2048: Fax is 847-328-6451")
	void FaxOfRecord2048() {
		assertEquals("847-328-6451", customers.get(2047).getFax());
	}

	@Test
	@DisplayName("Record 2048: Email is franklyn@vandestreek.com")
	void EmailOfRecord2048() {
		assertEquals("franklyn@vandestreek.com", customers.get(2047).getEmail());
	}

	@Test
	@DisplayName("Record 2048: Web is http://www.franklynvandestreek.com")
	void WebOfRecord2048() {
		assertEquals("http://www.franklynvandestreek.com", customers.get(2047).getWeb());
	}
}
