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

@Tag("16")
class Record_1367 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1367: FirstName is Sherri")
	void FirstNameOfRecord1367() {
		assertEquals("Sherri", customers.get(1366).getFirstName());
	}

	@Test
	@DisplayName("Record 1367: LastName is Dembinski")
	void LastNameOfRecord1367() {
		assertEquals("Dembinski", customers.get(1366).getLastName());
	}

	@Test
	@DisplayName("Record 1367: Company is Cislo, David")
	void CompanyOfRecord1367() {
		assertEquals("Cislo, David", customers.get(1366).getCompany());
	}

	@Test
	@DisplayName("Record 1367: Address is 3032 N Oakley Ave")
	void AddressOfRecord1367() {
		assertEquals("3032 N Oakley Ave", customers.get(1366).getAddress());
	}

	@Test
	@DisplayName("Record 1367: City is Chicago")
	void CityOfRecord1367() {
		assertEquals("Chicago", customers.get(1366).getCity());
	}

	@Test
	@DisplayName("Record 1367: County is Cook")
	void CountyOfRecord1367() {
		assertEquals("Cook", customers.get(1366).getCounty());
	}

	@Test
	@DisplayName("Record 1367: State is IL")
	void StateOfRecord1367() {
		assertEquals("IL", customers.get(1366).getState());
	}

	@Test
	@DisplayName("Record 1367: ZIP is 60618")
	void ZIPOfRecord1367() {
		assertEquals("60618", customers.get(1366).getZIP());
	}

	@Test
	@DisplayName("Record 1367: Phone is 773-929-9888")
	void PhoneOfRecord1367() {
		assertEquals("773-929-9888", customers.get(1366).getPhone());
	}

	@Test
	@DisplayName("Record 1367: Fax is 773-929-9844")
	void FaxOfRecord1367() {
		assertEquals("773-929-9844", customers.get(1366).getFax());
	}

	@Test
	@DisplayName("Record 1367: Email is sherri@dembinski.com")
	void EmailOfRecord1367() {
		assertEquals("sherri@dembinski.com", customers.get(1366).getEmail());
	}

	@Test
	@DisplayName("Record 1367: Web is http://www.sherridembinski.com")
	void WebOfRecord1367() {
		assertEquals("http://www.sherridembinski.com", customers.get(1366).getWeb());
	}
}
