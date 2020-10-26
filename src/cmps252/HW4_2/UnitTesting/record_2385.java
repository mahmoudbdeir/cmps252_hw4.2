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

@Tag("28")
class Record_2385 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2385: FirstName is Gordon")
	void FirstNameOfRecord2385() {
		assertEquals("Gordon", customers.get(2384).getFirstName());
	}

	@Test
	@DisplayName("Record 2385: LastName is Plocek")
	void LastNameOfRecord2385() {
		assertEquals("Plocek", customers.get(2384).getLastName());
	}

	@Test
	@DisplayName("Record 2385: Company is Lincoln Brokerage")
	void CompanyOfRecord2385() {
		assertEquals("Lincoln Brokerage", customers.get(2384).getCompany());
	}

	@Test
	@DisplayName("Record 2385: Address is 7110 De Celis Pl")
	void AddressOfRecord2385() {
		assertEquals("7110 De Celis Pl", customers.get(2384).getAddress());
	}

	@Test
	@DisplayName("Record 2385: City is Van Nuys")
	void CityOfRecord2385() {
		assertEquals("Van Nuys", customers.get(2384).getCity());
	}

	@Test
	@DisplayName("Record 2385: County is Los Angeles")
	void CountyOfRecord2385() {
		assertEquals("Los Angeles", customers.get(2384).getCounty());
	}

	@Test
	@DisplayName("Record 2385: State is CA")
	void StateOfRecord2385() {
		assertEquals("CA", customers.get(2384).getState());
	}

	@Test
	@DisplayName("Record 2385: ZIP is 91406")
	void ZIPOfRecord2385() {
		assertEquals("91406", customers.get(2384).getZIP());
	}

	@Test
	@DisplayName("Record 2385: Phone is 818-997-8973")
	void PhoneOfRecord2385() {
		assertEquals("818-997-8973", customers.get(2384).getPhone());
	}

	@Test
	@DisplayName("Record 2385: Fax is 818-997-2826")
	void FaxOfRecord2385() {
		assertEquals("818-997-2826", customers.get(2384).getFax());
	}

	@Test
	@DisplayName("Record 2385: Email is gordon@plocek.com")
	void EmailOfRecord2385() {
		assertEquals("gordon@plocek.com", customers.get(2384).getEmail());
	}

	@Test
	@DisplayName("Record 2385: Web is http://www.gordonplocek.com")
	void WebOfRecord2385() {
		assertEquals("http://www.gordonplocek.com", customers.get(2384).getWeb());
	}
}
