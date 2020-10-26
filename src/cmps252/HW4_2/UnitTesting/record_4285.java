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

@Tag("44")
class Record_4285 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4285: FirstName is Valarie")
	void FirstNameOfRecord4285() {
		assertEquals("Valarie", customers.get(4284).getFirstName());
	}

	@Test
	@DisplayName("Record 4285: LastName is Zotti")
	void LastNameOfRecord4285() {
		assertEquals("Zotti", customers.get(4284).getLastName());
	}

	@Test
	@DisplayName("Record 4285: Company is Farmers Insurnace Group")
	void CompanyOfRecord4285() {
		assertEquals("Farmers Insurnace Group", customers.get(4284).getCompany());
	}

	@Test
	@DisplayName("Record 4285: Address is 370 17th St  #-2500")
	void AddressOfRecord4285() {
		assertEquals("370 17th St  #-2500", customers.get(4284).getAddress());
	}

	@Test
	@DisplayName("Record 4285: City is Denver")
	void CityOfRecord4285() {
		assertEquals("Denver", customers.get(4284).getCity());
	}

	@Test
	@DisplayName("Record 4285: County is Denver")
	void CountyOfRecord4285() {
		assertEquals("Denver", customers.get(4284).getCounty());
	}

	@Test
	@DisplayName("Record 4285: State is CO")
	void StateOfRecord4285() {
		assertEquals("CO", customers.get(4284).getState());
	}

	@Test
	@DisplayName("Record 4285: ZIP is 80202")
	void ZIPOfRecord4285() {
		assertEquals("80202", customers.get(4284).getZIP());
	}

	@Test
	@DisplayName("Record 4285: Phone is 303-592-6272")
	void PhoneOfRecord4285() {
		assertEquals("303-592-6272", customers.get(4284).getPhone());
	}

	@Test
	@DisplayName("Record 4285: Fax is 303-592-7261")
	void FaxOfRecord4285() {
		assertEquals("303-592-7261", customers.get(4284).getFax());
	}

	@Test
	@DisplayName("Record 4285: Email is valarie@zotti.com")
	void EmailOfRecord4285() {
		assertEquals("valarie@zotti.com", customers.get(4284).getEmail());
	}

	@Test
	@DisplayName("Record 4285: Web is http://www.valariezotti.com")
	void WebOfRecord4285() {
		assertEquals("http://www.valariezotti.com", customers.get(4284).getWeb());
	}
}
