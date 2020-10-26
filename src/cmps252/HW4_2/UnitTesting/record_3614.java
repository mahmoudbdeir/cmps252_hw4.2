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

@Tag("2")
class Record_3614 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3614: FirstName is Ashlee")
	void FirstNameOfRecord3614() {
		assertEquals("Ashlee", customers.get(3613).getFirstName());
	}

	@Test
	@DisplayName("Record 3614: LastName is Wynman")
	void LastNameOfRecord3614() {
		assertEquals("Wynman", customers.get(3613).getLastName());
	}

	@Test
	@DisplayName("Record 3614: Company is Recht, Charles H Esq")
	void CompanyOfRecord3614() {
		assertEquals("Recht, Charles H Esq", customers.get(3613).getCompany());
	}

	@Test
	@DisplayName("Record 3614: Address is 3616 N Central Ave")
	void AddressOfRecord3614() {
		assertEquals("3616 N Central Ave", customers.get(3613).getAddress());
	}

	@Test
	@DisplayName("Record 3614: City is Brownsville")
	void CityOfRecord3614() {
		assertEquals("Brownsville", customers.get(3613).getCity());
	}

	@Test
	@DisplayName("Record 3614: County is Cameron")
	void CountyOfRecord3614() {
		assertEquals("Cameron", customers.get(3613).getCounty());
	}

	@Test
	@DisplayName("Record 3614: State is TX")
	void StateOfRecord3614() {
		assertEquals("TX", customers.get(3613).getState());
	}

	@Test
	@DisplayName("Record 3614: ZIP is 78521")
	void ZIPOfRecord3614() {
		assertEquals("78521", customers.get(3613).getZIP());
	}

	@Test
	@DisplayName("Record 3614: Phone is 956-831-5901")
	void PhoneOfRecord3614() {
		assertEquals("956-831-5901", customers.get(3613).getPhone());
	}

	@Test
	@DisplayName("Record 3614: Fax is 956-831-5144")
	void FaxOfRecord3614() {
		assertEquals("956-831-5144", customers.get(3613).getFax());
	}

	@Test
	@DisplayName("Record 3614: Email is ashlee@wynman.com")
	void EmailOfRecord3614() {
		assertEquals("ashlee@wynman.com", customers.get(3613).getEmail());
	}

	@Test
	@DisplayName("Record 3614: Web is http://www.ashleewynman.com")
	void WebOfRecord3614() {
		assertEquals("http://www.ashleewynman.com", customers.get(3613).getWeb());
	}
}
