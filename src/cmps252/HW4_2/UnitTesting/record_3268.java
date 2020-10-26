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

@Tag("38")
class Record_3268 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3268: FirstName is Wade")
	void FirstNameOfRecord3268() {
		assertEquals("Wade", customers.get(3267).getFirstName());
	}

	@Test
	@DisplayName("Record 3268: LastName is Ledesma")
	void LastNameOfRecord3268() {
		assertEquals("Ledesma", customers.get(3267).getLastName());
	}

	@Test
	@DisplayName("Record 3268: Company is Krueger, Blake W Esq")
	void CompanyOfRecord3268() {
		assertEquals("Krueger, Blake W Esq", customers.get(3267).getCompany());
	}

	@Test
	@DisplayName("Record 3268: Address is 630 9th Ave")
	void AddressOfRecord3268() {
		assertEquals("630 9th Ave", customers.get(3267).getAddress());
	}

	@Test
	@DisplayName("Record 3268: City is New York")
	void CityOfRecord3268() {
		assertEquals("New York", customers.get(3267).getCity());
	}

	@Test
	@DisplayName("Record 3268: County is New York")
	void CountyOfRecord3268() {
		assertEquals("New York", customers.get(3267).getCounty());
	}

	@Test
	@DisplayName("Record 3268: State is NY")
	void StateOfRecord3268() {
		assertEquals("NY", customers.get(3267).getState());
	}

	@Test
	@DisplayName("Record 3268: ZIP is 10036")
	void ZIPOfRecord3268() {
		assertEquals("10036", customers.get(3267).getZIP());
	}

	@Test
	@DisplayName("Record 3268: Phone is 212-765-1762")
	void PhoneOfRecord3268() {
		assertEquals("212-765-1762", customers.get(3267).getPhone());
	}

	@Test
	@DisplayName("Record 3268: Fax is 212-765-2881")
	void FaxOfRecord3268() {
		assertEquals("212-765-2881", customers.get(3267).getFax());
	}

	@Test
	@DisplayName("Record 3268: Email is wade@ledesma.com")
	void EmailOfRecord3268() {
		assertEquals("wade@ledesma.com", customers.get(3267).getEmail());
	}

	@Test
	@DisplayName("Record 3268: Web is http://www.wadeledesma.com")
	void WebOfRecord3268() {
		assertEquals("http://www.wadeledesma.com", customers.get(3267).getWeb());
	}
}
