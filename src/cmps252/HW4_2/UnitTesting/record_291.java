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
class Record_291 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 291: FirstName is Bessie")
	void FirstNameOfRecord291() {
		assertEquals("Bessie", customers.get(290).getFirstName());
	}

	@Test
	@DisplayName("Record 291: LastName is Bile")
	void LastNameOfRecord291() {
		assertEquals("Bile", customers.get(290).getLastName());
	}

	@Test
	@DisplayName("Record 291: Company is Bmk Manufacturing")
	void CompanyOfRecord291() {
		assertEquals("Bmk Manufacturing", customers.get(290).getCompany());
	}

	@Test
	@DisplayName("Record 291: Address is 2815 Pomona Blvd")
	void AddressOfRecord291() {
		assertEquals("2815 Pomona Blvd", customers.get(290).getAddress());
	}

	@Test
	@DisplayName("Record 291: City is Pomona")
	void CityOfRecord291() {
		assertEquals("Pomona", customers.get(290).getCity());
	}

	@Test
	@DisplayName("Record 291: County is Los Angeles")
	void CountyOfRecord291() {
		assertEquals("Los Angeles", customers.get(290).getCounty());
	}

	@Test
	@DisplayName("Record 291: State is CA")
	void StateOfRecord291() {
		assertEquals("CA", customers.get(290).getState());
	}

	@Test
	@DisplayName("Record 291: ZIP is 91768")
	void ZIPOfRecord291() {
		assertEquals("91768", customers.get(290).getZIP());
	}

	@Test
	@DisplayName("Record 291: Phone is 909-595-0839")
	void PhoneOfRecord291() {
		assertEquals("909-595-0839", customers.get(290).getPhone());
	}

	@Test
	@DisplayName("Record 291: Fax is 909-595-7426")
	void FaxOfRecord291() {
		assertEquals("909-595-7426", customers.get(290).getFax());
	}

	@Test
	@DisplayName("Record 291: Email is bessie@bile.com")
	void EmailOfRecord291() {
		assertEquals("bessie@bile.com", customers.get(290).getEmail());
	}

	@Test
	@DisplayName("Record 291: Web is http://www.bessiebile.com")
	void WebOfRecord291() {
		assertEquals("http://www.bessiebile.com", customers.get(290).getWeb());
	}
}
