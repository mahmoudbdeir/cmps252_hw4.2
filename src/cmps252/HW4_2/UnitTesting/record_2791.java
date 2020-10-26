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

@Tag("20")
class Record_2791 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2791: FirstName is Devon")
	void FirstNameOfRecord2791() {
		assertEquals("Devon", customers.get(2790).getFirstName());
	}

	@Test
	@DisplayName("Record 2791: LastName is Nagarajan")
	void LastNameOfRecord2791() {
		assertEquals("Nagarajan", customers.get(2790).getLastName());
	}

	@Test
	@DisplayName("Record 2791: Company is Sherman, Bradley A Esq")
	void CompanyOfRecord2791() {
		assertEquals("Sherman, Bradley A Esq", customers.get(2790).getCompany());
	}

	@Test
	@DisplayName("Record 2791: Address is 3000 Town Ctr  #-18a")
	void AddressOfRecord2791() {
		assertEquals("3000 Town Ctr  #-18a", customers.get(2790).getAddress());
	}

	@Test
	@DisplayName("Record 2791: City is Southfield")
	void CityOfRecord2791() {
		assertEquals("Southfield", customers.get(2790).getCity());
	}

	@Test
	@DisplayName("Record 2791: County is Oakland")
	void CountyOfRecord2791() {
		assertEquals("Oakland", customers.get(2790).getCounty());
	}

	@Test
	@DisplayName("Record 2791: State is MI")
	void StateOfRecord2791() {
		assertEquals("MI", customers.get(2790).getState());
	}

	@Test
	@DisplayName("Record 2791: ZIP is 48075")
	void ZIPOfRecord2791() {
		assertEquals("48075", customers.get(2790).getZIP());
	}

	@Test
	@DisplayName("Record 2791: Phone is 248-356-8467")
	void PhoneOfRecord2791() {
		assertEquals("248-356-8467", customers.get(2790).getPhone());
	}

	@Test
	@DisplayName("Record 2791: Fax is 248-356-9689")
	void FaxOfRecord2791() {
		assertEquals("248-356-9689", customers.get(2790).getFax());
	}

	@Test
	@DisplayName("Record 2791: Email is devon@nagarajan.com")
	void EmailOfRecord2791() {
		assertEquals("devon@nagarajan.com", customers.get(2790).getEmail());
	}

	@Test
	@DisplayName("Record 2791: Web is http://www.devonnagarajan.com")
	void WebOfRecord2791() {
		assertEquals("http://www.devonnagarajan.com", customers.get(2790).getWeb());
	}
}
