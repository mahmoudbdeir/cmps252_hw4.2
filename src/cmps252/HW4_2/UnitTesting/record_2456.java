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

@Tag("43")
class Record_2456 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2456: FirstName is Sasha")
	void FirstNameOfRecord2456() {
		assertEquals("Sasha", customers.get(2455).getFirstName());
	}

	@Test
	@DisplayName("Record 2456: LastName is Coscia")
	void LastNameOfRecord2456() {
		assertEquals("Coscia", customers.get(2455).getLastName());
	}

	@Test
	@DisplayName("Record 2456: Company is 26 Glacier Cruise")
	void CompanyOfRecord2456() {
		assertEquals("26 Glacier Cruise", customers.get(2455).getCompany());
	}

	@Test
	@DisplayName("Record 2456: Address is 108 W 39th St  #-1107")
	void AddressOfRecord2456() {
		assertEquals("108 W 39th St  #-1107", customers.get(2455).getAddress());
	}

	@Test
	@DisplayName("Record 2456: City is New York")
	void CityOfRecord2456() {
		assertEquals("New York", customers.get(2455).getCity());
	}

	@Test
	@DisplayName("Record 2456: County is New York")
	void CountyOfRecord2456() {
		assertEquals("New York", customers.get(2455).getCounty());
	}

	@Test
	@DisplayName("Record 2456: State is NY")
	void StateOfRecord2456() {
		assertEquals("NY", customers.get(2455).getState());
	}

	@Test
	@DisplayName("Record 2456: ZIP is 10018")
	void ZIPOfRecord2456() {
		assertEquals("10018", customers.get(2455).getZIP());
	}

	@Test
	@DisplayName("Record 2456: Phone is 212-302-0405")
	void PhoneOfRecord2456() {
		assertEquals("212-302-0405", customers.get(2455).getPhone());
	}

	@Test
	@DisplayName("Record 2456: Fax is 212-302-9612")
	void FaxOfRecord2456() {
		assertEquals("212-302-9612", customers.get(2455).getFax());
	}

	@Test
	@DisplayName("Record 2456: Email is sasha@coscia.com")
	void EmailOfRecord2456() {
		assertEquals("sasha@coscia.com", customers.get(2455).getEmail());
	}

	@Test
	@DisplayName("Record 2456: Web is http://www.sashacoscia.com")
	void WebOfRecord2456() {
		assertEquals("http://www.sashacoscia.com", customers.get(2455).getWeb());
	}
}
