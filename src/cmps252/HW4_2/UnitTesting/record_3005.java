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
class Record_3005 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3005: FirstName is Leopoldo")
	void FirstNameOfRecord3005() {
		assertEquals("Leopoldo", customers.get(3004).getFirstName());
	}

	@Test
	@DisplayName("Record 3005: LastName is Fuselier")
	void LastNameOfRecord3005() {
		assertEquals("Fuselier", customers.get(3004).getLastName());
	}

	@Test
	@DisplayName("Record 3005: Company is Ink Spot Printing & Graph Inc")
	void CompanyOfRecord3005() {
		assertEquals("Ink Spot Printing & Graph Inc", customers.get(3004).getCompany());
	}

	@Test
	@DisplayName("Record 3005: Address is 215 Metro Dr")
	void AddressOfRecord3005() {
		assertEquals("215 Metro Dr", customers.get(3004).getAddress());
	}

	@Test
	@DisplayName("Record 3005: City is Jefferson City")
	void CityOfRecord3005() {
		assertEquals("Jefferson City", customers.get(3004).getCity());
	}

	@Test
	@DisplayName("Record 3005: County is Cole")
	void CountyOfRecord3005() {
		assertEquals("Cole", customers.get(3004).getCounty());
	}

	@Test
	@DisplayName("Record 3005: State is MO")
	void StateOfRecord3005() {
		assertEquals("MO", customers.get(3004).getState());
	}

	@Test
	@DisplayName("Record 3005: ZIP is 65109")
	void ZIPOfRecord3005() {
		assertEquals("65109", customers.get(3004).getZIP());
	}

	@Test
	@DisplayName("Record 3005: Phone is 573-893-6265")
	void PhoneOfRecord3005() {
		assertEquals("573-893-6265", customers.get(3004).getPhone());
	}

	@Test
	@DisplayName("Record 3005: Fax is 573-893-3537")
	void FaxOfRecord3005() {
		assertEquals("573-893-3537", customers.get(3004).getFax());
	}

	@Test
	@DisplayName("Record 3005: Email is leopoldo@fuselier.com")
	void EmailOfRecord3005() {
		assertEquals("leopoldo@fuselier.com", customers.get(3004).getEmail());
	}

	@Test
	@DisplayName("Record 3005: Web is http://www.leopoldofuselier.com")
	void WebOfRecord3005() {
		assertEquals("http://www.leopoldofuselier.com", customers.get(3004).getWeb());
	}
}
