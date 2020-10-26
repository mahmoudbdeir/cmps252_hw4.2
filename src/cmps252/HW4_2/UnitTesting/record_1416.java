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

@Tag("23")
class Record_1416 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1416: FirstName is Marcie")
	void FirstNameOfRecord1416() {
		assertEquals("Marcie", customers.get(1415).getFirstName());
	}

	@Test
	@DisplayName("Record 1416: LastName is Knoerzer")
	void LastNameOfRecord1416() {
		assertEquals("Knoerzer", customers.get(1415).getLastName());
	}

	@Test
	@DisplayName("Record 1416: Company is Mannington Wood Floors")
	void CompanyOfRecord1416() {
		assertEquals("Mannington Wood Floors", customers.get(1415).getCompany());
	}

	@Test
	@DisplayName("Record 1416: Address is 3120 W Thomas Rd  #-802")
	void AddressOfRecord1416() {
		assertEquals("3120 W Thomas Rd  #-802", customers.get(1415).getAddress());
	}

	@Test
	@DisplayName("Record 1416: City is Phoenix")
	void CityOfRecord1416() {
		assertEquals("Phoenix", customers.get(1415).getCity());
	}

	@Test
	@DisplayName("Record 1416: County is Maricopa")
	void CountyOfRecord1416() {
		assertEquals("Maricopa", customers.get(1415).getCounty());
	}

	@Test
	@DisplayName("Record 1416: State is AZ")
	void StateOfRecord1416() {
		assertEquals("AZ", customers.get(1415).getState());
	}

	@Test
	@DisplayName("Record 1416: ZIP is 85017")
	void ZIPOfRecord1416() {
		assertEquals("85017", customers.get(1415).getZIP());
	}

	@Test
	@DisplayName("Record 1416: Phone is 602-272-5815")
	void PhoneOfRecord1416() {
		assertEquals("602-272-5815", customers.get(1415).getPhone());
	}

	@Test
	@DisplayName("Record 1416: Fax is 602-272-3027")
	void FaxOfRecord1416() {
		assertEquals("602-272-3027", customers.get(1415).getFax());
	}

	@Test
	@DisplayName("Record 1416: Email is marcie@knoerzer.com")
	void EmailOfRecord1416() {
		assertEquals("marcie@knoerzer.com", customers.get(1415).getEmail());
	}

	@Test
	@DisplayName("Record 1416: Web is http://www.marcieknoerzer.com")
	void WebOfRecord1416() {
		assertEquals("http://www.marcieknoerzer.com", customers.get(1415).getWeb());
	}
}
