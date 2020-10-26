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
class Record_1480 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1480: FirstName is Erwin")
	void FirstNameOfRecord1480() {
		assertEquals("Erwin", customers.get(1479).getFirstName());
	}

	@Test
	@DisplayName("Record 1480: LastName is Karry")
	void LastNameOfRecord1480() {
		assertEquals("Karry", customers.get(1479).getLastName());
	}

	@Test
	@DisplayName("Record 1480: Company is A W Stauffer & Sons Inc")
	void CompanyOfRecord1480() {
		assertEquals("A W Stauffer & Sons Inc", customers.get(1479).getCompany());
	}

	@Test
	@DisplayName("Record 1480: Address is 5776 Stoneridge Mall Rd")
	void AddressOfRecord1480() {
		assertEquals("5776 Stoneridge Mall Rd", customers.get(1479).getAddress());
	}

	@Test
	@DisplayName("Record 1480: City is Pleasanton")
	void CityOfRecord1480() {
		assertEquals("Pleasanton", customers.get(1479).getCity());
	}

	@Test
	@DisplayName("Record 1480: County is Alameda")
	void CountyOfRecord1480() {
		assertEquals("Alameda", customers.get(1479).getCounty());
	}

	@Test
	@DisplayName("Record 1480: State is CA")
	void StateOfRecord1480() {
		assertEquals("CA", customers.get(1479).getState());
	}

	@Test
	@DisplayName("Record 1480: ZIP is 94588")
	void ZIPOfRecord1480() {
		assertEquals("94588", customers.get(1479).getZIP());
	}

	@Test
	@DisplayName("Record 1480: Phone is 925-463-4792")
	void PhoneOfRecord1480() {
		assertEquals("925-463-4792", customers.get(1479).getPhone());
	}

	@Test
	@DisplayName("Record 1480: Fax is 925-463-4054")
	void FaxOfRecord1480() {
		assertEquals("925-463-4054", customers.get(1479).getFax());
	}

	@Test
	@DisplayName("Record 1480: Email is erwin@karry.com")
	void EmailOfRecord1480() {
		assertEquals("erwin@karry.com", customers.get(1479).getEmail());
	}

	@Test
	@DisplayName("Record 1480: Web is http://www.erwinkarry.com")
	void WebOfRecord1480() {
		assertEquals("http://www.erwinkarry.com", customers.get(1479).getWeb());
	}
}
