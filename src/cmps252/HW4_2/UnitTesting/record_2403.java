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

@Tag("10")
class Record_2403 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2403: FirstName is Nilda")
	void FirstNameOfRecord2403() {
		assertEquals("Nilda", customers.get(2402).getFirstName());
	}

	@Test
	@DisplayName("Record 2403: LastName is Tutoni")
	void LastNameOfRecord2403() {
		assertEquals("Tutoni", customers.get(2402).getLastName());
	}

	@Test
	@DisplayName("Record 2403: Company is South St Louis Rehab Inst Inc")
	void CompanyOfRecord2403() {
		assertEquals("South St Louis Rehab Inst Inc", customers.get(2402).getCompany());
	}

	@Test
	@DisplayName("Record 2403: Address is 436 Princeton Ave")
	void AddressOfRecord2403() {
		assertEquals("436 Princeton Ave", customers.get(2402).getAddress());
	}

	@Test
	@DisplayName("Record 2403: City is Trenton")
	void CityOfRecord2403() {
		assertEquals("Trenton", customers.get(2402).getCity());
	}

	@Test
	@DisplayName("Record 2403: County is Mercer")
	void CountyOfRecord2403() {
		assertEquals("Mercer", customers.get(2402).getCounty());
	}

	@Test
	@DisplayName("Record 2403: State is NJ")
	void StateOfRecord2403() {
		assertEquals("NJ", customers.get(2402).getState());
	}

	@Test
	@DisplayName("Record 2403: ZIP is 8619")
	void ZIPOfRecord2403() {
		assertEquals("8619", customers.get(2402).getZIP());
	}

	@Test
	@DisplayName("Record 2403: Phone is 609-586-5109")
	void PhoneOfRecord2403() {
		assertEquals("609-586-5109", customers.get(2402).getPhone());
	}

	@Test
	@DisplayName("Record 2403: Fax is 609-586-9069")
	void FaxOfRecord2403() {
		assertEquals("609-586-9069", customers.get(2402).getFax());
	}

	@Test
	@DisplayName("Record 2403: Email is nilda@tutoni.com")
	void EmailOfRecord2403() {
		assertEquals("nilda@tutoni.com", customers.get(2402).getEmail());
	}

	@Test
	@DisplayName("Record 2403: Web is http://www.nildatutoni.com")
	void WebOfRecord2403() {
		assertEquals("http://www.nildatutoni.com", customers.get(2402).getWeb());
	}
}
