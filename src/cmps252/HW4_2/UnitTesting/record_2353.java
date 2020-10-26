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

@Tag("24")
class Record_2353 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2353: FirstName is Kermit")
	void FirstNameOfRecord2353() {
		assertEquals("Kermit", customers.get(2352).getFirstName());
	}

	@Test
	@DisplayName("Record 2353: LastName is Howery")
	void LastNameOfRecord2353() {
		assertEquals("Howery", customers.get(2352).getLastName());
	}

	@Test
	@DisplayName("Record 2353: Company is Reliance Time Controls Inc")
	void CompanyOfRecord2353() {
		assertEquals("Reliance Time Controls Inc", customers.get(2352).getCompany());
	}

	@Test
	@DisplayName("Record 2353: Address is 81 Winant Pl")
	void AddressOfRecord2353() {
		assertEquals("81 Winant Pl", customers.get(2352).getAddress());
	}

	@Test
	@DisplayName("Record 2353: City is Staten Island")
	void CityOfRecord2353() {
		assertEquals("Staten Island", customers.get(2352).getCity());
	}

	@Test
	@DisplayName("Record 2353: County is Richmond")
	void CountyOfRecord2353() {
		assertEquals("Richmond", customers.get(2352).getCounty());
	}

	@Test
	@DisplayName("Record 2353: State is NY")
	void StateOfRecord2353() {
		assertEquals("NY", customers.get(2352).getState());
	}

	@Test
	@DisplayName("Record 2353: ZIP is 10309")
	void ZIPOfRecord2353() {
		assertEquals("10309", customers.get(2352).getZIP());
	}

	@Test
	@DisplayName("Record 2353: Phone is 718-948-3253")
	void PhoneOfRecord2353() {
		assertEquals("718-948-3253", customers.get(2352).getPhone());
	}

	@Test
	@DisplayName("Record 2353: Fax is 718-948-8139")
	void FaxOfRecord2353() {
		assertEquals("718-948-8139", customers.get(2352).getFax());
	}

	@Test
	@DisplayName("Record 2353: Email is kermit@howery.com")
	void EmailOfRecord2353() {
		assertEquals("kermit@howery.com", customers.get(2352).getEmail());
	}

	@Test
	@DisplayName("Record 2353: Web is http://www.kermithowery.com")
	void WebOfRecord2353() {
		assertEquals("http://www.kermithowery.com", customers.get(2352).getWeb());
	}
}
