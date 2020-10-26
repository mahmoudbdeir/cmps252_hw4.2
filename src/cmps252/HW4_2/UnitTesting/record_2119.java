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

@Tag("29")
class Record_2119 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2119: FirstName is Adelina")
	void FirstNameOfRecord2119() {
		assertEquals("Adelina", customers.get(2118).getFirstName());
	}

	@Test
	@DisplayName("Record 2119: LastName is Kruszewski")
	void LastNameOfRecord2119() {
		assertEquals("Kruszewski", customers.get(2118).getLastName());
	}

	@Test
	@DisplayName("Record 2119: Company is Sos Printing")
	void CompanyOfRecord2119() {
		assertEquals("Sos Printing", customers.get(2118).getCompany());
	}

	@Test
	@DisplayName("Record 2119: Address is 1200 E Plano Pky")
	void AddressOfRecord2119() {
		assertEquals("1200 E Plano Pky", customers.get(2118).getAddress());
	}

	@Test
	@DisplayName("Record 2119: City is Plano")
	void CityOfRecord2119() {
		assertEquals("Plano", customers.get(2118).getCity());
	}

	@Test
	@DisplayName("Record 2119: County is Collin")
	void CountyOfRecord2119() {
		assertEquals("Collin", customers.get(2118).getCounty());
	}

	@Test
	@DisplayName("Record 2119: State is TX")
	void StateOfRecord2119() {
		assertEquals("TX", customers.get(2118).getState());
	}

	@Test
	@DisplayName("Record 2119: ZIP is 75074")
	void ZIPOfRecord2119() {
		assertEquals("75074", customers.get(2118).getZIP());
	}

	@Test
	@DisplayName("Record 2119: Phone is 972-578-7829")
	void PhoneOfRecord2119() {
		assertEquals("972-578-7829", customers.get(2118).getPhone());
	}

	@Test
	@DisplayName("Record 2119: Fax is 972-578-7866")
	void FaxOfRecord2119() {
		assertEquals("972-578-7866", customers.get(2118).getFax());
	}

	@Test
	@DisplayName("Record 2119: Email is adelina@kruszewski.com")
	void EmailOfRecord2119() {
		assertEquals("adelina@kruszewski.com", customers.get(2118).getEmail());
	}

	@Test
	@DisplayName("Record 2119: Web is http://www.adelinakruszewski.com")
	void WebOfRecord2119() {
		assertEquals("http://www.adelinakruszewski.com", customers.get(2118).getWeb());
	}
}
