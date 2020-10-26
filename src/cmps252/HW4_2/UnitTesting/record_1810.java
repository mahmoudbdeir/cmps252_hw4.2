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
class Record_1810 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1810: FirstName is Scot")
	void FirstNameOfRecord1810() {
		assertEquals("Scot", customers.get(1809).getFirstName());
	}

	@Test
	@DisplayName("Record 1810: LastName is Mccrimon")
	void LastNameOfRecord1810() {
		assertEquals("Mccrimon", customers.get(1809).getLastName());
	}

	@Test
	@DisplayName("Record 1810: Company is Campbell Tob Rehandling Co Inc")
	void CompanyOfRecord1810() {
		assertEquals("Campbell Tob Rehandling Co Inc", customers.get(1809).getCompany());
	}

	@Test
	@DisplayName("Record 1810: Address is 16 E Fayette St")
	void AddressOfRecord1810() {
		assertEquals("16 E Fayette St", customers.get(1809).getAddress());
	}

	@Test
	@DisplayName("Record 1810: City is Baltimore")
	void CityOfRecord1810() {
		assertEquals("Baltimore", customers.get(1809).getCity());
	}

	@Test
	@DisplayName("Record 1810: County is Baltimore City")
	void CountyOfRecord1810() {
		assertEquals("Baltimore City", customers.get(1809).getCounty());
	}

	@Test
	@DisplayName("Record 1810: State is MD")
	void StateOfRecord1810() {
		assertEquals("MD", customers.get(1809).getState());
	}

	@Test
	@DisplayName("Record 1810: ZIP is 21202")
	void ZIPOfRecord1810() {
		assertEquals("21202", customers.get(1809).getZIP());
	}

	@Test
	@DisplayName("Record 1810: Phone is 410-385-5328")
	void PhoneOfRecord1810() {
		assertEquals("410-385-5328", customers.get(1809).getPhone());
	}

	@Test
	@DisplayName("Record 1810: Fax is 410-385-7847")
	void FaxOfRecord1810() {
		assertEquals("410-385-7847", customers.get(1809).getFax());
	}

	@Test
	@DisplayName("Record 1810: Email is scot@mccrimon.com")
	void EmailOfRecord1810() {
		assertEquals("scot@mccrimon.com", customers.get(1809).getEmail());
	}

	@Test
	@DisplayName("Record 1810: Web is http://www.scotmccrimon.com")
	void WebOfRecord1810() {
		assertEquals("http://www.scotmccrimon.com", customers.get(1809).getWeb());
	}
}
