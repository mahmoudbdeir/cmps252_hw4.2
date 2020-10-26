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

@Tag("15")
class Record_1822 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1822: FirstName is Bill")
	void FirstNameOfRecord1822() {
		assertEquals("Bill", customers.get(1821).getFirstName());
	}

	@Test
	@DisplayName("Record 1822: LastName is Ragins")
	void LastNameOfRecord1822() {
		assertEquals("Ragins", customers.get(1821).getLastName());
	}

	@Test
	@DisplayName("Record 1822: Company is Danville Cabinets Inc")
	void CompanyOfRecord1822() {
		assertEquals("Danville Cabinets Inc", customers.get(1821).getCompany());
	}

	@Test
	@DisplayName("Record 1822: Address is 1900 Northfield Dr")
	void AddressOfRecord1822() {
		assertEquals("1900 Northfield Dr", customers.get(1821).getAddress());
	}

	@Test
	@DisplayName("Record 1822: City is Rochester")
	void CityOfRecord1822() {
		assertEquals("Rochester", customers.get(1821).getCity());
	}

	@Test
	@DisplayName("Record 1822: County is Oakland")
	void CountyOfRecord1822() {
		assertEquals("Oakland", customers.get(1821).getCounty());
	}

	@Test
	@DisplayName("Record 1822: State is MI")
	void StateOfRecord1822() {
		assertEquals("MI", customers.get(1821).getState());
	}

	@Test
	@DisplayName("Record 1822: ZIP is 48309")
	void ZIPOfRecord1822() {
		assertEquals("48309", customers.get(1821).getZIP());
	}

	@Test
	@DisplayName("Record 1822: Phone is 248-853-2805")
	void PhoneOfRecord1822() {
		assertEquals("248-853-2805", customers.get(1821).getPhone());
	}

	@Test
	@DisplayName("Record 1822: Fax is 248-853-0782")
	void FaxOfRecord1822() {
		assertEquals("248-853-0782", customers.get(1821).getFax());
	}

	@Test
	@DisplayName("Record 1822: Email is bill@ragins.com")
	void EmailOfRecord1822() {
		assertEquals("bill@ragins.com", customers.get(1821).getEmail());
	}

	@Test
	@DisplayName("Record 1822: Web is http://www.billragins.com")
	void WebOfRecord1822() {
		assertEquals("http://www.billragins.com", customers.get(1821).getWeb());
	}
}
