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
class Record_1465 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1465: FirstName is Alberta")
	void FirstNameOfRecord1465() {
		assertEquals("Alberta", customers.get(1464).getFirstName());
	}

	@Test
	@DisplayName("Record 1465: LastName is Colbert")
	void LastNameOfRecord1465() {
		assertEquals("Colbert", customers.get(1464).getLastName());
	}

	@Test
	@DisplayName("Record 1465: Company is Belleville & Associates")
	void CompanyOfRecord1465() {
		assertEquals("Belleville & Associates", customers.get(1464).getCompany());
	}

	@Test
	@DisplayName("Record 1465: Address is N Main")
	void AddressOfRecord1465() {
		assertEquals("N Main", customers.get(1464).getAddress());
	}

	@Test
	@DisplayName("Record 1465: City is North Conway")
	void CityOfRecord1465() {
		assertEquals("North Conway", customers.get(1464).getCity());
	}

	@Test
	@DisplayName("Record 1465: County is Carroll")
	void CountyOfRecord1465() {
		assertEquals("Carroll", customers.get(1464).getCounty());
	}

	@Test
	@DisplayName("Record 1465: State is NH")
	void StateOfRecord1465() {
		assertEquals("NH", customers.get(1464).getState());
	}

	@Test
	@DisplayName("Record 1465: ZIP is 3860")
	void ZIPOfRecord1465() {
		assertEquals("3860", customers.get(1464).getZIP());
	}

	@Test
	@DisplayName("Record 1465: Phone is 603-356-8052")
	void PhoneOfRecord1465() {
		assertEquals("603-356-8052", customers.get(1464).getPhone());
	}

	@Test
	@DisplayName("Record 1465: Fax is 603-356-6904")
	void FaxOfRecord1465() {
		assertEquals("603-356-6904", customers.get(1464).getFax());
	}

	@Test
	@DisplayName("Record 1465: Email is alberta@colbert.com")
	void EmailOfRecord1465() {
		assertEquals("alberta@colbert.com", customers.get(1464).getEmail());
	}

	@Test
	@DisplayName("Record 1465: Web is http://www.albertacolbert.com")
	void WebOfRecord1465() {
		assertEquals("http://www.albertacolbert.com", customers.get(1464).getWeb());
	}
}
