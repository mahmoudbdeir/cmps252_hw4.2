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

@Tag("18")
class Record_4718 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4718: FirstName is Mona")
	void FirstNameOfRecord4718() {
		assertEquals("Mona", customers.get(4717).getFirstName());
	}

	@Test
	@DisplayName("Record 4718: LastName is Cattabriga")
	void LastNameOfRecord4718() {
		assertEquals("Cattabriga", customers.get(4717).getLastName());
	}

	@Test
	@DisplayName("Record 4718: Company is Mccolloch, Rodney R Esq")
	void CompanyOfRecord4718() {
		assertEquals("Mccolloch, Rodney R Esq", customers.get(4717).getCompany());
	}

	@Test
	@DisplayName("Record 4718: Address is 179 Page Blvd")
	void AddressOfRecord4718() {
		assertEquals("179 Page Blvd", customers.get(4717).getAddress());
	}

	@Test
	@DisplayName("Record 4718: City is Springfield")
	void CityOfRecord4718() {
		assertEquals("Springfield", customers.get(4717).getCity());
	}

	@Test
	@DisplayName("Record 4718: County is Hampden")
	void CountyOfRecord4718() {
		assertEquals("Hampden", customers.get(4717).getCounty());
	}

	@Test
	@DisplayName("Record 4718: State is MA")
	void StateOfRecord4718() {
		assertEquals("MA", customers.get(4717).getState());
	}

	@Test
	@DisplayName("Record 4718: ZIP is 1104")
	void ZIPOfRecord4718() {
		assertEquals("1104", customers.get(4717).getZIP());
	}

	@Test
	@DisplayName("Record 4718: Phone is 413-726-3369")
	void PhoneOfRecord4718() {
		assertEquals("413-726-3369", customers.get(4717).getPhone());
	}

	@Test
	@DisplayName("Record 4718: Fax is 413-726-1186")
	void FaxOfRecord4718() {
		assertEquals("413-726-1186", customers.get(4717).getFax());
	}

	@Test
	@DisplayName("Record 4718: Email is mona@cattabriga.com")
	void EmailOfRecord4718() {
		assertEquals("mona@cattabriga.com", customers.get(4717).getEmail());
	}

	@Test
	@DisplayName("Record 4718: Web is http://www.monacattabriga.com")
	void WebOfRecord4718() {
		assertEquals("http://www.monacattabriga.com", customers.get(4717).getWeb());
	}
}
