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

@Tag("41")
class Record_1893 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1893: FirstName is Edmundo")
	void FirstNameOfRecord1893() {
		assertEquals("Edmundo", customers.get(1892).getFirstName());
	}

	@Test
	@DisplayName("Record 1893: LastName is Stembridge")
	void LastNameOfRecord1893() {
		assertEquals("Stembridge", customers.get(1892).getLastName());
	}

	@Test
	@DisplayName("Record 1893: Company is Davidson Millwork & Cabinets")
	void CompanyOfRecord1893() {
		assertEquals("Davidson Millwork & Cabinets", customers.get(1892).getCompany());
	}

	@Test
	@DisplayName("Record 1893: Address is 4613 Rising Sun Ave")
	void AddressOfRecord1893() {
		assertEquals("4613 Rising Sun Ave", customers.get(1892).getAddress());
	}

	@Test
	@DisplayName("Record 1893: City is Philadelphia")
	void CityOfRecord1893() {
		assertEquals("Philadelphia", customers.get(1892).getCity());
	}

	@Test
	@DisplayName("Record 1893: County is Philadelphia")
	void CountyOfRecord1893() {
		assertEquals("Philadelphia", customers.get(1892).getCounty());
	}

	@Test
	@DisplayName("Record 1893: State is PA")
	void StateOfRecord1893() {
		assertEquals("PA", customers.get(1892).getState());
	}

	@Test
	@DisplayName("Record 1893: ZIP is 19140")
	void ZIPOfRecord1893() {
		assertEquals("19140", customers.get(1892).getZIP());
	}

	@Test
	@DisplayName("Record 1893: Phone is 215-455-8665")
	void PhoneOfRecord1893() {
		assertEquals("215-455-8665", customers.get(1892).getPhone());
	}

	@Test
	@DisplayName("Record 1893: Fax is 215-455-0731")
	void FaxOfRecord1893() {
		assertEquals("215-455-0731", customers.get(1892).getFax());
	}

	@Test
	@DisplayName("Record 1893: Email is edmundo@stembridge.com")
	void EmailOfRecord1893() {
		assertEquals("edmundo@stembridge.com", customers.get(1892).getEmail());
	}

	@Test
	@DisplayName("Record 1893: Web is http://www.edmundostembridge.com")
	void WebOfRecord1893() {
		assertEquals("http://www.edmundostembridge.com", customers.get(1892).getWeb());
	}
}
