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

@Tag("21")
class Record_1883 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1883: FirstName is Jenny")
	void FirstNameOfRecord1883() {
		assertEquals("Jenny", customers.get(1882).getFirstName());
	}

	@Test
	@DisplayName("Record 1883: LastName is Diza")
	void LastNameOfRecord1883() {
		assertEquals("Diza", customers.get(1882).getLastName());
	}

	@Test
	@DisplayName("Record 1883: Company is Pro Designs")
	void CompanyOfRecord1883() {
		assertEquals("Pro Designs", customers.get(1882).getCompany());
	}

	@Test
	@DisplayName("Record 1883: Address is 14757 Cicero Ave")
	void AddressOfRecord1883() {
		assertEquals("14757 Cicero Ave", customers.get(1882).getAddress());
	}

	@Test
	@DisplayName("Record 1883: City is Midlothian")
	void CityOfRecord1883() {
		assertEquals("Midlothian", customers.get(1882).getCity());
	}

	@Test
	@DisplayName("Record 1883: County is Cook")
	void CountyOfRecord1883() {
		assertEquals("Cook", customers.get(1882).getCounty());
	}

	@Test
	@DisplayName("Record 1883: State is IL")
	void StateOfRecord1883() {
		assertEquals("IL", customers.get(1882).getState());
	}

	@Test
	@DisplayName("Record 1883: ZIP is 60445")
	void ZIPOfRecord1883() {
		assertEquals("60445", customers.get(1882).getZIP());
	}

	@Test
	@DisplayName("Record 1883: Phone is 708-687-1792")
	void PhoneOfRecord1883() {
		assertEquals("708-687-1792", customers.get(1882).getPhone());
	}

	@Test
	@DisplayName("Record 1883: Fax is 708-687-3964")
	void FaxOfRecord1883() {
		assertEquals("708-687-3964", customers.get(1882).getFax());
	}

	@Test
	@DisplayName("Record 1883: Email is jenny@diza.com")
	void EmailOfRecord1883() {
		assertEquals("jenny@diza.com", customers.get(1882).getEmail());
	}

	@Test
	@DisplayName("Record 1883: Web is http://www.jennydiza.com")
	void WebOfRecord1883() {
		assertEquals("http://www.jennydiza.com", customers.get(1882).getWeb());
	}
}
