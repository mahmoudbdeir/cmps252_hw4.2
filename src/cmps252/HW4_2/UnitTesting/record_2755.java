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

@Tag("28")
class Record_2755 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2755: FirstName is Rosetta")
	void FirstNameOfRecord2755() {
		assertEquals("Rosetta", customers.get(2754).getFirstName());
	}

	@Test
	@DisplayName("Record 2755: LastName is Kobold")
	void LastNameOfRecord2755() {
		assertEquals("Kobold", customers.get(2754).getLastName());
	}

	@Test
	@DisplayName("Record 2755: Company is Audi Suds")
	void CompanyOfRecord2755() {
		assertEquals("Audi Suds", customers.get(2754).getCompany());
	}

	@Test
	@DisplayName("Record 2755: Address is 333 Falkenburg Rd")
	void AddressOfRecord2755() {
		assertEquals("333 Falkenburg Rd", customers.get(2754).getAddress());
	}

	@Test
	@DisplayName("Record 2755: City is Tampa")
	void CityOfRecord2755() {
		assertEquals("Tampa", customers.get(2754).getCity());
	}

	@Test
	@DisplayName("Record 2755: County is Hillsborough")
	void CountyOfRecord2755() {
		assertEquals("Hillsborough", customers.get(2754).getCounty());
	}

	@Test
	@DisplayName("Record 2755: State is FL")
	void StateOfRecord2755() {
		assertEquals("FL", customers.get(2754).getState());
	}

	@Test
	@DisplayName("Record 2755: ZIP is 33619")
	void ZIPOfRecord2755() {
		assertEquals("33619", customers.get(2754).getZIP());
	}

	@Test
	@DisplayName("Record 2755: Phone is 813-685-5555")
	void PhoneOfRecord2755() {
		assertEquals("813-685-5555", customers.get(2754).getPhone());
	}

	@Test
	@DisplayName("Record 2755: Fax is 813-685-2168")
	void FaxOfRecord2755() {
		assertEquals("813-685-2168", customers.get(2754).getFax());
	}

	@Test
	@DisplayName("Record 2755: Email is rosetta@kobold.com")
	void EmailOfRecord2755() {
		assertEquals("rosetta@kobold.com", customers.get(2754).getEmail());
	}

	@Test
	@DisplayName("Record 2755: Web is http://www.rosettakobold.com")
	void WebOfRecord2755() {
		assertEquals("http://www.rosettakobold.com", customers.get(2754).getWeb());
	}
}
