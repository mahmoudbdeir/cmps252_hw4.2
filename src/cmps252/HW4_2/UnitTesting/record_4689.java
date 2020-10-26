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

@Tag("4")
class Record_4689 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4689: FirstName is Alma")
	void FirstNameOfRecord4689() {
		assertEquals("Alma", customers.get(4688).getFirstName());
	}

	@Test
	@DisplayName("Record 4689: LastName is Athas")
	void LastNameOfRecord4689() {
		assertEquals("Athas", customers.get(4688).getLastName());
	}

	@Test
	@DisplayName("Record 4689: Company is Kmi Printed Products")
	void CompanyOfRecord4689() {
		assertEquals("Kmi Printed Products", customers.get(4688).getCompany());
	}

	@Test
	@DisplayName("Record 4689: Address is 3010 S Babcock St")
	void AddressOfRecord4689() {
		assertEquals("3010 S Babcock St", customers.get(4688).getAddress());
	}

	@Test
	@DisplayName("Record 4689: City is Melbourne")
	void CityOfRecord4689() {
		assertEquals("Melbourne", customers.get(4688).getCity());
	}

	@Test
	@DisplayName("Record 4689: County is Brevard")
	void CountyOfRecord4689() {
		assertEquals("Brevard", customers.get(4688).getCounty());
	}

	@Test
	@DisplayName("Record 4689: State is FL")
	void StateOfRecord4689() {
		assertEquals("FL", customers.get(4688).getState());
	}

	@Test
	@DisplayName("Record 4689: ZIP is 32901")
	void ZIPOfRecord4689() {
		assertEquals("32901", customers.get(4688).getZIP());
	}

	@Test
	@DisplayName("Record 4689: Phone is 321-952-8511")
	void PhoneOfRecord4689() {
		assertEquals("321-952-8511", customers.get(4688).getPhone());
	}

	@Test
	@DisplayName("Record 4689: Fax is 321-952-6212")
	void FaxOfRecord4689() {
		assertEquals("321-952-6212", customers.get(4688).getFax());
	}

	@Test
	@DisplayName("Record 4689: Email is alma@athas.com")
	void EmailOfRecord4689() {
		assertEquals("alma@athas.com", customers.get(4688).getEmail());
	}

	@Test
	@DisplayName("Record 4689: Web is http://www.almaathas.com")
	void WebOfRecord4689() {
		assertEquals("http://www.almaathas.com", customers.get(4688).getWeb());
	}
}
