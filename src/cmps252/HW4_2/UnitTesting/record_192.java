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

@Tag("46")
class Record_192 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 192: FirstName is Alma")
	void FirstNameOfRecord192() {
		assertEquals("Alma", customers.get(191).getFirstName());
	}

	@Test
	@DisplayName("Record 192: LastName is Cove")
	void LastNameOfRecord192() {
		assertEquals("Cove", customers.get(191).getLastName());
	}

	@Test
	@DisplayName("Record 192: Company is Smith Hinchman & Grylls Assocs")
	void CompanyOfRecord192() {
		assertEquals("Smith Hinchman & Grylls Assocs", customers.get(191).getCompany());
	}

	@Test
	@DisplayName("Record 192: Address is 105 Leeder Hill Dr  #-5")
	void AddressOfRecord192() {
		assertEquals("105 Leeder Hill Dr  #-5", customers.get(191).getAddress());
	}

	@Test
	@DisplayName("Record 192: City is Hamden")
	void CityOfRecord192() {
		assertEquals("Hamden", customers.get(191).getCity());
	}

	@Test
	@DisplayName("Record 192: County is New Haven")
	void CountyOfRecord192() {
		assertEquals("New Haven", customers.get(191).getCounty());
	}

	@Test
	@DisplayName("Record 192: State is CT")
	void StateOfRecord192() {
		assertEquals("CT", customers.get(191).getState());
	}

	@Test
	@DisplayName("Record 192: ZIP is 6517")
	void ZIPOfRecord192() {
		assertEquals("6517", customers.get(191).getZIP());
	}

	@Test
	@DisplayName("Record 192: Phone is 203-230-5172")
	void PhoneOfRecord192() {
		assertEquals("203-230-5172", customers.get(191).getPhone());
	}

	@Test
	@DisplayName("Record 192: Fax is 203-230-3692")
	void FaxOfRecord192() {
		assertEquals("203-230-3692", customers.get(191).getFax());
	}

	@Test
	@DisplayName("Record 192: Email is alma@cove.com")
	void EmailOfRecord192() {
		assertEquals("alma@cove.com", customers.get(191).getEmail());
	}

	@Test
	@DisplayName("Record 192: Web is http://www.almacove.com")
	void WebOfRecord192() {
		assertEquals("http://www.almacove.com", customers.get(191).getWeb());
	}
}
