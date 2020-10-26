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

@Tag("44")
class Record_2365 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2365: FirstName is Quentin")
	void FirstNameOfRecord2365() {
		assertEquals("Quentin", customers.get(2364).getFirstName());
	}

	@Test
	@DisplayName("Record 2365: LastName is Dychmann")
	void LastNameOfRecord2365() {
		assertEquals("Dychmann", customers.get(2364).getLastName());
	}

	@Test
	@DisplayName("Record 2365: Company is Bright Star")
	void CompanyOfRecord2365() {
		assertEquals("Bright Star", customers.get(2364).getCompany());
	}

	@Test
	@DisplayName("Record 2365: Address is 10001 Foster Ave")
	void AddressOfRecord2365() {
		assertEquals("10001 Foster Ave", customers.get(2364).getAddress());
	}

	@Test
	@DisplayName("Record 2365: City is Brooklyn")
	void CityOfRecord2365() {
		assertEquals("Brooklyn", customers.get(2364).getCity());
	}

	@Test
	@DisplayName("Record 2365: County is Kings")
	void CountyOfRecord2365() {
		assertEquals("Kings", customers.get(2364).getCounty());
	}

	@Test
	@DisplayName("Record 2365: State is NY")
	void StateOfRecord2365() {
		assertEquals("NY", customers.get(2364).getState());
	}

	@Test
	@DisplayName("Record 2365: ZIP is 11236")
	void ZIPOfRecord2365() {
		assertEquals("11236", customers.get(2364).getZIP());
	}

	@Test
	@DisplayName("Record 2365: Phone is 718-272-8722")
	void PhoneOfRecord2365() {
		assertEquals("718-272-8722", customers.get(2364).getPhone());
	}

	@Test
	@DisplayName("Record 2365: Fax is 718-272-4927")
	void FaxOfRecord2365() {
		assertEquals("718-272-4927", customers.get(2364).getFax());
	}

	@Test
	@DisplayName("Record 2365: Email is quentin@dychmann.com")
	void EmailOfRecord2365() {
		assertEquals("quentin@dychmann.com", customers.get(2364).getEmail());
	}

	@Test
	@DisplayName("Record 2365: Web is http://www.quentindychmann.com")
	void WebOfRecord2365() {
		assertEquals("http://www.quentindychmann.com", customers.get(2364).getWeb());
	}
}
