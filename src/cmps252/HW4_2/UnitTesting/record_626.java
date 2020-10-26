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

@Tag("32")
class Record_626 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 626: FirstName is Douglas")
	void FirstNameOfRecord626() {
		assertEquals("Douglas", customers.get(625).getFirstName());
	}

	@Test
	@DisplayName("Record 626: LastName is Ritterbush")
	void LastNameOfRecord626() {
		assertEquals("Ritterbush", customers.get(625).getLastName());
	}

	@Test
	@DisplayName("Record 626: Company is Dean L Brant & Associates")
	void CompanyOfRecord626() {
		assertEquals("Dean L Brant & Associates", customers.get(625).getCompany());
	}

	@Test
	@DisplayName("Record 626: Address is Hwy 90w W")
	void AddressOfRecord626() {
		assertEquals("Hwy 90w W", customers.get(625).getAddress());
	}

	@Test
	@DisplayName("Record 626: City is Schulenburg")
	void CityOfRecord626() {
		assertEquals("Schulenburg", customers.get(625).getCity());
	}

	@Test
	@DisplayName("Record 626: County is Fayette")
	void CountyOfRecord626() {
		assertEquals("Fayette", customers.get(625).getCounty());
	}

	@Test
	@DisplayName("Record 626: State is TX")
	void StateOfRecord626() {
		assertEquals("TX", customers.get(625).getState());
	}

	@Test
	@DisplayName("Record 626: ZIP is 78956")
	void ZIPOfRecord626() {
		assertEquals("78956", customers.get(625).getZIP());
	}

	@Test
	@DisplayName("Record 626: Phone is 979-743-1838")
	void PhoneOfRecord626() {
		assertEquals("979-743-1838", customers.get(625).getPhone());
	}

	@Test
	@DisplayName("Record 626: Fax is 979-743-0055")
	void FaxOfRecord626() {
		assertEquals("979-743-0055", customers.get(625).getFax());
	}

	@Test
	@DisplayName("Record 626: Email is douglas@ritterbush.com")
	void EmailOfRecord626() {
		assertEquals("douglas@ritterbush.com", customers.get(625).getEmail());
	}

	@Test
	@DisplayName("Record 626: Web is http://www.douglasritterbush.com")
	void WebOfRecord626() {
		assertEquals("http://www.douglasritterbush.com", customers.get(625).getWeb());
	}
}
