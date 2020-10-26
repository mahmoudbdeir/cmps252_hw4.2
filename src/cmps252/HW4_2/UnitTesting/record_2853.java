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

@Tag("1")
class Record_2853 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2853: FirstName is Wilburn")
	void FirstNameOfRecord2853() {
		assertEquals("Wilburn", customers.get(2852).getFirstName());
	}

	@Test
	@DisplayName("Record 2853: LastName is Quirino")
	void LastNameOfRecord2853() {
		assertEquals("Quirino", customers.get(2852).getLastName());
	}

	@Test
	@DisplayName("Record 2853: Company is Smith, Terral R Esq")
	void CompanyOfRecord2853() {
		assertEquals("Smith, Terral R Esq", customers.get(2852).getCompany());
	}

	@Test
	@DisplayName("Record 2853: Address is 1804 Dickinson Ave")
	void AddressOfRecord2853() {
		assertEquals("1804 Dickinson Ave", customers.get(2852).getAddress());
	}

	@Test
	@DisplayName("Record 2853: City is Greenville")
	void CityOfRecord2853() {
		assertEquals("Greenville", customers.get(2852).getCity());
	}

	@Test
	@DisplayName("Record 2853: County is Pitt")
	void CountyOfRecord2853() {
		assertEquals("Pitt", customers.get(2852).getCounty());
	}

	@Test
	@DisplayName("Record 2853: State is NC")
	void StateOfRecord2853() {
		assertEquals("NC", customers.get(2852).getState());
	}

	@Test
	@DisplayName("Record 2853: ZIP is 27834")
	void ZIPOfRecord2853() {
		assertEquals("27834", customers.get(2852).getZIP());
	}

	@Test
	@DisplayName("Record 2853: Phone is 252-757-5675")
	void PhoneOfRecord2853() {
		assertEquals("252-757-5675", customers.get(2852).getPhone());
	}

	@Test
	@DisplayName("Record 2853: Fax is 252-757-5562")
	void FaxOfRecord2853() {
		assertEquals("252-757-5562", customers.get(2852).getFax());
	}

	@Test
	@DisplayName("Record 2853: Email is wilburn@quirino.com")
	void EmailOfRecord2853() {
		assertEquals("wilburn@quirino.com", customers.get(2852).getEmail());
	}

	@Test
	@DisplayName("Record 2853: Web is http://www.wilburnquirino.com")
	void WebOfRecord2853() {
		assertEquals("http://www.wilburnquirino.com", customers.get(2852).getWeb());
	}
}
