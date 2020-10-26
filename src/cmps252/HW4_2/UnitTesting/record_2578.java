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

@Tag("24")
class Record_2578 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2578: FirstName is Cristina")
	void FirstNameOfRecord2578() {
		assertEquals("Cristina", customers.get(2577).getFirstName());
	}

	@Test
	@DisplayName("Record 2578: LastName is Tolbent")
	void LastNameOfRecord2578() {
		assertEquals("Tolbent", customers.get(2577).getLastName());
	}

	@Test
	@DisplayName("Record 2578: Company is Hatala, Joseph V Esq")
	void CompanyOfRecord2578() {
		assertEquals("Hatala, Joseph V Esq", customers.get(2577).getCompany());
	}

	@Test
	@DisplayName("Record 2578: Address is 1084 Howard St")
	void AddressOfRecord2578() {
		assertEquals("1084 Howard St", customers.get(2577).getAddress());
	}

	@Test
	@DisplayName("Record 2578: City is Spartanburg")
	void CityOfRecord2578() {
		assertEquals("Spartanburg", customers.get(2577).getCity());
	}

	@Test
	@DisplayName("Record 2578: County is Spartanburg")
	void CountyOfRecord2578() {
		assertEquals("Spartanburg", customers.get(2577).getCounty());
	}

	@Test
	@DisplayName("Record 2578: State is SC")
	void StateOfRecord2578() {
		assertEquals("SC", customers.get(2577).getState());
	}

	@Test
	@DisplayName("Record 2578: ZIP is 29303")
	void ZIPOfRecord2578() {
		assertEquals("29303", customers.get(2577).getZIP());
	}

	@Test
	@DisplayName("Record 2578: Phone is 864-542-8977")
	void PhoneOfRecord2578() {
		assertEquals("864-542-8977", customers.get(2577).getPhone());
	}

	@Test
	@DisplayName("Record 2578: Fax is 864-542-4849")
	void FaxOfRecord2578() {
		assertEquals("864-542-4849", customers.get(2577).getFax());
	}

	@Test
	@DisplayName("Record 2578: Email is cristina@tolbent.com")
	void EmailOfRecord2578() {
		assertEquals("cristina@tolbent.com", customers.get(2577).getEmail());
	}

	@Test
	@DisplayName("Record 2578: Web is http://www.cristinatolbent.com")
	void WebOfRecord2578() {
		assertEquals("http://www.cristinatolbent.com", customers.get(2577).getWeb());
	}
}
