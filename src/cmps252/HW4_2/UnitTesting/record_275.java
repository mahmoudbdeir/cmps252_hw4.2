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

@Tag("3")
class Record_275 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 275: FirstName is Julia")
	void FirstNameOfRecord275() {
		assertEquals("Julia", customers.get(274).getFirstName());
	}

	@Test
	@DisplayName("Record 275: LastName is Ozane")
	void LastNameOfRecord275() {
		assertEquals("Ozane", customers.get(274).getLastName());
	}

	@Test
	@DisplayName("Record 275: Company is Oxendine Publishing Inc")
	void CompanyOfRecord275() {
		assertEquals("Oxendine Publishing Inc", customers.get(274).getCompany());
	}

	@Test
	@DisplayName("Record 275: Address is 1612 S Suncoast Blvd")
	void AddressOfRecord275() {
		assertEquals("1612 S Suncoast Blvd", customers.get(274).getAddress());
	}

	@Test
	@DisplayName("Record 275: City is Homosassa")
	void CityOfRecord275() {
		assertEquals("Homosassa", customers.get(274).getCity());
	}

	@Test
	@DisplayName("Record 275: County is Citrus")
	void CountyOfRecord275() {
		assertEquals("Citrus", customers.get(274).getCounty());
	}

	@Test
	@DisplayName("Record 275: State is FL")
	void StateOfRecord275() {
		assertEquals("FL", customers.get(274).getState());
	}

	@Test
	@DisplayName("Record 275: ZIP is 34448")
	void ZIPOfRecord275() {
		assertEquals("34448", customers.get(274).getZIP());
	}

	@Test
	@DisplayName("Record 275: Phone is 352-795-1506")
	void PhoneOfRecord275() {
		assertEquals("352-795-1506", customers.get(274).getPhone());
	}

	@Test
	@DisplayName("Record 275: Fax is 352-795-6442")
	void FaxOfRecord275() {
		assertEquals("352-795-6442", customers.get(274).getFax());
	}

	@Test
	@DisplayName("Record 275: Email is julia@ozane.com")
	void EmailOfRecord275() {
		assertEquals("julia@ozane.com", customers.get(274).getEmail());
	}

	@Test
	@DisplayName("Record 275: Web is http://www.juliaozane.com")
	void WebOfRecord275() {
		assertEquals("http://www.juliaozane.com", customers.get(274).getWeb());
	}
}
