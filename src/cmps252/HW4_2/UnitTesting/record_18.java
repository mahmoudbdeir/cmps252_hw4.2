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
class Record_18 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 18: FirstName is Julia")
	void FirstNameOfRecord18() {
		assertEquals("Julia", customers.get(17).getFirstName());
	}

	@Test
	@DisplayName("Record 18: LastName is Cokins")
	void LastNameOfRecord18() {
		assertEquals("Cokins", customers.get(17).getLastName());
	}

	@Test
	@DisplayName("Record 18: Company is Ati Title Company")
	void CompanyOfRecord18() {
		assertEquals("Ati Title Company", customers.get(17).getCompany());
	}

	@Test
	@DisplayName("Record 18: Address is 3405 Piedmont Rd Ne")
	void AddressOfRecord18() {
		assertEquals("3405 Piedmont Rd Ne", customers.get(17).getAddress());
	}

	@Test
	@DisplayName("Record 18: City is Atlanta")
	void CityOfRecord18() {
		assertEquals("Atlanta", customers.get(17).getCity());
	}

	@Test
	@DisplayName("Record 18: County is Fulton")
	void CountyOfRecord18() {
		assertEquals("Fulton", customers.get(17).getCounty());
	}

	@Test
	@DisplayName("Record 18: State is GA")
	void StateOfRecord18() {
		assertEquals("GA", customers.get(17).getState());
	}

	@Test
	@DisplayName("Record 18: ZIP is 30305")
	void ZIPOfRecord18() {
		assertEquals("30305", customers.get(17).getZIP());
	}

	@Test
	@DisplayName("Record 18: Phone is 404-266-1124")
	void PhoneOfRecord18() {
		assertEquals("404-266-1124", customers.get(17).getPhone());
	}

	@Test
	@DisplayName("Record 18: Fax is 404-266-9416")
	void FaxOfRecord18() {
		assertEquals("404-266-9416", customers.get(17).getFax());
	}

	@Test
	@DisplayName("Record 18: Email is julia@cokins.com")
	void EmailOfRecord18() {
		assertEquals("julia@cokins.com", customers.get(17).getEmail());
	}

	@Test
	@DisplayName("Record 18: Web is http://www.juliacokins.com")
	void WebOfRecord18() {
		assertEquals("http://www.juliacokins.com", customers.get(17).getWeb());
	}
}
