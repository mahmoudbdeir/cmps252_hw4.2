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

@Tag("19")
class Record_4036 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4036: FirstName is Eva")
	void FirstNameOfRecord4036() {
		assertEquals("Eva", customers.get(4035).getFirstName());
	}

	@Test
	@DisplayName("Record 4036: LastName is Mccumiskey")
	void LastNameOfRecord4036() {
		assertEquals("Mccumiskey", customers.get(4035).getLastName());
	}

	@Test
	@DisplayName("Record 4036: Company is Nash, Richard H Jr")
	void CompanyOfRecord4036() {
		assertEquals("Nash, Richard H Jr", customers.get(4035).getCompany());
	}

	@Test
	@DisplayName("Record 4036: Address is 2741 Stirrup Dr")
	void AddressOfRecord4036() {
		assertEquals("2741 Stirrup Dr", customers.get(4035).getAddress());
	}

	@Test
	@DisplayName("Record 4036: City is Oakley")
	void CityOfRecord4036() {
		assertEquals("Oakley", customers.get(4035).getCity());
	}

	@Test
	@DisplayName("Record 4036: County is Contra Costa")
	void CountyOfRecord4036() {
		assertEquals("Contra Costa", customers.get(4035).getCounty());
	}

	@Test
	@DisplayName("Record 4036: State is CA")
	void StateOfRecord4036() {
		assertEquals("CA", customers.get(4035).getState());
	}

	@Test
	@DisplayName("Record 4036: ZIP is 94561")
	void ZIPOfRecord4036() {
		assertEquals("94561", customers.get(4035).getZIP());
	}

	@Test
	@DisplayName("Record 4036: Phone is 925-625-5671")
	void PhoneOfRecord4036() {
		assertEquals("925-625-5671", customers.get(4035).getPhone());
	}

	@Test
	@DisplayName("Record 4036: Fax is 925-625-9364")
	void FaxOfRecord4036() {
		assertEquals("925-625-9364", customers.get(4035).getFax());
	}

	@Test
	@DisplayName("Record 4036: Email is eva@mccumiskey.com")
	void EmailOfRecord4036() {
		assertEquals("eva@mccumiskey.com", customers.get(4035).getEmail());
	}

	@Test
	@DisplayName("Record 4036: Web is http://www.evamccumiskey.com")
	void WebOfRecord4036() {
		assertEquals("http://www.evamccumiskey.com", customers.get(4035).getWeb());
	}
}
