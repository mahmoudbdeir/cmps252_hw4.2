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

@Tag("11")
class Record_4517 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4517: FirstName is Jana")
	void FirstNameOfRecord4517() {
		assertEquals("Jana", customers.get(4516).getFirstName());
	}

	@Test
	@DisplayName("Record 4517: LastName is Lucchetti")
	void LastNameOfRecord4517() {
		assertEquals("Lucchetti", customers.get(4516).getLastName());
	}

	@Test
	@DisplayName("Record 4517: Company is Glenn Miller Birthplace Scty")
	void CompanyOfRecord4517() {
		assertEquals("Glenn Miller Birthplace Scty", customers.get(4516).getCompany());
	}

	@Test
	@DisplayName("Record 4517: Address is 4912 Church Ave")
	void AddressOfRecord4517() {
		assertEquals("4912 Church Ave", customers.get(4516).getAddress());
	}

	@Test
	@DisplayName("Record 4517: City is Brooklyn")
	void CityOfRecord4517() {
		assertEquals("Brooklyn", customers.get(4516).getCity());
	}

	@Test
	@DisplayName("Record 4517: County is Kings")
	void CountyOfRecord4517() {
		assertEquals("Kings", customers.get(4516).getCounty());
	}

	@Test
	@DisplayName("Record 4517: State is NY")
	void StateOfRecord4517() {
		assertEquals("NY", customers.get(4516).getState());
	}

	@Test
	@DisplayName("Record 4517: ZIP is 11203")
	void ZIPOfRecord4517() {
		assertEquals("11203", customers.get(4516).getZIP());
	}

	@Test
	@DisplayName("Record 4517: Phone is 718-282-5842")
	void PhoneOfRecord4517() {
		assertEquals("718-282-5842", customers.get(4516).getPhone());
	}

	@Test
	@DisplayName("Record 4517: Fax is 718-282-7251")
	void FaxOfRecord4517() {
		assertEquals("718-282-7251", customers.get(4516).getFax());
	}

	@Test
	@DisplayName("Record 4517: Email is jana@lucchetti.com")
	void EmailOfRecord4517() {
		assertEquals("jana@lucchetti.com", customers.get(4516).getEmail());
	}

	@Test
	@DisplayName("Record 4517: Web is http://www.janalucchetti.com")
	void WebOfRecord4517() {
		assertEquals("http://www.janalucchetti.com", customers.get(4516).getWeb());
	}
}
