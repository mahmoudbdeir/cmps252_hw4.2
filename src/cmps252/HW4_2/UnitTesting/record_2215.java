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
class Record_2215 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2215: FirstName is Aileen")
	void FirstNameOfRecord2215() {
		assertEquals("Aileen", customers.get(2214).getFirstName());
	}

	@Test
	@DisplayName("Record 2215: LastName is Hibshman")
	void LastNameOfRecord2215() {
		assertEquals("Hibshman", customers.get(2214).getLastName());
	}

	@Test
	@DisplayName("Record 2215: Company is Ohio Chamber Of Commerce")
	void CompanyOfRecord2215() {
		assertEquals("Ohio Chamber Of Commerce", customers.get(2214).getCompany());
	}

	@Test
	@DisplayName("Record 2215: Address is 5637 N Pershing Ave  #-b7")
	void AddressOfRecord2215() {
		assertEquals("5637 N Pershing Ave  #-b7", customers.get(2214).getAddress());
	}

	@Test
	@DisplayName("Record 2215: City is Stockton")
	void CityOfRecord2215() {
		assertEquals("Stockton", customers.get(2214).getCity());
	}

	@Test
	@DisplayName("Record 2215: County is San Joaquin")
	void CountyOfRecord2215() {
		assertEquals("San Joaquin", customers.get(2214).getCounty());
	}

	@Test
	@DisplayName("Record 2215: State is CA")
	void StateOfRecord2215() {
		assertEquals("CA", customers.get(2214).getState());
	}

	@Test
	@DisplayName("Record 2215: ZIP is 95207")
	void ZIPOfRecord2215() {
		assertEquals("95207", customers.get(2214).getZIP());
	}

	@Test
	@DisplayName("Record 2215: Phone is 209-474-5679")
	void PhoneOfRecord2215() {
		assertEquals("209-474-5679", customers.get(2214).getPhone());
	}

	@Test
	@DisplayName("Record 2215: Fax is 209-474-4244")
	void FaxOfRecord2215() {
		assertEquals("209-474-4244", customers.get(2214).getFax());
	}

	@Test
	@DisplayName("Record 2215: Email is aileen@hibshman.com")
	void EmailOfRecord2215() {
		assertEquals("aileen@hibshman.com", customers.get(2214).getEmail());
	}

	@Test
	@DisplayName("Record 2215: Web is http://www.aileenhibshman.com")
	void WebOfRecord2215() {
		assertEquals("http://www.aileenhibshman.com", customers.get(2214).getWeb());
	}
}
