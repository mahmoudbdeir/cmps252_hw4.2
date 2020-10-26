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

@Tag("0")
class Record_3322 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3322: FirstName is Georgette")
	void FirstNameOfRecord3322() {
		assertEquals("Georgette", customers.get(3321).getFirstName());
	}

	@Test
	@DisplayName("Record 3322: LastName is Nulisch")
	void LastNameOfRecord3322() {
		assertEquals("Nulisch", customers.get(3321).getLastName());
	}

	@Test
	@DisplayName("Record 3322: Company is Opinion Research Corporation")
	void CompanyOfRecord3322() {
		assertEquals("Opinion Research Corporation", customers.get(3321).getCompany());
	}

	@Test
	@DisplayName("Record 3322: Address is 739 Thimble Shoals Blvd")
	void AddressOfRecord3322() {
		assertEquals("739 Thimble Shoals Blvd", customers.get(3321).getAddress());
	}

	@Test
	@DisplayName("Record 3322: City is Newport News")
	void CityOfRecord3322() {
		assertEquals("Newport News", customers.get(3321).getCity());
	}

	@Test
	@DisplayName("Record 3322: County is Newport News City")
	void CountyOfRecord3322() {
		assertEquals("Newport News City", customers.get(3321).getCounty());
	}

	@Test
	@DisplayName("Record 3322: State is VA")
	void StateOfRecord3322() {
		assertEquals("VA", customers.get(3321).getState());
	}

	@Test
	@DisplayName("Record 3322: ZIP is 23606")
	void ZIPOfRecord3322() {
		assertEquals("23606", customers.get(3321).getZIP());
	}

	@Test
	@DisplayName("Record 3322: Phone is 757-873-5951")
	void PhoneOfRecord3322() {
		assertEquals("757-873-5951", customers.get(3321).getPhone());
	}

	@Test
	@DisplayName("Record 3322: Fax is 757-873-9515")
	void FaxOfRecord3322() {
		assertEquals("757-873-9515", customers.get(3321).getFax());
	}

	@Test
	@DisplayName("Record 3322: Email is georgette@nulisch.com")
	void EmailOfRecord3322() {
		assertEquals("georgette@nulisch.com", customers.get(3321).getEmail());
	}

	@Test
	@DisplayName("Record 3322: Web is http://www.georgettenulisch.com")
	void WebOfRecord3322() {
		assertEquals("http://www.georgettenulisch.com", customers.get(3321).getWeb());
	}
}
