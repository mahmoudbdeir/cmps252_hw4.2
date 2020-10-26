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
class Record_1932 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1932: FirstName is Patrick")
	void FirstNameOfRecord1932() {
		assertEquals("Patrick", customers.get(1931).getFirstName());
	}

	@Test
	@DisplayName("Record 1932: LastName is Melanson")
	void LastNameOfRecord1932() {
		assertEquals("Melanson", customers.get(1931).getLastName());
	}

	@Test
	@DisplayName("Record 1932: Company is American Motor Inn")
	void CompanyOfRecord1932() {
		assertEquals("American Motor Inn", customers.get(1931).getCompany());
	}

	@Test
	@DisplayName("Record 1932: Address is 8495 Roslyn St")
	void AddressOfRecord1932() {
		assertEquals("8495 Roslyn St", customers.get(1931).getAddress());
	}

	@Test
	@DisplayName("Record 1932: City is Commerce City")
	void CityOfRecord1932() {
		assertEquals("Commerce City", customers.get(1931).getCity());
	}

	@Test
	@DisplayName("Record 1932: County is Adams")
	void CountyOfRecord1932() {
		assertEquals("Adams", customers.get(1931).getCounty());
	}

	@Test
	@DisplayName("Record 1932: State is CO")
	void StateOfRecord1932() {
		assertEquals("CO", customers.get(1931).getState());
	}

	@Test
	@DisplayName("Record 1932: ZIP is 80022")
	void ZIPOfRecord1932() {
		assertEquals("80022", customers.get(1931).getZIP());
	}

	@Test
	@DisplayName("Record 1932: Phone is 303-288-6441")
	void PhoneOfRecord1932() {
		assertEquals("303-288-6441", customers.get(1931).getPhone());
	}

	@Test
	@DisplayName("Record 1932: Fax is 303-288-0048")
	void FaxOfRecord1932() {
		assertEquals("303-288-0048", customers.get(1931).getFax());
	}

	@Test
	@DisplayName("Record 1932: Email is patrick@melanson.com")
	void EmailOfRecord1932() {
		assertEquals("patrick@melanson.com", customers.get(1931).getEmail());
	}

	@Test
	@DisplayName("Record 1932: Web is http://www.patrickmelanson.com")
	void WebOfRecord1932() {
		assertEquals("http://www.patrickmelanson.com", customers.get(1931).getWeb());
	}
}
