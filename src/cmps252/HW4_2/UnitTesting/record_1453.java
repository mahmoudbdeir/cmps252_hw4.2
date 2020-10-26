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

@Tag("8")
class Record_1453 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1453: FirstName is Mitchel")
	void FirstNameOfRecord1453() {
		assertEquals("Mitchel", customers.get(1452).getFirstName());
	}

	@Test
	@DisplayName("Record 1453: LastName is Morena")
	void LastNameOfRecord1453() {
		assertEquals("Morena", customers.get(1452).getLastName());
	}

	@Test
	@DisplayName("Record 1453: Company is Mail Boxes Etc")
	void CompanyOfRecord1453() {
		assertEquals("Mail Boxes Etc", customers.get(1452).getCompany());
	}

	@Test
	@DisplayName("Record 1453: Address is 1704 Lincoln Blvd")
	void AddressOfRecord1453() {
		assertEquals("1704 Lincoln Blvd", customers.get(1452).getAddress());
	}

	@Test
	@DisplayName("Record 1453: City is Venice")
	void CityOfRecord1453() {
		assertEquals("Venice", customers.get(1452).getCity());
	}

	@Test
	@DisplayName("Record 1453: County is Los Angeles")
	void CountyOfRecord1453() {
		assertEquals("Los Angeles", customers.get(1452).getCounty());
	}

	@Test
	@DisplayName("Record 1453: State is CA")
	void StateOfRecord1453() {
		assertEquals("CA", customers.get(1452).getState());
	}

	@Test
	@DisplayName("Record 1453: ZIP is 90291")
	void ZIPOfRecord1453() {
		assertEquals("90291", customers.get(1452).getZIP());
	}

	@Test
	@DisplayName("Record 1453: Phone is 310-452-8184")
	void PhoneOfRecord1453() {
		assertEquals("310-452-8184", customers.get(1452).getPhone());
	}

	@Test
	@DisplayName("Record 1453: Fax is 310-452-7756")
	void FaxOfRecord1453() {
		assertEquals("310-452-7756", customers.get(1452).getFax());
	}

	@Test
	@DisplayName("Record 1453: Email is mitchel@morena.com")
	void EmailOfRecord1453() {
		assertEquals("mitchel@morena.com", customers.get(1452).getEmail());
	}

	@Test
	@DisplayName("Record 1453: Web is http://www.mitchelmorena.com")
	void WebOfRecord1453() {
		assertEquals("http://www.mitchelmorena.com", customers.get(1452).getWeb());
	}
}
