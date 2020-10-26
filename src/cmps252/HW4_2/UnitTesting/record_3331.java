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

@Tag("37")
class Record_3331 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3331: FirstName is Maude")
	void FirstNameOfRecord3331() {
		assertEquals("Maude", customers.get(3330).getFirstName());
	}

	@Test
	@DisplayName("Record 3331: LastName is Balcyro")
	void LastNameOfRecord3331() {
		assertEquals("Balcyro", customers.get(3330).getLastName());
	}

	@Test
	@DisplayName("Record 3331: Company is Berger, Leslie M Esq")
	void CompanyOfRecord3331() {
		assertEquals("Berger, Leslie M Esq", customers.get(3330).getCompany());
	}

	@Test
	@DisplayName("Record 3331: Address is 4933 E Colonial Dr")
	void AddressOfRecord3331() {
		assertEquals("4933 E Colonial Dr", customers.get(3330).getAddress());
	}

	@Test
	@DisplayName("Record 3331: City is Orlando")
	void CityOfRecord3331() {
		assertEquals("Orlando", customers.get(3330).getCity());
	}

	@Test
	@DisplayName("Record 3331: County is Orange")
	void CountyOfRecord3331() {
		assertEquals("Orange", customers.get(3330).getCounty());
	}

	@Test
	@DisplayName("Record 3331: State is FL")
	void StateOfRecord3331() {
		assertEquals("FL", customers.get(3330).getState());
	}

	@Test
	@DisplayName("Record 3331: ZIP is 32803")
	void ZIPOfRecord3331() {
		assertEquals("32803", customers.get(3330).getZIP());
	}

	@Test
	@DisplayName("Record 3331: Phone is 407-898-8458")
	void PhoneOfRecord3331() {
		assertEquals("407-898-8458", customers.get(3330).getPhone());
	}

	@Test
	@DisplayName("Record 3331: Fax is 407-898-6231")
	void FaxOfRecord3331() {
		assertEquals("407-898-6231", customers.get(3330).getFax());
	}

	@Test
	@DisplayName("Record 3331: Email is maude@balcyro.com")
	void EmailOfRecord3331() {
		assertEquals("maude@balcyro.com", customers.get(3330).getEmail());
	}

	@Test
	@DisplayName("Record 3331: Web is http://www.maudebalcyro.com")
	void WebOfRecord3331() {
		assertEquals("http://www.maudebalcyro.com", customers.get(3330).getWeb());
	}
}
