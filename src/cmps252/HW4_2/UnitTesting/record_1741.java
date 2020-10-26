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

@Tag("11")
class Record_1741 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1741: FirstName is Buster")
	void FirstNameOfRecord1741() {
		assertEquals("Buster", customers.get(1740).getFirstName());
	}

	@Test
	@DisplayName("Record 1741: LastName is Blanchet")
	void LastNameOfRecord1741() {
		assertEquals("Blanchet", customers.get(1740).getLastName());
	}

	@Test
	@DisplayName("Record 1741: Company is Perrin Title Company")
	void CompanyOfRecord1741() {
		assertEquals("Perrin Title Company", customers.get(1740).getCompany());
	}

	@Test
	@DisplayName("Record 1741: Address is 830 E Rand Rd")
	void AddressOfRecord1741() {
		assertEquals("830 E Rand Rd", customers.get(1740).getAddress());
	}

	@Test
	@DisplayName("Record 1741: City is Mount Prospect")
	void CityOfRecord1741() {
		assertEquals("Mount Prospect", customers.get(1740).getCity());
	}

	@Test
	@DisplayName("Record 1741: County is Cook")
	void CountyOfRecord1741() {
		assertEquals("Cook", customers.get(1740).getCounty());
	}

	@Test
	@DisplayName("Record 1741: State is IL")
	void StateOfRecord1741() {
		assertEquals("IL", customers.get(1740).getState());
	}

	@Test
	@DisplayName("Record 1741: ZIP is 60056")
	void ZIPOfRecord1741() {
		assertEquals("60056", customers.get(1740).getZIP());
	}

	@Test
	@DisplayName("Record 1741: Phone is 847-577-8191")
	void PhoneOfRecord1741() {
		assertEquals("847-577-8191", customers.get(1740).getPhone());
	}

	@Test
	@DisplayName("Record 1741: Fax is 847-577-3524")
	void FaxOfRecord1741() {
		assertEquals("847-577-3524", customers.get(1740).getFax());
	}

	@Test
	@DisplayName("Record 1741: Email is buster@blanchet.com")
	void EmailOfRecord1741() {
		assertEquals("buster@blanchet.com", customers.get(1740).getEmail());
	}

	@Test
	@DisplayName("Record 1741: Web is http://www.busterblanchet.com")
	void WebOfRecord1741() {
		assertEquals("http://www.busterblanchet.com", customers.get(1740).getWeb());
	}
}
