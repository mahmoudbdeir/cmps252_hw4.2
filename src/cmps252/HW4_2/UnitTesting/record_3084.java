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

@Tag("15")
class Record_3084 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3084: FirstName is Ira")
	void FirstNameOfRecord3084() {
		assertEquals("Ira", customers.get(3083).getFirstName());
	}

	@Test
	@DisplayName("Record 3084: LastName is Clinkscales")
	void LastNameOfRecord3084() {
		assertEquals("Clinkscales", customers.get(3083).getLastName());
	}

	@Test
	@DisplayName("Record 3084: Company is Spanish Tiles Ltd")
	void CompanyOfRecord3084() {
		assertEquals("Spanish Tiles Ltd", customers.get(3083).getCompany());
	}

	@Test
	@DisplayName("Record 3084: Address is 436 Atwells Ave")
	void AddressOfRecord3084() {
		assertEquals("436 Atwells Ave", customers.get(3083).getAddress());
	}

	@Test
	@DisplayName("Record 3084: City is Providence")
	void CityOfRecord3084() {
		assertEquals("Providence", customers.get(3083).getCity());
	}

	@Test
	@DisplayName("Record 3084: County is Providence")
	void CountyOfRecord3084() {
		assertEquals("Providence", customers.get(3083).getCounty());
	}

	@Test
	@DisplayName("Record 3084: State is RI")
	void StateOfRecord3084() {
		assertEquals("RI", customers.get(3083).getState());
	}

	@Test
	@DisplayName("Record 3084: ZIP is 2909")
	void ZIPOfRecord3084() {
		assertEquals("2909", customers.get(3083).getZIP());
	}

	@Test
	@DisplayName("Record 3084: Phone is 401-274-7790")
	void PhoneOfRecord3084() {
		assertEquals("401-274-7790", customers.get(3083).getPhone());
	}

	@Test
	@DisplayName("Record 3084: Fax is 401-274-3427")
	void FaxOfRecord3084() {
		assertEquals("401-274-3427", customers.get(3083).getFax());
	}

	@Test
	@DisplayName("Record 3084: Email is ira@clinkscales.com")
	void EmailOfRecord3084() {
		assertEquals("ira@clinkscales.com", customers.get(3083).getEmail());
	}

	@Test
	@DisplayName("Record 3084: Web is http://www.iraclinkscales.com")
	void WebOfRecord3084() {
		assertEquals("http://www.iraclinkscales.com", customers.get(3083).getWeb());
	}
}
