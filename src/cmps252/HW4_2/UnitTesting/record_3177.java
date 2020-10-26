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

@Tag("38")
class Record_3177 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3177: FirstName is Tessie")
	void FirstNameOfRecord3177() {
		assertEquals("Tessie", customers.get(3176).getFirstName());
	}

	@Test
	@DisplayName("Record 3177: LastName is Mankin")
	void LastNameOfRecord3177() {
		assertEquals("Mankin", customers.get(3176).getLastName());
	}

	@Test
	@DisplayName("Record 3177: Company is Economy Savings Bank Pasa")
	void CompanyOfRecord3177() {
		assertEquals("Economy Savings Bank Pasa", customers.get(3176).getCompany());
	}

	@Test
	@DisplayName("Record 3177: Address is 1318 E State St")
	void AddressOfRecord3177() {
		assertEquals("1318 E State St", customers.get(3176).getAddress());
	}

	@Test
	@DisplayName("Record 3177: City is Rockford")
	void CityOfRecord3177() {
		assertEquals("Rockford", customers.get(3176).getCity());
	}

	@Test
	@DisplayName("Record 3177: County is Winnebago")
	void CountyOfRecord3177() {
		assertEquals("Winnebago", customers.get(3176).getCounty());
	}

	@Test
	@DisplayName("Record 3177: State is IL")
	void StateOfRecord3177() {
		assertEquals("IL", customers.get(3176).getState());
	}

	@Test
	@DisplayName("Record 3177: ZIP is 61104")
	void ZIPOfRecord3177() {
		assertEquals("61104", customers.get(3176).getZIP());
	}

	@Test
	@DisplayName("Record 3177: Phone is 815-965-9634")
	void PhoneOfRecord3177() {
		assertEquals("815-965-9634", customers.get(3176).getPhone());
	}

	@Test
	@DisplayName("Record 3177: Fax is 815-965-1929")
	void FaxOfRecord3177() {
		assertEquals("815-965-1929", customers.get(3176).getFax());
	}

	@Test
	@DisplayName("Record 3177: Email is tessie@mankin.com")
	void EmailOfRecord3177() {
		assertEquals("tessie@mankin.com", customers.get(3176).getEmail());
	}

	@Test
	@DisplayName("Record 3177: Web is http://www.tessiemankin.com")
	void WebOfRecord3177() {
		assertEquals("http://www.tessiemankin.com", customers.get(3176).getWeb());
	}
}
