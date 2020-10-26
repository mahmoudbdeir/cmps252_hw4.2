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

@Tag("22")
class Record_1652 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1652: FirstName is Pearl")
	void FirstNameOfRecord1652() {
		assertEquals("Pearl", customers.get(1651).getFirstName());
	}

	@Test
	@DisplayName("Record 1652: LastName is Nesser")
	void LastNameOfRecord1652() {
		assertEquals("Nesser", customers.get(1651).getLastName());
	}

	@Test
	@DisplayName("Record 1652: Company is Cetrangolo Finishing Works Inc")
	void CompanyOfRecord1652() {
		assertEquals("Cetrangolo Finishing Works Inc", customers.get(1651).getCompany());
	}

	@Test
	@DisplayName("Record 1652: Address is Quarry Rd & Rt 63")
	void AddressOfRecord1652() {
		assertEquals("Quarry Rd & Rt 63", customers.get(1651).getAddress());
	}

	@Test
	@DisplayName("Record 1652: City is Kulpsville")
	void CityOfRecord1652() {
		assertEquals("Kulpsville", customers.get(1651).getCity());
	}

	@Test
	@DisplayName("Record 1652: County is Montgomery")
	void CountyOfRecord1652() {
		assertEquals("Montgomery", customers.get(1651).getCounty());
	}

	@Test
	@DisplayName("Record 1652: State is PA")
	void StateOfRecord1652() {
		assertEquals("PA", customers.get(1651).getState());
	}

	@Test
	@DisplayName("Record 1652: ZIP is 19443")
	void ZIPOfRecord1652() {
		assertEquals("19443", customers.get(1651).getZIP());
	}

	@Test
	@DisplayName("Record 1652: Phone is 215-368-3455")
	void PhoneOfRecord1652() {
		assertEquals("215-368-3455", customers.get(1651).getPhone());
	}

	@Test
	@DisplayName("Record 1652: Fax is 215-368-6314")
	void FaxOfRecord1652() {
		assertEquals("215-368-6314", customers.get(1651).getFax());
	}

	@Test
	@DisplayName("Record 1652: Email is pearl@nesser.com")
	void EmailOfRecord1652() {
		assertEquals("pearl@nesser.com", customers.get(1651).getEmail());
	}

	@Test
	@DisplayName("Record 1652: Web is http://www.pearlnesser.com")
	void WebOfRecord1652() {
		assertEquals("http://www.pearlnesser.com", customers.get(1651).getWeb());
	}
}
