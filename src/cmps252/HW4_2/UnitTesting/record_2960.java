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

@Tag("46")
class Record_2960 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2960: FirstName is Verda")
	void FirstNameOfRecord2960() {
		assertEquals("Verda", customers.get(2959).getFirstName());
	}

	@Test
	@DisplayName("Record 2960: LastName is Serfling")
	void LastNameOfRecord2960() {
		assertEquals("Serfling", customers.get(2959).getLastName());
	}

	@Test
	@DisplayName("Record 2960: Company is Idaho Screen Print")
	void CompanyOfRecord2960() {
		assertEquals("Idaho Screen Print", customers.get(2959).getCompany());
	}

	@Test
	@DisplayName("Record 2960: Address is 745 50th Ave")
	void AddressOfRecord2960() {
		assertEquals("745 50th Ave", customers.get(2959).getAddress());
	}

	@Test
	@DisplayName("Record 2960: City is Oakland")
	void CityOfRecord2960() {
		assertEquals("Oakland", customers.get(2959).getCity());
	}

	@Test
	@DisplayName("Record 2960: County is Alameda")
	void CountyOfRecord2960() {
		assertEquals("Alameda", customers.get(2959).getCounty());
	}

	@Test
	@DisplayName("Record 2960: State is CA")
	void StateOfRecord2960() {
		assertEquals("CA", customers.get(2959).getState());
	}

	@Test
	@DisplayName("Record 2960: ZIP is 94601")
	void ZIPOfRecord2960() {
		assertEquals("94601", customers.get(2959).getZIP());
	}

	@Test
	@DisplayName("Record 2960: Phone is 510-261-4674")
	void PhoneOfRecord2960() {
		assertEquals("510-261-4674", customers.get(2959).getPhone());
	}

	@Test
	@DisplayName("Record 2960: Fax is 510-261-1664")
	void FaxOfRecord2960() {
		assertEquals("510-261-1664", customers.get(2959).getFax());
	}

	@Test
	@DisplayName("Record 2960: Email is verda@serfling.com")
	void EmailOfRecord2960() {
		assertEquals("verda@serfling.com", customers.get(2959).getEmail());
	}

	@Test
	@DisplayName("Record 2960: Web is http://www.verdaserfling.com")
	void WebOfRecord2960() {
		assertEquals("http://www.verdaserfling.com", customers.get(2959).getWeb());
	}
}
