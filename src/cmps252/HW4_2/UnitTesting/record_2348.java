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

@Tag("31")
class Record_2348 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2348: FirstName is Rory")
	void FirstNameOfRecord2348() {
		assertEquals("Rory", customers.get(2347).getFirstName());
	}

	@Test
	@DisplayName("Record 2348: LastName is Dayao")
	void LastNameOfRecord2348() {
		assertEquals("Dayao", customers.get(2347).getLastName());
	}

	@Test
	@DisplayName("Record 2348: Company is Mac Plastics Inc")
	void CompanyOfRecord2348() {
		assertEquals("Mac Plastics Inc", customers.get(2347).getCompany());
	}

	@Test
	@DisplayName("Record 2348: Address is 2115 W Central Blvd")
	void AddressOfRecord2348() {
		assertEquals("2115 W Central Blvd", customers.get(2347).getAddress());
	}

	@Test
	@DisplayName("Record 2348: City is Orlando")
	void CityOfRecord2348() {
		assertEquals("Orlando", customers.get(2347).getCity());
	}

	@Test
	@DisplayName("Record 2348: County is Orange")
	void CountyOfRecord2348() {
		assertEquals("Orange", customers.get(2347).getCounty());
	}

	@Test
	@DisplayName("Record 2348: State is FL")
	void StateOfRecord2348() {
		assertEquals("FL", customers.get(2347).getState());
	}

	@Test
	@DisplayName("Record 2348: ZIP is 32805")
	void ZIPOfRecord2348() {
		assertEquals("32805", customers.get(2347).getZIP());
	}

	@Test
	@DisplayName("Record 2348: Phone is 407-841-7779")
	void PhoneOfRecord2348() {
		assertEquals("407-841-7779", customers.get(2347).getPhone());
	}

	@Test
	@DisplayName("Record 2348: Fax is 407-841-3373")
	void FaxOfRecord2348() {
		assertEquals("407-841-3373", customers.get(2347).getFax());
	}

	@Test
	@DisplayName("Record 2348: Email is rory@dayao.com")
	void EmailOfRecord2348() {
		assertEquals("rory@dayao.com", customers.get(2347).getEmail());
	}

	@Test
	@DisplayName("Record 2348: Web is http://www.rorydayao.com")
	void WebOfRecord2348() {
		assertEquals("http://www.rorydayao.com", customers.get(2347).getWeb());
	}
}
