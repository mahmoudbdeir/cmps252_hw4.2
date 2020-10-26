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

@Tag("43")
class Record_2367 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2367: FirstName is Barton")
	void FirstNameOfRecord2367() {
		assertEquals("Barton", customers.get(2366).getFirstName());
	}

	@Test
	@DisplayName("Record 2367: LastName is Kommer")
	void LastNameOfRecord2367() {
		assertEquals("Kommer", customers.get(2366).getLastName());
	}

	@Test
	@DisplayName("Record 2367: Company is Lawson Stamp Co")
	void CompanyOfRecord2367() {
		assertEquals("Lawson Stamp Co", customers.get(2366).getCompany());
	}

	@Test
	@DisplayName("Record 2367: Address is 8187 California City Blvd")
	void AddressOfRecord2367() {
		assertEquals("8187 California City Blvd", customers.get(2366).getAddress());
	}

	@Test
	@DisplayName("Record 2367: City is California City")
	void CityOfRecord2367() {
		assertEquals("California City", customers.get(2366).getCity());
	}

	@Test
	@DisplayName("Record 2367: County is Kern")
	void CountyOfRecord2367() {
		assertEquals("Kern", customers.get(2366).getCounty());
	}

	@Test
	@DisplayName("Record 2367: State is CA")
	void StateOfRecord2367() {
		assertEquals("CA", customers.get(2366).getState());
	}

	@Test
	@DisplayName("Record 2367: ZIP is 93505")
	void ZIPOfRecord2367() {
		assertEquals("93505", customers.get(2366).getZIP());
	}

	@Test
	@DisplayName("Record 2367: Phone is 760-373-8928")
	void PhoneOfRecord2367() {
		assertEquals("760-373-8928", customers.get(2366).getPhone());
	}

	@Test
	@DisplayName("Record 2367: Fax is 760-373-1971")
	void FaxOfRecord2367() {
		assertEquals("760-373-1971", customers.get(2366).getFax());
	}

	@Test
	@DisplayName("Record 2367: Email is barton@kommer.com")
	void EmailOfRecord2367() {
		assertEquals("barton@kommer.com", customers.get(2366).getEmail());
	}

	@Test
	@DisplayName("Record 2367: Web is http://www.bartonkommer.com")
	void WebOfRecord2367() {
		assertEquals("http://www.bartonkommer.com", customers.get(2366).getWeb());
	}
}
