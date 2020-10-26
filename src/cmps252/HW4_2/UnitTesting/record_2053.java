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
class Record_2053 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2053: FirstName is Caren")
	void FirstNameOfRecord2053() {
		assertEquals("Caren", customers.get(2052).getFirstName());
	}

	@Test
	@DisplayName("Record 2053: LastName is Trimarco")
	void LastNameOfRecord2053() {
		assertEquals("Trimarco", customers.get(2052).getLastName());
	}

	@Test
	@DisplayName("Record 2053: Company is Calif Automotive Whls Assn")
	void CompanyOfRecord2053() {
		assertEquals("Calif Automotive Whls Assn", customers.get(2052).getCompany());
	}

	@Test
	@DisplayName("Record 2053: Address is 15 Worth St")
	void AddressOfRecord2053() {
		assertEquals("15 Worth St", customers.get(2052).getAddress());
	}

	@Test
	@DisplayName("Record 2053: City is South Hackensack")
	void CityOfRecord2053() {
		assertEquals("South Hackensack", customers.get(2052).getCity());
	}

	@Test
	@DisplayName("Record 2053: County is Bergen")
	void CountyOfRecord2053() {
		assertEquals("Bergen", customers.get(2052).getCounty());
	}

	@Test
	@DisplayName("Record 2053: State is NJ")
	void StateOfRecord2053() {
		assertEquals("NJ", customers.get(2052).getState());
	}

	@Test
	@DisplayName("Record 2053: ZIP is 7606")
	void ZIPOfRecord2053() {
		assertEquals("7606", customers.get(2052).getZIP());
	}

	@Test
	@DisplayName("Record 2053: Phone is 201-488-8206")
	void PhoneOfRecord2053() {
		assertEquals("201-488-8206", customers.get(2052).getPhone());
	}

	@Test
	@DisplayName("Record 2053: Fax is 201-488-2981")
	void FaxOfRecord2053() {
		assertEquals("201-488-2981", customers.get(2052).getFax());
	}

	@Test
	@DisplayName("Record 2053: Email is caren@trimarco.com")
	void EmailOfRecord2053() {
		assertEquals("caren@trimarco.com", customers.get(2052).getEmail());
	}

	@Test
	@DisplayName("Record 2053: Web is http://www.carentrimarco.com")
	void WebOfRecord2053() {
		assertEquals("http://www.carentrimarco.com", customers.get(2052).getWeb());
	}
}
