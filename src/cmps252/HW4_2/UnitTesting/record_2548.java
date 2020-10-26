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

@Tag("33")
class Record_2548 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2548: FirstName is Robin")
	void FirstNameOfRecord2548() {
		assertEquals("Robin", customers.get(2547).getFirstName());
	}

	@Test
	@DisplayName("Record 2548: LastName is Catterson")
	void LastNameOfRecord2548() {
		assertEquals("Catterson", customers.get(2547).getLastName());
	}

	@Test
	@DisplayName("Record 2548: Company is Microcom Inc")
	void CompanyOfRecord2548() {
		assertEquals("Microcom Inc", customers.get(2547).getCompany());
	}

	@Test
	@DisplayName("Record 2548: Address is 1911 Fort Myer Dr")
	void AddressOfRecord2548() {
		assertEquals("1911 Fort Myer Dr", customers.get(2547).getAddress());
	}

	@Test
	@DisplayName("Record 2548: City is Arlington")
	void CityOfRecord2548() {
		assertEquals("Arlington", customers.get(2547).getCity());
	}

	@Test
	@DisplayName("Record 2548: County is Arlington")
	void CountyOfRecord2548() {
		assertEquals("Arlington", customers.get(2547).getCounty());
	}

	@Test
	@DisplayName("Record 2548: State is VA")
	void StateOfRecord2548() {
		assertEquals("VA", customers.get(2547).getState());
	}

	@Test
	@DisplayName("Record 2548: ZIP is 22209")
	void ZIPOfRecord2548() {
		assertEquals("22209", customers.get(2547).getZIP());
	}

	@Test
	@DisplayName("Record 2548: Phone is 703-528-8022")
	void PhoneOfRecord2548() {
		assertEquals("703-528-8022", customers.get(2547).getPhone());
	}

	@Test
	@DisplayName("Record 2548: Fax is 703-528-6328")
	void FaxOfRecord2548() {
		assertEquals("703-528-6328", customers.get(2547).getFax());
	}

	@Test
	@DisplayName("Record 2548: Email is robin@catterson.com")
	void EmailOfRecord2548() {
		assertEquals("robin@catterson.com", customers.get(2547).getEmail());
	}

	@Test
	@DisplayName("Record 2548: Web is http://www.robincatterson.com")
	void WebOfRecord2548() {
		assertEquals("http://www.robincatterson.com", customers.get(2547).getWeb());
	}
}
