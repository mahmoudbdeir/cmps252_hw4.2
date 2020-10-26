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
class Record_498 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 498: FirstName is Shanna")
	void FirstNameOfRecord498() {
		assertEquals("Shanna", customers.get(497).getFirstName());
	}

	@Test
	@DisplayName("Record 498: LastName is Seward")
	void LastNameOfRecord498() {
		assertEquals("Seward", customers.get(497).getLastName());
	}

	@Test
	@DisplayName("Record 498: Company is Best Western Golden Link Lodge")
	void CompanyOfRecord498() {
		assertEquals("Best Western Golden Link Lodge", customers.get(497).getCompany());
	}

	@Test
	@DisplayName("Record 498: Address is 418 Whalley Ave")
	void AddressOfRecord498() {
		assertEquals("418 Whalley Ave", customers.get(497).getAddress());
	}

	@Test
	@DisplayName("Record 498: City is New Haven")
	void CityOfRecord498() {
		assertEquals("New Haven", customers.get(497).getCity());
	}

	@Test
	@DisplayName("Record 498: County is New Haven")
	void CountyOfRecord498() {
		assertEquals("New Haven", customers.get(497).getCounty());
	}

	@Test
	@DisplayName("Record 498: State is CT")
	void StateOfRecord498() {
		assertEquals("CT", customers.get(497).getState());
	}

	@Test
	@DisplayName("Record 498: ZIP is 6511")
	void ZIPOfRecord498() {
		assertEquals("6511", customers.get(497).getZIP());
	}

	@Test
	@DisplayName("Record 498: Phone is 203-562-6197")
	void PhoneOfRecord498() {
		assertEquals("203-562-6197", customers.get(497).getPhone());
	}

	@Test
	@DisplayName("Record 498: Fax is 203-562-3368")
	void FaxOfRecord498() {
		assertEquals("203-562-3368", customers.get(497).getFax());
	}

	@Test
	@DisplayName("Record 498: Email is shanna@seward.com")
	void EmailOfRecord498() {
		assertEquals("shanna@seward.com", customers.get(497).getEmail());
	}

	@Test
	@DisplayName("Record 498: Web is http://www.shannaseward.com")
	void WebOfRecord498() {
		assertEquals("http://www.shannaseward.com", customers.get(497).getWeb());
	}
}
