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
class Record_450 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 450: FirstName is Chester")
	void FirstNameOfRecord450() {
		assertEquals("Chester", customers.get(449).getFirstName());
	}

	@Test
	@DisplayName("Record 450: LastName is Giannattasio")
	void LastNameOfRecord450() {
		assertEquals("Giannattasio", customers.get(449).getLastName());
	}

	@Test
	@DisplayName("Record 450: Company is Reed, William E Iii")
	void CompanyOfRecord450() {
		assertEquals("Reed, William E Iii", customers.get(449).getCompany());
	}

	@Test
	@DisplayName("Record 450: Address is 335 N Maple Ave")
	void AddressOfRecord450() {
		assertEquals("335 N Maple Ave", customers.get(449).getAddress());
	}

	@Test
	@DisplayName("Record 450: City is Martinsburg")
	void CityOfRecord450() {
		assertEquals("Martinsburg", customers.get(449).getCity());
	}

	@Test
	@DisplayName("Record 450: County is Berkeley")
	void CountyOfRecord450() {
		assertEquals("Berkeley", customers.get(449).getCounty());
	}

	@Test
	@DisplayName("Record 450: State is WV")
	void StateOfRecord450() {
		assertEquals("WV", customers.get(449).getState());
	}

	@Test
	@DisplayName("Record 450: ZIP is 25401")
	void ZIPOfRecord450() {
		assertEquals("25401", customers.get(449).getZIP());
	}

	@Test
	@DisplayName("Record 450: Phone is 304-263-6241")
	void PhoneOfRecord450() {
		assertEquals("304-263-6241", customers.get(449).getPhone());
	}

	@Test
	@DisplayName("Record 450: Fax is 304-263-0093")
	void FaxOfRecord450() {
		assertEquals("304-263-0093", customers.get(449).getFax());
	}

	@Test
	@DisplayName("Record 450: Email is chester@giannattasio.com")
	void EmailOfRecord450() {
		assertEquals("chester@giannattasio.com", customers.get(449).getEmail());
	}

	@Test
	@DisplayName("Record 450: Web is http://www.chestergiannattasio.com")
	void WebOfRecord450() {
		assertEquals("http://www.chestergiannattasio.com", customers.get(449).getWeb());
	}
}
