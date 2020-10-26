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

@Tag("37")
class Record_1529 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1529: FirstName is Gabriela")
	void FirstNameOfRecord1529() {
		assertEquals("Gabriela", customers.get(1528).getFirstName());
	}

	@Test
	@DisplayName("Record 1529: LastName is Lumbreras")
	void LastNameOfRecord1529() {
		assertEquals("Lumbreras", customers.get(1528).getLastName());
	}

	@Test
	@DisplayName("Record 1529: Company is National Corset Supply Hse Inc")
	void CompanyOfRecord1529() {
		assertEquals("National Corset Supply Hse Inc", customers.get(1528).getCompany());
	}

	@Test
	@DisplayName("Record 1529: Address is 202 N Lacy Dr")
	void AddressOfRecord1529() {
		assertEquals("202 N Lacy Dr", customers.get(1528).getAddress());
	}

	@Test
	@DisplayName("Record 1529: City is Waco")
	void CityOfRecord1529() {
		assertEquals("Waco", customers.get(1528).getCity());
	}

	@Test
	@DisplayName("Record 1529: County is McLennan")
	void CountyOfRecord1529() {
		assertEquals("McLennan", customers.get(1528).getCounty());
	}

	@Test
	@DisplayName("Record 1529: State is TX")
	void StateOfRecord1529() {
		assertEquals("TX", customers.get(1528).getState());
	}

	@Test
	@DisplayName("Record 1529: ZIP is 76705")
	void ZIPOfRecord1529() {
		assertEquals("76705", customers.get(1528).getZIP());
	}

	@Test
	@DisplayName("Record 1529: Phone is 254-867-2124")
	void PhoneOfRecord1529() {
		assertEquals("254-867-2124", customers.get(1528).getPhone());
	}

	@Test
	@DisplayName("Record 1529: Fax is 254-867-9055")
	void FaxOfRecord1529() {
		assertEquals("254-867-9055", customers.get(1528).getFax());
	}

	@Test
	@DisplayName("Record 1529: Email is gabriela@lumbreras.com")
	void EmailOfRecord1529() {
		assertEquals("gabriela@lumbreras.com", customers.get(1528).getEmail());
	}

	@Test
	@DisplayName("Record 1529: Web is http://www.gabrielalumbreras.com")
	void WebOfRecord1529() {
		assertEquals("http://www.gabrielalumbreras.com", customers.get(1528).getWeb());
	}
}
