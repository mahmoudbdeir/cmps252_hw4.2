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

@Tag("21")
class Record_3051 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3051: FirstName is Norma")
	void FirstNameOfRecord3051() {
		assertEquals("Norma", customers.get(3050).getFirstName());
	}

	@Test
	@DisplayName("Record 3051: LastName is Tickner")
	void LastNameOfRecord3051() {
		assertEquals("Tickner", customers.get(3050).getLastName());
	}

	@Test
	@DisplayName("Record 3051: Company is Hanson, Victor L Iii")
	void CompanyOfRecord3051() {
		assertEquals("Hanson, Victor L Iii", customers.get(3050).getCompany());
	}

	@Test
	@DisplayName("Record 3051: Address is 14 E 6th Ave")
	void AddressOfRecord3051() {
		assertEquals("14 E 6th Ave", customers.get(3050).getAddress());
	}

	@Test
	@DisplayName("Record 3051: City is Trenton")
	void CityOfRecord3051() {
		assertEquals("Trenton", customers.get(3050).getCity());
	}

	@Test
	@DisplayName("Record 3051: County is Mercer")
	void CountyOfRecord3051() {
		assertEquals("Mercer", customers.get(3050).getCounty());
	}

	@Test
	@DisplayName("Record 3051: State is NJ")
	void StateOfRecord3051() {
		assertEquals("NJ", customers.get(3050).getState());
	}

	@Test
	@DisplayName("Record 3051: ZIP is 8619")
	void ZIPOfRecord3051() {
		assertEquals("8619", customers.get(3050).getZIP());
	}

	@Test
	@DisplayName("Record 3051: Phone is 609-588-3667")
	void PhoneOfRecord3051() {
		assertEquals("609-588-3667", customers.get(3050).getPhone());
	}

	@Test
	@DisplayName("Record 3051: Fax is 609-588-2748")
	void FaxOfRecord3051() {
		assertEquals("609-588-2748", customers.get(3050).getFax());
	}

	@Test
	@DisplayName("Record 3051: Email is norma@tickner.com")
	void EmailOfRecord3051() {
		assertEquals("norma@tickner.com", customers.get(3050).getEmail());
	}

	@Test
	@DisplayName("Record 3051: Web is http://www.normatickner.com")
	void WebOfRecord3051() {
		assertEquals("http://www.normatickner.com", customers.get(3050).getWeb());
	}
}
