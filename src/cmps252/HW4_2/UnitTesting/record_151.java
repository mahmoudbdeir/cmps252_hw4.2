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
class Record_151 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 151: FirstName is Alta")
	void FirstNameOfRecord151() {
		assertEquals("Alta", customers.get(150).getFirstName());
	}

	@Test
	@DisplayName("Record 151: LastName is Radden")
	void LastNameOfRecord151() {
		assertEquals("Radden", customers.get(150).getLastName());
	}

	@Test
	@DisplayName("Record 151: Company is Greene & Associates")
	void CompanyOfRecord151() {
		assertEquals("Greene & Associates", customers.get(150).getCompany());
	}

	@Test
	@DisplayName("Record 151: Address is 7521 Old Seward Hwy")
	void AddressOfRecord151() {
		assertEquals("7521 Old Seward Hwy", customers.get(150).getAddress());
	}

	@Test
	@DisplayName("Record 151: City is Anchorage")
	void CityOfRecord151() {
		assertEquals("Anchorage", customers.get(150).getCity());
	}

	@Test
	@DisplayName("Record 151: County is Anchorage")
	void CountyOfRecord151() {
		assertEquals("Anchorage", customers.get(150).getCounty());
	}

	@Test
	@DisplayName("Record 151: State is AK")
	void StateOfRecord151() {
		assertEquals("AK", customers.get(150).getState());
	}

	@Test
	@DisplayName("Record 151: ZIP is 99518")
	void ZIPOfRecord151() {
		assertEquals("99518", customers.get(150).getZIP());
	}

	@Test
	@DisplayName("Record 151: Phone is 907-522-2611")
	void PhoneOfRecord151() {
		assertEquals("907-522-2611", customers.get(150).getPhone());
	}

	@Test
	@DisplayName("Record 151: Fax is 907-522-9564")
	void FaxOfRecord151() {
		assertEquals("907-522-9564", customers.get(150).getFax());
	}

	@Test
	@DisplayName("Record 151: Email is alta@radden.com")
	void EmailOfRecord151() {
		assertEquals("alta@radden.com", customers.get(150).getEmail());
	}

	@Test
	@DisplayName("Record 151: Web is http://www.altaradden.com")
	void WebOfRecord151() {
		assertEquals("http://www.altaradden.com", customers.get(150).getWeb());
	}
}
