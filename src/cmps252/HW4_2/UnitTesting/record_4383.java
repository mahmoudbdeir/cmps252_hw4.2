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

@Tag("32")
class Record_4383 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4383: FirstName is Rosa")
	void FirstNameOfRecord4383() {
		assertEquals("Rosa", customers.get(4382).getFirstName());
	}

	@Test
	@DisplayName("Record 4383: LastName is Dalo")
	void LastNameOfRecord4383() {
		assertEquals("Dalo", customers.get(4382).getLastName());
	}

	@Test
	@DisplayName("Record 4383: Company is Brownstone, James S Esq")
	void CompanyOfRecord4383() {
		assertEquals("Brownstone, James S Esq", customers.get(4382).getCompany());
	}

	@Test
	@DisplayName("Record 4383: Address is 9343 Culver Blvd")
	void AddressOfRecord4383() {
		assertEquals("9343 Culver Blvd", customers.get(4382).getAddress());
	}

	@Test
	@DisplayName("Record 4383: City is Culver City")
	void CityOfRecord4383() {
		assertEquals("Culver City", customers.get(4382).getCity());
	}

	@Test
	@DisplayName("Record 4383: County is Los Angeles")
	void CountyOfRecord4383() {
		assertEquals("Los Angeles", customers.get(4382).getCounty());
	}

	@Test
	@DisplayName("Record 4383: State is CA")
	void StateOfRecord4383() {
		assertEquals("CA", customers.get(4382).getState());
	}

	@Test
	@DisplayName("Record 4383: ZIP is 90232")
	void ZIPOfRecord4383() {
		assertEquals("90232", customers.get(4382).getZIP());
	}

	@Test
	@DisplayName("Record 4383: Phone is 310-837-3864")
	void PhoneOfRecord4383() {
		assertEquals("310-837-3864", customers.get(4382).getPhone());
	}

	@Test
	@DisplayName("Record 4383: Fax is 310-837-5074")
	void FaxOfRecord4383() {
		assertEquals("310-837-5074", customers.get(4382).getFax());
	}

	@Test
	@DisplayName("Record 4383: Email is rosa@dalo.com")
	void EmailOfRecord4383() {
		assertEquals("rosa@dalo.com", customers.get(4382).getEmail());
	}

	@Test
	@DisplayName("Record 4383: Web is http://www.rosadalo.com")
	void WebOfRecord4383() {
		assertEquals("http://www.rosadalo.com", customers.get(4382).getWeb());
	}
}
