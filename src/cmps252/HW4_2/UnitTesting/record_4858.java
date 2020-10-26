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

@Tag("5")
class Record_4858 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4858: FirstName is Cornell")
	void FirstNameOfRecord4858() {
		assertEquals("Cornell", customers.get(4857).getFirstName());
	}

	@Test
	@DisplayName("Record 4858: LastName is Nordsiek")
	void LastNameOfRecord4858() {
		assertEquals("Nordsiek", customers.get(4857).getLastName());
	}

	@Test
	@DisplayName("Record 4858: Company is Lvs Golf Carts")
	void CompanyOfRecord4858() {
		assertEquals("Lvs Golf Carts", customers.get(4857).getCompany());
	}

	@Test
	@DisplayName("Record 4858: Address is 30 E Central Pky")
	void AddressOfRecord4858() {
		assertEquals("30 E Central Pky", customers.get(4857).getAddress());
	}

	@Test
	@DisplayName("Record 4858: City is Cincinnati")
	void CityOfRecord4858() {
		assertEquals("Cincinnati", customers.get(4857).getCity());
	}

	@Test
	@DisplayName("Record 4858: County is Hamilton")
	void CountyOfRecord4858() {
		assertEquals("Hamilton", customers.get(4857).getCounty());
	}

	@Test
	@DisplayName("Record 4858: State is OH")
	void StateOfRecord4858() {
		assertEquals("OH", customers.get(4857).getState());
	}

	@Test
	@DisplayName("Record 4858: ZIP is 45202")
	void ZIPOfRecord4858() {
		assertEquals("45202", customers.get(4857).getZIP());
	}

	@Test
	@DisplayName("Record 4858: Phone is 513-421-0705")
	void PhoneOfRecord4858() {
		assertEquals("513-421-0705", customers.get(4857).getPhone());
	}

	@Test
	@DisplayName("Record 4858: Fax is 513-421-0721")
	void FaxOfRecord4858() {
		assertEquals("513-421-0721", customers.get(4857).getFax());
	}

	@Test
	@DisplayName("Record 4858: Email is cornell@nordsiek.com")
	void EmailOfRecord4858() {
		assertEquals("cornell@nordsiek.com", customers.get(4857).getEmail());
	}

	@Test
	@DisplayName("Record 4858: Web is http://www.cornellnordsiek.com")
	void WebOfRecord4858() {
		assertEquals("http://www.cornellnordsiek.com", customers.get(4857).getWeb());
	}
}
