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

@Tag("4")
class Record_2493 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2493: FirstName is Tracey")
	void FirstNameOfRecord2493() {
		assertEquals("Tracey", customers.get(2492).getFirstName());
	}

	@Test
	@DisplayName("Record 2493: LastName is Kennis")
	void LastNameOfRecord2493() {
		assertEquals("Kennis", customers.get(2492).getLastName());
	}

	@Test
	@DisplayName("Record 2493: Company is Paragon Environmental Systems")
	void CompanyOfRecord2493() {
		assertEquals("Paragon Environmental Systems", customers.get(2492).getCompany());
	}

	@Test
	@DisplayName("Record 2493: Address is 15833 Redland Rd")
	void AddressOfRecord2493() {
		assertEquals("15833 Redland Rd", customers.get(2492).getAddress());
	}

	@Test
	@DisplayName("Record 2493: City is Derwood")
	void CityOfRecord2493() {
		assertEquals("Derwood", customers.get(2492).getCity());
	}

	@Test
	@DisplayName("Record 2493: County is Montgomery")
	void CountyOfRecord2493() {
		assertEquals("Montgomery", customers.get(2492).getCounty());
	}

	@Test
	@DisplayName("Record 2493: State is MD")
	void StateOfRecord2493() {
		assertEquals("MD", customers.get(2492).getState());
	}

	@Test
	@DisplayName("Record 2493: ZIP is 20855")
	void ZIPOfRecord2493() {
		assertEquals("20855", customers.get(2492).getZIP());
	}

	@Test
	@DisplayName("Record 2493: Phone is 301-948-8895")
	void PhoneOfRecord2493() {
		assertEquals("301-948-8895", customers.get(2492).getPhone());
	}

	@Test
	@DisplayName("Record 2493: Fax is 301-948-1751")
	void FaxOfRecord2493() {
		assertEquals("301-948-1751", customers.get(2492).getFax());
	}

	@Test
	@DisplayName("Record 2493: Email is tracey@kennis.com")
	void EmailOfRecord2493() {
		assertEquals("tracey@kennis.com", customers.get(2492).getEmail());
	}

	@Test
	@DisplayName("Record 2493: Web is http://www.traceykennis.com")
	void WebOfRecord2493() {
		assertEquals("http://www.traceykennis.com", customers.get(2492).getWeb());
	}
}
