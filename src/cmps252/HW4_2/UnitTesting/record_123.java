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

@Tag("16")
class Record_123 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 123: FirstName is Chauncey")
	void FirstNameOfRecord123() {
		assertEquals("Chauncey", customers.get(122).getFirstName());
	}

	@Test
	@DisplayName("Record 123: LastName is Jeffcoat")
	void LastNameOfRecord123() {
		assertEquals("Jeffcoat", customers.get(122).getLastName());
	}

	@Test
	@DisplayName("Record 123: Company is Roth, Daniel S Esq")
	void CompanyOfRecord123() {
		assertEquals("Roth, Daniel S Esq", customers.get(122).getCompany());
	}

	@Test
	@DisplayName("Record 123: Address is 69 Roff St")
	void AddressOfRecord123() {
		assertEquals("69 Roff St", customers.get(122).getAddress());
	}

	@Test
	@DisplayName("Record 123: City is Staten Island")
	void CityOfRecord123() {
		assertEquals("Staten Island", customers.get(122).getCity());
	}

	@Test
	@DisplayName("Record 123: County is Richmond")
	void CountyOfRecord123() {
		assertEquals("Richmond", customers.get(122).getCounty());
	}

	@Test
	@DisplayName("Record 123: State is NY")
	void StateOfRecord123() {
		assertEquals("NY", customers.get(122).getState());
	}

	@Test
	@DisplayName("Record 123: ZIP is 10304")
	void ZIPOfRecord123() {
		assertEquals("10304", customers.get(122).getZIP());
	}

	@Test
	@DisplayName("Record 123: Phone is 718-448-7293")
	void PhoneOfRecord123() {
		assertEquals("718-448-7293", customers.get(122).getPhone());
	}

	@Test
	@DisplayName("Record 123: Fax is 718-448-7036")
	void FaxOfRecord123() {
		assertEquals("718-448-7036", customers.get(122).getFax());
	}

	@Test
	@DisplayName("Record 123: Email is chauncey@jeffcoat.com")
	void EmailOfRecord123() {
		assertEquals("chauncey@jeffcoat.com", customers.get(122).getEmail());
	}

	@Test
	@DisplayName("Record 123: Web is http://www.chaunceyjeffcoat.com")
	void WebOfRecord123() {
		assertEquals("http://www.chaunceyjeffcoat.com", customers.get(122).getWeb());
	}
}
