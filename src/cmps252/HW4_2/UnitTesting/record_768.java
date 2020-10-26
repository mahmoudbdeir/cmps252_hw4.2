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

@Tag("41")
class Record_768 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 768: FirstName is Nanette")
	void FirstNameOfRecord768() {
		assertEquals("Nanette", customers.get(767).getFirstName());
	}

	@Test
	@DisplayName("Record 768: LastName is Parslow")
	void LastNameOfRecord768() {
		assertEquals("Parslow", customers.get(767).getLastName());
	}

	@Test
	@DisplayName("Record 768: Company is C R E S Co")
	void CompanyOfRecord768() {
		assertEquals("C R E S Co", customers.get(767).getCompany());
	}

	@Test
	@DisplayName("Record 768: Address is 2145 Nottingham Way")
	void AddressOfRecord768() {
		assertEquals("2145 Nottingham Way", customers.get(767).getAddress());
	}

	@Test
	@DisplayName("Record 768: City is Trenton")
	void CityOfRecord768() {
		assertEquals("Trenton", customers.get(767).getCity());
	}

	@Test
	@DisplayName("Record 768: County is Mercer")
	void CountyOfRecord768() {
		assertEquals("Mercer", customers.get(767).getCounty());
	}

	@Test
	@DisplayName("Record 768: State is NJ")
	void StateOfRecord768() {
		assertEquals("NJ", customers.get(767).getState());
	}

	@Test
	@DisplayName("Record 768: ZIP is 8619")
	void ZIPOfRecord768() {
		assertEquals("8619", customers.get(767).getZIP());
	}

	@Test
	@DisplayName("Record 768: Phone is 609-587-2746")
	void PhoneOfRecord768() {
		assertEquals("609-587-2746", customers.get(767).getPhone());
	}

	@Test
	@DisplayName("Record 768: Fax is 609-587-2857")
	void FaxOfRecord768() {
		assertEquals("609-587-2857", customers.get(767).getFax());
	}

	@Test
	@DisplayName("Record 768: Email is nanette@parslow.com")
	void EmailOfRecord768() {
		assertEquals("nanette@parslow.com", customers.get(767).getEmail());
	}

	@Test
	@DisplayName("Record 768: Web is http://www.nanetteparslow.com")
	void WebOfRecord768() {
		assertEquals("http://www.nanetteparslow.com", customers.get(767).getWeb());
	}
}
