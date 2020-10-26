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
class Record_1723 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1723: FirstName is Sally")
	void FirstNameOfRecord1723() {
		assertEquals("Sally", customers.get(1722).getFirstName());
	}

	@Test
	@DisplayName("Record 1723: LastName is Jungen")
	void LastNameOfRecord1723() {
		assertEquals("Jungen", customers.get(1722).getLastName());
	}

	@Test
	@DisplayName("Record 1723: Company is Mcdonald & Assocs Chrtrd")
	void CompanyOfRecord1723() {
		assertEquals("Mcdonald & Assocs Chrtrd", customers.get(1722).getCompany());
	}

	@Test
	@DisplayName("Record 1723: Address is 580 W 19th St")
	void AddressOfRecord1723() {
		assertEquals("580 W 19th St", customers.get(1722).getAddress());
	}

	@Test
	@DisplayName("Record 1723: City is Idaho Falls")
	void CityOfRecord1723() {
		assertEquals("Idaho Falls", customers.get(1722).getCity());
	}

	@Test
	@DisplayName("Record 1723: County is Bonneville")
	void CountyOfRecord1723() {
		assertEquals("Bonneville", customers.get(1722).getCounty());
	}

	@Test
	@DisplayName("Record 1723: State is ID")
	void StateOfRecord1723() {
		assertEquals("ID", customers.get(1722).getState());
	}

	@Test
	@DisplayName("Record 1723: ZIP is 83402")
	void ZIPOfRecord1723() {
		assertEquals("83402", customers.get(1722).getZIP());
	}

	@Test
	@DisplayName("Record 1723: Phone is 208-529-0045")
	void PhoneOfRecord1723() {
		assertEquals("208-529-0045", customers.get(1722).getPhone());
	}

	@Test
	@DisplayName("Record 1723: Fax is 208-529-9987")
	void FaxOfRecord1723() {
		assertEquals("208-529-9987", customers.get(1722).getFax());
	}

	@Test
	@DisplayName("Record 1723: Email is sally@jungen.com")
	void EmailOfRecord1723() {
		assertEquals("sally@jungen.com", customers.get(1722).getEmail());
	}

	@Test
	@DisplayName("Record 1723: Web is http://www.sallyjungen.com")
	void WebOfRecord1723() {
		assertEquals("http://www.sallyjungen.com", customers.get(1722).getWeb());
	}
}
