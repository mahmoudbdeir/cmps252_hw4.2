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

@Tag("9")
class Record_274 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 274: FirstName is Katharine")
	void FirstNameOfRecord274() {
		assertEquals("Katharine", customers.get(273).getFirstName());
	}

	@Test
	@DisplayName("Record 274: LastName is Berberich")
	void LastNameOfRecord274() {
		assertEquals("Berberich", customers.get(273).getLastName());
	}

	@Test
	@DisplayName("Record 274: Company is Aero Industries")
	void CompanyOfRecord274() {
		assertEquals("Aero Industries", customers.get(273).getCompany());
	}

	@Test
	@DisplayName("Record 274: Address is 4201 Aramingo Ave")
	void AddressOfRecord274() {
		assertEquals("4201 Aramingo Ave", customers.get(273).getAddress());
	}

	@Test
	@DisplayName("Record 274: City is Philadelphia")
	void CityOfRecord274() {
		assertEquals("Philadelphia", customers.get(273).getCity());
	}

	@Test
	@DisplayName("Record 274: County is Philadelphia")
	void CountyOfRecord274() {
		assertEquals("Philadelphia", customers.get(273).getCounty());
	}

	@Test
	@DisplayName("Record 274: State is PA")
	void StateOfRecord274() {
		assertEquals("PA", customers.get(273).getState());
	}

	@Test
	@DisplayName("Record 274: ZIP is 19124")
	void ZIPOfRecord274() {
		assertEquals("19124", customers.get(273).getZIP());
	}

	@Test
	@DisplayName("Record 274: Phone is 215-289-6672")
	void PhoneOfRecord274() {
		assertEquals("215-289-6672", customers.get(273).getPhone());
	}

	@Test
	@DisplayName("Record 274: Fax is 215-289-3379")
	void FaxOfRecord274() {
		assertEquals("215-289-3379", customers.get(273).getFax());
	}

	@Test
	@DisplayName("Record 274: Email is katharine@berberich.com")
	void EmailOfRecord274() {
		assertEquals("katharine@berberich.com", customers.get(273).getEmail());
	}

	@Test
	@DisplayName("Record 274: Web is http://www.katharineberberich.com")
	void WebOfRecord274() {
		assertEquals("http://www.katharineberberich.com", customers.get(273).getWeb());
	}
}
