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

@Tag("2")
class Record_701 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 701: FirstName is Andreas")
	void FirstNameOfRecord701() {
		assertEquals("Andreas", customers.get(700).getFirstName());
	}

	@Test
	@DisplayName("Record 701: LastName is Herzog")
	void LastNameOfRecord701() {
		assertEquals("Herzog", customers.get(700).getLastName());
	}

	@Test
	@DisplayName("Record 701: Company is Property Trust Advisory Corp")
	void CompanyOfRecord701() {
		assertEquals("Property Trust Advisory Corp", customers.get(700).getCompany());
	}

	@Test
	@DisplayName("Record 701: Address is 1120 Maish Ave")
	void AddressOfRecord701() {
		assertEquals("1120 Maish Ave", customers.get(700).getAddress());
	}

	@Test
	@DisplayName("Record 701: City is Des Moines")
	void CityOfRecord701() {
		assertEquals("Des Moines", customers.get(700).getCity());
	}

	@Test
	@DisplayName("Record 701: County is Polk")
	void CountyOfRecord701() {
		assertEquals("Polk", customers.get(700).getCounty());
	}

	@Test
	@DisplayName("Record 701: State is IA")
	void StateOfRecord701() {
		assertEquals("IA", customers.get(700).getState());
	}

	@Test
	@DisplayName("Record 701: ZIP is 50315")
	void ZIPOfRecord701() {
		assertEquals("50315", customers.get(700).getZIP());
	}

	@Test
	@DisplayName("Record 701: Phone is 515-288-2712")
	void PhoneOfRecord701() {
		assertEquals("515-288-2712", customers.get(700).getPhone());
	}

	@Test
	@DisplayName("Record 701: Fax is 515-288-2297")
	void FaxOfRecord701() {
		assertEquals("515-288-2297", customers.get(700).getFax());
	}

	@Test
	@DisplayName("Record 701: Email is andreas@herzog.com")
	void EmailOfRecord701() {
		assertEquals("andreas@herzog.com", customers.get(700).getEmail());
	}

	@Test
	@DisplayName("Record 701: Web is http://www.andreasherzog.com")
	void WebOfRecord701() {
		assertEquals("http://www.andreasherzog.com", customers.get(700).getWeb());
	}
}
