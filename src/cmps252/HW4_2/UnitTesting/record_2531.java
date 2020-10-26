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

@Tag("29")
class Record_2531 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2531: FirstName is Ivan")
	void FirstNameOfRecord2531() {
		assertEquals("Ivan", customers.get(2530).getFirstName());
	}

	@Test
	@DisplayName("Record 2531: LastName is Plants")
	void LastNameOfRecord2531() {
		assertEquals("Plants", customers.get(2530).getLastName());
	}

	@Test
	@DisplayName("Record 2531: Company is Marchant, Linda S Cpa")
	void CompanyOfRecord2531() {
		assertEquals("Marchant, Linda S Cpa", customers.get(2530).getCompany());
	}

	@Test
	@DisplayName("Record 2531: Address is 5501 Lyndon B Johnson Fwy")
	void AddressOfRecord2531() {
		assertEquals("5501 Lyndon B Johnson Fwy", customers.get(2530).getAddress());
	}

	@Test
	@DisplayName("Record 2531: City is Dallas")
	void CityOfRecord2531() {
		assertEquals("Dallas", customers.get(2530).getCity());
	}

	@Test
	@DisplayName("Record 2531: County is Dallas")
	void CountyOfRecord2531() {
		assertEquals("Dallas", customers.get(2530).getCounty());
	}

	@Test
	@DisplayName("Record 2531: State is TX")
	void StateOfRecord2531() {
		assertEquals("TX", customers.get(2530).getState());
	}

	@Test
	@DisplayName("Record 2531: ZIP is 75240")
	void ZIPOfRecord2531() {
		assertEquals("75240", customers.get(2530).getZIP());
	}

	@Test
	@DisplayName("Record 2531: Phone is 214-308-9747")
	void PhoneOfRecord2531() {
		assertEquals("214-308-9747", customers.get(2530).getPhone());
	}

	@Test
	@DisplayName("Record 2531: Fax is 214-308-2635")
	void FaxOfRecord2531() {
		assertEquals("214-308-2635", customers.get(2530).getFax());
	}

	@Test
	@DisplayName("Record 2531: Email is ivan@plants.com")
	void EmailOfRecord2531() {
		assertEquals("ivan@plants.com", customers.get(2530).getEmail());
	}

	@Test
	@DisplayName("Record 2531: Web is http://www.ivanplants.com")
	void WebOfRecord2531() {
		assertEquals("http://www.ivanplants.com", customers.get(2530).getWeb());
	}
}
