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

@Tag("31")
class Record_4546 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4546: FirstName is Stephanie")
	void FirstNameOfRecord4546() {
		assertEquals("Stephanie", customers.get(4545).getFirstName());
	}

	@Test
	@DisplayName("Record 4546: LastName is Weaving")
	void LastNameOfRecord4546() {
		assertEquals("Weaving", customers.get(4545).getLastName());
	}

	@Test
	@DisplayName("Record 4546: Company is Gmac Mortgage Corporation")
	void CompanyOfRecord4546() {
		assertEquals("Gmac Mortgage Corporation", customers.get(4545).getCompany());
	}

	@Test
	@DisplayName("Record 4546: Address is 7023 Little River Tpke  #-728")
	void AddressOfRecord4546() {
		assertEquals("7023 Little River Tpke  #-728", customers.get(4545).getAddress());
	}

	@Test
	@DisplayName("Record 4546: City is Annandale")
	void CityOfRecord4546() {
		assertEquals("Annandale", customers.get(4545).getCity());
	}

	@Test
	@DisplayName("Record 4546: County is Fairfax")
	void CountyOfRecord4546() {
		assertEquals("Fairfax", customers.get(4545).getCounty());
	}

	@Test
	@DisplayName("Record 4546: State is VA")
	void StateOfRecord4546() {
		assertEquals("VA", customers.get(4545).getState());
	}

	@Test
	@DisplayName("Record 4546: ZIP is 22003")
	void ZIPOfRecord4546() {
		assertEquals("22003", customers.get(4545).getZIP());
	}

	@Test
	@DisplayName("Record 4546: Phone is 703-642-7570")
	void PhoneOfRecord4546() {
		assertEquals("703-642-7570", customers.get(4545).getPhone());
	}

	@Test
	@DisplayName("Record 4546: Fax is 703-642-2869")
	void FaxOfRecord4546() {
		assertEquals("703-642-2869", customers.get(4545).getFax());
	}

	@Test
	@DisplayName("Record 4546: Email is stephanie@weaving.com")
	void EmailOfRecord4546() {
		assertEquals("stephanie@weaving.com", customers.get(4545).getEmail());
	}

	@Test
	@DisplayName("Record 4546: Web is http://www.stephanieweaving.com")
	void WebOfRecord4546() {
		assertEquals("http://www.stephanieweaving.com", customers.get(4545).getWeb());
	}
}
