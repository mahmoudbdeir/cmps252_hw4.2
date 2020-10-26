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

@Tag("8")
class Record_2065 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2065: FirstName is Carmen")
	void FirstNameOfRecord2065() {
		assertEquals("Carmen", customers.get(2064).getFirstName());
	}

	@Test
	@DisplayName("Record 2065: LastName is Brooms")
	void LastNameOfRecord2065() {
		assertEquals("Brooms", customers.get(2064).getLastName());
	}

	@Test
	@DisplayName("Record 2065: Company is Taneytown Pharmacy")
	void CompanyOfRecord2065() {
		assertEquals("Taneytown Pharmacy", customers.get(2064).getCompany());
	}

	@Test
	@DisplayName("Record 2065: Address is 185 Berry St")
	void AddressOfRecord2065() {
		assertEquals("185 Berry St", customers.get(2064).getAddress());
	}

	@Test
	@DisplayName("Record 2065: City is San Francisco")
	void CityOfRecord2065() {
		assertEquals("San Francisco", customers.get(2064).getCity());
	}

	@Test
	@DisplayName("Record 2065: County is San Francisco")
	void CountyOfRecord2065() {
		assertEquals("San Francisco", customers.get(2064).getCounty());
	}

	@Test
	@DisplayName("Record 2065: State is CA")
	void StateOfRecord2065() {
		assertEquals("CA", customers.get(2064).getState());
	}

	@Test
	@DisplayName("Record 2065: ZIP is 94107")
	void ZIPOfRecord2065() {
		assertEquals("94107", customers.get(2064).getZIP());
	}

	@Test
	@DisplayName("Record 2065: Phone is 415-978-8905")
	void PhoneOfRecord2065() {
		assertEquals("415-978-8905", customers.get(2064).getPhone());
	}

	@Test
	@DisplayName("Record 2065: Fax is 415-978-4388")
	void FaxOfRecord2065() {
		assertEquals("415-978-4388", customers.get(2064).getFax());
	}

	@Test
	@DisplayName("Record 2065: Email is carmen@brooms.com")
	void EmailOfRecord2065() {
		assertEquals("carmen@brooms.com", customers.get(2064).getEmail());
	}

	@Test
	@DisplayName("Record 2065: Web is http://www.carmenbrooms.com")
	void WebOfRecord2065() {
		assertEquals("http://www.carmenbrooms.com", customers.get(2064).getWeb());
	}
}
