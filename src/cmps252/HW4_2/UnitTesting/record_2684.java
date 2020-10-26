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

@Tag("10")
class Record_2684 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2684: FirstName is Judi")
	void FirstNameOfRecord2684() {
		assertEquals("Judi", customers.get(2683).getFirstName());
	}

	@Test
	@DisplayName("Record 2684: LastName is Blaho")
	void LastNameOfRecord2684() {
		assertEquals("Blaho", customers.get(2683).getLastName());
	}

	@Test
	@DisplayName("Record 2684: Company is O D R Inc")
	void CompanyOfRecord2684() {
		assertEquals("O D R Inc", customers.get(2683).getCompany());
	}

	@Test
	@DisplayName("Record 2684: Address is 43847 Division St")
	void AddressOfRecord2684() {
		assertEquals("43847 Division St", customers.get(2683).getAddress());
	}

	@Test
	@DisplayName("Record 2684: City is Lancaster")
	void CityOfRecord2684() {
		assertEquals("Lancaster", customers.get(2683).getCity());
	}

	@Test
	@DisplayName("Record 2684: County is Los Angeles")
	void CountyOfRecord2684() {
		assertEquals("Los Angeles", customers.get(2683).getCounty());
	}

	@Test
	@DisplayName("Record 2684: State is CA")
	void StateOfRecord2684() {
		assertEquals("CA", customers.get(2683).getState());
	}

	@Test
	@DisplayName("Record 2684: ZIP is 93535")
	void ZIPOfRecord2684() {
		assertEquals("93535", customers.get(2683).getZIP());
	}

	@Test
	@DisplayName("Record 2684: Phone is 661-945-4817")
	void PhoneOfRecord2684() {
		assertEquals("661-945-4817", customers.get(2683).getPhone());
	}

	@Test
	@DisplayName("Record 2684: Fax is 661-945-8856")
	void FaxOfRecord2684() {
		assertEquals("661-945-8856", customers.get(2683).getFax());
	}

	@Test
	@DisplayName("Record 2684: Email is judi@blaho.com")
	void EmailOfRecord2684() {
		assertEquals("judi@blaho.com", customers.get(2683).getEmail());
	}

	@Test
	@DisplayName("Record 2684: Web is http://www.judiblaho.com")
	void WebOfRecord2684() {
		assertEquals("http://www.judiblaho.com", customers.get(2683).getWeb());
	}
}
