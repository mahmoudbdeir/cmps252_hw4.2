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

@Tag("31")
class Record_1378 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1378: FirstName is Jayson")
	void FirstNameOfRecord1378() {
		assertEquals("Jayson", customers.get(1377).getFirstName());
	}

	@Test
	@DisplayName("Record 1378: LastName is Reulet")
	void LastNameOfRecord1378() {
		assertEquals("Reulet", customers.get(1377).getLastName());
	}

	@Test
	@DisplayName("Record 1378: Company is Rych, Sharon L Esq")
	void CompanyOfRecord1378() {
		assertEquals("Rych, Sharon L Esq", customers.get(1377).getCompany());
	}

	@Test
	@DisplayName("Record 1378: Address is 702 Front")
	void AddressOfRecord1378() {
		assertEquals("702 Front", customers.get(1377).getAddress());
	}

	@Test
	@DisplayName("Record 1378: City is Comfort")
	void CityOfRecord1378() {
		assertEquals("Comfort", customers.get(1377).getCity());
	}

	@Test
	@DisplayName("Record 1378: County is Kendall")
	void CountyOfRecord1378() {
		assertEquals("Kendall", customers.get(1377).getCounty());
	}

	@Test
	@DisplayName("Record 1378: State is TX")
	void StateOfRecord1378() {
		assertEquals("TX", customers.get(1377).getState());
	}

	@Test
	@DisplayName("Record 1378: ZIP is 78013")
	void ZIPOfRecord1378() {
		assertEquals("78013", customers.get(1377).getZIP());
	}

	@Test
	@DisplayName("Record 1378: Phone is 830-995-3355")
	void PhoneOfRecord1378() {
		assertEquals("830-995-3355", customers.get(1377).getPhone());
	}

	@Test
	@DisplayName("Record 1378: Fax is 830-995-5345")
	void FaxOfRecord1378() {
		assertEquals("830-995-5345", customers.get(1377).getFax());
	}

	@Test
	@DisplayName("Record 1378: Email is jayson@reulet.com")
	void EmailOfRecord1378() {
		assertEquals("jayson@reulet.com", customers.get(1377).getEmail());
	}

	@Test
	@DisplayName("Record 1378: Web is http://www.jaysonreulet.com")
	void WebOfRecord1378() {
		assertEquals("http://www.jaysonreulet.com", customers.get(1377).getWeb());
	}
}
