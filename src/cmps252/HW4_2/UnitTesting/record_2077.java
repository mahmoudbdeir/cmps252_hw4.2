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

@Tag("30")
class Record_2077 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2077: FirstName is Leola")
	void FirstNameOfRecord2077() {
		assertEquals("Leola", customers.get(2076).getFirstName());
	}

	@Test
	@DisplayName("Record 2077: LastName is Deets")
	void LastNameOfRecord2077() {
		assertEquals("Deets", customers.get(2076).getLastName());
	}

	@Test
	@DisplayName("Record 2077: Company is Nu Econo Brik Mfg Corp")
	void CompanyOfRecord2077() {
		assertEquals("Nu Econo Brik Mfg Corp", customers.get(2076).getCompany());
	}

	@Test
	@DisplayName("Record 2077: Address is 305 E 46th St")
	void AddressOfRecord2077() {
		assertEquals("305 E 46th St", customers.get(2076).getAddress());
	}

	@Test
	@DisplayName("Record 2077: City is New York")
	void CityOfRecord2077() {
		assertEquals("New York", customers.get(2076).getCity());
	}

	@Test
	@DisplayName("Record 2077: County is New York")
	void CountyOfRecord2077() {
		assertEquals("New York", customers.get(2076).getCounty());
	}

	@Test
	@DisplayName("Record 2077: State is NY")
	void StateOfRecord2077() {
		assertEquals("NY", customers.get(2076).getState());
	}

	@Test
	@DisplayName("Record 2077: ZIP is 10017")
	void ZIPOfRecord2077() {
		assertEquals("10017", customers.get(2076).getZIP());
	}

	@Test
	@DisplayName("Record 2077: Phone is 212-751-1779")
	void PhoneOfRecord2077() {
		assertEquals("212-751-1779", customers.get(2076).getPhone());
	}

	@Test
	@DisplayName("Record 2077: Fax is 212-751-4648")
	void FaxOfRecord2077() {
		assertEquals("212-751-4648", customers.get(2076).getFax());
	}

	@Test
	@DisplayName("Record 2077: Email is leola@deets.com")
	void EmailOfRecord2077() {
		assertEquals("leola@deets.com", customers.get(2076).getEmail());
	}

	@Test
	@DisplayName("Record 2077: Web is http://www.leoladeets.com")
	void WebOfRecord2077() {
		assertEquals("http://www.leoladeets.com", customers.get(2076).getWeb());
	}
}
