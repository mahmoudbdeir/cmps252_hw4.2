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

@Tag("29")
class Record_1815 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1815: FirstName is Wilson")
	void FirstNameOfRecord1815() {
		assertEquals("Wilson", customers.get(1814).getFirstName());
	}

	@Test
	@DisplayName("Record 1815: LastName is Kast")
	void LastNameOfRecord1815() {
		assertEquals("Kast", customers.get(1814).getLastName());
	}

	@Test
	@DisplayName("Record 1815: Company is Hye Quality Bakery")
	void CompanyOfRecord1815() {
		assertEquals("Hye Quality Bakery", customers.get(1814).getCompany());
	}

	@Test
	@DisplayName("Record 1815: Address is 8751 N Himes Ave")
	void AddressOfRecord1815() {
		assertEquals("8751 N Himes Ave", customers.get(1814).getAddress());
	}

	@Test
	@DisplayName("Record 1815: City is Tampa")
	void CityOfRecord1815() {
		assertEquals("Tampa", customers.get(1814).getCity());
	}

	@Test
	@DisplayName("Record 1815: County is Hillsborough")
	void CountyOfRecord1815() {
		assertEquals("Hillsborough", customers.get(1814).getCounty());
	}

	@Test
	@DisplayName("Record 1815: State is FL")
	void StateOfRecord1815() {
		assertEquals("FL", customers.get(1814).getState());
	}

	@Test
	@DisplayName("Record 1815: ZIP is 33614")
	void ZIPOfRecord1815() {
		assertEquals("33614", customers.get(1814).getZIP());
	}

	@Test
	@DisplayName("Record 1815: Phone is 813-931-9397")
	void PhoneOfRecord1815() {
		assertEquals("813-931-9397", customers.get(1814).getPhone());
	}

	@Test
	@DisplayName("Record 1815: Fax is 813-931-3712")
	void FaxOfRecord1815() {
		assertEquals("813-931-3712", customers.get(1814).getFax());
	}

	@Test
	@DisplayName("Record 1815: Email is wilson@kast.com")
	void EmailOfRecord1815() {
		assertEquals("wilson@kast.com", customers.get(1814).getEmail());
	}

	@Test
	@DisplayName("Record 1815: Web is http://www.wilsonkast.com")
	void WebOfRecord1815() {
		assertEquals("http://www.wilsonkast.com", customers.get(1814).getWeb());
	}
}
