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

@Tag("1")
class Record_1871 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1871: FirstName is Maryellen")
	void FirstNameOfRecord1871() {
		assertEquals("Maryellen", customers.get(1870).getFirstName());
	}

	@Test
	@DisplayName("Record 1871: LastName is Oleksy")
	void LastNameOfRecord1871() {
		assertEquals("Oleksy", customers.get(1870).getLastName());
	}

	@Test
	@DisplayName("Record 1871: Company is Rhode Island Hospital")
	void CompanyOfRecord1871() {
		assertEquals("Rhode Island Hospital", customers.get(1870).getCompany());
	}

	@Test
	@DisplayName("Record 1871: Address is 4312 Evergreen Ln  #-d")
	void AddressOfRecord1871() {
		assertEquals("4312 Evergreen Ln  #-d", customers.get(1870).getAddress());
	}

	@Test
	@DisplayName("Record 1871: City is Annandale")
	void CityOfRecord1871() {
		assertEquals("Annandale", customers.get(1870).getCity());
	}

	@Test
	@DisplayName("Record 1871: County is Fairfax")
	void CountyOfRecord1871() {
		assertEquals("Fairfax", customers.get(1870).getCounty());
	}

	@Test
	@DisplayName("Record 1871: State is VA")
	void StateOfRecord1871() {
		assertEquals("VA", customers.get(1870).getState());
	}

	@Test
	@DisplayName("Record 1871: ZIP is 22003")
	void ZIPOfRecord1871() {
		assertEquals("22003", customers.get(1870).getZIP());
	}

	@Test
	@DisplayName("Record 1871: Phone is 703-750-8653")
	void PhoneOfRecord1871() {
		assertEquals("703-750-8653", customers.get(1870).getPhone());
	}

	@Test
	@DisplayName("Record 1871: Fax is 703-750-4302")
	void FaxOfRecord1871() {
		assertEquals("703-750-4302", customers.get(1870).getFax());
	}

	@Test
	@DisplayName("Record 1871: Email is maryellen@oleksy.com")
	void EmailOfRecord1871() {
		assertEquals("maryellen@oleksy.com", customers.get(1870).getEmail());
	}

	@Test
	@DisplayName("Record 1871: Web is http://www.maryellenoleksy.com")
	void WebOfRecord1871() {
		assertEquals("http://www.maryellenoleksy.com", customers.get(1870).getWeb());
	}
}
