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

@Tag("3")
class Record_650 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 650: FirstName is Gale")
	void FirstNameOfRecord650() {
		assertEquals("Gale", customers.get(649).getFirstName());
	}

	@Test
	@DisplayName("Record 650: LastName is Stinett")
	void LastNameOfRecord650() {
		assertEquals("Stinett", customers.get(649).getLastName());
	}

	@Test
	@DisplayName("Record 650: Company is Polk, Edward S Esq")
	void CompanyOfRecord650() {
		assertEquals("Polk, Edward S Esq", customers.get(649).getCompany());
	}

	@Test
	@DisplayName("Record 650: Address is 2170 Acoma St")
	void AddressOfRecord650() {
		assertEquals("2170 Acoma St", customers.get(649).getAddress());
	}

	@Test
	@DisplayName("Record 650: City is Sacramento")
	void CityOfRecord650() {
		assertEquals("Sacramento", customers.get(649).getCity());
	}

	@Test
	@DisplayName("Record 650: County is Sacramento")
	void CountyOfRecord650() {
		assertEquals("Sacramento", customers.get(649).getCounty());
	}

	@Test
	@DisplayName("Record 650: State is CA")
	void StateOfRecord650() {
		assertEquals("CA", customers.get(649).getState());
	}

	@Test
	@DisplayName("Record 650: ZIP is 95815")
	void ZIPOfRecord650() {
		assertEquals("95815", customers.get(649).getZIP());
	}

	@Test
	@DisplayName("Record 650: Phone is 916-371-4662")
	void PhoneOfRecord650() {
		assertEquals("916-371-4662", customers.get(649).getPhone());
	}

	@Test
	@DisplayName("Record 650: Fax is 916-371-2335")
	void FaxOfRecord650() {
		assertEquals("916-371-2335", customers.get(649).getFax());
	}

	@Test
	@DisplayName("Record 650: Email is gale@stinett.com")
	void EmailOfRecord650() {
		assertEquals("gale@stinett.com", customers.get(649).getEmail());
	}

	@Test
	@DisplayName("Record 650: Web is http://www.galestinett.com")
	void WebOfRecord650() {
		assertEquals("http://www.galestinett.com", customers.get(649).getWeb());
	}
}
