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

@Tag("13")
class Record_2079 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2079: FirstName is Angelina")
	void FirstNameOfRecord2079() {
		assertEquals("Angelina", customers.get(2078).getFirstName());
	}

	@Test
	@DisplayName("Record 2079: LastName is Manvel")
	void LastNameOfRecord2079() {
		assertEquals("Manvel", customers.get(2078).getLastName());
	}

	@Test
	@DisplayName("Record 2079: Company is Stratford House Inns")
	void CompanyOfRecord2079() {
		assertEquals("Stratford House Inns", customers.get(2078).getCompany());
	}

	@Test
	@DisplayName("Record 2079: Address is World Trade")
	void AddressOfRecord2079() {
		assertEquals("World Trade", customers.get(2078).getAddress());
	}

	@Test
	@DisplayName("Record 2079: City is San Francisco")
	void CityOfRecord2079() {
		assertEquals("San Francisco", customers.get(2078).getCity());
	}

	@Test
	@DisplayName("Record 2079: County is San Francisco")
	void CountyOfRecord2079() {
		assertEquals("San Francisco", customers.get(2078).getCounty());
	}

	@Test
	@DisplayName("Record 2079: State is CA")
	void StateOfRecord2079() {
		assertEquals("CA", customers.get(2078).getState());
	}

	@Test
	@DisplayName("Record 2079: ZIP is 94111")
	void ZIPOfRecord2079() {
		assertEquals("94111", customers.get(2078).getZIP());
	}

	@Test
	@DisplayName("Record 2079: Phone is 415-362-8014")
	void PhoneOfRecord2079() {
		assertEquals("415-362-8014", customers.get(2078).getPhone());
	}

	@Test
	@DisplayName("Record 2079: Fax is 415-362-8621")
	void FaxOfRecord2079() {
		assertEquals("415-362-8621", customers.get(2078).getFax());
	}

	@Test
	@DisplayName("Record 2079: Email is angelina@manvel.com")
	void EmailOfRecord2079() {
		assertEquals("angelina@manvel.com", customers.get(2078).getEmail());
	}

	@Test
	@DisplayName("Record 2079: Web is http://www.angelinamanvel.com")
	void WebOfRecord2079() {
		assertEquals("http://www.angelinamanvel.com", customers.get(2078).getWeb());
	}
}
