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

@Tag("18")
class Record_2698 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2698: FirstName is Patrick")
	void FirstNameOfRecord2698() {
		assertEquals("Patrick", customers.get(2697).getFirstName());
	}

	@Test
	@DisplayName("Record 2698: LastName is Schusterman")
	void LastNameOfRecord2698() {
		assertEquals("Schusterman", customers.get(2697).getLastName());
	}

	@Test
	@DisplayName("Record 2698: Company is Devco Mutual Association")
	void CompanyOfRecord2698() {
		assertEquals("Devco Mutual Association", customers.get(2697).getCompany());
	}

	@Test
	@DisplayName("Record 2698: Address is 136 N Plaza St")
	void AddressOfRecord2698() {
		assertEquals("136 N Plaza St", customers.get(2697).getAddress());
	}

	@Test
	@DisplayName("Record 2698: City is Brawley")
	void CityOfRecord2698() {
		assertEquals("Brawley", customers.get(2697).getCity());
	}

	@Test
	@DisplayName("Record 2698: County is Imperial")
	void CountyOfRecord2698() {
		assertEquals("Imperial", customers.get(2697).getCounty());
	}

	@Test
	@DisplayName("Record 2698: State is CA")
	void StateOfRecord2698() {
		assertEquals("CA", customers.get(2697).getState());
	}

	@Test
	@DisplayName("Record 2698: ZIP is 92227")
	void ZIPOfRecord2698() {
		assertEquals("92227", customers.get(2697).getZIP());
	}

	@Test
	@DisplayName("Record 2698: Phone is 760-344-2135")
	void PhoneOfRecord2698() {
		assertEquals("760-344-2135", customers.get(2697).getPhone());
	}

	@Test
	@DisplayName("Record 2698: Fax is 760-344-6126")
	void FaxOfRecord2698() {
		assertEquals("760-344-6126", customers.get(2697).getFax());
	}

	@Test
	@DisplayName("Record 2698: Email is patrick@schusterman.com")
	void EmailOfRecord2698() {
		assertEquals("patrick@schusterman.com", customers.get(2697).getEmail());
	}

	@Test
	@DisplayName("Record 2698: Web is http://www.patrickschusterman.com")
	void WebOfRecord2698() {
		assertEquals("http://www.patrickschusterman.com", customers.get(2697).getWeb());
	}
}
