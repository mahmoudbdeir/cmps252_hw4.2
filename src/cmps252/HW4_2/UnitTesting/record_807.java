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

@Tag("35")
class Record_807 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 807: FirstName is Shaun")
	void FirstNameOfRecord807() {
		assertEquals("Shaun", customers.get(806).getFirstName());
	}

	@Test
	@DisplayName("Record 807: LastName is Knowlton")
	void LastNameOfRecord807() {
		assertEquals("Knowlton", customers.get(806).getLastName());
	}

	@Test
	@DisplayName("Record 807: Company is Murphy, Colleen M Esq")
	void CompanyOfRecord807() {
		assertEquals("Murphy, Colleen M Esq", customers.get(806).getCompany());
	}

	@Test
	@DisplayName("Record 807: Address is 18576 Prospect Rd")
	void AddressOfRecord807() {
		assertEquals("18576 Prospect Rd", customers.get(806).getAddress());
	}

	@Test
	@DisplayName("Record 807: City is Saratoga")
	void CityOfRecord807() {
		assertEquals("Saratoga", customers.get(806).getCity());
	}

	@Test
	@DisplayName("Record 807: County is Santa Clara")
	void CountyOfRecord807() {
		assertEquals("Santa Clara", customers.get(806).getCounty());
	}

	@Test
	@DisplayName("Record 807: State is CA")
	void StateOfRecord807() {
		assertEquals("CA", customers.get(806).getState());
	}

	@Test
	@DisplayName("Record 807: ZIP is 95070")
	void ZIPOfRecord807() {
		assertEquals("95070", customers.get(806).getZIP());
	}

	@Test
	@DisplayName("Record 807: Phone is 408-725-4835")
	void PhoneOfRecord807() {
		assertEquals("408-725-4835", customers.get(806).getPhone());
	}

	@Test
	@DisplayName("Record 807: Fax is 408-725-2968")
	void FaxOfRecord807() {
		assertEquals("408-725-2968", customers.get(806).getFax());
	}

	@Test
	@DisplayName("Record 807: Email is shaun@knowlton.com")
	void EmailOfRecord807() {
		assertEquals("shaun@knowlton.com", customers.get(806).getEmail());
	}

	@Test
	@DisplayName("Record 807: Web is http://www.shaunknowlton.com")
	void WebOfRecord807() {
		assertEquals("http://www.shaunknowlton.com", customers.get(806).getWeb());
	}
}
