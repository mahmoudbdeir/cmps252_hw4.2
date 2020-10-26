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

@Tag("32")
class Record_1840 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1840: FirstName is Malinda")
	void FirstNameOfRecord1840() {
		assertEquals("Malinda", customers.get(1839).getFirstName());
	}

	@Test
	@DisplayName("Record 1840: LastName is Latulippe")
	void LastNameOfRecord1840() {
		assertEquals("Latulippe", customers.get(1839).getLastName());
	}

	@Test
	@DisplayName("Record 1840: Company is Woodrow & Gruskin")
	void CompanyOfRecord1840() {
		assertEquals("Woodrow & Gruskin", customers.get(1839).getCompany());
	}

	@Test
	@DisplayName("Record 1840: Address is County Line Rds")
	void AddressOfRecord1840() {
		assertEquals("County Line Rds", customers.get(1839).getAddress());
	}

	@Test
	@DisplayName("Record 1840: City is Horsham")
	void CityOfRecord1840() {
		assertEquals("Horsham", customers.get(1839).getCity());
	}

	@Test
	@DisplayName("Record 1840: County is Montgomery")
	void CountyOfRecord1840() {
		assertEquals("Montgomery", customers.get(1839).getCounty());
	}

	@Test
	@DisplayName("Record 1840: State is PA")
	void StateOfRecord1840() {
		assertEquals("PA", customers.get(1839).getState());
	}

	@Test
	@DisplayName("Record 1840: ZIP is 19044")
	void ZIPOfRecord1840() {
		assertEquals("19044", customers.get(1839).getZIP());
	}

	@Test
	@DisplayName("Record 1840: Phone is 215-343-3508")
	void PhoneOfRecord1840() {
		assertEquals("215-343-3508", customers.get(1839).getPhone());
	}

	@Test
	@DisplayName("Record 1840: Fax is 215-343-4312")
	void FaxOfRecord1840() {
		assertEquals("215-343-4312", customers.get(1839).getFax());
	}

	@Test
	@DisplayName("Record 1840: Email is malinda@latulippe.com")
	void EmailOfRecord1840() {
		assertEquals("malinda@latulippe.com", customers.get(1839).getEmail());
	}

	@Test
	@DisplayName("Record 1840: Web is http://www.malindalatulippe.com")
	void WebOfRecord1840() {
		assertEquals("http://www.malindalatulippe.com", customers.get(1839).getWeb());
	}
}
