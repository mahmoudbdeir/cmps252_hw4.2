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

@Tag("25")
class Record_2710 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2710: FirstName is Stevie")
	void FirstNameOfRecord2710() {
		assertEquals("Stevie", customers.get(2709).getFirstName());
	}

	@Test
	@DisplayName("Record 2710: LastName is Bertao")
	void LastNameOfRecord2710() {
		assertEquals("Bertao", customers.get(2709).getLastName());
	}

	@Test
	@DisplayName("Record 2710: Company is Language School")
	void CompanyOfRecord2710() {
		assertEquals("Language School", customers.get(2709).getCompany());
	}

	@Test
	@DisplayName("Record 2710: Address is 1425 W 12th Pl")
	void AddressOfRecord2710() {
		assertEquals("1425 W 12th Pl", customers.get(2709).getAddress());
	}

	@Test
	@DisplayName("Record 2710: City is Tempe")
	void CityOfRecord2710() {
		assertEquals("Tempe", customers.get(2709).getCity());
	}

	@Test
	@DisplayName("Record 2710: County is Maricopa")
	void CountyOfRecord2710() {
		assertEquals("Maricopa", customers.get(2709).getCounty());
	}

	@Test
	@DisplayName("Record 2710: State is AZ")
	void StateOfRecord2710() {
		assertEquals("AZ", customers.get(2709).getState());
	}

	@Test
	@DisplayName("Record 2710: ZIP is 85281")
	void ZIPOfRecord2710() {
		assertEquals("85281", customers.get(2709).getZIP());
	}

	@Test
	@DisplayName("Record 2710: Phone is 480-966-6734")
	void PhoneOfRecord2710() {
		assertEquals("480-966-6734", customers.get(2709).getPhone());
	}

	@Test
	@DisplayName("Record 2710: Fax is 480-966-4971")
	void FaxOfRecord2710() {
		assertEquals("480-966-4971", customers.get(2709).getFax());
	}

	@Test
	@DisplayName("Record 2710: Email is stevie@bertao.com")
	void EmailOfRecord2710() {
		assertEquals("stevie@bertao.com", customers.get(2709).getEmail());
	}

	@Test
	@DisplayName("Record 2710: Web is http://www.steviebertao.com")
	void WebOfRecord2710() {
		assertEquals("http://www.steviebertao.com", customers.get(2709).getWeb());
	}
}
