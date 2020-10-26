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

@Tag("7")
class Record_836 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 836: FirstName is Leon")
	void FirstNameOfRecord836() {
		assertEquals("Leon", customers.get(835).getFirstName());
	}

	@Test
	@DisplayName("Record 836: LastName is Gubitosi")
	void LastNameOfRecord836() {
		assertEquals("Gubitosi", customers.get(835).getLastName());
	}

	@Test
	@DisplayName("Record 836: Company is Stack Inc")
	void CompanyOfRecord836() {
		assertEquals("Stack Inc", customers.get(835).getCompany());
	}

	@Test
	@DisplayName("Record 836: Address is 1717 W 4th Ave")
	void AddressOfRecord836() {
		assertEquals("1717 W 4th Ave", customers.get(835).getAddress());
	}

	@Test
	@DisplayName("Record 836: City is Spokane")
	void CityOfRecord836() {
		assertEquals("Spokane", customers.get(835).getCity());
	}

	@Test
	@DisplayName("Record 836: County is Spokane")
	void CountyOfRecord836() {
		assertEquals("Spokane", customers.get(835).getCounty());
	}

	@Test
	@DisplayName("Record 836: State is WA")
	void StateOfRecord836() {
		assertEquals("WA", customers.get(835).getState());
	}

	@Test
	@DisplayName("Record 836: ZIP is 99204")
	void ZIPOfRecord836() {
		assertEquals("99204", customers.get(835).getZIP());
	}

	@Test
	@DisplayName("Record 836: Phone is 509-455-2763")
	void PhoneOfRecord836() {
		assertEquals("509-455-2763", customers.get(835).getPhone());
	}

	@Test
	@DisplayName("Record 836: Fax is 509-455-4621")
	void FaxOfRecord836() {
		assertEquals("509-455-4621", customers.get(835).getFax());
	}

	@Test
	@DisplayName("Record 836: Email is leon@gubitosi.com")
	void EmailOfRecord836() {
		assertEquals("leon@gubitosi.com", customers.get(835).getEmail());
	}

	@Test
	@DisplayName("Record 836: Web is http://www.leongubitosi.com")
	void WebOfRecord836() {
		assertEquals("http://www.leongubitosi.com", customers.get(835).getWeb());
	}
}
