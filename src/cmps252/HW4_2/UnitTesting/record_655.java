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

@Tag("15")
class Record_655 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 655: FirstName is Sydney")
	void FirstNameOfRecord655() {
		assertEquals("Sydney", customers.get(654).getFirstName());
	}

	@Test
	@DisplayName("Record 655: LastName is Aldrow")
	void LastNameOfRecord655() {
		assertEquals("Aldrow", customers.get(654).getLastName());
	}

	@Test
	@DisplayName("Record 655: Company is Evansburg Tool Corp")
	void CompanyOfRecord655() {
		assertEquals("Evansburg Tool Corp", customers.get(654).getCompany());
	}

	@Test
	@DisplayName("Record 655: Address is 783 Annapolis Rd")
	void AddressOfRecord655() {
		assertEquals("783 Annapolis Rd", customers.get(654).getAddress());
	}

	@Test
	@DisplayName("Record 655: City is Gambrills")
	void CityOfRecord655() {
		assertEquals("Gambrills", customers.get(654).getCity());
	}

	@Test
	@DisplayName("Record 655: County is Anne Arundel")
	void CountyOfRecord655() {
		assertEquals("Anne Arundel", customers.get(654).getCounty());
	}

	@Test
	@DisplayName("Record 655: State is MD")
	void StateOfRecord655() {
		assertEquals("MD", customers.get(654).getState());
	}

	@Test
	@DisplayName("Record 655: ZIP is 21054")
	void ZIPOfRecord655() {
		assertEquals("21054", customers.get(654).getZIP());
	}

	@Test
	@DisplayName("Record 655: Phone is 410-987-0833")
	void PhoneOfRecord655() {
		assertEquals("410-987-0833", customers.get(654).getPhone());
	}

	@Test
	@DisplayName("Record 655: Fax is 410-987-6987")
	void FaxOfRecord655() {
		assertEquals("410-987-6987", customers.get(654).getFax());
	}

	@Test
	@DisplayName("Record 655: Email is sydney@aldrow.com")
	void EmailOfRecord655() {
		assertEquals("sydney@aldrow.com", customers.get(654).getEmail());
	}

	@Test
	@DisplayName("Record 655: Web is http://www.sydneyaldrow.com")
	void WebOfRecord655() {
		assertEquals("http://www.sydneyaldrow.com", customers.get(654).getWeb());
	}
}
