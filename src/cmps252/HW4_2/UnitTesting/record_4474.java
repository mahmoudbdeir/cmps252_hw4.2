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
class Record_4474 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4474: FirstName is Brittney")
	void FirstNameOfRecord4474() {
		assertEquals("Brittney", customers.get(4473).getFirstName());
	}

	@Test
	@DisplayName("Record 4474: LastName is Caulley")
	void LastNameOfRecord4474() {
		assertEquals("Caulley", customers.get(4473).getLastName());
	}

	@Test
	@DisplayName("Record 4474: Company is Diguisto, John E Esq")
	void CompanyOfRecord4474() {
		assertEquals("Diguisto, John E Esq", customers.get(4473).getCompany());
	}

	@Test
	@DisplayName("Record 4474: Address is 8900 Bellanca Ave")
	void AddressOfRecord4474() {
		assertEquals("8900 Bellanca Ave", customers.get(4473).getAddress());
	}

	@Test
	@DisplayName("Record 4474: City is Los Angeles")
	void CityOfRecord4474() {
		assertEquals("Los Angeles", customers.get(4473).getCity());
	}

	@Test
	@DisplayName("Record 4474: County is Los Angeles")
	void CountyOfRecord4474() {
		assertEquals("Los Angeles", customers.get(4473).getCounty());
	}

	@Test
	@DisplayName("Record 4474: State is CA")
	void StateOfRecord4474() {
		assertEquals("CA", customers.get(4473).getState());
	}

	@Test
	@DisplayName("Record 4474: ZIP is 90045")
	void ZIPOfRecord4474() {
		assertEquals("90045", customers.get(4473).getZIP());
	}

	@Test
	@DisplayName("Record 4474: Phone is 310-649-8817")
	void PhoneOfRecord4474() {
		assertEquals("310-649-8817", customers.get(4473).getPhone());
	}

	@Test
	@DisplayName("Record 4474: Fax is 310-649-7348")
	void FaxOfRecord4474() {
		assertEquals("310-649-7348", customers.get(4473).getFax());
	}

	@Test
	@DisplayName("Record 4474: Email is brittney@caulley.com")
	void EmailOfRecord4474() {
		assertEquals("brittney@caulley.com", customers.get(4473).getEmail());
	}

	@Test
	@DisplayName("Record 4474: Web is http://www.brittneycaulley.com")
	void WebOfRecord4474() {
		assertEquals("http://www.brittneycaulley.com", customers.get(4473).getWeb());
	}
}
