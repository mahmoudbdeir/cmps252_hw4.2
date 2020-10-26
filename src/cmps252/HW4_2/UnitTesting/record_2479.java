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

@Tag("48")
class Record_2479 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2479: FirstName is Norbert")
	void FirstNameOfRecord2479() {
		assertEquals("Norbert", customers.get(2478).getFirstName());
	}

	@Test
	@DisplayName("Record 2479: LastName is Parma")
	void LastNameOfRecord2479() {
		assertEquals("Parma", customers.get(2478).getLastName());
	}

	@Test
	@DisplayName("Record 2479: Company is Trinodal Systems Corp")
	void CompanyOfRecord2479() {
		assertEquals("Trinodal Systems Corp", customers.get(2478).getCompany());
	}

	@Test
	@DisplayName("Record 2479: Address is 204 Stratford Ave")
	void AddressOfRecord2479() {
		assertEquals("204 Stratford Ave", customers.get(2478).getAddress());
	}

	@Test
	@DisplayName("Record 2479: City is Collingswood")
	void CityOfRecord2479() {
		assertEquals("Collingswood", customers.get(2478).getCity());
	}

	@Test
	@DisplayName("Record 2479: County is Camden")
	void CountyOfRecord2479() {
		assertEquals("Camden", customers.get(2478).getCounty());
	}

	@Test
	@DisplayName("Record 2479: State is NJ")
	void StateOfRecord2479() {
		assertEquals("NJ", customers.get(2478).getState());
	}

	@Test
	@DisplayName("Record 2479: ZIP is 8108")
	void ZIPOfRecord2479() {
		assertEquals("8108", customers.get(2478).getZIP());
	}

	@Test
	@DisplayName("Record 2479: Phone is 856-858-3208")
	void PhoneOfRecord2479() {
		assertEquals("856-858-3208", customers.get(2478).getPhone());
	}

	@Test
	@DisplayName("Record 2479: Fax is 856-858-9133")
	void FaxOfRecord2479() {
		assertEquals("856-858-9133", customers.get(2478).getFax());
	}

	@Test
	@DisplayName("Record 2479: Email is norbert@parma.com")
	void EmailOfRecord2479() {
		assertEquals("norbert@parma.com", customers.get(2478).getEmail());
	}

	@Test
	@DisplayName("Record 2479: Web is http://www.norbertparma.com")
	void WebOfRecord2479() {
		assertEquals("http://www.norbertparma.com", customers.get(2478).getWeb());
	}
}
