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

@Tag("6")
class Record_4983 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4983: FirstName is Kenton")
	void FirstNameOfRecord4983() {
		assertEquals("Kenton", customers.get(4982).getFirstName());
	}

	@Test
	@DisplayName("Record 4983: LastName is Vandamme")
	void LastNameOfRecord4983() {
		assertEquals("Vandamme", customers.get(4982).getLastName());
	}

	@Test
	@DisplayName("Record 4983: Company is United States Business Center")
	void CompanyOfRecord4983() {
		assertEquals("United States Business Center", customers.get(4982).getCompany());
	}

	@Test
	@DisplayName("Record 4983: Address is 407 N 5th Ave")
	void AddressOfRecord4983() {
		assertEquals("407 N 5th Ave", customers.get(4982).getAddress());
	}

	@Test
	@DisplayName("Record 4983: City is Ann Arbor")
	void CityOfRecord4983() {
		assertEquals("Ann Arbor", customers.get(4982).getCity());
	}

	@Test
	@DisplayName("Record 4983: County is Washtenaw")
	void CountyOfRecord4983() {
		assertEquals("Washtenaw", customers.get(4982).getCounty());
	}

	@Test
	@DisplayName("Record 4983: State is MI")
	void StateOfRecord4983() {
		assertEquals("MI", customers.get(4982).getState());
	}

	@Test
	@DisplayName("Record 4983: ZIP is 48104")
	void ZIPOfRecord4983() {
		assertEquals("48104", customers.get(4982).getZIP());
	}

	@Test
	@DisplayName("Record 4983: Phone is 734-663-5948")
	void PhoneOfRecord4983() {
		assertEquals("734-663-5948", customers.get(4982).getPhone());
	}

	@Test
	@DisplayName("Record 4983: Fax is 734-663-0267")
	void FaxOfRecord4983() {
		assertEquals("734-663-0267", customers.get(4982).getFax());
	}

	@Test
	@DisplayName("Record 4983: Email is kenton@vandamme.com")
	void EmailOfRecord4983() {
		assertEquals("kenton@vandamme.com", customers.get(4982).getEmail());
	}

	@Test
	@DisplayName("Record 4983: Web is http://www.kentonvandamme.com")
	void WebOfRecord4983() {
		assertEquals("http://www.kentonvandamme.com", customers.get(4982).getWeb());
	}
}
