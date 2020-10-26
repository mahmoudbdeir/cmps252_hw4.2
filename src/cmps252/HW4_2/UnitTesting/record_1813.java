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

@Tag("19")
class Record_1813 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1813: FirstName is Norbert")
	void FirstNameOfRecord1813() {
		assertEquals("Norbert", customers.get(1812).getFirstName());
	}

	@Test
	@DisplayName("Record 1813: LastName is Kats")
	void LastNameOfRecord1813() {
		assertEquals("Kats", customers.get(1812).getLastName());
	}

	@Test
	@DisplayName("Record 1813: Company is Kolb Lauwasser & Co Sc")
	void CompanyOfRecord1813() {
		assertEquals("Kolb Lauwasser & Co Sc", customers.get(1812).getCompany());
	}

	@Test
	@DisplayName("Record 1813: Address is 125 Huey P Long Ave")
	void AddressOfRecord1813() {
		assertEquals("125 Huey P Long Ave", customers.get(1812).getAddress());
	}

	@Test
	@DisplayName("Record 1813: City is Gretna")
	void CityOfRecord1813() {
		assertEquals("Gretna", customers.get(1812).getCity());
	}

	@Test
	@DisplayName("Record 1813: County is Jefferson")
	void CountyOfRecord1813() {
		assertEquals("Jefferson", customers.get(1812).getCounty());
	}

	@Test
	@DisplayName("Record 1813: State is LA")
	void StateOfRecord1813() {
		assertEquals("LA", customers.get(1812).getState());
	}

	@Test
	@DisplayName("Record 1813: ZIP is 70053")
	void ZIPOfRecord1813() {
		assertEquals("70053", customers.get(1812).getZIP());
	}

	@Test
	@DisplayName("Record 1813: Phone is 504-362-5667")
	void PhoneOfRecord1813() {
		assertEquals("504-362-5667", customers.get(1812).getPhone());
	}

	@Test
	@DisplayName("Record 1813: Fax is 504-362-8534")
	void FaxOfRecord1813() {
		assertEquals("504-362-8534", customers.get(1812).getFax());
	}

	@Test
	@DisplayName("Record 1813: Email is norbert@kats.com")
	void EmailOfRecord1813() {
		assertEquals("norbert@kats.com", customers.get(1812).getEmail());
	}

	@Test
	@DisplayName("Record 1813: Web is http://www.norbertkats.com")
	void WebOfRecord1813() {
		assertEquals("http://www.norbertkats.com", customers.get(1812).getWeb());
	}
}
