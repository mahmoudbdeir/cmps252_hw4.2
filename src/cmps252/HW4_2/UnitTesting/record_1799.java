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

@Tag("12")
class Record_1799 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1799: FirstName is Berry")
	void FirstNameOfRecord1799() {
		assertEquals("Berry", customers.get(1798).getFirstName());
	}

	@Test
	@DisplayName("Record 1799: LastName is Eroman")
	void LastNameOfRecord1799() {
		assertEquals("Eroman", customers.get(1798).getLastName());
	}

	@Test
	@DisplayName("Record 1799: Company is Slide People")
	void CompanyOfRecord1799() {
		assertEquals("Slide People", customers.get(1798).getCompany());
	}

	@Test
	@DisplayName("Record 1799: Address is 3706 W 38th St")
	void AddressOfRecord1799() {
		assertEquals("3706 W 38th St", customers.get(1798).getAddress());
	}

	@Test
	@DisplayName("Record 1799: City is Chicago")
	void CityOfRecord1799() {
		assertEquals("Chicago", customers.get(1798).getCity());
	}

	@Test
	@DisplayName("Record 1799: County is Cook")
	void CountyOfRecord1799() {
		assertEquals("Cook", customers.get(1798).getCounty());
	}

	@Test
	@DisplayName("Record 1799: State is IL")
	void StateOfRecord1799() {
		assertEquals("IL", customers.get(1798).getState());
	}

	@Test
	@DisplayName("Record 1799: ZIP is 60632")
	void ZIPOfRecord1799() {
		assertEquals("60632", customers.get(1798).getZIP());
	}

	@Test
	@DisplayName("Record 1799: Phone is 773-523-4805")
	void PhoneOfRecord1799() {
		assertEquals("773-523-4805", customers.get(1798).getPhone());
	}

	@Test
	@DisplayName("Record 1799: Fax is 773-523-0027")
	void FaxOfRecord1799() {
		assertEquals("773-523-0027", customers.get(1798).getFax());
	}

	@Test
	@DisplayName("Record 1799: Email is berry@eroman.com")
	void EmailOfRecord1799() {
		assertEquals("berry@eroman.com", customers.get(1798).getEmail());
	}

	@Test
	@DisplayName("Record 1799: Web is http://www.berryeroman.com")
	void WebOfRecord1799() {
		assertEquals("http://www.berryeroman.com", customers.get(1798).getWeb());
	}
}
