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

@Tag("21")
class Record_2222 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2222: FirstName is Grover")
	void FirstNameOfRecord2222() {
		assertEquals("Grover", customers.get(2221).getFirstName());
	}

	@Test
	@DisplayName("Record 2222: LastName is Choo")
	void LastNameOfRecord2222() {
		assertEquals("Choo", customers.get(2221).getLastName());
	}

	@Test
	@DisplayName("Record 2222: Company is Richfield Bus Co")
	void CompanyOfRecord2222() {
		assertEquals("Richfield Bus Co", customers.get(2221).getCompany());
	}

	@Test
	@DisplayName("Record 2222: Address is 3451 Collins Ave")
	void AddressOfRecord2222() {
		assertEquals("3451 Collins Ave", customers.get(2221).getAddress());
	}

	@Test
	@DisplayName("Record 2222: City is San Pablo")
	void CityOfRecord2222() {
		assertEquals("San Pablo", customers.get(2221).getCity());
	}

	@Test
	@DisplayName("Record 2222: County is Contra Costa")
	void CountyOfRecord2222() {
		assertEquals("Contra Costa", customers.get(2221).getCounty());
	}

	@Test
	@DisplayName("Record 2222: State is CA")
	void StateOfRecord2222() {
		assertEquals("CA", customers.get(2221).getState());
	}

	@Test
	@DisplayName("Record 2222: ZIP is 94806")
	void ZIPOfRecord2222() {
		assertEquals("94806", customers.get(2221).getZIP());
	}

	@Test
	@DisplayName("Record 2222: Phone is 510-215-2872")
	void PhoneOfRecord2222() {
		assertEquals("510-215-2872", customers.get(2221).getPhone());
	}

	@Test
	@DisplayName("Record 2222: Fax is 510-215-9026")
	void FaxOfRecord2222() {
		assertEquals("510-215-9026", customers.get(2221).getFax());
	}

	@Test
	@DisplayName("Record 2222: Email is grover@choo.com")
	void EmailOfRecord2222() {
		assertEquals("grover@choo.com", customers.get(2221).getEmail());
	}

	@Test
	@DisplayName("Record 2222: Web is http://www.groverchoo.com")
	void WebOfRecord2222() {
		assertEquals("http://www.groverchoo.com", customers.get(2221).getWeb());
	}
}
