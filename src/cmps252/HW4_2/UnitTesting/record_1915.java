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

@Tag("39")
class Record_1915 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1915: FirstName is Levi")
	void FirstNameOfRecord1915() {
		assertEquals("Levi", customers.get(1914).getFirstName());
	}

	@Test
	@DisplayName("Record 1915: LastName is Romriell")
	void LastNameOfRecord1915() {
		assertEquals("Romriell", customers.get(1914).getLastName());
	}

	@Test
	@DisplayName("Record 1915: Company is Lovejoy, Joseph A")
	void CompanyOfRecord1915() {
		assertEquals("Lovejoy, Joseph A", customers.get(1914).getCompany());
	}

	@Test
	@DisplayName("Record 1915: Address is 17476 Old Jefferson Hwy")
	void AddressOfRecord1915() {
		assertEquals("17476 Old Jefferson Hwy", customers.get(1914).getAddress());
	}

	@Test
	@DisplayName("Record 1915: City is Prairieville")
	void CityOfRecord1915() {
		assertEquals("Prairieville", customers.get(1914).getCity());
	}

	@Test
	@DisplayName("Record 1915: County is Ascension")
	void CountyOfRecord1915() {
		assertEquals("Ascension", customers.get(1914).getCounty());
	}

	@Test
	@DisplayName("Record 1915: State is LA")
	void StateOfRecord1915() {
		assertEquals("LA", customers.get(1914).getState());
	}

	@Test
	@DisplayName("Record 1915: ZIP is 70769")
	void ZIPOfRecord1915() {
		assertEquals("70769", customers.get(1914).getZIP());
	}

	@Test
	@DisplayName("Record 1915: Phone is 225-673-5570")
	void PhoneOfRecord1915() {
		assertEquals("225-673-5570", customers.get(1914).getPhone());
	}

	@Test
	@DisplayName("Record 1915: Fax is 225-673-7282")
	void FaxOfRecord1915() {
		assertEquals("225-673-7282", customers.get(1914).getFax());
	}

	@Test
	@DisplayName("Record 1915: Email is levi@romriell.com")
	void EmailOfRecord1915() {
		assertEquals("levi@romriell.com", customers.get(1914).getEmail());
	}

	@Test
	@DisplayName("Record 1915: Web is http://www.leviromriell.com")
	void WebOfRecord1915() {
		assertEquals("http://www.leviromriell.com", customers.get(1914).getWeb());
	}
}
