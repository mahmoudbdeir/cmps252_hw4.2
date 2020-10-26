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

@Tag("8")
class Record_2789 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2789: FirstName is Marian")
	void FirstNameOfRecord2789() {
		assertEquals("Marian", customers.get(2788).getFirstName());
	}

	@Test
	@DisplayName("Record 2789: LastName is Goelz")
	void LastNameOfRecord2789() {
		assertEquals("Goelz", customers.get(2788).getLastName());
	}

	@Test
	@DisplayName("Record 2789: Company is Myers, Morey M Esq")
	void CompanyOfRecord2789() {
		assertEquals("Myers, Morey M Esq", customers.get(2788).getCompany());
	}

	@Test
	@DisplayName("Record 2789: Address is 5801 Rolling Rd")
	void AddressOfRecord2789() {
		assertEquals("5801 Rolling Rd", customers.get(2788).getAddress());
	}

	@Test
	@DisplayName("Record 2789: City is Springfield")
	void CityOfRecord2789() {
		assertEquals("Springfield", customers.get(2788).getCity());
	}

	@Test
	@DisplayName("Record 2789: County is Fairfax")
	void CountyOfRecord2789() {
		assertEquals("Fairfax", customers.get(2788).getCounty());
	}

	@Test
	@DisplayName("Record 2789: State is VA")
	void StateOfRecord2789() {
		assertEquals("VA", customers.get(2788).getState());
	}

	@Test
	@DisplayName("Record 2789: ZIP is 22152")
	void ZIPOfRecord2789() {
		assertEquals("22152", customers.get(2788).getZIP());
	}

	@Test
	@DisplayName("Record 2789: Phone is 703-569-1322")
	void PhoneOfRecord2789() {
		assertEquals("703-569-1322", customers.get(2788).getPhone());
	}

	@Test
	@DisplayName("Record 2789: Fax is 703-569-2347")
	void FaxOfRecord2789() {
		assertEquals("703-569-2347", customers.get(2788).getFax());
	}

	@Test
	@DisplayName("Record 2789: Email is marian@goelz.com")
	void EmailOfRecord2789() {
		assertEquals("marian@goelz.com", customers.get(2788).getEmail());
	}

	@Test
	@DisplayName("Record 2789: Web is http://www.mariangoelz.com")
	void WebOfRecord2789() {
		assertEquals("http://www.mariangoelz.com", customers.get(2788).getWeb());
	}
}
