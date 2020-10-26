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

@Tag("17")
class Record_3464 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3464: FirstName is Warren")
	void FirstNameOfRecord3464() {
		assertEquals("Warren", customers.get(3463).getFirstName());
	}

	@Test
	@DisplayName("Record 3464: LastName is Glunt")
	void LastNameOfRecord3464() {
		assertEquals("Glunt", customers.get(3463).getLastName());
	}

	@Test
	@DisplayName("Record 3464: Company is Copy Cat")
	void CompanyOfRecord3464() {
		assertEquals("Copy Cat", customers.get(3463).getCompany());
	}

	@Test
	@DisplayName("Record 3464: Address is 2825 Rose St")
	void AddressOfRecord3464() {
		assertEquals("2825 Rose St", customers.get(3463).getAddress());
	}

	@Test
	@DisplayName("Record 3464: City is Anchorage")
	void CityOfRecord3464() {
		assertEquals("Anchorage", customers.get(3463).getCity());
	}

	@Test
	@DisplayName("Record 3464: County is Anchorage")
	void CountyOfRecord3464() {
		assertEquals("Anchorage", customers.get(3463).getCounty());
	}

	@Test
	@DisplayName("Record 3464: State is AK")
	void StateOfRecord3464() {
		assertEquals("AK", customers.get(3463).getState());
	}

	@Test
	@DisplayName("Record 3464: ZIP is 99508")
	void ZIPOfRecord3464() {
		assertEquals("99508", customers.get(3463).getZIP());
	}

	@Test
	@DisplayName("Record 3464: Phone is 907-338-2525")
	void PhoneOfRecord3464() {
		assertEquals("907-338-2525", customers.get(3463).getPhone());
	}

	@Test
	@DisplayName("Record 3464: Fax is 907-338-4098")
	void FaxOfRecord3464() {
		assertEquals("907-338-4098", customers.get(3463).getFax());
	}

	@Test
	@DisplayName("Record 3464: Email is warren@glunt.com")
	void EmailOfRecord3464() {
		assertEquals("warren@glunt.com", customers.get(3463).getEmail());
	}

	@Test
	@DisplayName("Record 3464: Web is http://www.warrenglunt.com")
	void WebOfRecord3464() {
		assertEquals("http://www.warrenglunt.com", customers.get(3463).getWeb());
	}
}
