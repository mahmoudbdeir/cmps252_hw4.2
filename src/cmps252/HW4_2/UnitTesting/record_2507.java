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

@Tag("3")
class Record_2507 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2507: FirstName is Kendrick")
	void FirstNameOfRecord2507() {
		assertEquals("Kendrick", customers.get(2506).getFirstName());
	}

	@Test
	@DisplayName("Record 2507: LastName is Quicho")
	void LastNameOfRecord2507() {
		assertEquals("Quicho", customers.get(2506).getLastName());
	}

	@Test
	@DisplayName("Record 2507: Company is Harve Benard Outlet Store")
	void CompanyOfRecord2507() {
		assertEquals("Harve Benard Outlet Store", customers.get(2506).getCompany());
	}

	@Test
	@DisplayName("Record 2507: Address is 1701 Westwind Dr")
	void AddressOfRecord2507() {
		assertEquals("1701 Westwind Dr", customers.get(2506).getAddress());
	}

	@Test
	@DisplayName("Record 2507: City is Bakersfield")
	void CityOfRecord2507() {
		assertEquals("Bakersfield", customers.get(2506).getCity());
	}

	@Test
	@DisplayName("Record 2507: County is Kern")
	void CountyOfRecord2507() {
		assertEquals("Kern", customers.get(2506).getCounty());
	}

	@Test
	@DisplayName("Record 2507: State is CA")
	void StateOfRecord2507() {
		assertEquals("CA", customers.get(2506).getState());
	}

	@Test
	@DisplayName("Record 2507: ZIP is 93301")
	void ZIPOfRecord2507() {
		assertEquals("93301", customers.get(2506).getZIP());
	}

	@Test
	@DisplayName("Record 2507: Phone is 661-322-9591")
	void PhoneOfRecord2507() {
		assertEquals("661-322-9591", customers.get(2506).getPhone());
	}

	@Test
	@DisplayName("Record 2507: Fax is 661-322-2585")
	void FaxOfRecord2507() {
		assertEquals("661-322-2585", customers.get(2506).getFax());
	}

	@Test
	@DisplayName("Record 2507: Email is kendrick@quicho.com")
	void EmailOfRecord2507() {
		assertEquals("kendrick@quicho.com", customers.get(2506).getEmail());
	}

	@Test
	@DisplayName("Record 2507: Web is http://www.kendrickquicho.com")
	void WebOfRecord2507() {
		assertEquals("http://www.kendrickquicho.com", customers.get(2506).getWeb());
	}
}
