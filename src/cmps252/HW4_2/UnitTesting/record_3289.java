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

@Tag("35")
class Record_3289 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3289: FirstName is Ezra")
	void FirstNameOfRecord3289() {
		assertEquals("Ezra", customers.get(3288).getFirstName());
	}

	@Test
	@DisplayName("Record 3289: LastName is Qualhym")
	void LastNameOfRecord3289() {
		assertEquals("Qualhym", customers.get(3288).getLastName());
	}

	@Test
	@DisplayName("Record 3289: Company is Comfort Inn")
	void CompanyOfRecord3289() {
		assertEquals("Comfort Inn", customers.get(3288).getCompany());
	}

	@Test
	@DisplayName("Record 3289: Address is 30 Seguine Ave")
	void AddressOfRecord3289() {
		assertEquals("30 Seguine Ave", customers.get(3288).getAddress());
	}

	@Test
	@DisplayName("Record 3289: City is Staten Island")
	void CityOfRecord3289() {
		assertEquals("Staten Island", customers.get(3288).getCity());
	}

	@Test
	@DisplayName("Record 3289: County is Richmond")
	void CountyOfRecord3289() {
		assertEquals("Richmond", customers.get(3288).getCounty());
	}

	@Test
	@DisplayName("Record 3289: State is NY")
	void StateOfRecord3289() {
		assertEquals("NY", customers.get(3288).getState());
	}

	@Test
	@DisplayName("Record 3289: ZIP is 10309")
	void ZIPOfRecord3289() {
		assertEquals("10309", customers.get(3288).getZIP());
	}

	@Test
	@DisplayName("Record 3289: Phone is 718-967-5039")
	void PhoneOfRecord3289() {
		assertEquals("718-967-5039", customers.get(3288).getPhone());
	}

	@Test
	@DisplayName("Record 3289: Fax is 718-967-3536")
	void FaxOfRecord3289() {
		assertEquals("718-967-3536", customers.get(3288).getFax());
	}

	@Test
	@DisplayName("Record 3289: Email is ezra@qualhym.com")
	void EmailOfRecord3289() {
		assertEquals("ezra@qualhym.com", customers.get(3288).getEmail());
	}

	@Test
	@DisplayName("Record 3289: Web is http://www.ezraqualhym.com")
	void WebOfRecord3289() {
		assertEquals("http://www.ezraqualhym.com", customers.get(3288).getWeb());
	}
}
