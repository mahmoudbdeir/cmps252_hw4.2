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

@Tag("21")
class Record_1396 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1396: FirstName is Cary")
	void FirstNameOfRecord1396() {
		assertEquals("Cary", customers.get(1395).getFirstName());
	}

	@Test
	@DisplayName("Record 1396: LastName is Woodman")
	void LastNameOfRecord1396() {
		assertEquals("Woodman", customers.get(1395).getLastName());
	}

	@Test
	@DisplayName("Record 1396: Company is Remex North Office Machines")
	void CompanyOfRecord1396() {
		assertEquals("Remex North Office Machines", customers.get(1395).getCompany());
	}

	@Test
	@DisplayName("Record 1396: Address is 1080 Bible Way")
	void AddressOfRecord1396() {
		assertEquals("1080 Bible Way", customers.get(1395).getAddress());
	}

	@Test
	@DisplayName("Record 1396: City is Reno")
	void CityOfRecord1396() {
		assertEquals("Reno", customers.get(1395).getCity());
	}

	@Test
	@DisplayName("Record 1396: County is Washoe")
	void CountyOfRecord1396() {
		assertEquals("Washoe", customers.get(1395).getCounty());
	}

	@Test
	@DisplayName("Record 1396: State is NV")
	void StateOfRecord1396() {
		assertEquals("NV", customers.get(1395).getState());
	}

	@Test
	@DisplayName("Record 1396: ZIP is 89502")
	void ZIPOfRecord1396() {
		assertEquals("89502", customers.get(1395).getZIP());
	}

	@Test
	@DisplayName("Record 1396: Phone is 775-786-1687")
	void PhoneOfRecord1396() {
		assertEquals("775-786-1687", customers.get(1395).getPhone());
	}

	@Test
	@DisplayName("Record 1396: Fax is 775-786-9164")
	void FaxOfRecord1396() {
		assertEquals("775-786-9164", customers.get(1395).getFax());
	}

	@Test
	@DisplayName("Record 1396: Email is cary@woodman.com")
	void EmailOfRecord1396() {
		assertEquals("cary@woodman.com", customers.get(1395).getEmail());
	}

	@Test
	@DisplayName("Record 1396: Web is http://www.carywoodman.com")
	void WebOfRecord1396() {
		assertEquals("http://www.carywoodman.com", customers.get(1395).getWeb());
	}
}
