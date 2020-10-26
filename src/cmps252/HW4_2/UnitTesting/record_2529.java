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

@Tag("27")
class Record_2529 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2529: FirstName is Marshall")
	void FirstNameOfRecord2529() {
		assertEquals("Marshall", customers.get(2528).getFirstName());
	}

	@Test
	@DisplayName("Record 2529: LastName is Warmbier")
	void LastNameOfRecord2529() {
		assertEquals("Warmbier", customers.get(2528).getLastName());
	}

	@Test
	@DisplayName("Record 2529: Company is Klayman Pants Co")
	void CompanyOfRecord2529() {
		assertEquals("Klayman Pants Co", customers.get(2528).getCompany());
	}

	@Test
	@DisplayName("Record 2529: Address is 5550 Touhy Ave")
	void AddressOfRecord2529() {
		assertEquals("5550 Touhy Ave", customers.get(2528).getAddress());
	}

	@Test
	@DisplayName("Record 2529: City is Skokie")
	void CityOfRecord2529() {
		assertEquals("Skokie", customers.get(2528).getCity());
	}

	@Test
	@DisplayName("Record 2529: County is Cook")
	void CountyOfRecord2529() {
		assertEquals("Cook", customers.get(2528).getCounty());
	}

	@Test
	@DisplayName("Record 2529: State is IL")
	void StateOfRecord2529() {
		assertEquals("IL", customers.get(2528).getState());
	}

	@Test
	@DisplayName("Record 2529: ZIP is 60077")
	void ZIPOfRecord2529() {
		assertEquals("60077", customers.get(2528).getZIP());
	}

	@Test
	@DisplayName("Record 2529: Phone is 847-676-6357")
	void PhoneOfRecord2529() {
		assertEquals("847-676-6357", customers.get(2528).getPhone());
	}

	@Test
	@DisplayName("Record 2529: Fax is 847-676-2925")
	void FaxOfRecord2529() {
		assertEquals("847-676-2925", customers.get(2528).getFax());
	}

	@Test
	@DisplayName("Record 2529: Email is marshall@warmbier.com")
	void EmailOfRecord2529() {
		assertEquals("marshall@warmbier.com", customers.get(2528).getEmail());
	}

	@Test
	@DisplayName("Record 2529: Web is http://www.marshallwarmbier.com")
	void WebOfRecord2529() {
		assertEquals("http://www.marshallwarmbier.com", customers.get(2528).getWeb());
	}
}
