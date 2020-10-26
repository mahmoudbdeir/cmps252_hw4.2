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

@Tag("45")
class Record_2197 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2197: FirstName is Denise")
	void FirstNameOfRecord2197() {
		assertEquals("Denise", customers.get(2196).getFirstName());
	}

	@Test
	@DisplayName("Record 2197: LastName is Gerig")
	void LastNameOfRecord2197() {
		assertEquals("Gerig", customers.get(2196).getLastName());
	}

	@Test
	@DisplayName("Record 2197: Company is Keating, J Michael Jr")
	void CompanyOfRecord2197() {
		assertEquals("Keating, J Michael Jr", customers.get(2196).getCompany());
	}

	@Test
	@DisplayName("Record 2197: Address is 4835 N O Connor Rd  #-132")
	void AddressOfRecord2197() {
		assertEquals("4835 N O Connor Rd  #-132", customers.get(2196).getAddress());
	}

	@Test
	@DisplayName("Record 2197: City is Irving")
	void CityOfRecord2197() {
		assertEquals("Irving", customers.get(2196).getCity());
	}

	@Test
	@DisplayName("Record 2197: County is Dallas")
	void CountyOfRecord2197() {
		assertEquals("Dallas", customers.get(2196).getCounty());
	}

	@Test
	@DisplayName("Record 2197: State is TX")
	void StateOfRecord2197() {
		assertEquals("TX", customers.get(2196).getState());
	}

	@Test
	@DisplayName("Record 2197: ZIP is 75062")
	void ZIPOfRecord2197() {
		assertEquals("75062", customers.get(2196).getZIP());
	}

	@Test
	@DisplayName("Record 2197: Phone is 972-717-5640")
	void PhoneOfRecord2197() {
		assertEquals("972-717-5640", customers.get(2196).getPhone());
	}

	@Test
	@DisplayName("Record 2197: Fax is 972-717-2549")
	void FaxOfRecord2197() {
		assertEquals("972-717-2549", customers.get(2196).getFax());
	}

	@Test
	@DisplayName("Record 2197: Email is denise@gerig.com")
	void EmailOfRecord2197() {
		assertEquals("denise@gerig.com", customers.get(2196).getEmail());
	}

	@Test
	@DisplayName("Record 2197: Web is http://www.denisegerig.com")
	void WebOfRecord2197() {
		assertEquals("http://www.denisegerig.com", customers.get(2196).getWeb());
	}
}
