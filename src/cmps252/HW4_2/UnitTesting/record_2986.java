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
class Record_2986 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2986: FirstName is Clair")
	void FirstNameOfRecord2986() {
		assertEquals("Clair", customers.get(2985).getFirstName());
	}

	@Test
	@DisplayName("Record 2986: LastName is Bucklew")
	void LastNameOfRecord2986() {
		assertEquals("Bucklew", customers.get(2985).getLastName());
	}

	@Test
	@DisplayName("Record 2986: Company is Alkire, Steven E Esq")
	void CompanyOfRecord2986() {
		assertEquals("Alkire, Steven E Esq", customers.get(2985).getCompany());
	}

	@Test
	@DisplayName("Record 2986: Address is 6920 Bay Pky")
	void AddressOfRecord2986() {
		assertEquals("6920 Bay Pky", customers.get(2985).getAddress());
	}

	@Test
	@DisplayName("Record 2986: City is Brooklyn")
	void CityOfRecord2986() {
		assertEquals("Brooklyn", customers.get(2985).getCity());
	}

	@Test
	@DisplayName("Record 2986: County is Kings")
	void CountyOfRecord2986() {
		assertEquals("Kings", customers.get(2985).getCounty());
	}

	@Test
	@DisplayName("Record 2986: State is NY")
	void StateOfRecord2986() {
		assertEquals("NY", customers.get(2985).getState());
	}

	@Test
	@DisplayName("Record 2986: ZIP is 11204")
	void ZIPOfRecord2986() {
		assertEquals("11204", customers.get(2985).getZIP());
	}

	@Test
	@DisplayName("Record 2986: Phone is 718-234-1974")
	void PhoneOfRecord2986() {
		assertEquals("718-234-1974", customers.get(2985).getPhone());
	}

	@Test
	@DisplayName("Record 2986: Fax is 718-234-3899")
	void FaxOfRecord2986() {
		assertEquals("718-234-3899", customers.get(2985).getFax());
	}

	@Test
	@DisplayName("Record 2986: Email is clair@bucklew.com")
	void EmailOfRecord2986() {
		assertEquals("clair@bucklew.com", customers.get(2985).getEmail());
	}

	@Test
	@DisplayName("Record 2986: Web is http://www.clairbucklew.com")
	void WebOfRecord2986() {
		assertEquals("http://www.clairbucklew.com", customers.get(2985).getWeb());
	}
}
