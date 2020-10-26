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
class Record_1676 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1676: FirstName is Hilary")
	void FirstNameOfRecord1676() {
		assertEquals("Hilary", customers.get(1675).getFirstName());
	}

	@Test
	@DisplayName("Record 1676: LastName is Axon")
	void LastNameOfRecord1676() {
		assertEquals("Axon", customers.get(1675).getLastName());
	}

	@Test
	@DisplayName("Record 1676: Company is Johnson, Kurt E Esq")
	void CompanyOfRecord1676() {
		assertEquals("Johnson, Kurt E Esq", customers.get(1675).getCompany());
	}

	@Test
	@DisplayName("Record 1676: Address is 51 Mount Bethel Rd")
	void AddressOfRecord1676() {
		assertEquals("51 Mount Bethel Rd", customers.get(1675).getAddress());
	}

	@Test
	@DisplayName("Record 1676: City is Warren")
	void CityOfRecord1676() {
		assertEquals("Warren", customers.get(1675).getCity());
	}

	@Test
	@DisplayName("Record 1676: County is Somerset")
	void CountyOfRecord1676() {
		assertEquals("Somerset", customers.get(1675).getCounty());
	}

	@Test
	@DisplayName("Record 1676: State is NJ")
	void StateOfRecord1676() {
		assertEquals("NJ", customers.get(1675).getState());
	}

	@Test
	@DisplayName("Record 1676: ZIP is 7059")
	void ZIPOfRecord1676() {
		assertEquals("7059", customers.get(1675).getZIP());
	}

	@Test
	@DisplayName("Record 1676: Phone is 908-754-5040")
	void PhoneOfRecord1676() {
		assertEquals("908-754-5040", customers.get(1675).getPhone());
	}

	@Test
	@DisplayName("Record 1676: Fax is 908-754-3696")
	void FaxOfRecord1676() {
		assertEquals("908-754-3696", customers.get(1675).getFax());
	}

	@Test
	@DisplayName("Record 1676: Email is hilary@axon.com")
	void EmailOfRecord1676() {
		assertEquals("hilary@axon.com", customers.get(1675).getEmail());
	}

	@Test
	@DisplayName("Record 1676: Web is http://www.hilaryaxon.com")
	void WebOfRecord1676() {
		assertEquals("http://www.hilaryaxon.com", customers.get(1675).getWeb());
	}
}
