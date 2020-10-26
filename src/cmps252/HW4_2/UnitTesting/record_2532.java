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
class Record_2532 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2532: FirstName is Samuel")
	void FirstNameOfRecord2532() {
		assertEquals("Samuel", customers.get(2531).getFirstName());
	}

	@Test
	@DisplayName("Record 2532: LastName is Fukumoto")
	void LastNameOfRecord2532() {
		assertEquals("Fukumoto", customers.get(2531).getLastName());
	}

	@Test
	@DisplayName("Record 2532: Company is Graphic Group")
	void CompanyOfRecord2532() {
		assertEquals("Graphic Group", customers.get(2531).getCompany());
	}

	@Test
	@DisplayName("Record 2532: Address is 8818 Garland Rd")
	void AddressOfRecord2532() {
		assertEquals("8818 Garland Rd", customers.get(2531).getAddress());
	}

	@Test
	@DisplayName("Record 2532: City is Dallas")
	void CityOfRecord2532() {
		assertEquals("Dallas", customers.get(2531).getCity());
	}

	@Test
	@DisplayName("Record 2532: County is Dallas")
	void CountyOfRecord2532() {
		assertEquals("Dallas", customers.get(2531).getCounty());
	}

	@Test
	@DisplayName("Record 2532: State is TX")
	void StateOfRecord2532() {
		assertEquals("TX", customers.get(2531).getState());
	}

	@Test
	@DisplayName("Record 2532: ZIP is 75218")
	void ZIPOfRecord2532() {
		assertEquals("75218", customers.get(2531).getZIP());
	}

	@Test
	@DisplayName("Record 2532: Phone is 214-320-6210")
	void PhoneOfRecord2532() {
		assertEquals("214-320-6210", customers.get(2531).getPhone());
	}

	@Test
	@DisplayName("Record 2532: Fax is 214-320-7121")
	void FaxOfRecord2532() {
		assertEquals("214-320-7121", customers.get(2531).getFax());
	}

	@Test
	@DisplayName("Record 2532: Email is samuel@fukumoto.com")
	void EmailOfRecord2532() {
		assertEquals("samuel@fukumoto.com", customers.get(2531).getEmail());
	}

	@Test
	@DisplayName("Record 2532: Web is http://www.samuelfukumoto.com")
	void WebOfRecord2532() {
		assertEquals("http://www.samuelfukumoto.com", customers.get(2531).getWeb());
	}
}
