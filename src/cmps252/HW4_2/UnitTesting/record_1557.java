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

@Tag("43")
class Record_1557 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1557: FirstName is Tisha")
	void FirstNameOfRecord1557() {
		assertEquals("Tisha", customers.get(1556).getFirstName());
	}

	@Test
	@DisplayName("Record 1557: LastName is Khosravi")
	void LastNameOfRecord1557() {
		assertEquals("Khosravi", customers.get(1556).getLastName());
	}

	@Test
	@DisplayName("Record 1557: Company is Biller Frith Smith & Archibald")
	void CompanyOfRecord1557() {
		assertEquals("Biller Frith Smith & Archibald", customers.get(1556).getCompany());
	}

	@Test
	@DisplayName("Record 1557: Address is 14000 Monte Vista Ave")
	void AddressOfRecord1557() {
		assertEquals("14000 Monte Vista Ave", customers.get(1556).getAddress());
	}

	@Test
	@DisplayName("Record 1557: City is Chino")
	void CityOfRecord1557() {
		assertEquals("Chino", customers.get(1556).getCity());
	}

	@Test
	@DisplayName("Record 1557: County is San Bernardino")
	void CountyOfRecord1557() {
		assertEquals("San Bernardino", customers.get(1556).getCounty());
	}

	@Test
	@DisplayName("Record 1557: State is CA")
	void StateOfRecord1557() {
		assertEquals("CA", customers.get(1556).getState());
	}

	@Test
	@DisplayName("Record 1557: ZIP is 91710")
	void ZIPOfRecord1557() {
		assertEquals("91710", customers.get(1556).getZIP());
	}

	@Test
	@DisplayName("Record 1557: Phone is 909-465-3490")
	void PhoneOfRecord1557() {
		assertEquals("909-465-3490", customers.get(1556).getPhone());
	}

	@Test
	@DisplayName("Record 1557: Fax is 909-465-7184")
	void FaxOfRecord1557() {
		assertEquals("909-465-7184", customers.get(1556).getFax());
	}

	@Test
	@DisplayName("Record 1557: Email is tisha@khosravi.com")
	void EmailOfRecord1557() {
		assertEquals("tisha@khosravi.com", customers.get(1556).getEmail());
	}

	@Test
	@DisplayName("Record 1557: Web is http://www.tishakhosravi.com")
	void WebOfRecord1557() {
		assertEquals("http://www.tishakhosravi.com", customers.get(1556).getWeb());
	}
}
