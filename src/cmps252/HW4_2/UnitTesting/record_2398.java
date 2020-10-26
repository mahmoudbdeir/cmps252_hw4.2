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

@Tag("4")
class Record_2398 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2398: FirstName is Huey")
	void FirstNameOfRecord2398() {
		assertEquals("Huey", customers.get(2397).getFirstName());
	}

	@Test
	@DisplayName("Record 2398: LastName is Conelli")
	void LastNameOfRecord2398() {
		assertEquals("Conelli", customers.get(2397).getLastName());
	}

	@Test
	@DisplayName("Record 2398: Company is Washington Trust Company")
	void CompanyOfRecord2398() {
		assertEquals("Washington Trust Company", customers.get(2397).getCompany());
	}

	@Test
	@DisplayName("Record 2398: Address is 22409 Hawthorne Blvd")
	void AddressOfRecord2398() {
		assertEquals("22409 Hawthorne Blvd", customers.get(2397).getAddress());
	}

	@Test
	@DisplayName("Record 2398: City is Torrance")
	void CityOfRecord2398() {
		assertEquals("Torrance", customers.get(2397).getCity());
	}

	@Test
	@DisplayName("Record 2398: County is Los Angeles")
	void CountyOfRecord2398() {
		assertEquals("Los Angeles", customers.get(2397).getCounty());
	}

	@Test
	@DisplayName("Record 2398: State is CA")
	void StateOfRecord2398() {
		assertEquals("CA", customers.get(2397).getState());
	}

	@Test
	@DisplayName("Record 2398: ZIP is 90505")
	void ZIPOfRecord2398() {
		assertEquals("90505", customers.get(2397).getZIP());
	}

	@Test
	@DisplayName("Record 2398: Phone is 310-791-4618")
	void PhoneOfRecord2398() {
		assertEquals("310-791-4618", customers.get(2397).getPhone());
	}

	@Test
	@DisplayName("Record 2398: Fax is 310-791-1857")
	void FaxOfRecord2398() {
		assertEquals("310-791-1857", customers.get(2397).getFax());
	}

	@Test
	@DisplayName("Record 2398: Email is huey@conelli.com")
	void EmailOfRecord2398() {
		assertEquals("huey@conelli.com", customers.get(2397).getEmail());
	}

	@Test
	@DisplayName("Record 2398: Web is http://www.hueyconelli.com")
	void WebOfRecord2398() {
		assertEquals("http://www.hueyconelli.com", customers.get(2397).getWeb());
	}
}
