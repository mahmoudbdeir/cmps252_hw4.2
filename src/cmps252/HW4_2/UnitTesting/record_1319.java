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

@Tag("10")
class Record_1319 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1319: FirstName is Virginia")
	void FirstNameOfRecord1319() {
		assertEquals("Virginia", customers.get(1318).getFirstName());
	}

	@Test
	@DisplayName("Record 1319: LastName is Cleare")
	void LastNameOfRecord1319() {
		assertEquals("Cleare", customers.get(1318).getLastName());
	}

	@Test
	@DisplayName("Record 1319: Company is Jones, Thomas V Md")
	void CompanyOfRecord1319() {
		assertEquals("Jones, Thomas V Md", customers.get(1318).getCompany());
	}

	@Test
	@DisplayName("Record 1319: Address is 20100 Saint Clair Ave")
	void AddressOfRecord1319() {
		assertEquals("20100 Saint Clair Ave", customers.get(1318).getAddress());
	}

	@Test
	@DisplayName("Record 1319: City is Euclid")
	void CityOfRecord1319() {
		assertEquals("Euclid", customers.get(1318).getCity());
	}

	@Test
	@DisplayName("Record 1319: County is Cuyahoga")
	void CountyOfRecord1319() {
		assertEquals("Cuyahoga", customers.get(1318).getCounty());
	}

	@Test
	@DisplayName("Record 1319: State is OH")
	void StateOfRecord1319() {
		assertEquals("OH", customers.get(1318).getState());
	}

	@Test
	@DisplayName("Record 1319: ZIP is 44117")
	void ZIPOfRecord1319() {
		assertEquals("44117", customers.get(1318).getZIP());
	}

	@Test
	@DisplayName("Record 1319: Phone is 216-486-7156")
	void PhoneOfRecord1319() {
		assertEquals("216-486-7156", customers.get(1318).getPhone());
	}

	@Test
	@DisplayName("Record 1319: Fax is 216-486-1742")
	void FaxOfRecord1319() {
		assertEquals("216-486-1742", customers.get(1318).getFax());
	}

	@Test
	@DisplayName("Record 1319: Email is virginia@cleare.com")
	void EmailOfRecord1319() {
		assertEquals("virginia@cleare.com", customers.get(1318).getEmail());
	}

	@Test
	@DisplayName("Record 1319: Web is http://www.virginiacleare.com")
	void WebOfRecord1319() {
		assertEquals("http://www.virginiacleare.com", customers.get(1318).getWeb());
	}
}
