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

@Tag("12")
class Record_4790 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4790: FirstName is Jess")
	void FirstNameOfRecord4790() {
		assertEquals("Jess", customers.get(4789).getFirstName());
	}

	@Test
	@DisplayName("Record 4790: LastName is Irizarry")
	void LastNameOfRecord4790() {
		assertEquals("Irizarry", customers.get(4789).getLastName());
	}

	@Test
	@DisplayName("Record 4790: Company is Dr Waterheater")
	void CompanyOfRecord4790() {
		assertEquals("Dr Waterheater", customers.get(4789).getCompany());
	}

	@Test
	@DisplayName("Record 4790: Address is 1502 Route 38")
	void AddressOfRecord4790() {
		assertEquals("1502 Route 38", customers.get(4789).getAddress());
	}

	@Test
	@DisplayName("Record 4790: City is Cherry Hill")
	void CityOfRecord4790() {
		assertEquals("Cherry Hill", customers.get(4789).getCity());
	}

	@Test
	@DisplayName("Record 4790: County is Camden")
	void CountyOfRecord4790() {
		assertEquals("Camden", customers.get(4789).getCounty());
	}

	@Test
	@DisplayName("Record 4790: State is NJ")
	void StateOfRecord4790() {
		assertEquals("NJ", customers.get(4789).getState());
	}

	@Test
	@DisplayName("Record 4790: ZIP is 8002")
	void ZIPOfRecord4790() {
		assertEquals("8002", customers.get(4789).getZIP());
	}

	@Test
	@DisplayName("Record 4790: Phone is 856-488-5331")
	void PhoneOfRecord4790() {
		assertEquals("856-488-5331", customers.get(4789).getPhone());
	}

	@Test
	@DisplayName("Record 4790: Fax is 856-488-3322")
	void FaxOfRecord4790() {
		assertEquals("856-488-3322", customers.get(4789).getFax());
	}

	@Test
	@DisplayName("Record 4790: Email is jess@irizarry.com")
	void EmailOfRecord4790() {
		assertEquals("jess@irizarry.com", customers.get(4789).getEmail());
	}

	@Test
	@DisplayName("Record 4790: Web is http://www.jessirizarry.com")
	void WebOfRecord4790() {
		assertEquals("http://www.jessirizarry.com", customers.get(4789).getWeb());
	}
}
