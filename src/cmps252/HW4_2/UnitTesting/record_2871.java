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

@Tag("3")
class Record_2871 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2871: FirstName is Eula")
	void FirstNameOfRecord2871() {
		assertEquals("Eula", customers.get(2870).getFirstName());
	}

	@Test
	@DisplayName("Record 2871: LastName is Clerk")
	void LastNameOfRecord2871() {
		assertEquals("Clerk", customers.get(2870).getLastName());
	}

	@Test
	@DisplayName("Record 2871: Company is Stephen Hovancsek & Assocs Inc")
	void CompanyOfRecord2871() {
		assertEquals("Stephen Hovancsek & Assocs Inc", customers.get(2870).getCompany());
	}

	@Test
	@DisplayName("Record 2871: Address is 712 Soquel Ave")
	void AddressOfRecord2871() {
		assertEquals("712 Soquel Ave", customers.get(2870).getAddress());
	}

	@Test
	@DisplayName("Record 2871: City is Santa Cruz")
	void CityOfRecord2871() {
		assertEquals("Santa Cruz", customers.get(2870).getCity());
	}

	@Test
	@DisplayName("Record 2871: County is Santa Cruz")
	void CountyOfRecord2871() {
		assertEquals("Santa Cruz", customers.get(2870).getCounty());
	}

	@Test
	@DisplayName("Record 2871: State is CA")
	void StateOfRecord2871() {
		assertEquals("CA", customers.get(2870).getState());
	}

	@Test
	@DisplayName("Record 2871: ZIP is 95062")
	void ZIPOfRecord2871() {
		assertEquals("95062", customers.get(2870).getZIP());
	}

	@Test
	@DisplayName("Record 2871: Phone is 831-438-3201")
	void PhoneOfRecord2871() {
		assertEquals("831-438-3201", customers.get(2870).getPhone());
	}

	@Test
	@DisplayName("Record 2871: Fax is 831-438-4191")
	void FaxOfRecord2871() {
		assertEquals("831-438-4191", customers.get(2870).getFax());
	}

	@Test
	@DisplayName("Record 2871: Email is eula@clerk.com")
	void EmailOfRecord2871() {
		assertEquals("eula@clerk.com", customers.get(2870).getEmail());
	}

	@Test
	@DisplayName("Record 2871: Web is http://www.eulaclerk.com")
	void WebOfRecord2871() {
		assertEquals("http://www.eulaclerk.com", customers.get(2870).getWeb());
	}
}
