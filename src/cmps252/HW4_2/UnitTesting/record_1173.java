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

@Tag("39")
class Record_1173 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1173: FirstName is Odis")
	void FirstNameOfRecord1173() {
		assertEquals("Odis", customers.get(1172).getFirstName());
	}

	@Test
	@DisplayName("Record 1173: LastName is Babbin")
	void LastNameOfRecord1173() {
		assertEquals("Babbin", customers.get(1172).getLastName());
	}

	@Test
	@DisplayName("Record 1173: Company is Brooklyn Doll Co Inc")
	void CompanyOfRecord1173() {
		assertEquals("Brooklyn Doll Co Inc", customers.get(1172).getCompany());
	}

	@Test
	@DisplayName("Record 1173: Address is 1106 Washington St")
	void AddressOfRecord1173() {
		assertEquals("1106 Washington St", customers.get(1172).getAddress());
	}

	@Test
	@DisplayName("Record 1173: City is Columbia")
	void CityOfRecord1173() {
		assertEquals("Columbia", customers.get(1172).getCity());
	}

	@Test
	@DisplayName("Record 1173: County is Richland")
	void CountyOfRecord1173() {
		assertEquals("Richland", customers.get(1172).getCounty());
	}

	@Test
	@DisplayName("Record 1173: State is SC")
	void StateOfRecord1173() {
		assertEquals("SC", customers.get(1172).getState());
	}

	@Test
	@DisplayName("Record 1173: ZIP is 29201")
	void ZIPOfRecord1173() {
		assertEquals("29201", customers.get(1172).getZIP());
	}

	@Test
	@DisplayName("Record 1173: Phone is 803-779-3971")
	void PhoneOfRecord1173() {
		assertEquals("803-779-3971", customers.get(1172).getPhone());
	}

	@Test
	@DisplayName("Record 1173: Fax is 803-779-7461")
	void FaxOfRecord1173() {
		assertEquals("803-779-7461", customers.get(1172).getFax());
	}

	@Test
	@DisplayName("Record 1173: Email is odis@babbin.com")
	void EmailOfRecord1173() {
		assertEquals("odis@babbin.com", customers.get(1172).getEmail());
	}

	@Test
	@DisplayName("Record 1173: Web is http://www.odisbabbin.com")
	void WebOfRecord1173() {
		assertEquals("http://www.odisbabbin.com", customers.get(1172).getWeb());
	}
}
