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

@Tag("20")
class Record_633 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 633: FirstName is Bryce")
	void FirstNameOfRecord633() {
		assertEquals("Bryce", customers.get(632).getFirstName());
	}

	@Test
	@DisplayName("Record 633: LastName is Amarillas")
	void LastNameOfRecord633() {
		assertEquals("Amarillas", customers.get(632).getLastName());
	}

	@Test
	@DisplayName("Record 633: Company is Family Furniture")
	void CompanyOfRecord633() {
		assertEquals("Family Furniture", customers.get(632).getCompany());
	}

	@Test
	@DisplayName("Record 633: Address is 4880 Euclid Ave")
	void AddressOfRecord633() {
		assertEquals("4880 Euclid Ave", customers.get(632).getAddress());
	}

	@Test
	@DisplayName("Record 633: City is Palatine")
	void CityOfRecord633() {
		assertEquals("Palatine", customers.get(632).getCity());
	}

	@Test
	@DisplayName("Record 633: County is Cook")
	void CountyOfRecord633() {
		assertEquals("Cook", customers.get(632).getCounty());
	}

	@Test
	@DisplayName("Record 633: State is IL")
	void StateOfRecord633() {
		assertEquals("IL", customers.get(632).getState());
	}

	@Test
	@DisplayName("Record 633: ZIP is 60067")
	void ZIPOfRecord633() {
		assertEquals("60067", customers.get(632).getZIP());
	}

	@Test
	@DisplayName("Record 633: Phone is 847-991-0648")
	void PhoneOfRecord633() {
		assertEquals("847-991-0648", customers.get(632).getPhone());
	}

	@Test
	@DisplayName("Record 633: Fax is 847-991-3614")
	void FaxOfRecord633() {
		assertEquals("847-991-3614", customers.get(632).getFax());
	}

	@Test
	@DisplayName("Record 633: Email is bryce@amarillas.com")
	void EmailOfRecord633() {
		assertEquals("bryce@amarillas.com", customers.get(632).getEmail());
	}

	@Test
	@DisplayName("Record 633: Web is http://www.bryceamarillas.com")
	void WebOfRecord633() {
		assertEquals("http://www.bryceamarillas.com", customers.get(632).getWeb());
	}
}
