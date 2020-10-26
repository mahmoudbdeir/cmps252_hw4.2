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

@Tag("30")
class Record_732 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 732: FirstName is Elias")
	void FirstNameOfRecord732() {
		assertEquals("Elias", customers.get(731).getFirstName());
	}

	@Test
	@DisplayName("Record 732: LastName is Esquirel")
	void LastNameOfRecord732() {
		assertEquals("Esquirel", customers.get(731).getLastName());
	}

	@Test
	@DisplayName("Record 732: Company is A 1 House Of Trophies")
	void CompanyOfRecord732() {
		assertEquals("A 1 House Of Trophies", customers.get(731).getCompany());
	}

	@Test
	@DisplayName("Record 732: Address is 3925 Walnut St")
	void AddressOfRecord732() {
		assertEquals("3925 Walnut St", customers.get(731).getAddress());
	}

	@Test
	@DisplayName("Record 732: City is Philadelphia")
	void CityOfRecord732() {
		assertEquals("Philadelphia", customers.get(731).getCity());
	}

	@Test
	@DisplayName("Record 732: County is Philadelphia")
	void CountyOfRecord732() {
		assertEquals("Philadelphia", customers.get(731).getCounty());
	}

	@Test
	@DisplayName("Record 732: State is PA")
	void StateOfRecord732() {
		assertEquals("PA", customers.get(731).getState());
	}

	@Test
	@DisplayName("Record 732: ZIP is 19104")
	void ZIPOfRecord732() {
		assertEquals("19104", customers.get(731).getZIP());
	}

	@Test
	@DisplayName("Record 732: Phone is 215-387-9149")
	void PhoneOfRecord732() {
		assertEquals("215-387-9149", customers.get(731).getPhone());
	}

	@Test
	@DisplayName("Record 732: Fax is 215-387-5036")
	void FaxOfRecord732() {
		assertEquals("215-387-5036", customers.get(731).getFax());
	}

	@Test
	@DisplayName("Record 732: Email is elias@esquirel.com")
	void EmailOfRecord732() {
		assertEquals("elias@esquirel.com", customers.get(731).getEmail());
	}

	@Test
	@DisplayName("Record 732: Web is http://www.eliasesquirel.com")
	void WebOfRecord732() {
		assertEquals("http://www.eliasesquirel.com", customers.get(731).getWeb());
	}
}
