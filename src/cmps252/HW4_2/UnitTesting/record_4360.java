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

@Tag("27")
class Record_4360 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4360: FirstName is Stacy")
	void FirstNameOfRecord4360() {
		assertEquals("Stacy", customers.get(4359).getFirstName());
	}

	@Test
	@DisplayName("Record 4360: LastName is Guilbeau")
	void LastNameOfRecord4360() {
		assertEquals("Guilbeau", customers.get(4359).getLastName());
	}

	@Test
	@DisplayName("Record 4360: Company is Penasee Globe")
	void CompanyOfRecord4360() {
		assertEquals("Penasee Globe", customers.get(4359).getCompany());
	}

	@Test
	@DisplayName("Record 4360: Address is 1819 Elm St")
	void AddressOfRecord4360() {
		assertEquals("1819 Elm St", customers.get(4359).getAddress());
	}

	@Test
	@DisplayName("Record 4360: City is Manchester")
	void CityOfRecord4360() {
		assertEquals("Manchester", customers.get(4359).getCity());
	}

	@Test
	@DisplayName("Record 4360: County is Hillsborough")
	void CountyOfRecord4360() {
		assertEquals("Hillsborough", customers.get(4359).getCounty());
	}

	@Test
	@DisplayName("Record 4360: State is NH")
	void StateOfRecord4360() {
		assertEquals("NH", customers.get(4359).getState());
	}

	@Test
	@DisplayName("Record 4360: ZIP is 3104")
	void ZIPOfRecord4360() {
		assertEquals("3104", customers.get(4359).getZIP());
	}

	@Test
	@DisplayName("Record 4360: Phone is 603-666-8762")
	void PhoneOfRecord4360() {
		assertEquals("603-666-8762", customers.get(4359).getPhone());
	}

	@Test
	@DisplayName("Record 4360: Fax is 603-666-0083")
	void FaxOfRecord4360() {
		assertEquals("603-666-0083", customers.get(4359).getFax());
	}

	@Test
	@DisplayName("Record 4360: Email is stacy@guilbeau.com")
	void EmailOfRecord4360() {
		assertEquals("stacy@guilbeau.com", customers.get(4359).getEmail());
	}

	@Test
	@DisplayName("Record 4360: Web is http://www.stacyguilbeau.com")
	void WebOfRecord4360() {
		assertEquals("http://www.stacyguilbeau.com", customers.get(4359).getWeb());
	}
}
